public class App {
    public static void main(String[] args) throws Exception {
        int[] array = {3,5,8,13,19,21,25,26,28,32,39,41};
        int target = 21;
        int min = 0;
        int max = array.length -1;
        // Forma 1 : Recursividad
        System.out.println("FORMA RECURSIVA");
        int respuesta = findIndex(array, target, min, max);
        System.out.println("El elemento objetivo: " + target + 
        " esta ubicado en mi array en la posición: " + respuesta + 
        " Y su valor es " + array[respuesta]);
        System.out.println("FORMA CICLO REPETITIVO");
        //boolean exito = true;
        int respExito = 0;
        while (true) {
            int guess = (min+max)/2;
            if(array[guess]==target){
                respExito = guess;
                break;
                //exito = false;
            }else if(array[guess] < target){
                min = guess+1;
            }else{
                max = guess -1;
            }
        }
        System.out.println("Mi variable objetivo: " + target + 
        " esta ubicado en mi array en la posición: " + respExito + 
        " Y su valor es " + array[respExito]);

    }
    public static int findIndex(int[] array,
    int target, int min,int max){
        int guess = (min+max)/2;
        if(array[guess] == target) return guess;
        if (array[guess] < target) {
            return findIndex(array, target, guess + 1, max);
        }else{
            return findIndex(array, target, min, guess - 1);
        }
    }
}
