/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ClimbSubsystem extends SubsystemBase {

  PWMVictorSPX motor = new PWMVictorSPX(Constants.climbPort);
  /**
   * Creates a new ClimbSubsystem.
   */
  public ClimbSubsystem() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void extend() {
    motor.set(1);
  }

  public void climb() {
    motor.set(-1);
  }

  public void stop() {
    motor.set(0);
  }
}