public class Smartphone extends Handphone {

    public Smartphone(String merk, String model) {
        super(merk, model);
    }

    @Override
    public void nyalakan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang booting.");
    }

    @Override
    public void matikan() {
        System.out.println("Smartphone " + merk + " " + model + " sedang shutdown.");
    }

    @Override
    public void telepon(String nomor) {
        System.out.println("Melakukan panggilan video ke nomor " + nomor);
    }

    @Override
    public void kirimPesan(String nomorTujuan, String pesan) {
        System.out.println("Mencari nomor tujuan " + nomorTujuan, "Mengirim pesan " + pesan);
    }

    @Overload
    public void kirimPesan(String emailTujuan, String subjek, String pesan) {
        System.out.println("Mencari email tujuan" + emailTujuan, subjek, "Mengirim Pesan" + pesan);
    }

    public void aksesInternet() {
        System.out.println("Mengakses internet melalui Smartphone.");
    }
}