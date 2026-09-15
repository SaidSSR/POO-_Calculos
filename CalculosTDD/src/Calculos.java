
public class Calculos {

    /**
     * *
     * Calcula la sumatoria de los numeros entre "x" a "y", incluyendolas
     *
     * @param x
     * @param y
     * @return sumatoria
     */
    int sumarSerie(int x, int y) {
        if(x>y){
            int temp=x;
            x=y;
            y=temp;
        }
        //Recorrer y sumar
        int suma=0;
        for (int i=x; i<y;i++)
            suma=suma+i;
        return suma;
    }

    /**
     * *
     * Calcula el valor absoluto de un numero
     *
     * @param num
     * @return valor absoluto
     */
    float absoluto(float num) {
        float res=Math.abs(num);
        return res;
    }

    /**
     * *
     * Cuenta las vocales en una frase
     *
     * @param texto
     * @return cantidad de vocales
     */
    int vocales(String texto) {
        int contador = 0;
        
        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));
            
            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == '0' || letra == 'u'){
                contador++;
            }
        }
        return contador;
    }

    /**
     * *
     * Invierte el orden de las letras en cada palabra, pero no altera el orden
     * de las palabras
     *
     * @param texto
     * @return texto invertida
     */
    String invertir(String texto) {
        String[] palabras = texto.split(" ");
        String resultado = "";
        
        for (String palabra: palabras){
            String invertida = "";
            
            for (int i = palabra.length() - 1; i >=0; i--){
                invertida += palabra.charAt(i);   
            }
            
            resultado += invertida + " ";
        }
        return resultado.trim();
    }

}
