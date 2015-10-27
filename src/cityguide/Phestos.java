package cityguide;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Phestos extends JFrame {

    private JPanel p1, p2, p3, p4;
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup bg;
    private JTextArea txt1, txt2, link1, link2, link3;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private Desktop desktop, desktop1, desktop2;

    public Phestos() throws MalformedURLException, IOException {
        this.setName("Phaistos");
        this.setTitle("Phaistos");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        desktop = Desktop.getDesktop();
        desktop1 = Desktop.getDesktop();
        desktop2 = Desktop.getDesktop();

        link1 = new JTextArea();
        link2 = new JTextArea();
        link3 = new JTextArea();

        p1.setBackground(new Color(165, 228, 237));
        p2.setBackground(new Color(165, 228, 237));
        p3.setBackground(new Color(165, 228, 237));
        p4.setBackground(new Color(165, 228, 237));

        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.WEST);
        this.add(p4, BorderLayout.SOUTH);



        URL url6 = new URL("https://lh3.googleusercontent.com/GWsLRgZMuMkiUQpbu_waG5KbqtgaMDbMk9mzXzSP3U0=s50-no");
        Image image6 = ImageIO.read(url6);

        URL url7 = new URL("https://lh3.googleusercontent.com/sxE54oEYFoy9VuJSnWJ1qBix8Py5acThbeoRBtLfpZk=s50-no");
        Image image7 = ImageIO.read(url7);

        URL url8 = new URL("https://lh3.googleusercontent.com/3A6YIwIVP6xzpRfglXGEU2QvzZsN4bJyBA8IAJmJBXY=s50-no");
        Image image8 = ImageIO.read(url8);




        b1 = new JButton(new ImageIcon(image6));
        b1.setPreferredSize(new Dimension(50,50));
        b1.setBackground(new Color(165, 228, 237));

        b2 = new JButton(new ImageIcon(image7));
        b2.setPreferredSize(new Dimension(50,50));
        b2.setBackground(new Color(165, 228, 237));

        b3 = new JButton(new ImageIcon(image8));
        b3.setPreferredSize(new Dimension(50,50));
        b3.setBackground(new Color(165, 228, 237));

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    History hist = new History();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
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

        b3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Categories cat = new Categories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        rb1 = new JRadioButton("Info");
        rb1.setFont(rb1.getFont().deriveFont(17.0f));
        rb1.setBackground(new Color(165, 228, 237));
        rb1.setForeground(Color.BLACK);
        rb2 = new JRadioButton("Location");
        rb2.setFont(rb2.getFont().deriveFont(17.0f));
        rb2.setForeground(Color.BLACK);
        rb2.setBackground(new Color(165, 228, 237));
        rb3 = new JRadioButton("History");
        rb3.setFont(rb3.getFont().deriveFont(17.0f));
        rb3.setForeground(Color.BLACK);
        rb3.setBackground(new Color(165, 228, 237));

        txt1 = new JTextArea();
        txt2 = new JTextArea();



        l1 = new JLabel("History   ");
        l1.setFont(l1.getFont().deriveFont(20.0f));
        l1.setForeground(Color.BLACK);

        l2 = new JLabel("  Phaistos");
        l2.setFont(l2.getFont().deriveFont(17.0f));
        l2.setForeground(Color.BLACK);

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        p3.add(rb1);
        p3.add(rb2);
        p3.add(rb3);

        p4.add(b3);
        p4.add(b2);
        p4.add(b1);

        p2.add(l1);
        p2.add(l2);

        p1.add(txt1);
        p1.add(link1);
        p1.add(txt2);
        p1.add(link2);
        p1.add(txt2);
        p1.add(link3);


        rb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("\n" + "The palace of Phaistos (Faestos, Phaestos, Faistos)" + "\n" + "commands the Messara plain from its location on a low hill," + "\n" + "and it is the second largest palace of Crete after Knossos." + "\n" + "The site was inhabited since the late neolithic era with several " + "\n" + "well organized settlements on the hill and " + "\n" + "the surrounding area, " + "\n" + "and the first palace was built around 2000 BC. " + "\n" + "Excavations have unearthed a rich historical strata," + "\n" + "and some ruins date back to neolithic times."+"\n"+"\n"+"            check also:"+"\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);

                link1.setText("http://www.destinationcrete.gr/en/archaeological-sites/" + "\n" + "irakleio-archaeological-sites/archaiologikoschoros-faistou");
                link1.setFont(link1.getFont().deriveFont(19.0f));
                link1.setForeground(Color.BLUE);
                link1.setBackground(new Color(165, 228, 237));
                link1.setEditable(false);



                link2.setText(null);
                link3.setText(null);

                link1.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLink(URI.create("http://www.destinationcrete.gr/en/archaeological-sites/irakleio-archaeological-sites/archaiologikoschoros-faistou"));
                        openLink1(URI.create(null));
                        openLink2(URI.create(null));
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
            }
        });

        rb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("\n" + "                  Location of Phaistos:                ");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                link2.setText("https://www.google.gr/maps/place/%CE%A6%CE%B" + "\n" + "1%CE%B9%CF%83%CF%84%CF%8C%CF%82/" + "\n" + "@35.0715463,24.8358626,11z/data=!3m1!4b1!4m2!" + "\n" + "3m1!1s0x149b1e97bc489515:0xbca06763b7a49d7a                                  " + "\n");
                link2.setFont(link2.getFont().deriveFont(13.0f));
                link2.setForeground(Color.BLUE);
                link2.setBackground(new Color(165, 228, 237));
                link2.setEditable(false);

                txt2.setText("\n" + "           street view:     ");
                txt2.setFont(txt2.getFont().deriveFont(20.0f));
                txt2.setForeground(Color.BLACK);
                txt2.setBackground(new Color(165, 228, 237));
                txt2.setEditable(false);

                link1.setText(null);

                link3.setText("https://www.google.gr/maps/place/%CE%A6%CE%" + "\n" + "B1%CE%B9%CF%83%CF%84%CF%8C%CF%82/" + "\n" + "@35.083608,24.738177,3a,75y,108h,90t/data=!3m7!1e1!3m5!1sB1BwBzrr44YskfFm_" + "\n" + "5SdpQ!2e0!6s%2F%2Fgeo0.ggpht.com%2Fcbk%3Fcb_client%3" + "\n" + "Dmaps_sv.tactile%26output%3Dt" + "\n" + "humbnail%26thumb%3D2%26panoid%3DB1BwBzrr44" + "\n" + "YskfFm_5SdpQ%26w%3D224%26h%3D75%26yaw%" + "\n" + "3D108%26pitch%3D0%26thumbfov%3D120%26ll%3D3" + "\n" + "5.083608,24.738177!7i13312!8i6656!4m2!3m1!1s0x149b1e97bc489515:" + "\n" + "0xbca06763b7a49d7a!6m1!1e1");
                link3.setFont(link3.getFont().deriveFont(13.0f));
                link3.setForeground(Color.BLUE);
                link3.setBackground(new Color(165, 228, 237));
                link3.setEditable(false);

                link2.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLink1(URI.create("https://www.google.gr/maps/place/%CE%A6%CE%B1%CE%B9%CF%83%CF%84%CF%8C%CF%82/@35.0715463,24.8358626,11z/data=!3m1!4b1!4m2!3m1!1s0x149b1e97bc489515:0xbca06763b7a49d7a"));
                        openLink(URI.create(null));
                        openLink2(URI.create(null));
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

                link3.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLink2(URI.create("https://www.google.gr/maps/place/%CE%A6%CE%B1%CE%B9%CF%83%CF%84%CF%8C%CF%82/@35.083608,24.738177,3a,75y,108h,90t/data=!3m7!1e1!3m5!1sB1BwBzrr44YskfFm_5SdpQ!2e0!6s%2F%2Fgeo0.ggpht.com%2Fcbk%3Fcb_client%3Dmaps_sv.tactile%26output%3Dthumbnail%26thumb%3D2%26panoid%3DB1BwBzrr44YskfFm_5SdpQ%26w%3D224%26h%3D75%26yaw%3D108%26pitch%3D0%26thumbfov%3D120%26ll%3D35.083608,24.738177!7i13312!8i6656!4m2!3m1!1s0x149b1e97bc489515:0xbca06763b7a49d7a!6m1!1e1"));
                        openLink1(URI.create(null));
                        openLink(URI.create(null));
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


            }
        });



        rb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("The first palace of Phaistos was built in circa 2000 BC." + "\n" + "Its mythical founder was Minos himself and" + "\n" + " its first king was his brother Radamanthys." + "\n" + "In 1700 BC a strong earthquake destroyed the palace," + "\n" + "which was rebuilt almost immediately. " + "\n" + "However, Phaistos was no longer the administrative centre of the area, " + "\n" + "an honour which passed to neighbouring Agia Triada. " + "\n" + "Phaistos continued to be the religious and cult" + "\n" + "centre of south Crete.In 1450 BC there was another great catastrophe," + "\n" + "not only in Phaistos but across the whole of Crete. " + "\n" + "The city of Phaistos recovered from the destruction, " + "\n" + "minted its own coins and continued to flourish " + "\n" + "for the next few centuries until the first century BC," + "\n" + "when it was destroyed by neighbouring Gortys.");
                txt1.setFont(txt1.getFont().deriveFont(17.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);
                txt2.setFont(txt2.getFont().deriveFont(18.0f));
                txt2.setForeground(Color.BLUE);
                txt2.setBackground(new Color(165, 228, 237));
                txt2.setEditable(false);

                link1.setText(null);
                link2.setText(null);
                link3.setText(null);

            }
        });



        GridLayout layout = new GridLayout(0, 1);
        p3.setLayout(layout);

        this.setVisible(true);
        this.setResizable(false);
    }

    public void myDispose() {
        this.dispose();
    }

    public void openLink(URI uri) {
        if (desktop != null) {

            try {
                desktop.browse(uri);
            } catch (MalformedURLException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

    }

    public void openLink1(URI uri1) {
        if (desktop1 != null) {

            try {
                desktop1.browse(uri1);
            } catch (MalformedURLException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

    }

    public void openLink2(URI uri2) {
        if (desktop2 != null) {

            try {
                desktop2.browse(uri2);
            } catch (MalformedURLException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

    }
}
