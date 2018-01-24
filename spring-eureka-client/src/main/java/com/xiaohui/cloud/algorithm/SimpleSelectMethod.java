package com.xiaohui.cloud.algorithm;

/**
 * Created by 辉 on 2017/6/3.
 * 简单选择排序
 */
public class SimpleSelectMethod {

    public static int[] simpleSelect(int[] numbers) {
        int length=numbers.length;
        int temp=0;
        for(int i=0;i<length;i++) {
            int k=i;
            for(int j=i;j<length;j++) {
                if(numbers[k]>numbers[j]){
                    k=j;
                }
            }
            temp = numbers[i];
            numbers[i] = numbers[k];
            numbers[k] = temp;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] a = {33,23,2,333,45,1,10 ,2,55, 5, 34};
        int[] b=simpleSelect(a);
        for (int i=0;i<b.length;i++) {
            System.out.print(b[i]+"  ");
        }
    }
}
