package com.duanhuiran;

import java.util.Arrays;
import java.util.Date;

//awt = Abstract Window Toolkit，功能：包含用于创建用户界面和绘制图形图像的所有类。
import java.awt.*;

public class Main {

    public static void main(String[] args){
        int myAge = 23;
        myAge = 27;
        float herAge = myAge;
        System.out.println(herAge);

        byte onetwoeight = 10;
        System.out.println(onetwoeight);

        int viewsCount = 123_456_789;
        long viewsCount2 = 3_123_456_789L;
        double price = 10.99;
        float price2 = 1079868768608.997867986909f;
        System.out.println(viewsCount);
        System.out.println(viewsCount2);
        System.out.println(price);
        System.out.println(price2);

        char letter = 'A';
        String letters = "ABC";

        boolean isEligible = false;
        System.out.println(letter);
        System.out.println(letters);
        System.out.println(isEligible);
//Data是class，now是其中一个object，new是每次创造新的object时，必须写的前缀；
//Data()默认计算机内部的当前时间
        Date now = new Date();
        System.out.println(now);
//primitive type（数字和布尔值） x 和 y 被储存在完全不一样的内存位置，更改x的值后，不会影响y(这一点和Python一样）
        byte x = 1;
        byte y = 1;
        x = 2;
        System.out.println(y);
// reference type 引用类型，point2只是对point1的内容拷贝，引用内存地址是同一个，所以更改point1之后point2也会改。
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

//String 类型，也是一个 reference type，reference type 赋值时需要“new String()”,但是有简单的方法写他 = ""
        String message = new String("Hello World");
        String message2 = "   Hello World" + "!!";

        System.out.println(message2);
        System.out.println(message2.endsWith("!!"));
        System.out.println(message2.length());
        System.out.println(message2.indexOf("H"));
//indexOf(),如果没有匹配到，返回-1。
        System.out.println(message2.indexOf("not in message2"));

        System.out.println(message2.replace("!","$"));

//replace(),不会改变original string，在java里，String是immutable，不可改变的。
        message2.replace("!","@");
        System.out.println(message2);

        System.out.println(message2.toUpperCase());
// trim() 修剪文本开头和结尾的空格
        System.out.println(message2.trim());

// Array的创建 用int[] ，int[n]里面的n为数据个数。
// int[]创建的array不能够被直接打印出来，需要用Arrays.toString()把array变成文本模式。
// 没有被赋值的元素，将会默认显示成0
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        System.out.println(Arrays.toString(numbers));
//没有被赋值的String元素，将会被打印成null（零值）
        String[] messages = new String[5];
        messages[0] = "Love";
        System.out.println(Arrays.toString(messages));
//另一种简单的自适应的创建Array的方法。用大括号{}.
//第一次创建Array后，他的length就被fixed固定住了，我们无法删除或者添加新的元素进去。需要使用collection class
        int[] numbers_2 = { 6,4,2,5,3,1 };
        System.out.println(Arrays.toString(numbers_2));
//x.length 的 Python写法是len(x)
        System.out.println(numbers_2.length);
//Arrays.sort(x)可以对array进行排序。并且改变了原始数据。
        Arrays.sort(numbers_2);
        System.out.println(Arrays.toString(numbers_2));

//创造多维数组 multi-dimensional arrays.
//转换成toString()时需要使用deepToString().

        int[][] number_3 = new int[3][3];
        number_3[0][0] = 256;
        System.out.println(Arrays.deepToString(number_3));

        int[][] number_5 = {{1,2,3},{5,6,7}};
        System.out.println(Arrays.deepToString(number_5));
//创建不可改变的constant数据  final, 编码传统：不可改变的变量用全大写。eg.PI
//如果尾缀不加F，java只会把它认作后面一位小数。
        final float PI = 3.14F;
//        PI = 1;
        System.out.println("PI is " + String.valueOf(PI));
    }
}
