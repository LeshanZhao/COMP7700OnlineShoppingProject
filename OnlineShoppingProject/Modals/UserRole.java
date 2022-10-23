import java.util.Date;
import java.lang.String;

public class UserRole
{
    private int _roleID;
    private String _roleName;
    private String _roleDescription;
    private int _authorizationID;
    private char _active;
    private Date _dateAdded;
    private Date _dateModified;

    public int GetRoleID(){ return _roleID; }
    public void SetRoleID(int roleID) { _roleID = roleID; }

    public String GetRoleName(){ return _roleName; }
    public void SetRoleName(String roleName) { _roleName = roleName; }

    public String GetRoleDescription(){ return _roleDescription; }
    public void SetRoleDescription(String roleDescription) { _roleDescription = roleDescription; }

    public int GetAuthorizationID(){ return _authorizationID; }
    public void SetAuthorizationID(int authorizationID) { _authorizationID = authorizationID; }

    public char GetActive() {return _active;}
    public void SetActive(char active) {_active = active;}

    public Date GetDateAdded() {return _dateAdded;}
    public void SetDateAdded(Date dateAdded) {_dateAdded = dateAdded;}

    public Date GetDateModified() {return _dateModified;}
    public void SetDateModified(Date dateModified) {_dateModified = dateModified;}
}
