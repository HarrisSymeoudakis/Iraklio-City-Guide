package cityguide;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
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

public class FoodCafe extends JFrame {

    private JPanel p1, p2, p3;
    private JButton b1, b2;
    private JButton l1, l2, l3, l4;
    private JLabel l9;
    public FoodCafe() throws MalformedURLException, IOException {
        this.setName("Food & Cafe");
        this.setTitle("Food & Cafe");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setPreferredSize(new Dimension(500, 300));

        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.SOUTH);



        URL url = new URL("https://lh3.googleusercontent.com/9dm0j2gVf_b10PvzNvwAeB_EN_ZcgQlMbXmldjnEeW8=w234-h157-no");
        Image image = ImageIO.read(url);

        URL url1 = new URL("https://lh3.googleusercontent.com/VhakbV1aJzV794o0sNv7UmSXZr5YU8XWIfq6SkpVMvk=w234-h157-no");
        Image image1 = ImageIO.read(url1);

        URL url2 = new URL("https://lh3.googleusercontent.com/9MDiyDvmpmNE1GWeL7AlDrdsS4EIKY-z_e715bagHkE=w234-h157-no");
        Image image2 = ImageIO.read(url2);

        URL url3 = new URL("https://lh3.googleusercontent.com/LsrsgjFsc3_Qa46mJlHbvaXRQmyj-bWcyQUneTRdW5Y=w234-h157-no");
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

        l9 = new JLabel("Food & Cafe");
        l9.setFont(l9.getFont().deriveFont(20.0f));
        l9.setForeground(Color.BLACK);

        p3.add(b2);
        p3.add(b1);
        p2.add(l9);

        p1.add(l3);

        p1.add(l4);

        p1.add(l1);

        p1.add(l2);


        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                myDispose();
            }
        });

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Categories cat = new Categories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        
        l2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    LigoKrasi ligo = new LigoKrasi();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l3.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Peskesi peskesi = new Peskesi();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
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
                    Ploto ploto = new Ploto();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
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
                    Mare mare = new Mare();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Sports.class.getName()).log(Level.SEVERE, null, ex);
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
