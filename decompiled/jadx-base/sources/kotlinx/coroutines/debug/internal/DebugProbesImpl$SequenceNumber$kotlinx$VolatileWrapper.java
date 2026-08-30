package kotlinx.coroutines.debug.internal;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: compiled from: DebugProbesImpl.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper {
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater sequenceNumber$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper.class, "sequenceNumber");

    @kotlin.jvm.Volatile
    private volatile long sequenceNumber;

    private DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper() {
    }

    public /* synthetic */ DebugProbesImpl$SequenceNumber$kotlinx$VolatileWrapper(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
