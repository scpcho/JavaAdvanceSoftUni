package src.InterfacesAndAbstractionLab.sayHello;

public interface Person {

    String getName();

    default String sayHello(){
        return "Hello";
    }
}
