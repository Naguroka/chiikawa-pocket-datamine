package androidx.lifecycle;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"flowWithLifecycle", "Lkotlinx/coroutines/flow/Flow;", "T", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExt.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", i = {0}, l = {91}, m = "invokeSuspend", n = {"$this$callbackFlow"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.lifecycle.Lifecycle $lifecycle;
        final /* synthetic */ androidx.lifecycle.Lifecycle.State $minActiveState;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_flowWithLifecycle;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super androidx.lifecycle.FlowExtKt.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.lifecycle.FlowExtKt.AnonymousClass1 anonymousClass1 = new androidx.lifecycle.FlowExtKt.AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.lifecycle.FlowExtKt.AnonymousClass1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExt.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
        static final class C00031 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $$this$callbackFlow;
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00031(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super androidx.lifecycle.FlowExtKt.AnonymousClass1.C00031> continuation) {
                super(2, continuation);
                this.$this_flowWithLifecycle = flow;
                this.$$this$callbackFlow = producerScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.lifecycle.FlowExtKt.AnonymousClass1.C00031(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.lifecycle.FlowExtKt.AnonymousClass1.C00031) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<T> flow = this.$this_flowWithLifecycle;
                    final kotlinx.coroutines.channels.ProducerScope<T> producerScope = this.$$this$callbackFlow;
                    this.label = 1;
                    if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            java.lang.Object objSend = producerScope.send(t, continuation);
                            return objSend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSend : kotlin.Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlinx.coroutines.channels.ProducerScope producerScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                this.L$0 = producerScope2;
                this.label = 1;
                if (androidx.lifecycle.RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, this.$minActiveState, new androidx.lifecycle.FlowExtKt.AnonymousClass1.C00031(this.$this_flowWithLifecycle, producerScope2, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(producerScope, null, 1, null);
            return kotlin.Unit.INSTANCE;
        }
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flowWithLifecycle$default(kotlinx.coroutines.flow.Flow flow, androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            state = androidx.lifecycle.Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(flow, lifecycle, state);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flowWithLifecycle(kotlinx.coroutines.flow.Flow<? extends T> flow, androidx.lifecycle.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state) {
        return kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.lifecycle.FlowExtKt.AnonymousClass1(lifecycle, state, flow, null));
    }
}
