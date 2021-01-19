package catalog;

public enum Features {
    AUDIO(true), PRINTED(false);

    private boolean hasAudioFeature;

    Features(boolean hasAudioFeature) {
        this.hasAudioFeature = hasAudioFeature;
    }

    public boolean HasAudioFeature() {
        return hasAudioFeature;
    }
}
