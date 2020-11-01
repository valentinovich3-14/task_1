/**
 * Класс для описания сотрудника com.den.Developer.
 *
 * @author    Денис Гончаренко
 */
package com.den;

public class Developer extends Employee {

    public Developer(int rate, double hoursWorked) {
        super(rate, hoursWorked);
    }

    /**
     * реализованый метот возвращает зарплату сотрудника com.den.Developer за месяц calculateSalary.
     */
    public double calculateSalary() {
        return (getRate() * getWorkedOut()) / 100;
    }
}
