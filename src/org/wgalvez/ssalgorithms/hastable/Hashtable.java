package org.wgalvez.ssalgorithms.hastable;

import java.util.Random;

public class Hashtable {
    private int[] array;
    private static int[] index;

    public Hashtable(){
        this.array = new int[8];
        index = new int[array.length];
    }

    public static int getIndex(int i) {
        return index[i];
    }

    public int getArray(int i) {
        return array[i];
    }
    public void hashFunction(int[] array){
        for (int i = 0; i < array.length; i++){
            index[i] = array[i]%(array.length - 1);
            if (this.array[index[i]] == 0){
                this.array[index[i]] = array[i];
            }else {
                int count = index[i];
                boolean control = true;
                while (control){
                    if (count == array.length){count = 0;}
                    if (this.array[count] != 0){
                        count++;
                    }else {
                        this.array[count] = array[i];
                        index[i] = count;
                        control = false;
                    }
                }
            }
        }
    }

    public String search(int key){
        int count = 0;
        String msg = "";
        while (true){
            if (count == this.array.length){
                msg = "No hay datos asociados a esa llave.";
                break;
            }else if (key == count){
                msg = "El valor asociado a la llave '" + key + "' es " + this.getArray(key) + ".";
                break;
            }else {
                count++;
            }
        }
        return msg;
    }

    public String keyGenerator(){
        Random random = new Random();
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int iAlpha = random.nextInt(alpha.length);
        int iNum = random.nextInt(100);
        return alpha[iAlpha]+iNum;
    }
}
