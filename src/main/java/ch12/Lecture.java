package ch12;


import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private int pass;
    private String title;
    private List<Integer> scores = new ArrayList<>();

    public Lecture( String title,int pass, List<Integer> scores) {
        this.pass = pass;
        this.title = title;
        this.scores = scores;
    }

    public double average(){
        return scores.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public List<Integer> getScores() {
        return scores;
    }

    public String evaluate(){
        return String.format("Pass:%d Faill:%d",passCount(),failCount());
    }

    public long passCount(){
        return scores.stream().filter(score -> score >= pass).count();
    }

    public long failCount(){
        return scores.size() - passCount();
    }

    // self,super 에 메시지를 전송하는것
    public String stats(){
        return String.format("Title: %s, Evaluation Method: %s",title,getEvaluationMethod());
    }

    public String getEvaluationMethod(){
        return "Pass or Fail";
    }

}
