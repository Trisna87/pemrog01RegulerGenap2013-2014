//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09e.bin;

class Mobil
{
	private String Jenis;
	
	public Mobil(String aTipe)
	{
		Jenis = new String(aTipe);
	}
	public String JenisMobil()
	{
		return "Merupakan Jenis Mobil = "+Jenis;
	}
}