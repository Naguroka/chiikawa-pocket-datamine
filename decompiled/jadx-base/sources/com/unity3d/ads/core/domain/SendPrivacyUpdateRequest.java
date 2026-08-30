package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: SendPrivacyUpdateRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/domain/SendPrivacyUpdateRequest;", "", "getPrivacyUpdateRequest", "Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "(Lcom/unity3d/ads/core/domain/GetPrivacyUpdateRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/PrivacyUpdateResponseOuterClass$PrivacyUpdateResponse;", "privacyUpdateVersion", "", "privacyUpdateContent", "Lcom/google/protobuf/ByteString;", "(ILcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SendPrivacyUpdateRequest {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendPrivacyUpdateRequest.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", i = {0}, l = {21, 23}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.this.invoke(0, null, this);
        }
    }

    public SendPrivacyUpdateRequest(com.unity3d.ads.core.domain.GetPrivacyUpdateRequest getPrivacyUpdateRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getPrivacyUpdateRequest, "getPrivacyUpdateRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(int i, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse> continuation) {
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest sendPrivacyUpdateRequest;
        if (continuation instanceof com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1(continuation);
        }
        com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object objInvoke = anonymousClass2.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass2.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            com.unity3d.ads.core.domain.GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            objInvoke = getPrivacyUpdateRequest.invoke(i, byteString, anonymousClass2);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            sendPrivacyUpdateRequest = this;
        } else {
            if (i2 == 1) {
                sendPrivacyUpdateRequest = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest) anonymousClass2.L$0;
                kotlin.ResultKt.throwOnFailure(objInvoke);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objInvoke).getPayload().getPrivacyUpdateResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse, "response.payload.privacyUpdateResponse");
            return privacyUpdateResponse;
        }
        com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke = sendPrivacyUpdateRequest.getRequestPolicy.invoke();
        com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = sendPrivacyUpdateRequest.gatewayClient;
        com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.PRIVACY_UPDATE;
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 2;
        objInvoke = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        gatewayprotocol.v1.PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objInvoke).getPayload().getPrivacyUpdateResponse();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(privacyUpdateResponse2, "response.payload.privacyUpdateResponse");
        return privacyUpdateResponse2;
    }
}
