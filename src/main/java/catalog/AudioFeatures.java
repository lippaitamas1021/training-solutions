package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {

    private String title;
    private int length;
    private List<String> performers;
    private List<String> composer = new ArrayList<>();

    public AudioFeatures(String title, int length, List<String> performers) {
        if (("").equals(title)) {
            throw new IllegalArgumentException("Title must be completed");
        }
        this.title = title;
        if (length < 0) {
            throw new IllegalArgumentException("Length must be over zero");
        }
        this.length = length;
        if (performers.size() == 0) {
            throw new IllegalArgumentException("Performer must be completed");
        }
        this.performers = new ArrayList<>(performers);
        this.composer = new ArrayList<>(composer);
    }

    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {
        if (("").equals(title)) {
            throw new IllegalArgumentException("Title must be completed");
        }
        this.title = title;
        if (length < 0) {
            throw new IllegalArgumentException("Length must be over zero");
        }
        this.length = length;
        if (performers.size() == 0) {
            throw new IllegalArgumentException("Performer must be completed");
        }
        this.performers = new ArrayList<>(performers);
        if (composer.size() == 0) {
            throw new IllegalArgumentException("Composer must be completed");
        }
        this.composer = new ArrayList<>(composer);
    }

    public int getLength() {
        return length;
    }

    public List<String> getContributors() {
        List<String> contributorsLIst = new ArrayList<>();
        if (0 < composer.size()) {
            contributorsLIst.add(String.valueOf(composer));
        }
        if (0 < performers.size()) {
            contributorsLIst.add(String.valueOf(performers));
        }
        return contributorsLIst;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getComposer() {
        return new ArrayList<>(composer);
    }

    public List<String> getPerformers() {
        return new ArrayList<>(performers);
    }
}


