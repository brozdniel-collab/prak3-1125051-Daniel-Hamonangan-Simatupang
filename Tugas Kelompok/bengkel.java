abstract class informasiKendaraan{
    String PlatNomor;
    String Merek;
    int TahunProduksi;
    String WarnaKendaraan;
    int Hari;

    String getPlatNomor(){
        return PlatNomor;
    }
    void setPlatNomor(String PlatNomor){
        this.PlatNomor = PlatNo
    }
    void setMerek(String Merek){
        this.Merek = Merek;
    }
    String getMerek(){
        return Merek;
    }
    void setWarnaKendaraan(String WarnaKendaraan){
        this.WarnaKendaraan = WarnaKendaraan;
    }
    String getWarnaKendaraan(){
        return WarnaKendaraan;
    }
    void setTahunProduksi(int TahunProduksi){
        this.TahunProduksi = TahunProduksi;
    }
    int getTahunProduksi(){
        return TahunProduksi;
    }
    void setHari(int Hari){
        this.Hari = Hari;
    }
    int getHari(){
        return Hari;
    }

    public informasiKendaraan(String PlatNomor, String Merek, int TahunProduksi, String WarnaKendaraan, int Hari){
        this.PlatNomor = PlatNomor;
        this.Merek = Merek;
        this.TahunProduksi = TahunProduksi;
        this.WarnaKendaraan = WarnaKendaraan;
        this.PlatNomor = PlatNomor;
        this.Hari = Hari;
    }
    
    abstract int hitungSewa();

    abstract void tampilHarga();

    void printData(){
        System.out.println("=== Rental Kendaraan ===");
        System.out.println("Merek Kendaraan: " + getMerek());
        System.out.println("Plat Nomor: " + getPlatNomor());
        System.out.println("Warna Kendaraan: " + getWarnaKendaraan());
        System.out.println("Tahun Produksi: " + TahunProduksi);

    }
}
class Mobil extends informasiKendaraan{

    public Mobil(String PlatNomor , String Merek , int TahunProduksi , String WarnaKendaraan , int Hari){
        super(PlatNomor,Merek,TahunProduksi,WarnaKendaraan,Hari);
    }
    @Override
    int hitungSewa(){
        return Hari * 200000;
    }
    @Override
    void tampilHarga(){
        System.out.println("Harga Sewa Mobil : "+hitungSewa());
    }
    @Override
    void printData(){
        super.printData();
        tampilHarga();
    }
}

class Motor extends informasiKendaraan{

    public Motor(String PlatNomor , String Merek , int TahunProduksi , String WarnaKendaraan, int Hari){
        super(PlatNomor,Merek,TahunProduksi,WarnaKendaraan,Hari);
    }
    @Override
    int hitungSewa(){
        return Hari * 110000;
    }
    @Override
    void tampilHarga(){
        System.out.println("Harga Sewa Motor : "+hitungSewa());
    }
    @Override
    void printData(){
        super.printData();
        tampilHarga();
    }
}

class Avanza extends Mobil{
    public Avanza(String PlatNomor , String Merek , int TahunProduksi , String WarnaKendaraan , int Hari){
        super(PlatNomor , Merek , TahunProduksi , WarnaKendaraan , Hari);
    }
}

class Beat extends Motor{
    public Beat(String PlatNomor , String Merek , int TahunProduksi , String WarnaKendaraan , int Hari){
        super(PlatNomor , Merek , TahunProduksi , WarnaKendaraan , Hari);
    }
}




public class bengkel{
    public static void main(String[] args) {
        
    }
}
