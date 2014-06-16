//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09b.bin;

public class TesKucing
{
	private static int Jumlah;
	public static void main (String[] Trisna Nugraha)
	{
		Jumlah = 1;
		
		KucingMakan KM = new KucingMakan();
		System.out.println("Masukkan Nama Kucing Kesayangan Anda ["+Jumlah +"] :");
		KM.setNama(KucingMakan.inputDataString());
		System.out.println("Masukkan Umur Kucing Kesayangan Anda ["+Jumlah +"] :");
		KM.setUmur(KucingMakan.inputDataInteger());
		System.out.println("Masukkan Makanan Kucing Kesayangan Anda ["+Jumlah +"] :");
		KM.setMakanan (KucingMakan.inputDataString());
		Jumlah++;
		
		JmlAnakKucing JAK =new JmlAnakKucing();
		System.out.println("Masukkan Nama Kucing Kesayangan Anda ["+Jumlah +"] :");
		JAK.setNama(KucingMakan.inputDataString());
		System.out.println("Masukkan Umur Kucing Kesayangan Anda ["+Jumlah +"] :");
		JAK.setUmur (KucingMakan.inputDataInteger());
		System.out.println("Masukkan Berat Kucing Kesayangan Anda ["+Jumlah +"] :");
		JAK.setBerat(KucingMakan.inputDataInteger());
		System.out.println("Masukkan Makanan Kucing Kesayangan Anda ["+Jumlah +"] :");
		JAK.setMakanan (KucingMakan.inputDataString());
		System.out.println("Masukkan Jumlah Anak Kucing Anda ["+Jumlah +"] :");
		JAK.setJumlahAnak (JmlAnakKucing.inputDataInteger());
		
		System.out.println("\n\n DATA KUCING	");
		KM.Tulis();
		System.out.println("Makanan Kucing Anda : "+KM.getMakanan());
		JAK.Tulis();
		System.out.println("Makanan Kucing Anda : "+JAK.getMakanan());
		System.out.println("Jumlah Anak Kucing  : "+JAK.getJumlahAnak());
		
	}
}