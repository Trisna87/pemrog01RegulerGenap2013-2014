//created by: Trisna nugraha
//data		: 6 Juni 2014

package Praktikum10e.bin;
public class Tabung
{
	private String Nama;
	private int NoRek;
	private int Saldo;
	private int Pin;
	
	public Tabung(String NAMA, int NOREK)
	{
		Nama = NAMA;
		NoRek = NOREK;
		Pin = 6666666;	
	}
	public void Simpan(int Sal)
	{
		Saldo = Saldo + Sal;
	}
	public void Tarik(int jmlTarik)
	{
		Saldo = Saldo - jmlTarik;
	}
	public int getSaldo()
	{
		return Saldo;
	}
	public void setSaldo(int Sal)
	{
		Saldo = Sal;
	}
	public void setPin(int PinBaru)
	{
		Pin = PinBaru;
	}
	public static void main (String[] Abdulrahman)
	{
		int jmlTarik = 100000,jmlSimpan = 500000;
		Tabung TAB = new Tabung ("Alfian", 12345);
		System.out.println("Saldo Awalnya adalah = " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
		System.out.println("Saldo Setelah Penarikan = " +TAB.getSaldo());
		TAB.Simpan(jmlSimpan);
		System.out.println("Saldo Setelah Di setor = " +TAB.getSaldo());
		TAB.Tarik(jmlTarik);
	}
}