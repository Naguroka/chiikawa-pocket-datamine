package androidx.datastore.core;

/* JADX INFO: compiled from: MultiProcessCoordinator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", i = {0, 0}, l = {org.objectweb.asm.Opcodes.INVOKEVIRTUAL}, m = "getExclusiveFileLockWithRetryIfDeadlock", n = {"lockFileStream", "backoff"}, s = {"L$0", "J$0"})
final class MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.MultiProcessCoordinator.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1(androidx.datastore.core.MultiProcessCoordinator.Companion companion, kotlin.coroutines.Continuation<? super androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1> continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getExclusiveFileLockWithRetryIfDeadlock(null, this);
    }
}
