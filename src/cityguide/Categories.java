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

public class Categories extends JFrame {

    private JPanel p1, p2, p3;
    private JButton l1, l2, l3, l4, l5, l6;
    private JButton b1, b2;
    private JLabel l7;

    public Categories() throws MalformedURLException, IOException {

        this.setName("Categories");
        this.setTitle("Categories");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setBackground(new Color(165, 228, 237));
        p2.setBackground(new Color(165, 228, 237));
        p3.setBackground(new Color(165, 228, 237));

        URL url = new URL("https://lh3.googleusercontent.com/uNU0UtA5S3mmaLjn64WkRreNa9wm4KDoEzVOGk4OTQ=w151-h152-no");
        Image image = ImageIO.read(url);

        URL url1 = new URL("https://lh3.googleusercontent.com/ziP0v3oIlzuZeddG9YpVViSUcoFsN0ub4U6P4kKccA=s150-no");
        Image image1 = ImageIO.read(url1);

        URL url2 = new URL("https://lh3.googleusercontent.com/lbaTkXAKyysx1yR6WkK-kf9rZlr_-WYPSJC_rHwv_Q=w151-h152-no");
        Image image2 = ImageIO.read(url2);

        URL url3 = new URL("https://lh3.googleusercontent.com/Nrq-272OQC55dTg_ptG9b-Th7CGk0D4yayBTwEeZ0g=w150-h151-no");
        Image image3 = ImageIO.read(url3);

        URL url4 = new URL("https://lh3.googleusercontent.com/EWDM0L9jrxXM33NxKyXBhSUAVnTUYZQGufzeq6qaGQ=w151-h152-no");
        Image image4 = ImageIO.read(url4);

        URL url5 = new URL("https://lh3.googleusercontent.com/UpjwbzybSnkHmNoidcYnHGS3pBtrK3wMGpbGPp-dJQ=w150-h152-no");
        Image image5 = ImageIO.read(url5);

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


        l7 = new JLabel("Categories");
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

        l1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Family fam = new Family();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FoodCafe food = new FoodCafe();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        
        l6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Events event = new Events();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });
        
        l4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Beaches beach = new Beaches();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.SOUTH);

        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p3.add(b2);
        p3.add(b1);
        p2.add(l7);

        l2.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Sports sp = new Sports();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
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

        l3.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    History his = new History();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
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

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    HomePage hp = new HomePage();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Categories.class.getName()).log(Level.SEVERE, null, ex);
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

//        GridLayout layout = new GridLayout(3, 3);
//        p1.setLayout(layout);

        this.setVisible(true);
        this.setResizable(false);
    }

    public void myDispose() {
        this.dispose();
    }
}
