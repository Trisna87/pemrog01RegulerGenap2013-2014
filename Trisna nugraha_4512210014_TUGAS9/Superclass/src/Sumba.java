//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09c.bin;

public class Sumba extends SukuInd
{
	private double GAJI;
	public Sumba(String Nama, String Alamat, String Hobby, String Pekerjaan)
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
}