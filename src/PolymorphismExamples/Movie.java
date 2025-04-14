package PolymorphismExamples;

public class Movie {
    private String title;
    private String movieType;

    public  Movie(){}

    public  Movie(String title){
        this.title = title;
    }
    public Movie(String movieType, String title) {
        this.title = title;
        this.movieType = movieType;

    }

    // This is the parent class method which is being overridden by the subclasses.
    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a "+ instanceType + " film");
    }

    // Factory methods or dependency injection to create the right subclass internally.
    // As class Movie is there in the different package so subclasses would not be called directly from main
    // to demonstrate the polymorphic behavior. So the factory function used to publish the subclasses which
    // are package-private
    public static Movie getMovieOfParticularTypes(String movieType, String title){
        return switch (movieType.toLowerCase()){
            case "adventure" -> new Adventure(title);
            case "comedy" -> new Comedy(title);
            case "sciencefiction" -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}

class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Pleasant Scene.",
                "Scary Music",
                "Something bad is happens");
    }
}

class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Funny Scenes",
                "More of funny musics",
                "Overall very funny movies");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("...%s%n".repeat(3),
                " Aliens arrived.",
                "Scary Music",
                "Scientist back to earth");
    }
}
