package Multime;

import java.util.ArrayList;

public class Multime {
    private int[] date;
    private int dim;
    private int n;

    public Multime() {
        this.dim = 10;
        this.date = new int[10];
        this.n = 0;
    }

    public Multime(int dimensiune) {
        this.dim = dimensiune;
        this.date = new int[dimensiune];
        this.n = 0;
    }

    public void adauga(int valoare) {
        if(this.n == 0){
            this.date[0] = valoare;
            this.n++;
            return;
        }
        if (this.n == this.dim) {
            System.out.println("S-a atins dimensiunea maxima a datelor");
            return;
        }
        int i = 0;
        while (i <= this.n) {
            if (this.date[i] == valoare) return;
            i++;
        }
        this.date[i-1] = valoare;
        this.n++;
    }

    public void extrage(int valoare) {
        int i = 0;
        boolean gasit = false;
        while (i < this.n && gasit == false) {
            if (this.date[i] == valoare) {
                gasit = true;
                for (int j = i; j < this.n; j++) {
                    this.date[j] = this.date[j + 1];
                }
                this.n--;
            }
            i++;
        }
    }

    public void afisare() {
            for (int i = 0; i < this.n; i++) {
            System.out.print(this.date[i]);
        }
        System.out.println();
    }
}




