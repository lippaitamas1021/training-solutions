package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers) {
        Trainer searchedTrainer = null;
        int maxAge = 0;
        for (Trainer trainer : trainers) {
            if (maxAge < trainer.getAge()) {
                maxAge = trainer.getAge();
                searchedTrainer = trainer;
            }
        }
        return searchedTrainer;
    }
}
