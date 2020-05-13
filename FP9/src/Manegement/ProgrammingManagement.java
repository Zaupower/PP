package Manegement;

import Objects.Colaborator;
import Objects.ProjectManager;

import java.util.Arrays;

public class ProgrammingManagement {
    Colaborator colaborators[] = new Colaborator[10];
    int counter = 0;

    public void setColaborators(Colaborator colaborators) {
        this.colaborators[counter] = colaborators;
        counter++;
    }
    public void print(){
        for (int i =0 ; i<counter;i++){
            System.out.println(colaborators[i].toString());
        }
    }

    public void findProjectManager(){
        for (int i =0 ; i<counter;i++){
            if (colaborators[i] instanceof ProjectManager){
                System.out.println(colaborators[i].toString());
            }
        }
    }
}
