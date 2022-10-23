import java.util.Date;
import java.lang.String;

public class Users
{
    private int _userID;
    private String _username;
    private int _userRoleID;
    private String _firstName;
    private String _lastName;
    private String _password;
    private char _active;
    private Date _dateAdded;
    private Date _dateModified;

    public int GetUserID() { return _userID;}
    public void SetUserID(int userID) { _userID = userID;}

    public String GetUsername() { return _username;}
    public void SetUsername(String username){ _username = username;}

    public int GetUserRoleID() { return _userRoleID;}
    public void SetUserRoleID(int userRoleID) { _userRoleID = userRoleID;}

    public String GetFirstName() { return _firstName;}
    public void SetFirstName(String firstName){ _firstName = firstName;}

    public String GetLastName() { return _lastName;}
    public void SetLastName(String lastName){ _lastName = lastName;}

    public String GetPassword() { return _password;}
    public void SetPassword(String password){ _password = password;}

    public char GetActive() {return _active;}
    public void SetActive(char active) {_active = active;}

    public Date GetDateAdded() {return _dateAdded;}
    public void SetDateAdded(Date dateAdded) {_dateAdded = dateAdded;}

    public Date GetDateModified() {return _dateModified;}
    public void SetDateModified(Date dateModified) {_dateModified = dateModified;}
}

