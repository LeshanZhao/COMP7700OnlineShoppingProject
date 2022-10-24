import java.util.Date;
import java.lang.String;

public class Supplier
{
    private int _supplierID;
    private String _supplierName;
    private String _supplierDescription;
    private String _addressLine1;
    private String _addressLine2;
    private String _city;
    private String _state;
    private String _postalCode;
    private String _phoneNumber;
    private String _alternatePhoneNumber;
    private String _emailAddress;
    private char _active;
    private Date _dateAdded;
    private Date _dateModified;

    public int GetSupplierID() { return _supplierID; }
    public void SetSupplierID(int supplierID) { _supplierID = supplierID; }

    public String GetSupplierName() { return _supplierName; }
    public void SetSupplierName(String supplierName) { _supplierName = supplierName; }

    public String GetSupplierDescription() { return _supplierDescription; }
    public void SetSupplierDescription(String supplierDescription) { _supplierDescription = supplierDescription; }

    public String GetAddressLine1() { return _addressLine1; }
    public void SetAddressLine1(String addressLine1) { _addressLine1 = addressLine1; }

    public String GetAddressLine2() { return _addressLine2; }
    public void SetAddressLine2(String addressLine2) { _addressLine2 = addressLine2; }

    public String GetCity() { return _city; }
    public void SetCity(String city) { _city = city; }

    public String GetState() { return _state; }
    public void SetState(String state) { _state = state; }

    public String GetPostalCode() { return _postalCode; }
    public void SetPostalCode(String postalCode) { _postalCode = postalCode; }

    public String GetPhoneNumber() { return _phoneNumber; }
    public void SetPhoneNumber(String phoneNumber) { _phoneNumber = phoneNumber; }

    public String GetAlternatePhoneNumber() { return _alternatePhoneNumber; }
    public void SetAlternatePhoneNumber(String alternatePhoneNumber) { _alternatePhoneNumber = alternatePhoneNumber; }

    public String GetEmailAddress() { return _emailAddress; }
    public void SetEmailAddress(String emailAddress) { _emailAddress = emailAddress; }

    public char GetActive() { return _active; }
    public void SetActive(char active) { _active = active; }

    public Date GetDateAdded() { return _dateAdded; }
    public void SetDateAdded() { _dateAdded = _dateAdded; }

    public Date GetDateModified() { return _dateModified; }
    public void SetDateModified() { _dateModified = _dateModified; }

}
