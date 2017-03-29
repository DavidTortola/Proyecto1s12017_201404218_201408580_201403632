package usac.rentaactivos;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Vector;

public class Login extends AppCompatActivity {

    public TextView usuario;
    public TextView password;
    public TextView empresa;
    public TextView departamento;
    Button login;
    public Boolean logeado = false;


    public static final String namespace = "http://WebService/";
    public static final String Metodo = "Login";
    public static final String accion = "http://WebService/Login";
    public static final String url = "http://192.168.1.6:8080/RentaActivosWeb(JSP)/Principal?WSDL";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.button3);
    }

    public void consumir(View view) {
        new consumirAsyc().execute();
    }

    private class consumirAsyc extends android.os.AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            if (logeado == true) {
                Toast.makeText(getApplicationContext(), "Bienvenido a nuestra aplicacion", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "Intenta de nuevo", Toast.LENGTH_SHORT).show();
            }
            super.onPostExecute(aVoid);
        }

        @Override
        protected Void doInBackground(Void... voids) {
            invoceWS();
            return null;
        }
    }

    public void invoceWS() {

        usuario = (TextView) findViewById(R.id.editText6);
        password = (TextView) findViewById(R.id.editText7);
        empresa = (TextView) findViewById(R.id.editText8);
        departamento = (TextView) findViewById(R.id.editText9);
        String user = usuario.getText().toString();
        String pass = password.getText().toString();
        String emp = empresa.getText().toString();
        String dep = departamento.getText().toString();

        SoapObject request = new SoapObject(namespace, Metodo);
        request.addProperty("user", user);
        request.addProperty("pass", pass);
        request.addProperty("empresa", emp);
        request.addProperty("departamento", dep);
        try {
            SoapSerializationEnvelope sobre = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            sobre.setOutputSoapObject(request);
            HttpTransportSE transporte = new HttpTransportSE(url);
            transporte.call(accion, sobre);
            Vector<?> responseVector = null;
            SoapObject soapObject = null;
            SoapPrimitive response = (SoapPrimitive) sobre.getResponse();


            if (Boolean.parseBoolean(response.toString()) == true) {
                //intent.putExtra("usuario", user);
                GuardarLogin(user, pass,emp,dep);

                Toast.makeText(getApplicationContext(), "Bienvenido", Toast.LENGTH_SHORT).show();
                logeado = true;
            } else {
                Toast.makeText(getApplicationContext(), "Ingrese sus datos nuevamente", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
        }
    }




    //Guardar el archivo log, para poder acceder a la cuenta sin necesidad de tener que logearse al reiniciar apk
    //-------------------------------------------------------------------------------------------------------

    public void GuardarLogin(String usuari, String pass,String empresa, String departamento) {
        String filename = "log.txt";
        String logi = usuari + "," + pass+","+empresa+","+departamento;

        try {
            File ruta_sd = Environment.getExternalStorageDirectory();

            File f = new File(ruta_sd.getAbsolutePath(), "log.txt");

            OutputStreamWriter fout =
                    new OutputStreamWriter(
                            new FileOutputStream(f));

            fout.write(logi);
            fout.close();
        } catch (Exception ex) {
            Log.e("Ficheros", "Error al escribir fichero a tarjeta SD");
        }

    }
}
