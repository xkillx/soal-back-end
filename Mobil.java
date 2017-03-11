
public class Mobil extends Kendaraan {

	private static final long HARGA_SEWA = 300000;
	private static final long DENDA = 50000;

	private int lamaSewa;

	public Mobil(String nama, String platNomor, int lamaSewa) {
		super(nama, platNomor);
		this.lamaSewa = lamaSewa;
	}

	@Override
	public int getLamaSewa() {
		return this.lamaSewa;
	}

	public void setLamaSewa(int lamaSewa) {
		this.lamaSewa = lamaSewa;
	}

	@Override
	public long getBiayaSewa() {
		return HARGA_SEWA;
	}

	@Override
	public long getDenda() {
		return DENDA;
	}
}
