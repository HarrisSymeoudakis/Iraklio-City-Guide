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
import javax.swing.*;

public class PotoFagito extends JFrame {

    private JPanel p1, p2, p3;
    private JButton l1, l2, l3, l4, l5, l6, l7, l8;
    private JButton b1, b2;
    private JLabel l9;

    public PotoFagito() throws MalformedURLException, IOException {
        this.setName("Ποτό & Φαγητό");
        this.setTitle("Ποτό & Φαγητό");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.SOUTH);



        URL url = new URL("https://lh3.googleusercontent.com/UoR2u0YiR5I1Icihnncm7CETAW6kHbUFu6eYTUNgDxg=w234-h157-no");
        Image image = ImageIO.read(url);

        URL url1 = new URL("https://lh3.googleusercontent.com/jC33wWp_7lFxQw8DALyb9MmnjAFsCmy_H46SRMCVSMo=w234-h157-no");
        Image image1 = ImageIO.read(url1);

        URL url2 = new URL("https://lh3.googleusercontent.com/xT_cHWQ4R8vSPuv8dZB6p9jAylAQc9_jEKGN09uUKgA=w234-h157-no");
        Image image2 = ImageIO.read(url2);

        URL url3 = new URL("https://lh3.googleusercontent.com/Bfo6B96oz87LAOeYawMzXUrzWUYT98eooF_SBZjb8PI=w234-h157-no");
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
        l1.setPreferredSize(new Dimension(233, 156));
        l1.setBackground(new Color(165, 228, 237));

        l2 = new JButton(new ImageIcon(image1));
        l2.setPreferredSize(new Dimension(233, 156));
        l2.setBackground(new Color(165, 228, 237));

        l3 = new JButton(new ImageIcon(image2));
        l3.setPreferredSize(new Dimension(233, 156));
        l3.setBackground(new Color(165, 228, 237));

        l4 = new JButton(new ImageIcon(image3));
        l4.setPreferredSize(new Dimension(233, 156));
        l4.setBackground(new Color(165, 228, 237));

        l9 = new JLabel("Ποτό & Φαγητό");
        l9.setFont(l9.getFont().deriveFont(20.0f));
        l9.setForeground(Color.BLACK);

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                myDispose();
            }
        });

        p3.add(b2);
        p3.add(b1);
        p2.add(l9);

        p1.add(l3);
        p1.add(l4);
        p1.add(l1);
        p1.add(l2);

        
        
        l2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LigoKrasiGR ligokrasi = new LigoKrasiGR();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        l3.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    PeskesiGR peskes = new PeskesiGR();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        l1.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    PlotoGR ploton = new PlotoGR();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        l4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    MareGR mare = new MareGR();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Kathgories kat = new Kathgories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Athlimata.class.getName()).log(Level.SEVERE, null, ex);
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
