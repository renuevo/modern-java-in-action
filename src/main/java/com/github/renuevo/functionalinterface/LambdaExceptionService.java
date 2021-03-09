package com.github.renuevo.functionalinterface;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LambdaExceptionService {

    public void interfaceExceptionExecute() {
        Lists.newArrayList("test")
                .stream()
                .map(FunctionalInterfaceWrapper.executeWrap(data -> {
                    if (true) throw new RuntimeException("Test Excetpion");
                    return data;
                }))
                .forEach(log::info);
    }
}
