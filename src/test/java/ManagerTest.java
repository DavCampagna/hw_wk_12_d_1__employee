import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Rebecca Hu", 272329242, 39500.00, "Accounting");
    }

    @Test
    public void hasName(){
        assertEquals("Rebecca Hu", manager.getName());
    }

    @Test
    public void hasNin(){
        assertEquals(272329242, manager.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(39500.00, manager.getSalary());
    }

    @Test
    public void hasDeptName(){
        assertEquals("Accounting", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.2);
        assertEquals(47400.00, manager.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(395.00, manager.payBonus());
    }

}
