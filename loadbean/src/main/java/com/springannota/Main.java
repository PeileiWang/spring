package com.springannota;

import com.springannota.configuration.CDPlayConfig;
import com.springannota.soundsystem.CompactDisc;
import com.springannota.soundsystem.SgtPeppers;
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
