/**
 * Родительский класс для описания сотрудника.
 *
 * @author    Денис Гончаренко
 */
package com.den;

public abstract class Employee {
    /** норма рабочего месяца hoursNorm */
    public final static int hoursNorm = 4 * 5 * 8;

    /** ставка сотрудника rate */
    private int rate;

    /** отработано часов за этот месяц rate */
    private double hoursWorked;

    /** зарплата за этот месяц salary */
    private double salary;


    public Employee(int rate, double hoursWorked) {
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    public Employee() {

    }

    /**
     * метот возвращает зарплату сотрудника за месяц calculateSalary.
     */
    public abstract double calculateSalary();

    /**
     * метот возвращает отработаное время в процентах getWorkedOut.
     * 100% = норма рабочего месяца
     */
    public double getWorkedOut(){
        return (hoursWorked * 100) / hoursNorm;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rate=" + rate +
                ", hoursWorked=" + hoursWorked +
                ", salary=" + salary +
                '}';
    }
}
