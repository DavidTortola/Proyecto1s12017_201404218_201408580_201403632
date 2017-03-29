/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.proyecto1escritorio_201404218;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;


/**
 *
 * @author David Tórtola
 */
public class EDDProyecto1Escritorio_201404218 {

    public static OkHttpClient webClient = new OkHttpClient();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal form1 = new Principal();
        form1.setVisible(true);
    }
        //Método que conecta con el servidor de python
    public static String getString(String metodo, RequestBody formBody) {

        try {
            
            URL url = new URL("http://0.0.0.0:5000/" + metodo);
            Request request = new Request.Builder().url(url).post(formBody).build();
            Response response = webClient.newCall(request).execute();
            String response_string = response.body().string();
            return response_string;
            
        } catch (MalformedURLException ex) {
            
            java.util.logging.Logger.getLogger(edd.proyecto1escritorio_201404218.EDDProyecto1Escritorio_201404218.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(edd.proyecto1escritorio_201404218.EDDProyecto1Escritorio_201404218.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
