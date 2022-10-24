
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class SearchView extends JFrame
{
    public static Vector items_Info;
    public static int items_Count;

    public static SearchResultPanel panel_Result;

    public SearchView(){
        this.setTitle("7700_OnlineShopping_Iteration_2");
        this.setBounds(180, 5, 980, 680);
        this.setVisible(true);
        this.setLayout(null);

        /* ================= Panel for the searching input Box ================= */
        SearchInputBoxPanel panel_Search = new SearchInputBoxPanel();

        /* ================= Panel Containing all the searching results ================= */
        panel_Result = new SearchResultPanel();

        /* ================= Detail Information Page for the first Item ================= */
        ItemDetailPanel panel_Detail1 = new ItemDetailPanel();

        /* ================= Add all panels to the frame ================= */
        this.add(panel_Search);
        this.add(panel_Result);
        this.add(panel_Detail1);
        this.add(panel_Detail1.panelDetailPayment1);


        /* ================= Action on button "Search" clicked ================= */
        panel_Search.buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchedItem = "You are searching for:  - " + panel_Search.dropDownBoxCategory.getItemAt(panel_Search.dropDownBoxCategory.getSelectedIndex())
                        + " -  with description: \"" + panel_Search.txtProductDescription.getText() + "\"";

                /* -------------- This is the interface with data access layer --------------- */
                items_Info = new Vector();

                ArrayList<String> new_item = new ArrayList<String>();
                new_item.add("1");                  // Item ID
                new_item.add("HDXSmooth Sweep Indoor Angle Broom with Dustpan");
                                                    // Item Name
                new_item.add("11.97");              // Price in $
                new_item.add("11");                 // Amount in stock
                new_item.add("./imgs/broom1.jpg");  // Image Path
                new_item.add("With this HDX Broom you will enjoy an effective and efficient sweeping experience with minimal labor. The smooth soft bristles are perfect for cleaning pet hair, dirt and dust from floors. Use for indoor sweeping on wood, tile, linoleum floors. Comes with dustpan 13 in. dustpan with rubber lip for fast and easy dirt collection into the pan and not under it. The dustpan also features shark teeth on the sides to help clean hair and dirt particles from the bristles.");
                                                    // Description
                new_item.add("");                   // Comment  (to be implemented in the later iterations)

                items_Info.add(new_item);
                /* -------------- This is the interface with data access layer --------------- */

                ArrayList<String> new_item2 = new ArrayList<String>();
                new_item2.add("2");
                new_item2.add("O-CedarPowerCorner Pet Pro Angle Broom with Step On Dust Pan");
                new_item2.add("13.97");
                new_item2.add("39");
                new_item2.add("./imgs/broom2.jpg");
                new_item2.add("You love your pet but sweeping after their messes is no walk in the park. The new PowerCorner Pet Pro Broom and Step On Dust Pan is specially designed for pet owners and their furry friends. The broom features a distinctive V shape that has 2-times the floor contact as conventional brooms. ......");
                new_item2.add("");
                items_Info.add(new_item2);
                /* -------------- Above are Temporary code to hardcode information for broom 2 (redundant) --------------- */

                ArrayList<String> new_item3 = new ArrayList<String>();
                new_item3.add("3");
                new_item3.add("QuickieJobsite 24 in. Multi-Surface Fiberglass Push Broom");
                new_item3.add("37.97");
                new_item3.add("4");
                new_item3.add("./imgs/broom3.jpg");
                new_item3.add("With a weather-resistant fiberglass handle with cushion grips, multi-sweep bristles, the Quickie commercial-grade Multi-Surface Push Broom was built for powerful cleaning. It was designed specifically with soft outer fibers and stiff inner fibers to sweep a wide range of debris. This push broom is ideal for use in garages, basements and on sidewalks for sand, mulch, grass clipping and drywall.");
                new_item3.add("");
                items_Info.add(new_item3);
                /* -------------- Above are Temporary code to hardcode information for broom 3 (redundant) --------------- */

                items_Count = items_Info.size();

                /* ================= Load Data and Display Panel Containing all the searching results ================= */
                panel_Result.reload_Results();

                panel_Search.searchResultHint.setText(searchedItem);
                panel_Search.buttonSearch.setText("New Search");
                panel_Search.buttonSearch.setBounds(790, 50, 110, 30);
                panel_Result.setVisible(true);
            }
        });

        /* ================= Action on button "View Detail" for the first item clicked  ================= */
        panel_Result.button_ViewDetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button \"View Detail\" for the first item is clicked.");
                System.out.println(getName());
                panel_Result.setVisible(false);
                panel_Detail1.setVisible(true);
                panel_Detail1.panelDetailPayment1.setVisible(true);
            }
        });


        /* ================= Action on button "Back" clicked ================= */
        panel_Detail1.buttonBack1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button \"Back\" for the third item is clicked.");
                panel_Result.setVisible(true);
                panel_Detail1.setVisible(false);
            }
        });


    }


    public static void main(String[] args) {
        System.out.println("Hello world! This is the Online Shopping System in iteration 2.");

        SearchView new_search_view = new SearchView();

        System.out.println("======== Done! ========");
    }

}