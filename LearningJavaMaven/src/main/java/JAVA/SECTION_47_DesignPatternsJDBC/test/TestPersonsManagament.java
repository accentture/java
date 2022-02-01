package JAVA.SECTION_47_DesignPatternsJDBC.test;


import JAVA.SECTION_48_ConnectionPooling.data.Conexionn;
import JAVA.SECTION_48_ConnectionPooling.data.PersonDAO;
import JAVA.SECTION_48_ConnectionPooling.data.PersonDAO_JDBC;
import JAVA.SECTION_48_ConnectionPooling.domain.PersonDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/*
    --we need to split the code in logic layers
    --in system design always is present cohesion and coupling
    --the data layer also is who communicate with fyle system

    --design sytem will afect at the time and cost associated to make future changes
    --the target of design allows to reduce development costs
    --COHESION: Single Responsability
    --COUPLING: it mean the dependency grade between 2 components
    --the target software design is an high cohesion and low coupling between components
    --low copling can be for instance the minor number of relations possible
    
*/


/*
    DESIGN PATTERNS
        **PRESENTATIONAL LAYER
            --MVC
            --Front controller
            --DTO: it represents an problem object object, sometimes it can be an entity domain, it is an class that will persist in database. The DTO will be present in many layers


        **SERVICE LAYER
            --Bussines deleage
            --Service Locator
            --DTO: 


        **DATA ACCESS LAYER
            --DAO
            --DTO

    --the recomendation is use at least the three layers: PRESENTATIONAL LAYER, SERVICE LAYER, DATA ACCESS LAYER        

*/
public class TestPersonsManagament {

    static PersonDAO_JDBC personDAO = new PersonDAO_JDBC();

    public static void main(String[] args) throws SQLException {

        Connection conexion = null;
        try {
            conexion = Conexionn.getConnection();
            if (conexion.getAutoCommit()) {

                conexion.setAutoCommit(false);
            }
            PersonDAO personDao = new PersonDAO_JDBC(conexion);
            List<PersonDTO> persons =  personDao.getPersons();

            for(PersonDTO person: persons){
                System.out.println("person DTO = " + person);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("-------------Entering to rollback");
                conexion.rollback();
//            try {
//            } catch (SQLException ex1) {
//                ex1.printStackTrace(System.out);
//            }
        }
    }


}
