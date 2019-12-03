package boletin11;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin11 {

    public static void main(String[] args) {
    
        //Primera parte
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA(20);
        ClasseA c1 = new ClasseA(20, 40);
        System.out.println("El objeto _a: _ contiene:" + a.getPrimari() + "," + a.getSecundari());
        System.out.println("El objeto _B: _ contiene:" + b.getPrimari() + "," + b.getSecundari());
        System.out.println("El objeto _c: _ contiene:" + c1.getPrimari() + "," + c1.getSecundari());
    
        //Segunda parte
        Media obx = new Media();
        obx.setAutor("Pepito");
        System.out.println("\n\n"+obx.getAutor());
        obx.setDurSeg(8000);
        System.out.println(obx.getDurSeg());
        obx.setNom("Lo que no se llevó");
        System.out.println(obx.getNom());
    
       //Tercera parte
       Fecha fecha = new Fecha();
       fecha.setAño(50);
       fecha.setMes(12);
       fecha.setDia(31);
       fecha.amosar();
       
       //Cuarta parte
       NumeroComplejo complejo1 = new NumeroComplejo();
       NumeroComplejo c = new NumeroComplejo(50.8,10.1);
       complejo1.add(c);
       System.out.println(complejo1.toString());
    
    }
}
