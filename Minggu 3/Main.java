import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

interface Movable{
    void move();
}

interface Feedable{
    void feed();
}

abstract class Hewan {
    private String Nama;
    private int Age;
    private String food;

    public Hewan(String Nama , int umur , String food){
        this.Nama = Nama;
        this.Age = umur;
        this.food = food;
    }

    String getNama(){
        return Nama;
    }
    void setNama(String Nama){
        this.Nama = Nama;
    }
    int getAge(){
        return Age;
    }
    void setAge(int Umur){
        this.Age = Umur;
    }
    String getFood(){
        return food;
    }
    void setFood(String food){
        this.food = food;
    }

    abstract String printSound();

    abstract String jenisBinatang();
    
    public void printData() {
        System.out.println("Jenis Hewan :"+jenisBinatang()+"\nNama: " + Nama + "\nUmur: " + Age);
    }

}

abstract class HewanDarat extends Hewan  implements Movable ,Feedable {
    int numberOfLegs;

    public HewanDarat(String nama, int umur, String makan, int kaki) {
        super(nama , umur , makan);
        this.numberOfLegs = kaki;
    }


    @Override
    public void printData() {
        super.printData();
        System.out.print("Movement : ");
        move();
        feed();
        System.out.println("Jumlah Kaki :"+numberOfLegs);
    }
}

abstract class HewanLaut extends Hewan implements Movable ,Feedable {
    double depth;

    public HewanLaut(String nama, int umur, String makan, double dalam) {
        super(nama , umur , makan);
        this.depth = dalam;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.print("Movement : ");
        move();
        feed();
        System.out.println("Kedalaman Menyelam : "+depth);
    }
}

abstract class HewanUdara extends Hewan  implements Movable ,Feedable {
    double wingspan;

    public HewanUdara(String nama, int umur, String makan, double span) {
        super(nama , umur , makan);
        this.wingspan = span;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.print("Movement : ");
        move();
        feed();
        System.out.println("Lebar Sayap :"+wingspan);
    }
}

class Anjing extends HewanDarat  {
    public Anjing(String nama, int umur, String makan, int kaki) {
        super(nama, umur, makan, kaki);
    }
    @Override
    String jenisBinatang(){
        return "Anjing";
    }
    @Override
    public void move(){
        System.out.println("Dog is Running");
    }
    @Override
    public void feed(){
        System.out.println("Anjing Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Kucing";
    }
    @Override
    public void move(){
        System.out.println(" Cat is stalking and walking softly ");
    }
    @Override
    public void feed(){
        System.out.println("Kucing Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Tikus";
    }
    @Override
    public void move(){
        System.out.println("Mouse is scruyying");
    }
    @Override
    public void feed(){
        System.out.println("Tikus Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Ikan";
    }
    @Override
    public void move(){
        System.out.println("Fish swimming rapidly");
    }
    @Override
    public void feed(){
        System.out.println("Ikan Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Hiu";
    }
    @Override
    public void move(){
        System.out.println("Shark is gliding through the deep ocean");
    }
    @Override
    public void feed(){
        System.out.println("Hiu Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Paus";
    }
    @Override
    public void move(){
        System.out.println("Whale is diving gracefully");
    }
    @Override
    public void feed(){
        System.out.println("Paus Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Burung";
    }
    @Override
    public void move(){
        System.out.println("Two birds on a WIREEEEE one say cmon and the other say tomorrow ");
    }
    @Override
    public void feed(){
        System.out.println("Burung Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Elang";
    }
    @Override
    public void move(){
        System.out.println("Eagle is soaring high in the sky");
    }
    @Override
    public void feed(){
        System.out.println("Elang Sedang makan "+ getFood());
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
    String jenisBinatang(){
        return "Bebek";
    }
    @Override
    public void move(){
        System.out.println("Duck is flying and paddling");
    }
    @Override
    public void feed(){
        System.out.println("Bebek Sedang makan "+ getFood());
    }
    @Override
    String printSound(){
        return "Kwek kwek"; 
    }
}

public class Main {
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
        ArrayList<Hewan> animals = new ArrayList<>();

        System.out.println("======================");
        System.out.println("List Normal");
        System.out.println("======================");
        for (Hewan h : daftarHewan) {
            h.printData();
            System.out.println("Suara : " + h.printSound());
            System.out.println("----------------------------------------");
            animals.add(h);
        }
        System.out.println("======================");
        System.out.println("Sort Secara Nama");
        System.out.println("======================");
        Collections.sort(animals, new Comparator<Hewan>(){
            @Override 
            public int compare(Hewan a1 , Hewan a2){
                return a1.getNama().compareToIgnoreCase(a2.getNama());
            }
        });

        for(int i = 0 ; i < 4 ; i++){
            System.out.println(animals.get(i).getNama() + "(" + animals.get(i).jenisBinatang() + "," + animals.get(i).getAge() + "tahun)");
        }
         System.out.println("======================");
        System.out.println("Sort Secara Umur");
        System.out.println("======================");
        Collections.sort(animals, new Comparator<Hewan>() {
            @Override
            public int compare(Hewan a1, Hewan a2) {
                return Integer.compare(a1.getAge(), a2.getAge());
            }
        });

        for (int i = 0; i < 4; i++) {
            System.out.println(animals.get(i).getNama() + " (" + animals.get(i).jenisBinatang() + ", "
                    + animals.get(i).getAge() + " tahun)");
        }
    }
}
