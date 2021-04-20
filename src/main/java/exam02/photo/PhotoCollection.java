package exam02.photo;

import java.util.ArrayList;
import java.util.List;

public class PhotoCollection {

    private List<Photo> photos = new ArrayList<>();

    public List<Photo> getPhotos() {
        return photos;
    }

    public void addPhoto(String... photoName) {
        for (String photo : photoName) {
            photos.add(new Photo(photo));
        }
    }

    public void starPhoto(String photoName, Quality quality) {
        if (!photos.contains(new Photo(photoName))) {
            throw new PhotoNotFoundException("Photo not found");
        }
        for (Photo photo : photos) {
            if (photo.getName().equals(photoName)) {
                photo.setQuality(quality);
            }
        }
    }

    public int numberOfStars() {
        int sum = 0;
        for (Photo photo : photos) {
            sum += photo.getQuality().getNumberOfStars();
        }
        return sum;
    }
}
