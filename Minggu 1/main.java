class Menu{
    String name;
    double price;
    String Category;
    static int totalmenu;

    public Menu(String name,double price,String Category){
        this.name = name;
        this.price = price;
        this.Category = Category;
        totalmenu += 1;
    }

    void showMenu(){
        System.out.println("Nama = " + name +"\nHarga = "+ price + "\nKategori = " +Category);
        System.out.println();
    }
    public double discount(double percantage){
        return price - (price * percantage);
    }
    public double ChangePrice(double newPrice){
        return price = newPrice;
    }
}

public class main{
    public static void main(String[] args){
        Menu menu1 = new Menu("Espresso", 20000,"Beverage" );
        Menu menu2 = new Menu("Croissant", 25000,"Food" );
        Menu menu3 = new Menu("Matcha", 22000,"Beverage" );
        Menu menu4 = new Menu("Sandwich", 30000,"Food" );

        
        System.out.println("CAFE MENU");
        menu1.showMenu();
        menu2.showMenu();
        menu3.showMenu();
        menu4.showMenu();

        System.out.println("Total Menu = " + menu4.totalmenu);

        System.out.println("UPDATE MENU1");
        menu1.ChangePrice(menu1.discount(0.1));


        System.out.println("HASIL MENU1");
        menu1.showMenu();


        System.out.println("Hasil Soal Tambahan");
        Order orang1 = new Order(1125051, "Key", menu1, 2);
        orang1.showOrder();
    }
}
class Order{
    int OrderId;
    String customerName;
    Menu menu;
    int Quantity;

    public Order(int OrderId , String customerName , Menu menu , int Quantity){
        this.OrderId = OrderId;
        this.customerName = customerName;
        this.menu = menu;
        this.Quantity = Quantity;
    }

    double calculatetotal(){
        return menu.price * Quantity;
    }
    void showOrder(){
        System.out.println("Nama Pelanggan : "+customerName+"\nMenu yang dipesan : "+menu.name+"\nJumlah : "+Quantity+"\nTotal Bayar : "+calculatetotal());
    }

}
