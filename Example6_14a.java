package com.danielsumah;

public class Example6_14a{

    public static void main(String []args){
     //calling the method with two args
     System.out.println(multiplyAll(1,2));

    //calling the method with three args
    System.out.println(multiplyAll(1,2,5));

    //calling the method with five args
    System.out.println(multiplyAll(11,5,6,8,4));
    }

    public static int multiplyAll(int...a){
    //set initial product to one
    int product = 1;

    for (int i = 0; i < a.length; i++)
    product*=a[i];
    return product;
    }
}