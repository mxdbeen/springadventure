package com.madbeen.thinking.in.spring.annotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * HelloWorld 模块 ImportSelector
 *
 * @author: madbeen
 * @date: 2022/03/19/4:51 PM
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {"com.madbeen.thinking.in.spring.annotation.HelloWorldConfiguration"};
    }
}
