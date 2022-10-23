import java.lang.String;
import java.util.Date;

public class Product
{
    private int _productID;
    private String _productName;
    private String _productDescription;
    private int _quantityOnHand;
    private Date _dateAdded;
    private int _active;

    public int GetProductID() { return _productID; }
    public void SetProductID(int productID) {_productID = productID;}

    public String GetProductName() {return _productName;}
    public void SetProductName(String productName) {_productName = productName;}

    public String GetProductDescription() {return _productDescription;}
    public void SetProductDescription(String productDescription) {_productDescription = productDescription;}

    public int GetQuantityOnHand() {return _quantityOnHand;}
    public void SetQuantityOnHand(int quantityOnHand) {_quantityOnHand = quantityOnHand;}

    public Date GetDateAdded(){return _dateAdded;}
    public void SetDateAdded(Date dateAdded) {_dateAdded = dateAdded;}

    public int GetActive() {return _active;}
    public void SetActive(int active) {_active = active;}

}
