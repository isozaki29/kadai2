import java.time.LocalDate;
import java.util.ArrayList;


public class Kadai2 {
    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<Movie>();

        movieList.add(new Movie("ワンピース RED", 2022));
        movieList.add(new Movie("トップガン マーベリック", 2022));
        movieList.add(new Movie("アキラとあきら", 2022));
        movieList.add(new Movie("パラサイト 半地下の家族", 2020));

        //映画一覧を表示する
        System.out.println("<映画一覧>");
        for (Movie movie : movieList) {
            System.out.println("タイトル:" + movie.getName());
            System.out.println("公開年:" + movie.getOpeningYear());
        }

        //今年公開の映画のみ表示する
        System.out.println(" ");
        System.out.println("<今年公開の映画>");

        LocalDate now = LocalDate.now();

        for (Movie movie : movieList) {
            if (now.getYear() == movie.getOpeningYear()) {
                System.out.println("タイトル:" + movie.getName());
                System.out.println("公開年:" + movie.getOpeningYear());
            }
        }
    }
}