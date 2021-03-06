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

public class Heraklion extends JFrame {

    private JPanel p1, p2, p3, p4;
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup bg;
    private JTextArea txt1, txt2, link1, link2, link3;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private Desktop desktop, desktop1, desktop2;

    public Heraklion() throws MalformedURLException, IOException {
        this.setName("Heraklion");
        this.setTitle("Heraklion");
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
        b1.setPreferredSize(new Dimension(50, 50));
        b1.setBackground(new Color(165, 228, 237));

        b2 = new JButton(new ImageIcon(image7));
        b2.setPreferredSize(new Dimension(50, 50));
        b2.setBackground(new Color(165, 228, 237));

        b3 = new JButton(new ImageIcon(image8));
        b3.setPreferredSize(new Dimension(50, 50));
        b3.setBackground(new Color(165, 228, 237));

        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    History his = new History();
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

        rb1 = new JRadioButton("info");
        rb1.setFont(rb1.getFont().deriveFont(17.0f));
        rb1.setBackground(new Color(165, 228, 237));
        rb1.setForeground(Color.BLACK);
        rb2 = new JRadioButton("location");
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

        l2 = new JLabel("  Heraklion");
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
                txt1.setText("Iraklion is the largest urban centre in Crete,"+"\n"+"the capital of the region and the economic centre "+"\n"+"of the island. The first European civilisation, "+"\n"+"the Minoan civilisation, flourished on this land 5000 years ago. "+"\n"+"Currently the population of the municipality of Heraklion "+"\n"+"is approximately 150.000 people. "+"\n"+"It is a very dynamic and cosmopolitan town, "+"\n"+"particularly during the summer period when "+"\n"+"thousands of visitors can be seen shopping in the market "+"\n"+"or visiting the museums and other places of interest. "+"\n"+"During the last 20 years the city has made also a remarkable "+"\n"+"progress in the academic and technologicalfields."+"\n"+"Heraklion lies along the North coast of the island, having to the west "+"\n"+"at about 80 km the town of Rethymnon and at 135 km the city of Hania."+"\n"+"\n"+"     check also:");
                txt1.setFont(txt1.getFont().deriveFont(17.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);

                link1.setText("http://www.interkriti.org/crete/iraklion/heraklion_city.html");
                link1.setFont(link1.getFont().deriveFont(19.0f));
                link1.setForeground(Color.BLUE);
                link1.setBackground(new Color(165, 228, 237));
                link1.setEditable(false);



                link2.setText(null);
                link3.setText(null);

                link1.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLink(URI.create("http://www.interkriti.org/crete/iraklion/heraklion_city.html"));
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
                txt1.setText("\n" + "                  Location of Heraklion Center / Liontaria Square:                " + "\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                link2.setText("https://www.google.gr/maps/place/%CE%9B%CE%95"+"\n"+"%CE%9F%CE%9D%CE%A4%CE%9F%CE%93%CE%9B%CE%9F%CE%A5,"+"\n"+"+%CE%91%CE%9D%CE%94%CE%A1%CE%95"+"\n"+"%CE%91%CE%A3,+%26+%CE%A3"+"\n"+"%CE%99%CE%91+%CE%95."+"\n"+"%CE%95.%22MELBA+SALT+%26+"+"\n"+"SUGAR%22/@35.339301,25.133221,15z/data=!4m2!3"+"\n"+"m1!1s0x0:0xd09eef372b1df4b2");
                link2.setFont(link2.getFont().deriveFont(17.0f));
                link2.setForeground(Color.BLUE);
                link2.setBackground(new Color(165, 228, 237));
                link2.setEditable(false);

                txt2.setText(null);
                txt2.setEditable(false);

                link1.setText(null);

                link3.setText(null);

                link2.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLink1(URI.create("https://www.google.gr/maps/place/%CE%9B%CE%95%CE%9F%CE%9D%CE%A4%CE%9F%CE%93%CE%9B%CE%9F%CE%A5,+%CE%91%CE%9D%CE%94%CE%A1%CE%95%CE%91%CE%A3,+%26+%CE%A3%CE%99%CE%91+%CE%95.%CE%95.%22MELBA+SALT+%26+SUGAR%22/@35.339301,25.133221,15z/data=!4m2!3m1!1s0x0:0xd09eef372b1df4b2"));
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



            }
        });



        rb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Heraklion is close to the ruins of the palace of Knossos, "+"\n"+"which in Minoan times was the largest centre of population on Crete. "+"\n"+"Though there is no archaeological evidence of it, "+"\n"+"Knossos may well have had a port at the site of Heraklion as early as 2000 BC."+"\n"+"The present city of Heraklion was founded in 824 by the Saracens who had been "+"\n"+"expelled from Al-Andalus by Emir Al-Hakam I and had taken "+"\n"+"over the island from the Eastern Roman Empire. "+"\n"+"They built a moat around the city for protection, "+"\n"+"and named the city ربض الخندق,(\"Castle of the Moat\"). "+"\n"+"The Saracens allowed the port to be used as a safe haven for pirates "+"\n"+"who operated against Imperial shipping and raided Imperial "+"\n"+"territory around the Aegean.  "+"\n"+"In 961, Byzantine forces under the command of Nikephoros Phokas, "+"\n"+"later to become Emperor, landed in Crete and attacked the city. "+"\n"+"After a prolonged siege, the city fell. "+"\n"+"The Saracen inhabitants were slaughtered, "+"\n"+"the city looted and burned to the ground. "+"\n"+"Soon rebuilt, the town was renamed Χάνδαξ, Chandax, "+"\n"+"and remained under Greek control for the next 243 years.");

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
