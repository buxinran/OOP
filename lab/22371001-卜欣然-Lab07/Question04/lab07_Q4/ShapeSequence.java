package lab07_Q4;
public class ShapeSequence {
    private Shape[] shapes;
    private int present = 0;
    public ShapeSequence(int size) {
        if (size >= 0) {
            this.shapes = new Shape[size];
        } else {
            this.shapes = new Shape[0];
        }
    }

    public void add(Shape shape) {
        if (present < shapes.length)
            this.shapes[present++] = shape;
        else
            return;
    }
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < present; i++) {
            str.append(shapes[i].getType()).append(" ");
        }
        return str + "]";
    }
    interface Iterator{
        public boolean isEnd();
        public Shape current();
        public void moveNext();
        public boolean equals(Object o);
    }
    public SequenceIterator iterator() {return new SequenceIterator(); }
    private class SequenceIterator implements Iterator {
        int index = 0;

        public boolean isEnd() {
            if (index == present){
                System.out.println("The last one.");
                return true;
            }
            else
                return false;
        }
        public Shape current(){
            if(isEnd()){
                System.out.println("The last one.");
                return null;
            }
            else{
                System.out.println(shapes[index].toString());
                return shapes[index];
            }
        }
        public void moveNext(){
            if(isEnd()){
                System.out.println("Already at the last one!");
                return;
            }
            else{
                index++;
                System.out.println("move success!");
            }
        }
        public boolean equals(Object o){
            if(o==this)
                return true;
            SequenceIterator a = (SequenceIterator) o;
            if(index==a.index)
                return true;
            return false;
        }
    }
}
