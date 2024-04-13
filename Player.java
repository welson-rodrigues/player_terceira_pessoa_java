package JAVARuntime;

// Useful imports
import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

/** @Author Zee GameDev */
public class Player extends Component {
  private Characterbody cb;
  public float MovimentoPlayer = 1.0f;
  private Vector2 joystick = new Vector2();
  public float speedJump = 3;
  public float speedRun = 3.0f;
  public String AFPP = "JUMP";

  /// Run only once
  @Override
  public void start() {
    cb = (Characterbody) myObject.getPhysics().getPhysicsEntity();
  }

  /// Repeat every frame
  @Override
  public void repeat() {

    joystick = Input.getAxis("joystick").getValue();

    if (joystick.getX() != 0.0f && joystick.getY() != 0.0f) {
      if (Input.getKey("run").isPressed() == false) {
        cb.setForwardSpeed(joystick.getY() * MovimentoPlayer);
        cb.setSideSpeed(-joystick.getX() * MovimentoPlayer);

      } else {
        cb.setForwardSpeed(joystick.getY() * speedRun);
        cb.setSideSpeed(-joystick.getX() * speedRun);
      }

    } else {
      cb.setForwardSpeed(0.0f);
      cb.setSideSpeed(0.0f);
    }
    
     if(Input.getKey("jump").isDown()){
     if(cb.canJump()){
     cb.jump();
     cb.setJumpSpeed(speedJump);
     
  }
 }
}

  /// Repeat every frame when component or object is disabled
  @Override
  public void disabledRepeat() {}
}
