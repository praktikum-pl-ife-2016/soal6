public class MainDistributor {

    public static void main(String[] args) {
        String batas = ("===============================");
        Distributor distributor = new Distributor("Irma", "15515020", "Distributor", 300000, 1350);
        Wholesaler wholesaler = new Wholesaler("Rina", "16616020", "Wholesaler", 5000, 1475);
        Retailer retailer = new Retailer("Evy", "17717020", "Retailer", 750000, 75);

        System.out.println(batas);
        distributor.Tampilan();
        System.out.println(batas);
        System.out.println(batas);
        wholesaler.Tampilans();
        System.out.println(batas);
        System.out.println(batas);
        retailer.Tampilann();
        System.out.println(batas);
    }
}
