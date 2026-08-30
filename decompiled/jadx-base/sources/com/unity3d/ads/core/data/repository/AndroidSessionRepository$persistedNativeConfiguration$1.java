package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidSessionRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "", "sdkConfig", "isInit"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1", f = "AndroidSessionRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class AndroidSessionRepository$persistedNativeConfiguration$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, java.lang.Boolean, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    AndroidSessionRepository$persistedNativeConfiguration$1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1> continuation) {
        super(3, continuation);
    }

    public final java.lang.Object invoke(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, boolean z, kotlin.coroutines.Continuation<? super kotlin.Pair<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, java.lang.Boolean>> continuation) {
        com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1 androidSessionRepository$persistedNativeConfiguration$1 = new com.unity3d.ads.core.data.repository.AndroidSessionRepository$persistedNativeConfiguration$1(continuation);
        androidSessionRepository$persistedNativeConfiguration$1.L$0 = nativeConfiguration;
        androidSessionRepository$persistedNativeConfiguration$1.Z$0 = z;
        return androidSessionRepository$persistedNativeConfiguration$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Pair<? extends gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, ? extends java.lang.Boolean>> continuation) {
        return invoke(nativeConfiguration, bool.booleanValue(), (kotlin.coroutines.Continuation<? super kotlin.Pair<gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration, java.lang.Boolean>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return kotlin.TuplesKt.to((gatewayprotocol.v1.NativeConfigurationOuterClass.NativeConfiguration) this.L$0, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(this.Z$0));
    }
}
