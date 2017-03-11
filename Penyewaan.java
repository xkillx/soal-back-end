import java.text.NumberFormat;
import java.util.Locale;

public class Penyewaan {
	private Customer customer;
	private Sewa sewa;
	
	public Penyewaan(Customer customer, Sewa sewa) {
		this.customer = customer;
		this.sewa = sewa;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Sewa getSewa() {
		return sewa;
	}

	public void setSewa(Sewa sewa) {
		this.sewa = sewa;
	}

	@Override
	public String toString() {
		Locale locale = new Locale("id", "ID");
		NumberFormat nf = NumberFormat.getInstance(locale);
		return String.format("%s harus membayar Rp. %s,-", customer.getNama(), nf.format(sewa.hitungBiayaSewa()));
	}

}
