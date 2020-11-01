package com.den; /**
 * Класс автоматизируюший основны ращеты и обязаности сотрудника Бухгалтер (com.den.Accountant)
 *
 * @author    Денис Гончаренко
 */
import com.den.Employee;

import java.util.List;

public class Accountant {
    /**
     * метод расчитывает сотрудникам зарплату calculateSalary.
     * возвращает List сотрудников с заполнеными полями salary.
     *
     * @param employees List сотрудников которым нужно расчитать зарплату
     */
    public List<Employee> calculateSalary(List<Employee> employees){
        employees.forEach(employee -> employee.setSalary(employee.calculateSalary()));
        return employees;
    }
}
