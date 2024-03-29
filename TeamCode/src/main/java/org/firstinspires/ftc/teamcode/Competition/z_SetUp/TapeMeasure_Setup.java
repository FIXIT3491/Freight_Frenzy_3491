package org.firstinspires.ftc.teamcode.Competition.z_SetUp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Season_Setup.Ducky;


@TeleOp(name="Tape Measure Setup", group="Setup")

public class TapeMeasure_Setup extends OpMode {

    // Initializing Robot Class
    Ducky ducky = new Ducky();

    /**
     * Initializing the Program
     */
    @Override
    public void init() {

        // Initialize all motors/ servos
        ducky.init(hardwareMap, telemetry);

        ducky.holdTapeMeasure();

        // Indicate that the program is running
        telemetry.addData("Tape Measure", "Retracted");

        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }

    /**
     * Code to run one time after Driver hits "Play."
     */
    @Override
    public void start() {
        ducky.holdTapeMeasure();
    }

    /**
     * TeleOp loop once Driver hits "Play."
     */
    @Override
    public void loop() {

        // Reset Encoder Value for motor
        if (gamepad1.a || gamepad2.a) {
            ducky.holdTapeMeasure();
            // extend (doesnt shoot)
        } else if (gamepad1.y || gamepad2.y) {
            ducky.shootTapeMeasure();
            // shoot
        }
    }

    /**
     * Code to run after Driver hits "Stop."
     */
    @Override
    public void stop() {
        ducky.holdTapeMeasure();
    }
}