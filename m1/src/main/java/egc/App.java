package egc;

import org.apache.log4j.*; 

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log=Logger.getLogger(App.class);

    // TODO Completar metodo
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    static int getVal(){
    log.info("Returning 1");
	return 1;
    }

}
