package com.javalinq.implementations;

import com.javalinq.interfaces.QIterable;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sircodesalot on 14-5-30.
 */
public class QSet<T> implements QIterable<T> {
    public Set<T> set = new HashSet<>();

    public QSet() { }
    public QSet(Iterable<T> iterable) {
        for (T item : iterable) this.add(item);
    }

    public boolean add(T item) {
        return this.set.add(item);
    }

    @Override
    public Iterator<T> iterator() { return this.set.iterator(); }
}