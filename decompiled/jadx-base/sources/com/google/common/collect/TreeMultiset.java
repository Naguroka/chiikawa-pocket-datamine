package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class TreeMultiset<E> extends com.google.common.collect.AbstractSortedMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final transient com.google.common.collect.TreeMultiset.AvlNode<E> header;
    private final transient com.google.common.collect.GeneralRange<E> range;
    private final transient com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> rootReference;

    private enum Aggregate {
        SIZE { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> node) {
                return ((com.google.common.collect.TreeMultiset.AvlNode) node).elemCount;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> root) {
                if (root == null) {
                    return 0L;
                }
                return ((com.google.common.collect.TreeMultiset.AvlNode) root).totalCount;
            }
        },
        DISTINCT { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
            @Override // com.google.common.collect.TreeMultiset.Aggregate
            int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> node) {
                return 1;
            }

            @Override // com.google.common.collect.TreeMultiset.Aggregate
            long treeAggregate(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> root) {
                if (root == null) {
                    return 0L;
                }
                return ((com.google.common.collect.TreeMultiset.AvlNode) root).distinctElements;
            }
        };

        abstract int nodeAggregate(com.google.common.collect.TreeMultiset.AvlNode<?> node);

        abstract long treeAggregate(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> root);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public /* bridge */ /* synthetic */ java.util.Comparator comparator() {
        return super.comparator();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset descendingMultiset() {
        return super.descendingMultiset();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.NavigableSet elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    @javax.annotation.CheckForNull
    public /* bridge */ /* synthetic */ com.google.common.collect.Multiset.Entry pollLastEntry() {
        return super.pollLastEntry();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractSortedMultiset, com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ com.google.common.collect.SortedMultiset subMultiset(@com.google.common.collect.ParametricNullness java.lang.Object fromElement, com.google.common.collect.BoundType fromBoundType, @com.google.common.collect.ParametricNullness java.lang.Object toElement, com.google.common.collect.BoundType toBoundType) {
        return super.subMultiset(fromElement, fromBoundType, toElement, toBoundType);
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create() {
        return new com.google.common.collect.TreeMultiset<>(com.google.common.collect.Ordering.natural());
    }

    public static <E> com.google.common.collect.TreeMultiset<E> create(@javax.annotation.CheckForNull java.util.Comparator<? super E> comparator) {
        if (comparator == null) {
            return new com.google.common.collect.TreeMultiset<>(com.google.common.collect.Ordering.natural());
        }
        return new com.google.common.collect.TreeMultiset<>(comparator);
    }

    public static <E extends java.lang.Comparable> com.google.common.collect.TreeMultiset<E> create(java.lang.Iterable<? extends E> elements) {
        com.google.common.collect.TreeMultiset<E> treeMultisetCreate = create();
        com.google.common.collect.Iterables.addAll(treeMultisetCreate, elements);
        return treeMultisetCreate;
    }

    TreeMultiset(com.google.common.collect.TreeMultiset.Reference<com.google.common.collect.TreeMultiset.AvlNode<E>> rootReference, com.google.common.collect.GeneralRange<E> range, com.google.common.collect.TreeMultiset.AvlNode<E> endLink) {
        super(range.comparator());
        this.rootReference = rootReference;
        this.range = range;
        this.header = endLink;
    }

    TreeMultiset(java.util.Comparator<? super E> comparator) {
        super(comparator);
        this.range = com.google.common.collect.GeneralRange.all(comparator);
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = new com.google.common.collect.TreeMultiset.AvlNode<>();
        this.header = avlNode;
        successor(avlNode, avlNode);
        this.rootReference = new com.google.common.collect.TreeMultiset.Reference<>();
    }

    private long aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate aggr) {
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        long jTreeAggregate = aggr.treeAggregate(avlNode);
        if (this.range.hasLowerBound()) {
            jTreeAggregate -= aggregateBelowRange(aggr, avlNode);
        }
        return this.range.hasUpperBound() ? jTreeAggregate - aggregateAboveRange(aggr, avlNode) : jTreeAggregate;
    }

    private long aggregateBelowRange(com.google.common.collect.TreeMultiset.Aggregate aggr, @javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<E> node) {
        long jTreeAggregate;
        long jAggregateBelowRange;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getLowerEndpoint()), node.getElement());
        if (iCompare < 0) {
            return aggregateBelowRange(aggr, ((com.google.common.collect.TreeMultiset.AvlNode) node).left);
        }
        if (iCompare == 0) {
            int i = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType[this.range.getLowerBoundType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.AssertionError();
                }
                return aggr.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) node).left);
            }
            jTreeAggregate = aggr.nodeAggregate(node);
            jAggregateBelowRange = aggr.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) node).left);
        } else {
            jTreeAggregate = aggr.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) node).left) + ((long) aggr.nodeAggregate(node));
            jAggregateBelowRange = aggregateBelowRange(aggr, ((com.google.common.collect.TreeMultiset.AvlNode) node).right);
        }
        return jTreeAggregate + jAggregateBelowRange;
    }

    /* JADX INFO: renamed from: com.google.common.collect.TreeMultiset$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[com.google.common.collect.BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[com.google.common.collect.BoundType.OPEN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[com.google.common.collect.BoundType.CLOSED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    private long aggregateAboveRange(com.google.common.collect.TreeMultiset.Aggregate aggr, @javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<E> node) {
        long jTreeAggregate;
        long jAggregateAboveRange;
        if (node == null) {
            return 0L;
        }
        int iCompare = comparator().compare(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getUpperEndpoint()), node.getElement());
        if (iCompare > 0) {
            return aggregateAboveRange(aggr, ((com.google.common.collect.TreeMultiset.AvlNode) node).right);
        }
        if (iCompare == 0) {
            int i = com.google.common.collect.TreeMultiset.AnonymousClass4.$SwitchMap$com$google$common$collect$BoundType[this.range.getUpperBoundType().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.AssertionError();
                }
                return aggr.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) node).right);
            }
            jTreeAggregate = aggr.nodeAggregate(node);
            jAggregateAboveRange = aggr.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) node).right);
        } else {
            jTreeAggregate = aggr.treeAggregate(((com.google.common.collect.TreeMultiset.AvlNode) node).right) + ((long) aggr.nodeAggregate(node));
            jAggregateAboveRange = aggregateAboveRange(aggr, ((com.google.common.collect.TreeMultiset.AvlNode) node).left);
        }
        return jTreeAggregate + jAggregateAboveRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return com.google.common.primitives.Ints.saturatedCast(aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate.SIZE));
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
        return com.google.common.primitives.Ints.saturatedCast(aggregateForEntries(com.google.common.collect.TreeMultiset.Aggregate.DISTINCT));
    }

    static int distinctElements(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> node) {
        if (node == null) {
            return 0;
        }
        return ((com.google.common.collect.TreeMultiset.AvlNode) node).distinctElements;
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        try {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
            if (this.range.contains(element) && avlNode != null) {
                return avlNode.count(comparator(), element);
            }
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(@com.google.common.collect.ParametricNullness E element, int occurrences) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        com.google.common.base.Preconditions.checkArgument(this.range.contains(element));
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            comparator().compare(element, element);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = new com.google.common.collect.TreeMultiset.AvlNode<>(element, occurrences);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode3 = this.header;
            successor(avlNode3, avlNode2, avlNode3);
            this.rootReference.checkAndSet(avlNode, avlNode2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.add(comparator(), element, occurrences, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        int[] iArr = new int[1];
        try {
            if (this.range.contains(element) && avlNode != null) {
                this.rootReference.checkAndSet(avlNode, avlNode.remove(comparator(), element, occurrences, iArr));
                return iArr[0];
            }
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int setCount(@com.google.common.collect.ParametricNullness E element, int count) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(count, "count");
        if (!this.range.contains(element)) {
            com.google.common.base.Preconditions.checkArgument(count == 0);
            return 0;
        }
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            if (count > 0) {
                add(element, count);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), element, count, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public boolean setCount(@com.google.common.collect.ParametricNullness E element, int oldCount, int newCount) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(newCount, "newCount");
        com.google.common.collect.CollectPreconditions.checkNonnegative(oldCount, "oldCount");
        com.google.common.base.Preconditions.checkArgument(this.range.contains(element));
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode != null) {
            int[] iArr = new int[1];
            this.rootReference.checkAndSet(avlNode, avlNode.setCount(comparator(), element, oldCount, newCount, iArr));
            return iArr[0] == oldCount;
        }
        if (oldCount != 0) {
            return false;
        }
        if (newCount > 0) {
            add(element, newCount);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.range.hasLowerBound() || this.range.hasUpperBound()) {
            com.google.common.collect.Iterators.clear(entryIterator());
            return;
        }
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNodeSucc = this.header.succ();
        while (true) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.header;
            if (avlNodeSucc == avlNode) {
                successor(avlNode, avlNode);
                this.rootReference.clear();
                return;
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNodeSucc2 = avlNodeSucc.succ();
            ((com.google.common.collect.TreeMultiset.AvlNode) avlNodeSucc).elemCount = 0;
            ((com.google.common.collect.TreeMultiset.AvlNode) avlNodeSucc).left = null;
            ((com.google.common.collect.TreeMultiset.AvlNode) avlNodeSucc).right = null;
            ((com.google.common.collect.TreeMultiset.AvlNode) avlNodeSucc).pred = null;
            ((com.google.common.collect.TreeMultiset.AvlNode) avlNodeSucc).succ = null;
            avlNodeSucc = avlNodeSucc2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.collect.Multiset.Entry<E> wrapEntry(final com.google.common.collect.TreeMultiset.AvlNode<E> baseEntry) {
        return new com.google.common.collect.Multisets.AbstractEntry<E>() { // from class: com.google.common.collect.TreeMultiset.1
            @Override // com.google.common.collect.Multiset.Entry
            @com.google.common.collect.ParametricNullness
            public E getElement() {
                return (E) baseEntry.getElement();
            }

            @Override // com.google.common.collect.Multiset.Entry
            public int getCount() {
                int count = baseEntry.getCount();
                return count == 0 ? com.google.common.collect.TreeMultiset.this.count(getElement()) : count;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public com.google.common.collect.TreeMultiset.AvlNode<E> firstNode() {
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNodeSucc;
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasLowerBound()) {
            java.lang.Object objUncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getLowerEndpoint());
            avlNodeSucc = avlNode.ceiling(comparator(), objUncheckedCastNullableTToT);
            if (avlNodeSucc == null) {
                return null;
            }
            if (this.range.getLowerBoundType() == com.google.common.collect.BoundType.OPEN && comparator().compare(objUncheckedCastNullableTToT, avlNodeSucc.getElement()) == 0) {
                avlNodeSucc = avlNodeSucc.succ();
            }
        } else {
            avlNodeSucc = this.header.succ();
        }
        if (avlNodeSucc == this.header || !this.range.contains(avlNodeSucc.getElement())) {
            return null;
        }
        return avlNodeSucc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public com.google.common.collect.TreeMultiset.AvlNode<E> lastNode() {
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNodePred;
        com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.rootReference.get();
        if (avlNode == null) {
            return null;
        }
        if (this.range.hasUpperBound()) {
            java.lang.Object objUncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.range.getUpperEndpoint());
            avlNodePred = avlNode.floor(comparator(), objUncheckedCastNullableTToT);
            if (avlNodePred == null) {
                return null;
            }
            if (this.range.getUpperBoundType() == com.google.common.collect.BoundType.OPEN && comparator().compare(objUncheckedCastNullableTToT, avlNodePred.getElement()) == 0) {
                avlNodePred = avlNodePred.pred();
            }
        } else {
            avlNodePred = this.header.pred();
        }
        if (avlNodePred == this.header || !this.range.contains(avlNodePred.getElement())) {
            return null;
        }
        return avlNodePred;
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<E> elementIterator() {
        return com.google.common.collect.Multisets.elementIterator(entryIterator());
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        return new java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.2

            @javax.annotation.CheckForNull
            com.google.common.collect.TreeMultiset.AvlNode<E> current;

            @javax.annotation.CheckForNull
            com.google.common.collect.Multiset.Entry<E> prevEntry;

            {
                this.current = com.google.common.collect.TreeMultiset.this.firstNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!com.google.common.collect.TreeMultiset.this.range.tooHigh(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public com.google.common.collect.Multiset.Entry<E> next() {
                if (hasNext()) {
                    com.google.common.collect.Multiset.Entry<E> entryWrapEntry = com.google.common.collect.TreeMultiset.this.wrapEntry((com.google.common.collect.TreeMultiset.AvlNode) java.util.Objects.requireNonNull(this.current));
                    this.prevEntry = entryWrapEntry;
                    if (this.current.succ() == com.google.common.collect.TreeMultiset.this.header) {
                        this.current = null;
                    } else {
                        this.current = this.current.succ();
                    }
                    return entryWrapEntry;
                }
                throw new java.util.NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                com.google.common.collect.TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractSortedMultiset
    java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> descendingEntryIterator() {
        return new java.util.Iterator<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.TreeMultiset.3

            @javax.annotation.CheckForNull
            com.google.common.collect.TreeMultiset.AvlNode<E> current;

            @javax.annotation.CheckForNull
            com.google.common.collect.Multiset.Entry<E> prevEntry = null;

            {
                this.current = com.google.common.collect.TreeMultiset.this.lastNode();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.current == null) {
                    return false;
                }
                if (!com.google.common.collect.TreeMultiset.this.range.tooLow(this.current.getElement())) {
                    return true;
                }
                this.current = null;
                return false;
            }

            @Override // java.util.Iterator
            public com.google.common.collect.Multiset.Entry<E> next() {
                if (!hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.util.Objects.requireNonNull(this.current);
                com.google.common.collect.Multiset.Entry<E> entryWrapEntry = com.google.common.collect.TreeMultiset.this.wrapEntry(this.current);
                this.prevEntry = entryWrapEntry;
                if (this.current.pred() == com.google.common.collect.TreeMultiset.this.header) {
                    this.current = null;
                } else {
                    this.current = this.current.pred();
                }
                return entryWrapEntry;
            }

            @Override // java.util.Iterator
            public void remove() {
                com.google.common.base.Preconditions.checkState(this.prevEntry != null, "no calls to next() since the last call to remove()");
                com.google.common.collect.TreeMultiset.this.setCount(this.prevEntry.getElement(), 0);
                this.prevEntry = null;
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> headMultiset(@com.google.common.collect.ParametricNullness E upperBound, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.TreeMultiset(this.rootReference, this.range.intersect(com.google.common.collect.GeneralRange.upTo(comparator(), upperBound, boundType)), this.header);
    }

    @Override // com.google.common.collect.SortedMultiset
    public com.google.common.collect.SortedMultiset<E> tailMultiset(@com.google.common.collect.ParametricNullness E lowerBound, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.TreeMultiset(this.rootReference, this.range.intersect(com.google.common.collect.GeneralRange.downTo(comparator(), lowerBound, boundType)), this.header);
    }

    private static final class Reference<T> {

        @javax.annotation.CheckForNull
        private T value;

        private Reference() {
        }

        @javax.annotation.CheckForNull
        public T get() {
            return this.value;
        }

        public void checkAndSet(@javax.annotation.CheckForNull T expected, @javax.annotation.CheckForNull T newValue) {
            if (this.value != expected) {
                throw new java.util.ConcurrentModificationException();
            }
            this.value = newValue;
        }

        void clear() {
            this.value = null;
        }
    }

    private static final class AvlNode<E> {
        private int distinctElements;

        @javax.annotation.CheckForNull
        private final E elem;
        private int elemCount;
        private int height;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> left;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> pred;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> right;

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> succ;
        private long totalCount;

        AvlNode(@com.google.common.collect.ParametricNullness E elem, int elemCount) {
            com.google.common.base.Preconditions.checkArgument(elemCount > 0);
            this.elem = elem;
            this.elemCount = elemCount;
            this.totalCount = elemCount;
            this.distinctElements = 1;
            this.height = 1;
            this.left = null;
            this.right = null;
        }

        AvlNode() {
            this.elem = null;
            this.elemCount = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.common.collect.TreeMultiset.AvlNode<E> pred() {
            return (com.google.common.collect.TreeMultiset.AvlNode) java.util.Objects.requireNonNull(this.pred);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public com.google.common.collect.TreeMultiset.AvlNode<E> succ() {
            return (com.google.common.collect.TreeMultiset.AvlNode) java.util.Objects.requireNonNull(this.succ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        int count(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    return 0;
                }
                return avlNode.count(comparator, e);
            }
            if (iCompare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    return 0;
                }
                return avlNode2.count(comparator, e);
            }
            return this.elemCount;
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addRightChild(@com.google.common.collect.ParametricNullness E e, int count) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = new com.google.common.collect.TreeMultiset.AvlNode<>(e, count);
            this.right = avlNode;
            com.google.common.collect.TreeMultiset.successor(this, avlNode, succ());
            this.height = java.lang.Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += (long) count;
            return this;
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> addLeftChild(@com.google.common.collect.ParametricNullness E e, int count) {
            this.left = new com.google.common.collect.TreeMultiset.AvlNode<>(e, count);
            com.google.common.collect.TreeMultiset.successor(pred(), this.left, this);
            this.height = java.lang.Math.max(2, this.height);
            this.distinctElements++;
            this.totalCount += (long) count;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        com.google.common.collect.TreeMultiset.AvlNode<E> add(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e, int count, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return addLeftChild(e, count);
                }
                int i = avlNode.height;
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNodeAdd = avlNode.add(comparator, e, count, result);
                this.left = avlNodeAdd;
                if (result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) count;
                return avlNodeAdd.height == i ? this : rebalance();
            }
            if (iCompare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return addRightChild(e, count);
                }
                int i2 = avlNode2.height;
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNodeAdd2 = avlNode2.add(comparator, e, count, result);
                this.right = avlNodeAdd2;
                if (result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) count;
                return avlNodeAdd2.height == i2 ? this : rebalance();
            }
            int i3 = this.elemCount;
            result[0] = i3;
            long j = count;
            com.google.common.base.Preconditions.checkArgument(((long) i3) + j <= 2147483647L);
            this.elemCount += count;
            this.totalCount += j;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        com.google.common.collect.TreeMultiset.AvlNode<E> remove(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e, int count, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return this;
                }
                this.left = avlNode.remove(comparator, e, count, result);
                int i = result[0];
                if (i > 0) {
                    if (count >= i) {
                        this.distinctElements--;
                        this.totalCount -= (long) i;
                    } else {
                        this.totalCount -= (long) count;
                    }
                }
                return i == 0 ? this : rebalance();
            }
            if (iCompare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return this;
                }
                this.right = avlNode2.remove(comparator, e, count, result);
                int i2 = result[0];
                if (i2 > 0) {
                    if (count >= i2) {
                        this.distinctElements--;
                        this.totalCount -= (long) i2;
                    } else {
                        this.totalCount -= (long) count;
                    }
                }
                return rebalance();
            }
            int i3 = this.elemCount;
            result[0] = i3;
            if (count >= i3) {
                return deleteMe();
            }
            this.elemCount = i3 - count;
            this.totalCount -= (long) count;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e, int count, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return count > 0 ? addLeftChild(e, count) : this;
                }
                this.left = avlNode.setCount(comparator, e, count, result);
                if (count == 0 && result[0] != 0) {
                    this.distinctElements--;
                } else if (count > 0 && result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) (count - result[0]);
                return rebalance();
            }
            if (iCompare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return count > 0 ? addRightChild(e, count) : this;
                }
                this.right = avlNode2.setCount(comparator, e, count, result);
                if (count == 0 && result[0] != 0) {
                    this.distinctElements--;
                } else if (count > 0 && result[0] == 0) {
                    this.distinctElements++;
                }
                this.totalCount += (long) (count - result[0]);
                return rebalance();
            }
            int i = this.elemCount;
            result[0] = i;
            if (count == 0) {
                return deleteMe();
            }
            this.totalCount += (long) (count - i);
            this.elemCount = count;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        com.google.common.collect.TreeMultiset.AvlNode<E> setCount(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e, int expectedCount, int newCount, int[] result) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                if (avlNode == null) {
                    result[0] = 0;
                    return (expectedCount != 0 || newCount <= 0) ? this : addLeftChild(e, newCount);
                }
                this.left = avlNode.setCount(comparator, e, expectedCount, newCount, result);
                int i = result[0];
                if (i == expectedCount) {
                    if (newCount == 0 && i != 0) {
                        this.distinctElements--;
                    } else if (newCount > 0 && i == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += (long) (newCount - i);
                }
                return rebalance();
            }
            if (iCompare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
                if (avlNode2 == null) {
                    result[0] = 0;
                    return (expectedCount != 0 || newCount <= 0) ? this : addRightChild(e, newCount);
                }
                this.right = avlNode2.setCount(comparator, e, expectedCount, newCount, result);
                int i2 = result[0];
                if (i2 == expectedCount) {
                    if (newCount == 0 && i2 != 0) {
                        this.distinctElements--;
                    } else if (newCount > 0 && i2 == 0) {
                        this.distinctElements++;
                    }
                    this.totalCount += (long) (newCount - i2);
                }
                return rebalance();
            }
            int i3 = this.elemCount;
            result[0] = i3;
            if (expectedCount == i3) {
                if (newCount == 0) {
                    return deleteMe();
                }
                this.totalCount += (long) (newCount - i3);
                this.elemCount = newCount;
            }
            return this;
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> deleteMe() {
            int i = this.elemCount;
            this.elemCount = 0;
            com.google.common.collect.TreeMultiset.successor(pred(), succ());
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return avlNode;
            }
            if (avlNode.height >= avlNode2.height) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNodePred = pred();
                avlNodePred.left = this.left.removeMax(avlNodePred);
                avlNodePred.right = this.right;
                avlNodePred.distinctElements = this.distinctElements - 1;
                avlNodePred.totalCount = this.totalCount - ((long) i);
                return avlNodePred.rebalance();
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNodeSucc = succ();
            avlNodeSucc.right = this.right.removeMin(avlNodeSucc);
            avlNodeSucc.left = this.left;
            avlNodeSucc.distinctElements = this.distinctElements - 1;
            avlNodeSucc.totalCount = this.totalCount - ((long) i);
            return avlNodeSucc.rebalance();
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMin(com.google.common.collect.TreeMultiset.AvlNode<E> node) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
            if (avlNode == null) {
                return this.right;
            }
            this.left = avlNode.removeMin(node);
            this.distinctElements--;
            this.totalCount -= (long) node.elemCount;
            return rebalance();
        }

        @javax.annotation.CheckForNull
        private com.google.common.collect.TreeMultiset.AvlNode<E> removeMax(com.google.common.collect.TreeMultiset.AvlNode<E> node) {
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.right;
            if (avlNode == null) {
                return this.left;
            }
            this.right = avlNode.removeMax(node);
            this.distinctElements--;
            this.totalCount -= (long) node.elemCount;
            return rebalance();
        }

        private void recomputeMultiset() {
            this.distinctElements = com.google.common.collect.TreeMultiset.distinctElements(this.left) + 1 + com.google.common.collect.TreeMultiset.distinctElements(this.right);
            this.totalCount = ((long) this.elemCount) + totalCount(this.left) + totalCount(this.right);
        }

        private void recomputeHeight() {
            this.height = java.lang.Math.max(height(this.left), height(this.right)) + 1;
        }

        private void recompute() {
            recomputeMultiset();
            recomputeHeight();
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rebalance() {
            int iBalanceFactor = balanceFactor();
            if (iBalanceFactor == -2) {
                java.util.Objects.requireNonNull(this.right);
                if (this.right.balanceFactor() > 0) {
                    this.right = this.right.rotateRight();
                }
                return rotateLeft();
            }
            if (iBalanceFactor == 2) {
                java.util.Objects.requireNonNull(this.left);
                if (this.left.balanceFactor() < 0) {
                    this.left = this.left.rotateLeft();
                }
                return rotateRight();
            }
            recomputeHeight();
            return this;
        }

        private int balanceFactor() {
            return height(this.left) - height(this.right);
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateLeft() {
            com.google.common.base.Preconditions.checkState(this.right != null);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.right;
            this.right = avlNode.left;
            avlNode.left = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private com.google.common.collect.TreeMultiset.AvlNode<E> rotateRight() {
            com.google.common.base.Preconditions.checkState(this.left != null);
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
            this.left = avlNode.right;
            avlNode.right = this;
            avlNode.totalCount = this.totalCount;
            avlNode.distinctElements = this.distinctElements;
            recompute();
            avlNode.recomputeHeight();
            return avlNode;
        }

        private static long totalCount(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> node) {
            if (node == null) {
                return 0L;
            }
            return ((com.google.common.collect.TreeMultiset.AvlNode) node).totalCount;
        }

        private static int height(@javax.annotation.CheckForNull com.google.common.collect.TreeMultiset.AvlNode<?> node) {
            if (node == null) {
                return 0;
            }
            return ((com.google.common.collect.TreeMultiset.AvlNode) node).height;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        public com.google.common.collect.TreeMultiset.AvlNode<E> ceiling(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare < 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.left;
                return avlNode == null ? this : (com.google.common.collect.TreeMultiset.AvlNode) com.google.common.base.MoreObjects.firstNonNull(avlNode.ceiling(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.right;
            if (avlNode2 == null) {
                return null;
            }
            return avlNode2.ceiling(comparator, e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @javax.annotation.CheckForNull
        public com.google.common.collect.TreeMultiset.AvlNode<E> floor(java.util.Comparator<? super E> comparator, @com.google.common.collect.ParametricNullness E e) {
            int iCompare = comparator.compare(e, getElement());
            if (iCompare > 0) {
                com.google.common.collect.TreeMultiset.AvlNode<E> avlNode = this.right;
                return avlNode == null ? this : (com.google.common.collect.TreeMultiset.AvlNode) com.google.common.base.MoreObjects.firstNonNull(avlNode.floor(comparator, e), this);
            }
            if (iCompare == 0) {
                return this;
            }
            com.google.common.collect.TreeMultiset.AvlNode<E> avlNode2 = this.left;
            if (avlNode2 == null) {
                return null;
            }
            return avlNode2.floor(comparator, e);
        }

        @com.google.common.collect.ParametricNullness
        E getElement() {
            return (E) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.elem);
        }

        int getCount() {
            return this.elemCount;
        }

        public java.lang.String toString() {
            return com.google.common.collect.Multisets.immutableEntry(getElement(), getCount()).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> a2, com.google.common.collect.TreeMultiset.AvlNode<T> b) {
        ((com.google.common.collect.TreeMultiset.AvlNode) a2).succ = b;
        ((com.google.common.collect.TreeMultiset.AvlNode) b).pred = a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void successor(com.google.common.collect.TreeMultiset.AvlNode<T> a2, com.google.common.collect.TreeMultiset.AvlNode<T> b, com.google.common.collect.TreeMultiset.AvlNode<T> c) {
        successor(a2, b);
        successor(b, c);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(elementSet().comparator());
        com.google.common.collect.Serialization.writeMultiset(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        java.util.Comparator comparator = (java.util.Comparator) java.util.Objects.requireNonNull(stream.readObject());
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.AbstractSortedMultiset.class, "comparator").set(this, comparator);
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.TreeMultiset.class, "range").set(this, com.google.common.collect.GeneralRange.all(comparator));
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.TreeMultiset.class, "rootReference").set(this, new com.google.common.collect.TreeMultiset.Reference());
        com.google.common.collect.TreeMultiset.AvlNode avlNode = new com.google.common.collect.TreeMultiset.AvlNode();
        com.google.common.collect.Serialization.getFieldSetter(com.google.common.collect.TreeMultiset.class, "header").set(this, avlNode);
        successor(avlNode, avlNode);
        com.google.common.collect.Serialization.populateMultiset(this, stream);
    }
}
