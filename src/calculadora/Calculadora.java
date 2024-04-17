package calculadora;

public class Calculadora {
    public static void main(String[] args) {
        int numeroA;
        int numeroB;
        String signo;

        System.out.println("calculadora.calculadora.Calculadora iniciada");
        numeroA = Integer.parseInt(args[0]);
        signo = args[1];
        numeroB = Integer.parseInt(args[2]);
        float resultado=0;

        switch (signo) {
            case "+" -> resultado= numeroA +numeroB;
            case "-" -> resultado= numeroA - numeroB;
            case "*" -> resultado= numeroA* numeroB;
            case "/" -> resultado = (float) numeroA/ numeroB;
            default ->  System.out.println(("No se reconoce la operacion"));
        }
        System.out.println("RESULTADO: " + resultado);
    }
}


