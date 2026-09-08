abstract class Hewan {
    String Nama;
    int Age;
    String food;

    abstract String printSound();

    public String printData() {
        return "Nama: " + Nama + "\nUmur: " + Age + "\nMakanan: " + food;
    }
}

abstract class HewanDarat extends Hewan {
    int numberOfLegs;

    public HewanDarat(String nama, int umur, String makan, int kaki) {
        this.Nama = nama;
        this.Age = umur;
        this.food = makan;
        this.numberOfLegs = kaki;
    }

    @Override
    public String printData() {
        return super.printData() + "\nJumlah Kaki: " + numberOfLegs;
    }
}

abstract class HewanLaut extends Hewan {
    double depth;

    public HewanLaut(String nama, int umur, String makan, double dalam) {
        this.Nama = nama;
        this.Age = umur;
        this.food = makan;
        this.depth = dalam;
    }

    @Override
    public String printData() {
        return super.printData() + "\nKedalaman: " + depth;
    }
}

abstract class HewanUdara extends Hewan {
    double wingspan;

    public HewanUdara(String nama, int umur, String makan, double span) {
        this.Nama = nama;
        this.Age = umur;
        this.food = makan;
        this.wingspan = span;
    }

    @Override
    public String printData() {
        return super.printData() + "\nLebar Sayap: " + wingspan;
    }
}

class Anjing extends HewanDarat {
    public Anjing(String nama, int umur, String makan, int kaki) {
        super(nama, umur, makan, kaki);
    }
    @Override
    String printSound(){
        return "Guk guk";
    }
}

class Kucing extends HewanDarat {
    public Kucing(String nama, int umur, String makan, int kaki) {
        super(nama, umur, makan, kaki);
    }
    @Override
    String printSound(){
        return "Meong"; 
    }
}

class Tikus extends HewanDarat {
    public Tikus(String nama, int umur, String makan, int kaki) {
        super(nama, umur, makan, kaki);
    }
    @Override
    String printSound(){ 
        return "Cit cit"; 
    }
}

class Ikan extends HewanLaut {
    public Ikan(String nama, int umur, String makan, double depth) {
        super(nama, umur, makan, depth);
    }
    @Override
    String printSound(){ 
        return "Blub blub";
    }
}

class Hiu extends HewanLaut {
    public Hiu(String nama, int umur, String makan, double depth) {
        super(nama, umur, makan, depth);
    }
    @Override
    String printSound(){
        return "Tralaleo Tralala";
     }
}

class Paus extends HewanLaut {
    public Paus(String nama, int umur, String makan, double depth) {
        super(nama, umur, makan, depth);
    }
    @Override
    String printSound(){
        return "Wong JOwo"; 
    }
}

class Burung extends HewanUdara {
    public Burung(String nama, int umur, String makan, double span) {
        super(nama, umur, makan, span);
    }
    @Override
    String printSound(){
        return "Cuit cuit"; 
    }
}

class Elang extends HewanUdara {
    public Elang(String nama, int umur, String makan, double span) {
        super(nama, umur, makan, span);
    }
    @Override
    String printSound(){
        return "Screee"; 
    }
}

class Bebek extends HewanUdara {
    public Bebek(String nama, int umur, String makan, double span) {
        super(nama, umur, makan, span);
    }
    @Override
    String printSound(){
        return "Kwek kwek"; 
    }
}

public class main1 {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan[]{
            new Anjing("Doggy", 3, "Tulang", 4),
            new Kucing("Milo", 2, "Ikan", 4),
            new Tikus("Jerry", 1, "Keju", 4),
            new Ikan("Nemo", 1, "Plankton", 15.0),
            new Hiu("Megalo", 10, "Daging", 500.0),
            new Paus("Bluey", 20, "Krill", 1000.0),
            new Burung("Pipit", 1, "Biji-bijian", 0.2),
            new Elang("Garuda", 5, "Daging", 2.1),
            new Bebek("Donald", 2, "Dedak", 0.8)
        };

        for (Hewan h : daftarHewan) {
            System.out.println("Jenis Hewan : " + h.getClass().getSimpleName());
            System.out.println(h.printData());
            System.out.println("Suara : " + h.printSound());
            System.out.println("----------------------------------------");
        }
    }
}
