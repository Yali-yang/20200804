package com.example.yali.test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Yali
 * @date 2020-06-19 22:56:01
 * @description
 **/
public class LambdaController {
    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
     //   Consumer;
        Consumer<String> son = (s) -> System.out.println(s);
        son.accept("Consumer");

        Supplier<String> sup = () -> "Supplier";
        System.out.println(sup.get());

        Function<Integer,String> function = (s) -> s.toString() + "Function";
        System.out.println(function.apply(10086));

        Predicate<String> predicate = (flag) -> true;
        System.out.println(predicate.test(""));



    }


}
