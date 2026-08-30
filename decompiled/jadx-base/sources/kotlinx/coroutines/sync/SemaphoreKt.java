package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u001a\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002\u001a6\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012*\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"BROKEN", "Lkotlinx/coroutines/internal/Symbol;", "CANCELLED", "MAX_SPIN_CYCLES", "", "PERMIT", "SEGMENT_SIZE", "TAKEN", "Semaphore", "Lkotlinx/coroutines/sync/Semaphore;", "permits", "acquiredPermits", "createSegment", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "id", "", "prev", "withPermit", "T", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Semaphore;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SemaphoreKt {
    private static final int MAX_SPIN_CYCLES = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (java.lang.Object) null);
    private static final kotlinx.coroutines.internal.Symbol PERMIT = new kotlinx.coroutines.internal.Symbol("PERMIT");
    private static final kotlinx.coroutines.internal.Symbol TAKEN = new kotlinx.coroutines.internal.Symbol("TAKEN");
    private static final kotlinx.coroutines.internal.Symbol BROKEN = new kotlinx.coroutines.internal.Symbol("BROKEN");
    private static final kotlinx.coroutines.internal.Symbol CANCELLED = new kotlinx.coroutines.internal.Symbol("CANCELLED");
    private static final int SEGMENT_SIZE = kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (java.lang.Object) null);

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.SemaphoreKt$withPermit$1, reason: invalid class name */
    /* JADX INFO: compiled from: Semaphore.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {86}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.sync.SemaphoreKt.withPermit(null, null, this);
        }
    }

    public static final kotlinx.coroutines.sync.Semaphore Semaphore(int i, int i2) {
        return new kotlinx.coroutines.sync.SemaphoreImpl(i, i2);
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Semaphore Semaphore$default(int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return Semaphore(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object withPermit(kotlinx.coroutines.sync.Semaphore semaphore, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.sync.SemaphoreKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = semaphore;
            anonymousClass1.L$1 = function0;
            anonymousClass1.label = 1;
            if (semaphore.acquire(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (kotlin.jvm.functions.Function0) anonymousClass1.L$1;
            semaphore = (kotlinx.coroutines.sync.Semaphore) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            semaphore.release();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    private static final <T> java.lang.Object withPermit$$forInline(kotlinx.coroutines.sync.Semaphore semaphore, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        semaphore.acquire(continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            semaphore.release();
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.sync.SemaphoreSegment createSegment(long j, kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment) {
        return new kotlinx.coroutines.sync.SemaphoreSegment(j, semaphoreSegment, 0);
    }
}
