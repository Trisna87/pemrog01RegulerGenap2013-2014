//created by: Trisna nugraha
//data		: 6 Juni 2014

package Latihan10d.bin;

public class TesOverriding4
{
	public static void main(String[] Trisna_nugraha)
	{
		KomunitasPT2 DtJRS = new KomunitasPT2("Teknik Informatika","Jakarta Selatan", "LK");
		Karyawan2 KA = new Karyawan2("Alfian", "Depok", "Laki-laki", 308, 1000000);
		DtJRS.Tampilkan3();
		System.out.println();
		KA.Tampilkan3();
	}
}