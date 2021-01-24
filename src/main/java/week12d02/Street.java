package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sitesSold = new ArrayList<>();

    public List<FenceStatistic> fenceStatistics() {
        List<FenceStatistic> result = new ArrayList<>();

        for (Site site : sitesSold) {
            FenceStatistic returned = returnFenceIfContains(result, site.getFence());
            if (returned.getCount() == 1) {
                result.add(returned);
            } else {
                returned.increase();
            }
        }
        return result;
    }

    public FenceStatistic returnFenceIfContains(List<FenceStatistic> fenceStatistics, Fence fence) {
        for (FenceStatistic fenceStatistic : fenceStatistics) {
            if (fenceStatistic.getFence() == fence) {
                return fenceStatistic;
            }
        }
        return new FenceStatistic(fence);
    }

    public void sellSite(Site site) {
        sitesSold.add(site);
    }
}

