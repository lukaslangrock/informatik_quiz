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
        setBounds(100, 100, 450, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

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
    }

    public void setController(
    Controller controller) {
        this.controller = controller;
    }
}
