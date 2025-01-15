import java.util.ArrayList;
import java.util.List;

public class WebsiteClass {
    private List<String> urlList;

    public WebsiteClass() {
        urlList = new ArrayList<>();
    }

    public WebsiteClass(List<String> list) {
        urlList = list;
    }

    public void printURLs() {
        urlList.add("https://pluralsight.com/search?q=java");
        urlList.add("https://medium.com/search?q=java");
        urlList.add("https://stackoverflow.com/questions/tagged/java");
        urlList.add("https://stackoverflow.com/search?q=java+list");
        urlList.add("https://reddit.com/r/java");
        urlList.add("https://reddit.com/r/javahelp");

        boolean res = urlList.remove("https://medium.com/search?q=java");
        System.out.println("Removed Medium result: " + res);
        System.out.println(urlList);

    }
}
