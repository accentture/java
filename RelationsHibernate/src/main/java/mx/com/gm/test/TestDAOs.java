package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AddressDAO;
import mx.com.gm.dao.AsignationDAO;
import mx.com.gm.dao.CourseDAO;
import mx.com.gm.dao.StudentDAO;

public class TestDAOs {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        System.out.println("Students:");
        //print(studentDAO.list());
        
        
        AddressDAO addressDao = new AddressDAO();
        System.out.println("Addresses:");
        //print(addressDao.list());
        
        
        CourseDAO courseDao = new CourseDAO();
        System.out.println("Courses:");
        //print(courseDao.list());
        
        
        AsignationDAO asignationDao = new AsignationDAO();
        System.out.println("Asigments:");
        print(asignationDao.list());
    }
                            //if we don't want to work with a specific type, we will use only type Object    
    private static void print(List collection){
        for(Object o: collection){
            System.out.println("valor " + o);
        }
    }
    
    
}
