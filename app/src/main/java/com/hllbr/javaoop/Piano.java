package com.hllbr.javaoop;

public class Piano implements HouseDecor,Instrument{
    String brand ;
    boolean digital ;

    @Override
    public void infos() {
        //burada bu metod içerisinde ne yapılmasını istiyorsak yazmamız gerekiyor.içeriği doldurmak gerek.Initialize yapılmalı
        System.out.println("override method");

    }
}
