/*
 * by themaoc
 */
package herencia;

/**
 *
 * @author Mauricio Oliveros C
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        EmpleadoBaseMasComision emp = new EmpleadoBaseMasComision("Mauricio","Oliveros","1017159672-1",5000,0.4,300);
        
        //
        System.out.println("Informacion del empleado por los getters");
        System.out.printf("%s %s\n", "Primer nombre",emp.getFirstName());
        System.out.printf("%s %s\n", "Apellidos",emp.getLastName());
        System.out.printf("%s %s\n", "Seguro social",emp.getNumSegSocial());
        System.out.printf("%s %.2f\n", "Ventas Brutas",emp.getVentasBrutas());
        System.out.printf("%s %.2f\n", "Tarifa Comision",emp.getTarifaComision());
        System.out.printf("%s %.2f\n", "Salario Base",emp.getSalarioBase());
        
        //
        emp.setSalarioBase(1000000);
        //
        System.out.printf("\n%s:\n\n%s\n", "Informacion actualizada", emp.toString());
    }
    
}

// End Main Program