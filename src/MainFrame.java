import javax.swing.JFrame;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

import KapalFactory.Galangan;
import KapalFactory.KapalFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    KapalFactory factory = new KapalFactory();
	Galangan galangan = new Galangan(factory);
    JTextField tfTipeKapal;

    public void initialize(){
        // Title Panel
        JLabel lbTitle = new JLabel("Galangan Kapal");

        // Form panel
        JLabel lbKapalType = new JLabel("Tipe Kapal");
        tfTipeKapal = new JTextField();

        JLabel lbList = new JLabel("");

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));
        formPanel.add(lbKapalType);
        formPanel.add(tfTipeKapal);
        formPanel.add(lbList);
        
        // Button Panel
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String tipe = tfTipeKapal.getText();
                galangan.orderKapal(tipe);
                tfTipeKapal.setText("");
            } 
        });

        JButton btnShowAll = new JButton("List");
        btnShowAll.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String list = galangan.showKapal();
                System.out.println(list);
                lbList.setText(list);
            }

        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1,2,5,5));
        buttonsPanel.add(btnSubmit);
        buttonsPanel.add(btnShowAll);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.CENTER);
        mainPanel.add(lbTitle, BorderLayout.NORTH);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);

        setTitle("Kapal");
        setSize(500, 600);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }
}
