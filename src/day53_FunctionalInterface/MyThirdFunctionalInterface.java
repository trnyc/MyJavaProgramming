package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface <T>{

    T method(T data); // this method is public and abstract by default
                    // T can be any name and it stands for GENERIC TYPE, you can use it (in a different class)
                    // as String, Integer or any type you want
}

/*
2. Create a Functional interface named MyThirdFunctionalInterface that has an abstract method takes
one argument of any type and returns the same type
 */