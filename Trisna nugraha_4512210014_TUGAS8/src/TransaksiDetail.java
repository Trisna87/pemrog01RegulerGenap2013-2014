//perintah object oriented programming
package praktikum08a.bin;
import java.math.BigDecimal;

public class TransaksiDetail {
      private barang Barang;
	  private Integer jumlah;
	  
	  public BigDecimal subtotal() {
	       return Barang.getHarga().multiply(new BigDecimal(jumlah));
	  }
}	  