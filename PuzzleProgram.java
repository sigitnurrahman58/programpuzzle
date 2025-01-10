import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//buat objek program
class PuzzleProgram extends JFrame implements ActionListener {

    //buat tombol
    private JButton[] puzzleButtonsArray = new JButton[12];
    private JButton[] bottomButtons = new JButton[12];
    private JButton selectedButton;
    private JLabel l4;
    
    // inisialisasi gambar
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, sample, klik, next, close;
    JButton p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12;

    //inisialisasi variabel(gambar 1)
    Icon ic1 = new ImageIcon("pic/4.gif");
    Icon ic2 = new ImageIcon("pic/5.gif");
    Icon ic3 = new ImageIcon("pic/2.gif");
    Icon ic4 = new ImageIcon("pic/12.gif");
    Icon ic5 = new ImageIcon("pic/1.gif");
    Icon ic6 = new ImageIcon("pic/11.gif");
    Icon ic7 = new ImageIcon("pic/8.gif");
    Icon ic8 = new ImageIcon("pic/9.gif");
    Icon ic9 = new ImageIcon("pic/3.gif");
    Icon ic10 = new ImageIcon("pic/7.gif");
    Icon ic11 = new ImageIcon("pic/10.gif");
    Icon ic12 = new ImageIcon("pic/6.gif");
    
    //inisialisasi variabel(gambar2)
    Icon ic13 = new ImageIcon("pic/19.gif");
    Icon ic14 = new ImageIcon("pic/22.gif");
    Icon ic15 = new ImageIcon("pic/13.gif");
    Icon ic16 = new ImageIcon("pic/16.gif");
    Icon ic17 = new ImageIcon("pic/24.gif");
    Icon ic18 = new ImageIcon("pic/14.gif");
    Icon ic19 = new ImageIcon("pic/21.gif");
    Icon ic20 = new ImageIcon("pic/18.gif");
    Icon ic21 = new ImageIcon("pic/15.gif");
    Icon ic22 = new ImageIcon("pic/20.gif");
    Icon ic23 = new ImageIcon("pic/23.gif");
    Icon ic24 = new ImageIcon("pic/17.gif");

    //inisialisasi variabel(gambar3)
    Icon ic25 = new ImageIcon("pic/34.gif");
    Icon ic26 = new ImageIcon("pic/26.gif");
    Icon ic27 = new ImageIcon("pic/32.gif");
    Icon ic28 = new ImageIcon("pic/25.gif");
    Icon ic29 = new ImageIcon("pic/36.gif");
    Icon ic30 = new ImageIcon("pic/30.gif");
    Icon ic31 = new ImageIcon("pic/35.gif");
    Icon ic32 = new ImageIcon("pic/27.gif");
    Icon ic33 = new ImageIcon("pic/33.gif");
    Icon ic34 = new ImageIcon("pic/28.gif");
    Icon ic35 = new ImageIcon("pic/31.gif");
    Icon ic36 = new ImageIcon("pic/29.gif");

    //untuk petunjuk
    Icon tampil = new ImageIcon("pic/hint.gif");
    Icon tampil2 = new ImageIcon("pic/hint2.gif");
    Icon tampil3 = new ImageIcon("pic/hint3.gif");

    private boolean isTampil1 = true;
    private boolean isTampil2 = false;
    private boolean isTampil3 = false;

