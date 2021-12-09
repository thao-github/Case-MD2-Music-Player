package StringRegex;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSong {

    public static void main(String[] args) throws IOException {
        try {
            URL url;
            url = new URL("https://www.nhaccuatui.com/playlist/merry-christmas-2021-va.GSQFAJXZxpgR.html");
            Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
            sc.useDelimiter("\\Z");
            String content = sc.next();
            sc.close();

            //5
            content = content.replaceAll("\\n+", "");

            //6
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
