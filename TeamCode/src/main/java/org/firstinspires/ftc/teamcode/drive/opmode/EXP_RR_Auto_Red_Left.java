package org.firstinspires.ftc.teamcode.drive.opmode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.geometry.Vector2d;
import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous (name="EXP_RR_Auto_Red_Left")
public class EXP_RR_Auto_Red_Left extends LinearOpMode {
    @Override
    public void runOpMode() {
        SampleMecanumDrive drive = new SampleMecanumDrive(hardwareMap);

        waitForStart();
        TrajectorySequence EXP_Auto_Red_Left = drive.trajectorySequenceBuilder(new Pose2d())
                .forward(56)
                .turn(Math.toRadians(-47))
                //Place Cone
                .turn(Math.toRadians(-39))
                .back(20)
                //Grab Cone
                .forward(20)
                .turn(Math.toRadians(54))
                //place cone
                .turn(Math.toRadians(-54))
                .back(20)
                //Grab Cone
                .forward(20)
                .turn(Math.toRadians(54))
                //place cone
                .turn(Math.toRadians(-54))
                .back(20)
                //Grab Cone
                .forward(20)
                .turn(Math.toRadians(54))
                //place cone
                .turn(Math.toRadians(-54))
                .back(20)
                //Grab Cone
                .forward(20)
                .turn(Math.toRadians(54))
                //place cone
                .turn(Math.toRadians(-54))
                .back(20)
                //Grab Cone
                .forward(20)
                .turn(Math.toRadians(54))
                .build();

        waitForStart();

        if(isStopRequested()) return;

        drive.followTrajectorySequence(EXP_Auto_Red_Left);
    }
}