package com.vipzou.javasetest.Day27HW;


import java.util.*;

public class System0 {
    List<Commodity> commodityList = new ArrayList<>();
    HashMap<String, String> adminMap = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    //初始化
    public void init() {
        commodityList.add(new Commodity(1001, "Mate30", 8900, 50000));
        commodityList.add(new Commodity(1002, "novo", 4500, 15000));
        commodityList.add(new Commodity(1003, "vivo", 8700, 36000));
        commodityList.add(new Commodity(1004, "oppo", 1200, 78000));
        //Admin lisi = new Admin("lisi", "666");
        adminMap.put("lisi", "666");

    }

    //主界面
    public void mainInterface() {
        System.out.println("=============主界面=============");
        System.out.println("1.浏览商品\t2.注册\t3.登录\t4.退出");
        System.out.print("请选择你的操作:");
        int i = sc.nextInt();
        if (i == 1) {
            browse();
        } else if (i == 2) {
            register();
        } else if (i == 3) {
            login();
        } else if (i == 4) {
            System.exit(0);
        } else {
            System.out.print("输入有误，请重新输入:");
            mainInterface();
        }

    }


    //浏览商品
    private void browse() {

        System.out.println("选择排序方式:1.根据名称排序\t2.价格升序\t3.销量降序");
        int i = sc.nextInt();
        System.out.println("------------------商品信息---------------------");
        System.out.println("商品编号     商品名称       商品价格           销量");
        if (i == 1) {
            nameSort();
            print();
            mainInterface();

        } else if (i == 2) {
            priceSort();
            print();
            mainInterface();

        } else if (i == 3) {
            salesVolumeSort();
            print();
            mainInterface();

        }
        print();
        System.out.print("输入任意键返回主页:");
        if (sc.next() != "") {
            mainInterface();
        }


    }

