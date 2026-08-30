package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class CartesianList<E> extends java.util.AbstractList<java.util.List<E>> implements java.util.RandomAccess {
    private final transient com.google.common.collect.ImmutableList<java.util.List<E>> axes;
    private final transient int[] axesSizeProduct;

    static <E> java.util.List<java.util.List<E>> create(java.util.List<? extends java.util.List<? extends E>> lists) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(lists.size());
        java.util.Iterator<? extends java.util.List<? extends E>> it = lists.iterator();
        while (it.hasNext()) {
            com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) it.next());
            if (immutableListCopyOf.isEmpty()) {
                return com.google.common.collect.ImmutableList.of();
            }
            builder.add(immutableListCopyOf);
        }
        return new com.google.common.collect.CartesianList(builder.build());
    }

    CartesianList(com.google.common.collect.ImmutableList<java.util.List<E>> axes) {
        this.axes = axes;
        int[] iArr = new int[axes.size() + 1];
        iArr[axes.size()] = 1;
        try {
            for (int size = axes.size() - 1; size >= 0; size--) {
                iArr[size] = com.google.common.math.IntMath.checkedMultiply(iArr[size + 1], axes.get(size).size());
            }
            this.axesSizeProduct = iArr;
        } catch (java.lang.ArithmeticException unused) {
            throw new java.lang.IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getAxisIndexForProductIndex(int index, int axis) {
        return (index / this.axesSizeProduct[axis + 1]) % this.axes.get(axis).size();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object o) {
        if (!(o instanceof java.util.List)) {
            return -1;
        }
        java.util.List list = (java.util.List) o;
        if (list.size() != this.axes.size()) {
            return -1;
        }
        java.util.ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.axes.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i += iIndexOf * this.axesSizeProduct[iNextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object o) {
        if (!(o instanceof java.util.List)) {
            return -1;
        }
        java.util.List list = (java.util.List) o;
        if (list.size() != this.axes.size()) {
            return -1;
        }
        java.util.ListIterator<E> listIterator = list.listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iLastIndexOf = this.axes.get(iNextIndex).lastIndexOf(listIterator.next());
            if (iLastIndexOf == -1) {
                return -1;
            }
            i += iLastIndexOf * this.axesSizeProduct[iNextIndex + 1];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public com.google.common.collect.ImmutableList<E> get(final int index) {
        com.google.common.base.Preconditions.checkElementIndex(index, size());
        return new com.google.common.collect.ImmutableList<E>() { // from class: com.google.common.collect.CartesianList.1
            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return com.google.common.collect.CartesianList.this.axes.size();
            }

            @Override // java.util.List
            public E get(int i) {
                com.google.common.base.Preconditions.checkElementIndex(i, size());
                return (E) ((java.util.List) com.google.common.collect.CartesianList.this.axes.get(i)).get(com.google.common.collect.CartesianList.this.getAxisIndexForProductIndex(index, i));
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            java.lang.Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.axesSizeProduct[0];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof java.util.List)) {
            return false;
        }
        java.util.List list = (java.util.List) object;
        if (list.size() != this.axes.size()) {
            return false;
        }
        java.util.Iterator<E> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!this.axes.get(i).contains(it.next())) {
                return false;
            }
            i++;
        }
        return true;
    }
}
