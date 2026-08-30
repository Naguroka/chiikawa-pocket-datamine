package com.google.ads.mediation.line;

/* JADX INFO: compiled from: LineNativeAd.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u000223BU\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u0018\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0017J\u0011\u0010\u001c\u001a\u00020\u0017H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010'\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J\u0018\u0010)\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010*\u001a\u00020$H\u0016J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u0015H\u0016J8\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020.00H\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/google/ads/mediation/line/LineNativeAd;", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "Lcom/five_corp/ad/FiveAdLoadListener;", "Lcom/five_corp/ad/FiveAdNativeEventListener;", "context", "Landroid/content/Context;", "appId", "", "slotId", "bidResponse", "watermark", "nativeAdOptions", "Lcom/google/android/gms/ads/nativead/NativeAdOptions;", "mediationNativeAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "adapterScope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/ads/nativead/NativeAdOptions;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lkotlinx/coroutines/CoroutineScope;)V", "mediationNativeAdCallback", "nativeAd", "Lcom/five_corp/ad/FiveAdNative;", "loadAd", "", "loadImages", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadRtbAd", "mapNativeAd", "onClick", "fiveAdNative", "onFiveAdLoad", "ad", "Lcom/five_corp/ad/FiveAdInterface;", "onFiveAdLoadError", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "Lcom/five_corp/ad/FiveAdErrorCode;", "onImpression", com.ironsource.y8.h.t0, "onPlay", "onRemove", "onViewError", "fiveAdErrorCode", "onViewThrough", "trackViews", "containerView", "Landroid/view/View;", "clickableAssetViews", "", "nonClickableAssetViews", "Companion", "LineNativeImage", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LineNativeAd extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper implements com.five_corp.ad.FiveAdLoadListener, com.five_corp.ad.FiveAdNativeEventListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.ads.mediation.line.LineNativeAd.Companion INSTANCE = new com.google.ads.mediation.line.LineNativeAd.Companion(null);
    private static final java.lang.String TAG = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.google.ads.mediation.line.LineNativeAd.class).getSimpleName();
    private final kotlinx.coroutines.CoroutineScope adapterScope;
    private final java.lang.String appId;
    private final java.lang.String bidResponse;
    private final android.content.Context context;
    private com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback;
    private final com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationNativeAdLoadCallback;
    private com.five_corp.ad.FiveAdNative nativeAd;
    private final com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions;
    private final java.lang.String slotId;
    private final java.lang.String watermark;

    public /* synthetic */ LineNativeAd(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions, com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3, str4, nativeAdOptions, mediationAdLoadCallback, coroutineScope);
    }

    private LineNativeAd(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationAdLoadCallback, kotlinx.coroutines.CoroutineScope coroutineScope) {
        this.context = context;
        this.appId = str;
        this.slotId = str2;
        this.bidResponse = str3;
        this.watermark = str4;
        this.nativeAdOptions = nativeAdOptions;
        this.mediationNativeAdLoadCallback = mediationAdLoadCallback;
        this.adapterScope = coroutineScope;
    }

    public final void loadAd() {
        java.lang.String str = this.slotId;
        if (str == null || str.length() == 0) {
            this.mediationNativeAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(102, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_SLOT_ID, "com.google.ads.mediation.line"));
            return;
        }
        com.google.ads.mediation.line.LineInitializer.INSTANCE.initialize(this.context, this.appId);
        this.nativeAd = com.google.ads.mediation.line.LineSdkFactory.INSTANCE.getDelegate$line_release().createFiveAdNative(this.context, this.slotId);
        com.google.android.gms.ads.VideoOptions videoOptions = this.nativeAdOptions.getVideoOptions();
        com.five_corp.ad.FiveAdNative fiveAdNative = null;
        if (videoOptions != null) {
            com.five_corp.ad.FiveAdNative fiveAdNative2 = this.nativeAd;
            if (fiveAdNative2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                fiveAdNative2 = null;
            }
            fiveAdNative2.enableSound(!videoOptions.getStartMuted());
        }
        com.five_corp.ad.FiveAdNative fiveAdNative3 = this.nativeAd;
        if (fiveAdNative3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
            fiveAdNative3 = null;
        }
        fiveAdNative3.setLoadListener(this);
        com.five_corp.ad.FiveAdNative fiveAdNative4 = this.nativeAd;
        if (fiveAdNative4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
        } else {
            fiveAdNative = fiveAdNative4;
        }
        fiveAdNative.loadAdAsync();
    }

    public final void loadRtbAd() {
        com.five_corp.ad.AdLoader adLoader = com.five_corp.ad.AdLoader.getAdLoader(this.context, new com.five_corp.ad.FiveAdConfig(this.appId));
        if (adLoader == null) {
            return;
        }
        adLoader.loadNativeAd(new com.five_corp.ad.BidData(this.bidResponse, this.watermark), new com.five_corp.ad.AdLoader.LoadNativeAdCallback() { // from class: com.google.ads.mediation.line.LineNativeAd.loadRtbAd.1
            @Override // com.five_corp.ad.AdLoader.LoadNativeAdCallback
            public void onLoad(com.five_corp.ad.FiveAdNative fiveAdNative) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
                com.google.ads.mediation.line.LineNativeAd.this.nativeAd = fiveAdNative;
                com.google.android.gms.ads.VideoOptions videoOptions = com.google.ads.mediation.line.LineNativeAd.this.nativeAdOptions.getVideoOptions();
                if (videoOptions != null) {
                    com.five_corp.ad.FiveAdNative fiveAdNative2 = com.google.ads.mediation.line.LineNativeAd.this.nativeAd;
                    if (fiveAdNative2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                        fiveAdNative2 = null;
                    }
                    fiveAdNative2.enableSound(!videoOptions.getStartMuted());
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(com.google.ads.mediation.line.LineNativeAd.this.adapterScope, null, null, new com.google.ads.mediation.line.LineNativeAd$loadRtbAd$1$onLoad$1(com.google.ads.mediation.line.LineNativeAd.this, null), 3, null);
            }

            @Override // com.five_corp.ad.AdLoader.LoadNativeAdCallback
            public void onError(com.five_corp.ad.FiveAdErrorCode adErrorCode) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adErrorCode, "adErrorCode");
                com.google.ads.mediation.line.LineNativeAd.this.mediationNativeAdLoadCallback.onFailure(new com.google.android.gms.ads.AdError(adErrorCode.value, adErrorCode.name(), "com.five_corp.ad"));
            }
        });
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.line.LineNativeAd$mapNativeAd$2, reason: invalid class name */
    /* JADX INFO: compiled from: LineNativeAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.ads.mediation.line.LineNativeAd$mapNativeAd$2", f = "LineNativeAd.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super com.google.ads.mediation.line.LineNativeAd.AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.ads.mediation.line.LineNativeAd.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.ads.mediation.line.LineNativeAd.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.google.ads.mediation.line.LineNativeAd lineNativeAd = com.google.ads.mediation.line.LineNativeAd.this;
                com.five_corp.ad.FiveAdNative fiveAdNative = lineNativeAd.nativeAd;
                com.five_corp.ad.FiveAdNative fiveAdNative2 = null;
                if (fiveAdNative == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                    fiveAdNative = null;
                }
                lineNativeAd.setHeadline(fiveAdNative.getAdTitle());
                com.google.ads.mediation.line.LineNativeAd lineNativeAd2 = com.google.ads.mediation.line.LineNativeAd.this;
                com.five_corp.ad.FiveAdNative fiveAdNative3 = lineNativeAd2.nativeAd;
                if (fiveAdNative3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                    fiveAdNative3 = null;
                }
                lineNativeAd2.setBody(fiveAdNative3.getDescriptionText());
                com.google.ads.mediation.line.LineNativeAd lineNativeAd3 = com.google.ads.mediation.line.LineNativeAd.this;
                com.five_corp.ad.FiveAdNative fiveAdNative4 = lineNativeAd3.nativeAd;
                if (fiveAdNative4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                    fiveAdNative4 = null;
                }
                lineNativeAd3.setCallToAction(fiveAdNative4.getButtonText());
                com.google.ads.mediation.line.LineNativeAd lineNativeAd4 = com.google.ads.mediation.line.LineNativeAd.this;
                com.five_corp.ad.FiveAdNative fiveAdNative5 = lineNativeAd4.nativeAd;
                if (fiveAdNative5 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                    fiveAdNative5 = null;
                }
                lineNativeAd4.setMediaView(fiveAdNative5.getAdMainView());
                com.google.ads.mediation.line.LineNativeAd lineNativeAd5 = com.google.ads.mediation.line.LineNativeAd.this;
                com.five_corp.ad.FiveAdNative fiveAdNative6 = lineNativeAd5.nativeAd;
                if (fiveAdNative6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                } else {
                    fiveAdNative2 = fiveAdNative6;
                }
                lineNativeAd5.setAdvertiser(fiveAdNative2.getAdvertiserName());
                com.google.ads.mediation.line.LineNativeAd.this.setOverrideClickHandling(true);
                this.label = 1;
                obj = com.google.ads.mediation.line.LineNativeAd.this.loadImages(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (!((java.lang.Boolean) obj).booleanValue()) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(106, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MINIMUM_NATIVE_INFO_NOT_RECEIVED, "com.five_corp.ad");
                android.util.Log.w(com.google.ads.mediation.line.LineNativeAd.TAG, adError.getMessage());
                com.google.ads.mediation.line.LineNativeAd.this.mediationNativeAdLoadCallback.onFailure(adError);
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object mapNativeAd(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objCoroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.google.ads.mediation.line.LineNativeAd.AnonymousClass2(null), continuation);
        return objCoroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : kotlin.Unit.INSTANCE;
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(android.view.View containerView, java.util.Map<java.lang.String, android.view.View> clickableAssetViews, java.util.Map<java.lang.String, android.view.View> nonClickableAssetViews) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickableAssetViews, "clickableAssetViews");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonClickableAssetViews, "nonClickableAssetViews");
        com.five_corp.ad.FiveAdNative fiveAdNative = this.nativeAd;
        if (fiveAdNative == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
            fiveAdNative = null;
        }
        fiveAdNative.registerViews(containerView, getAdChoicesContent(), kotlin.collections.CollectionsKt.toList(clickableAssetViews.values()));
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.line.LineNativeAd$onFiveAdLoad$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LineNativeAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.ads.mediation.line.LineNativeAd$onFiveAdLoad$1", f = "LineNativeAd.kt", i = {}, l = {org.objectweb.asm.Opcodes.TABLESWITCH}, m = "invokeSuspend", n = {}, s = {})
    static final class C15211 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        C15211(kotlin.coroutines.Continuation<? super com.google.ads.mediation.line.LineNativeAd.C15211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.ads.mediation.line.LineNativeAd.this.new C15211(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.ads.mediation.line.LineNativeAd.C15211) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.google.ads.mediation.line.LineNativeAd.this.mapNativeAd(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            com.google.ads.mediation.line.LineNativeAd lineNativeAd = com.google.ads.mediation.line.LineNativeAd.this;
            lineNativeAd.mediationNativeAdCallback = (com.google.android.gms.ads.mediation.MediationNativeAdCallback) lineNativeAd.mediationNativeAdLoadCallback.onSuccess(com.google.ads.mediation.line.LineNativeAd.this);
            com.five_corp.ad.FiveAdNative fiveAdNative = com.google.ads.mediation.line.LineNativeAd.this.nativeAd;
            if (fiveAdNative == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
                fiveAdNative = null;
            }
            fiveAdNative.setEventListener(com.google.ads.mediation.line.LineNativeAd.this);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.five_corp.ad.FiveAdLoadListener
    public void onFiveAdLoad(com.five_corp.ad.FiveAdInterface ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        android.util.Log.d(TAG, "Finished loading Line Native Ad for slotId: " + ad.getSlotId());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(this.adapterScope, null, null, new com.google.ads.mediation.line.LineNativeAd.C15211(null), 3, null);
    }

    @Override // com.five_corp.ad.FiveAdLoadListener
    public void onFiveAdLoadError(com.five_corp.ad.FiveAdInterface ad, com.five_corp.ad.FiveAdErrorCode errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.adapterScope, null, 1, null);
        int i = errorCode.value;
        java.lang.String str = java.lang.String.format(com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_AD_LOADING, java.util.Arrays.copyOf(new java.lang.Object[]{errorCode.name()}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(i, str, "com.five_corp.ad");
        android.util.Log.w(TAG, adError.getMessage());
        this.mediationNativeAdLoadCallback.onFailure(adError);
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onViewError(com.five_corp.ad.FiveAdNative fiveAdNative, com.five_corp.ad.FiveAdErrorCode fiveAdErrorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdErrorCode, "fiveAdErrorCode");
        android.util.Log.w(TAG, "There was an error displaying the ad.");
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onClick(com.five_corp.ad.FiveAdNative fiveAdNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        android.util.Log.d(TAG, "Line native ad did record a click.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onRemove(com.five_corp.ad.FiveAdNative fiveAdNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        android.util.Log.d(TAG, "Line native ad closed");
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onPlay(com.five_corp.ad.FiveAdNative fiveAdNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        android.util.Log.d(TAG, "Line video native ad start");
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onPause(com.five_corp.ad.FiveAdNative fiveAdNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        android.util.Log.d(TAG, "Line video native ad paused");
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onViewThrough(com.five_corp.ad.FiveAdNative fiveAdNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        android.util.Log.d(TAG, "Line video native ad viewed");
    }

    @Override // com.five_corp.ad.FiveAdNativeEventListener
    public void onImpression(com.five_corp.ad.FiveAdNative fiveAdNative) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiveAdNative, "fiveAdNative");
        android.util.Log.d(TAG, "Line native ad recorded an impression.");
        com.google.android.gms.ads.mediation.MediationNativeAdCallback mediationNativeAdCallback = this.mediationNativeAdCallback;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    /* JADX INFO: compiled from: LineNativeAd.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/google/ads/mediation/line/LineNativeAd$LineNativeImage;", "Lcom/google/android/gms/ads/formats/NativeAd$Image;", "drawable", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", "getDrawable", "getScale", "", "getUri", "Landroid/net/Uri;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LineNativeImage extends com.google.android.gms.ads.formats.NativeAd.Image {
        private final android.graphics.drawable.Drawable drawable;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public LineNativeImage(android.graphics.drawable.Drawable drawable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.drawable = drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.graphics.drawable.Drawable getDrawable() {
            return this.drawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public android.net.Uri getUri() {
            android.net.Uri EMPTY = android.net.Uri.EMPTY;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }
    }

    /* JADX INFO: compiled from: LineNativeAd.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/google/ads/mediation/line/LineNativeAd$Companion;", "", "()V", "TAG", "", "newInstance", "Lkotlin/Result;", "Lcom/google/ads/mediation/line/LineNativeAd;", "mediationNativeAdConfiguration", "Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;", "mediationNativeAdLoadCallback", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/UnifiedNativeAdMapper;", "Lcom/google/android/gms/ads/mediation/MediationNativeAdCallback;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "newInstance-0E7RQCE", "(Lcom/google/android/gms/ads/mediation/MediationNativeAdConfiguration;Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "line_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: newInstance-0E7RQCE$default, reason: not valid java name */
        public static /* synthetic */ java.lang.Object m724newInstance0E7RQCE$default(com.google.ads.mediation.line.LineNativeAd.Companion companion, com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback mediationAdLoadCallback, kotlin.coroutines.CoroutineContext coroutineContext, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                coroutineContext = kotlinx.coroutines.ExecutorsKt.from((java.util.concurrent.ExecutorService) com.google.ads.mediation.line.LineSdkFactory.INSTANCE.getBACKGROUND_EXECUTOR$line_release());
            }
            return companion.m725newInstance0E7RQCE(mediationNativeAdConfiguration, mediationAdLoadCallback, coroutineContext);
        }

        /* JADX INFO: renamed from: newInstance-0E7RQCE, reason: not valid java name */
        public final java.lang.Object m725newInstance0E7RQCE(com.google.android.gms.ads.mediation.MediationNativeAdConfiguration mediationNativeAdConfiguration, com.google.android.gms.ads.mediation.MediationAdLoadCallback<com.google.android.gms.ads.mediation.UnifiedNativeAdMapper, com.google.android.gms.ads.mediation.MediationNativeAdCallback> mediationNativeAdLoadCallback, kotlin.coroutines.CoroutineContext coroutineContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediationNativeAdLoadCallback, "mediationNativeAdLoadCallback");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
            android.content.Context context = mediationNativeAdConfiguration.getContext();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context, "mediationNativeAdConfiguration.context");
            android.os.Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serverParameters, "mediationNativeAdConfiguration.serverParameters");
            java.lang.String string = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_APP_ID);
            java.lang.String str = string;
            if (str == null || str.length() == 0) {
                com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, com.google.ads.mediation.line.LineMediationAdapter.ERROR_MSG_MISSING_APP_ID, "com.google.ads.mediation.line");
                mediationNativeAdLoadCallback.onFailure(adError);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                return kotlin.Result.m1301constructorimpl(kotlin.ResultKt.createFailure(new java.util.NoSuchElementException(adError.getMessage())));
            }
            java.lang.String string2 = serverParameters.getString(com.google.ads.mediation.line.LineMediationAdapter.KEY_SLOT_ID);
            java.lang.String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bidResponse, "mediationNativeAdConfiguration.bidResponse");
            java.lang.String watermark = mediationNativeAdConfiguration.getWatermark();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(watermark, "mediationNativeAdConfiguration.watermark");
            com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nativeAdOptions, "mediationNativeAdConfiguration.nativeAdOptions");
            com.google.ads.mediation.line.LineNativeAd lineNativeAd = new com.google.ads.mediation.line.LineNativeAd(context, string, string2, bidResponse, watermark, nativeAdOptions, mediationNativeAdLoadCallback, kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(coroutineContext), null);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m1301constructorimpl(lineNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object loadImages(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.five_corp.ad.FiveAdNative fiveAdNative = this.nativeAd;
        com.five_corp.ad.FiveAdNative fiveAdNative2 = null;
        if (fiveAdNative == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
            fiveAdNative = null;
        }
        fiveAdNative.loadIconImageAsync(new com.five_corp.ad.FiveAdNative.LoadImageCallback() { // from class: com.google.ads.mediation.line.LineNativeAd$loadImages$2$1
            @Override // com.five_corp.ad.FiveAdNative.LoadImageCallback
            public final void onImageLoad(android.graphics.Bitmap bitmap) {
                if (bitmap != null) {
                    com.google.ads.mediation.line.LineNativeAd lineNativeAd = this.this$0;
                    android.content.res.Resources resources = this.this$0.context.getResources();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                    lineNativeAd.setIcon(new com.google.ads.mediation.line.LineNativeAd.LineNativeImage(new android.graphics.drawable.BitmapDrawable(resources, bitmap)));
                }
            }
        });
        com.five_corp.ad.FiveAdNative fiveAdNative3 = this.nativeAd;
        if (fiveAdNative3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("nativeAd");
        } else {
            fiveAdNative2 = fiveAdNative3;
        }
        fiveAdNative2.loadInformationIconImageAsync(new com.five_corp.ad.FiveAdNative.LoadImageCallback() { // from class: com.google.ads.mediation.line.LineNativeAd$loadImages$2$2
            @Override // com.five_corp.ad.FiveAdNative.LoadImageCallback
            public final void onImageLoad(android.graphics.Bitmap bitmap) {
                if (bitmap != null) {
                    android.widget.ImageView imageView = new android.widget.ImageView(this.this$0.context);
                    imageView.setImageBitmap(bitmap);
                    this.this$0.setAdChoicesContent(imageView);
                    kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation = cancellableContinuationImpl2;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(true));
                    return;
                }
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cancellableContinuation2 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                cancellableContinuation2.resumeWith(kotlin.Result.m1301constructorimpl(false));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
