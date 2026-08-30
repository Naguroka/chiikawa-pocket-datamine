package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    public static /* synthetic */ java.util.concurrent.locks.ReentrantReadWriteLock $r8$lambda$DPHKQ3dY4ROYnkMBoW1EqdOwBu8() {
        return new java.util.concurrent.locks.ReentrantReadWriteLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int hashCode) {
        int i = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return (i >>> 4) ^ ((i >>> 7) ^ i);
    }

    public abstract L get(java.lang.Object key);

    public abstract L getAt(int index);

    abstract int indexFor(java.lang.Object key);

    public abstract int size();

    private Striped() {
    }

    public java.lang.Iterable<L> bulkGet(java.lang.Iterable<? extends java.lang.Object> keys) {
        java.util.ArrayList arrayListNewArrayList = com.google.common.collect.Lists.newArrayList(keys);
        if (arrayListNewArrayList.isEmpty()) {
            return com.google.common.collect.ImmutableList.of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i = 0; i < arrayListNewArrayList.size(); i++) {
            iArr[i] = indexFor(arrayListNewArrayList.get(i));
        }
        java.util.Arrays.sort(iArr);
        int i2 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i2));
        for (int i3 = 1; i3 < arrayListNewArrayList.size(); i3++) {
            int i4 = iArr[i3];
            if (i4 == i2) {
                arrayListNewArrayList.set(i3, arrayListNewArrayList.get(i3 - 1));
            } else {
                arrayListNewArrayList.set(i3, getAt(i4));
                i2 = i4;
            }
        }
        return java.util.Collections.unmodifiableList(arrayListNewArrayList);
    }

    static <L> com.google.common.util.concurrent.Striped<L> custom(int stripes, com.google.common.base.Supplier<L> supplier) {
        return new com.google.common.util.concurrent.Striped.CompactStriped(stripes, supplier);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lock(int stripes) {
        return custom(stripes, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda5
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return new com.google.common.util.concurrent.Striped.PaddedLock();
            }
        });
    }

    static /* synthetic */ java.util.concurrent.locks.Lock lambda$lazyWeakLock$0() {
        return new java.util.concurrent.locks.ReentrantLock(false);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.Lock> lazyWeakLock(int stripes) {
        return lazy(stripes, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda4
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.lambda$lazyWeakLock$0();
            }
        });
    }

    private static <L> com.google.common.util.concurrent.Striped<L> lazy(int stripes, com.google.common.base.Supplier<L> supplier) {
        if (stripes < 1024) {
            return new com.google.common.util.concurrent.Striped.SmallLazyStriped(stripes, supplier);
        }
        return new com.google.common.util.concurrent.Striped.LargeLazyStriped(stripes, supplier);
    }

    static /* synthetic */ java.util.concurrent.Semaphore lambda$semaphore$1(int i) {
        return new com.google.common.util.concurrent.Striped.PaddedSemaphore(i);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> semaphore(int stripes, final int permits) {
        return custom(stripes, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.lambda$semaphore$1(permits);
            }
        });
    }

    static /* synthetic */ java.util.concurrent.Semaphore lambda$lazyWeakSemaphore$2(int i) {
        return new java.util.concurrent.Semaphore(i, false);
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.Semaphore> lazyWeakSemaphore(int stripes, final int permits) {
        return lazy(stripes, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda1
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.lambda$lazyWeakSemaphore$2(permits);
            }
        });
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> readWriteLock(int stripes) {
        return custom(stripes, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda3
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.util.concurrent.Striped.$r8$lambda$DPHKQ3dY4ROYnkMBoW1EqdOwBu8();
            }
        });
    }

    public static com.google.common.util.concurrent.Striped<java.util.concurrent.locks.ReadWriteLock> lazyWeakReadWriteLock(int stripes) {
        return lazy(stripes, new com.google.common.base.Supplier() { // from class: com.google.common.util.concurrent.Striped$$ExternalSyntheticLambda2
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return new com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class WeakSafeReadWriteLock implements java.util.concurrent.locks.ReadWriteLock {
        private final java.util.concurrent.locks.ReadWriteLock delegate = new java.util.concurrent.locks.ReentrantReadWriteLock();

        WeakSafeReadWriteLock() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.Lock readLock() {
            return new com.google.common.util.concurrent.Striped.WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public java.util.concurrent.locks.Lock writeLock() {
            return new com.google.common.util.concurrent.Striped.WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    private static final class WeakSafeLock extends com.google.common.util.concurrent.ForwardingLock {
        private final java.util.concurrent.locks.Lock delegate;
        private final com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference;

        WeakSafeLock(java.util.concurrent.locks.Lock delegate, com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference) {
            this.delegate = delegate;
            this.strongReference = strongReference;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        java.util.concurrent.locks.Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public java.util.concurrent.locks.Condition newCondition() {
            return new com.google.common.util.concurrent.Striped.WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }
    }

    private static final class WeakSafeCondition extends com.google.common.util.concurrent.ForwardingCondition {
        private final java.util.concurrent.locks.Condition delegate;
        private final com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference;

        WeakSafeCondition(java.util.concurrent.locks.Condition delegate, com.google.common.util.concurrent.Striped.WeakSafeReadWriteLock strongReference) {
            this.delegate = delegate;
            this.strongReference = strongReference;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        java.util.concurrent.locks.Condition delegate() {
            return this.delegate;
        }
    }

    private static abstract class PowerOfTwoStriped<L> extends com.google.common.util.concurrent.Striped<L> {
        final int mask;

        PowerOfTwoStriped(int stripes) {
            super();
            com.google.common.base.Preconditions.checkArgument(stripes > 0, "Stripes must be positive");
            this.mask = stripes > 1073741824 ? -1 : com.google.common.util.concurrent.Striped.ceilToPowerOfTwo(stripes) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        final int indexFor(java.lang.Object key) {
            return com.google.common.util.concurrent.Striped.smear(key.hashCode()) & this.mask;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(java.lang.Object key) {
            return getAt(indexFor(key));
        }
    }

    private static class CompactStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        private final java.lang.Object[] array;

        private CompactStriped(int stripes, com.google.common.base.Supplier<L> supplier) {
            super(stripes);
            int i = 0;
            com.google.common.base.Preconditions.checkArgument(stripes <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new java.lang.Object[this.mask + 1];
            while (true) {
                java.lang.Object[] objArr = this.array;
                if (i >= objArr.length) {
                    return;
                }
                objArr[i] = supplier.get();
                i++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            return (L) this.array[i];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }
    }

    static class SmallLazyStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        final java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference<? extends L>> locks;
        final java.lang.ref.ReferenceQueue<L> queue;
        final int size;
        final com.google.common.base.Supplier<L> supplier;

        SmallLazyStriped(int stripes, com.google.common.base.Supplier<L> supplier) {
            super(stripes);
            this.queue = new java.lang.ref.ReferenceQueue<>();
            int i = this.mask == -1 ? Integer.MAX_VALUE : this.mask + 1;
            this.size = i;
            this.locks = new java.util.concurrent.atomic.AtomicReferenceArray<>(i);
            this.supplier = supplier;
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.size != Integer.MAX_VALUE) {
                com.google.common.base.Preconditions.checkElementIndex(i, size());
            }
            com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference<? extends L> arrayReference = this.locks.get(i);
            L l = arrayReference == null ? null : (L) arrayReference.get();
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference arrayReference2 = new com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference(l2, i, this.queue);
            while (!kotlin.UByte$$ExternalSyntheticBackport0.m(this.locks, i, arrayReference, arrayReference2)) {
                arrayReference = this.locks.get(i);
                L l3 = arrayReference == null ? null : (L) arrayReference.get();
                if (l3 != null) {
                    return l3;
                }
            }
            drainQueue();
            return l2;
        }

        private void drainQueue() {
            while (true) {
                java.lang.ref.Reference<? extends L> referencePoll = this.queue.poll();
                if (referencePoll == null) {
                    return;
                }
                com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference arrayReference = (com.google.common.util.concurrent.Striped.SmallLazyStriped.ArrayReference) referencePoll;
                kotlin.UByte$$ExternalSyntheticBackport0.m(this.locks, arrayReference.index, arrayReference, (java.lang.Object) null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }

        private static final class ArrayReference<L> extends java.lang.ref.WeakReference<L> {
            final int index;

            ArrayReference(L referent, int index, java.lang.ref.ReferenceQueue<L> queue) {
                super(referent, queue);
                this.index = index;
            }
        }
    }

    static class LargeLazyStriped<L> extends com.google.common.util.concurrent.Striped.PowerOfTwoStriped<L> {
        final java.util.concurrent.ConcurrentMap<java.lang.Integer, L> locks;
        final int size;
        final com.google.common.base.Supplier<L> supplier;

        LargeLazyStriped(int stripes, com.google.common.base.Supplier<L> supplier) {
            super(stripes);
            this.size = this.mask == -1 ? Integer.MAX_VALUE : this.mask + 1;
            this.supplier = supplier;
            this.locks = new com.google.common.collect.MapMaker().weakValues().makeMap();
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i) {
            if (this.size != Integer.MAX_VALUE) {
                com.google.common.base.Preconditions.checkElementIndex(i, size());
            }
            L l = this.locks.get(java.lang.Integer.valueOf(i));
            if (l != null) {
                return l;
            }
            L l2 = this.supplier.get();
            return (L) com.google.common.base.MoreObjects.firstNonNull(this.locks.putIfAbsent(java.lang.Integer.valueOf(i), l2), l2);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int x) {
        return 1 << com.google.common.math.IntMath.log2(x, java.math.RoundingMode.CEILING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PaddedLock extends java.util.concurrent.locks.ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        PaddedLock() {
            super(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class PaddedSemaphore extends java.util.concurrent.Semaphore {
        long unused1;
        long unused2;
        long unused3;

        PaddedSemaphore(int permits) {
            super(permits, false);
        }
    }
}
