package BentlyShowroom;

import java.util.Objects;

public class Order {

    Integer id;
    Car car;
    Car cost;
    Customer customer;
    String dateOfReceiving;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCost() {
        return cost;
    }

    public void setCost(Car cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDateOfReceiving() {
        return dateOfReceiving;
    }

    public void setDateOfReceiving(String dateOfReceiving) {
        this.dateOfReceiving = dateOfReceiving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(car, order.car) && Objects.equals(cost, order.cost) && Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, cost, customer);
    }

    @Override
    public String toString() {
        return "Order{" +
                "car=" + car +
                ", cost=" + cost +
                ", customer=" + customer +
                ", dateOfReceiving='" + dateOfReceiving + '\'' +
                '}';
    }
}
