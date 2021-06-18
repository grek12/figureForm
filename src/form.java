import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form extends JFrame{
    private JPanel panel1;
    private JButton krugBut;
    private JButton prymoygbut;
    private JButton ellipsBut;
    private JButton kvBut;
    private JButton cleanBut;
    private JPanel printPanel;
    private JButton allPrintBut;
    private JButton exitBut;


    public form(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        setSize(600, 500);
        panel1.setPreferredSize(new Dimension(800, 600));
        getRootPane().setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        krugBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Circle circle = new Circle(100,100,50);
                circle.show();
                circle.MoveTo(120,120);
                circle.paint(getGraphics() );


            }
        });
        cleanBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printPanel.repaint();
            }
        });
        prymoygbut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
/*
            Rect rect = new Rect(50,50,100,150);

            rect.show();
                rect.MoveTo(120,120);
                rect.paint(getGraphics());

 */

                Rect rect= new Rect(50,50,100,150);

                rect.show();
                rect.MoveTo(120,120);
                rect.paint(getGraphics());

            }
        });
        ellipsBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ellips ellips = new Ellips(200,200,100,90 );
                ellips.show();
                ellips.MoveTo(20,20);
                ellips.paint(getGraphics());
            }
        });
        kvBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Square square = new Square(100,100,50);
                square.show();
                square.MoveTo(120,120);
                square.paint(getGraphics());
            }
        });
        prymoygbut.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                repaint();
            }
        });
        krugBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                repaint();
            }
        });
        ellipsBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                repaint();
            }
        });
        kvBut.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                repaint();
            }
        });

        allPrintBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Square square = new Square(100,100,50);
                square.show();
                square.MoveTo(120,120);
                square.paint(getGraphics());
                Rect rect= new Rect(50,50,100,150);
                rect.show();
                rect.MoveTo(120,120);
                rect.paint(getGraphics());
                Ellips ellips = new Ellips(200,200,100,90 );
                ellips.show();
                ellips.MoveTo(20,20);
                ellips.paint(getGraphics());
                Circle circle = new Circle(100,100,50);
                circle.show();
                circle.MoveTo(120,120);
                circle.paint(getGraphics() );
            }
        });
        exitBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame frame = new form("Фигуры");
        frame.setVisible(true);
    }}