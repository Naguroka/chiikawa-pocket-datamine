package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: UniversalRequestEventSender.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/events/UniversalRequestEventSender;", "", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "handleGatewayEventResponse", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "(Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;)V", "invoke", "", "universalRequest", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "(Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UniversalRequestEventSender {
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.events.HandleGatewayEventResponse handleGatewayEventResponse;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: UniversalRequestEventSender.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", i = {0}, l = {15, 21}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.events.UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(com.unity3d.ads.gatewayclient.GatewayClient gatewayClient, com.unity3d.ads.core.domain.events.HandleGatewayEventResponse handleGatewayEventResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayEventResponse, "handleGatewayEventResponse");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.events.UniversalRequestEventSender universalRequestEventSender;
        if (continuation instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender.AnonymousClass1(continuation);
        }
        java.lang.Object objRequest$default = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objRequest$default);
            com.unity3d.ads.gatewayclient.GatewayClient gatewayClient = this.gatewayClient;
            com.unity3d.ads.core.data.model.OperationType operationType = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objRequest$default = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, anonymousClass1, 1, null);
            if (objRequest$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            universalRequestEventSender = this;
        } else {
            if (i == 1) {
                universalRequestEventSender = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objRequest$default);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objRequest$default);
            }
            return kotlin.Unit.INSTANCE;
        }
        com.unity3d.ads.core.domain.events.HandleGatewayEventResponse handleGatewayEventResponse = universalRequestEventSender.handleGatewayEventResponse;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (handleGatewayEventResponse.invoke((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) objRequest$default, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
