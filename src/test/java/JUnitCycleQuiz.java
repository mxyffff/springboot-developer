import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    @Test
    public void junitQuiz3() {
        System.out.println("This is first test");
    }

    @Test
    public void junitQuiz4() {
        System.out.println("This is second test");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @AfterAll // 전체 테스트를 마치고 종료하기 전에 1회 실행하므로 메서드는 static으로 선언
    public static void afterAll() {
        System.out.println("Bye!");
    }
}
