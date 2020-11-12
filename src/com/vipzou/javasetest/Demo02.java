package com.vipzou.javasetest;

class Demo02{
    public static void main(String[] args){
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=5-i;j++) {
                System.out.println(" ");
            }
            for (int k=1;k<=2*i;k++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}