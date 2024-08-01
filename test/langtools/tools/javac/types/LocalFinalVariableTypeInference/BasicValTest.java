/*
 * @test
 * @compile/fail/ref=BasicValTest.out -XDrawDiagnostics BasicValTest.java
 */

public class BasicValTest {
    void basic_test() {
        // just use 'val'
        // ok
        val a = 1;


        // 'val' correct identifier
        // ok
        var val = "Hello";
        val = "World";


        // 'final val' correct, but has no effect (already final)
        // ok
        final val b = 5.6f;


        // 'val' with null
        // error
        val c = null;


        // 'val' missing initialization
        // error
        val d;
    }

    void redefinition_test() {
        // try to redefine 'val' (same type)
        // error
        val x = 1;
        x = 2;


        // try to redefine 'val' (diff type)
        // 2 errors
        val y = 3;
        y = "String";


        // already defined with 'val'
        // error
        val z = 4;
        int z = 5;
    }


    // final counter
    // error
    void loop_test() {
        for (val counter = 0; counter < 10; counter++)  { }
    }

}
