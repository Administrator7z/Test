package com.xxx.demotest;




import com.xxx.demo.proxy4.*;
import org.junit.Test;

public class MyTest04 {
    @Test
    public void test01(){
        //创建谁的对象，测事务
      Buy proxy = new TransLogProxy(new BookServiceImpl(),new TransAop());
      proxy.buy();
    }

    @Test
    public void test02(){
        //测日志
        Buy proxy = new TransLogProxy(new BookServiceImpl(),new LogAop());
        proxy.buy();
    }
    @Test
    public void test03(){
        //测组合
        Buy proxy = new TransLogProxy(new TransLogProxy(new BookServiceImpl(),new TransAop()),new LogAop());
        proxy.buy();
    }
}
