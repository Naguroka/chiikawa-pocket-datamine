package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidRefresh.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidRefresh;", "Lcom/unity3d/ads/core/domain/Refresh;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getAdDataRefreshRequest", "Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/GetAdDataRefreshRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;)V", "invoke", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "opportunityId", "Lcom/google/protobuf/ByteString;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidRefresh implements com.unity3d.ads.core.domain.Refresh {
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher;
    private final com.unity3d.ads.gatewayclient.GatewayClient gatewayClient;
    private final com.unity3d.ads.core.domain.GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidRefresh.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidRefresh", f = "AndroidRefresh.kt", i = {}, l = {25}, m = "invoke", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidRefresh.this.invoke(null, null, this);
        }
    }

    public AndroidRefresh(kotlinx.coroutines.CoroutineDispatcher defaultDispatcher, com.unity3d.ads.core.domain.GetAdDataRefreshRequest getAdDataRefreshRequest, com.unity3d.ads.core.domain.GetRequestPolicy getRequestPolicy, com.unity3d.ads.gatewayclient.GatewayClient gatewayClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        this.defaultDispatcher = defaultDispatcher;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.Refresh
    public java.lang.Object invoke(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation) throws java.lang.Throwable {
        com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass1 anonymousClass1;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass1(continuation);
        }
        java.lang.Object objWithContext = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.defaultDispatcher;
            com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass2(byteString2, byteString, null);
            anonymousClass1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, anonymousClass2, anonymousClass1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objWithContext);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objWithContext, "override suspend fun inv…RefreshResponse\n        }");
        return objWithContext;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidRefresh.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", i = {}, l = {26, 28}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $adDataRefreshToken;
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.google.protobuf.ByteString byteString, com.google.protobuf.ByteString byteString2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$adDataRefreshToken = byteString;
            this.$opportunityId = byteString2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidRefresh.this.new AnonymousClass2(this.$adDataRefreshToken, this.$opportunityId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidRefresh.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.unity3d.ads.core.domain.AndroidRefresh.this.getAdDataRefreshRequest.invoke(this.$adDataRefreshToken, this.$opportunityId, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
            }
            com.unity3d.ads.gatewayclient.RequestPolicy requestPolicyInvoke = com.unity3d.ads.core.domain.AndroidRefresh.this.getRequestPolicy.invoke();
            this.label = 2;
            obj = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(com.unity3d.ads.core.domain.AndroidRefresh.this.gatewayClient, null, (gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke, com.unity3d.ads.core.data.model.OperationType.REFRESH, this, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return ((gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
        }
    }
}
