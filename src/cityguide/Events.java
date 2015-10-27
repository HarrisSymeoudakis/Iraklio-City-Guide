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

public class Events extends JFrame {

    private JPanel p1, p2, p3, p4;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg;
    private JTextArea txt1, txt2, link,link1;
    private JButton b1, b2;
    private JLabel l1, l2;
    private Desktop desktop,desktop1;

    public Events() throws MalformedURLException, IOException {
        this.setName("Events");
        this.setTitle("Events");
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

        

        b1.addActionListener(new ActionListener() {

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

        b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

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

        l1 = new JLabel("Events");
        l1.setFont(l1.getFont().deriveFont(20.0f));
        l1.setForeground(Color.BLACK);

       

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        p3.add(rb1);
        p3.add(rb2);

        
        p4.add(b2);
        p4.add(b1);

        p2.add(l1);
        

        p1.add(txt1);
        p1.add(txt2);
        p1.add(link);
        p1.add(txt1);
        p1.add(link1);
        
        
        

        rb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("\n"+"Heraklion is an exciting city known for its energy, "+"\n"+"its people and its history. This history gives the city a heritage "+"\n"+"that few small cities in the world can approach. "+"\n"+"However, today, Heraklion is a town in the midst of yet more cultural change, "+"\n"+"growing in its sense of itself in the modern European context."+"\n"+"\n"+"A wealth of cultural events are organized every year,"+"\n"+"spaces have been allocated to young artists to exhibit their work and seminars, "+"\n"+"lectures and art workshops are on the increase offering to citizens "+"\n"+"and visitors alike authentic cultural experiences.");
                txt1.setFont(txt1.getFont().deriveFont(17.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);

                
                link.setText(null);
                link1.setText(null);
                
                


            }
        });

        rb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setText("\n" + "click on url for more information on Heraklion events" + "\n");
                txt1.setFont(txt1.getFont().deriveFont(20.0f));
                txt1.setForeground(Color.BLACK);
                txt1.setBackground(new Color(165, 228, 237));
                txt1.setEditable(false);

                txt2.setText(null);
                
                link.setText(null);

                link1.setText("\n" + "http://www.heraklion.gr/en/ourplace/cultural-events/cultural-events.html");
                link1.setFont(link1.getFont().deriveFont(17.0f));
                link1.setForeground(Color.BLUE);
                link1.setEditable(false);
                link1.setBackground(new Color(165, 228, 237));

                link1.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        openLinkThalassa(URI.create("http://www.heraklion.gr/en/ourplace/cultural-events/cultural-events.html"));
                        openLinkThalassa1(URI.create(null));
                        
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
    
    public void openLinkThalassa1(URI urii1) {


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
