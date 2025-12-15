package objects_classes_creation_2;

public class Movie {
    String name;
    int year;

    public static void main(String[] args) {
        Movie movie = new Movie("Гладиатор", 2001);
        System.out.println("Фильм " + movie.name + " вышел в " + movie.year + " году");
    }

    Movie(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
