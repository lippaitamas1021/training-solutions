package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (isDateCorrect(post.getPublishedAt()) && isNotBlank(post.getTitle()) && isNotBlank(post.getContent())
                    && post.getOwner().equals(user)) {
                result.add(post);
            }
        }
        return result;
    }

    public boolean isNotBlank(String string) {
        return string != null && !string.isBlank();
    }

    public boolean isDateCorrect(LocalDate localDate) {
        return localDate.isBefore(LocalDate.now());
    }

    public static void main(String[] args) {
        List<Post> posts = new ArrayList<>(List.of(
                new Post("T360", LocalDate.of(2020,2, 12), "courses", "LT"),
                new Post("JAVA", LocalDate.of(2020,2,11), "methods", "Trey Parker"),
                new Post("IDEA", LocalDate.of(2020,2,10), "tests", "Mila Kunis")));
        PostFinder postFinder = new PostFinder(posts);
        System.out.println(postFinder.findPostFor("Mila Kunis"));
    }
}
