package com.unity3d.ads.core.domain.exposure;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1", f = "CommonAdViewerExposedFunctions.kt", i = {}, l = {243}, m = "invoke", n = {}, s = {})
final class CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16881 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt.C16881 c16881, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1> continuation) {
        super(continuation);
        this.this$0 = c16881;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((java.lang.Object[]) null, (kotlin.coroutines.Continuation<java.lang.Object>) this);
    }
}
