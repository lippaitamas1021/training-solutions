package catalog;

import java.util.ArrayList;;
import java.util.List;

public class CatalogItem extends Catalog implements Feature {

    private List<Feature> features = new ArrayList<>();
    private String registrationNumber;
    private int length;
    private int price;
    
    public CatalogItem(String registrationNumber, int length, AudioFeatures audioFeatures, PrintedFeatures printedFeatures, AudioFeatures features) {
        this.registrationNumber = registrationNumber;
        this.length = length;
    }

    public CatalogItem(String registrationNumber, int length, PrintedFeatures printedFeatures) {
        this.registrationNumber = registrationNumber;
        this.length = length;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public int getPrice() {
        return this.price;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public int fullLengthAtOneItem() {
        return this.length;
    }

    @Override
    public List<String> getContributors() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public boolean hasAudioFeature() {
       if (Features.AUDIO.HasAudioFeature()) {
           return true;
       }
       return false;
    }

    public boolean hasPrintedFeature() {
        if (Features.PRINTED.HasAudioFeature()) {
            return true;
        }
        return false;
    }

    public int numberOfPagesAtOneItem() {
        return this.length;
    }
}


