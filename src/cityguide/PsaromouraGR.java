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

public class PsaromouraGR extends JFrame {

    private JPanel p1, p2, p3, p4;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg;
    private JTextArea txt1, txt2, link,link1;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private Desktop desktop,desktop1;

    public PsaromouraGR() throws MalformedURLException, IOException {
        this.setName("Ψαρομούρα");
        this.setTitle("Ψαρομούρα");
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
                     Paralies par = new Paralies();
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
                     Kathgories kat = new Kathgories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(AthlimataThalassa.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(AthlimataThalassa.class.getName()).log(Level.SEVERE, null, ex);
                }
                myDispose();
            }
        });

        rb1 = new JRadioButton("Πληροφορίες");
        rb1.setFont(rb1.getFont().deriveFont(17.0f));
        rb1.setBackground(new Color(165, 228, 237));
        rb1.setForeground(Color.BLACK);
        rb2 = new JRadioButton("Τοποθεσία");
        rb2.setFont(rb2.getFont().deriveFont(17.0f));
        rb2.setForeground(Color.BLACK);
        rb2.setBackground(new Color(165, 228, 237));

        txt1 = new JTextArea();
        txt2 = new JTextArea();

        l1 = new JLabel("Παραλίες   ");
        l1.setFont(l1.getFont().deriveFont(20.0f));
        l1.setForeground(Color.BLACK);

        l2 = new JLabel("  Ψαρομούρα");
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
                txt1.setText("Βρίσκεται στην περιοχή της Αγίας Πελαγίας. "+"\n"+"Πρόκειται για μία μικρή ήσυχη και "+"\n"+"απάνεμη παραλία που ενώ είναι "+"\n"+"τόσο κοντά στο Ηράκλειο και είναι πάντα καθαρή. "+"\n"+"Για να πας στην Ψαρομούρα κατευθύνεσαι από Ηράκλειο για "+"\n"+"Αγία Πελαγία αλλά κατεβαίνεις από την δεύτερη είσοδο. "+"\n"+"Η θέα από εκεί πάνω είναι καταπληκτική! "+"\n"+"Συνεχίζεις τις στροφές και λίγο πριν φτάσεις στο "+"\n"+"ξενοδοχείο Capsis έχει ένα μικρό δρόμο αριστερά. "+"\n"+"\n"+"Δείτε επίσης:"+"\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);

                link.setText(null);
                
                link1.setText("https://www.facebook.com/PsaromouraBeach/timeline");
                link1.setFont(link1.getFont().deriveFont(18.0f));
                link1.setForeground(Color.BLUE);
                link1.setBackground(new Color(165, 228, 237));
                link1.setEditable(false);
                
                link1.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLinkThalassa(URI.create("https://www.facebook.com/PsaromouraBeach/timeline"));
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
                txt1.setText("\n" + "      Τοποθεσία για την Ψαρομούρα στον χάρτη:    " + "\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);
                
                link1.setText(null);

                link.setText("\n" + "https://www.google.gr/maps/place/Psaromoura+"+"\n"+"Residence/@35.412629,25.016281,15z/data"+"\n"+"=!4m2!3m1!1s0x0:0x71705d43af30fcb8");
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
