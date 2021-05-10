package com.hllbr.javaoop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import static com.hllbr.javaoop.HouseDecor.roomName;

public class MainActivity extends AppCompatActivity {
/*
Sınıflar =
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User MyUser = new User();
        MyUser.name = "@prince";
        MyUser.job = "Programmer";

        User newUser = new User();
        newUser.name = "Kirk";
        newUser.job = "Musician";



        /*
        Bir sınıftan birden fazla obje oluşturulamıyorsa bu sınıfa Singleton denir.

        Üst satırda bu kurulan yapı güvenli değildir.Bunu güvenli hale getirmek için erişilebilirlik ve constructor yapıları ekleyerek bunlardan faydanalmam gerekiyor.

        UserClsas ile yapıyı daha güvcenli hale getirmiş oldum


         */
        UserClass userClass1 = new UserClass("hllbr","Developer");
        UserClass userClass2 = new UserClass("Digitalist Şehzade","KİNG");

        System.out.println("Myuser1(name) : "+userClass1.name);
        System.out.println("Myuser2(job) : "+userClass2.job);
        /*
        EnCapsulation Kavramı = Hapsetmek gibi bir anlamı var

        Kendi değişkenlerimi özellikllerimi(property) sınıfın kendi içerisinde tutmak istersek ...

        Bu yapıyı anlamak için Musicians sınıfı üzerinden işlemleri gerçekleştiriyor olacağım.

         */
        Musicians musicians1 = new Musicians("Jamas","Cello",55);
        Musicians musicians2 = new Musicians("Kirk","Gitar",58);
       /*
        System.out.println("Musician1 age "+musicians1.age);
        System.out.println("Musician2 intrument "+musicians2.instrument);
        musicians2.age = 40;
        System.out.println("Musician2 new age "+musicians2.age);*/


        //Bu şekilde yapı üzerinde değişiklik yapmanın kolay olmasını istemiyotsam yapımı private olarak kurmama gerekiyor.
        //yapımı private yanı sadece sınıf içerisinden erişilebilir kılmışsam değişiklikler için gerekli bir prosedürün takip edilmesi gerekecektir.
        //Bu duruma Encapsulation denir.
        //bu yapı içerisinde hiçbir şekilde verim değiştirilmesin okunmasın vb özellikleri ekleyebilirim
        //bu durumlarda devreye getter ve setter olarak bilinen komutlar giriyor.
        //getter metodu yapımızı public olarak döndürüyor.Bu alan içerisinde bu yapıdan faydalana biliriz.
        System.out.println("Musician1 (age)= "+musicians1.getAge());
        System.out.println("Musician2 (name) = "+musicians2.getName());

        //Getter komutu benim için yapıları yazdırılabilir şekilde çağırma işlemi vb işlemleri için kullanılıyor değeri taşımak için kullanıyolar olarak ifade edebilirim.

        //Setter komutu ise yapılarım üzerinde ayarlamalar değişiklikler yapmam için gerekli izni sağlayan bir yapı
        musicians1.setAge(60);
        System.out.println("Musicians1 new age = "+musicians1.getAge());
        //yapı üzerinde değişiklikler yapılması için koşullar oluşturabilir ve bunları isteyebilirim.
        musicians2.setName("King","password");//mistake code example
        System.out.println(musicians2.getName());
        musicians2.setName("KingOne","hllbr");
        System.out.println(musicians2.getName());
        /*
        Inheritance =
        bir sınıfın diğer sınıftan miras alması property metod vb... yapılarını kullanmak için miras alma olarak düşünülebilir.

         */
        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sign());
        System.out.println("Inheritance example SuperMusicians Lars "+lars.getInstrument()+" "+lars.getAge()+ " "+ lars.getName());

        //Polymorphism = Bir metodun aynı isimle birden fazla işlemde kullanılabilmesine olanak sağlayan bir yapı

        //Matematics class ile birlikte yapılan kısımlar bu yapı için örnektir.

        //Static Polymorphism= aynı sınıfın içerisinde farklı metodları aynı isimle kullanmak static polymorphism olarak adlandırılıyor.

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,6));
        System.out.println(mathematics.sum(5,6,7));

        //Dinamic Polymorphism Animal class üzerinden işlemlerimi gerçekleştiriyorum

        Animal animal = new Animal();
        animal.sign();
        Dog dog = new Dog();
        dog.sign();
        dog.test();

        /*Abstract ve Interface =

        Abstract = soyut sınıflar

        Obje oluşturmaktan öte başka sınıflara referans/extends edilebilsinler diye üretilen kullanılan sınıflardır.

        People abstract yapısı için oluşturuldu

        User class şimdi bu abstract class extends ediyor.

         */

        System.out.println(MyUser.info());
        System.out.println(MyUser.information);

        //JAVA Multiple sınıf extends edemez sadece bir sınıf extends edebilir.Fakat Multiple arayüzlere extends işlemi gerçekleştirebilir.Interface
        //İnterfaceler %100 abstract tür.Biz Instrument tan vir obje oluşturamayız oluştururuz ama garip ve anlamsız olur
        //Interface içerisinde metodlar body{} şeklinde bulunamıyor Sözleşme görevi görüyorlar diyebiliriz.
        //Interface içerisindeki metodlar implements edildikten sonra overiride edilir(Üstüne yazma)
        //Bir değişken eğer static ise italik olarak ifade edilir.Javada heryerden ulaşılabilen yapıalr statictir.
        //Interface içerisinde tanımladığım static yapı final bir anlam taşır ve değiştirilemez
        //Interface içerisinde değeri atanmamış bir ifade bulunduramıyoruz.Kesinlikle değer ataması yapmak zorundayız.
        //piano class içersinde implements olarak hem HouseDecor hemde Instrument yapılabilir.
        //ınterface için piano class ve HouseDecor,Instrument

        /*

        Interface = simple features
        %100 Abstract Type
        Methods ->Override
        No instance
        Static property & Final
        Initialize

         */
        Piano mypiano = new Piano();
        mypiano.infos();
        mypiano.brand = "Yamaha";
        mypiano.digital = false;





    }
}