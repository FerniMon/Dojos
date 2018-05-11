public class BeerSong {

    public String sing(int totalBottles, int bottlesToPass) {
        int leftBottles = totalBottles - bottlesToPass;


        String textLastBottle = leftBottles ==0 ? "it":"one";
        return String.format("%d bottle%s of beer on the wall, %d bottle%s of beer.\n" +
                "Take %s down and pass it around, %d bottle%s of beer on the wall.\n\n",
                totalBottles, getPlural(totalBottles), totalBottles, getPlural(totalBottles),textLastBottle,
                leftBottles, getPlural(leftBottles));
    }

    private String getPlural(int leftBottles) {
        return leftBottles == 1 ? "":"s";
    }

    public String singSong() {
        return null;
    }
}