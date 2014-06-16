//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09c.bin;

public class Jawa extends SukuInd
{
	private double GAJI;
	public Jawa(String Nama, String Alamat, String Hobby, String Pekerjaan)
	{
		super(Nama, Alamat, Hobby, Pekerjaan);
	}
	public double getGAJI()
	{
		return GAJI;
	}
	public void setGAJI(double Gaji)
	{
		GAJI = Gaji;
	}
	public String THR(double persen)
	{
		if(persen > 500000)
			return "Gaji ke 13 Terlalu Besar !!!!";
		else
			return "Gaji ke 13 sebesar "+persen*GAJI;
	}
	public String THR(long persen)
	{
		if(persen > 500000)
			return "Gaji ke 13 Terlalu Besar !!!!";
		else
			return "Gaji ke 13 sebesar "+persen*GAJI/100;	
	}
}