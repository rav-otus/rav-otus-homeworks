package ru.otus.homeworkfourteen;

public class Main {
    public static void main(String[] args){
        double[] array1;
        double[] array2;
        int sizeArray=100_000_000;

        //array1 = createArrayOneThread(sizeArray);
        array2 = createArrayMultiThread(sizeArray);

        //for(int i=sizeArray-1;i<=sizeArray-50;i--){
            //System.out.println(" "+array1[50_000_000]+" "+array1[70_000_000]);
            System.out.println(" "+array2[50_000_000]+" "+array2[60_000_000]);
        //}
    }

    public static double[] createArrayOneThread(int size){
        double[] array = new double[size];
        long timeBegin = System.currentTimeMillis();
        for(int i=0; i<array.length;i++){
            array[i] = 1.14*Math.cos(i)*Math.sin(i*0.2)*Math.cos(i/1.2);
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Время выполнения в одном потоке: "+ (timeEnd-timeBegin));
        return array;
    }

    public static double[] createArrayMultiThread(int size){
        double[] array = new double[size];
        long timeBegin = System.currentTimeMillis();
        MyThread thread1 = new MyThread(array, 0, (int)(size/4-1));
        MyThread thread2 = new MyThread(array, (int)(size/4), (int)(size/2-1));
        MyThread thread3 = new MyThread(array, (int)(size/2), (int)(3*size/4-1));
        MyThread thread4 = new MyThread(array, (int)(3*size/4), size-1);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        long timeEnd = System.currentTimeMillis();
        System.out.println("1 часть: "+ (int)(size/4-1)+" 2 часть: "+ (int)(size/2-1)+" 3 часть: "+ (int)(3*size/4-1));
        System.out.println("Время выполнения в четырёх потоках: "+ (timeEnd-timeBegin));
        System.out.println("Первый и последний элементы массива: "+ array[0]+" "+array[size-1]);
        return array;
    }
}

