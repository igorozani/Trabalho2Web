/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author clauc
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class GenericDao<T> {

    private final EntityManagerFactory emf;

    public GenericDao() {
        emf = Persistence.createEntityManagerFactory("SistemaPromocoesTeatrosPU");
    }

    protected EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    abstract T get(Long id);
    abstract List<T> getAll();
    abstract void save(T t);
    abstract void update(T t);     
    abstract void delete(T t);
}