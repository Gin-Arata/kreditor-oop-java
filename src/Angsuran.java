public class Angsuran {
    private int angsuranKe;
    private double jumlahBayar, sisaPinjaman;

    // konstruktor tidak memiliki nilai balik sehingga tidak perlu void, int, dll
    // kegunaan konstruktor
    // Angsuran a = new Angsuran(1, 2000, 9000);
    public Angsuran(int angsuranKe, double jumlahBayar, double sisaPinjaman) {
        this.angsuranKe = angsuranKe;
        this.jumlahBayar = jumlahBayar;
        this.sisaPinjaman = sisaPinjaman;
    }

    public String getStrAngsuranKe() {

        return String.valueOf(this.angsuranKe);
    }

    public String getStrSisaPinjaman() {

        return String.valueOf(this.sisaPinjaman);
    }

    public String getStrJumlahBayar() {

        return String.valueOf(this.jumlahBayar);
    }

}
