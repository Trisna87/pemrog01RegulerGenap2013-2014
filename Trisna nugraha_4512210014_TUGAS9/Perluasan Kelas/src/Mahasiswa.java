//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09f.bin;

class Mahasiswa extends Orang
{
	private String NIM = "";
	private float IPK;
	
	public Mahasiswa(String NM, int UMR, String ALMT, String STS, String NT, String NI, float IP)
	{
		super(NM, UMR, ALMT, STS, NT);
		NIM = NI;
		IPK = IP;
	}
	
	public void setNIM(String NI)
	{
		this.NIM = NI;
	}
	public void setIPK(float IP)
	{
		this.IPK = IP;
	}
	
	public String getNIM()
	{
		return NIM;
	}
	public float getIPK()
	{
		return IPK;
	}
	public String Disply()
	{
		return super.Disply() +"NIM" +NIM+"-IPK" +IPK;
	}
}