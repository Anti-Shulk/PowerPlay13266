package org.firstinspires.ftc.teamcode.util;

import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.config.reflection.ReflectionConfig;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InitializeTuning {
    private static final Set<String> IGNORED_PACKAGES = new HashSet<>(Arrays.asList(
            "java",
            "android",
            "com.sun",
            "com.vuforia",
            "com.google",
            "kotlin"
    ));
    public void function() {


        ReflectionConfig.scanForClasses(IGNORED_PACKAGES);

        FtcDashboard.getInstance().updateConfig();
        FtcDashboard.getInstance().getConfigRoot();
    }

}
