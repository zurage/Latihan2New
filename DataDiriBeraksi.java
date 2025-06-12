package latihan2;

public class DataDiriBeraksi {
    // Atribut
    String nama;
    String npm;
    String kelas;

    // Constructor untuk mengisi data diri
    public DataDiriBeraksi(String nama, String npm, String kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }

    public static void main(String[] args) {
        // Membuat objek dari class DataDiriBeraksi
        DataDiriBeraksi orang1 = new DataDiriBeraksi("Azmi", "2310010349", "4C");

        // Mencetak data diri objek pertama
        System.out.println("Nama : " + orang1.nama);
        System.out.println("NPM : " + orang1.npm);
        System.out.println("Kelas : " + orang1.kelas);
    }
}
