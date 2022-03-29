package com.company;

import SoSanh.CompareCircle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CompareCircle[] c1 = new CompareCircle[3];
        c1[0] = new CompareCircle();
        c1[1] = new CompareCircle(15);
        c1[2] = new CompareCircle(10);
        System.out.println("truoc khi so sanh");
        for (int i = 0; i < c1.length; i++) {
            System.out.println("ban thay" + c1[i]);
        }
//        Arrays.sort(c1);
        System.out.println("sau khi so sanh");
        for (int i = 0; i < c1.length; i++) {
            System.out.println("ban thay" + c1[i]);
        }
    }
}
