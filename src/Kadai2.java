import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Kadai2 {
    public static void main(String[] args) {

        ArrayList<Movie> movieList = new ArrayList<Movie>();
        Map<String, String> movieMap = new HashMap<String, String>();

        //movieListに映画情報を追加
        movieList.add(new Movie("ワンピース RED", 2022));
        movieList.add(new Movie("トップガン マーベリック", 2022));
        movieList.add(new Movie("アキラとあきら", 2022));
        movieList.add(new Movie("パラサイト 半地下の家族", 2020));

        //movieMapに映画情報を追加
        movieMap.put("2022/08/06", "ワンピース RED");
        movieMap.put("2022/05/22", "トップガン マーベリック");
        movieMap.put("2022/08/26", "アキラとあきら");
        movieMap.put("2020/01/10", "パラサイト 半地下の家族");

        //movieListから映画一覧を表示する
        System.out.println("<映画一覧 Listで表示>");
        for (Movie movie : movieList) {
            System.out.println("タイトル:" + movie.getName());
            System.out.println("公開年:" + movie.getOpeningYear());
        }

        //movieListから今年公開の映画のみ表示する
        System.out.println(" ");
        System.out.println("<今年公開の映画 Listで表示>");

        LocalDate now = LocalDate.now();

        for (Movie movie : movieList) {
            if (now.getYear() == movie.getOpeningYear()) {
                System.out.println("タイトル:" + movie.getName());
                System.out.println("公開年:" + movie.getOpeningYear());
            }
        }

        //movieMapから映画一覧を表示する
        System.out.println(" ");
        System.out.println("<映画一覧 Mapで表示>");
        for (String key : movieMap.keySet()) {
            System.out.println("タイトル:" + movieMap.get(key));
            System.out.println("公開日:" + key);
        }

        //movieMapから今年公開の映画のみ表示する
        System.out.println(" ");
        System.out.println("<今年公開の映画一覧 Mapで表示>");
        for (String key : movieMap.keySet()) {
            if (now.getYear() == Integer.parseInt(key.substring(0, 4))) {
                System.out.println("タイトル:" + movieMap.get(key));
                System.out.println("公開日:" + key);
            }
        }
    }
}