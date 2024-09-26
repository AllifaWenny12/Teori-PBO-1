public class Handphone {
    protected String merk;
    protected String model;

    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }

    public void nyalakan() {
        System.out.println("Handphone dinyalakan.");
    }

    public void matikan() {
        System.out.println("Handphone dimatikan.");
    }

    public void telepon(String nomor) {
        System.out.println("Memanggil nomor " + nomor);
    }

    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mencari nomor tujuan " + nomorTujuan, "Mengirim pesan " + pesan);
    }

    public void kirimPesan(String nomorTujuan1, String nomorTujuan2, String pesan) {
        System.out.println("Memasukkan nomor tujuan baru " + nomorTujuan1, "Membuka roomchat nomor tujuan " + nomorTujuan2, "Mengirim pesan " + pesan);
    }

    public void kirimPesan(String[] daftarNomor, String pesan) {
        System.out.println("Mencari daftar nomor " + daftarNomor, "Mengirim pesan " + pesan);
    }
}