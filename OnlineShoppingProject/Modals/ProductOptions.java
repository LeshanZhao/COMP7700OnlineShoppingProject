import java.lang.String;

public class ProductOptions
{
    private int _productOptionID;
    private int _productID;
    private String _optionName;
    private String _optionDescription;
    private String _optionValue;

    public int GetProductOptionID(){return _productOptionID;}
    public void SetProductOptionID(int productOptionID) {_productOptionID = productOptionID;}

    public int GetProductID() {return _productID;}
    public void SetProductID(int productID) { _productID = productID;}

    public String GetOptionName(){return _optionName;}
    public void SetOptionName(String optionName){ _optionName = optionName;}

    public String GetOptionDescription(){return _optionDescription;}
    public void SetOptionDescription(String optionDescription){ _optionDescription = optionDescription;}

    public String GetOptionValue(){return _optionValue;}
    public void SetOptionValue(String optionValue){ _optionValue = optionValue;}
}
