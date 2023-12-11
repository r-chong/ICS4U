public class VideoStore {
    public static void run() {
        // even though its a double we still input it as a normal number
        Video item1 = new Video("Jaws", 120, 1199);
        Video item2 = new Video("Star Wars", 1699);

        System.out.println(item1.toString());
        System.out.println(item2.toString());

        Movie item3 = new Movie("The Matrix", 120, "Jill Wachowski", "PG-13", 1299);
        System.out.println(item3);

        MusicVideo item4 = new MusicVideo("Thriller", 14, "Michael Jackson", "Pop", 1799);
        System.out.println(item4);

    }
}
