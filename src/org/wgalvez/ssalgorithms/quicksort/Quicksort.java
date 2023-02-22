package org.wgalvez.ssalgorithms.quicksort;

import java.util.ArrayList;

public class Quicksort {
    public void quicksortL(ArrayList<Integer> arrayList, int init, int fin) {
        if (init < fin) {
            int pivote = locatePivotL(arrayList, init, fin);
            quicksortL(arrayList, init, pivote -1);
            quicksortL(arrayList, pivote + 1, fin);
        }
    }

    public int locatePivotL(ArrayList<Integer> arrayList, int init, int fin){
        boolean cond = true;
        while (init < fin){
            if (cond){
                if (arrayList.get(fin) >= arrayList.get(init) && init < fin){
                    fin--;
                }else {
                    int temp = arrayList.get(init);
                    arrayList.set(init, arrayList.get(fin));
                    arrayList.set(fin, temp);
                    cond = false;
                }
            }else {
                if (arrayList.get(init) <= arrayList.get(fin) && init < fin){
                    init++;
                }else {
                    int temp = arrayList.get(fin);
                    arrayList.set(fin, arrayList.get(init));
                    arrayList.set(init, temp);
                    cond = true;
                }
            }
        }
        return init;
    }

    public void quicksort(int[] array, int init, int fin) {
        if (init < fin) {
            int pivote = locatePivot(array, init, fin);
            quicksort(array, init, pivote -1);
            quicksort(array, pivote + 1, fin);
        }
    }
    public int locatePivot(int[] array, int init, int fin){
        boolean cond = true;
        while (init < fin){
            if (cond){
                if (array[fin] >= array[init] && init < fin){
                    fin--;
                }else {
                    int temp = array[init];
                    array[init] = array[fin];
                    array[fin] = temp;
                    cond = false;
                }
            }else {
                if (array[init] <= array[fin] && init < fin){
                    init++;
                }else {
                    int temp = array[fin];
                    array[fin] = array[init];
                    array[init] = temp;
                    cond = true;
                }
            }
        }
        return init;
    }
}
