
public class Motor extends Kendaraan {
	
	private static final long HARGA_SEWA = 100000;
	private static final long DENDA = 20000;
	
	private int lamaSewa;
	
	public Motor(String nama, String platNomor, int lamaSewa) {
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
