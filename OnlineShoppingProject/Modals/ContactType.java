import java.lang.String;

public class ContactType
{
    private int _contactTypeID;
    private String _typeName;
    private String _typeDescription;
    private char _active;
    private String _dateAdded;
    private String _dateModified;

    public int GetContactTypeID() {return _contactTypeID;}
    public void SetContactTypeID(int contactTypeID) { _contactTypeID = contactTypeID; }

    public String GetTypeName() { return _typeName; }
    public void SetTypeName(String typeName) { _typeName = typeName; }

    public String GetTypeDescription() { return _typeDescription; }
    public void SetTypeDescription(String typeDescription) { _typeDescription = typeDescription; }

    public char GetActive() { return _active; }
    public void SetActive(char active) { _active = active; }

    public String GetDateAdded() { return _dateAdded; }
    public void SetDateAdded(String dateAdded) { _dateAdded = dateAdded; }

    public String GetDateModified() {return _dateModified; }
    public void SetDateModified(String dateModified) { _dateModified = dateModified; }
}
