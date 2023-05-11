package day02datatypesmethodcreation;

public class Variables01 {

    public static void main(String[] args) {
        //Ornek 1:Sehir ismi icin bir variable olusturun.Once Ankara sonra da Izmir degerleriniatayip ekrana yazdirin.

        String cityName = "Ankara";
        System.out.println(cityName);


        cityName = "Izmir";
        System.out.println(cityName);

        cityName = "Istanbul";
        System.out.println(cityName);


        //Ornek 2; Sehir plaka kodu icin variable olusturun.once 34 sonra 35 degeri atayip concola yazdirin.

       byte plakaKodu = 34;
        System.out.println(plakaKodu);

       plakaKodu = 35;
        System.out.println(plakaKodu);


        //Ornek 3: Basarili mi?sorusu icin bir variable olusturun ve once "false sonra da "true" degeri atayp yazdirin.

        boolean isSuccessful = false;
        System.out.println(isSuccessful);

        isSuccessful = true;
        System.out.println(isSuccessful);



    }



}
