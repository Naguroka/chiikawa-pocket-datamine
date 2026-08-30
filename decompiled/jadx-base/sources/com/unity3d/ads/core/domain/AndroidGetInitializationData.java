package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetInitializationData.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationData;", "Lcom/unity3d/ads/core/domain/GetInitializationData;", "getInitializeRequestPayload", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getUniversalRequestSharedData", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;)V", "invoke", "Lgatewayprotocol/v1/InitializationDataOuterClass$InitializationData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetInitializationData implements com.unity3d.ads.core.domain.GetInitializationData {
    private final com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializeRequestPayload;
    private final com.unity3d.ads.core.domain.GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationData.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationData", f = "AndroidGetInitializationData.kt", i = {0, 0}, l = {10, 11}, m = "invoke", n = {"this", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetInitializationData.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetInitializationData.this.invoke(this);
        }
    }

    public AndroidGetInitializationData(com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializeRequestPayload, com.unity3d.ads.core.domain.GetUniversalRequestSharedData getUniversalRequestSharedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializeRequestPayload, "getInitializeRequestPayload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getInitializeRequestPayload = getInitializeRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.InitializationDataOuterClass.InitializationData> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationData.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl_create;
        com.unity3d.ads.core.domain.AndroidGetInitializationData androidGetInitializationData;
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl;
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl2;
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl3;
        gatewayprotocol.v1.InitializationDataKt.Dsl dsl4;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationData.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetInitializationData.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationData.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationData.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                gatewayprotocol.v1.InitializationDataKt.Dsl dsl5 = (gatewayprotocol.v1.InitializationDataKt.Dsl) anonymousClass1.L$3;
                dsl = (gatewayprotocol.v1.InitializationDataKt.Dsl) anonymousClass1.L$2;
                gatewayprotocol.v1.InitializationDataKt.Dsl dsl6 = (gatewayprotocol.v1.InitializationDataKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationData = (com.unity3d.ads.core.domain.AndroidGetInitializationData) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
                dsl2 = dsl5;
                dsl_create = dsl6;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl4 = (gatewayprotocol.v1.InitializationDataKt.Dsl) anonymousClass1.L$1;
                dsl3 = (gatewayprotocol.v1.InitializationDataKt.Dsl) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            dsl4.setSharedData((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
            return dsl3._build();
        }
        kotlin.ResultKt.throwOnFailure(objInvoke);
        gatewayprotocol.v1.InitializationDataKt.Dsl.Companion companion = gatewayprotocol.v1.InitializationDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.Builder builderNewBuilder = gatewayprotocol.v1.InitializationDataOuterClass.InitializationData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializeRequestPayload;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objInvoke = getInitializationRequestPayload.invoke(anonymousClass1);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidGetInitializationData = this;
        dsl = dsl_create;
        dsl2 = dsl;
        dsl2.setInitializationRequest((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) objInvoke);
        com.unity3d.ads.core.domain.GetUniversalRequestSharedData getUniversalRequestSharedData = androidGetInitializationData.getUniversalRequestSharedData;
        anonymousClass1.L$0 = dsl_create;
        anonymousClass1.L$1 = dsl;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        dsl3 = dsl_create;
        dsl4 = dsl;
        dsl4.setSharedData((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
        return dsl3._build();
    }
}
