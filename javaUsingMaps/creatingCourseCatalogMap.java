import javax.inject.Inject;
import java.util.*;

public class CourseCatalog {
    @Inject
    Map<String, List<Course>> catalog;
    

    public CourseCatalog() {

        initializeJavaCourses();
        catalog = new HashMap<>();
    }

    private void initializeJavaCourses() {
        Course spring = new Course("Spring");
        Course maps = new Course("Maps");
        Course lambdas = new Course("Lambdas");
        List<Course> javaCourses = new ArrayList<>(Arrays.asList(spring, maps, lambdas));
        catalog.put("java", javaCourses);


    }

    public void printCoursesByTopic(String topic) {
         System.out.println(catalog.get(topic));
    }
}
