/**
 * <p>Qualitaets- und UnterstuetzungsAgentur - Landesinstitut fuer Schule, Materialien zum schulinternen Lehrplan Informatik SII</p>
 * *
 * @version 2014-03-13
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.EmptyBorder;

public class View extends JFrame {

    private JPanel contentPane;
    private Controller controller;

    public View() {
        setTitle("Quizspiel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 440, 430);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        /**
         * Login prompt
         */

        boolean loggedIn = false;
        while (!loggedIn) {
            loggedIn = showLoginPrompt(this);
        }

        /**
         * Main GUI
         */

        JLabel lblQuestionTitle = new JLabel("Quizfrage:");
        lblQuestionTitle.setBounds(20, 20, 100, 16);
        contentPane.add(lblQuestionTitle);

        JLabel lblQuestionText = new JLabel("Frage erscheint hier");
        lblQuestionText.setBounds(20, 30, 400, 52);
        lblQuestionText.setFont(new Font("Dialog", Font.BOLD, 24));
        contentPane.add(lblQuestionText);

        JLabel lblAnswersTitle = new JLabel("Deine Antwortmöglichkeiten:");
        lblAnswersTitle.setBounds(20, 100, 250, 16);
        contentPane.add(lblAnswersTitle);

        JButton btnAnswer1 = new JButton("Antwortmöglichkeit 1");
        btnAnswer1.setBounds(20, 120, 400, 25);
        contentPane.add(btnAnswer1);

        JButton btnAnswer2 = new JButton("Antwortmöglichkeit 2");
        btnAnswer2.setBounds(20, 150, 400, 25);
        contentPane.add(btnAnswer2);

        JButton btnAnswer3 = new JButton("Antwortmöglichkeit 3");
        btnAnswer3.setBounds(20, 180, 400, 25);
        contentPane.add(btnAnswer3);

        JButton btnAnswer4 = new JButton("Antwortmöglichkeit 4");
        btnAnswer4.setBounds(20, 210, 400, 25);
        contentPane.add(btnAnswer4);

        JButton btnQuestionDetails = new JButton("Details Anzeigen");
        btnQuestionDetails.setBounds(20, 250, 195, 25);
        contentPane.add(btnQuestionDetails);

        JButton btnNextQuestion = new JButton("Nächste Frage");
        btnNextQuestion.setBounds(225, 250, 195, 25);
        contentPane.add(btnNextQuestion);
        
        JLabel lblStatsTitle = new JLabel("Statistiken von <nutzername>:");
        lblStatsTitle.setBounds(20, 315, 300, 16);
        contentPane.add(lblStatsTitle);

        JLabel lblStatsText = new JLabel("<%> aller Fragen richtig beantwortet");
        lblStatsText.setBounds(20, 320, 400, 52);
        lblStatsText.setFont(new Font("Dialog", Font.BOLD, 18));
        contentPane.add(lblStatsText);

        JLabel lblStatsSubtext = new JLabel("Insgesamt hast du <var> von <var> Fragen richtig.");
        lblStatsSubtext.setBounds(20, 355, 400, 16);
        contentPane.add(lblStatsSubtext);

        JPanel pnlStatsBg = new JPanel();
        pnlStatsBg.setBounds(0, 300, 440, 100);
        pnlStatsBg.setBackground(Color.lightGray);
        contentPane.add(pnlStatsBg);
    }

    public boolean showLoginPrompt(final JFrame frame) {
        String userName = (String)JOptionPane.showInputDialog(
               frame,
               "Gebe deinen Nutzernamen ein", 
               "Quizspiel Auth",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "user"
        );

        String userPass = (String)JOptionPane.showInputDialog(
               frame,
               "Gebe dein Passwort ein", 
               "Quizspiel Auth",            
               JOptionPane.PLAIN_MESSAGE,
               null,            
               null, 
               "pass"
        );

        return true;
    }

    public void setController(
    Controller controller) {
        this.controller = controller;
    }
}
