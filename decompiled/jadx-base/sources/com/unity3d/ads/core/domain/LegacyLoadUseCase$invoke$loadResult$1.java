package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: LegacyLoadUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/ads/core/data/model/LoadResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", i = {0, 2, 2}, l = {110, 128, 135, 136}, m = "invokeSuspend", n = {"opportunityIdByteString", "opportunityIdByteString", "headerBiddingAdMarkup"}, s = {"L$0", "L$0", "L$1"})
final class LegacyLoadUseCase$invoke$loadResult$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult>, java.lang.Object> {
    final /* synthetic */ java.lang.String $adMarkup;
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ gatewayprotocol.v1.AdRequestOuterClass.BannerSize $gatewayBannerSize;
    final /* synthetic */ com.unity3d.ads.UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ java.lang.String $placement;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyLoadUseCase this$0;

    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.unity3d.ads.core.data.model.InitializationState.values().length];
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.FAILED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.unity3d.ads.core.data.model.InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$invoke$loadResult$1(java.lang.String str, com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, java.lang.String str2, android.content.Context context, gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1> continuation) {
        super(2, continuation);
        this.$placement = str;
        this.this$0 = legacyLoadUseCase;
        this.$loadOptions = unityAdsLoadOptions;
        this.$adMarkup = str2;
        this.$context = context;
        this.$gatewayBannerSize = bannerSize;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1(this.$placement, this.this$0, this.$loadOptions, this.$adMarkup, this.$context, this.$gatewayBannerSize, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) {
        return ((com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:48:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x014e  */
    /* JADX WARN: Code duplicated, block: B:56:0x016b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.protobuf.ByteString byteString;
        java.lang.Object objHasOpportunityId;
        java.lang.Object objInvoke;
        java.lang.Object objInvoke$default;
        com.google.protobuf.ByteString byteString2;
        gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        com.unity3d.ads.core.data.model.InitializationState initializationState;
        int i;
        java.lang.Object objInvoke2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.$placement != null) {
                java.lang.String opportunityId = this.this$0.getOpportunityId(this.$loadOptions);
                if (opportunityId == null) {
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, com.unity3d.ads.core.data.model.LoadResult.MSG_OPPORTUNITY_ID, null, "no_opportunity_id", null, 20, null);
                }
                java.util.UUID uuidFromString = java.util.UUID.fromString(opportunityId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
                byteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidFromString);
                this.this$0.opportunity = byteString;
                this.L$0 = byteString;
                this.label = 1;
                objHasOpportunityId = this.this$0.adRepository.hasOpportunityId(byteString, this);
                if (objHasOpportunityId == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, "placement_null", null, 20, null);
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objInvoke = obj;
                    return (com.unity3d.ads.core.data.model.LoadResult) objInvoke;
                }
                if (i2 == 3) {
                    gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = (gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
                    com.google.protobuf.ByteString byteString3 = (com.google.protobuf.ByteString) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    headerBiddingAdMarkup = headerBiddingAdMarkup2;
                    byteString2 = byteString3;
                    objInvoke$default = obj;
                    initializationState = (com.unity3d.ads.core.data.model.InitializationState) objInvoke$default;
                    if (initializationState == null) {
                        i = -1;
                    } else {
                        i = com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
                    }
                    if (i != 1) {
                        if (i == 2) {
                            return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, 20, null);
                        }
                        throw new java.lang.IllegalStateException("awaitInitialization timeout");
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    objInvoke2 = this.this$0.load.invoke(this.$context, this.$placement, byteString2, headerBiddingAdMarkup, this.$gatewayBannerSize, this.$loadOptions, this);
                    if (objInvoke2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    objInvoke2 = obj;
                }
                return (com.unity3d.ads.core.data.model.LoadResult) objInvoke2;
            }
            byteString = (com.google.protobuf.ByteString) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            objHasOpportunityId = obj;
        }
        com.google.protobuf.ByteString byteString4 = byteString;
        if (((java.lang.Boolean) objHasOpportunityId).booleanValue()) {
            new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, com.unity3d.ads.core.data.model.LoadResult.MSG_OPPORTUNITY_ID_USED, null, "opportunity_id_used", null, 20, null);
        }
        gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = this.this$0.getHeaderBiddingAdMarkup(this.$adMarkup);
        if (headerBiddingAdMarkup3 != null) {
            int i3 = com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0[this.this$0.getInitializationState.invoke().ordinal()];
            if (i3 == 1) {
                this.L$0 = null;
                this.label = 2;
                objInvoke = this.this$0.load.invoke(this.$context, this.$placement, byteString4, headerBiddingAdMarkup3, this.$gatewayBannerSize, this.$loadOptions, this);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (com.unity3d.ads.core.data.model.LoadResult) objInvoke;
            }
            if (i3 == 2 || i3 == 3) {
                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, 20, null);
            }
            if (i3 == 4) {
                this.L$0 = byteString4;
                this.L$1 = headerBiddingAdMarkup3;
                this.label = 3;
                objInvoke$default = com.unity3d.ads.core.domain.AwaitInitialization.DefaultImpls.invoke$default(this.this$0.awaitInitialization, 0L, this, 1, null);
                if (objInvoke$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
                byteString2 = byteString4;
                headerBiddingAdMarkup = headerBiddingAdMarkup3;
                initializationState = (com.unity3d.ads.core.data.model.InitializationState) objInvoke$default;
                if (initializationState == null) {
                    i = -1;
                } else {
                    i = com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1.WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
                }
                if (i != 1) {
                    if (i == 2) {
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, 20, null);
                    }
                    throw new java.lang.IllegalStateException("awaitInitialization timeout");
                }
                this.L$0 = null;
                this.L$1 = null;
                this.label = 4;
                objInvoke2 = this.this$0.load.invoke(this.$context, this.$placement, byteString2, headerBiddingAdMarkup, this.$gatewayBannerSize, this.$loadOptions, this);
                if (objInvoke2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (com.unity3d.ads.core.data.model.LoadResult) objInvoke2;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR;
        java.lang.String str = this.$adMarkup;
        if (str == null) {
            str = "";
        }
        return new com.unity3d.ads.core.data.model.LoadResult.Failure(unityAdsLoadError, com.unity3d.ads.core.data.model.LoadResult.MSG_AD_MARKUP_PARSING, null, "invalid_admarkup", str, 4, null);
    }
}
