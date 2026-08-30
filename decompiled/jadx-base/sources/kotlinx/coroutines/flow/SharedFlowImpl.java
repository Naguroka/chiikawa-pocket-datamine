package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", androidx.media3.extractor.text.ttml.TtmlNode.TAG_HEAD, "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private java.lang.Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.BufferOverflow.values().length];
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {372, 379, 382}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return emit$suspendImpl(this, t, continuation);
    }

    public SharedFlowImpl(int i, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return java.lang.Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.bufferSize);
    }

    private final long getQueueEndIndex() {
        return getHead() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    protected final T getLastReplayedLocked() {
        java.lang.Object[] objArr = this.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        return (T) kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr, (this.replayIndex + ((long) getReplaySize())) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl2;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.flow.FlowCollector flowCollector3;
        if (continuation instanceof kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1(sharedFlowImpl, continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.flow.SharedFlowImpl.AnonymousClass1(sharedFlowImpl, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlotAllocateSlot = sharedFlowImpl.allocateSlot();
            try {
                if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
                    anonymousClass1.L$0 = sharedFlowImpl;
                    anonymousClass1.L$1 = flowCollector;
                    anonymousClass1.L$2 = sharedFlowSlotAllocateSlot;
                    anonymousClass1.label = 1;
                    if (((kotlinx.coroutines.flow.SubscribedFlowCollector) flowCollector).onSubscription(anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                flowCollector2 = flowCollector;
                sharedFlowSlot = sharedFlowSlotAllocateSlot;
                job = (kotlinx.coroutines.Job) anonymousClass1.get$context().get(kotlinx.coroutines.Job.INSTANCE);
                flowCollector3 = flowCollector2;
            } catch (java.lang.Throwable th2) {
                sharedFlowImpl2 = sharedFlowImpl;
                th = th2;
                sharedFlowSlot = sharedFlowSlotAllocateSlot;
            }
        } else {
            if (i == 1) {
                sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) anonymousClass1.L$2;
                kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl3 = (kotlinx.coroutines.flow.SharedFlowImpl) anonymousClass1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector2 = flowCollector4;
                    sharedFlowImpl = sharedFlowImpl3;
                    try {
                        job = (kotlinx.coroutines.Job) anonymousClass1.get$context().get(kotlinx.coroutines.Job.INSTANCE);
                        flowCollector3 = flowCollector2;
                    } catch (java.lang.Throwable th3) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th = th3;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    sharedFlowImpl2 = sharedFlowImpl3;
                }
            } else {
                if (i != 2 && i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.Job job2 = (kotlinx.coroutines.Job) anonymousClass1.L$3;
                sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) anonymousClass1.L$2;
                kotlinx.coroutines.flow.FlowCollector flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                sharedFlowImpl2 = (kotlinx.coroutines.flow.SharedFlowImpl) anonymousClass1.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    flowCollector3 = flowCollector5;
                    job = job2;
                    sharedFlowImpl = sharedFlowImpl2;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                }
            }
            sharedFlowImpl2.freeSlot(sharedFlowSlot);
            throw th;
        }
        while (true) {
            java.lang.Object objTryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
            if (objTryTakeValue == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                anonymousClass1.L$0 = sharedFlowImpl;
                anonymousClass1.L$1 = flowCollector3;
                anonymousClass1.L$2 = sharedFlowSlot;
                anonymousClass1.L$3 = job;
                anonymousClass1.label = 2;
                if (sharedFlowImpl.awaitValue(sharedFlowSlot, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (job != null) {
                    kotlinx.coroutines.JobKt.ensureActive(job);
                }
                anonymousClass1.L$0 = sharedFlowImpl;
                anonymousClass1.L$1 = flowCollector3;
                anonymousClass1.L$2 = sharedFlowSlot;
                anonymousClass1.L$3 = job;
                anonymousClass1.label = 3;
                if (flowCollector3.emit(objTryTakeValue, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i;
        boolean z;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArrFindSlotsToResumeLocked = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(value)) {
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked);
                z = true;
            } else {
                z = false;
            }
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : continuationArrFindSlotsToResumeLocked) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        return z;
    }

    static /* synthetic */ <T> java.lang.Object emit$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objEmitSuspend;
        return (!sharedFlowImpl.tryEmit(t) && (objEmitSuspend = sharedFlowImpl.emitSuspend(t, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? objEmitSuspend : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T value) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        enqueueLocked(value);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T value) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getNCollectors() == 0)) {
                throw new java.lang.AssertionError();
            }
        }
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + ((long) this.bufferSize);
        return true;
    }

    private final void dropOldestLocked() {
        java.lang.Object[] objArr = this.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(getHead() == head)) {
                throw new java.lang.AssertionError();
            }
        }
    }

    private final void correctCollectorIndexesOnDropOldest(long newHead) {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < newHead) {
                        sharedFlowSlot.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(java.lang.Object item) {
        int totalSize = getTotalSize();
        java.lang.Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + ((long) totalSize), item);
    }

    private final java.lang.Object[] growBuffer(java.lang.Object[] curBuffer, int curSize, int newSize) {
        if (!(newSize > 0)) {
            throw new java.lang.IllegalStateException("Buffer size overflow".toString());
        }
        java.lang.Object[] objArr = new java.lang.Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long head = getHead();
        for (int i = 0; i < curSize; i++) {
            long j = ((long) i) + head;
            kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, j, kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(curBuffer, j));
        }
        return objArr;
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        int iMin;
        long j;
        long j2;
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(oldIndex >= this.minCollectorIndex)) {
                throw new java.lang.AssertionError();
            }
        }
        if (oldIndex > this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j3 = ((long) this.bufferSize) + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j3++;
        }
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j3) {
                        j3 = sharedFlowSlot.index;
                    }
                }
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(j3 >= this.minCollectorIndex)) {
                throw new java.lang.AssertionError();
            }
        }
        if (j3 <= this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        if (getNCollectors() > 0) {
            iMin = java.lang.Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j3)));
        } else {
            iMin = this.queueSize;
        }
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        long j4 = ((long) this.queueSize) + bufferEndIndex;
        if (iMin > 0) {
            continuationArr = new kotlin.coroutines.Continuation[iMin];
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            long j5 = bufferEndIndex;
            int i = 0;
            while (true) {
                if (bufferEndIndex >= j4) {
                    j = j3;
                    break;
                }
                java.lang.Object bufferAt = kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr, bufferEndIndex);
                if (bufferAt != kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(bufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) bufferAt;
                    int i2 = i + 1;
                    j = j3;
                    continuationArr[i] = emitter.cont;
                    kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, bufferEndIndex, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE);
                    kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, j5, emitter.value);
                    j2 = 1;
                    j5++;
                    if (i2 >= iMin) {
                        break;
                    }
                    i = i2;
                } else {
                    j = j3;
                    j2 = 1;
                }
                bufferEndIndex += j2;
                j3 = j;
            }
            bufferEndIndex = j5;
        } else {
            j = j3;
        }
        int i3 = (int) (bufferEndIndex - head);
        long j6 = getNCollectors() == 0 ? bufferEndIndex : j;
        long jMax = java.lang.Math.max(this.replayIndex, bufferEndIndex - ((long) java.lang.Math.min(this.replay, i3)));
        if (this.bufferCapacity == 0 && jMax < j4) {
            java.lang.Object[] objArr2 = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr2, jMax), kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE)) {
                bufferEndIndex++;
                jMax++;
            }
        }
        updateBufferLocked(jMax, j6, bufferEndIndex, j4);
        cleanupTailLocked();
        return true ^ (continuationArr.length == 0) ? findSlotsToResumeLocked(continuationArr) : continuationArr;
    }

    private final void updateBufferLocked(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long jMin = java.lang.Math.min(newMinCollectorIndex, newReplayIndex);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(jMin >= getHead())) {
                throw new java.lang.AssertionError();
            }
        }
        for (long head = getHead(); head < jMin; head++) {
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - jMin);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.bufferSize >= 0)) {
                throw new java.lang.AssertionError();
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.queueSize >= 0)) {
                throw new java.lang.AssertionError();
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            if (!(this.replayIndex <= getHead() + ((long) this.bufferSize))) {
                throw new java.lang.AssertionError();
            }
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr, (getHead() + ((long) getTotalSize())) - 1) == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, getHead() + ((long) getTotalSize()), null);
            }
        }
    }

    private final java.lang.Object tryTakeValue(kotlinx.coroutines.flow.SharedFlowSlot slot) {
        java.lang.Object obj;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            long jTryPeekLocked = tryPeekLocked(slot);
            if (jTryPeekLocked < 0) {
                obj = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE;
            } else {
                long j = slot.index;
                java.lang.Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                slot.index = jTryPeekLocked + 1;
                continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                obj = peekedValueLockedAt;
            }
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : continuationArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(kotlinx.coroutines.flow.SharedFlowSlot slot) {
        long j = slot.index;
        if (j < getBufferEndIndex()) {
            return j;
        }
        if (this.bufferCapacity <= 0 && j <= getHead() && this.queueSize != 0) {
            return j;
        }
        return -1L;
    }

    private final java.lang.Object getPeekedValueLockedAt(long index) {
        java.lang.Object[] objArr = this.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        java.lang.Object bufferAt = kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr, index);
        return bufferAt instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter ? ((kotlinx.coroutines.flow.SharedFlowImpl.Emitter) bufferAt).value : bufferAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] findSlotsToResumeLocked(kotlin.coroutines.Continuation<kotlin.Unit>[] resumesIn) {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot;
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation;
        int length = resumesIn.length;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).nCollectors != 0 && (abstractSharedFlowSlotArr = ((kotlinx.coroutines.flow.internal.AbstractSharedFlow) sharedFlowImpl).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            while (i < length2) {
                kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot == null || (continuation = (sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot).cont) == null || tryPeekLocked(sharedFlowSlot) < 0) {
                    resumesIn = resumesIn;
                } else {
                    if (length >= resumesIn.length) {
                        resumesIn = resumesIn;
                        resumesIn = resumesIn;
                        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf((java.lang.Object[]) resumesIn, java.lang.Math.max(2, resumesIn.length * 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        resumesIn = objArrCopyOf;
                    }
                    resumesIn = resumesIn;
                    resumesIn = resumesIn;
                    ((kotlin.coroutines.Continuation[]) resumesIn)[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                resumesIn = resumesIn;
            }
            resumesIn = resumesIn;
        }
        return (kotlin.coroutines.Continuation[]) resumesIn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.SharedFlowSlot createSlot() {
        return new kotlinx.coroutines.flow.SharedFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.SharedFlowSlot[] createSlotArray(int size) {
        return new kotlinx.coroutines.flow.SharedFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    /* JADX INFO: compiled from: SharedFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Emitter implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.coroutines.Continuation<kotlin.Unit> cont;
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> flow;
        public long index;
        public final java.lang.Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(kotlinx.coroutines.flow.SharedFlowImpl<?> sharedFlowImpl, long j, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(replaySize);
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr, this.replayIndex + ((long) i)));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object emitSuspend(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArrFindSlotsToResumeLocked;
        kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArrFindSlotsToResumeLocked2 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
                continuationArrFindSlotsToResumeLocked = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                emitter = null;
            } else {
                kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter2 = new kotlinx.coroutines.flow.SharedFlowImpl.Emitter(this, ((long) getTotalSize()) + getHead(), t, cancellableContinuationImpl2);
                enqueueLocked(emitter2);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    continuationArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(continuationArrFindSlotsToResumeLocked2);
                }
                continuationArrFindSlotsToResumeLocked = continuationArrFindSlotsToResumeLocked2;
                emitter = emitter2;
            }
        }
        if (emitter != null) {
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, emitter);
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation2 : continuationArrFindSlotsToResumeLocked) {
            if (continuation2 != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                continuation2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            if (kotlinx.coroutines.flow.SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            kotlinx.coroutines.flow.SharedFlowKt.setBufferAt(objArr, emitter.index, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object awaitValue(kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this) {
            if (tryPeekLocked(sharedFlowSlot) < 0) {
                sharedFlowSlot.cont = cancellableContinuationImpl2;
                sharedFlowSlot.cont = cancellableContinuationImpl2;
            } else {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
