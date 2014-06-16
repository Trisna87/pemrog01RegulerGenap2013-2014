//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09d.bin;

class PajakApply
{
	public static void main (String[] Trisna Nugraha)
	{
		Pajak PJK = new Pajak();
		PJK.Pendapatan = 6000000;
		PJK.Propinsi = "Jawa Timur";
		PJK.Kota = "Mojosari-Mojokerto";
		double PajakAnda = PJK.HitungPajak();
		
		PajakProp PJK01 = new PajakProp();
		double PajakAndaProp = PJK01.HitungPjkProp(PajakAnda);
		
		System.out.println("Baser pajak anda sebesar Rp.	:"+PajakAnda);
		System.out.println("Anda berada di propinsi		:"+PJK.Propinsi);
		System.out.println("Anda di kota			:"+PJK.Kota);
		System.out.println("Potongan pajak anda sebesar Rp.	:"+PajakAndaProp);
	}
}