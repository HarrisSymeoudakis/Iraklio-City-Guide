package cityguide;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Family extends JFrame {

    private JPanel p1, p2, p3;
    private JButton b1, b2;
    private JButton l1, l2, l3, l4;
    private JLabel l9;

    public Family() throws MalformedURLException, IOException {
        this.setName("Family");
        this.setTitle("Family");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();


        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.SOUTH);


        URL url = new URL("https://lh3.googleusercontent.com/czvvAdpM-b96_NmKl6WPSw6Svvy-9K0lPm-95O0tQfY=w231-h156-no");
        Image image = ImageIO.read(url);

        URL url1 = new URL("https://lh3.googleusercontent.com/HugObsroM-rECGoOkWmChxMovCYw8-O0cbOH3QWHojc=w233-h154-no");
        Image image1 = ImageIO.read(url1);

        URL url2 = new URL("https://lh3.googleusercontent.com/SwXX8FqiDVMor3JcpxuCo8jEPSxAS-J6Tbb5jWSE8D8=w232-h154-no");
        Image image2 = ImageIO.read(url2);

        URL url3 = new URL("https://lh3.googleusercontent.com/PVySwCf8Ejn8YqMeZXHlN7dIp3KcVYjRIIYyktRXDAc=w231-h155-no");
        Image image3 = ImageIO.read(url3);

        URL url6 = new URL("https://lh3.googleusercontent.com/GWsLRgZMuMkiUQpbu_waG5KbqtgaMDbMk9mzXzSP3U0=s50-no");
        Image image6 = ImageIO.read(url6);

        URL url7 = new URL("https://lh3.googleusercontent.com/sxE54oEYFoy9VuJSnWJ1qBix8Py5acThbeoRBtLfpZk=s50-no");
        Image image7 = ImageIO.read(url7);



        b1 = new JButton(new ImageIcon(image6));
        b1.setPreferredSize(new Dimension(50,50));
        b1.setBackground(new Color(165, 228, 237));

        b2 = new JButton(new ImageIcon(image7));
        b2.setPreferredSize(new Dimension(50,50));
        b2.setBackground(new Color(165, 228, 237));



        p1.setBackground(new Color(165, 228, 237));
        p2.setBackground(new Color(165, 228, 237));
        p3.setBackground(new Color(165, 228, 237));

        l1 = new JButton(new ImageIcon(image));
        l1.setPreferredSize(new Dimension(231, 155));
        l1.setBackground(new Color(165, 228, 237));

        l2 = new JButton(new ImageIcon(image1));
        l2.setPreferredSize(new Dimension(231, 155));
        l2.setBackground(new Color(165, 228, 237));

        l3 = new JButton(new ImageIcon(image2));
        l3.setPreferredSize(new Dimension(231, 155));
        l3.setBackground(new Color(165, 228, 237));

        l4 = new JButton(new ImageIcon(image3));
        l4.setPreferredSize(new Dimension(231, 155));
        l4.setBackground(new Color(165, 228, 237));

        l9 = new JLabel("Family");
        l9.setFont(l9.getFont().deriveFont(20.0f));
        l9.setForeground(Color.BLACK);

        p3.add(b2);
        p3.add(b1);
        p2.add(l9);

        p1.add(l1);

        p1.add(l2);

        p1.add(l3);

        p1.add(l4);

//        GridLayout layout = new GridLayout(2, 2);
//        p1.setLayout(layout);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Categories cat = new Categories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Family.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Family.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                myDispose();
            }
        });
        
        l1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Aquarium aqua = new Aquarium();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Oikogeneia.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Oikogeneia.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Dynosauria dyno = new Dynosauria();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Oikogeneia.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Oikogeneia.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        
        l2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    WaterPark water = new WaterPark();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Family.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Family.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LunaPark luna = new LunaPark();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Family.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Family.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });


        this.setVisible(true);
        this.setResizable(true);
    }

    public void myDispose() {
        this.dispose();
    }
}
