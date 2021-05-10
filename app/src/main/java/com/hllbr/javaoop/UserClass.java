package com.hllbr.javaoop;

public class UserClass {
    //Property
    String name ;
    String job ;

    //Constructor


    public UserClass(String name, String job) {

        //Constructor nedir ne işe yarar = bir sınıftan bir obje oluşturulduğunda ilk çağrılacak metodur.
        this.name = name;
        this.job = job;
        //THİS = içinde bulunduğumuz aktiviteye veya sınıfa referans veriyor.Bu alanda this.name için bakılırsa class içerisinde yazdığım name property constructur içerisindekine eşittir anlamına geliyor.
        //herbir kullanıcı oluşturulduğunda bunu ifade edebiliriz.Örneğin

        System.out.println("User Created");
    }
}
