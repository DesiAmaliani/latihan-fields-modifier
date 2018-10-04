public class NasabahTest{
	public static void main(String[] args) {
		Nasabah n1 = new Nasabah();
		n1.jumlahnasabah = 2;
		System.out.println("jumlah nasabah = "+n1.jumlahnasabah);
		Nasabah.nourutan++;
		System.out.println(n1.nourutan);
		n1.nama = "yana";
		System.out.println("nama = "+n1.nama);
		n1.setSaldo(100);
		n1.getSaldo();
		System.out.println("saldo = "+n1.getSaldo());
		n1.ambilSaldo(50, 2, 20);
		System.out.println(" ");
		
		Nasabah n2 = new Nasabah();
		Nasabah.nourutan++;
		System.out.println(n2.nourutan);
		n2.nama = "putri";
		System.out.println("nama = "+n2.nama);
		n2.setSaldo(10);
		n2.getSaldo();
		System.out.println("saldo = "+n2.getSaldo());
		n2.ambilSaldo(50, 1, 20);
	}
}