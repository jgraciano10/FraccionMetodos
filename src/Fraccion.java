public class Fraccion {


    public String suma(String num1, String num2) {
        String[] numUnoMatriz = num1.split("/");
        String[] numDosMatriz = num2.split("/");
        int numerador;
        int denominador;

        if (numUnoMatriz.length == 2 && numDosMatriz.length == 2) {
            int valorUnoNumerador = (Integer.parseInt(numUnoMatriz[0])) * (Integer.parseInt(numDosMatriz[1]));
            int valorDosNumerador = (Integer.parseInt(numDosMatriz[0])) * (Integer.parseInt(numUnoMatriz[1]));
            numerador = valorUnoNumerador + valorDosNumerador;
            denominador = (Integer.parseInt(numUnoMatriz[1])) * (Integer.parseInt(numDosMatriz[1]));

            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else if (numUnoMatriz.length == 2){
            int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
            int valorDosNumerador = (Integer.parseInt(numDosMatriz[0])) * (Integer.parseInt(numUnoMatriz[1]));
            numerador = valorUnoNumerador + valorDosNumerador;
            denominador = Integer.parseInt(numUnoMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }
        else if (numDosMatriz.length == 2){
            int valorUnoNumerador = (Integer.parseInt(numUnoMatriz[0])) * (Integer.parseInt(numDosMatriz[1]));
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]) ;
            numerador = valorUnoNumerador + valorDosNumerador;
            denominador = Integer.parseInt(numDosMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else{
            numerador = (Integer.parseInt(numUnoMatriz[0])) + (Integer.parseInt(numDosMatriz[0]));
            return Integer.toString(numerador);
        }


    }

    public String suma(int num1, String num2) {
        String[] numDosMatriz = num2.split("/");
        int numerador;
        int denominador;
        if (numDosMatriz.length == 2){
            int valorUnoNumerador = num1 * Integer.parseInt(numDosMatriz[1]);
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
            numerador = valorUnoNumerador + valorDosNumerador;
            denominador = Integer.parseInt(numDosMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else{
            numerador = num1 + (Integer.parseInt(numDosMatriz[0]));
            return Integer.toString(numerador);
        }


    }
    public String suma(String num1, int num2) {
        String[] numUnoMatriz = num1.split("/");
        int numerador;
        int denominador;
        if (numUnoMatriz.length == 2){
            int valorUnoNumerador = num2 * Integer.parseInt(numUnoMatriz[1]);
            int valorDosNumerador = Integer.parseInt(numUnoMatriz[0]);
            numerador = valorUnoNumerador + valorDosNumerador;
            denominador = Integer.parseInt(numUnoMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else{
            numerador = num2 + (Integer.parseInt(numUnoMatriz[0]));
            return Integer.toString(numerador);
        }


    }

    //Resta
    public String resta(String num1, String num2) {
        String[] numUnoMatriz = num1.split("/");
        String[] numDosMatriz = num2.split("/");
        int numerador;
        int denominador;

        if (numUnoMatriz.length == 2 && numDosMatriz.length == 2) {
            int valorUnoNumerador = (Integer.parseInt(numUnoMatriz[0])) * (Integer.parseInt(numDosMatriz[1]));
            int valorDosNumerador = (Integer.parseInt(numDosMatriz[0])) * (Integer.parseInt(numUnoMatriz[1]));
            numerador = valorUnoNumerador - valorDosNumerador;
            denominador = (Integer.parseInt(numUnoMatriz[1])) * (Integer.parseInt(numDosMatriz[1]));

            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else if (numUnoMatriz.length == 2){
            int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
            int valorDosNumerador = (Integer.parseInt(numDosMatriz[0])) * (Integer.parseInt(numUnoMatriz[1]));
            numerador = valorUnoNumerador - valorDosNumerador;
            denominador = Integer.parseInt(numUnoMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }
        else if (numDosMatriz.length == 2){
            int valorUnoNumerador = (Integer.parseInt(numUnoMatriz[0])) * (Integer.parseInt(numDosMatriz[1]));
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]) ;
            numerador = valorUnoNumerador - valorDosNumerador;
            denominador = Integer.parseInt(numDosMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else{
            numerador = (Integer.parseInt(numUnoMatriz[0])) - (Integer.parseInt(numDosMatriz[0]));
            return Integer.toString(numerador);
        }


    }
    public String resta(int num1, String num2) {
        String[] numDosMatriz = num2.split("/");
        int numerador;
        int denominador;
        if (numDosMatriz.length == 2){
            int valorUnoNumerador = num1 * Integer.parseInt(numDosMatriz[1]);
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
            numerador = valorUnoNumerador - valorDosNumerador;
            denominador = Integer.parseInt(numDosMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else{
            numerador = num1 - (Integer.parseInt(numDosMatriz[0]));
            return Integer.toString(numerador);
        }


    }
    public String resta(String num1, int num2) {
        String[] numUnoMatriz = num1.split("/");
        int numerador;
        int denominador;
        if (numUnoMatriz.length == 2){
            int valorUnoNumerador = num2 * Integer.parseInt(numUnoMatriz[1]);
            int valorDosNumerador = Integer.parseInt(numUnoMatriz[0]);
            numerador = valorUnoNumerador - valorDosNumerador;
            denominador = Integer.parseInt(numUnoMatriz[1]);
            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        }else{
            numerador = num2 - (Integer.parseInt(numUnoMatriz[0]));
            return Integer.toString(numerador);
        }


    }

    public String multiplicacion(String num1, String num2) {
        String[] numUnoMatriz = num1.split("/");
        String[] numDosMatriz = num2.split("/");
        int numerador;
        int denominador;
        if (numUnoMatriz.length == 2 && numDosMatriz.length == 2) {
            int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
            numerador = valorUnoNumerador * valorDosNumerador;
            int valorUnoDenominador = Integer.parseInt(numUnoMatriz[1]);
            int valorDosDenominador = Integer.parseInt(numDosMatriz[1]);
            denominador = valorUnoDenominador * valorDosDenominador;

            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        } else if (numUnoMatriz.length == 2) {
            int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
            numerador = valorUnoNumerador * valorDosNumerador;
            int valorUnoDenominador = Integer.parseInt(numUnoMatriz[1]);

            denominador = valorUnoDenominador;

            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        } else if (numDosMatriz.length == 2) {
            int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
            numerador = valorUnoNumerador * valorDosNumerador;
            int valorUnoDenominador = Integer.parseInt(numDosMatriz[1]);

            denominador = valorUnoDenominador;

            return Integer.toString(numerador) + "/" + Integer.toString(denominador);
        } else {
            int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
            int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
            numerador = valorUnoNumerador * valorDosNumerador;

            return Integer.toString(numerador);
        }
    }

        public String division(String num1, String num2) {
            String[] numUnoMatriz = num1.split("/");
            String[] numDosMatriz = num2.split("/");
            int numerador;
            int denominador;
            if(numUnoMatriz.length == 2 && numDosMatriz.length == 2) {
                int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
                int valorDosNumerador = Integer.parseInt(numDosMatriz[1]);
                numerador = valorUnoNumerador * valorDosNumerador;
                int valorUnoDenominador = Integer.parseInt(numUnoMatriz[1]);
                int valorDosDenominador = Integer.parseInt(numDosMatriz[0]);
                denominador = valorUnoDenominador*valorDosDenominador;

                return Integer.toString(numerador) + "/" + Integer.toString(denominador);
            }else if (numUnoMatriz.length == 2){
                int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);

                numerador = valorUnoNumerador;
                int valorUnoDenominador = Integer.parseInt(numUnoMatriz[1]);
                int valorDosDenominador = Integer.parseInt(numDosMatriz[0]);
                denominador = valorUnoDenominador*valorDosDenominador;

                return Integer.toString(numerador) + "/" + Integer.toString(denominador);
            }else if (numDosMatriz.length == 2){
                int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
                int valorDosNumerador = Integer.parseInt(numDosMatriz[1]);
                numerador = valorUnoNumerador * valorDosNumerador;
                int valorUnoDenominador = Integer.parseInt(numDosMatriz[0]);

                denominador = valorUnoDenominador;

                return Integer.toString(numerador) + "/" + Integer.toString(denominador);
            }else{
                int valorUnoNumerador = Integer.parseInt(numUnoMatriz[0]);
                int valorDosNumerador = Integer.parseInt(numDosMatriz[0]);
                numerador =  valorUnoNumerador;
                denominador= valorDosNumerador;

                return Integer.toString(numerador) + "/" +Integer.toString(denominador);
            }

    }


}
