/**
 * Класс для описания сотрудника com.den.Manager.
 *
 * @author    Денис Гончаренко
 */
package com.den;

public class Manager extends Employee {

    public Manager(int rate, double hoursWorked) {
        super(rate, hoursWorked);
    }

    /**
     * реализованый метот возвращает зарплату сотрудника com.den.Manager за месяц calculateSalary.
     */
    public double calculateSalary() {
        if(getWorkedOut() >= 100){
            return getRate();
        }else {
            return getRate() * getWorkedOut() / 100;
        }
    }
}
