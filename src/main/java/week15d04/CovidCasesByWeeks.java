package week15d04;

public class CovidCasesByWeeks implements Comparable<CovidCasesByWeeks> {

    private String week;
    private int cases;

    public CovidCasesByWeeks(String week, int cases) {
        this.week = week;
        this.cases = cases;
    }

    public String getWeek() {
        return week;
    }

    public int getCases() {
        return cases;
    }

    @Override
    public String toString() {
        return "CoronaCasesByWeeks{" +
                "week='" + week + '\'' +
                ", cases=" + cases +
                '}';
    }

    @Override
    public int compareTo(CovidCasesByWeeks o) {
        return o.cases - this.cases;
    }
}
