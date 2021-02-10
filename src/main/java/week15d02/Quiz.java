package week15d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Quiz {
    
    private final List<Question> questions = new ArrayList<>();

    public List<Question> getQuestions() {
        return new ArrayList<>(questions);
    }

    public void readFile(String fileName) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String secondLine = bufferedReader.readLine();
                String[] parts = secondLine.split(" ");
                String answer = parts[0];
                int point = Integer.parseInt(parts[1]);
                String category = parts[2];
                questions.add(new Question(line, answer, point, category));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read the file", ioe);
        }
    }

    public List<String> questionsByCategory(String category) {
        List<String> result = new ArrayList<>();
        for (Question question : questions) {
            if (question.getCategory().equals(category)) {
                result.add(question.getQuestion());
            }
        }
        return result;
    }

    public Question randomQuestion(Random random) {
        int index = random.nextInt(questions.size());
        return questions.get(index);
    }

    public Map<String, List<Question>> allQuestionsByCategory() {
        Map<String, List<Question>> result = new HashMap<>();
        for (Question question : questions) {
            if (!result.containsKey(question.getCategory())) {
                result.put(question.getCategory(), new ArrayList<>());
            }
            result.get(question.getCategory()).add(question);
        }
        return result;
    }

    public String categoryWithMostPoints() {
        Map<String, List<Question>> toProcess = allQuestionsByCategory();
        String name = null;
        int max = 0;
        for (String s : toProcess.keySet()) {
            int count2 = countPoints(toProcess, s);
            if (max < count2) {
                max = count2;
                name = s;
            }
        }
        return name;
    }

    public int countPoints(Map<String, List<Question>> toProcess, String key) {
        int count2 = 0;
        for (Question question : toProcess.get(key)) {
            count2 += question.getPoint();
        }
        return count2;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        quiz.readFile("Questions.txt");
        System.out.println(quiz.allQuestionsByCategory());
        System.out.println(quiz.getQuestions());
    }
}
