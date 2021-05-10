package com.hllbr.javaoop;

public class Musicians {

    //Encapsulation
    //yapı içersinde bir isim bir enstrumman bir adet yaş olmasını istiyorum
    private String name ;
    private String instrument;

    public String getName() {
        return name;
    }

    public void setName(String name,String password) {
        if(password.matches("hllbr")){
            this.name = name;
        }else{
            System.out.println("you are not authorized for this operation");
        }

    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age ;
    //her oluşturulan musicians objesinin bir yaşı enstrumanı ve adı olacak .Bu yapılarımı bir constructor ile bağlıyorum

    public Musicians(String name, String instrument, int age) {
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }
}
