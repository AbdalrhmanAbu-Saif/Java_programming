package JavaProgramming2.Part9.ClassInheritance.DifferentKindsOfBoxes;

import java.util.Objects;

public class Ietm {
    private String name;
    private  int  weight;

    public Ietm(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ietm ietm = (Ietm) o;
        return weight == ietm.weight && Objects.equals(name, ietm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return "Ietm{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
