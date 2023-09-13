public class PembacaInput {
    private String[] args;
    private Pinjaman pinjaman;

    public PembacaInput(String[] args) {
        this.args = args;
    }

    public Pinjaman getPinjaman() {
        return pinjaman;
    }

    public void baca() {
        // kode untuk mengolah args menjadi isi dari atribut pinjaman
        String hutang = null;
        String bunga = null;
        String jumlahCicilan = null;

        // ambil input
        for (String arg : args) {
            if (arg.startsWith("-h")) {
                hutang = arg.substring(2);
            } else if (arg.startsWith("-b")) {
                bunga = arg.substring(2);
            } else if (arg.startsWith("-jc")) {
                jumlahCicilan = arg.substring(3);
            }
        }

        // convert string
        double jumlahHutang = Double.parseDouble(hutang);
        float jumlahBunga = Float.parseFloat(bunga);
        int jumlahBulan = Integer.parseInt(jumlahCicilan);

        pinjaman = new Pinjaman(jumlahHutang, jumlahBunga, jumlahBulan);
    }


}
