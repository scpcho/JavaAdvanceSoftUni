package ItaratorsAndComparatorsEx.StackIterator;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public
class Stack implements Iterable<Integer> {
    private List<Integer> stack;
    private  int index = -1;
    private  int size = 0;

    public
    Stack () {
        this.stack = new ArrayList<> ();
    }

    public
    void push (int element) {
        size++;
        index++;
        stack.add (element);
    }

    public
    int pop () {
        if (size==0){
            System.out.println ("No elements");
            //return -1;
        } else {
            int element = stack.get (index);
            stack.remove (index);
            size--;
            index--;
            return element;
        }
        return -1;
    }

    @Override
    public
    Iterator<Integer> iterator () {
        return new Iterator<Integer> () {
            @Override
            public
            boolean hasNext () {

                if (index >= 0) {
                    return index >= 0;
                }else {
                    index = size-1;
                    return false;
                }
            }

            @Override
            public
            Integer next () {
                return stack.get (index--);
            }
        };
    }
}