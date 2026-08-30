package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ReverseOrdering<T> extends com.google.common.collect.Ordering<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.collect.Ordering<? super T> forwardOrder;

    ReverseOrdering(com.google.common.collect.Ordering<? super T> forwardOrder) {
        this.forwardOrder = (com.google.common.collect.Ordering) com.google.common.base.Preconditions.checkNotNull(forwardOrder);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness T a2, @com.google.common.collect.ParametricNullness T b) {
        return this.forwardOrder.compare(b, a2);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> com.google.common.collect.Ordering<S> reverse() {
        return this.forwardOrder;
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2) {
        return (E) this.forwardOrder.max(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2, @com.google.common.collect.ParametricNullness E e3, E... eArr) {
        return (E) this.forwardOrder.max(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(java.util.Iterator<E> it) {
        return (E) this.forwardOrder.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(java.lang.Iterable<E> iterable) {
        return (E) this.forwardOrder.max(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2) {
        return (E) this.forwardOrder.min(e, e2);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@com.google.common.collect.ParametricNullness E e, @com.google.common.collect.ParametricNullness E e2, @com.google.common.collect.ParametricNullness E e3, E... eArr) {
        return (E) this.forwardOrder.min(e, e2, e3, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(java.util.Iterator<E> it) {
        return (E) this.forwardOrder.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(java.lang.Iterable<E> iterable) {
        return (E) this.forwardOrder.min(iterable);
    }

    public int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof com.google.common.collect.ReverseOrdering) {
            return this.forwardOrder.equals(((com.google.common.collect.ReverseOrdering) object).forwardOrder);
        }
        return false;
    }

    public java.lang.String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
