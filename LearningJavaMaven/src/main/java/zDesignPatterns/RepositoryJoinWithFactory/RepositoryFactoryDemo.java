/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.RepositoryJoinWithFactory;

/**
 *
 * @author LENOVO
 */
public class RepositoryFactoryDemo {
    public static void main(String[] args) {
        
        //getting the the repository
        CustomerRepository repository = CustomerRepositoryFactory.getRepository();

    }
}
