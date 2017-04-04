package com.sd.sort.v0;

public class SorterMainV0 {
    public static void main(String[] args) {
      String[] B={"John", "Adam", "Skrien", "Smith", "Jones"};
        sort(B);

        Integer[] C = {new Integer(3), new Integer(1), new Integer(4), new Integer(2)};
        sort(C);

        for(int i=0; i<B.length; i++)
            System.out.println("B["+i+"]="+B[i]);
        for(int i=0; i<C.length; i++)
            System.out.println("C["+i+"]="+C[i]);
    }
    public static void sort(Integer[] data) {
        System.out.println("[sort] sorting integers");
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(data[j] > data[indexOfMax])
                    indexOfMax=j;
                }
                Integer temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
    public static void sort(String[] data) {
        System.out.println("[sort] sorting strings");
        for(int i=data.length-1; i>=1; i--) {
            int indexOfMax=0;
            for(int j=1; j<=i; j++) {
                if(data[j].compareTo(data[indexOfMax]) > 0)
                    indexOfMax=j;
                }
                String temp=data[i];
                data[i]=data[indexOfMax];
                data[indexOfMax]=temp;
        }
    }
}