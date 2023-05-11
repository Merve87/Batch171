package day06swapvaluesstringmanipulations;

public class StringManipulations01 {


    public static void main(String[] args) {
        //String bir non primitive data typedir ve ayni zamanda bir classtir.
        String s = "Java is easy";
        //Ornek1: "s" Stringteki tum characterleri buyuk harf yap.

        String sUpper =s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Ornek2: "s" Stringteki tum characterleri kucuk harf yapin.
        String slower = s.toLowerCase();
        System.out.println(slower);//java is easy

       // Ornek 3: "s" Stringindeki ilk characteri aliniz.
        char firstChar =s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek4: "s" stringindeki bastan ikinci ve sondan ikinci charackeri aliniz ve ekrana yazdiriniz.

        char secondChar=s.charAt(1);
        char secondChar2 =s.charAt(10);
        System.out.println(secondChar);
        System.out.println(secondChar2);

        //ornek 5; "s" string inde kullanilan character sayisini bulunuz.
       int sLenght = s.length();
        System.out.println(sLenght);//12

        //Ornek 6; "s" stringindeki ilk 4 characteri aliniz.
        //s.substing(0,4)==>bu kullanimda ilk index dahildir,ikinci dahil degildir.

        String sub1 =s.substring(0, 4);
        System.out.println(sub1);//Java


        //Ornek 7: "s" stringindeki "is" kelimesini aliniz.

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);//is

        //Ornek 8: "s" Stringindeki "easy" kelimesini aliniz.

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);//easy

        //ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //Ornek 9: "s" Stringinde "money" kelimesinin var olup olmadigini kontrol ediniz.

        boolean isExist = s.contains("money");

        System.out.println(isExist);//false

        //Ornek 10: "s" stringin belli bir harfle ya da harflerle baslayip baslamadigini kontrol ediniz.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        /*Ornek 11:"s" stringinin 5. indexi dahil olmak uzere bu indexten itibaren ;i' karakteri ile baslayip
        baslamadigini kontrol eden bir kod yaziniz. */

       boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);//true


    }
}
