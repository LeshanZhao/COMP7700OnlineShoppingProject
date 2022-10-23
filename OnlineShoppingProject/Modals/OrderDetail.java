public class OrderDetail
{
    private int _orderDetailID;
    private int _orderID;
    private int _productID;
    private int _quantity;
    private double _lineTotal;

    //Properties for OrderDetail Fields

    public int GetOrderID()
    {
        return _orderID;
    }
    public void SetOrderID(int orderID)
    {
        _orderID = orderID;
    }
    public int GetProductID()
    {
        return _productID;
    }
    public void SetProductID(int productID)
    {
        _productID = productID;
    }
    public int GetQuantity()
    {
        return _quantity;
    }
    public void SetQuantity(int quantity)
    {
       _quantity = quantity;
    }
    public double GetLineTotal()
    {
        return _lineTotal;
    }
    public void SetLineTotal(double lineTotal)
    {
        _lineTotal = lineTotal;
    }

}
