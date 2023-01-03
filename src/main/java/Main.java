public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Avatar 2");
        Producer producer = new Producer("john smith", 47);
        Producer producer1 = new Producer("Hanne hej", 10);
        movie.setProducer(producer);
        System.out.println(movie.toString());
    }
}
