/*
 * @test
 * @compile/fail/ref=GenericValTest.out -XDrawDiagnostics GenericValTest.java
 */


import java.util.List;

public class GenericValTest {

    void test() {
        List<val> v1;           // error
        List<? extends val> v2; // error
        List<? super val> v3;   // error
    }
}

