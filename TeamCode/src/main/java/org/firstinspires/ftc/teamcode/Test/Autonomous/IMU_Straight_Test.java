package org.firstinspires.ftc.teamcode.Test.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.Season_Setup.Ducky;


@Autonomous(name="IMU Test - Straight")
@Disabled
public class IMU_Straight_Test extends LinearOpMode {

    // Initializing Robot Class
    Ducky ducky = new Ducky();

    @Override
    public void runOpMode() {

        // Initialize all motors/ servos
        ducky.init(hardwareMap, telemetry);

        // Reset Encoders, and Telemetry Update
        telemetry.addData("Status", "Resetting Encoders");
        telemetry.update();
        ducky.BackLeft.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);
        ducky.BackRight.setMode(DcMotorEx.RunMode.STOP_AND_RESET_ENCODER);

        // Encoder Position Update
        telemetry.addData("Encoder Position",  "Starting at %7d :%7d",
                ducky.BackLeft.getCurrentPosition(),
                ducky.BackRight.getCurrentPosition());
        telemetry.update();

        // Wait for the game to begin
        telemetry.addData(">", "Press Play to start op mode");
        telemetry.update();

        // Waiting for the program to start
        waitForStart();

        // Autonomous Pathing

    }
}
