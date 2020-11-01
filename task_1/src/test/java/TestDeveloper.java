/**
 * Тестовый класс класса com.den.Developer.
 *
 * @author    Денис Гончаренко
 */
import com.den.Developer;
import com.den.Employee;
import org.junit.Assert;
import org.junit.Test;

public class TestDeveloper {
    /**
     * тестовый метод метода calculateSalary
     * позитывный сценарий, граничное значение (0 часов)
     */
    @Test
    public void testCalculateSalaryWithZeroHours(){
        int rate = 1000;
        int hoursWorked = 0;

        double expectedSalary = (hoursWorked * rate) / Employee.hoursNorm;

        Employee developer = new Developer(rate, hoursWorked);

        Assert.assertEquals( expectedSalary , developer.calculateSalary(),0);
    }

    /**
     * тестовый метод метода calculateSalary
     * позитывный сценарий, min граничное значение (1 мин)
     */
    @Test
    public void testCalculateSalaryWithMinHours(){
        int rate = 500;
        double hoursWorked = 0.016;

        double expectedSalary = (hoursWorked * rate) / Employee.hoursNorm;

        Employee developer = new Developer(rate, hoursWorked);

        Assert.assertEquals( expectedSalary, developer.calculateSalary(),0);
    }

    /**
     * тестовый метод метода calculateSalary
     * позитывный сценарий, граничное значение, норма (100% норма)
     */
    @Test
    public void testCalculateSalaryWhenHoursWorkedEquallyNorm(){
        int rate = 1200;
        double hoursWorked = Employee.hoursNorm;

        double expectedSalary = (hoursWorked * rate) / Employee.hoursNorm;

        Employee developer = new Developer(rate, hoursWorked);

        Assert.assertEquals( expectedSalary, developer.calculateSalary(),0);
    }

    /**
     * тестовый метод метода calculateSalary
     * позитывный сценарий, граничное значение больше нормы (100% норма + 1)
     */
    @Test
    public void testCalculateSalaryWhenHoursWorkedMoreNorm(){
        int rate = 200;
        double hoursWorked = Employee.hoursNorm + 1;

        double expectedSalary = (hoursWorked * rate) / Employee.hoursNorm;

        Employee developer = new Developer(rate, hoursWorked);

        Assert.assertEquals( expectedSalary, developer.calculateSalary(),0);
    }
}
