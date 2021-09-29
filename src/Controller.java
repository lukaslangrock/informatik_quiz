/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * *
 * @version 2014-03-13
 */

public class Controller {
    private View view;

    public Controller() {
        view = new View();
        view.setController(this);
        view.setVisible(true);
    }

    // beispiel

    public boolean checkLogin(String pUsername, String pPassword)
    {
        return true;
    }

    public String getUsername() {
        return "Hans Günther";
    }

    public String getNextQuestion() {
        return "Beispielfrage";
    }

    public String getAnswer1() {
        return "Beispiel 1";
    }

    public String getAnswer2() {
        return "Beispiel 2";
    }

    public String getAnswer3() {
        return "Beispiel 3";
    }

    public String getAnswer4() {
        return "Beispiel 4";
    }

    public int getRightAnswer() {
        return 2;
    }

    public boolean checkAnswer(int answer) {
        if (answer == 2) {
            markAnswer(true);
            return true;
        } else {
            markAnswer(false);
            return false;
        }
    }

    public void markAnswer(boolean isCorrect) {
        
    }

    public int getStatsPercent() {
        return 75;
    }

    public int getStatsCorrect() {
        return 45;
    }

    public int getSTatsTotalQuestions() {
        return 60;
    }

    public static void main(String[] args) {
        new Controller();
    }
}
