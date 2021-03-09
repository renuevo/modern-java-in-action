package com.github.renuevo;

import com.github.renuevo.functionalinterface.DefaultFunctionalInterface;
import com.github.renuevo.functionalinterface.LambdaExceptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class ModernJavaInActionApplication implements CommandLineRunner {

    private final DefaultFunctionalInterface defaultFunctionalInterface;
    private final LambdaExceptionService lambdaExceptionService;

    public static void main(String[] args) {
        SpringApplication.run(ModernJavaInActionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        defaultFunctionalInterface.testConsumer();
        defaultFunctionalInterface.testFunction();
        defaultFunctionalInterface.testPredicate();
        defaultFunctionalInterface.testRunnable();
        defaultFunctionalInterface.testSupplier();
        lambdaExceptionService.interfaceExceptionExecute();

    }
}
