package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: Atomic.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001f\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0013R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/internal/AtomicOp;", "T", "Lkotlinx/coroutines/internal/OpDescriptor;", "()V", "_consensus", "Lkotlinx/atomicfu/AtomicRef;", "", "atomicOp", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "complete", "", "affected", "failure", "(Ljava/lang/Object;Ljava/lang/Object;)V", "decide", "decision", "perform", "prepare", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AtomicOp<T> extends kotlinx.coroutines.internal.OpDescriptor {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _consensus$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.AtomicOp.class, java.lang.Object.class, "_consensus");

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _consensus = kotlinx.coroutines.internal.AtomicKt.NO_DECISION;

    public abstract void complete(T affected, java.lang.Object failure);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
        return this;
    }

    public abstract java.lang.Object prepare(T affected);

    private final java.lang.Object decide(java.lang.Object decision) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(decision != kotlinx.coroutines.internal.AtomicKt.NO_DECISION)) {
                throw new java.lang.AssertionError();
            }
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _consensus$FU;
        java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj != kotlinx.coroutines.internal.AtomicKt.NO_DECISION) {
            return obj;
        }
        return kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, this, kotlinx.coroutines.internal.AtomicKt.NO_DECISION, decision) ? decision : atomicReferenceFieldUpdater.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.OpDescriptor
    public final java.lang.Object perform(java.lang.Object affected) {
        java.lang.Object objDecide = _consensus$FU.get(this);
        if (objDecide == kotlinx.coroutines.internal.AtomicKt.NO_DECISION) {
            objDecide = decide(prepare(affected));
        }
        complete(affected, objDecide);
        return objDecide;
    }
}
