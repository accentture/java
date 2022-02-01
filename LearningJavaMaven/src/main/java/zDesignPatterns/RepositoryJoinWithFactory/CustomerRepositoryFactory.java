package zDesignPatterns.RepositoryJoinWithFactory;



/*
    --this is a repository factory
    --factory pattern allows to decouple the application from the persitence library
*/
public class CustomerRepositoryFactory {

    private static CustomerRepository repository = null;

    public static synchronized CustomerRepository getRepository() {
        if (repository == null) {
            repository = makeRepository();
        }
        return repository;
    }

    public static CustomerRepository makeRepository() {
        
        //get the persister class name from an environment variable
        String persisterClassName = System.getenv("HibernatePersonPersister");
        try {
            Class persisterClass = Class.forName(persisterClassName);

            return (CustomerRepository) persisterClass.newInstance();
        } catch (Exception e) {
            System.out.println(e + " attempting to create persister " + persisterClassName);
            e.printStackTrace();
        }
        return null;

    }

}
