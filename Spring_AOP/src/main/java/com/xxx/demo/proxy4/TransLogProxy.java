package com.xxx.demo.proxy4;

public class TransLogProxy implements Buy{

    //创建业务对象
    Buy yewu;
    //创建切面对象
    AOP aop;
    //传入业务和切面
    public TransLogProxy(Buy yewu,AOP aop){
        this.yewu = yewu;
        this.aop = aop;
    }
    @Override
    public void buy() {
        try {
            //完成事务或日志处理
            aop.before();
            //完成主业务实现
            yewu.buy();
            //完成事务提交
            aop.after();
        } catch (Exception e) {
            //完成事务回滚
            aop.exception();
        }
        //完成事务回滚
    }
}
