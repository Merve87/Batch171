package day05concatenationoperatorstypecasting;

public class Concatenation {

    public static void main(String[] args) {
        //Ornek1: Bir String ve iki Integer variable olusturun.String degeri ile Integer larin toplamini console a yazdirin.

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s+a+b);//elma1011 yazdirir.
        System.out.println(s +(a+b));//elma21 yazdirir.
        System.out.println(s+a*b);//elma110 yazdirir.
        System.out.println(a+b+s);//21elmaa yazdirir.
        System.out.println(a+s+b);//10elma11 yazdirir.

        //ornek 2 String olarak verilen iki fiyatin toplamini yazdirin

        String shirt ="2300";
        String shoes = "5200";
        System.out.println(shirt+shoes);//23005200 yazdirir

        //Integer.valueof() String degerleri Integer a cevirir

        int toplamFiyat =Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        //ornek 3: string verilen iki fiyatin toplamini yazdirin.

        String tv = "$1100";
        String radio ="$300";
        System.out.println(tv+ radio);//$1100$300 yazdirir

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        System.out.println(totalPrice);

    }
}
