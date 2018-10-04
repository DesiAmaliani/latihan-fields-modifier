public class Nasabah{
	final String bank = "BANK A";
	public String nama;
	private int saldo;
	public static long nourutan=0;
	public int jumlahnasabah;
	public int sisa = 0;
	public int getSaldo(){
		return this.saldo;
	}
	public void setSaldo(int saldo){
		this.saldo=saldo;
	}
	public void ambilSaldo(int minSaldo, int pc, int  saldoter){
		if (saldo<minSaldo) {
			System.out.println("Maaf saldo anda kurang dari 50");
		}else{
			if(pc==1){
				System.out.println("jumlah saldo = "+saldo);
			}else{
				System.out.println("jumlah Saldo anda = "+saldo);
				sisa = saldo-saldoter;
				System.out.println("saldo yang terambil = "+saldoter);
				System.out.println("sisa = "+sisa);
				System.out.println("Selamat anda telah melakukan transaksi");
			}
		}
	}
}