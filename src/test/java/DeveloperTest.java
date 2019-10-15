import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Samantha Harry", 132432482, 32000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Samantha Harry", developer.getName());
    }

    @Test
    public void hasNin(){
        assertEquals(132432482, developer.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(32000.00, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1.2);
        assertEquals(38400.00, developer.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(320.00, developer.payBonus());
    }
}
