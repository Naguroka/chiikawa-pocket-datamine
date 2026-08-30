package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateNetworkError.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2", f = "InitializeStateNetworkError.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
final class InitializeStateNetworkError$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params $params;
    java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2(com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError, com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateNetworkError;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends kotlin.Unit>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError2 = this.this$0;
                com.unity3d.services.core.domain.task.InitializeStateNetworkError.Params params = this.$params;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.services.core.log.DeviceLog.error("Unity Ads init: network error, waiting for connection events");
                initializeStateNetworkError2.maximumConnectedEvents = params.getConfig().getMaximumConnectedEvents();
                initializeStateNetworkError2.connectedEventThreshold = params.getConfig().getConnectedEventThreshold();
                long networkErrorTimeout = params.getConfig().getNetworkErrorTimeout();
                com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1 initializeStateNetworkError$doWork$2$1$success$1 = new com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1(initializeStateNetworkError2, null);
                this.L$0 = initializeStateNetworkError2;
                this.label = 1;
                java.lang.Object objWithTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(networkErrorTimeout, initializeStateNetworkError$doWork$2$1$success$1, this);
                if (objWithTimeoutOrNull == coroutine_suspended) {
                    return coroutine_suspended;
                }
                initializeStateNetworkError = initializeStateNetworkError2;
                obj = objWithTimeoutOrNull;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                initializeStateNetworkError = (com.unity3d.services.core.domain.task.InitializeStateNetworkError) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (((kotlin.Unit) obj) == null) {
                com.unity3d.services.core.connectivity.ConnectivityMonitor.removeListener(initializeStateNetworkError);
                throw new java.lang.Exception("No connected events within the timeout!");
            }
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Unit.INSTANCE);
            if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
            } else {
                java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
                if (thM1304exceptionOrNullimpl != null) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
                }
            }
            return kotlin.Result.m1300boximpl(objM1301constructorimpl);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }
}
