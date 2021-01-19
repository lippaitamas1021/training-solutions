package catalog;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    public List<CatalogItem> catalogItems = new ArrayList<>();

    public Catalog(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public Catalog() {
    }




    public void addItem(CatalogItem catalogItem1) {
        catalogItems.add(catalogItem1);
    }

    public void deleteItemByRegistrationNumber(String registrationNUmber) {
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.getRegistrationNumber().equals(registrationNUmber)) {
                catalogItems.remove(catalogItem);
            }
        }
    }

    public List<CatalogItem> getAudioLibraryItems() {
        List<CatalogItem> audioItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                audioItems.add(catalogItem);
            }
        }
        return audioItems;
    }

    public List<CatalogItem> getPrintedLibraryItems() {
        List<CatalogItem> printedItems = new ArrayList<>();
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                printedItems.add(catalogItem);
            }
        }
        return printedItems;
    }

    public int getAllPageNumber() {
        int sum = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasPrintedFeature()) {
                sum += catalogItem.numberOfPagesAtOneItem();
            }
        }
        return sum;
    }

    public int getFullLength() {
        int result = 0;
        for (CatalogItem catalogItem : catalogItems) {
            if (catalogItem.hasAudioFeature()) {
                result += catalogItem.fullLengthAtOneItem();
            }
        }
        return result;
    }

    public int averagePageNumberOver(int i) {
        return 0;
    }

}
