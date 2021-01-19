package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {
        if (("").equals(title)) {
            throw new IllegalArgumentException("Empty title");
        } else {
            this.title = title;
        }
        if (numberOfPages < 1) {
            throw new IllegalArgumentException("Wrong number of pages");
        } else {
            this.numberOfPages = numberOfPages;
        }
        if (authors == null) {
            throw new IllegalArgumentException("No authors given");
        } else {
            this.authors = authors;
        }
    }

    public List<String> getContributors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() { return numberOfPages; }
}


