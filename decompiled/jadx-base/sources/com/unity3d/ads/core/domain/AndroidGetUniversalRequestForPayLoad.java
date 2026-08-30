package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidGetUniversalRequestForPayLoad.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetUniversalRequestForPayLoad;", "Lcom/unity3d/ads/core/domain/GetUniversalRequestForPayLoad;", "getUniversalRequestSharedData", "Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;", "(Lcom/unity3d/ads/core/domain/GetUniversalRequestSharedData;)V", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "payload", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest$Payload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidGetUniversalRequestForPayLoad implements com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad {
    private final com.unity3d.ads.core.domain.GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetUniversalRequestForPayLoad.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", i = {0, 0}, l = {14}, m = "invoke", n = {"payload", "$this$invoke_u24lambda_u240"}, s = {"L$0", "L$2"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.this.invoke(null, this);
        }
    }

    public AndroidGetUniversalRequestForPayLoad(com.unity3d.ads.core.domain.GetUniversalRequestSharedData getUniversalRequestSharedData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    public java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest> continuation) {
        com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1 anonymousClass1;
        gatewayprotocol.v1.UniversalRequestKt.Dsl dsl;
        gatewayprotocol.v1.UniversalRequestKt.Dsl dsl2;
        gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload payload2;
        gatewayprotocol.v1.UniversalRequestKt.Dsl dsl3;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gatewayprotocol.v1.UniversalRequestKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalRequestKt.Dsl.INSTANCE;
            gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            gatewayprotocol.v1.UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            com.unity3d.ads.core.domain.GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
            anonymousClass1.L$0 = payload;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 1;
            java.lang.Object objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objInvoke;
            payload2 = payload;
            dsl3 = dsl2;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) anonymousClass1.L$3;
            dsl = (gatewayprotocol.v1.UniversalRequestKt.Dsl) anonymousClass1.L$2;
            dsl2 = (gatewayprotocol.v1.UniversalRequestKt.Dsl) anonymousClass1.L$1;
            payload2 = (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.Payload) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        dsl3.setSharedData((gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
        dsl.setPayload(payload2);
        return dsl2._build();
    }
}
