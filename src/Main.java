public class Main {
    public static void main(String[] args) {
        // Baca input
        PembacaInput pi = new PembacaInput(args);
        pi.baca();
        Pinjaman pinjaman = pi.getPinjaman();

        // Hitung angsuran
        pinjaman.hitung();
        Angsuran[] daftarAngsuran = pinjaman.getDaftarAngsuran();

        // Tampilkan
        Penampil penampil = new Penampil(daftarAngsuran);
        penampil.gambarHeaderTabel();
        penampil.gambarBodyTabel();
    }
}