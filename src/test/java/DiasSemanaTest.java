import org.example.Week;
import org.junit.jupiter.api.*;

public class DiasSemanaTest {
    Week week;

    @BeforeAll
    public static void setUpWeek() {
        System.out.println("*********************");
        System.out.println("Inicia Semana");
    }

    @AfterAll
    public static void endWeekSetting() {
        System.out.println("Termina Semana");
        System.out.println("*********************");
    }

    @BeforeEach
    public void setUpBefore() {
        week = new Week();
        System.out.println("---------------");
        System.out.println("Empieza el");
    }

    @AfterEach
    public void setUpAfter() {
        System.out.println("Termina el dia");
        System.out.println("---------------");
    }

    @Test
    public void TestWeekDay0() {
        String dia = week.getDia(0);
        System.out.println(dia);
    }

    @Test
    public void TestWeekDay1() {
        String dia = week.getDia(1);
        System.out.println(dia);
    }

    @Test
    public void TestWeekDay2() {
        String dia = week.getDia(2);
        System.out.println(dia);
    }

    @Test
    public void TestWeekDay3() {
        String dia = week.getDia(3);
        System.out.println(dia);
    }

    @Test
    public void TestWeekDay4() {
        String dia = week.getDia(4);
        System.out.println(dia);
    }
}