    //销量排序
    private void salesVolumeSort() {
        commodityList.sort(new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o2.getSalesVolume() - o1.getSalesVolume();
            }
        });
    }

    //价格排序
    private void priceSort() {
        commodityList.sort(new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    //名称排序
    private void nameSort() {
        commodityList.sort(new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    //注册
    private void register() {
        System.out.println("---------用户注册---------");
        System.out.print("请输入用户名:");
        String user = sc.next();
        while (adminMap.containsKey(user)) {
            System.out.print("该用户名已存在,请重新输入:");
            user = sc.next();
        }
        System.out.print("请输入密码:");
        String passWord = sc.next();
        adminMap.put(user, passWord);
        System.out.println("注册成功");
        mainInterface();
    }


    //登录
    private void login() {
        System.out.println("-----------用户登录-----------");
        while (true) {
            System.out.print("请输入用户名:");
            String user = sc.next();
            System.out.print("请输入密码:");
            String passWord = sc.next();
            if (adminMap.containsKey(user) && passWord.equals(adminMap.get(user))) {
                System.out.println("登录成功");
                operation();
            } else {
                System.out.println("用户名或密码不正确,是否重新登录(Y/N)?");
                String x = sc.next();
                if (x.equalsIgnoreCase("Y")) {

                } else if (x.equalsIgnoreCase("N")) {
                    mainInterface();
                } else {
                    System.out.println("输入不正确");
                    login();
                }


            }
        }


    }

    //产品管理操作界面
    private void operation() {
        System.out.println("*************************产品管理操作界面*************************");
        System.out.println("                          1.显示所有商品");
        System.out.println("                          2.添加商品");
        System.out.println("                          3.删除商品");
        System.out.println("                          4.修改商品");
        System.out.println("                          5.查找商品");
        System.out.println("                          6.退出");
        System.out.print("请选择你的操作:");
        int i = sc.nextInt();
        if (i == 1) {
            showAll();
        } else if (i == 2) {
            add();
        } else if (i == 3) {
            del();
        } else if (i == 4) {
            set();
        } else if (i == 5) {
            select();
        } else if (i == 6) {
            mainInterface();
        }


    }

    private void showAll() {
        System.out.println("------------------商品信息---------------------");
        System.out.println("商品编号     商品名称       商品价格           销量");
        print();
        System.out.println("选择排序方式:1.根据名称排序\t2.价格升序\t3.销量降序\t4.退出");
        int i = sc.nextInt();
        if (i == 1) {
            System.out.println("------------------商品信息---------------------");
            System.out.println("商品编号     商品名称       商品价格           销量");
            nameSort();
            print();
            operation();

        } else if (i == 2) {
            System.out.println("------------------商品信息---------------------");
            System.out.println("商品编号     商品名称       商品价格           销量");
            priceSort();
            print();
            operation();

        } else if (i == 3) {
            System.out.println("------------------商品信息---------------------");
            System.out.println("商品编号     商品名称       商品价格           销量");
            salesVolumeSort();
            print();
            operation();

        } else if (i == 4) {
            operation();

        } else {
            System.out.println("输入有误");
            showAll();
        }
    }

    private void print() {
        commodityList.sort(new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getId() - o2.getId();
            }
        });
        for (Commodity commodity : commodityList) {
            System.out.println(commodity.getId() + "        " + commodity.getName() + "        " + commodity.getPrice() + "        " + commodity.getSalesVolume());
        }
    }


    // 添加商品
    private void add() {
        while (true) {
            System.out.println("--------添加商品信息--------");
            System.out.print("请输入商品编号:");
            int id = sc.nextInt();
            System.out.print("请输入商品名称:");
            String name = sc.next();
            System.out.print("请输入商品价格:");
            int price = sc.nextInt();
            System.out.print("请输入商品销量:");
            int salesVolume = sc.nextInt();
            for (Commodity commodity : commodityList) {
                if (commodity.getId() == id) {
                    System.out.println("ID重复,添加失败");
                    break;
                }
            }
            commodityList.add(new Commodity(id, name, price, salesVolume));
            System.out.println("是否继续添加(Y/N)?");
            String x = sc.next();
            if (x.equalsIgnoreCase("Y")) {

            } else if (x.equalsIgnoreCase("N")) {
                operation();
            }
        }


    }

    //删除商品
    private void del() {
        System.out.println("--------删除商品信息--------");
        System.out.print("请输入商品编号:");
        int id = sc.nextInt();
        for (int i = 0; i < commodityList.size(); i++) {
            if (id == commodityList.get(i).getId()) {
                commodityList.remove(i);

            }

        }
        operation();

    }
    //修改商品信息

    private void set() {
        System.out.println("--------修改商品信息--------");
        System.out.print("请输入商品编号:");
        int id = sc.nextInt();
        for (Iterator<Commodity> iterator = commodityList.iterator(); iterator.hasNext(); ) {
            Commodity commodity = iterator.next();
            if (id == commodity.getId()) {
                System.out.println("商品编号:" + commodity.getId() + "\t商品名称:" + commodity.getName() + "\t商品价格:" + commodity.getPrice() + "\t销量:" + commodity.getSalesVolume());
                System.out.print("请输入新的商品编号:");
                int newId = sc.nextInt();
                System.out.print("请输入新的商品名称:");
                String newName = sc.next();
                System.out.print("请输入新的商品价格:");
                int newPrice = sc.nextInt();
                System.out.print("请输入新的商品销量:");
                int newSalesVolume = sc.nextInt();
                commodity.setId(newId);
                commodity.setName(newName);
                commodity.setPrice(newPrice);
                commodity.setSalesVolume(newSalesVolume);
                System.out.println("修改成功");
                operation();
            }

        }
    }

    //查找
    private void select() {

        System.out.println("--------查找商品信息--------");
        System.out.print("请输入商品名称:");
        String name = sc.next();
        System.out.println("商品编号     商品名称       商品价格           销量");
        for (Iterator<Commodity> iterator = commodityList.iterator(); iterator.hasNext(); ) {
            Commodity next = iterator.next();
            if (next.getName().contains(name)) {
                System.out.println(next.getId() + "        " + next.getName() + "        " + next.getPrice() + "        " + next.getSalesVolume());
            }
        }
    }
}




