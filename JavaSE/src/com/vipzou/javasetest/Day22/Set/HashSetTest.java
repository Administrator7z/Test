package com.vipzou.javasetest.Day22.Set;

import java.util.HashSet;
/**
 * HashSet集合中存储自定义对象
 *  HashSet集合中元素的存储位置与它的哈希码,hashCode()方法返回值有关, 如果修改了HashSet集合中存储对象的属性值, 再contains()判断是否包含该对象时, 重新根据对象的哈希码计算在集合中的存储位置, 修改对象属性后计算的位置可能与存储时的位置不一样了
 * 动力节点
 * 2020/12/1
 */
public class HashSetTest {
    public static void main(String[] args) {
        //1) 创建HashSet集合存储Student对象, 通过泛型指定Student
        HashSet<Student> hashSet = new HashSet<>();

        //2)添加元素
        Student stu = new Student("lisi", 90);
        hashSet.add(stu);
        hashSet.add(new Student("wangwu", 80));
        hashSet.add(new Student("zhaoliu", 50));
        hashSet.add(new Student("chenqi", 60));
        hashSet.add(new Student("zhuba", 70));
        hashSet.add(new Student("zhangsan", 30));

        //foreach遍历
        for (Student student : hashSet) {
            System.out.println(student);
        }
        //没有重写Student类的equals()/hashCode()时, 各个元素的存储顺序为: wu, qi , si, san , liu , ba
        //重写了equals()/hashCode()后, 各个 元素的存储顺序为: san, qi, wu, si ,liu, ba

        //3)判断包含
        System.out.println( hashSet.contains(stu) );    //true
        stu.score = 9;      //修改stu对象的属性值
        System.out.println("--------修改stu对象的score属性值后--------");
        for (Student student : hashSet) {
            System.out.println( student );
        }
        System.out.println( hashSet.contains(stu) );    //false
        /*
            当向hashSet集合中添加了6个Student对象, stu存储位置在第四个位置上.
            在34行修改了stu对象的score属性值,即集合中stu对象的属性值发生变化 了
            在Student类中重写hashCode()方法时,选择了score属性, 当stu对象的score属性值发生修改后, 计算出来stu对象的哈希码,即hashCode()方法返回值可能会变化
            HashSet集合存储位置与对象的哈希码有关,或者简单的理解为元素在HashSet集合中的存储位置是由哈希码计算出来的, 当向hashSet集合中添加stu对象时,
            stu对象的score属性值还是原来的90,计算出来的位置在第四个位置上, 修改了stu对象的score属性后,stu对象的哈希码变了, stu对象在HashSet集合中的存储位置不会跟着更新,还是原来计算出来 的位置.
            在第39行调用contains(stu)时判断集合中是否包含stu对象, 在执行该方法时,系统会根据stu对象的哈希码计算stu元素在HashSet集合中的存储位置,去这个位置上找stu对象是否存在.现在stu对象的score改为9了,
            stu对象的哈希码变了,计算出来 的位置可能和之前计算出来的位置不一样了
         */

    }
}
