package com.vipzou.javasetest.Day17;

public class Arr2 {
    public static void main(String[] args) {
        int [] intArr = getIntArr(10);
        PrintIntArr(intArr);
    }

    private static void PrintIntArr(int[] intArr) {
        for (int x : intArr){
            System.out.print(x+" ");
        }
    }

    private static int[] getIntArr(int capacity) {
        int [] data = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            double random = Math.random();
            int xx = (int) (random *100);
            data [i] = xx;
        }
        return data;
    }
}
