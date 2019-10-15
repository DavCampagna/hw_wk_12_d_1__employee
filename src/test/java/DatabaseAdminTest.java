import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Roberto Simpson", 737432533, 30500.00);
    }

    @Test
    public void hasName(){
        assertEquals("Roberto Simpson", databaseAdmin.getName());
    }

    @Test
    public void hasNin(){
        assertEquals(737432533, databaseAdmin.getNin());
    }

    @Test
    public void hasSalary(){
        assertEquals(30500.00, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1.2);
        assertEquals(36600.00, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(305.00, databaseAdmin.payBonus());
    }
}
