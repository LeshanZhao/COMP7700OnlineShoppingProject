import javax.swing.*;

public class SearchInputBoxPanel extends JPanel {
    String[] Categories = {"All", "Books", "Clothing", "Electronics", "Food", "Grocery", "Household", "Kids","Medicine", "Outdoors", "Pet Supplies", "Sports", "Others"};
    JComboBox<String> dropDownBoxCategory = new JComboBox<>(Categories);
    JTextField txtProductDescription = new JTextField(30);
    JLabel searchResultHint = new JLabel();
    JButton buttonSearch = new JButton("Search");

    public SearchInputBoxPanel(){
        //        this.setBorder(BorderFactory.createTitledBorder("panelSearchBorder"));
        this.setLayout(null);
        this.setBounds(0, 0,960, 110);

        dropDownBoxCategory.setBounds(80, 50, 100, 30);
        this.add(dropDownBoxCategory);

        txtProductDescription.setBounds(180, 50, 600, 30);
        this.add(txtProductDescription);

        buttonSearch.setBounds(800, 50, 100, 30);
        this.add(buttonSearch);

        searchResultHint.setBounds(90, 50, 380, 80);
        this.add(searchResultHint);
    }
}
