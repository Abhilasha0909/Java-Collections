import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class WebsiteClass {
    @Inject
    private List<String> urlList;

    public WebsiteClass() {
        urlList = new ArrayList<>();
    }

    public void printURLs() {
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");

        System.out.println("Links from stackoverflow.com:");
        for (String url : urlList) {
            if (url.contains("stackoverflow.com"))
                System.out.println(url);
        }
    }
}
