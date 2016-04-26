
public class Main {
    public static void main(String[] args) {
        Distributor staff1 = new Distributor("Audi","08133101","Distributor",50000,2000);
        Wholesaler staff2 = new Wholesaler("Febri","08133102","wholesaler",100000,2000);
        Retailer staff3 = new Retailer("Cika","08133103","retailer",200000,4000);
        
        staff1.display();
        staff2.display();
        staff3.display();
    }
}
