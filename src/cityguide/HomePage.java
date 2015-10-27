package cityguide;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePage extends JFrame {

    private JPanel p1, p2, p3;
    private JButton b1, b2, b3;
    private JLabel l1, l2, l3;

    public HomePage() throws MalformedURLException, IOException {

        this.setName("home page");
        this.setTitle("Home Page");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        URL url = new URL("https://lh3.googleusercontent.com/UUR0K69TrnIDLCtw9kIEtmE5wYQoiYxOBK-brqBdWw=w638-h427-no");
        Image image = ImageIO.read(url);

        URL url1 = new URL("https://lh3.googleusercontent.com/ufE4gwBxApUovktpFB8ilWnLbW6m-ZFtyPBJu33UR4c=w39-h46-no");
        Image image1 = ImageIO.read(url1);

        URL url2 = new URL("https://lh3.googleusercontent.com/4MIJKCW9uI_dL4JKxgGAFBVt12Snsl0q_EVIweh1Jh0=w39-h46-no");
        Image image2 = ImageIO.read(url2);

        URL url3 = new URL("https://lh3.googleusercontent.com/mGPjlmhNfMTrR0rUENPfr_L57vIOhWT3Jk-Af1EB2p4=w37-h39-no");
        Image image3 = ImageIO.read(url3);

        p1.setBackground(new Color(165, 228, 237));
        p2.setBackground(new Color(165, 228, 237));
        p3.setBackground(new Color(165, 228, 237));

        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.SOUTH);

        ImageIcon image0 = new ImageIcon("/Documents and Settings/Owner/Desktop/untitled.JPG");
        // ImageIcon image1 = new ImageIcon("/Documents and Settings/Owner/Desktop/untitled2.jpg");
        //  ImageIcon image2 = new ImageIcon("/Documents and Settings/Owner/Desktop/untitled3.jpg");

        b1 = new JButton(new ImageIcon(image1));
        b1.setPreferredSize(new Dimension(42,44));
        b1.setBackground(new Color(165, 228, 237));

        b2 = new JButton(new ImageIcon(image2));
        b2.setPreferredSize(new Dimension(42,44));
        b2.setBackground(new Color(165, 228, 237));

        b3 = new JButton(new ImageIcon(image3));
        b3.setPreferredSize(new Dimension(42,44));
        b3.setBackground(new Color(165, 228, 237));

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Categories cat = new Categories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                myDispose();
            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Kathgories kat = new Kathgories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });


        //  Icon icon = new ImageIcon("/Documents and Settings/Owner/Desktop/arxikh_logotupo.jpg");
        l1 = new JLabel(new ImageIcon(image));

        p1.add(l1);
        p2.add(b1);
        p2.add(b2);
        p3.add(b3);



        this.setVisible(true);
        this.setResizable(false);



    }

    public void myDispose() {
        this.dispose();
    }
}
