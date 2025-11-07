
package application;

import java.io.BufferedReader ;
import java.io.BufferedWriter ;
import java.io.IOException ;
import java.io.InputStreamReader ;
import java.io.OutputStreamWriter ;
import java.net.Socket ;

/**
 * 
 * @author Ben
 *
 * @version 1.0 2025-11-06 Initial implementation
 *
 *
 * @since 1.0
 */
public class TCPClient implements Runnable
    {

    String clientID ;
    Socket clientSocket ;
    BufferedReader in ;
    BufferedWriter out ;
    Thread thread ;
    
    
    /**
     * 
     *
     * @since 1.0
     */
    public TCPClient(String id, String hostIP, int port) throws IOException
        {

        this.clientID = id;
        this.clientSocket = new Socket(hostIP, port);
        this.in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()) );
        this.out = new BufferedWriter(new OutputStreamWriter(this.clientSocket.getOutputStream()) );
        this.thread = new Thread(this);
        this.thread.start();
        
        }


    @Override
    public void run()
        {

        try 
            {
        //stuff happens
            } 
        catch( IOException e)
            {
            e.printStackTrace();
            }
        
        

        }

    }
   // end class TCPClient