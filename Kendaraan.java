
public abstract class Kendaraan implements Sewa {

	private String nama;
	private String platNomor;

	public Kendaraan(String nama, String platNomor) {
		this.nama = nama;
		this.platNomor = platNomor;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getPlatNomor() {
		return platNomor;
	}

	public void setPlatNomor(String platNomor) {
		this.platNomor = platNomor;
	}
	
	@Override
	public long hitungBiayaSewa() {
		if (getLamaSewa() <= Sewa.JAM_SEWA) {
			return getBiayaSewa();
		} else {
			return getBiayaSewa() + ((getLamaSewa() - Sewa.JAM_SEWA) * getDenda());
		}
	}
}
