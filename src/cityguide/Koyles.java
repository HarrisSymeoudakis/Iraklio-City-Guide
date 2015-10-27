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

public class Koyles extends JFrame {

    private JPanel p1, p2, p3, p4;
    private JRadioButton rb1, rb2, rb3;
    private ButtonGroup bg;
    private JTextArea txt1, txt2,link1, link2, link3;
    private JButton b1, b2, b3;
    private JLabel l1, l2;
    private Desktop desktop, desktop1, desktop2;
    

    public Koyles() throws MalformedURLException, IOException {
        this.setName("Κούλες");
        this.setTitle("Κούλες");
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
                    Istoria istor = new Istoria();
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
                    Kathgories kat = new Kathgories();
                } catch (MalformedURLException ex) {
                    Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(WaterSports.class.getName()).log(Level.SEVERE, null, ex);
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
        rb3 = new JRadioButton("Ιστορία");
        rb3.setFont(rb3.getFont().deriveFont(17.0f));
        rb3.setForeground(Color.BLACK);
        rb3.setBackground(new Color(165, 228, 237));

        txt1 = new JTextArea();
        txt2 = new JTextArea();

        l1 = new JLabel("Ιστορία   ");
        l1.setFont(l1.getFont().deriveFont(20.0f));
        l1.setForeground(Color.BLACK);

        l2 = new JLabel("  Κούλες");
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
                txt1.setText("Το ενετικό φρούριο Κούλες δεσπόζει στην είσοδο"+"\n"+"του ενετικού λιμανιού στο Ηράκλειο. "+"\n"+"Οι Ενετοί το αποκαλούσαν (Castello a Mare ή Rocca a Mare), "+"\n"+"αλλά σήμερα διατηρεί την "+"\n"+"τούρκικη ονομασία του, Κούλες από το Su Kulesi. "+"\n"+"Είναι από τα πιο οικεία και αγαπημένα"+"\n"+"μνημεία της πόλης, σύμβολο του Ηρακλείου."+"\n"+"Σήμερα το φρούριο Κούλες ατενίζει αγέρωχο "+"\n"+"το Κρητικό πέλαγος θυμίζοντας "+"\n"+"το μεγαλείο του ενετικού Χάνδακα, ενώ στοιχειώνεται από θρύλους "+"\n"+"που θέλουν στους εσωτερικούς υγρούς και σκοτεινούς του"+"\n"+"χώρους να βασανίστηκαν φριχτά οι Κρητικοί επαναστάτες."+"\n"+"\n"+"Δείτε επίσης: "+"\n");
                txt1.setFont(txt1.getFont().deriveFont(17.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);

                link1.setText("http://www.explorecrete.com/Heraklion/GR17-Heraklion-koules.html");
                link1.setFont(link1.getFont().deriveFont(17.0f));
                link1.setForeground(Color.BLUE);
                link1.setBackground(new Color(165, 228, 237));
                link1.setEditable(false);



                link2.setText(null);
                link3.setText(null);

                link1.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLink(URI.create("http://www.explorecrete.com/Heraklion/GR17-Heraklion-koules.html"));
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
                txt1.setText("\n" + "                  Τοποθεσία του Κούλε:                " + "\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                link2.setText("https://www.google.gr/maps/place/koules+heraklion/data=!"+"\n"+"4m2!3m1!1s0x0:0x2e587cb6d37e38f7?sa="+"\n"+"X&ved=0CDcQrwswBGoVChMIvMmksd-DxwIVC1wUCh3brw3W");
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
                        openLink1(URI.create("https://www.google.gr/maps/place/koules+heraklion/data=!4m2!3m1!1s0x0:0x2e587cb6d37e38f7?sa=X&ved=0CDcQrwswBGoVChMIvMmksd-DxwIVC1wUCh3brw3W"));
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
                txt1.setText("Το πρώτο φρούριο χτίστηκε πιθανότατα κατά την αραβική περίοδο (9ος-10ος αι.)."+"\n"+"Μεσα του 14ου το μπαρούτι έκανε την εμφάνισή του στην Ευρώπη."+"\n"+"Ήρθε να παίξει τόσο σημαντικό ρόλο στην πολεμική τεχνοτροπία, αλλάζοντας ριζικά "+"\n"+"τη στρατιωτική επιστήμη, αντικαθιστώντας τις προϋπάρχουσες πολεμικές μηχανές και"+"\n"+"εκμηδένισε την αμυντική δυνατότητα των παλιών οχυρώσεων."+"\n"+"Έτσι στα μέσα του 15ου αιώνα βρήκαν το Ηράκλειο ανεπαρκώς οχυρωμένο"+"\n"+"και τον πύργο του λιμανιού, άχρηστο για τους σκοπούς της υπεράσπισης."+"\n"+"Η γερουσία της Βενετίας το 1462 ενέκρινε ένα ευρύ πρόγραμμα οχύρωσης της πόλης,"+"\n"+"το οποίο θα προστάτευε το Ηράκλειο και τα προάστια έξω από αυτό"+"\n"+"Ως μέρος αυτού του έργου, το λιμάνι πύργος κατεδαφίστηκε το 1523 και"+"\n"+"αντικαθίσταται από το φρούριο Κούλες, που σώζεται έως σήμερα."+"\n"+"Το έργο εξελίχθηκε με έναν πολύ ενδιαφέροντα τρόπο:"+"\n"+"Παλαιά πλοία φορτώθηκαν με πέτρες από το"+"\n"+"νησί Ντία και τοποθετήθηκαν στα ανοικτά της βόρειας "+"\n"+"πλευράς του μόλου, δημιουργόντας ένα κυματοθραύστη"+"\n"+"αυξάνοντας τον διαθέσιμο χώρο. ");

                txt1.setFont(txt1.getFont().deriveFont(15.0f));
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
