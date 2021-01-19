package catalog;

import java.util.ArrayList;
import java.util.List;

public class SearchCriteria implements Feature {

    public String title;
    public String contributor;

    public String createByBoth(String title, String contributor) {
        return title + contributor;
    }

    public String createByContributor(String contributor) {
        return contributor;
    }

    public String createByTitle(String title) {
        return title;
    }

    public boolean hasTitle() {
        return 0 < title.length();
    }

    public boolean hasContributor() {
        return 0 < contributor.length();
    }

    public String getContributor() {
        return contributor;
    }

    @Override
    public List<String> getContributors() {
        List<String> contributorsLIst = new ArrayList<>();
        if (0 < contributor.length()) {
            contributorsLIst.add(contributor);
        }
        return contributorsLIst;
    }

    public String getTitle() {
        return title;
    }
}
