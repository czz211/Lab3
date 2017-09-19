import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */
public class WordCount {
    public static void main(String[] args) {
    System.out.print(WordCount.urlToString("http://erdani.com/tdpl/hamlet.txt"));
    String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
    String find = "prince";

    int count = 0;
    int len = text.length();
    for (int i = 1; i < len - find.length(); i++) {
        if (find.equalsIgnoreCase(text.substring(i, i + find.length())))
        count = count +1;
    }
    System.out.print(count);
    }
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

}

