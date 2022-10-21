package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepSample {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .setDimensions(13, 17)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(35, -62, Math.toRadians(-90)))
                                .lineToConstantHeading(new Vector2d(20, -60))
                                .lineToLinearHeading(new Pose2d(8, -32, Math.toRadians(315)))
                                .back(4)
                                .forward(4)
                                .lineToLinearHeading(new Pose2d(24, -36, Math.toRadians(180)))
                                .back(4)
                                .forward(4)
                                .lineToLinearHeading(new Pose2d(8, -32, Math.toRadians(315)))
                                .back(4)
                                .forward(4)
                                .lineToLinearHeading(new Pose2d(24,-36, Math.toRadians(180)))
                                .forward(10)
                                .build()
                );

        meepMeep.setBackground(MeepMeep.Background.FIELD_POWERPLAY_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
    }
}
