package week12d02;

public class Site {

    private int oddEven;
    private double length;
    private Fence fence;

    public Site(int addEven, double length, Fence fence) {
        this.oddEven = addEven;
        this.length = length;
        this.fence = fence;
    }

    public int getOddEven() {
        return oddEven;
    }

    public double getLength() {
        return length;
    }

    public Fence getFence() {
        return fence;
    }

//    public static void main(String[] args) {
//        Site s1 = new Site(2, 0, 10, Fence.PERFECT);
//        Site s2 = new Site(4, 0, 7, Fence.NEED_UPGRADE);
//        Site s3 = new Site(1, 1, 12, Fence.NEED_UPGRADE);
//        Site s4 = new Site(6, 0, 9, Fence.PERFECT);
//        Site s5 = new Site(8, 0, 11, Fence.NO_FENCE);
//        Site s6 = new Site(3, 1, 13, Fence.PERFECT);
//
//        List<Site> sitesSold = new ArrayList<>();
//        sitesSold.add(s1);
//        sitesSold.add(s2);
//        sitesSold.add(s3);
//        sitesSold.add(s4);
//        sitesSold.add(s5);
//        sitesSold.add(s6);
//    }
}