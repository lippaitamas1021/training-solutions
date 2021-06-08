package lambdaoptional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    public SocialNetwork(List<Member> members) {
        this.members = members;
    }
    
    public Optional<Member> findFirst(Predicate<Member> predicate) {
        for (Member member : members) {
            if (predicate.test(member)) {
                return Optional.of(member);
            }
        }
        return Optional.empty();
    }

    public Optional<Double> averageNumberOfSkills() {
        double sum = 0;
        for (Member member : members) {
            sum += member.getSkills().size();
        }
        if (sum == 0) {
            return Optional.empty();
        } else {
            return Optional.of(sum / members.size());
        }
    }
}
