//Created By Trisna Nugraha
//Date 17 april 2014
//Perintah Control Flow/struktur Kontrol
//Perintah keempat - contoh 04

package Latihan05d.sesi1.bin;

public class DemoKalender
{
    public static void main(String[] Trisna)
	    {
		    hitungHari(2010, 2);
			hitungHari(2013, 4);
		}
	public static void hitungHari(Integer tahun, Integer bulan)
    {
        switch(bulan)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 hari");
                break;
            case 4:
            case 6:
            case 9:			
            case 11:
			    System.out.println("30 hari");
				break;
			case 2:
                if(tahun % 4 == 0)
                {
                    System.out.println("29 hari");
                }
                else
				{
				    System.out.println("28 hari");
                }
				break;
			default:
                System.out.println("Nilai Bulan Tidak Valid");
        }
    }
}	
                				