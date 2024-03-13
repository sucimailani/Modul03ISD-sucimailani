public class Buku {
    String judul;
    String penulis;
    int tahun;
    public Buku(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public int getTahun() {
        return tahun;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    @Override
    public String toString() {
        return "Buku [judul=" + judul + ", penulis=" + penulis + ", tahun=" + tahun + "]";
    }
    
    
}