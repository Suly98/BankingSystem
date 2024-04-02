package BentlyShowroom;

import java.util.Objects;

public class Car {

    Integer id;
    String name;
    Integer year;
    String model;
    Float cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(year, car.year) && Objects.equals(model, car.model) && Objects.equals(cost, car.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, model, cost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }
}
