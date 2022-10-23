import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class SearchResultPanel extends JPanel {



    JPanel panel_upon_ScrollPane = new JPanel();

    JButton button_ViewDetail = new JButton();


    public SearchResultPanel() {

        // Initialization
        /* ================= This is the Panel Containing all the searching results ================= */
        this.setBackground(Color.lightGray);
        this.setBorder(new EmptyBorder(0,10,0,10));
        this.setBounds(60,110, 860, 530);
        this.setBorder(BorderFactory.createTitledBorder("Search Result"));
        this.setVisible(false);
        this.setLayout(null);

        // Create a Scroll Pane to display all product items.
        // (In Swing, an Extra panel is required for ScrollPane to include multiple components)
        JScrollPane ScrollPane_Results = new JScrollPane();
        ScrollPane_Results.setBounds(15,20,835,500);
//        ScrollPane_Results.setBorder(BorderFactory.createTitledBorder("ScrollPane (displaying for debug)"));
        this.add(ScrollPane_Results,BorderLayout.CENTER);

        // Create the extra panel to contain all the sub-panels for each product item
//        JPanel panel_upon_ScrollPane = new JPanel();
        panel_upon_ScrollPane.setLayout(new GridLayout(SearchView.items_Count,1,10,10));
        panel_upon_ScrollPane.setBackground(Color.lightGray);
//        panel_upon_ScrollPane.setBorder(BorderFactory.createTitledBorder("Panel for subPanels Area (displaying for debug)"));
        ScrollPane_Results.setViewportView(panel_upon_ScrollPane);
    }


    public void reload_Results(){
        /* ================= Panel for each product's information ================= */
        for (int nxt_item=0; nxt_item<SearchView.items_Count; nxt_item++){
            ArrayList<String> next_item = (ArrayList<String>) SearchView.items_Info.get(nxt_item);

            JPanel subpanel_ItemPreview = new JPanel();
            subpanel_ItemPreview.setLayout(null);
            subpanel_ItemPreview.setPreferredSize(new Dimension(600,190));

            // Display ID
            subpanel_ItemPreview.setBorder(BorderFactory.createTitledBorder(next_item.get(0)));

            // load the image
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(next_item.get(4)));
            } catch (IOException e){
                e.printStackTrace();
            }
            JLabel img_Item =new JLabel(new ImageIcon(img));
            img_Item.setBounds(20, 20, 160, 160);
            subpanel_ItemPreview.add(img_Item);

            // Display Product Name
            JLabel label_ProductName = new JLabel(next_item.get(1));
            label_ProductName.setBounds(210, 20, 500, 60);
            label_ProductName.setFont(new Font("", Font.PLAIN, 16));
            subpanel_ItemPreview.add(label_ProductName);

            // Display Price in $
            JLabel label_Price = new JLabel(next_item.get(2));
            label_Price.setBounds(850, 20, 500, 60);
            label_Price.setFont(new Font("", Font.PLAIN, 16));
            subpanel_ItemPreview.add(label_Price);

            // Display "Buy Now" Button (Event on button clicked not implemented)
            JButton button_BuyNow = new JButton("Buy Now");
            button_BuyNow.setBounds(680, 90, 100, 30);
            subpanel_ItemPreview.add(button_BuyNow);

            // Display "Add to Cart" Button (Event on button clicked not implemented)
            JButton button_AddToCart = new JButton("Add to Cart");
            button_AddToCart.setBounds(680, 130, 100, 30);
            subpanel_ItemPreview.add(button_AddToCart);


            // Display "View Detail" Button and Set its name as product ID (Event: Show the Item Detail Page (a panel) )
            button_ViewDetail = new JButton("View Detail");
            button_ViewDetail.setBounds(210, 130, 100, 30);

            button_ViewDetail.setName(next_item.get(0));
            System.out.println(button_ViewDetail.getName());
            subpanel_ItemPreview.add(button_ViewDetail);

            panel_upon_ScrollPane.add(subpanel_ItemPreview);

        }
    }
}
