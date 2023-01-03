public class Movie {
    //Øvelse 2. Lav en klasse Film med attributter filmTitel og udgivelsesÅr
    //Tilføj en konstruktør der modtager en filmtitel og et udgivelsesÅr og en anden konstruktør der kun modtager
    // ...filmTitel og selv sætter udgivelsesåret til det aktuelle år.
    //Tilføj så en klasse Producer, og giv Film klassen mulighed for at "koble" en producer til en film.

    private int releaseYear;
    private String title;
    //producer er bare en datatype
    private Producer producer;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public Movie(String title) {
        this.title = title;
        this.releaseYear = 2022;
    }

    //når man vil tilføje eller ændre et object, gør man det med en setter

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "titel: " + title + ", release year: " + releaseYear + ", producer " + producer.toString();//vi bruger toString metoden i Producer-klassen
    }
}
