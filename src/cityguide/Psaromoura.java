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

public class Psaromoura extends JFrame {

    private JPanel p1, p2, p3, p4;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg;
    private JTextArea txt1, txt2, link,link1;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private Desktop desktop,desktop1;

    public Psaromoura() throws MalformedURLException, IOException {
        this.setName("Psaromoura");
        this.setTitle("Psaromoura");
        this.setSize(700, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        desktop = Desktop.getDesktop();
        desktop1 = Desktop.getDesktop();

        link = new JTextArea();
        link1 = new JTextArea();

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
                     Beaches beach = new Beaches();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(AthlimataThalassa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AthlimataThalassa.class.getName()).log(Level.SEVERE, null, ex);
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
                    Logger.getLogger(AthlimataThalassa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AthlimataThalassa.class.getName()).log(Level.SEVERE, null, ex);
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

        txt1 = new JTextArea();
        txt2 = new JTextArea();

        l1 = new JLabel("Beaches   ");
        l1.setFont(l1.getFont().deriveFont(20.0f));
        l1.setForeground(Color.BLACK);

        l2 = new JLabel("  Psaromoura");
        l2.setFont(l2.getFont().deriveFont(17.0f));
        l2.setForeground(Color.BLACK);

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        p3.add(rb1);
        p3.add(rb2);

        p4.add(b3);
        p4.add(b2);
        p4.add(b1);

        p2.add(l1);
        p2.add(l2);

        p1.add(txt1);
        p1.add(txt2);
        p1.add(link);
        
        p1.add(link1);
        

        rb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("Psaromoura beach is located north of Heraklion city, "+"\n"+"Crete Island and about 500 meters from Agia Pelagia. "+"\n"+"It is rather small, with sand, pebbles and some rocks "+"\n"+"and it is a preferred destination for the "+"\n"+"weekend by the locals.Umbrellas are available on this beach. "+"\n"+"However, it is not protected from the north winds. "+"\n"+"To reach it, you would need to continue on the road to Capsis "+"\n"+"Hotel and then ask for further directions."+"\n"+"\n"+"   for more info check also:"+"\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);

                link.setText(null);
                
                link1.setText("https://www.facebook.com/Psaromoura/info?tab=page_info");
                link1.setFont(link1.getFont().deriveFont(18.0f));
                link1.setForeground(Color.BLUE);
                link1.setBackground(new Color(165, 228, 237));
                link1.setEditable(false);
                
                link1.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLinkThalassa(URI.create("https://www.facebook.com/Psaromoura/info?tab=page_info"));
                        openLinkThalassa2(URI.create(null));
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
                txt1.setText("\n" + "      Location of Psaromoura on map:    " + "\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);
                
                link1.setText(null);

                link.setText("\n" + "https://www.google.gr/maps/place/Psaromoura+Residence/@35."+"\n"+"412629,25.016281,15z/data=!4m2!3m1!1s0x0:0x71705d43af30fcb8");
                link.setFont(link.getFont().deriveFont(19.0f));
                link.setForeground(Color.BLUE);
                link.setEditable(false);
                link.setBackground(new Color(165, 228, 237));

                link.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLinkThalassa2(URI.create("https://www.google.gr/maps/place/Psaromoura+Residence/@35.412629,25.016281,15z/data=!4m2!3m1!1s0x0:0x71705d43af30fcb8"));
                        openLinkThalassa(URI.create(null));
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
        GridLayout layout = new GridLayout(0, 1);
        p3.setLayout(layout);

        this.setVisible(true);
        this.setResizable(false);
    }

    public void myDispose() {
        this.dispose();

    }

    public void openLinkThalassa(URI urii) {


        if (desktop != null) {

            try {
                desktop.browse(urii);
            } catch (MalformedURLException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

    }
    
     public void openLinkThalassa2(URI urii1) {


        if (desktop1 != null) {

            try {
                desktop1.browse(urii1);
            } catch (MalformedURLException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
            }


        }

    }
}
