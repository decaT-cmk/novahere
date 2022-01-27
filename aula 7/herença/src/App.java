import classes.motorista;

public class App {
    private static final String ABC123 = null;

    public static void main(String[] args) throws Exception {
       
        motorista m1 = new motorista();
        
        m1. setMatricula(123);
        m1.setHabilitacao(ABC123);
        
        
        System.out.printf("HABILITAÇÃO DO MOTORISTA %5 É: %5 m1.getNome(),m1.getHabilitacao()");
    
    }
}
