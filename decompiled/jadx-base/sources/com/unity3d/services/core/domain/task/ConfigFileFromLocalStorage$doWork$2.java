package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2", f = "ConfigFileFromLocalStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class ConfigFileFromLocalStorage$doWork$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>, java.lang.Object> {
    final /* synthetic */ com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConfigFileFromLocalStorage$doWork$2(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params, kotlin.coroutines.Continuation<? super com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2(this.$params, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        return ((com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        com.unity3d.services.core.configuration.Configuration configuration;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params = this.$params;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.io.File file = new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalConfigurationFilepath());
            if (!file.exists()) {
                configuration = params.getDefaultConfiguration();
            } else {
                configuration = new com.unity3d.services.core.configuration.Configuration(new org.json.JSONObject(kotlin.io.FilesKt.readText$default(file, null, 1, null)));
            }
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(configuration);
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
