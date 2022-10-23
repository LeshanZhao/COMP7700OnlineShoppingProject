import java.lang.String;
import java.util.Date;

public class Shipper
{
    private int _shipperID;
    private String _shipperName;
    private String _shipperAddress1;
    private String _shipperAddress2;
    private String _city;
    private String _state;
    private String _postalCode;
    private String _mainPhoneNumber;
    private String _emailAddress;
    private String _active;
    private Date _dateAdded;
    private Date _dateModified;

    public int GetShipperID(){ return _shipperID; }
    public void SetShipperID(int shipperID) { _shipperID = shipperID; }

    public String GetShipperName() { return _shipperName; }
    public void SetShipperName(String shipperName) { _shipperName = shipperName; }

    public String GetShipperAddress1() { return _shipperAddress1; }
    public void SetShipperAddress1(String shipperAddress1) { _shipperAddress1 = shipperAddress1; }

    public String GetShipperAddress2() { return _shipperAddress2; }
    public void SetShipperAddress2(String shipperAddress2) { _shipperAddress2 = shipperAddress2; }

    public String GetCity() { return _city; }
    public void SetCity(String city) { _city = city; }

    public String GetState() { return _state; }
    public void SetState(String state) { _state = state; }

    public String GetPostalCode() { return _postalCode; }
    public void SetPostalCode(String postalCode) { _postalCode = postalCode; }

    public String GetMainPhoneNumber() { return _mainPhoneNumber; }
    public void SetMainPhoneNumber(String mainPhoneNumber) { _mainPhoneNumber = mainPhoneNumber; }

    public String GetEmailAddress() { return _emailAddress; }
    public void SetEmailAddress(String emailAddress) { _emailAddress = emailAddress; }

    public String GetActive() { return _active; }
    public void SetActive(String active) { _active = active; }

    public Date GetDateAdded() { return _dateAdded; }
    public void SetDateAdded(Date dateAdded) { _dateAdded = dateAdded; }

    public Date GetDateModified() { return _dateModified; }
    public void SetDateModified(Date dateModified) { _dateModified = dateModified; }
}
