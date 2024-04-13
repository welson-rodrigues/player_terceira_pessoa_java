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
public class CameraPlayer extends Component { 
public float rotateSpeed = 5.0f;


    /// Run only once
    @Override
    public void start() {
        
    }

    /// Repeat every frame
    @Override
    public void repeat() {
       Vector2 slide = Input.getAxis("slide").getValue();
        myObject.getTransform().rotateInSeconds(slide.getY() * rotateSpeed, - slide.getX() * rotateSpeed, 0);
        myObject.getTransform().getRotation().setZ(0);
}
    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
