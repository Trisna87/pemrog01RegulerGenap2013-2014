//created by: Trisna nugraha
//data		: 6 Juni 2014

package Praktikum10b.bin;
class Lingkaran extends Bentuk
{
	public Lingkaran(int a)
	{
		this.a = a;
	}
	public String getBentuk()
	{
		return "Bentuk Lingkaran";
	}
	public int HitungLuas()
	{
		return 22/7*a*a;
	}
}