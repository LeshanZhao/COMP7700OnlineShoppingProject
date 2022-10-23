import java.lang.String;
import java.util.Date;

public class ShipperMethod
{
    private int _shipperMethodID;
    private int _shipperID;
    private String _methodName;
    private String _methodDescription;
    private double _methodCost;
    private char _active;
    private Date _dateAdded;
    private Date _dateModified;

    public int GetShipperMethodID() {return _shipperMethodID;}
    public void SetShipperMethodID(int shipperMethodID) {_shipperMethodID = shipperMethodID;}

    public int GetShipperID() {return _shipperID;}
    public void SetShipperID(int shipperID) {_shipperID = shipperID;}

    public String GetMethodName() {return _methodName;}
    public void SetMethodName(String methodName) {_methodName = methodName;}

    public String GetMethodDescription() {return _methodDescription;}
    public void SetMethodDescription(String methodDescription) {_methodDescription = methodDescription;}

    public double GetMethodCost() {return _methodCost;}
    public void SetMethodCost(double methodCost) {_methodCost = methodCost;}

    public char GetActive() {return _active;}
    public void SetActive(char active) {_active = active;}

    public Date GetDateAdded() {return _dateAdded;}
    public void SetDateAdded(Date dateAdded) {_dateAdded = dateAdded;}

    public Date GetDateModified() {return _dateModified;}
    public void SetDateModified(Date dateModified) {_dateModified = dateModified;}
}
