package com.spring;

import com.spring.configuration.CDPlayConfig;
import com.spring.soundsystem.CompactDisc;
import com.spring.soundsystem.SgtPeppers;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Wangpl
 * Time 2018/8/28 21:59
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayConfig.class);
        CompactDisc compactDisc = ctx.getBean(SgtPeppers.class);
        compactDisc.play();
    }
}
