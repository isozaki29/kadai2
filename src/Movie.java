public class Movie {

    //映画のタイトル
    private String name;

    //映画の公開日
    private int openingYear;

    //コンストラクター
    public Movie(String name, int openingYear) {
        this.name = name;
        this.openingYear = openingYear;
    }

    public String getName() {
        return name;
    }

    public int getOpeningYear() {
        return openingYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOpeningYear(int openingYear) {
        this.openingYear = openingYear;
    }
}

