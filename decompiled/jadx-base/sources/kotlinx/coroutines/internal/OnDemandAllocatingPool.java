package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: OnDemandAllocatingPool.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\t\u0010\u0014\u001a\u00020\u0004H\u0082\bJ\r\u0010\u0015\u001a\u00020\r*\u00020\u0004H\u0082\bR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", "T", "", "maxCapacity", "", "create", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)V", "controlState", "Lkotlinx/atomicfu/AtomicInt;", "elements", "Lkotlinx/atomicfu/AtomicArray;", "allocate", "", "close", "", "stateRepresentation", "", "stateRepresentation$kotlinx_coroutines_core", "toString", "tryForbidNewElements", "isClosed", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OnDemandAllocatingPool<T> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater controlState$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.internal.OnDemandAllocatingPool.class, "controlState");

    @kotlin.jvm.Volatile
    private volatile int controlState;
    private final kotlin.jvm.functions.Function1<java.lang.Integer, T> create;
    private final java.util.concurrent.atomic.AtomicReferenceArray elements;
    private final int maxCapacity;

    private final boolean isClosed(int i) {
        return (i & Integer.MIN_VALUE) != 0;
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandAllocatingPool(int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T> function1) {
        this.maxCapacity = i;
        this.create = function1;
        this.elements = new java.util.concurrent.atomic.AtomicReferenceArray(i);
    }

    private final int tryForbidNewElements() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                return 0;
            }
        } while (!controlState$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        return i;
    }

    public final boolean allocate() {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((Integer.MIN_VALUE & i) != 0) {
                return false;
            }
            if (i >= this.maxCapacity) {
                return true;
            }
        } while (!controlState$FU.compareAndSet(this, i, i + 1));
        this.elements.set(i, this.create.invoke(java.lang.Integer.valueOf(i)));
        return true;
    }

    public final java.util.List<T> close() {
        int i;
        java.lang.Object andSet;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = controlState$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if ((i & Integer.MIN_VALUE) != 0) {
                i = 0;
                break;
            }
        } while (!controlState$FU.compareAndSet(this, i, Integer.MIN_VALUE | i));
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((kotlin.collections.IntIterator) it).nextInt();
            do {
                andSet = this.elements.getAndSet(iNextInt, null);
            } while (andSet == null);
            arrayList.add(andSet);
        }
        return arrayList;
    }

    public final java.lang.String stateRepresentation$kotlinx_coroutines_core() {
        int i = controlState$FU.get(this);
        kotlin.ranges.IntRange intRangeUntil = kotlin.ranges.RangesKt.until(0, Integer.MAX_VALUE & i);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        java.util.Iterator<java.lang.Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            arrayList.add(this.elements.get(((kotlin.collections.IntIterator) it).nextInt()));
        }
        return arrayList.toString() + ((i & Integer.MIN_VALUE) != 0 ? "[closed]" : "");
    }

    public java.lang.String toString() {
        return "OnDemandAllocatingPool(" + stateRepresentation$kotlinx_coroutines_core() + ')';
    }
}
