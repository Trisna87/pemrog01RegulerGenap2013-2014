//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09e.bin;

class Jeep extends Mobil
{
	String Nama;
	String NoPolisi;
	int Kecepatan;
	
	public Jeep(String aNama, String aNoPolisi, int aKecepatan)
	{
		super("Jeep");
		Nama = aNama;
		NoPolisi = aNoPolisi;
		Kecepatan = aKecepatan;
	}
	
	public void Disply()
	{
		System.out.println("Nama Mobil		= "+this.Nama);
		System.out.println("Nomor Mobil		= "+this.NoPolisi);
		System.out.println("Kecepatan Mobil	= "+this.Kecepatan);
	}
}