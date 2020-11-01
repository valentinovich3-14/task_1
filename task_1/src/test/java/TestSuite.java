import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@Suite.SuiteClasses( {
        TestManager.class,
        TestDeveloper.class,
        TestAccountant.class
})
@RunWith(Suite.class)
public class TestSuite {
}
