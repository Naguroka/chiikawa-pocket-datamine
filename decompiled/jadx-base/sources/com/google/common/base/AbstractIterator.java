package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
abstract class AbstractIterator<T> implements java.util.Iterator<T> {

    @javax.annotation.CheckForNull
    private T next;
    private com.google.common.base.AbstractIterator.State state = com.google.common.base.AbstractIterator.State.NOT_READY;

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
        this.state = com.google.common.base.AbstractIterator.State.DONE;
        return null;
    }

    /* JADX INFO: renamed from: com.google.common.base.AbstractIterator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$base$AbstractIterator$State;

        static {
            int[] iArr = new int[com.google.common.base.AbstractIterator.State.values().length];
            $SwitchMap$com$google$common$base$AbstractIterator$State = iArr;
            try {
                iArr[com.google.common.base.AbstractIterator.State.DONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$base$AbstractIterator$State[com.google.common.base.AbstractIterator.State.READY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        com.google.common.base.Preconditions.checkState(this.state != com.google.common.base.AbstractIterator.State.FAILED);
        int i = com.google.common.base.AbstractIterator.AnonymousClass1.$SwitchMap$com$google$common$base$AbstractIterator$State[this.state.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return tryToComputeNext();
        }
        return true;
    }

    private boolean tryToComputeNext() {
        this.state = com.google.common.base.AbstractIterator.State.FAILED;
        this.next = computeNext();
        if (this.state == com.google.common.base.AbstractIterator.State.DONE) {
            return false;
        }
        this.state = com.google.common.base.AbstractIterator.State.READY;
        return true;
    }

    @Override // java.util.Iterator
    @com.google.common.base.ParametricNullness
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.state = com.google.common.base.AbstractIterator.State.NOT_READY;
        T t = (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.next);
        this.next = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
