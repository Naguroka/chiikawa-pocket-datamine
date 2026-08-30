package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetHeaderBiddingToken;", "Lcom/unity3d/ads/core/domain/GetHeaderBiddingToken;", "buildHeaderBiddingToken", "Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;", "(Lcom/unity3d/ads/core/domain/BuildHeaderBiddingToken;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetHeaderBiddingToken implements com.unity3d.ads.core.domain.GetHeaderBiddingToken {
    public static final java.lang.String HB_TOKEN_VERSION = "2";
    private final com.unity3d.ads.core.domain.BuildHeaderBiddingToken buildHeaderBiddingToken;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetHeaderBiddingToken.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", i = {}, l = {9}, m = "invoke", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.this.invoke(this);
        }
    }

    public CommonGetHeaderBiddingToken(com.unity3d.ads.core.domain.BuildHeaderBiddingToken buildHeaderBiddingToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1 anonymousClass1;
        if (continuation instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.AnonymousClass1(continuation);
        }
        java.lang.Object objInvoke = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objInvoke);
            com.unity3d.ads.core.domain.BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
            anonymousClass1.label = 1;
            objInvoke = buildHeaderBiddingToken.invoke(anonymousClass1);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objInvoke);
        }
        com.google.protobuf.ByteString byteString = ((gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) objInvoke).toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "rawToken.toByteString()");
        return "2:" + com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null);
    }
}
