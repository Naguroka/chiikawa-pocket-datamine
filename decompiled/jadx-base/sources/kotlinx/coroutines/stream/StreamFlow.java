package kotlinx.coroutines.stream;

/* JADX INFO: compiled from: Stream.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class StreamFlow<T> implements kotlinx.coroutines.flow.Flow<T> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.stream.StreamFlow.class, "consumed");

    @kotlin.jvm.Volatile
    private volatile int consumed = 0;
    private final java.util.stream.Stream<T> stream;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: Stream.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {26}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.stream.StreamFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.stream.StreamFlow<T> streamFlow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.stream.StreamFlow.AnonymousClass1> continuation) {
            super(continuation);
            this.this$0 = streamFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public StreamFlow(java.util.stream.Stream<T> stream) {
        this.stream = stream;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        kotlinx.coroutines.stream.StreamFlow.AnonymousClass1 anonymousClass1;
        kotlinx.coroutines.stream.StreamFlow<T> streamFlow;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.util.Iterator<T> it;
        if (continuation instanceof kotlinx.coroutines.stream.StreamFlow.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.stream.StreamFlow.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new kotlinx.coroutines.stream.StreamFlow.AnonymousClass1(this, continuation);
            }
        } else {
            anonymousClass1 = new kotlinx.coroutines.stream.StreamFlow.AnonymousClass1(this, continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (!consumed$FU.compareAndSet(this, 0, 1)) {
                throw new java.lang.IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
            }
            try {
                streamFlow = this;
                flowCollector2 = flowCollector;
                it = this.stream.iterator();
            } catch (java.lang.Throwable th) {
                th = th;
                streamFlow = this;
                streamFlow.stream.close();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) anonymousClass1.L$2;
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
            streamFlow = (kotlinx.coroutines.stream.StreamFlow) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
                flowCollector2 = flowCollector3;
            } catch (java.lang.Throwable th2) {
                th = th2;
                streamFlow.stream.close();
                throw th;
            }
        }
        while (it.hasNext()) {
            T next = it.next();
            anonymousClass1.L$0 = streamFlow;
            anonymousClass1.L$1 = flowCollector2;
            anonymousClass1.L$2 = it;
            anonymousClass1.label = 1;
            if (flowCollector2.emit(next, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        streamFlow.stream.close();
        return kotlin.Unit.INSTANCE;
    }
}
