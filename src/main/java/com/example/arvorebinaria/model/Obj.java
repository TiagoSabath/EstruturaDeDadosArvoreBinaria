package com.example.arvorebinaria.model;

import java.util.Comparator;
import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;

    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Obj obj)) return false;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        if (meuValor > outro.meuValor) {
            i = 1;
        } else if (meuValor < outro.meuValor) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
