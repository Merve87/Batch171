package day02datatypesmethodcreation;

public class MethodCreation01 {



    public static void main(String[] args) {
       int sonuc = toplamaYap(3,5);
        System.out.println(sonuc);
          long carpmaSonucu =      multiply(4,5);
        System.out.println(carpmaSonucu);
        System.out.println(firstTwoMultiplyThirdAdd(2,3,4));
    }

    //Ornek 1:Toplama islemi yapan bir method olusturun ve kullanin.



    public static int toplamaYap(int a, int b){
        return a+b;

    }
    //Ornek 2: 2 sayiyi carpma islemi yapan bir method olusturun ve kullanin.

    protected static long multiply(int a, int b){
        return a*b;

    }

    //Ornek 3:Verilen 3 sayidan ilk ikisini carpan,3.cusuyle toplayan methodu olusturun ve kullanin.

    private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
      return   a*b+c;


    }
}
