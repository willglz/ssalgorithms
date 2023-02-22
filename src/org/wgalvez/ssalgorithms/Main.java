package org.wgalvez.ssalgorithms;

import org.wgalvez.ssalgorithms.hastable.Hashtable;
import org.wgalvez.ssalgorithms.quicksort.Quicksort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------")
                .append("\n| SORTING & SEARCH ALGORITHMS |")
                .append("\n-------------------------------")
                .append("\n| 1) Quicksort Algorithm\t  |")
                .append("\n| 2) Hash Table\t\t\t\t  |")
                .append("\n-------------------------------");
        System.out.println(sb);
        int opc = sc.nextInt();
        if (opc == 1){
            sb.append("\n|     QUICKSORT ALGORITHM     |")
                    .append("\n| 1) Arrays\t\t\t\t\t  |")
                    .append("\n| 2) Array List\t\t\t\t  |")
                    .append("\n-------------------------------");
            System.out.println(sb);
            opc = sc.nextInt();
            Quicksort qs = new Quicksort();
            if (opc == 1){
                Scanner sn = new Scanner(System.in);
                System.out.print("Ingrese el tamaño del arreglo a generar: ");
                int index = sn.nextInt();
                int[] array = new int[index];
                Random random = new Random();
                for (int i = 0; i < index; i++){
                    int numberR = random.nextInt(31);
                    array[i] = numberR;
                }
                System.out.println("LISTA ORIGINAL");
                System.out.print("[ ");
                for (int l: array){
                    System.out.print(l + " ");
                }
                qs.quicksort(array, 0, array.length - 1);
                System.out.println("]" + "\nLISTA ORDENADA POR ALGORITMO QUICKSORT");
                System.out.print("[ ");
                for (int l: array){
                    System.out.print(l + " ");
                }
                System.out.print("]");
            }else if (opc == 2){
                Scanner sn = new Scanner(System.in);
                System.out.print("Ingrese el tamaño de la lista a generar: ");
                int index = sn.nextInt();
                ArrayList<Integer> arrayList = new ArrayList<>();
                Random random = new Random();
                for (int i = 0; i < index; i++){
                    int numberR = random.nextInt(31);
                    arrayList.add(numberR);
                }
                System.out.println("LISTA ORIGINAL");
                System.out.print("[ ");
                for (int l: arrayList){
                    System.out.print(l + " ");
                }
                qs.quicksortL(arrayList, 0, arrayList.size() - 1);
                System.out.println("]" + "\nLISTA ORDENADA POR ALGORITMO QUICKSORT");
                System.out.print("[ ");
                for (int l: arrayList){
                    System.out.print(l + " ");
                }
                System.out.print("]");
            }
        }else if (opc == 2){
            sb.append("\n|          HASH TABLE         |")
                    .append("\n| 1) Arrays\t\t\t\t\t  |")
                    .append("\n| 2) Hash Maps\t\t\t\t  |")
                    .append("\n-------------------------------");
            System.out.println(sb);
            Hashtable hashtable = new Hashtable();
            opc = sc.nextInt();
            if (opc == 1){
                int[] list = {20, 33, 21, 10, 12, 14, 56, 100};
                hashtable.hashFunction(list);
                for (int i = 0; i < list.length; i++){
                    int index = Hashtable.getIndex(i);
                    System.out.println("[" + index +"] -> " + hashtable.getArray(index));
                }
                System.out.println("Ingrese la llave asociada al valor a buscar");
                int key = sc.nextInt();
                System.out.println(hashtable.search(key));
            }else if (opc == 2){
                HashMap<String, Integer> hashMap = new HashMap<>();
                hashMap.put(hashtable.keyGenerator(), 20);
                hashMap.put(hashtable.keyGenerator(), 33);
                hashMap.put(hashtable.keyGenerator(), 21);
                hashMap.put(hashtable.keyGenerator(), 10);
                hashMap.put(hashtable.keyGenerator(), 12);
                hashMap.put(hashtable.keyGenerator(), 14);
                hashMap.put(hashtable.keyGenerator(), 56);
                hashMap.put(hashtable.keyGenerator(), 100);
                for (String s: hashMap.keySet()){
                    System.out.println("[" + s +"] -> " + hashMap.get(s));
                }
                System.out.println("Ingrese la llave asociada al valor a buscar");
                String hasKey = sc.next();
                if (hashMap.get(hasKey.toUpperCase()) != null){
                    System.out.println("El valor asociado a la llave '" + hasKey.toUpperCase() + "' es " + hashMap.get(hasKey.toUpperCase()));
                }else {
                    System.out.println("No hay datos asociados a esa llave.");
                }
            }
        }
    }
}
