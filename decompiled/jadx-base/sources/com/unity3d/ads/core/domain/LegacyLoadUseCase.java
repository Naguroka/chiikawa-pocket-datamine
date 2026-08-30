package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: LegacyLoadUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 >2\u00020\u0001:\u0001>B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0014\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010)\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J,\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010.\u001a\u00020/H\u0002JA\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u00104\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0086Bø\u0001\u0000¢\u0006\u0002\u00105J\u0019\u00106\u001a\u0002012\u0006\u00107\u001a\u000208H\u0082@ø\u0001\u0000¢\u0006\u0002\u00109J\b\u0010:\u001a\u00020\u001dH\u0002J\u0019\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010=R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyLoadUseCase;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "load", "Lcom/unity3d/ads/core/domain/Load;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "awaitInitialization", "Lcom/unity3d/ads/core/domain/AwaitInitialization;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/Load;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/domain/AwaitInitialization;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/AdRepository;)V", com.json.y8.v, "", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsLoadListener;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "opportunity", "Lcom/google/protobuf/ByteString;", "placement", "", "startTime", "Lkotlin/time/TimeMark;", "getAdMarkup", "unityAdsLoadOptions", "getAdType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", "getBannerSize", "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", com.json.h6.u, "Lcom/unity3d/services/banners/UnityBannerSize;", "getHeaderBiddingAdMarkup", "Lgatewayprotocol/v1/HeaderBiddingAdMarkupOuterClass$HeaderBiddingAdMarkup;", "adMarkup", "getOpportunityId", "getTags", "", "reason", "reasonDebug", "getTmpAdObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "invoke", "", "context", "Landroid/content/Context;", "unityLoadListener", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/unity3d/ads/IUnityAdsLoadListener;Lcom/unity3d/services/banners/UnityBannerSize;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadFailure", "loadResult", "Lcom/unity3d/ads/core/data/model/LoadResult$Failure;", "(Lcom/unity3d/ads/core/data/model/LoadResult$Failure;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadStart", "loadSuccess", "adObject", "(Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyLoadUseCase {
    public static final java.lang.String KEY_AD_MARKUP = "adMarkup";
    public static final java.lang.String KEY_OBJECT_ID = "objectId";
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private com.unity3d.ads.IUnityAdsLoadListener listener;
    private final com.unity3d.ads.core.domain.Load load;
    private com.unity3d.ads.UnityAdsLoadOptions loadOptions;
    private com.google.protobuf.ByteString opportunity;
    private java.lang.String placement;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private kotlin.time.TimeMark startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", i = {0, 0, 1, 2}, l = {91, org.objectweb.asm.Opcodes.DCMPG, 153, org.objectweb.asm.Opcodes.IF_ICMPGT}, m = "invoke", n = {"this", "placement", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    public LegacyLoadUseCase(kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.core.domain.Load load, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.domain.AwaitInitialization awaitInitialization, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository, com.unity3d.ads.core.data.repository.AdRepository adRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(load, "load");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        this.dispatcher = dispatcher;
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, android.content.Context context, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011d A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #4 {all -> 0x0149, blocks: (B:44:0x00ed, B:50:0x0119, B:52:0x011d), top: B:85:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0132 A[Catch: all -> 0x0147, TryCatch #2 {all -> 0x0147, blocks: (B:54:0x0126, B:57:0x0132, B:59:0x0137), top: B:82:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0137 A[Catch: all -> 0x0147, TRY_LEAVE, TryCatch #2 {all -> 0x0147, blocks: (B:54:0x0126, B:57:0x0132, B:59:0x0137), top: B:82:0x011b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:74:0x0173 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.unity3d.ads.core.domain.LegacyLoadUseCase] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final java.lang.Object invoke(android.content.Context context, java.lang.String str, com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener, com.unity3d.services.banners.UnityBannerSize unityBannerSize, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1 anonymousClass1;
        java.lang.Throwable th;
        ?? r3;
        ?? r1;
        com.unity3d.ads.core.data.model.LoadResult.Failure failure;
        ?? r4;
        com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase;
        ?? r5;
        com.unity3d.ads.core.data.model.LoadResult.Failure failure2;
        com.unity3d.ads.core.data.model.AdObject adObject;
        java.lang.Object obj;
        java.lang.String str2 = str;
        com.unity3d.services.banners.UnityBannerSize unityBannerSize2 = unityBannerSize;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1(continuation);
        }
        com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass1 anonymousClass2 = anonymousClass1;
        java.lang.Object objWithTimeoutOrNull = anonymousClass2.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithTimeoutOrNull);
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Load Start for placement " + str2);
            java.lang.String adMarkup = getAdMarkup(unityAdsLoadOptions);
            long loadTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
            gatewayprotocol.v1.AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize2);
            java.lang.String str3 = adMarkup;
            this.isHeaderBidding = !(str3 == null || kotlin.text.StringsKt.isBlank(str3));
            this.isBanner = unityBannerSize2 != null;
            this.listener = iUnityAdsLoadListener;
            this.placement = str2;
            this.loadOptions = unityAdsLoadOptions;
            this.startTime = loadStart();
            try {
                com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase2 = this;
                try {
                    com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1(str, legacyLoadUseCase2, unityAdsLoadOptions, adMarkup, context, bannerSize, null);
                    anonymousClass2.L$0 = this;
                    anonymousClass2.L$1 = str2;
                    anonymousClass2.label = 1;
                    objWithTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, anonymousClass2);
                    if (objWithTimeoutOrNull == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    legacyLoadUseCase = this;
                    r4 = legacyLoadUseCase2;
                    failure2 = (com.unity3d.ads.core.data.model.LoadResult) objWithTimeoutOrNull;
                    r5 = r4;
                    if (failure2 == null) {
                        com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.unity3d.ads.core.data.model.LoadResult.MSG_TIMEOUT);
                        failure2 = new com.unity3d.ads.core.data.model.LoadResult.Failure(unityAdsLoadError, sb.append(str2).toString(), null, "timeout", null, 20, null);
                        r5 = sb;
                    }
                    if (failure2 instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
                        adObject = ((com.unity3d.ads.core.data.model.LoadResult.Success) failure2).getAdObject();
                        anonymousClass2.L$0 = legacyLoadUseCase;
                        r5 = 0;
                        anonymousClass2.L$1 = null;
                        anonymousClass2.label = 2;
                        if (legacyLoadUseCase.loadSuccess(adObject, anonymousClass2) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        r5 = 0;
                        r5 = 0;
                        if (failure2 instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                            anonymousClass2.L$0 = legacyLoadUseCase;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.label = 3;
                            if (legacyLoadUseCase.loadFailure((com.unity3d.ads.core.data.model.LoadResult.Failure) failure2, anonymousClass2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    obj = null;
                    th = th;
                    r1 = this;
                    r3 = obj;
                    failure = new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(th));
                    anonymousClass2.L$0 = r3;
                    anonymousClass2.L$1 = r3;
                    anonymousClass2.label = 4;
                    if (r1.loadFailure(failure, anonymousClass2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                obj = null;
            }
        } else {
            try {
                if (i == 1) {
                    str2 = (java.lang.String) anonymousClass2.L$1;
                    com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase3 = (com.unity3d.ads.core.domain.LegacyLoadUseCase) anonymousClass2.L$0;
                    kotlin.ResultKt.throwOnFailure(objWithTimeoutOrNull);
                    legacyLoadUseCase = legacyLoadUseCase3;
                    r4 = i;
                    try {
                        failure2 = (com.unity3d.ads.core.data.model.LoadResult) objWithTimeoutOrNull;
                        r5 = r4;
                        if (failure2 == null) {
                            try {
                                com.unity3d.ads.UnityAds.UnityAdsLoadError unityAdsLoadError2 = com.unity3d.ads.UnityAds.UnityAdsLoadError.TIMEOUT;
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(com.unity3d.ads.core.data.model.LoadResult.MSG_TIMEOUT);
                                failure2 = new com.unity3d.ads.core.data.model.LoadResult.Failure(unityAdsLoadError2, sb2.append(str2).toString(), null, "timeout", null, 20, null);
                                r5 = sb2;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                r3 = 0;
                                r1 = legacyLoadUseCase;
                                failure = new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(th));
                                anonymousClass2.L$0 = r3;
                                anonymousClass2.L$1 = r3;
                                anonymousClass2.label = 4;
                                if (r1.loadFailure(failure, anonymousClass2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                        try {
                            if (failure2 instanceof com.unity3d.ads.core.data.model.LoadResult.Success) {
                                adObject = ((com.unity3d.ads.core.data.model.LoadResult.Success) failure2).getAdObject();
                                anonymousClass2.L$0 = legacyLoadUseCase;
                                r5 = 0;
                                anonymousClass2.L$1 = null;
                                anonymousClass2.label = 2;
                                if (legacyLoadUseCase.loadSuccess(adObject, anonymousClass2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                r5 = 0;
                                r5 = 0;
                                if (failure2 instanceof com.unity3d.ads.core.data.model.LoadResult.Failure) {
                                    anonymousClass2.L$0 = legacyLoadUseCase;
                                    anonymousClass2.L$1 = null;
                                    anonymousClass2.label = 3;
                                    if (legacyLoadUseCase.loadFailure((com.unity3d.ads.core.data.model.LoadResult.Failure) failure2, anonymousClass2) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            th = th;
                            r1 = legacyLoadUseCase;
                            r3 = r5;
                            failure = new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(th));
                            anonymousClass2.L$0 = r3;
                            anonymousClass2.L$1 = r3;
                            anonymousClass2.label = 4;
                            if (r1.loadFailure(failure, anonymousClass2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        r5 = 0;
                    }
                } else if (i == 2 || i == 3) {
                    kotlin.ResultKt.throwOnFailure(objWithTimeoutOrNull);
                } else {
                    if (i != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(objWithTimeoutOrNull);
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                r3 = 0;
                r1 = unityBannerSize2;
                failure = new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", com.unity3d.ads.core.extensions.ExceptionExtensionsKt.retrieveUnityCrashValue(th));
                anonymousClass2.L$0 = r3;
                anonymousClass2.L$1 = r3;
                anonymousClass2.label = 4;
                if (r1.loadFailure(failure, anonymousClass2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(java.lang.String adMarkup) {
        java.lang.String str = adMarkup;
        if (!(str == null || kotlin.text.StringsKt.isBlank(str))) {
            try {
                return gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(adMarkup, false, 1, null).toByteArray());
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
        return gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String getOpportunityId(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        java.lang.Object objOpt;
        org.json.JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final java.lang.String getAdMarkup(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions) {
        java.lang.Object objOpt;
        org.json.JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("adMarkup")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final kotlin.time.TimeMark loadStart() {
        long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject(), 10, null);
        return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object loadSuccess(com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        kotlin.time.TimeMark timeMark = this.startTime;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", timeMark != null ? kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags$default(this, null, null, 3, null), null, adObject, 8, null);
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcher, new com.unity3d.ads.core.domain.LegacyLoadUseCase.C16522(null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$2", f = "LegacyLoadUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16522 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int label;

        C16522(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyLoadUseCase.C16522> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.LegacyLoadUseCase.this.new C16522(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.LegacyLoadUseCase.C16522) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            final com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase = com.unity3d.ads.core.domain.LegacyLoadUseCase.this;
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.ads.core.domain.LegacyLoadUseCase.C16522.invokeSuspend$lambda$0(legacyLoadUseCase);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase) {
            com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener = legacyLoadUseCase.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsAdLoaded(legacyLoadUseCase.placement);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object loadFailure(com.unity3d.ads.core.data.model.LoadResult.Failure failure, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        kotlin.time.TimeMark timeMark = this.startTime;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", timeMark != null ? kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(), 8, null);
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcher, new com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass2(failure, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2", f = "LegacyLoadUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.LoadResult.Failure $loadResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(com.unity3d.ads.core.data.model.LoadResult.Failure failure, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$loadResult = failure;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.LegacyLoadUseCase.this.new AnonymousClass2(this.$loadResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            final com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase = com.unity3d.ads.core.domain.LegacyLoadUseCase.this;
            final com.unity3d.ads.core.data.model.LoadResult.Failure failure = this.$loadResult;
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.ads.core.domain.LegacyLoadUseCase.AnonymousClass2.invokeSuspend$lambda$0(legacyLoadUseCase, failure);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, com.unity3d.ads.core.data.model.LoadResult.Failure failure) {
            com.unity3d.ads.IUnityAdsLoadListener iUnityAdsLoadListener = legacyLoadUseCase.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsFailedToLoad(legacyLoadUseCase.placement, failure.getError(), failure.getMessage());
            }
        }
    }

    static /* synthetic */ java.util.Map getTags$default(com.unity3d.ads.core.domain.LegacyLoadUseCase legacyLoadUseCase, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final java.util.Map<java.lang.String, java.lang.String> getTags(java.lang.String reason, java.lang.String reasonDebug) {
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("state", this.getInitializationState.invoke().toString()), kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.LOAD.toString()));
        java.lang.String str = reason;
        if (!(str == null || str.length() == 0)) {
            mapMutableMapOf.put("reason", reason);
        }
        java.lang.String str2 = reasonDebug;
        if (!(str2 == null || str2.length() == 0)) {
            mapMutableMapOf.put("reason_debug", reasonDebug);
        }
        return mapMutableMapOf;
    }

    private final gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final com.unity3d.ads.core.data.model.AdObject getTmpAdObject() {
        com.google.protobuf.ByteString byteString = this.opportunity;
        if (byteString == null) {
            byteString = com.google.protobuf.ByteString.EMPTY;
        }
        com.google.protobuf.ByteString byteString2 = byteString;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString2, "opportunity ?: ByteString.EMPTY");
        java.lang.String str = this.placement;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            unityAdsLoadOptions = new com.unity3d.ads.UnityAdsLoadOptions();
        }
        return new com.unity3d.ads.core.data.model.AdObject(byteString2, str2, EMPTY, null, null, unityAdsLoadOptions, java.lang.Boolean.valueOf(this.isHeaderBidding), getAdType(), 16, null);
    }

    private final gatewayprotocol.v1.AdRequestOuterClass.BannerSize getBannerSize(com.unity3d.services.banners.UnityBannerSize bannerSize) {
        if (bannerSize == null) {
            return null;
        }
        gatewayprotocol.v1.BannerSizeKt.Dsl.Companion companion = gatewayprotocol.v1.BannerSizeKt.Dsl.INSTANCE;
        gatewayprotocol.v1.AdRequestOuterClass.BannerSize.Builder builderNewBuilder = gatewayprotocol.v1.AdRequestOuterClass.BannerSize.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setWidth(bannerSize.getWidth());
        dsl_create.setHeight(bannerSize.getHeight());
        return dsl_create._build();
    }
}
