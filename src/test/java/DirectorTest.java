import management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Matthew Smith", 463829243, 40700.00, "Accounting", 80000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Matthew Smith", director.getName());
    }

    @Test
    public void hasNin(){
        assertEquals(463829243, director.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(40700.00, director.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounting", director.getDeptName());
    }

    @Test
    public void hasBudget(){
        assertEquals(80000.00, director.getBudget());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1.2);
        assertEquals(48840.00, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(407.00, director.payBonus());
    }
}
