package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends com.google.common.collect.ForwardingSet<E> implements java.util.SortedSet<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract java.util.SortedSet<E> delegate();

    protected ForwardingSortedSet() {
    }

    @Override // java.util.SortedSet
    @javax.annotation.CheckForNull
    public java.util.Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public E first() {
        return delegate().first();
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> headSet(@com.google.common.collect.ParametricNullness E toElement) {
        return delegate().headSet(toElement);
    }

    @Override // java.util.SortedSet
    @com.google.common.collect.ParametricNullness
    public E last() {
        return delegate().last();
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> subSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
        return delegate().subSet(fromElement, toElement);
    }

    @Override // java.util.SortedSet
    public java.util.SortedSet<E> tailSet(@com.google.common.collect.ParametricNullness E fromElement) {
        return delegate().tailSet(fromElement);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardContains(@javax.annotation.CheckForNull java.lang.Object object) {
        try {
            return com.google.common.collect.ForwardingSortedMap.unsafeCompare(comparator(), tailSet(object).first(), object) == 0;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException | java.util.NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingCollection
    protected boolean standardRemove(@javax.annotation.CheckForNull java.lang.Object object) {
        try {
            java.util.Iterator<E> it = tailSet(object).iterator();
            if (it.hasNext()) {
                if (com.google.common.collect.ForwardingSortedMap.unsafeCompare(comparator(), it.next(), object) == 0) {
                    it.remove();
                    return true;
                }
            }
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    protected java.util.SortedSet<E> standardSubSet(@com.google.common.collect.ParametricNullness E fromElement, @com.google.common.collect.ParametricNullness E toElement) {
        return tailSet(fromElement).headSet(toElement);
    }
}
