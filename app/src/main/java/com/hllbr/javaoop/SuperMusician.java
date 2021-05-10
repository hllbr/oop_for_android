package com.hllbr.javaoop;

public class SuperMusician extends Musicians{   //Inheritance için extens anahtar kelimesini kullanıyoruz.
    public SuperMusician(String name, String instrument, int age) {
        //eğer kalıtım aldığın yapı içerisinde constructor mevcut ise kalıtımı kullanacağın hapı içerisinde de constructor olmalı.
        //constructor yapısı içersindeki super anahtar kelimesi kalıtımın alındığı sınıfa referans veriyor.
        super(name, instrument, age);
    }



    public String sign(){
        return "Nothing Else Matters";
    }
}
