package com.company.HomeWork.TwoWork;

public class Les_8 {
    public static void main(String[] args) {
//        1) while Вычислить: 1+2+4+8+...+256
        int i = 1;
        int sum = 0;
        while (i <= 256) {
            sum += i;
            System.out.println(sum + " " + i);
            i *= 2;
        }
    }
}
