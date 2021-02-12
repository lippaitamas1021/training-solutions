package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class PostFinderTest {

    @Test
    void findPostForTest() {
        List<Post> posts = new ArrayList<>(List.of(
                new Post("T360", LocalDate.of(2020,2, 12), "courses", "LT"),
                new Post("JAVA", LocalDate.of(2020,2,11), "methods", "Trey Parker"),
                new Post("IDEA", LocalDate.of(2020,2,10), "tests", "Mila Kunis")));
        PostFinder postFinder = new PostFinder(posts);
        assertEquals(1, postFinder.findPostFor("Mila Kunis").size());
        assertEquals("JAVA", postFinder.findPostFor("Trey Parker").get(0).getTitle());
        assertEquals("courses", postFinder.findPostFor("LT").get(0).getContent());
    }
}