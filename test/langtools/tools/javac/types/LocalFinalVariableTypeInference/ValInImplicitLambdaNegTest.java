/*
 * @test /nodynamiccopyright/
 * @summary compiler support for local-variable syntax for lambda parameters
 * @compile/fail/ref=ValInImplicitLambdaNegTest.out -XDrawDiagnostics ValInImplicitLambdaNegTest.java
 * @compile/fail/ref=ValInImplicitLambdaNegTest_source10.out -source 10 -XDrawDiagnostics ValInImplicitLambdaNegTest.java
 */

import java.util.function.*;

class ValInImplicitLambdaNegTest {
    IntBinaryOperator f1 = (x, val y) -> x + y;                              // error implicit and val
    IntBinaryOperator f2 = (val x, y) -> x + y;                              // error val and implicit
    IntBinaryOperator f3 = (int x, val y) -> x + y;                          // error val and explicit

    BiFunction<String[], String, String> f4 = (val s1[], val s2) -> s2;      // error val and array

    IntBinaryOperator f5 = (val x, val y) -> x + y;                          // ok
}
