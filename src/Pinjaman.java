public class Pinjaman {
    // - = private
    private double hutang;
    private float bunga;
    private int jumlahCicilan;

    // Daftar angsuran banyaknya sesuai dengan jumlah cicilan
    private Angsuran[] daftarAngsuran;

    public Pinjaman(double hutang, float bunga, int jumlahCIcilan) {
        this.hutang = hutang;
        this.bunga = bunga;
        this.jumlahCicilan = jumlahCIcilan;

        // inisialisasi daftar angsuran
        this.daftarAngsuran = new Angsuran[this.jumlahCicilan];
    }

    public void hitung() {
        // perhitungan untuk mengisi atribut daftarAngsuran
        double totalHutang = this.hutang + (this.hutang * (this.bunga / 100));
        double angsuranBulanan = totalHutang / jumlahCicilan;

        for(int i = 0; i < jumlahCicilan; i++) {
            double sisaPinjaman = totalHutang - (angsuranBulanan * (i+1));
            daftarAngsuran[i] = new Angsuran(i+1, angsuranBulanan, sisaPinjaman);
        }
    }

    public Angsuran[] getDaftarAngsuran() {
        return daftarAngsuran;
    }
}
