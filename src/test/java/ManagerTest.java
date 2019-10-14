import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Matthew Smith", 463829243, 40700.00, "Accounting");
    }

    @Test
    public void hasName(){
        assertEquals("Matthew Smith", manager.getName());
    }

    @Test
    public void hasNin(){
        assertEquals(463829243, manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(40700.00, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounting", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.2);
        assertEquals(48840.00, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(407.00, manager.payBonus());
    }

}
