import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ItemDetailPanel extends JPanel {

    JButton buttonBack1 = new JButton("Back");
    JPanel panelDetailPayment1 = new JPanel();

    public ItemDetailPanel(){
        /* ================= Detail Information Page for the first Item ================= */
        this.setBounds(80, 130, 820, 560);
        this.setVisible(false);
        this.setLayout(null);
/*
        panelDetail1.setBorder(BorderFactory.createTitledBorder("panelDetail1"));
*/

        // add image
        BufferedImage imgBroom1 = null;

        try {
            imgBroom1 = ImageIO.read(new File("./imgs/broom1Detail.jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }

        JLabel imgDetail1=new JLabel(new ImageIcon(imgBroom1));
        imgDetail1.setBounds(20, 60, 280, 280);
        this.add(imgDetail1);

//        JButton buttonBack1 = new JButton("Back");
        buttonBack1.setBounds(20,20, 80, 30);
        this.add(buttonBack1);

        JLabel labelDetailName1 = new JLabel("HDXSmooth Sweep Indoor Angle Broom with Dustpan");
        labelDetailName1.setBounds(330, 60, 500, 30);
        labelDetailName1.setFont(new Font("", Font.PLAIN, 16));
        this.add(labelDetailName1);

        JLabel labelDetailPrice1 = new JLabel("$ "+"11.97");
        labelDetailPrice1.setBounds(730, 300, 100, 30);
        labelDetailPrice1.setFont(new Font("", Font.PLAIN, 16));
        this.add(labelDetailPrice1);

        JLabel labelQuantity1 = new JLabel("11"+" in stock");
        labelQuantity1.setBounds(330, 300, 200, 30);
        labelQuantity1.setFont(new Font("", Font.PLAIN, 16));
        labelQuantity1.setForeground(Color.green);
        this.add(labelQuantity1);


        JPanel panelMoreDetail1 = new JPanel();
        panelMoreDetail1.setBorder(BorderFactory.createTitledBorder("More Details:"));
        panelMoreDetail1.setLayout(null);
        panelMoreDetail1.setBounds(10, 350, 810, 200);
        this.add(panelMoreDetail1);


        JLabel labelDescription1 = new JLabel();
        labelDescription1.setBounds(20, 10, 200, 30);
        labelDescription1.setFont(new Font("", Font.BOLD, 20));
        labelDescription1.setText("Description:");
        panelMoreDetail1.add(labelDescription1);

        JTextPane textDescription1 = new JTextPane();
        textDescription1.setBounds(20, 40, 760, 120);
        textDescription1.setFont(new Font("", Font.PLAIN, 16));
        textDescription1.setText("With this HDX Broom you will enjoy an effective and efficient sweeping experience with minimal labor. The smooth soft bristles are perfect for cleaning pet hair, dirt and dust from floors. Use for indoor sweeping on wood, tile, linoleum floors. Comes with dustpan 13 in. dustpan with rubber lip for fast and easy dirt collection into the pan and not under it. The dustpan also features shark teeth on the sides to help clean hair and dirt particles from the bristles.");
        textDescription1.setEditable(false);
        panelMoreDetail1.add(textDescription1);

        JLabel labelComments1 = new JLabel();
        labelComments1.setBounds(20, 160, 200, 30);
        labelComments1.setFont(new Font("", Font.BOLD, 20));
        labelComments1.setText("Comments (0):");
        panelMoreDetail1.add(labelComments1);


        /* ================= Panel for buy option in detail page 1 ================ */
//        JPanel panelDetailPayment1 = new JPanel();
        panelDetailPayment1.setBounds(80, 690, 820, 60);
        panelDetailPayment1.setVisible(false);
        panelDetailPayment1.setLayout(null);
        JButton buttonDetailBuy1 = new JButton("Buy Now");
        buttonDetailBuy1.setBounds(600, 10, 100, 30);
        panelDetailPayment1.add(buttonDetailBuy1);

        JButton buttonDetailCart1 = new JButton("Add to Cart");
        buttonDetailCart1.setBounds(720, 10, 100, 30);
        panelDetailPayment1.add(buttonDetailCart1);



        /* ================= Detail Information Page for the second Item ================= */
        JPanel panelDetail2 = new JPanel();


        /* ================= Detail Information Page for the third Item ================= */
        JPanel panelDetail3 = new JPanel();
    }
}
