package org.firstinspires.ftc.teamcode.opmode.test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Vision;

@TeleOp
public class VisionTest2  extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Vision vision = new Vision(this);

        vision.init();
        while (!isStarted() && !isStopRequested())
        {
           vision.updateTagOfInterest();
           vision.printTagData();
           telemetry.update();
        }
        switch (vision.getTagOfInterest().id) {
            case 1: {

            }
            case 2: {

            }
            case 3: {

            }
        }
    }
}
