package com.vipzou.javasetest.Day29HW;

/**
 * 动力节点
 * 2020/12/12
 */
public class Test02 {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        for (int i = 0; i < 10; i++) {
            new WindowThread("窗口-" + i, ticket).start();
        }
    }
}

class WindowThread extends Thread{
    //出售哪个 车票
    private Ticket ticket;

    //构造方法
    public WindowThread(String name, Ticket ticket) {
        super(name);
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            synchronized (ticket) {
                //判断是否有余票
                if ( !ticket.hasRemaining()){
                    System.out.println("没有余票了");
                    return;
                }
                ticket.print();     //打印
            }
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Ticket{
    private int no;         //座位号
    private static final int MAX = 100;         //最大容量

    //判断是否还有余票
    public boolean hasRemaining(){
        return  no < MAX;
    }

    //打印车票
    public void print(){
        no++;
        System.out.println(Thread.currentThread().getName() + " 出售:Ticekt-" + no);
    }
}
