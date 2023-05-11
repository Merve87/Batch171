package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {

        //primitive     :   char     -  boolean - byte - short - int     - long  - float - double
        //Wrapper Class :  Character -  Boolean - Byte - Short - Integer - Long  - Float - Double

        //Wrapper class lar non-primitive dir. o yuzden memory de cok yer kaplarlar
        //o yuzden sart degilse  Wrapper class kullanmayi tercih etmeyiz
        //n yazip nokta koyarsaniz hic method goremezsiniz, cunku primitive ler method icermez
        int n = 12;

        //m yazip nokta koyarsaniz bircok method gorursunuz, cunku wrapper classlar method icerir
        Integer m=12;

        byte p = 13;
        Byte r = 13;

        //Ornek 1: short data type inin minimum ve maximum degerlerin kod yazarak bulunuz
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);//maxShort = 32767

        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);//minShort = -32768

        //Ornek 2:int data typenin minimum degeri ile byte data typenin maximum degerinin toplamini bulunuz.
        //Ornek 2: int data type inin minumum degeri ile byte data typeinin maximum degerinin toplamini bulunuz.

        int minValu=Integer.MIN_VALUE;
        byte maxValue=Byte.MAX_VALUE;
        System.out.println( minValu+maxValue);//minValu = -2147483648

        //ornek 3 : Primitive int i wapper Integer a ceviriniz.(Autoboxing)/(interviewlerde sorulabılıyor)
        int num = 12;
        Integer wrapperNum =num;

        //Ornek 4: Wrapper Byte i primitive byte a ceviriniz.(Unboxing)
        Byte k = 12;
        System.out.println(k);
        byte primitiveK = k;
        System.out.println(primitiveK);

        //Ornek 5:Primitive char i Wrapper Character e cevirin.
        char inital = 'm';
        Character initalWrapper = inital;

        //Ornek 6:Wrapper Boolean i primitive boolean a cevirin.
        Boolean isOldWrapper = true;
        boolean isOldPrimitive = isOldWrapper;





    }

}