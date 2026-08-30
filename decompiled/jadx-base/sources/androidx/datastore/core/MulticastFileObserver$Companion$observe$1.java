package androidx.datastore.core;

/* JADX INFO: compiled from: MulticastFileObserver.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {84, 85}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"})
final class MulticastFileObserver$Companion$observe$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.io.File $file;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastFileObserver$Companion$observe$1(java.io.File file, kotlin.coroutines.Continuation<? super androidx.datastore.core.MulticastFileObserver$Companion$observe$1> continuation) {
        super(2, continuation);
        this.$file = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.datastore.core.MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new androidx.datastore.core.MulticastFileObserver$Companion$observe$1(this.$file, continuation);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.datastore.core.MulticastFileObserver$Companion$observe$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.DisposableHandle disposableHandleObserve;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            final java.io.File file = this.$file;
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$flowObserver$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                    invoke2(str);
                    return kotlin.Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.String str) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(str, file.getName())) {
                        kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope2, kotlin.Unit.INSTANCE);
                    }
                }
            };
            androidx.datastore.core.MulticastFileObserver.Companion companion = androidx.datastore.core.MulticastFileObserver.INSTANCE;
            java.io.File parentFile = this.$file.getParentFile();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFile);
            disposableHandleObserve = companion.observe(parentFile, function1);
            this.L$0 = producerScope2;
            this.L$1 = disposableHandleObserve;
            this.label = 1;
            if (producerScope2.send(kotlin.Unit.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            producerScope = producerScope2;
        } else {
            if (i == 1) {
                disposableHandleObserve = (kotlinx.coroutines.DisposableHandle) this.L$1;
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
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                disposableHandleObserve.dispose();
            }
        }, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
