package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001aB\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"HOLDS_LOCK_ANOTHER_OWNER", "", "HOLDS_LOCK_UNLOCKED", "HOLDS_LOCK_YES", "NO_OWNER", "Lkotlinx/coroutines/internal/Symbol;", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "TRY_LOCK_ALREADY_LOCKED_BY_OWNER", "TRY_LOCK_FAILED", "TRY_LOCK_SUCCESS", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final kotlinx.coroutines.internal.Symbol NO_OWNER = new kotlinx.coroutines.internal.Symbol("NO_OWNER");
    private static final kotlinx.coroutines.internal.Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = new kotlinx.coroutines.internal.Symbol("ALREADY_LOCKED_BY_OWNER");
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1, reason: invalid class name */
    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {125}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.MutexKt.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.sync.MutexKt.withLock(null, null, null, this);
        }
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean z) {
        return new kotlinx.coroutines.sync.MutexImpl(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.sync.MutexKt.AnonymousClass1 anonymousClass1;
        if (continuation instanceof kotlinx.coroutines.sync.MutexKt.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.sync.MutexKt.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.sync.MutexKt.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.sync.MutexKt.AnonymousClass1(continuation);
        }
        java.lang.Object obj2 = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj2);
            anonymousClass1.L$0 = mutex;
            anonymousClass1.L$1 = obj;
            anonymousClass1.L$2 = function0;
            anonymousClass1.label = 1;
            if (mutex.lock(obj, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function0 = (kotlin.jvm.functions.Function0) anonymousClass1.L$2;
            obj = anonymousClass1.L$1;
            mutex = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj2);
        }
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    private static final <T> java.lang.Object withLock$$forInline(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(obj, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(obj, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
