package com.vipzou.javasetest.dy01_dy14;

import java.util.Scanner;
class Ope{
    public static void main(String[] args){
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("����");
            int  num = sc.nextInt();
            if(num > 99 && num < 1000) {
                System.out.println("��");
            }
            else {
                System.out.println("����");
            }
        }


    }
}







class Ope2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("����1");
        int  a = sc.nextInt();
        System.out.print("����2");
        int  b = sc.nextInt();
        if((a+b) % 2 == 0) {
            System.out.println("ż");
        }
        else {
            System.out.println("��");
        }


    }
}
class Ope3{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("���䣺");
        int  age = sc.nextInt();
        if(age >= 60) {
            System.out.println("��");
        }
        else if(age >= 30) {
            System.out.println("��");
        }
        else if(age >= 18) {
            System.out.println("��");
        }
        else if(age >= 1) {
            System.out.println("��");
        }
        else {
            System.out.println("����");
        }


    }

}
class Ope4{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("����");
        int  num = sc.nextInt();
        if(num <=99 && num >= 10) {
            if(num % 2 ==0){
                System.out.println("ż");
            }
            else {
                System.out.println("��");
            }
        }
        else {

        }


    }
}
class Ope5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("��");
        char  x = sc.next().charAt(0);
        if(x >= 'A' && x <= 'Z'){
            System.out.println("��");
        }
        else if(x >= 'a' && x <= 'z'){
            System.out.println("С");
        }
        else if(x >= '0' && x <= '9'){
            System.out.println("��");
        }
        else{
            System.out.println("����");
        }
    }
}









		/*int a = 123;
		System.out.println(a > 0 ? 1 : a < 0 ? -1 : 0);
		*/