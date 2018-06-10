package savanna;

import javax.persistence.*;

import enums.AnimalType;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
public class SavannaAnimal {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "savanna_animal_id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "family")
    private String family;

    @Column(name = "type")
    private AnimalType type;

    @Column(name = "weight")
    private int weight;

    @Column(name = "lifetime")
    private int lifetime;

    @Column(name = "weight_of_food")
    private int weightOfFood;

    public int getWeightOfFood() {
        return weightOfFood;
    }

    public SavannaAnimal(){}

    public SavannaAnimal(final Integer id, final String name, final String family,
                         final AnimalType type, final int weight,
                         final int lifetime) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.type = type;
        this.weight = weight;
        this.lifetime = lifetime;
    }

    @Override
    public final String toString() {
        return "\n" + "SavannaAnimal{"
                + "id='" + id + '\''
                + "name='" + name + '\''
                + ", family='" + family + '\''
                + ", type=" + type
                + ", weight=" + weight
                + ", lifetime=" + lifetime
                + "}\n";
    }

    public final String getName() {
        return name;
    }

    public final AnimalType getType() {
        return type;
    }

    public Integer getId() {
        return id;
    }

    public void setWeightOfFood(int weightOfFood) {
        this.weightOfFood = weightOfFood;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeaders() {
        return "name, " + "family, " + "type, " + "weight, " + "lifetime, ";
    }

    public String toCSV() {
        return name + "," + family + "," + type + "," + weight + "," + lifetime;
    }
}
