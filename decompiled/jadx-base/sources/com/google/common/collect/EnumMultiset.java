package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends java.lang.Enum<E>> extends com.google.common.collect.AbstractMultiset<E> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient java.lang.Class<E> type;

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(@javax.annotation.CheckForNull java.lang.Object element) {
        return super.contains(element);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean setCount(@com.google.common.collect.ParametricNullness java.lang.Object element, int oldCount, int newCount) {
        return super.setCount(element, oldCount, newCount);
    }

    static /* synthetic */ int access$210(com.google.common.collect.EnumMultiset enumMultiset) {
        int i = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i - 1;
        return i;
    }

    static /* synthetic */ long access$322(com.google.common.collect.EnumMultiset enumMultiset, long j) {
        long j2 = enumMultiset.size - j;
        enumMultiset.size = j2;
        return j2;
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Class<E> type) {
        return new com.google.common.collect.EnumMultiset<>(type);
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> elements) {
        java.util.Iterator<E> it = elements.iterator();
        com.google.common.base.Preconditions.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        com.google.common.collect.EnumMultiset<E> enumMultiset = new com.google.common.collect.EnumMultiset<>(it.next().getDeclaringClass());
        com.google.common.collect.Iterables.addAll(enumMultiset, elements);
        return enumMultiset;
    }

    public static <E extends java.lang.Enum<E>> com.google.common.collect.EnumMultiset<E> create(java.lang.Iterable<E> elements, java.lang.Class<E> type) {
        com.google.common.collect.EnumMultiset<E> enumMultisetCreate = create(type);
        com.google.common.collect.Iterables.addAll(enumMultisetCreate, elements);
        return enumMultisetCreate;
    }

    private EnumMultiset(java.lang.Class<E> type) {
        this.type = type;
        com.google.common.base.Preconditions.checkArgument(type.isEnum());
        E[] enumConstants = type.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    private boolean isActuallyE(@javax.annotation.CheckForNull java.lang.Object o) {
        if (!(o instanceof java.lang.Enum)) {
            return false;
        }
        java.lang.Enum r5 = (java.lang.Enum) o;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.enumConstants;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    private void checkIsE(java.lang.Object element) {
        com.google.common.base.Preconditions.checkNotNull(element);
        if (!isActuallyE(element)) {
            throw new java.lang.ClassCastException("Expected an " + this.type + " but got " + element);
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    int distinctElements() {
        return this.distinctElements;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return com.google.common.primitives.Ints.saturatedCast(this.size);
    }

    @Override // com.google.common.collect.Multiset
    public int count(@javax.annotation.CheckForNull java.lang.Object element) {
        if (element == null || !isActuallyE(element)) {
            return 0;
        }
        return this.counts[((java.lang.Enum) element).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int add(E element, int occurrences) {
        checkIsE(element);
        com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        int iOrdinal = element.ordinal();
        int i = this.counts[iOrdinal];
        long j = occurrences;
        long j2 = ((long) i) + j;
        com.google.common.base.Preconditions.checkArgument(j2 <= 2147483647L, "too many occurrences: %s", j2);
        this.counts[iOrdinal] = (int) j2;
        if (i == 0) {
            this.distinctElements++;
        }
        this.size += j;
        return i;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int remove(@javax.annotation.CheckForNull java.lang.Object element, int occurrences) {
        if (element == null || !isActuallyE(element)) {
            return 0;
        }
        java.lang.Enum r1 = (java.lang.Enum) element;
        com.google.common.collect.CollectPreconditions.checkNonnegative(occurrences, "occurrences");
        if (occurrences == 0) {
            return count(element);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.counts;
        int i = iArr[iOrdinal];
        if (i == 0) {
            return 0;
        }
        if (i <= occurrences) {
            iArr[iOrdinal] = 0;
            this.distinctElements--;
            this.size -= (long) i;
        } else {
            iArr[iOrdinal] = i - occurrences;
            this.size -= (long) occurrences;
        }
        return i;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public int setCount(E element, int count) {
        checkIsE(element);
        com.google.common.collect.CollectPreconditions.checkNonnegative(count, "count");
        int iOrdinal = element.ordinal();
        int[] iArr = this.counts;
        int i = iArr[iOrdinal];
        iArr[iOrdinal] = count;
        this.size += (long) (count - i);
        if (i == 0 && count > 0) {
            this.distinctElements++;
        } else if (i > 0 && count == 0) {
            this.distinctElements--;
        }
        return i;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        java.util.Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    abstract class Itr<T> implements java.util.Iterator<T> {
        int index = 0;
        int toRemove = -1;

        abstract T output(int index);

        Itr() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.index < com.google.common.collect.EnumMultiset.this.enumConstants.length) {
                int[] iArr = com.google.common.collect.EnumMultiset.this.counts;
                int i = this.index;
                if (iArr[i] > 0) {
                    return true;
                }
                this.index = i + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T tOutput = output(this.index);
            int i = this.index;
            this.toRemove = i;
            this.index = i + 1;
            return tOutput;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.collect.CollectPreconditions.checkRemove(this.toRemove >= 0);
            if (com.google.common.collect.EnumMultiset.this.counts[this.toRemove] > 0) {
                com.google.common.collect.EnumMultiset.access$210(com.google.common.collect.EnumMultiset.this);
                com.google.common.collect.EnumMultiset enumMultiset = com.google.common.collect.EnumMultiset.this;
                com.google.common.collect.EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.toRemove]);
                com.google.common.collect.EnumMultiset.this.counts[this.toRemove] = 0;
            }
            this.toRemove = -1;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<E> elementIterator() {
        return new com.google.common.collect.EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            public E output(int i) {
                return (E) com.google.common.collect.EnumMultiset.this.enumConstants[i];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    java.util.Iterator<com.google.common.collect.Multiset.Entry<E>> entryIterator() {
        return new com.google.common.collect.EnumMultiset<E>.Itr<com.google.common.collect.Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.EnumMultiset.Itr
            public com.google.common.collect.Multiset.Entry<E> output(final int i) {
                return new com.google.common.collect.Multisets.AbstractEntry<E>() { // from class: com.google.common.collect.EnumMultiset.2.1
                    @Override // com.google.common.collect.Multiset.Entry
                    public E getElement() {
                        return (E) com.google.common.collect.EnumMultiset.this.enumConstants[i];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return com.google.common.collect.EnumMultiset.this.counts[i];
                    }
                };
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public java.util.Iterator<E> iterator() {
        return com.google.common.collect.Multisets.iteratorImpl(this);
    }

    private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.defaultWriteObject();
        stream.writeObject(this.type);
        com.google.common.collect.Serialization.writeMultiset(this, stream);
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.lang.ClassNotFoundException, java.io.IOException {
        stream.defaultReadObject();
        java.lang.Class<E> cls = (java.lang.Class) java.util.Objects.requireNonNull(stream.readObject());
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        com.google.common.collect.Serialization.populateMultiset(this, stream);
    }
}
