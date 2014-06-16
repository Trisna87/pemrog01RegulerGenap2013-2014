//created by: Trisna Nugraha
//data		: 26 mei 2014

package Latihan09c.bin;
public class TesSuku
{
	public static void main(String[] Trisna Nugraha)
	{
		SukuInd SI = new SukuInd("Reza", "Putussibau", "futsal", "Presiden");
		System.out.println("Nama		: "+SI.getNAMA());
		System.out.println("Alamat		: "+SI.getALAMAT());
		System.out.println("Hobby		: "+SI.getHOBBY());
		System.out.println("Pekerjaan	: "+SI.getPEKERJAAN());
		System.out.println();
		System.out.println();
		Sunda SD = new Sunda("Pai", "Putussibau", "futsal", "Perawat");
		System.out.println("Nama		: "+SD.getNAMA());
		System.out.println("Alamat		: "+SD.getALAMAT());
		System.out.println("Hobby		: "+SD.getHOBBY());
		System.out.println("Pekerjaan	: "+SD.getPEKERJAAN());
		System.out.println();
		System.out.println();
		Batak BT = new Batak("Erlangga", "Medan", "futsal", "Mahasiswa");
		System.out.println("Nama		: "+BT.getNAMA());
		System.out.println("Alamat		: "+BT.getALAMAT());
		System.out.println("Hobby		: "+BT.getHOBBY());
		System.out.println("Pekerjaan	: "+BT.getPEKERJAAN());
		System.out.println();
		System.out.println();
		Sumba SB = new Sumba("Tofik", "Putussibau", "futsal", "Seketaris");
		System.out.println("Nama		: "+SB.getNAMA());
		System.out.println("Alamat		: "+SB.getALAMAT());
		System.out.println("Hobby		: "+SB.getHOBBY());
		System.out.println("Pekerjaan	: "+SB.getPEKERJAAN());
		System.out.println("Gaji		:Rp. "+SB.getGAJI());
		System.out.println();
		System.out.println();
		Jawa Jwa = new Jawa("Leon", "Pontianak", "futsal", "Bupati");
		System.out.println("Nama		: "+Jwa.getNAMA());
		System.out.println("Alamat		: "+Jwa.getALAMAT());
		System.out.println("Hobby		: "+Jwa.getHOBBY());
		System.out.println("Pekerjaan	: "+Jwa.getPEKERJAAN());
		System.out.println("Gaji		:Rp. "+Jwa.getGAJI());
		System.out.println("Keterangan	: "+Jwa.THR(30000));
		System.out.println();
		System.out.println();
		Jawa Jwb = new Jawa("Rakit", "Jakarta", "futsal", "HRD");
		System.out.println("Nama		: "+Jwb.getNAMA());
		System.out.println("Alamat		: "+Jwb.getALAMAT());
		System.out.println("Hobby		: "+Jwb.getHOBBY());
		System.out.println("Pekerjaan	: "+Jwb.getPEKERJAAN());
		System.out.println("Gaji		:Rp. "+Jwb.getGAJI());
		System.out.println("Keterangan	: "+Jwb.THR(0.75));
		System.out.println();
		System.out.println();
	}
}