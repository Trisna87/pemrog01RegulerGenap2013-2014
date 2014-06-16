package praktikum08a.bin;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Transaksi {
    private String kasir;
	private Date waktu;
	
	private List<TransaksiDetail>daftarBelanja = new ArrayList<TransaksiDetail>();
	private List<Diskon> daftarDiskon = new ArrayList<Diskon>();
	private pembayaran Pembayaran;
	
	public BigDecimal hitungTotal() {
	   BigDecimal total = BigDecimal.ZERO;
	   
	   for(TransaksiDetail td : daftarBelanja) {
	        total = total.add(td.subtotal());
	   }
    return total;
    }
    public BigDecimal hitungTagihan() {
        BigDecimal totalDiskon = BigDecimal.ZERO;
        for(Diskon d:daftarDiskon) {
		     //totalDiskon = totalDiskon;
             totalDiskon = totalDiskon.add(d.hitung(this));
        }
    return hitungTotal().subtract(totalDiskon);
    }
}	