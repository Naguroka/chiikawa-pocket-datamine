package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetInitializationRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetInitializationRequest;", "Lcom/unity3d/ads/core/domain/GetInitializationRequest;", "getInitializationRequestPayload", "Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;", "getUniversalRequestForPayLoad", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "(Lcom/unity3d/ads/core/domain/GetInitializationRequestPayload;Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetInitializationRequest implements com.unity3d.ads.core.domain.GetInitializationRequest {
    private final com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload;
    private final com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequest", f = "AndroidGetInitializationRequest.kt", i = {0}, l = {11, 15}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetInitializationRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequest(com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload, com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationRequestPayload, "getInitializationRequestPayload");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getInitializationRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequest
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.AndroidGetInitializationRequest androidGetInitializationRequest;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetInitializationRequest.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                androidGetInitializationRequest = (com.unity3d.ads.core.domain.AndroidGetInitializationRequest) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
        }
        kotlin.ResultKt.throwOnFailure(objInvoke);
        com.unity3d.ads.core.domain.GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializationRequestPayload;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        objInvoke = getInitializationRequestPayload.invoke(anonymousClass1);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidGetInitializationRequest = this;
        gatewayprotocol.v1.UniversalRequestKt universalRequestKt = gatewayprotocol.v1.UniversalRequestKt.INSTANCE;
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl.INSTANCE;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setInitializationRequest((gatewayprotocol.v1.InitializationRequestOuterClass.InitializationRequest) objInvoke);
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
        com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetInitializationRequest.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }
}
