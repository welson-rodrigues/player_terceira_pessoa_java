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
public class MovimentaoJoystick extends Component { 

public float velocidade = 2;

private Vector2 deslizes = null;

public float moveSpeed;

    /// Run only once
    @Override
    public void start() {
        
        deslizes = Input.getAxis("axis").getValue();
        
    }

    /// Repeat every frame
    @Override
    public void repeat() {
        if(Input.getKey("run").isPressed()){
            moveSpeed = 5.0f;
        }else{
            moveSpeed = 2.0f;
            
            }
     
        myObject.getTransform().moveInSeconds(deslizes.getX() * velocidade, 0, deslizes.getY() * velocidade);
    }

    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
