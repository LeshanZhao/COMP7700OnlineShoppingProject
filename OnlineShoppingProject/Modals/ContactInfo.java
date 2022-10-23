import java.lang.String;

public class ContactInfo
{
    private int _contactInfoID;
    private int _contactTypeID;
    private int _userID;
    private String _streetAddress1;
    private String _streetAddress2;
    private String _city;
    private String _state;
    private String _postalCode;
    private String _mainPhoneNumber;
    private String _alternatePhoneNumber;
    private String _emailAddress;
    private char _active;

    public int GetContactInfoID() { return _contactInfoID; }
    public void SetContactInfoID(int contactInfoID ) { _contactInfoID = contactInfoID; }

    public int GetContactTypeID() { return _contactTypeID; }
    public void SetContactTypeID(int contactTypeID ) { _contactTypeID = contactTypeID; }

    public int GetContactUserID() { return _userID; }
    public void SetContactUserID(int userID ) { _userID = userID; }

    public String GetStreetAddress1() { return _streetAddress1; }
    public void SetStreetAddress1(String streetAddress1 ) { _streetAddress1 = streetAddress1; }

    public String GetStreetAddress2() { return _streetAddress2; }
    public void SetStreetAddress2(String streetAddress2 ) { _streetAddress2 = streetAddress2; }

    public String GetCity() { return _city; }
    public void SetCity(String city ) { _city = city; }

    public String GetState() { return _state; }
    public void SetState(String state ) { _state = state; }

    public String GetPostalCode() { return _postalCode; }
    public void SetPostalCode(String postalCode ) { _postalCode = postalCode; }

    public String GetMainPhoneNumber() { return _mainPhoneNumber; }
    public void SetMainPhoneNumber(String mainPhoneNumber ) { _mainPhoneNumber = mainPhoneNumber; }

    public String GetAlternatePhoneNumber() { return _alternatePhoneNumber; }
    public void SetAlternatePhoneNumber(String alternatePhoneNumber ) { _alternatePhoneNumber  = alternatePhoneNumber; }

    public String GetEmailAddress() { return _emailAddress; }
    public void SetEmailAddress(String emailAddress ) { _emailAddress = emailAddress; }

    public char GetActive() { return _active; }
    public void SetActive(char active ) { _active = active; }

}
