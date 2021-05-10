package com.hllbr.javaoop;

public class Dog extends Animal{
    public void test(){
        super.sign();
    }
    public void sign(){
        System.out.println("Dog Class");
    }
    //2 adet sign var fakat farklı yapıların içindeler çağırırken de çalışırkende farklı sonuçlardalar
}
