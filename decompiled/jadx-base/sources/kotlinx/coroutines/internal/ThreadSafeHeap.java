package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ThreadSafeHeap.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0004j\u0002`\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u0019J,\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u00002\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020\u0017J0\u0010 \u001a\u0004\u0018\u00018\u00002!\u0010!\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\r0\u001d¢\u0006\u0002\u0010$J\u000f\u0010%\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0002\u0010&J\r\u0010'\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010&J\u0015\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\nH\u0002¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010.J$\u0010/\u001a\u0004\u0018\u00018\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u001dH\u0086\b¢\u0006\u0002\u0010$J\r\u00100\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010&J\u0011\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0010H\u0082\u0010J\u0011\u00103\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0010H\u0082\u0010J\u0018\u00104\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u0010H\u0002R\t\u0010\u0007\u001a\u00020\bX\u0082\u0004R\u001a\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u00066"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "T", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "()V", "_size", "Lkotlinx/atomicfu/AtomicInt;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "", "()Z", "value", "", "size", "getSize", "()I", "setSize", "(I)V", "addImpl", "", "node", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "addLastIf", "cond", "Lkotlin/Function1;", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "find", "predicate", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "removeAtImpl", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "siftDownFrom", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "siftUpFrom", "swap", "j", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ThreadSafeHeap<T extends kotlinx.coroutines.internal.ThreadSafeHeapNode & java.lang.Comparable<? super T>> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _size$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.internal.ThreadSafeHeap.class, "_size");

    @kotlin.jvm.Volatile
    private volatile int _size;
    private T[] a;

    public final int getSize() {
        return _size$FU.get(this);
    }

    private final void setSize(int i) {
        _size$FU.set(this, i);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public final T removeAtImpl(int index) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getSize() > 0)) {
                throw new java.lang.AssertionError();
            }
        }
        T[] tArr = this.a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(tArr);
        setSize(getSize() - 1);
        if (index < getSize()) {
            swap(index, getSize());
            int i = (index - 1) / 2;
            if (index > 0) {
                T t = tArr[index];
                kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                T t2 = tArr[i];
                kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                if (((java.lang.Comparable) t).compareTo(t2) < 0) {
                    swap(index, i);
                    siftUpFrom(i);
                } else {
                    siftDownFrom(index);
                }
            } else {
                siftDownFrom(index);
            }
        }
        T t3 = tArr[getSize()];
        kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(t3.getHeap() == this)) {
                throw new java.lang.AssertionError();
            }
        }
        t3.setHeap(null);
        t3.setIndex(-1);
        tArr[getSize()] = null;
        return t3;
    }

    public final void addImpl(T node) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(node.getHeap() == null)) {
                throw new java.lang.AssertionError();
            }
        }
        node.setHeap(this);
        kotlinx.coroutines.internal.ThreadSafeHeapNode[] threadSafeHeapNodeArrRealloc = realloc();
        int size = getSize();
        setSize(size + 1);
        threadSafeHeapNodeArrRealloc[size] = node;
        node.setIndex(size);
        siftUpFrom(size);
    }

    private final void siftUpFrom(int i) {
        while (i > 0) {
            T[] tArr = this.a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            kotlin.jvm.internal.Intrinsics.checkNotNull(t);
            T t2 = tArr[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
            if (((java.lang.Comparable) t).compareTo(t2) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final void siftDownFrom(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 >= getSize()) {
                return;
            }
            T[] tArr = this.a;
            kotlin.jvm.internal.Intrinsics.checkNotNull(tArr);
            int i3 = i2 + 1;
            if (i3 < getSize()) {
                T t = tArr[i3];
                kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                T t2 = tArr[i2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                if (((java.lang.Comparable) t).compareTo(t2) < 0) {
                    i2 = i3;
                }
            }
            T t3 = tArr[i];
            kotlin.jvm.internal.Intrinsics.checkNotNull(t3);
            T t4 = tArr[i2];
            kotlin.jvm.internal.Intrinsics.checkNotNull(t4);
            if (((java.lang.Comparable) t3).compareTo(t4) <= 0) {
                return;
            }
            swap(i, i2);
            i = i2;
        }
    }

    private final T[] realloc() {
        T[] tArr = this.a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new kotlinx.coroutines.internal.ThreadSafeHeapNode[4];
            this.a = tArr2;
            return tArr2;
        }
        if (getSize() < tArr.length) {
            return tArr;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(tArr, getSize() * 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((kotlinx.coroutines.internal.ThreadSafeHeapNode[]) objArrCopyOf);
        this.a = tArr3;
        return tArr3;
    }

    private final void swap(int i, int j) {
        T[] tArr = this.a;
        kotlin.jvm.internal.Intrinsics.checkNotNull(tArr);
        T t = tArr[j];
        kotlin.jvm.internal.Intrinsics.checkNotNull(t);
        T t2 = tArr[i];
        kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
        tArr[i] = t;
        tArr[j] = t2;
        t.setIndex(i);
        t2.setIndex(j);
    }

    public final void clear() {
        synchronized (this) {
            T[] tArr = this.a;
            if (tArr != null) {
                kotlin.collections.ArraysKt.fill$default(tArr, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            }
            _size$FU.set(this, 0);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final T find(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        T t;
        synchronized (this) {
            int size = getSize();
            int i = 0;
            while (true) {
                t = null;
                if (i >= size) {
                    break;
                }
                T[] tArr = this.a;
                if (tArr != null) {
                    t = (java.lang.Object) tArr[i];
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(t);
                if (predicate.invoke(t).booleanValue()) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    public final T peek() {
        T t;
        synchronized (this) {
            t = (T) firstImpl();
        }
        return t;
    }

    public final T removeFirstOrNull() {
        T t;
        synchronized (this) {
            t = getSize() > 0 ? (T) removeAtImpl(0) : null;
        }
        return t;
    }

    public final T removeFirstIf(kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
        synchronized (this) {
            int i = 1;
            try {
                kotlinx.coroutines.internal.ThreadSafeHeapNode threadSafeHeapNodeFirstImpl = firstImpl();
                T t = null;
                if (threadSafeHeapNodeFirstImpl == null) {
                    kotlin.jvm.internal.InlineMarker.finallyStart(2);
                    return null;
                }
                if (predicate.invoke(threadSafeHeapNodeFirstImpl).booleanValue()) {
                    t = (T) removeAtImpl(0);
                }
                kotlin.jvm.internal.InlineMarker.finallyStart(i);
                return t;
            } finally {
                kotlin.jvm.internal.InlineMarker.finallyStart(i);
                kotlin.jvm.internal.InlineMarker.finallyEnd(i);
            }
        }
    }

    public final void addLast(T node) {
        synchronized (this) {
            addImpl(node);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final boolean addLastIf(T node, kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> cond) {
        boolean z;
        synchronized (this) {
            try {
                if (cond.invoke(firstImpl()).booleanValue()) {
                    addImpl(node);
                    z = true;
                } else {
                    z = false;
                }
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
            } catch (java.lang.Throwable th) {
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        return z;
    }

    public final boolean remove(T node) {
        boolean z;
        synchronized (this) {
            z = false;
            if (node.getHeap() != null) {
                int index = node.getIndex();
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    if (!(index >= 0)) {
                        throw new java.lang.AssertionError();
                    }
                }
                removeAtImpl(index);
                z = true;
            }
        }
        return z;
    }
}
