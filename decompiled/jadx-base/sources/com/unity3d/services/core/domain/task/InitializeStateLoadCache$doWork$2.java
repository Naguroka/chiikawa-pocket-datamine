package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class InitializeStateLoadCache$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$2(com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache, com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2(this.this$0, this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> continuation) {
        return ((com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult loadCacheResult;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.domain.task.InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params = this.$params;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            byte[] webViewData = initializeStateLoadCache.getWebViewData();
            boolean z = true;
            if (webViewData == null) {
                loadCacheResult = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                java.lang.String strSha256 = com.unity3d.services.core.misc.Utilities.Sha256(webViewData);
                java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
                java.lang.String str = new java.lang.String(webViewData, charsetForName);
                boolean z2 = strSha256 == null || !kotlin.jvm.internal.Intrinsics.areEqual(strSha256, params.getConfig().getWebViewHash());
                if (!z2) {
                    com.unity3d.services.core.log.DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                }
                if (!z2) {
                    z = false;
                }
                loadCacheResult = new com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult(z, str);
            }
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(loadCacheResult);
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1308isSuccessimpl(objM1301constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(objM1301constructorimpl);
        } else {
            java.lang.Throwable thM1304exceptionOrNullimpl = kotlin.Result.m1304exceptionOrNullimpl(objM1301constructorimpl);
            if (thM1304exceptionOrNullimpl != null) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(thM1304exceptionOrNullimpl));
            }
        }
        return kotlin.Result.m1300boximpl(objM1301constructorimpl);
    }
}
