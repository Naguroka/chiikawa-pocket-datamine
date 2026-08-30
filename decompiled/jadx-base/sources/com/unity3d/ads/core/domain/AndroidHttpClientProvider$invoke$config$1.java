package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/core/configuration/Configuration;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1", f = "AndroidHttpClientProvider.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
final class AndroidHttpClientProvider$invoke$config$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.configuration.Configuration>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidHttpClientProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHttpClientProvider$invoke$config$1(com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1> continuation) {
        super(2, continuation);
        this.this$0 = androidHttpClientProvider;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1 androidHttpClientProvider$invoke$config$1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1(this.this$0, continuation);
        androidHttpClientProvider$invoke$config$1.L$0 = obj;
        return androidHttpClientProvider$invoke$config$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.services.core.configuration.Configuration> continuation) {
        return ((com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object objM1301constructorimpl;
        java.lang.Object value;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider = this.this$0;
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage = androidHttpClientProvider.configFileFromLocalStorage;
                com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params(null, 1, null);
                this.label = 1;
                value = configFileFromLocalStorage.mo1219invokegIAlus(params, this);
                if (value == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                value = ((kotlin.Result) obj).getValue();
            }
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.Result.m1300boximpl(value));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM1301constructorimpl = kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m1307isFailureimpl(objM1301constructorimpl)) {
            objM1301constructorimpl = null;
        }
        kotlin.Result result = (kotlin.Result) objM1301constructorimpl;
        if (result == null) {
            return null;
        }
        java.lang.Object value2 = result.getValue();
        return (com.unity3d.services.core.configuration.Configuration) (kotlin.Result.m1307isFailureimpl(value2) ? null : value2);
    }
}
