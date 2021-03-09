package com.github.renuevo.functionalinterface;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.function.*;

@Slf4j
@Service
public class DefaultFunctionalInterface {

    public void testRunnable() {
        Runnable runnable = () -> log.info("단순 실행!");
        runnable.run();
    }

    public void testSupplier() {
        Supplier<String> supplier = () -> "Data Get!";
        log.info(supplier.get());
    }

    public void testConsumer() {
        Consumer<String> consumer = str -> log.info("Data " + str);
        consumer.accept("Merge");
    }

    public void testFunction() {
        Function<String, String> function = str -> "Data " + str;   //UnaryOperator
        log.info(function.apply("Merge"));

        UnaryOperator<String> unaryOperator = str -> "Data " + str;
        log.info(unaryOperator.apply("Merge"));
    }

    public void testPredicate() {
        Predicate<String> equalsPredicate = Predicate.isEqual("Data");
        log.info(String.valueOf(Boolean.valueOf(equalsPredicate.test("Data"))));
    }

}
