package JAVARuntime;

// Useful imports
import java.util.*;
import java.text.*;
import java.net.*;
import java.math.*;
import java.io.*;
import java.nio.*;
public class Correr extends Component {
    
public float correr;

    /// Run only once
    @Override
    public void start() {
        
    }

    /// Repeat every frame
    @Override
    public void repeat() {
       if(Input.getKey("correr").isPressed()) {
           correr = 10;
       }else{
           correr = 2;
    }
}
    /// Repeat every frame when component or object is disabled
    @Override
    public void disabledRepeat() {
        
    }
}
