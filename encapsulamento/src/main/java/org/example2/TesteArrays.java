package org.example2;
import java.util.Arrays;


public class TesteArrays {
    public static void main(String[] args){

        int[] array1 = {2,3,5,7,11,13,17,19};
        int[] array2 = array1;

        for (int i = 0; i< array2.length;i++){
            if(array2[i] %2 == 0){
                array2[i] = i;
            }
        }

        String arr = Arrays.toString(array1);
        System.out.println(arr);


        int [][] matriz = new int[5][];

        for(int c = 0; c < matriz.length; c++){
            matriz[c] =  new int[c];
            for(int j = 0; j<matriz[c].length;j++){
                matriz[c][j] = j*c;
            }
            arr = Arrays.toString(matriz[c]);
            System.out.println(arr);

        }
        arr = Arrays.deepToString(matriz);
        System.out.println(arr);


    }

    public static void exibirArray(int[] ar){
        System.out.print("<");
        for(int i = 0; i<ar.length;i++){
            System.out.print(ar[i]);
            if((i+1) < ar.length){
                System.out.print(",");
            }
        }
        System.out.print(">");
    }

}