    //deklarasi class
    PuzzleProgram() {
        super("Pic Puzzle by kelompok 16");
        
        puzzleButtonsArray[0] = b1 = new JButton(ic1);
        puzzleButtonsArray[1] = b2 = new JButton(ic2);
        puzzleButtonsArray[2] = b3 = new JButton(ic3);
        puzzleButtonsArray[3] = b4 = new JButton(ic4);
        puzzleButtonsArray[4] = b5 = new JButton(ic5);
        puzzleButtonsArray[5] = b6 = new JButton(ic6);
        puzzleButtonsArray[6] = b7 = new JButton(ic7);
        puzzleButtonsArray[7] = b8 = new JButton(ic8);
        puzzleButtonsArray[8] = b9 = new JButton(ic9);
        puzzleButtonsArray[9] = b10 = new JButton(ic10);
        puzzleButtonsArray[10] = b11 = new JButton(ic11);
        puzzleButtonsArray[11] = b12 = new JButton(ic12);
        
        JLabel l1 = new JLabel("Pixel Isian Puzzle (drag and drop): ");
        l1.setBounds(10, 500, 200, 30);
        b1.setBounds(10, 530, 100, 100);
        b2.setBounds(110, 530, 100, 100);
        b3.setBounds(210, 530, 100, 100);
        b4.setBounds(310, 530, 100, 100);
        b5.setBounds(410, 530, 100, 100);
        b6.setBounds(510, 530, 100, 100);
        b7.setBounds(610, 530, 100, 100);
        b8.setBounds(710, 530, 100, 100);
        b9.setBounds(810, 530, 100, 100);
        b10.setBounds(910, 530, 100, 100);
        b11.setBounds(1010, 530, 100, 100);
        b12.setBounds(1110, 530, 100, 100);

        JLabel lTitle = new JLabel("==== SELAMAT DATANG DI PERMAINAN ====");
        lTitle.setBounds(10, 8, 300, 30);
        lTitle.setForeground(Color.RED);

        JLabel lTitle2 = new JLabel("PUZZLE SPIDERMAN");
        lTitle2.setBounds(73, 20, 300, 30);
        lTitle2.setForeground(Color.RED);

        JLabel lTitle3 = new JLabel("============ by. kelompok 16 =============");
        lTitle3.setBounds(10, 32, 300, 30);
        lTitle3.setForeground(Color.RED);

        //tampilan gui
        JLabel l2 = new JLabel("Papan Puzzle : ");
        l2.setBounds(10, 60, 200, 30);
        bottomButtons[0] = p1 = new JButton();
        p1.setBounds(10,90,100,100);
        bottomButtons[1] = p2 = new JButton();
        p2.setBounds(110,90,100,100);
        bottomButtons[2] = p3 = new JButton();
        p3.setBounds(210,90,100,100);
        bottomButtons[3] = p4 = new JButton();
        p4.setBounds(310,90,100,100);
        bottomButtons[4] =  p5 = new JButton();
        p5.setBounds(10,190,100,100);
        bottomButtons[5] =  p6 = new JButton();    
        p6.setBounds(110,190,100,100);
        bottomButtons[6] =  p7 = new JButton();
        p7.setBounds(210,190,100,100);
        bottomButtons[7] =  p8 = new JButton();
        p8.setBounds(310,190,100,100);
        bottomButtons[8] =  p9 = new JButton();
        p9.setBounds(10,290,100,100);
        bottomButtons[9] = p10 = new JButton();
        p10.setBounds(110,290,100,100);
        bottomButtons[10] = p11 = new JButton();
        p11.setBounds(210,290,100,100);
        bottomButtons[11] = p12 = new JButton();
        p12.setBounds(310,290,100,100);
        

        //tampilan button
        for (JButton puzzleButton : puzzleButtonsArray) {
            puzzleButton.setTransferHandler(new TransferHandler("icon"));
            puzzleButton.addMouseListener(new DragMouseAdapter());
        }

        for (JButton bottomButton : bottomButtons) {
            bottomButton.setTransferHandler(new TransferHandler("icon"));
            bottomButton.addActionListener(this);
        }

        JLabel l3 = new JLabel("Gambar Asli : ");
        l3.setBounds(600, 30, 200, 30);
        sample = new JButton();
        sample.setBounds(600, 60, 450, 317);

        close = new JButton("Sembunyikan");
        close.setBounds(930, 380, 120,30);

        klik = new JButton("Periksa");
        klik.setBounds(600, 380, 120, 30);

        next = new JButton("Gambar Selanjutnya");
        next.setBounds(1010, 450, 200, 50);

        l4 = new JLabel("HARUS PERIKSA TERLEBIH DAHULU");
        l4.setBounds(560, 410, 210, 30);
        l4.setForeground(Color.red);
        l4.setVisible(false);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(lTitle);
        add(lTitle2);
        add(lTitle3);
        add(klik);
        add(next);
        add(close);
        add(sample);

        add(p1);
        add(p2);
        add(p3);
        add(p4);
        add(p5);
        add(p6);
        add(p7);
        add(p8);
        add(p9);
        add(p10);
        add(p11);
        add(p12);

        setLayout(null);
        setSize(1250, 950);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        sample.addActionListener(this);
        next.addActionListener(this);
        klik.addActionListener(this);
        close.addActionListener(this);
    }


