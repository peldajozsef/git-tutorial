package hu.bearmaster.tutorial;

import hu.bearmaster.tutorial.service.HelloService;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        String name = args.length == 1 ? args[0] : "world";
        System.out.println(HelloService.sayHello(name));
    }
}
