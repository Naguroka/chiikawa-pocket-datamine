package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B?\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "concurrency", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "additionalToStringProps", "", "collectTo", "", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ChannelFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final int concurrency;
    private final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> flow;

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.Flow flow, int i, kotlin.coroutines.EmptyCoroutineContext emptyCoroutineContext, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, i, (i3 & 4) != 0 ? kotlin.coroutines.EmptyCoroutineContext.INSTANCE : emptyCoroutineContext, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? kotlinx.coroutines.channels.BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow, int i, kotlin.coroutines.CoroutineContext coroutineContext, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(coroutineContext, i2, bufferOverflow);
        this.flow = flow;
        this.concurrency = i;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return new kotlinx.coroutines.flow.internal.ChannelFlowMerge(this.flow, this.concurrency, context, capacity, onBufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope scope) {
        return kotlinx.coroutines.channels.ProduceKt.produce(scope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objCollect = this.flow.collect(new kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2((kotlinx.coroutines.Job) continuation.get$context().get(kotlinx.coroutines.Job.INSTANCE), kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(this.concurrency, 0, 2, null), producerScope, new kotlinx.coroutines.flow.internal.SendingCollector(producerScope)), continuation);
        return objCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
        final /* synthetic */ kotlinx.coroutines.Job $job;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $scope;
        final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.Job job, kotlinx.coroutines.sync.Semaphore semaphore, kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlinx.coroutines.flow.internal.SendingCollector<T> sendingCollector) {
            this.$job = job;
            this.$semaphore = semaphore;
            this.$scope = producerScope;
            this.$collector = sendingCollector;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((kotlinx.coroutines.flow.Flow) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
            kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2<T> anonymousClass2;
            if (continuation instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) {
                channelFlowMerge$collectTo$2$emit$1 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) continuation;
                if ((channelFlowMerge$collectTo$2$emit$1.label & Integer.MIN_VALUE) != 0) {
                    channelFlowMerge$collectTo$2$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    channelFlowMerge$collectTo$2$emit$1 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
                }
            } else {
                channelFlowMerge$collectTo$2$emit$1 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
            }
            java.lang.Object obj = channelFlowMerge$collectTo$2$emit$1.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = channelFlowMerge$collectTo$2$emit$1.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.Job job = this.$job;
                if (job != null) {
                    kotlinx.coroutines.JobKt.ensureActive(job);
                }
                kotlinx.coroutines.sync.Semaphore semaphore = this.$semaphore;
                channelFlowMerge$collectTo$2$emit$1.L$0 = this;
                channelFlowMerge$collectTo$2$emit$1.L$1 = flow;
                channelFlowMerge$collectTo$2$emit$1.label = 1;
                if (semaphore.acquire(channelFlowMerge$collectTo$2$emit$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass2 = this;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                flow = (kotlinx.coroutines.flow.Flow) channelFlowMerge$collectTo$2$emit$1.L$1;
                anonymousClass2 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2) channelFlowMerge$collectTo$2$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(anonymousClass2.$scope, null, null, new kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1(flow, anonymousClass2.$collector, anonymousClass2.$semaphore, null), 3, null);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $inner;
            final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.internal.SendingCollector<T> sendingCollector, kotlinx.coroutines.sync.Semaphore semaphore, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1> continuation) {
                super(2, continuation);
                this.$inner = flow;
                this.$collector = sendingCollector;
                this.$semaphore = semaphore;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1(this.$inner, this.$collector, this.$semaphore, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.$inner.collect(this.$collector, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    this.$semaphore.release();
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th) {
                    this.$semaphore.release();
                    throw th;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }
}
