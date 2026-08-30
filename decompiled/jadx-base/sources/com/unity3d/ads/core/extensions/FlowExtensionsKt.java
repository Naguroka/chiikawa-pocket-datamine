package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: FlowExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001ao\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u000627\u0010\u0007\u001a3\b\u0001\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\n0\t¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"timeoutAfter", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "", com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "block", "Lkotlin/Function2;", "Lkotlin/Function0;", "", "Lkotlin/ParameterName;", "name", "close", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;JZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1, reason: invalid class name */
    /* JADX INFO: compiled from: FlowExtensions.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", f = "FlowExtensions.kt", i = {0}, l = {15, 17}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ boolean $active;
        final /* synthetic */ kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(long j, boolean z, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$timeoutMillis = j;
            this.$active = z;
            this.$block = function2;
            this.$this_timeoutAfter = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1 anonymousClass1 = new com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: FlowExtensions.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", f = "FlowExtensions.kt", i = {}, l = {10}, m = "invokeSuspend", n = {}, s = {})
        static final class C02601 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $$this$channelFlow;
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_timeoutAfter;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C02601(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.C02601> continuation) {
                super(2, continuation);
                this.$this_timeoutAfter = flow;
                this.$$this$channelFlow = producerScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.C02601(this.$this_timeoutAfter, this.$$this$channelFlow, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.C02601) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<T> flow = this.$this_timeoutAfter;
                    final kotlinx.coroutines.channels.ProducerScope<T> producerScope = this.$$this$channelFlow;
                    this.label = 1;
                    if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
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
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$$this$channelFlow, null, 1, null);
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
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.C02601(this.$this_timeoutAfter, producerScope, null), 3, null);
                this.L$0 = producerScope;
                this.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(this.$timeoutMillis, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
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
            if (this.$active) {
                kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.$block;
                com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1.AnonymousClass2(producerScope);
                this.L$0 = null;
                this.label = 2;
                if (function2.invoke(anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: FlowExtensions.kt */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass2 extends kotlin.jvm.internal.AdaptedFunctionReference implements kotlin.jvm.functions.Function0<kotlin.Unit> {
            AnonymousClass2(java.lang.Object obj) {
                super(0, obj, kotlinx.coroutines.channels.ProducerScope.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default((kotlinx.coroutines.channels.ProducerScope) this.receiver, null, 1, null);
            }
        }
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> timeoutAfter(kotlinx.coroutines.flow.Flow<? extends T> flow, long j, boolean z, kotlin.jvm.functions.Function2<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        return kotlinx.coroutines.flow.FlowKt.channelFlow(new com.unity3d.ads.core.extensions.FlowExtensionsKt.AnonymousClass1(j, z, block, flow, null));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow timeoutAfter$default(kotlinx.coroutines.flow.Flow flow, long j, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(flow, j, z, function2);
    }
}
