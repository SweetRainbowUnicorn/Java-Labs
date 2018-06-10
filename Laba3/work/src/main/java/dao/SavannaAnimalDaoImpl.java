package dao;

import savanna.SavannaAnimal;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

@Named
@Dependent
public class SavannaAnimalDaoImpl extends AbstractDao<SavannaAnimal> implements SavannaAnimalDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<SavannaAnimal> getEntityClass() {
        return SavannaAnimal.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}
