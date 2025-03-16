package ru.otus.homeworkeleven;

public class Main {
    public static void main(String[] args){

    }

    public void bubbleSort(int[] array){
        for(int i=0 i<array.length;i++){
            for(j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int value = array[j+1];
                    array[j+1] = array[j];
                    array[j] = value;
                }
            }
        }
    }

    public void quickSort(int[] array){

    }
}
