package savanna;

import dao.SavannaAnimalDao;
import enums.AnimalType;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.*;

@Dependent
public class Savanna implements Serializable{

    private static final long serialVersionUID = 1L;

    public enum Season { DRY, WET }
    public enum Mainland { AFRICA, AMERICA, ASIA, AUSTRALIA, INDIA }

    private double area;
    private Season season;
    private Mainland mainland;
    private static Map<Integer, SavannaAnimal> savannaAnimalMap =new HashMap<>();
    private List<SavannaAnimal> result = new LinkedList<>();

    @Inject
    public SavannaAnimalDao savannaAnimalDao;

    public Savanna(){

    }

    public Savanna(final Season season, final Mainland mainland,
                   final double area) {
        this.area = area;
        this.mainland = mainland;
        this.season = season;
    }


    public final Map<Integer,SavannaAnimal> findBigCarnivores(final int mealWeight) {
        final Map<Integer,SavannaAnimal> result = new HashMap<>();
        for (Map.Entry<Integer,SavannaAnimal> animal: savannaAnimalMap.entrySet()) {
               if (animal.getValue().getType() == AnimalType.CARNIVORE
                       && animal.getValue().getWeightOfFood() >= mealWeight) {
                          result.put(animal.getKey(),animal.getValue());
               }
        }
        return result;
    }

    public final void sortByName(final List<SavannaAnimal> list) {
        list.sort(Comparator.comparing(SavannaAnimal::getName));
    }

    @Override
    public final String toString() {
        return "Savanna:" + "\n"
                + "area=" + area
                + ", season=" + season
                + ", mainland=" + mainland
                + '}';
    }

    public SavannaAnimal getSavannaAnimal(Integer id){
        return savannaAnimalDao.findById(id);
    }

    public void addSavannaAnimal(SavannaAnimal savannaAnimal) {
        savannaAnimalDao.persist(savannaAnimal);
    }

    public  void updateSavannaAnimal(SavannaAnimal savannaAnimal) {
        savannaAnimalDao.update(savannaAnimal);
    }

    public  void deleteSavannaAnimal(Integer id) {
        savannaAnimalDao.delete(id);
    }

    public final Map<Integer, SavannaAnimal> getSavannaAnimalMap() {
        return savannaAnimalMap;
    }

    public int getResult() {
        return result.size();
    }



}
