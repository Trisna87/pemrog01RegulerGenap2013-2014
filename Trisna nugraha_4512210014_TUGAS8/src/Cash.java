//perintah object oriented programming
package praktikum08a.bin;
import java.math.BigDecimal;

public class Cash extends pembayaran {
    private BigDecimal dibayar;
	private Transaksi transaksi;
	
	private BigDecimal getDibayar() {
	    return dibayar;
	}
    public void setDibayar(BigDecimal x) {
        dibayar = x;
    }
    
    public BigDecimal hitungKembalian() {
        return transaksi.hitungTagihan().subtract(dibayar);
    }
}	