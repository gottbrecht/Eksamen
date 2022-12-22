public class Film extends Producer {

    private String killBill;
    private String grandBudapestHotel;
    private int releaseYear;

    public Film(String killBill, String grandBudapestHotel, int releaseYear) {
        super("",  "");
        this.killBill = killBill;
        this.grandBudapestHotel = grandBudapestHotel;
        this.releaseYear = releaseYear;
    }

    public Film(String killBill, String grandBudapestHotel) {
        super("Grand Budapest Hotel", "Kill Bill");
        this.releaseYear = releaseYear;
    }

    public static void main(String[] args) {
        System.out.println();
    }


}
