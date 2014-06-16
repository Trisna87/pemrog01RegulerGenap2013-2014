//Created By Trisna Nugraha
//Date 17 april 2014
//Perintah Control Flow/struktur Kontrol
//Perintah ketiga - contoh 03

package Latihan05c.sesi1.bin;
import java.util.Random;

public class DemoLooping2
{
    static boolean selesai = false;
    public static void main(String[] Trisna)
	{
	    Integer faktor=7;
		System.out.println("mencari kelipatan " +faktor + "dengan while");
		while(!selesai)
		{
		    cariKelipatan(faktor);
		}
		System.out.println("selesai mencari kelipatan dengan while");
		System.out.println();
		System.out.println();
		System.out.println("mencari kelipatan " +faktor + "dengan for");
		for(selesai=false; !selesai;)
		{
		     cariKelipatan(faktor);
		}
		System.out.println("selesai mencari dengan kelipatan for");
	}
    public static void cariKelipatan(Integer faktor)
    {
        Integer random = new Random().nextInt();
        System.out.println("Bilangan random : " +random);

        if(random % faktor == 0)
        {
            System.out.println("Kelipatan " +faktor + " ditemukan, yaitu : " +random);
            selesai = true;
        }
    }
}	