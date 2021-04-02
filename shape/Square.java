package com.company.shape;

public class Square extends PackageSumm {
    Square( int dim1,int dim2){
        super(dim1,-1);
    }
    public int area () {
        return this.dim1 * this.dim1;
    }
}