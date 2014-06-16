//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09d.bin;
class Pajak
{
	long Pendapatan;
	String Propinsi;
	String Kota;
	public double HitungPajak()
	{
		double PajakUmum = 0;
		if(Pendapatan < 500000001)
		{
			PajakUmum = Pendapatan * 0.025;
		}
		else
		{
			PajakUmum = Pendapatan * 0.25;
		}
		return PajakUmum;
	}
}