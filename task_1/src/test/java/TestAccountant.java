/**
 * Тестовый класс класса com.den.Accountant.
 *
 * @author    Денис Гончаренко
 */

import com.den.Accountant;
import com.den.Developer;
import com.den.Employee;
import com.den.Manager;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class TestAccountant {
    /**
     * тестовый метод метода calculateSalary
     * позитывный сценарий
     */
    @Test
    public void testCalculateSalary(){
        Employee employee1 = new Developer(1000, 130);
        Employee employee2 = new Developer(750, 180);
        Employee employee3 = new Developer(2000, 150);
        Employee employee4 = new Manager(500, 200);
        Employee employee5 = new Manager(400, 100);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        double[] salaryExpected = {
                employee1.calculateSalary(),
                employee2.calculateSalary(),
                employee3.calculateSalary(),
                employee4.calculateSalary(),
                employee5.calculateSalary()
        };

        Accountant accountant = new Accountant();
        accountant.calculateSalary(employees);

        double[] salaryActual = new double[5];

        for (int i = 0; i < salaryActual.length; i++){
            salaryActual[i] = employees.get(i).getSalary();
        }


        Assert.assertArrayEquals(salaryExpected, salaryActual, 0);
    }
}
