// Created By Trisna Nugraha
// Date : 10 APRIL 2014

package Praktikum03e.bin;

public class DemoVariabel1 {
    public static void main(String[] Trisna){
	    int x=10;
	    System.out.println("Nilai X adalah " +x);
		
		char z='a';
	    System.out.println("Nilai Z adalah " +z);
		
		//isi data ke tipe data yang tidak tepat
		int y=z;
	    System.out.println("Nilai Y adalah " +y);
		
		//type casting
		char v=(char) x;
	    System.out.println("Nilai V adalah " +v);
		System.out.println("Baris Selanjutnya");
		
		coba();
		
		System.out.println("Setalah menjalankan coba");
	}
    static char v;
    
    public static void coba() {
        System.out.println("Nilai V adalah " +v);
        //varibel tidak boleh dihapus karena masih dipakai dan masih berada didalam scope
        short d= 15; //variabel d boleh dihapus di baris 22,karena life timenya sudah habis
        System.out.println("D adalah "+d); //variabel d boleh dihapus di baris 22
    }
}	