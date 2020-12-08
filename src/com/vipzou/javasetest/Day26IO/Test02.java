package com.vipzou.javasetest.Day26IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 * 把对象保存到文件以后, 使用ObjectInputStram流读取对象
 * 动力节点
 * 2020/12/7
 */
public class Test02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/course/03-javase进阶/obj.txt"));

//        Object obj = ois.readObject();  //从文件中读取文件,即实现反序列化
        //readObject()方法返回值类型是Object类型, 当前示例中实际读取的是Person对象, 即obj引用实际引用的是Person对象
//        Person p = (Person) obj;        //对象向下类型转换
//        System.out.println( p );

        List<Person> list = (List<Person>) ois.readObject();

        ois.close();

        System.out.println( list );
    }
}
/*
测试过程 :
    1) 定义Person类,实现了Serializable接口, Person对象可以进行序列化
    2) 定义Test01类,在该类中使用ObjectOutputStream流把Person对象保存到文件中
    3) 定义Test02类, 使用ObjectInputStream流从文件中读取一个Person对象
    4) 修改了Person类结构,增加了一个gender字段
    5) 再执行test02反序列化,从文件中读取Person对象,出现 InvalidClassException 无效类的异常
分析:
    1) 当一个类实现Serializable接口后,系统会自动 的添加一个序列化版本号字段,当前示例Person类中的序列化版本号字段值为:serialVersionUID = -9035194071159119152
    2) 当执行Test01把Person对象保存到文件中时,同时会把Person类中的serialVersionUID = -9035194071159119152序列化版本号字段值也保存到文件中
    3) 执行Test02进行反序列化, 会从文件中读取serialVersionUID 版本号字段值 -9035194071159119152 与 本地Person字节码文件中 serialVersionUID 序列化版本号字段值比较是否一样, 相等反序列化成功
    4) 修改了Person类的结构, 重新编译, 系统在Person类中生成了一个新的序列化版本号字段值, 当前示例的值为 serialVersionUID = -4382532235654071413
    5) 再执行test02反序列化时, 从文件中读取序列化版本号的值-9035194071159119152  和 本地字节码文件中版本号字段值 -4382532235654071413 比较, 不相等, 就抛出无效 类异常

解决思路:
    保证反序列化时字节码文件中 序列化版本号serialVersionUID字段的值 与  本地字节码文件中serialVersionUID字段的值 相等即可
具体方法:
    当一个类实现了Serializable接口后,经常手动的添加一个 序列化版本号serialVersionUID字段
    打开 Idea的Settings设置,选择Editor下面的Inspection选项面板 , 搜索 serialVersionUID
        在搜索结果中选中  Serializable class without  serialVersionUID这一条,  目的是当一个类实现了 Serializable接口后, 没有添加 serialVersionUID版本号时, IDEA会提出一个警告信息.
        去到Person类, 把焦点定位到Person类名, 按Alt + Enter系统会提示生成 serialVersionUID字段
 */