import java.util.Date;
import java.util.List;
public class Order
{
        private int _orderID;
        private int _customerID;
        private int _shippingAddressID;
        private Date _orderDate;
        private double _orderSubtotal;
        private int _shipperID;
        private Date _dateModified;
        private int _statusID;

    //Properties for Order Fields
    public int GetOrderID()
    {
        return _orderID;
    }
    public void SetOrderID(int orderID)
    {
        _orderID = orderID;
    }
    public int GetCustomerID() { return _customerID;}
    public void SetCustomerID(int customerID) {_customerID = customerID;}
    public int GetShippingAddressID() { return _shippingAddressID; }
    public void SetShippingAddressID(int shippingAddressID) {_shippingAddressID = shippingAddressID; }
    public Date GetOrderDate() { return _orderDate; }
    public void SetOrderDate(Date orderDate) { _orderDate = orderDate; }
    public double GetOrderSubtotal() { return _orderSubtotal; }
    public void SetOrderSubtotal(double orderSubtotal) { _orderSubtotal = orderSubtotal; }
    public int GetShipperID()
    {
        return _shipperID;
    }
    public void SetShipperID(int shipperID)
    {
        _shipperID = shipperID;
    }
    public Date GetDateModified() { return _dateModified; }
    public void SetDateModified(Date dateModified) { _dateModified = dateModified; }
    public int GetStatusID()
    {
        return _statusID;
    }
    public void SetStatusID(int statusID)
    {
        _statusID = statusID;
    }
}
