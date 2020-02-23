package ejercicio.pkg10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Ejercicio10 {

    public static void main(String[] args) throws IOException {
        Integer a;
        String b;
        Double c;
        GregorianCalendar d = (GregorianCalendar) GregorianCalendar.getInstance();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader (isr);
        System.out.print ("Por favor introduzca el numero de certificado:");
        a = Integer.parseInt (br.readLine());
        System.out.print ("Por favor introduzca el apellido apellido del dueño de la cuenta:");
        b = br.readLine();
        System.out.print ("Por favor introduzca el saldo:");
        c = Double.parseDouble(br.readLine());
        System.out.print ("Por favor introduzca el dia:");
        Integer dia=Integer.parseInt (br.readLine());
        System.out.print ("Por favor introduzca el mes:");
        Integer mes=Integer.parseInt (br.readLine())-1;
        System.out.print ("Por favor introduzca el año:");
        Integer anio=Integer.parseInt (br.readLine());
        d.set(anio, mes, dia);
        CertificateOfDeposit c1=new CertificateOfDeposit(a,b,c,d);
        System.out.println(c1.toString())   ;
    }
    
}
