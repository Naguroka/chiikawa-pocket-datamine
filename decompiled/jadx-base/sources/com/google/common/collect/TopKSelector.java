package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class TopKSelector<T> {
    private final T[] buffer;
    private int bufferSize;
    private final java.util.Comparator<? super T> comparator;
    private final int k;

    @javax.annotation.CheckForNull
    private T threshold;

    public static <T extends java.lang.Comparable<? super T>> com.google.common.collect.TopKSelector<T> least(int k) {
        return least(k, com.google.common.collect.Ordering.natural());
    }

    public static <T> com.google.common.collect.TopKSelector<T> least(int k, java.util.Comparator<? super T> comparator) {
        return new com.google.common.collect.TopKSelector<>(comparator, k);
    }

    public static <T extends java.lang.Comparable<? super T>> com.google.common.collect.TopKSelector<T> greatest(int k) {
        return greatest(k, com.google.common.collect.Ordering.natural());
    }

    public static <T> com.google.common.collect.TopKSelector<T> greatest(int k, java.util.Comparator<? super T> comparator) {
        return new com.google.common.collect.TopKSelector<>(com.google.common.collect.Ordering.from(comparator).reverse(), k);
    }

    private TopKSelector(java.util.Comparator<? super T> comparator, int i) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator, "comparator");
        this.k = i;
        com.google.common.base.Preconditions.checkArgument(i >= 0, "k (%s) must be >= 0", i);
        com.google.common.base.Preconditions.checkArgument(i <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i);
        this.buffer = (T[]) new java.lang.Object[com.google.common.math.IntMath.checkedMultiply(i, 2)];
        this.bufferSize = 0;
        this.threshold = null;
    }

    public void offer(@com.google.common.collect.ParametricNullness T t) {
        int i = this.k;
        if (i == 0) {
            return;
        }
        int i2 = this.bufferSize;
        if (i2 == 0) {
            this.buffer[0] = t;
            this.threshold = t;
            this.bufferSize = 1;
            return;
        }
        if (i2 < i) {
            T[] tArr = this.buffer;
            this.bufferSize = i2 + 1;
            tArr[i2] = t;
            if (this.comparator.compare(t, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = t;
                return;
            }
            return;
        }
        if (this.comparator.compare(t, (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.threshold)) < 0) {
            T[] tArr2 = this.buffer;
            int i3 = this.bufferSize;
            int i4 = i3 + 1;
            this.bufferSize = i4;
            tArr2[i3] = t;
            if (i4 == this.k * 2) {
                trim();
            }
        }
    }

    private void trim() {
        int i = (this.k * 2) - 1;
        int iLog2 = com.google.common.math.IntMath.log2(i + 0, java.math.RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i2 = 0;
        int i3 = 0;
        while (iMax < i) {
            int iPartition = partition(iMax, i, ((iMax + i) + 1) >>> 1);
            int i4 = this.k;
            if (iPartition <= i4) {
                if (iPartition >= i4) {
                    break;
                }
                iMax = java.lang.Math.max(iPartition, iMax + 1);
                i3 = iPartition;
            } else {
                i = iPartition - 1;
            }
            i2++;
            if (i2 >= iLog2) {
                java.util.Arrays.sort(this.buffer, iMax, i + 1, this.comparator);
                break;
            }
        }
        this.bufferSize = this.k;
        this.threshold = (T) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i3]);
        while (true) {
            i3++;
            if (i3 >= this.k) {
                return;
            }
            if (this.comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i3]), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.threshold)) > 0) {
                this.threshold = this.buffer[i3];
            }
        }
    }

    private int partition(int i, int i2, int i3) {
        java.lang.Object objUncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i3]);
        T[] tArr = this.buffer;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.buffer[i]), objUncheckedCastNullableTToT) < 0) {
                swap(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.buffer;
        tArr2[i2] = tArr2[i4];
        tArr2[i4] = objUncheckedCastNullableTToT;
        return i4;
    }

    private void swap(int i, int j) {
        T[] tArr = this.buffer;
        T t = tArr[i];
        tArr[i] = tArr[j];
        tArr[j] = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    com.google.common.collect.TopKSelector<T> combine(com.google.common.collect.TopKSelector<T> other) {
        for (int i = 0; i < other.bufferSize; i++) {
            offer(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(other.buffer[i]));
        }
        return this;
    }

    public void offerAll(java.lang.Iterable<? extends T> elements) {
        offerAll(elements.iterator());
    }

    public void offerAll(java.util.Iterator<? extends T> elements) {
        while (elements.hasNext()) {
            offer(elements.next());
        }
    }

    public java.util.List<T> topK() {
        T[] tArr = this.buffer;
        java.util.Arrays.sort(tArr, 0, this.bufferSize, this.comparator);
        int i = this.bufferSize;
        int i2 = this.k;
        if (i > i2) {
            T[] tArr2 = this.buffer;
            java.util.Arrays.fill(tArr2, i2, tArr2.length, (java.lang.Object) null);
            int i3 = this.k;
            this.bufferSize = i3;
            this.threshold = this.buffer[i3 - 1];
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(java.util.Arrays.copyOf(tArr, this.bufferSize)));
    }
}
