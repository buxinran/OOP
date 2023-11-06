package lab07_Q4;

public class Test {
    public static void main(String []args){
        ShapeSequence list=new ShapeSequence(5);
        list.add(new Ellipse(3.2,6.5));
        list.add(new Rectangle(2.8,4.6));
        list.add(new Rhombus(1.2,6.0));
        list.add(new Rectangle(1,1));
        list.add(new Rhombus(3.1,9.2));
        System.out.println(list.toString());
        ShapeSequence.Iterator a=list.iterator();
        a.moveNext();
        a.current();
        a.moveNext();
        a.moveNext();
        a.moveNext();
        a.moveNext();
        a.isEnd();
        ShapeSequence.Iterator a1=list.iterator();
        a1.moveNext();
        a1.current();
        a1.moveNext();
        a1.moveNext();
        a1.moveNext();
        a1.moveNext();
        a1.isEnd();
        System.out.println(a.equals(a1));
        System.exit(0);
    }
}
