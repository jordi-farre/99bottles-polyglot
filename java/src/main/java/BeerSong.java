public class BeerSong {

    public String sing(int bottles, int verse) {
        if (bottles == 2) {
            return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                    "Take one down and pass it around, 1 bottle of beer on the wall.\n\n";
        }
        return String.format("%s bottles of beer on the wall, %s bottles of beer.\n" +
                "Take one down and pass it around, %s bottles of beer on the wall.\n\n", bottles, bottles, bottles - 1);
    }

    public String singSong() {
        throw new UnsupportedOperationException();
    }
}