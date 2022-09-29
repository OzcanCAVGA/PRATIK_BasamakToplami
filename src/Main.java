import java.util.Scanner;

/*
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
 */
public class Main {
    public static void main(String[] args) {
        Scanner yazici = new Scanner(System.in);
        int sayim, count = 1, temp, basamakDegeri=0;
        System.out.println("Sayini gir");
        sayim = yazici.nextInt();
        temp = sayim;
        //basamak bulmak
        while (temp / 10 > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("basamak sayisi: " + count);
        //basamak degerleri

        for (int i = 1; i <= count; i++) {
            basamakDegeri+= (sayim % (int) (Math.pow(10, i))) / (int) Math.pow(10, i - 1);
        }
        System.out.println("Basamaklar toplami: "+basamakDegeri);

    }
}
