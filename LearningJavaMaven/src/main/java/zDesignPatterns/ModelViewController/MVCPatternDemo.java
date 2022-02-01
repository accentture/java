/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.ModelViewController;

/**
 *
 * @author Tom
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        
        controller.setStudentName("Alejandro");
        controller.updateView();
    }
    public static Student retrieveStudentFromDatabase(){
        Student _student = new Student();
        _student.setName("Jonathan");
        _student.setRollNo("10");
        
        return _student;
    }
}
