/*
 * @test
 * @compile/fail/ref=ValInMethodSignature.out -XDrawDiagnostics ValInMethodSignature.java
 */


class ValInMethodSignature {
    // 'val' in method signature
    // error
    void test(val number) { }
}
