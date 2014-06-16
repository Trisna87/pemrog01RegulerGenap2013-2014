//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09f.bin;

class Orang 
{
	private String Nama = "";
	private int Umur;
	private String Alamat = "";
	private String Status = "";
	private String NoTlp = "";
	
	public Orang (String NM, int UMR, String ALMT, String STS, String NT){
	Nama = NM;
	Umur = UMR;
	Alamat = ALMT;
	Status = STS;
	NoTlp = NT;}
	
	public void setNama(String NM)
	{
		this.Nama = NM;
	}
	public void setUmur(int UMR)
	{
		this.Umur = UMR;
	}
	public void setAlamat(String ALMT)
	{
		this.Alamat = ALMT;
	}
	public void setStatus(String STS)
	{
		this.Status = STS;
	}
	public void setNOTlp(String NT)
	{
		this.NoTlp = NT;
	}
	
	public String getNama()
	{
		return Nama;
	}
	public int getUmur()
	{
		return Umur;
	}
	public String getAlamat()
	{
		return Alamat;
	}
	public String getStatus()
	{
		return Status;
	}
	public String getNoTlp()
	{
		return NoTlp;
	}
	public String Disply()
	{
		return "Nama"+Nama+"- Umurnya"+Umur+"-Alamat"+Alamat+"-Status"+Status+"-Nomor Telponnya"+NoTlp;
	}
}