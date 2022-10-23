import java.lang.String;

public class Authorization
{
    private int _authorizationID;
    private String _authorizationLevel;
    private String _product;
    private String _payment;
    private String _shipper;
    private String _user;
    private String _order;

    // Properties

    public int GetAuthorizationID() { return _authorizationID; }

    public void SetAuthorizationID(int authorizationID) { _authorizationID = authorizationID; }

    public String GetAuthorizationLevel() { return _authorizationLevel; }

    public void SetAuthorizationLevel(String authorizationLevel) { _authorizationLevel = authorizationLevel; }

    public String GetProduct() { return _product; }

    public void SetProduct(String product) { _product = product; }

    public String GetPayment() { return _payment; }

    public void SetPayment(String payment) { _payment = payment; }

    public String GetShipper() { return _shipper; }

    public void SetShipper(String shipper) { _shipper = shipper; }

    public String GetUser() { return _user; }

    public void SetUser(String user) { _user = user; }

    public String GetOrder() { return _order; }

    public void SetOrder(String order) { _order = order; }
}
