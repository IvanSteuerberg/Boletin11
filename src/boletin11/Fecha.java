package boletin11;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Fecha {
private int dia;
private int mes;
private int año;

    public int getDia() {
        return dia;
    }

    public void setDia(int d) {
        if ((año%4==0&&año%100!=0)||año%400==0){
          if (mes==2 && d<=29 && d>0)
          this.dia = d;
          else if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) && d<=31 && d>0)
          this.dia=d;
          else if (d<=30 && d>0)
          this.dia=d;
        }
          else{
          if (mes==2 && d<=28 && d>0)
        this.dia = d;
        else if((mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12) && d<=31 && d>0)
        this.dia=d;
        else if (d<=30 && d>0)
        this.dia=d;   
        }
        }

    public int getMes() {
        return mes;
    }

    public void setMes(int m) {
        if (m<=12 && m>0)
        this.mes = m;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int a) {
        if (a>0)
        this.año = a;
    }
    
    public void amosar(){
        System.out.println("\n\nLa fecha es: "+dia+"/"+mes+"/"+año);    
    }




}
