package com.lfa.day1;
public class Find{
    int l, b, h,area,volume,perimeter,square,cube;
    public Find(int l,int b, int h){
        this.l = l;
        this.b = b;
        this.h = h;
    }
    public int getArea(){
        area = l*b;
        return area;
    }
    public int getVolume(){
        volume = l*b*h;
        return volume;
    }
    public int getPerimeter(){
        perimeter = 2*(l+b);
        return perimeter;
    }
    public int getSquare(){
        square = l*l;
        return square;
    }
    public int getCube(){
        cube = l*l*l;
        return cube;
    }
    public void print(){
        System.out.println("The area is" + getArea());
        System.out.println("The volume is" + getVolume());
        System.out.println("The perimeter is" + getPerimeter());
        System.out.println("The square is" + getSquare());
        System.out.println("The cube is" + getCube());
                
    }
    public static void main(String[] args){
        Find f = new Find(12,12,12);
        f.print();

    }
}
