package edu.sda.java.advanced.annotations;

public class AnnotationUsage {
    private String name;
    @MyAnnotations(value = "someVal", name = "someName")
    public int dummyMethod() {
        return 1;
    }

}
