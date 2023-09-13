import java.text.DecimalFormat;

public class Penampil {
    private Angsuran[] daftarAngsuran;

    public Penampil(Angsuran[] daftarAngsuran) {
        this.daftarAngsuran = daftarAngsuran;
    }

    public void gambarHeaderTabel() {
        System.out.println("+-----------------------+-----------------------+-----------------------+");
        System.out.println("|     Angsuran ke-      |   Angsuran Bulanan    |          Total        |");
        System.out.println("+-----------------------+-----------------------+-----------------------+");
    }

    public void gambarBodyTabel() {
        for(Angsuran angsuran : daftarAngsuran) {
            double nilaiDoubleJB = Double.parseDouble(angsuran.getStrJumlahBayar());
            double nilaiBulatJB = Double.parseDouble(String.format("%.1f", nilaiDoubleJB));
            String nilaiStrJB = String.valueOf(nilaiBulatJB);

            double nilaiDoubleSP = Double.parseDouble(angsuran.getStrSisaPinjaman());
            double nilaiBulatSP = Double.parseDouble(String.format("%.0f", nilaiDoubleSP));
            String nilaiStrSP = String.valueOf(nilaiBulatSP);

            System.out.println("|"+ format(angsuran.getStrAngsuranKe(), 23) + "|" + format(nilaiStrJB, 23) + "|" + format(nilaiStrSP, 23) + "|");
        }
        System.out.println("+-----------------------+-----------------------+-----------------------+");
    }

    private String format(String nilai, int jumlahSpasi) {
        // format nilai menjadi rata kiri dengan menyisipkan karakter sebanyak "jumlahSpasi"
        int spasi = (jumlahSpasi - nilai.length() >= 0 ? (jumlahSpasi - nilai.length()) : 0);

        for(int i = 0; i < spasi; i++) {
            nilai = (nilai + " ");
        }
        return nilai;
    }
}
