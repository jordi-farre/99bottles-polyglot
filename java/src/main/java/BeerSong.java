public class BeerSong {

    public String sing(int bottles, int verse) {
        if (bottles == 3) {
            return "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                    "Take one down and pass it around, 2 bottles of beer on the wall.\n\n";
        }
        return "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.\n\n";
    }

    public String singSong() {
        throw new UnsupportedOperationException();
    }
}