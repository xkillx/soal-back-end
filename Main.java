
public class Main {
	public static void main(String[] args) {
		Customer udin = new Customer("Udin", "Bekasi");
		Motor supra = new Motor("Supra", "3453", 11);
		Penyewaan penyewa1 = new Penyewaan(udin, supra);
		System.out.println(penyewa1);
		
		Customer mamat = new Customer("Mamat", "Bekasi");
		Mobil jazz = new Mobil("Honda Jazz", "34513", 11);
		Penyewaan penyewa2 = new Penyewaan(mamat, jazz);
		System.out.println(penyewa2);
	}
}
