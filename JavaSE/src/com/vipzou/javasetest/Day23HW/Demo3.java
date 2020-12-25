package com.vipzou.javasetest.Day23HW;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo3 {

    Map<String, String> user = new HashMap<>();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        Demo3 user = new Demo3();
        user.init();
        user.portal();

    }

    private void register() {


        System.out.println("======用户注册=======");
        while (true) {
            System.out.println("输入账号");
            String username = sc.next();
            if (user.containsKey(username)) {
                System.out.println("该用户名已存在");

            } else {
                System.out.println("输入密码");
                String password = sc.next();
                user.put(username, password);
                System.out.println("注册成功");
                portal();
            }

        }

    }

    private void init() {
        user.put("lisi", "123456");
        user.put("wangwu", "123456");
        user.put("feifei", "123456");
        user.put("lisi", "666");
    }

    private void portal() {
        System.out.println("-------主界面-------");
        System.out.println("1 注册\t2登录\t3退出");
        int i = sc.nextInt();
        if (i == 1) {
            register();

        }
        if (i == 2) {
            login();
        }
        if (i == 3) {
            System.exit(0);
        }


    }

    private void login() {
        System.out.println("====== 用户登录 ======");
        while (true){

            System.out.println("请输入用户名");
            String username = sc.next();

            System.out.println("请输入密码");
            String password = sc.next();
            if (user.containsKey(username) && password.equals(user.get(username))){

                    System.out.println("成功");
                    portal();

            }else {
                System.out.println("失败");

            }

        }
    }
}
