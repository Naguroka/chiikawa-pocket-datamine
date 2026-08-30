package androidx.lifecycle;

/* JADX INFO: compiled from: FlowLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a0\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u001a2\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Landroidx/lifecycle/LiveData;", "asLiveData", "timeout", "Ljava/time/Duration;", "context", "Lkotlin/coroutines/CoroutineContext;", "timeoutInMs", "", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowLiveDataConversions {
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        return asLiveData$default(flow, (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }

    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData$default(flow, context, 0L, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ androidx.lifecycle.LiveData asLiveData$default(kotlinx.coroutines.flow.Flow flow, kotlin.coroutines.CoroutineContext coroutineContext, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            j = 5000;
        }
        return asLiveData(flow, coroutineContext, j);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Landroidx/lifecycle/LiveDataScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    static final class C03061<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.lifecycle.LiveDataScope<T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_asLiveData;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03061(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super androidx.lifecycle.FlowLiveDataConversions.C03061> continuation) {
            super(2, continuation);
            this.$this_asLiveData = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.lifecycle.FlowLiveDataConversions.C03061 c03061 = new androidx.lifecycle.FlowLiveDataConversions.C03061(this.$this_asLiveData, continuation);
            c03061.L$0 = obj;
            return c03061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.lifecycle.LiveDataScope<T> liveDataScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.lifecycle.FlowLiveDataConversions.C03061) create(liveDataScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final androidx.lifecycle.LiveDataScope liveDataScope = (androidx.lifecycle.LiveDataScope) this.L$0;
                this.label = 1;
                if (this.$this_asLiveData.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.lifecycle.FlowLiveDataConversions.asLiveData.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        java.lang.Object objEmit = liveDataScope.emit(t, continuation);
                        return objEmit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : kotlin.Unit.INSTANCE;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext context, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.room.RoomTrackingLiveData roomTrackingLiveData = (androidx.lifecycle.LiveData<T>) androidx.lifecycle.CoroutineLiveDataKt.liveData(context, j, new androidx.lifecycle.FlowLiveDataConversions.C03061(flow, null));
        if (flow instanceof kotlinx.coroutines.flow.StateFlow) {
            if (androidx.arch.core.executor.ArchTaskExecutor.getInstance().isMainThread()) {
                roomTrackingLiveData.setValue(((kotlinx.coroutines.flow.StateFlow) flow).getValue());
            } else {
                roomTrackingLiveData.postValue(((kotlinx.coroutines.flow.StateFlow) flow).getValue());
            }
        }
        return roomTrackingLiveData;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowLiveData.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", i = {0, 0}, l = {112, 116}, m = "invokeSuspend", n = {"$this$callbackFlow", "observer"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.lifecycle.LiveData<T> $this_asFlow;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.lifecycle.LiveData<T> liveData, kotlin.coroutines.Continuation<? super androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_asFlow = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1 anonymousClass1 = new androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1(this.$this_asFlow, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final androidx.lifecycle.Observer observer;
            kotlinx.coroutines.channels.ProducerScope producerScope;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                final kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                observer = new androidx.lifecycle.Observer() { // from class: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$$ExternalSyntheticLambda0
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(java.lang.Object obj2) {
                        producerScope2.mo2805trySendJP2dKIU(obj2);
                    }
                };
                this.L$0 = producerScope2;
                this.L$1 = observer;
                this.label = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain().getImmediate(), new androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.C00051(this.$this_asFlow, observer, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
            } else {
                if (i == 1) {
                    observer = (androidx.lifecycle.Observer) this.L$1;
                    producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
            final androidx.lifecycle.LiveData<T> liveData = this.$this_asFlow;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.lifecycle.FlowLiveDataConversions.asFlow.1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: FlowLiveData.kt */
                @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class C00061 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                    final /* synthetic */ androidx.lifecycle.Observer<T> $observer;
                    final /* synthetic */ androidx.lifecycle.LiveData<T> $this_asFlow;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C00061(androidx.lifecycle.LiveData<T> liveData, androidx.lifecycle.Observer<T> observer, kotlin.coroutines.Continuation<? super androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.AnonymousClass2.C00061> continuation) {
                        super(2, continuation);
                        this.$this_asFlow = liveData;
                        this.$observer = observer;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                        return new androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.AnonymousClass2.C00061(this.$this_asFlow, this.$observer, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                        return ((androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.AnonymousClass2.C00061) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                    }

                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        this.$this_asFlow.removeObserver((androidx.lifecycle.Observer<? super T>) this.$observer);
                        return kotlin.Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                    invoke2();
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.GlobalScope.INSTANCE, kotlinx.coroutines.Dispatchers.getMain().getImmediate(), null, new androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.AnonymousClass2.C00061(liveData, observer, null), 2, null);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowLiveData.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C00051 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ androidx.lifecycle.Observer<T> $observer;
            final /* synthetic */ androidx.lifecycle.LiveData<T> $this_asFlow;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00051(androidx.lifecycle.LiveData<T> liveData, androidx.lifecycle.Observer<T> observer, kotlin.coroutines.Continuation<? super androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.C00051> continuation) {
                super(2, continuation);
                this.$this_asFlow = liveData;
                this.$observer = observer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.C00051(this.$this_asFlow, this.$observer, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1.C00051) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.$this_asFlow.observeForever((androidx.lifecycle.Observer<? super T>) this.$observer);
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(androidx.lifecycle.LiveData<T> liveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "<this>");
        return kotlinx.coroutines.flow.FlowKt.conflate(kotlinx.coroutines.flow.FlowKt.callbackFlow(new androidx.lifecycle.FlowLiveDataConversions.AnonymousClass1(liveData, null)));
    }

    public static /* synthetic */ androidx.lifecycle.LiveData asLiveData$default(kotlinx.coroutines.flow.Flow flow, java.time.Duration duration, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return asLiveData(flow, duration, coroutineContext);
    }

    public static final <T> androidx.lifecycle.LiveData<T> asLiveData(kotlinx.coroutines.flow.Flow<? extends T> flow, java.time.Duration timeout, kotlin.coroutines.CoroutineContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "timeout");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return asLiveData(flow, context, androidx.lifecycle.Api26Impl.INSTANCE.toMillis(timeout));
    }
}
