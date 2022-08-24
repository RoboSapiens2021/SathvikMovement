package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;



@TeleOp()
public class MainActivity extends OpMode{
    private ElapsedTime runtime = new ElapsedTime();

    @Override
    public void init(){
       // telemetry.addData("Hello World");
        //telemetry.addData("Status", "Run Time: " + runtime.toString());
        telemetry.addData("hahaha", "HGFGFGFGFGFGFGF");
        telemetry.addData("Status", "Odiyesssaaa");
        //telemetry.update();
    }

    @Override
    public void loop(){

        telemetry.addData("hahaha", "HGFGFGFGFGFGFGF");
    }

}