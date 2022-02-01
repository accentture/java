package JAVA.SECTION_48_ConnectionPooling.data;
import JAVA.SECTION_48_ConnectionPooling.domain.PersonDTO;
import java.util.List;


import java.sql.SQLException;

public interface PersonDAO {
    public int insertPerson(PersonDTO person) throws SQLException;
    public List<PersonDTO> getPersons() throws SQLException;
}
