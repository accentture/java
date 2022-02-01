package JAVA.SECTION_47_DesignPatternsJDBC.data;
import JAVA.SECTION_47_DesignPatternsJDBC.domain.PersonDTO;
import java.util.List;


import java.sql.SQLException;

public interface PersonDAO {
    public int insertPerson(PersonDTO person) throws SQLException;
    public List<PersonDTO> getPersons() throws SQLException;
}
