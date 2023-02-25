import java.util.ArrayList;

public class Manager {
    private ArrayList<Candidate> allCandidates;
    private ArrayList<Candidate> sortedCandidates;
    private ArrayList<Candidate> chosenCandidates;
    private int[] questionsList;
    public static final int NUM_QUESTIONS = 0;
    public Manager(boolean isFirstCounty) {

        allCandidates = new ArrayList<>();
        sortedCandidates = new ArrayList<>();
        chosenCandidates = new ArrayList<>();

        if (isFirstCounty) {
            //First data set
        }
        else{
            //Second data set
        }
        //Initialize questions
    }

    public ArrayList<Candidate> getAllCandidates() {
        return allCandidates;
    }
    public ArrayList<Candidate> getSortedCandidates() {
        return sortedCandidates;
    }
    public ArrayList<Candidate> getChosenCandidates() {
        return chosenCandidates;
    }

    public void addToChosen(Candidate c) {
        chosenCandidates.add(0, c);
    }
    public void removeFromChosen(Candidate c) {
        chosenCandidates.remove(c);
    }
    public void submitQuiz(int[] values) {
        for (int i = 0; i < NUM_QUESTIONS; i++) {
            questionsList[i] = values[i];
        }
        return;
    }

}
