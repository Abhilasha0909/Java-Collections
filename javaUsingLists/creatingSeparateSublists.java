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
        urlList.sort(null);

        List<String> firstTwo = new ArrayList<>(urlList.subList(0, 2));
        int remaining = urlList.size() - firstTwo.size();
        System.out.println(firstTwo);
        System.out.println("And " + remaining + " more.");
        List<String> remainingUrls = new ArrayList<>(urlList.subList(2, urlList.size()));
        System.out.println(remainingUrls);


    }
}
