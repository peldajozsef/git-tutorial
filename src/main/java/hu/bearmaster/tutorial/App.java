package hu.bearmaster.tutorial;

import hu.bearmaster.tutorial.service.HelloService;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        String name = args.length > 0 ? String.join(" ", args) : "world";
        System.out.println(HelloService.sayHello(name));
    }
}
