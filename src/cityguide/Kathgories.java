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

public class Kathgories extends JFrame {

    private JPanel p1, p2, p3;
    private JButton l1, l2, l3, l4, l5, l6;
    private JButton b1, b2;
    private JLabel l7;

    public Kathgories() throws MalformedURLException, IOException {

        this.setName("Κατηγορίες");
        this.setTitle("Κατηγορίες");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setBackground(new Color(165, 228, 237));
        p2.setBackground(new Color(165, 228, 237));
        p3.setBackground(new Color(165, 228, 237));

        URL url = new URL("https://lh3.googleusercontent.com/QoSiTS8-3PhGjKim_-iHUhHSiIxoxkIUiSnPI8d2Cw=w151-h150-no");
        Image image = ImageIO.read(url);

        URL url1 = new URL("https://lh3.googleusercontent.com/zYmJukPrgpFtbg-P3xB_niT-M2BNVmJE4o8BNKrYIQ=w150-h152-no");
        Image image1 = ImageIO.read(url1);

        URL url2 = new URL("https://lh3.googleusercontent.com/ks1LQAwXu7d0FKZWn1m6SP37bePxeYUvWUg3RjGTWA=s151-no");
        Image image2 = ImageIO.read(url2);

        URL url3 = new URL("https://lh3.googleusercontent.com/f-LN0ACOw88tY3MYHwLj5QAmatjm8fk-jiJRZD6Thw=w150-h151-no");
        Image image3 = ImageIO.read(url3);

        URL url4 = new URL("https://lh3.googleusercontent.com/mQH8_7o_tseJxA7mJVOw_dhI7-Rh2iTVN_PUW93QWw=w150-h152-no");
        Image image4 = ImageIO.read(url4);

        URL url5 = new URL("https://lh3.googleusercontent.com/PRZPThTm1uI3qZhE8BLyB-LCFHOY2q95PsCtDVoJJg=w151-h150-no");
        Image image5 = ImageIO.read(url5);

        URL url6 = new URL("https://lh3.googleusercontent.com/GWsLRgZMuMkiUQpbu_waG5KbqtgaMDbMk9mzXzSP3U0=s50-no");
        Image image6 = ImageIO.read(url6);

        URL url7 = new URL("https://lh3.googleusercontent.com/sxE54oEYFoy9VuJSnWJ1qBix8Py5acThbeoRBtLfpZk=s50-no");
        Image image7 = ImageIO.read(url7);



        b1 = new JButton(new ImageIcon(image6));
        b1.setPreferredSize(new Dimension(50, 50));
        b1.setBackground(new Color(165, 228, 237));

        b2 = new JButton(new ImageIcon(image7));
        b2.setPreferredSize(new Dimension(50, 50));
        b2.setBackground(new Color(165, 228, 237));



        l7 = new JLabel("Κατηγορίες");
        l7.setFont(l7.getFont().deriveFont(20.0f));
        l7.setForeground(Color.BLACK);


        l1 = new JButton(new ImageIcon(image));
        l1.setPreferredSize(new Dimension(170, 171));
        l1.setBackground(new Color(165, 228, 237));

        l2 = new JButton(new ImageIcon(image1));
        l2.setPreferredSize(new Dimension(170, 171));
        l2.setBackground(new Color(165, 228, 237));

        l3 = new JButton(new ImageIcon(image2));
        l3.setPreferredSize(new Dimension(170, 171));
        l3.setBackground(new Color(165, 228, 237));

        l4 = new JButton(new ImageIcon(image3));
        l4.setPreferredSize(new Dimension(170, 171));
        l4.setBackground(new Color(165, 228, 237));

        l5 = new JButton(new ImageIcon(image4));
        l5.setPreferredSize(new Dimension(170, 171));
        l5.setBackground(new Color(165, 228, 237));

        l6 = new JButton(new ImageIcon(image5));
        l6.setPreferredSize(new Dimension(170, 171));
        l6.setBackground(new Color(165, 228, 237));

        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.SOUTH);

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    HomePage hp = new HomePage();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
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

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p2.add(l7);
        p3.add(b2);
        p3.add(b1);

        l1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Oikogeneia oik = new Oikogeneia();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PotoFagito poto = new PotoFagito();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Ekdilwseis ekd = new Ekdilwseis();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        l2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Athlimata athl = new Athlimata();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
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

        l3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Istoria isto = new Istoria();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Paralies par = new Paralies();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Kathgories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });


        this.setVisible(true);
        this.setResizable(false);
    }

    public void myDispose() {
        this.dispose();
    }
}
