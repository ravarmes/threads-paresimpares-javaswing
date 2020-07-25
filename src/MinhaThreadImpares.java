import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

public class MinhaThreadImpares implements Runnable{

    private final JTextArea jTextAreaImpares;
    
    public MinhaThreadImpares(JTextArea textArea){
        jTextAreaImpares = textArea;
    }
    
    @Override
    public void run(){
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 != 0) {
                this.jTextAreaImpares.append("\n" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MinhaThreadPares.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    
}
