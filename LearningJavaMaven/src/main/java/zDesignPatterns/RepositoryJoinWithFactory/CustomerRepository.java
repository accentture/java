/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.RepositoryJoinWithFactory;


/*
    --repository interace
    --it allows to hide the persistence complexity
    --we can change database thanks to this interface
*/
public interface CustomerRepository {
    public void create(Person customer);
    public Person read(int id);
    public void update(Person customer);
    public void delete(Person customer);
}
