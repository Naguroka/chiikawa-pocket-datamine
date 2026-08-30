package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMultiset<E> extends com.google.common.collect.ForwardingMultiset<E> implements com.google.common.collect.SortedMultiset<E> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public abstract com.google.common.collect.SortedMultiset<E> delegate();

    protected ForwardingSortedMultiset() {
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public java.util.NavigableSet<E> elementSet() {
        return delegate().elementSet();
    }

    protected class StandardElementSet extends com.google.common.collect.SortedMultisets.NavigableElementSet<E> {
        public StandardElementSet(final com.google.common.collect.ForwardingSortedMultiset this$0) {
            super(this$0);
        }
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public java.util.Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> descendingMultiset() {
        return delegate().descendingMultiset();
    }

    protected abstract class StandardDescendingMultiset extends com.google.common.collect.DescendingMultiset<E> {
        public StandardDescendingMultiset() {
        }

        @Override // com.google.common.collect.DescendingMultiset
        com.google.common.collect.SortedMultiset<E> forwardMultiset() {
            return com.google.common.collect.ForwardingSortedMultiset.this;
        }
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> firstEntry() {
        return delegate().firstEntry();
    }

    @javax.annotation.CheckForNull
    protected com.google.common.collect.Multiset.Entry<E> standardFirstEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        com.google.common.collect.Multiset.Entry<E> next = it.next();
        return com.google.common.collect.Multisets.immutableEntry(next.getElement(), next.getCount());
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> lastEntry() {
        return delegate().lastEntry();
    }

    @javax.annotation.CheckForNull
    protected com.google.common.collect.Multiset.Entry<E> standardLastEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        com.google.common.collect.Multiset.Entry<E> next = it.next();
        return com.google.common.collect.Multisets.immutableEntry(next.getElement(), next.getCount());
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @javax.annotation.CheckForNull
    protected com.google.common.collect.Multiset.Entry<E> standardPollFirstEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        com.google.common.collect.Multiset.Entry<E> next = it.next();
        com.google.common.collect.Multiset.Entry<E> entryImmutableEntry = com.google.common.collect.Multisets.immutableEntry(next.getElement(), next.getCount());
        it.remove();
        return entryImmutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public com.google.common.collect.Multiset.Entry<E> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @javax.annotation.CheckForNull
    protected com.google.common.collect.Multiset.Entry<E> standardPollLastEntry() {
        java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> it = descendingMultiset().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        com.google.common.collect.Multiset.Entry<E> next = it.next();
        com.google.common.collect.Multiset.Entry<E> entryImmutableEntry = com.google.common.collect.Multisets.immutableEntry(next.getElement(), next.getCount());
        it.remove();
        return entryImmutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType boundType) {
        return delegate().headMultiset(upperBound, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> subMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType lowerBoundType, @com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType upperBoundType) {
        return delegate().subMultiset(lowerBound, lowerBoundType, upperBound, upperBoundType);
    }

    protected com.google.common.collect.SortedMultiset<E> standardSubMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType lowerBoundType, @com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType upperBoundType) {
        return tailMultiset(lowerBound, lowerBoundType).headMultiset(upperBound, upperBoundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType boundType) {
        return delegate().tailMultiset(lowerBound, boundType);
    }
}
