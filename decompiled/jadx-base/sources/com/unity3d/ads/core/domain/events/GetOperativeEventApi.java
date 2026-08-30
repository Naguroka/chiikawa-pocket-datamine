package com.unity3d.ads.core.domain.events;

/* JADX INFO: compiled from: GetOperativeEventApi.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J=\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0011J)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "", "operativeEventRepository", "Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;", "operativeEventRequest", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;", "(Lcom/unity3d/ads/core/data/repository/OperativeEventRepository;Lcom/unity3d/ads/core/domain/events/GetOperativeEventRequest;)V", "invoke", "", "operativeEventType", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;", "opportunityId", "Lcom/google/protobuf/ByteString;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, "additionalEventData", "playerServerId", "", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventType;Lcom/unity3d/ads/core/data/model/AdObject;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetOperativeEventApi {
    private final com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository;
    private final com.unity3d.ads.core.domain.events.GetOperativeEventRequest operativeEventRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetOperativeEventApi.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", i = {0}, l = {20}, m = "invoke", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.events.GetOperativeEventApi.this.invoke(null, null, null, null, null, this);
        }
    }

    public GetOperativeEventApi(com.unity3d.ads.core.data.repository.OperativeEventRepository operativeEventRepository, com.unity3d.ads.core.domain.events.GetOperativeEventRequest operativeEventRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRepository, "operativeEventRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = operativeEventRequest;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, com.google.protobuf.ByteString byteString3, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str = null;
        }
        return getOperativeEventApi.invoke(operativeEventType, byteString, byteString2, byteString3, str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, com.google.protobuf.ByteString byteString3, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi;
        if (continuation instanceof com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1(continuation);
        }
        com.unity3d.ads.core.domain.events.GetOperativeEventApi.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object objInvoke = anonymousClass2.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest getOperativeEventRequest = this.operativeEventRequest;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            objInvoke = getOperativeEventRequest.invoke(operativeEventType, byteString2, byteString, byteString3, str, anonymousClass2);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            getOperativeEventApi = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getOperativeEventApi = (com.unity3d.ads.core.domain.events.GetOperativeEventApi) anonymousClass2.L$0;
            kotlin.ResultKt.throwOnFailure(objInvoke);
        }
        getOperativeEventApi.operativeEventRepository.addOperativeEvent((gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventRequest) objInvoke);
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invoke(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType, com.unity3d.ads.core.data.model.AdObject adObject, com.google.protobuf.ByteString byteString, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objInvoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), continuation);
        return objInvoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.Unit.INSTANCE;
    }
}
