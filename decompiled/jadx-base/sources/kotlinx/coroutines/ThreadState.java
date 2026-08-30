package kotlinx.coroutines;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002#\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001j\u0002`\u0007B\r\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0006\u0010\u0018\u001a\u00020\u0006R\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/ThreadState;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "job", "Lkotlinx/coroutines/Job;", "(Lkotlinx/coroutines/Job;)V", "_state", "Lkotlinx/atomicfu/AtomicInt;", "cancelHandle", "Lkotlinx/coroutines/DisposableHandle;", "targetThread", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "clearInterrupt", "invalidState", "", "state", "", "invoke", "setup", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ThreadState implements kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.ThreadState.class, "_state");

    @kotlin.jvm.Volatile
    private volatile int _state;
    private kotlinx.coroutines.DisposableHandle cancelHandle;
    private final kotlinx.coroutines.Job job;
    private final java.lang.Thread targetThread = java.lang.Thread.currentThread();

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(java.lang.Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public ThreadState(kotlinx.coroutines.Job job) {
        this.job = job;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
        invoke2(th);
        return kotlin.Unit.INSTANCE;
    }

    public final void setup() {
        int i;
        this.cancelHandle = this.job.invokeOnCompletion(true, true, this);
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _state$FU;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2 || i == 3) {
                    return;
                }
                invalidState(i);
                throw new kotlin.KotlinNothingValueException();
            }
        } while (!_state$FU.compareAndSet(this, i, 0));
    }

    public final void clearInterrupt() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _state$FU;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        java.lang.Thread.interrupted();
                        return;
                    } else {
                        invalidState(i);
                        throw new kotlin.KotlinNothingValueException();
                    }
                }
            } else if (_state$FU.compareAndSet(this, i, 1)) {
                kotlinx.coroutines.DisposableHandle disposableHandle = this.cancelHandle;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(java.lang.Throwable cause) {
        int i;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = _state$FU;
        do {
            i = atomicIntegerFieldUpdater2.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                invalidState(i);
                throw new kotlin.KotlinNothingValueException();
            }
            atomicIntegerFieldUpdater = _state$FU;
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.targetThread.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    private final java.lang.Void invalidState(int state) {
        throw new java.lang.IllegalStateException(("Illegal state " + state).toString());
    }
}
