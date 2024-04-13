package JAVARuntime;

// Useful imports
import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;

/**
 * @Author 
*/
public class Pular extends Component { 
private Characterbody cb;
public float speedJump = 3;

    /// Run only once
    @Override
    public void start() {
        cb = (Characterbody)myObject.getPhysics().getPhysicsEntity();
    }

    /// Repeat every frame
    @Override
    public void repeat() {
        if(Input.getKey("jump").isDown()){
        if(cb.canJump()){
        cb.jump();
            cb.setJumpSpeed(speedJump);
        
         }
      }
  }
    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
