package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class AbstractIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {

    @javax.annotation.CheckForNull
    private T next;
    private com.google.common.collect.AbstractIterator.State state = com.google.common.collect.AbstractIterator.State.NOT_READY;

    private enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    @javax.annotation.CheckForNull
    protected abstract T computeNext();

    protected AbstractIterator() {
    }

    @javax.annotation.CheckForNull
    protected final T endOfData() {
        this.state = com.google.common.collect.AbstractIterator.State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$AbstractIterator$State;

        static {
            int[] iArr = new int[com.google.common.collect.AbstractIterator.State.values().length];
            $SwitchMap$com$google$common$collect$AbstractIterator$State = iArr;
            try {
                iArr[com.google.common.collect.AbstractIterator.State.DONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$AbstractIterator$State[com.google.common.collect.AbstractIterator.State.READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.Preconditions.checkState(this.state != com.google.common.collect.AbstractIterator.State.FAILED);
        int i = com.google.common.collect.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$collect$AbstractIterator$State[this.state.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return tryToComputeNext();
        }
        return true;
    }

    private boolean tryToComputeNext() {
        this.state = com.google.common.collect.AbstractIterator.State.FAILED;
        this.next = computeNext();
        if (this.state == com.google.common.collect.AbstractIterator.State.DONE) {
            return false;
        }
        this.state = com.google.common.collect.AbstractIterator.State.READY;
        return true;
    }

    @Override // java.util.Iterator
    @com.google.common.collect.ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.state = com.google.common.collect.AbstractIterator.State.NOT_READY;
        T t = (T) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.next);
        this.next = null;
        return t;
    }

    @com.google.common.collect.ParametricNullness
    public final T peek() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        return (T) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.next);
    }
}
