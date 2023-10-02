import java.io.*;
import java.net.*;
public class client {
    String a="a";
    int porta=6789;
    DataInputStream in;
    DataOutputStream out;
    Socket m;
    BufferedReader tastiera;
    String utente;
    String ricevuta;
    DataOutputStream outVersoServer;
    BufferedReader inDalServer;
}

public Socket connetti(){
    System.out.println("i due client sono in esecuzione");
    try{
        tastiera = new BufferedReader(new InputStreamReader(System.in));
        m=new Socket(a, 6789);
        outVersoServer= new DataOutputStream(n.getOutputStream());
        inDalServer = new BufferedReader(new InputStreamReader(m.getInputStream()));
    }
    catch(UnknownHostException e ){
        System.err.println("host non coniuscito");
    }  catch(Exception e)
    {
        System.out.println(e.getMessage());
        System.out.println("errore durante la connessione");
        System.exit(1);
    }
    return m;
}
public void communica(){
    try{
        System.out.println("inserisci la stringa");
        utente=tastiera.readLine();
        System.out.println("invio e attendo");
        outVersoServer.writeBytes(utente);
        ricevuta=inDalServer.readLine();
        System.out.println("risposta");
        System.out.println("termina la connessione");
        m.close();
    }
    catch(Exception e)
    {
        System.out.println(e.getMessage());
        System.out.println("errore");
        System.exit(1);
    }
}