

package forma1;

/**
 *
 * @author T107
 */
public class Intermedio implements Runnable {
    
    public static void main (String args []){
        
        Runnable r= new Intermedio();
        Thread t1=new Thread(r);
        t1.start();
        Thread t2= new Thread (r);
        t2.start();
        Thread t3= new Thread  (r);
        t3.start();
        
        t1.setName("Impresion");
        
        t2.setName("Conexion");
        
        t3.setName("Guardar");
        
    }

    @Override
    public void run() {
        
        try {
            
        if(Thread.currentThread().getName().equals("Conexion"))Thread.sleep(2000);
        if(Thread.currentThread().getName().equals("Guardar"))Thread.sleep(4000);
        if(Thread.currentThread().getName().equals("iImpresion"))Thread.sleep(6000);
 
        System.out.println(Thread.currentThread().getName());
        System.out.println("SOY UN THREAD MEDIO DIFICIL");
        
        }catch(Exception e){}
    }
    
}