    //drag and drop
    class DragMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            selectedButton = button;
            TransferHandler handler = button.getTransferHandler();
            handler.exportAsDrag(button, e, TransferHandler.COPY);
        }
    }


    //deklarasi class abstrak
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectedButton) {
            selectedButton = null;
        } else {
            for (int i = 0; i < bottomButtons.length; i++) {
                if (e.getSource() == bottomButtons[i]) {
                    if (selectedButton != null) {
                        bottomButtons[i].setIcon(selectedButton.getIcon());
                        selectedButton.setIcon(null);
                        selectedButton = null;
                    }
                    break;
                }
            }
        }

        if (e.getSource() == klik) {
            if (isTampil1) {
                sample.setIcon(tampil);
            } else if (isTampil2) {
                sample.setIcon(tampil2);
            } else if (isTampil3) {
                sample.setIcon(tampil3);
            }
        }

        if (e.getSource() == next) {
            Icon s1 = sample.getIcon();
            if (s1 == null) {
                l4.setVisible(true);
            } else if (s1 == tampil3) {
                l4.setVisible(false);

                isTampil1 = true;
                isTampil2 = false;
                isTampil3 = false;

                b1.setIcon(ic1);
                b2.setIcon(ic2);
                b3.setIcon(ic3);
                b4.setIcon(ic4);
                b5.setIcon(ic5);
                b6.setIcon(ic6);
                b7.setIcon(ic7);
                b8.setIcon(ic8);
                b9.setIcon(ic9);
                b10.setIcon(ic10);
                b11.setIcon(ic11);
                b12.setIcon(ic12);
                sample.setIcon(tampil);
                
            } else if (s1 == tampil) {
                l4.setVisible(false);

                isTampil1 = false;
                isTampil2 = true;
                isTampil3 = false;

                b1.setIcon(ic13);
                b2.setIcon(ic14);
                b3.setIcon(ic15);
                b4.setIcon(ic16);
                b5.setIcon(ic17);
                b6.setIcon(ic18);
                b7.setIcon(ic19);
                b8.setIcon(ic20);
                b9.setIcon(ic21);
                b10.setIcon(ic22);
                b11.setIcon(ic23);
                b12.setIcon(ic24);
                sample.setIcon(tampil2);
            } else if (s1 == tampil2) {
                l4.setVisible(false);

                isTampil1 = false;
                isTampil2 = false;
                isTampil3 = true;

                b1.setIcon(ic25);
                b2.setIcon(ic26);
                b3.setIcon(ic27);
                b4.setIcon(ic28);
                b5.setIcon(ic29);
                b6.setIcon(ic30);
                b7.setIcon(ic31);
                b8.setIcon(ic32);
                b9.setIcon(ic33);
                b10.setIcon(ic34);
                b11.setIcon(ic35);
                b12.setIcon(ic36);
                sample.setIcon(tampil3);
            }
        }

        if (e.getSource() == close) {
            sample.setIcon(null);
        }
    }
    


    //run class puzzle program
    public static void main(String[] args) {
        new PuzzleProgram();
    }
}
