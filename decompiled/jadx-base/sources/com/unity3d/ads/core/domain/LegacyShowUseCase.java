package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: LegacyShowUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 B2\u00020\u0001:\u0001BB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J5\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170$2\u0006\u0010%\u001a\u00020\u00172\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010)J\u0011\u0010*\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+J5\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0086Bø\u0001\u0000¢\u0006\u0002\u0010/J)\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u00104J)\u00105\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0002\u00106J1\u00107\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u00108\u001a\u0002092\u0006\u0010\u001f\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010:J`\u0010;\u001a:\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0>\u0012\u0006\u0012\u0004\u0018\u00010\u00010<2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0002\u0010?J\u0011\u0010@\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+J)\u0010A\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0082@ø\u0001\u0000¢\u0006\u0002\u00106R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006C"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase;", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", com.json.j5.v, "Lcom/unity3d/ads/core/domain/Show;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getInitializationState", "Lcom/unity3d/ads/core/domain/GetInitializationState;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/Show;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetInitializationState;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "hasStarted", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "placement", "", "timeoutCancellationRequested", "unityAdsShowOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "bannerLeftApplication", "", "startTime", "Lkotlin/time/TimeMark;", "listeners", "Lcom/unity3d/ads/core/data/model/Listeners;", "cancelTimeout", "getOpportunityId", "getTags", "", "diagnosticReason", "code", "", "debugMessage", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/util/Map;", "getTmpAdObject", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;Lcom/unity3d/ads/UnityAdsShowOptions;Lcom/unity3d/ads/core/data/model/Listeners;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOperativeError", "operativeEvent", "Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;", "operativeMessage", "(Lgatewayprotocol/v1/OperativeEventRequestOuterClass$OperativeEventErrorType;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showClicked", "(Lkotlin/time/TimeMark;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showCompleted", "status", "Lcom/unity3d/ads/adplayer/model/ShowStatus;", "(Lkotlin/time/TimeMark;Ljava/lang/String;Lcom/unity3d/ads/adplayer/model/ShowStatus;Lcom/unity3d/ads/core/data/model/Listeners;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showError", "Lkotlin/Function6;", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "Lkotlin/coroutines/Continuation;", "(Lkotlin/time/TimeMark;Ljava/lang/String;Lcom/unity3d/ads/core/data/model/Listeners;)Lkotlin/jvm/functions/Function6;", "showStart", "showStarted", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacyShowUseCase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ads.core.domain.LegacyShowUseCase.Companion INSTANCE = new com.unity3d.ads.core.domain.LegacyShowUseCase.Companion(null);
    public static final java.lang.String KEY_OBJECT_ID = "objectId";
    public static final java.lang.String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final java.lang.String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final java.lang.String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final java.lang.String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final java.lang.String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final java.lang.String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final java.lang.String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private com.unity3d.ads.core.data.model.AdObject adObject;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher;
    private final com.unity3d.ads.core.domain.GetInitializationState getInitializationState;
    private final com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> hasStarted;
    private java.lang.String placement;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;
    private final com.unity3d.ads.core.domain.Show show;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> timeoutCancellationRequested;
    private com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", i = {0}, l = {291}, m = "getTmpAdObject", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.LegacyShowUseCase.this.getTmpAdObject(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", i = {0, 0, 0, 0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 9}, l = {80, 85, 90, 96, 101, 104, 109, 116, 121, org.objectweb.asm.Opcodes.DCMPG}, m = "invoke", n = {"this", "context", "placement", "unityAdsShowOptions", "listeners", "startTime", "this", "context", "placement", "unityAdsShowOptions", "listeners", "reportShowError", "opportunityId", "startTime", com.json.y8.v}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
    static final class C16531 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        int label;
        /* synthetic */ java.lang.Object result;

        C16531(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.LegacyShowUseCase.this.invoke(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", i = {}, l = {245}, m = "showStart", n = {}, s = {})
    static final class C16571 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C16571(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.LegacyShowUseCase.this.showStart(this);
        }
    }

    public LegacyShowUseCase(kotlinx.coroutines.CoroutineDispatcher dispatcher, com.unity3d.ads.core.domain.Show show, com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.domain.GetInitializationState getInitializationState, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(show, "show");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.dispatcher = dispatcher;
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.hasStarted = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
        this.timeoutCancellationRequested = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:102:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:104:0x0302  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:34:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0112  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x0147  */
    /* JADX WARN: Code duplicated, block: B:50:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x0190 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0191  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x020c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0210  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    /* JADX WARN: Code duplicated, block: B:89:0x0253  */
    /* JADX WARN: Code duplicated, block: B:98:0x0295  */
    public final java.lang.Object invoke(android.content.Context context, java.lang.String str, com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions, com.unity3d.ads.core.data.model.Listeners listeners, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase.C16531 c16531;
        com.unity3d.ads.core.data.model.Listeners listeners2;
        com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase;
        android.content.Context context2;
        long j;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6ShowError;
        java.lang.String opportunityId;
        java.lang.Object ad;
        kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6;
        com.unity3d.ads.core.data.model.Listeners listeners3;
        long j2;
        java.lang.String str4;
        android.content.Context context3;
        com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions2;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError2;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError3;
        com.unity3d.ads.core.data.model.AdObject adObject;
        com.unity3d.ads.adplayer.AdPlayer adPlayer;
        boolean z;
        boolean z2;
        kotlinx.coroutines.flow.Flow flowM2834catch;
        com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4 anonymousClass4;
        int i;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError4;
        kotlinx.coroutines.CoroutineScope scope;
        com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError5;
        java.lang.String str5;
        com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions3 = unityAdsShowOptions;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.C16531) {
            c16531 = (com.unity3d.ads.core.domain.LegacyShowUseCase.C16531) continuation;
            if ((c16531.label & Integer.MIN_VALUE) != 0) {
                c16531.label -= Integer.MIN_VALUE;
            } else {
                c16531 = new com.unity3d.ads.core.domain.LegacyShowUseCase.C16531(continuation);
            }
        } else {
            c16531 = new com.unity3d.ads.core.domain.LegacyShowUseCase.C16531(continuation);
        }
        com.unity3d.ads.core.domain.LegacyShowUseCase.C16531 c16532 = c16531;
        java.lang.Object obj = c16532.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c16532.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
                this.placement = str;
                this.unityAdsShowOptions = unityAdsShowOptions3;
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Show Start for placement " + str);
                c16532.L$0 = this;
                c16532.L$1 = context;
                c16532.L$2 = str;
                c16532.L$3 = unityAdsShowOptions3;
                listeners2 = listeners;
                c16532.L$4 = listeners2;
                c16532.J$0 = jM2767markNowz9LOYto;
                c16532.label = 1;
                if (showStart(c16532) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                legacyShowUseCase = this;
                context2 = context;
                j = jM2767markNowz9LOYto;
                str2 = str;
                kotlin.time.TimeSource.Monotonic.ValueTimeMark valueTimeMarkM2768boximpl = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j);
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                function6ShowError = legacyShowUseCase.showError(valueTimeMarkM2768boximpl, str3, listeners2);
                if (str2 == null) {
                    unityAdsShowError3 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.label = 2;
                    if (function6ShowError.invoke("placement_null", unityAdsShowError3, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (legacyShowUseCase.getInitializationState.invoke() != com.unity3d.ads.core.data.model.InitializationState.INITIALIZED) {
                    unityAdsShowError2 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.label = 3;
                    if (function6ShowError.invoke("not_initialized", unityAdsShowError2, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (unityAdsShowOptions3 != null) {
                    opportunityId = legacyShowUseCase.getOpportunityId(unityAdsShowOptions3);
                } else {
                    opportunityId = null;
                }
                if (opportunityId == null) {
                    unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.label = 4;
                    if (function6ShowError.invoke("no_opportunity_id", unityAdsShowError, MESSAGE_OPPORTUNITY_ID, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                java.util.UUID uuidFromString = java.util.UUID.fromString(opportunityId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
                com.google.protobuf.ByteString byteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidFromString);
                com.unity3d.ads.core.data.repository.AdRepository adRepository = legacyShowUseCase.adRepository;
                c16532.L$0 = legacyShowUseCase;
                c16532.L$1 = context2;
                c16532.L$2 = str2;
                c16532.L$3 = unityAdsShowOptions3;
                c16532.L$4 = listeners2;
                c16532.L$5 = function6ShowError;
                c16532.L$6 = opportunityId;
                c16532.J$0 = j;
                c16532.label = 5;
                ad = adRepository.getAd(byteString, c16532);
                if (ad == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function6 = function6ShowError;
                listeners3 = listeners2;
                j2 = j;
                str4 = opportunityId;
                obj = ad;
                context3 = context2;
                unityAdsShowOptions2 = unityAdsShowOptions3;
                adObject = (com.unity3d.ads.core.data.model.AdObject) obj;
                legacyShowUseCase.adObject = adObject;
                if (adObject == null) {
                    unityAdsShowError5 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    str5 = MESSAGE_NO_AD_OBJECT + str4;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 6;
                    if (function6.invoke("ad_object_not_found", unityAdsShowError5, str5, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                adPlayer = adObject.getAdPlayer();
                if (adPlayer != null || (scope = adPlayer.getScope()) == null || kotlinx.coroutines.CoroutineScopeKt.isActive(scope)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    unityAdsShowError4 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 7;
                    if (function6.invoke("ad_player_scope_not_active", unityAdsShowError4, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                z2 = adObject.getAdPlayer() instanceof com.unity3d.ads.adplayer.EmbeddableAdPlayer;
                if (z2 && isFullscreenAdShowing) {
                    com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError6 = com.unity3d.ads.UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 8;
                    if (function6.invoke("already_showing", unityAdsShowError6, MESSAGE_ALREADY_SHOWING, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (!legacyShowUseCase.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !kotlin.jvm.internal.Intrinsics.areEqual(adObject.getPlacementId(), str2)) {
                    com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError7 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 9;
                    if (function6.invoke("placement_validation", unityAdsShowError7, MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                long showTimeoutMs = legacyShowUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z2) {
                    isFullscreenAdShowing = true;
                }
                flowM2834catch = kotlinx.coroutines.flow.FlowKt.m2834catch(com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase.show.invoke(context3, adObject, unityAdsShowOptions2), showTimeoutMs, false, legacyShowUseCase.new AnonymousClass2(z2, adObject, true, function6, str2, null), 2, null), new com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass3(function6, z2, null));
                anonymousClass4 = legacyShowUseCase.new AnonymousClass4(j2, str2, listeners3, adObject, function6);
                c16532.L$0 = null;
                c16532.L$1 = null;
                c16532.L$2 = null;
                c16532.L$3 = null;
                c16532.L$4 = null;
                c16532.L$5 = null;
                c16532.L$6 = null;
                c16532.I$0 = z2 ? 1 : 0;
                c16532.label = 10;
                if (flowM2834catch.collect(anonymousClass4, c16532) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = z2 ? 1 : 0;
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                long j3 = c16532.J$0;
                listeners2 = (com.unity3d.ads.core.data.model.Listeners) c16532.L$4;
                com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions4 = (com.unity3d.ads.UnityAdsShowOptions) c16532.L$3;
                str2 = (java.lang.String) c16532.L$2;
                context2 = (android.content.Context) c16532.L$1;
                com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase2 = (com.unity3d.ads.core.domain.LegacyShowUseCase) c16532.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                legacyShowUseCase = legacyShowUseCase2;
                j = j3;
                unityAdsShowOptions3 = unityAdsShowOptions4;
                kotlin.time.TimeSource.Monotonic.ValueTimeMark valueTimeMarkM2768boximpl2 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(j);
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                function6ShowError = legacyShowUseCase.showError(valueTimeMarkM2768boximpl2, str3, listeners2);
                if (str2 == null) {
                    unityAdsShowError3 = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.label = 2;
                    if (function6ShowError.invoke("placement_null", unityAdsShowError3, com.unity3d.ads.core.data.model.LoadResult.MSG_PLACEMENT_NULL, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (legacyShowUseCase.getInitializationState.invoke() != com.unity3d.ads.core.data.model.InitializationState.INITIALIZED) {
                    unityAdsShowError2 = com.unity3d.ads.UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.label = 3;
                    if (function6ShowError.invoke("not_initialized", unityAdsShowError2, com.unity3d.ads.core.data.model.LoadResult.MSG_NOT_INITIALIZED, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (unityAdsShowOptions3 != null) {
                    opportunityId = legacyShowUseCase.getOpportunityId(unityAdsShowOptions3);
                } else {
                    opportunityId = null;
                }
                if (opportunityId == null) {
                    unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.label = 4;
                    if (function6ShowError.invoke("no_opportunity_id", unityAdsShowError, MESSAGE_OPPORTUNITY_ID, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                java.util.UUID uuidFromString2 = java.util.UUID.fromString(opportunityId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(opportunityId)");
                com.google.protobuf.ByteString byteString2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidFromString2);
                com.unity3d.ads.core.data.repository.AdRepository adRepository2 = legacyShowUseCase.adRepository;
                c16532.L$0 = legacyShowUseCase;
                c16532.L$1 = context2;
                c16532.L$2 = str2;
                c16532.L$3 = unityAdsShowOptions3;
                c16532.L$4 = listeners2;
                c16532.L$5 = function6ShowError;
                c16532.L$6 = opportunityId;
                c16532.J$0 = j;
                c16532.label = 5;
                ad = adRepository2.getAd(byteString2, c16532);
                if (ad == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function6 = function6ShowError;
                listeners3 = listeners2;
                j2 = j;
                str4 = opportunityId;
                obj = ad;
                context3 = context2;
                unityAdsShowOptions2 = unityAdsShowOptions3;
                adObject = (com.unity3d.ads.core.data.model.AdObject) obj;
                legacyShowUseCase.adObject = adObject;
                if (adObject == null) {
                    unityAdsShowError5 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    str5 = MESSAGE_NO_AD_OBJECT + str4;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 6;
                    if (function6.invoke("ad_object_not_found", unityAdsShowError5, str5, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                adPlayer = adObject.getAdPlayer();
                if (adPlayer != null) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    unityAdsShowError4 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 7;
                    if (function6.invoke("ad_player_scope_not_active", unityAdsShowError4, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                z2 = adObject.getAdPlayer() instanceof com.unity3d.ads.adplayer.EmbeddableAdPlayer;
                if (z2) {
                    break;
                }
                if (!legacyShowUseCase.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation()) {
                    break;
                }
                long showTimeoutMs2 = legacyShowUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z2) {
                    isFullscreenAdShowing = true;
                }
                flowM2834catch = kotlinx.coroutines.flow.FlowKt.m2834catch(com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase.show.invoke(context3, adObject, unityAdsShowOptions2), showTimeoutMs2, false, legacyShowUseCase.new AnonymousClass2(z2, adObject, true, function6, str2, null), 2, null), new com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass3(function6, z2, null));
                anonymousClass4 = legacyShowUseCase.new AnonymousClass4(j2, str2, listeners3, adObject, function6);
                c16532.L$0 = null;
                c16532.L$1 = null;
                c16532.L$2 = null;
                c16532.L$3 = null;
                c16532.L$4 = null;
                c16532.L$5 = null;
                c16532.L$6 = null;
                c16532.I$0 = z2 ? 1 : 0;
                c16532.label = 10;
                if (flowM2834catch.collect(anonymousClass4, c16532) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = z2 ? 1 : 0;
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return kotlin.Unit.INSTANCE;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 5:
                long j4 = c16532.J$0;
                str4 = (java.lang.String) c16532.L$6;
                function6 = (kotlin.jvm.functions.Function6) c16532.L$5;
                com.unity3d.ads.core.data.model.Listeners listeners4 = (com.unity3d.ads.core.data.model.Listeners) c16532.L$4;
                unityAdsShowOptions2 = (com.unity3d.ads.UnityAdsShowOptions) c16532.L$3;
                java.lang.String str6 = (java.lang.String) c16532.L$2;
                context3 = (android.content.Context) c16532.L$1;
                legacyShowUseCase = (com.unity3d.ads.core.domain.LegacyShowUseCase) c16532.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                j2 = j4;
                listeners3 = listeners4;
                str2 = str6;
                adObject = (com.unity3d.ads.core.data.model.AdObject) obj;
                legacyShowUseCase.adObject = adObject;
                if (adObject == null) {
                    unityAdsShowError5 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    str5 = MESSAGE_NO_AD_OBJECT + str4;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 6;
                    if (function6.invoke("ad_object_not_found", unityAdsShowError5, str5, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                adPlayer = adObject.getAdPlayer();
                if (adPlayer != null) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    unityAdsShowError4 = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    c16532.L$0 = null;
                    c16532.L$1 = null;
                    c16532.L$2 = null;
                    c16532.L$3 = null;
                    c16532.L$4 = null;
                    c16532.L$5 = null;
                    c16532.L$6 = null;
                    c16532.label = 7;
                    if (function6.invoke("ad_player_scope_not_active", unityAdsShowError4, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, c16532) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                z2 = adObject.getAdPlayer() instanceof com.unity3d.ads.adplayer.EmbeddableAdPlayer;
                if (z2) {
                    break;
                }
                if (!legacyShowUseCase.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation()) {
                    break;
                }
                long showTimeoutMs3 = legacyShowUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z2) {
                    isFullscreenAdShowing = true;
                }
                flowM2834catch = kotlinx.coroutines.flow.FlowKt.m2834catch(com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase.show.invoke(context3, adObject, unityAdsShowOptions2), showTimeoutMs3, false, legacyShowUseCase.new AnonymousClass2(z2, adObject, true, function6, str2, null), 2, null), new com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass3(function6, z2, null));
                anonymousClass4 = legacyShowUseCase.new AnonymousClass4(j2, str2, listeners3, adObject, function6);
                c16532.L$0 = null;
                c16532.L$1 = null;
                c16532.L$2 = null;
                c16532.L$3 = null;
                c16532.L$4 = null;
                c16532.L$5 = null;
                c16532.L$6 = null;
                c16532.I$0 = z2 ? 1 : 0;
                c16532.label = 10;
                if (flowM2834catch.collect(anonymousClass4, c16532) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = z2 ? 1 : 0;
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 7:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 8:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 9:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 10:
                i = c16532.I$0;
                kotlin.ResultKt.throwOnFailure(obj);
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "close", "Lkotlin/Function0;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", i = {0, 1, 2}, l = {135, 141, org.objectweb.asm.Opcodes.D2I}, m = "invokeSuspend", n = {"close", "close", "close"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.jvm.functions.Function0<? extends kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ java.lang.String $placement;
        final /* synthetic */ kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(boolean z, com.unity3d.ads.core.data.model.AdObject adObject, boolean z2, kotlin.jvm.functions.Function6<? super java.lang.String, ? super com.unity3d.ads.UnityAds.UnityAdsShowError, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$isBanner = z;
            this.$adObject = adObject;
            this.$useTimeout = z2;
            this.$reportShowError = function6;
            this.$placement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2 anonymousClass2 = com.unity3d.ads.core.domain.LegacyShowUseCase.this.new AnonymousClass2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.jvm.functions.Function0<? extends kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return invoke2((kotlin.jvm.functions.Function0<kotlin.Unit>) function0, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass2) create(function0, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.jvm.functions.Function0 function0;
            kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6;
            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError;
            java.lang.String str;
            kotlin.jvm.functions.Function0 function1;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                function0 = (kotlin.jvm.functions.Function0) this.L$0;
                if (((java.lang.Boolean) com.unity3d.ads.core.domain.LegacyShowUseCase.this.hasStarted.getValue()).booleanValue() || ((java.lang.Boolean) com.unity3d.ads.core.domain.LegacyShowUseCase.this.timeoutCancellationRequested.getValue()).booleanValue() || this.$isBanner) {
                    return kotlin.Unit.INSTANCE;
                }
                this.L$0 = function0;
                this.label = 1;
                if (com.unity3d.ads.core.domain.LegacyShowUseCase.this.sendOperativeError(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT, "timeout", this.$adObject, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    function0 = (kotlin.jvm.functions.Function0) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    function0 = (kotlin.jvm.functions.Function0) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function6 = this.$reportShowError;
                    unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT;
                    str = com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                    this.L$0 = function0;
                    this.label = 3;
                    if (function6.invoke("timeout", unityAdsShowError, str, null, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function1 = function0;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (kotlin.jvm.functions.Function0) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                function1.invoke();
                return kotlin.Unit.INSTANCE;
            }
            if (this.$useTimeout) {
                this.L$0 = function0;
                this.label = 2;
                if (com.unity3d.ads.core.domain.LegacyShowUseCase.this.show.terminate(this.$adObject, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function6 = this.$reportShowError;
                unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.TIMEOUT;
                str = com.unity3d.ads.core.domain.LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                this.L$0 = function0;
                this.label = 3;
                if (function6.invoke("timeout", unityAdsShowError, str, null, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function0;
                function1.invoke();
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", i = {}, l = {org.objectweb.asm.Opcodes.I2S}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent>, java.lang.Throwable, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $reportShowError;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(kotlin.jvm.functions.Function6<? super java.lang.String, ? super com.unity3d.ads.UnityAds.UnityAdsShowError, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass3> continuation) {
            super(3, continuation);
            this.$reportShowError = function6;
            this.$isBanner = z;
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.unity3d.ads.core.data.model.ShowEvent> flowCollector, java.lang.Throwable th, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass3 anonymousClass3 = new com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass3(this.$reportShowError, this.$isBanner, continuation);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.Throwable th = (java.lang.Throwable) this.L$0;
                kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6 = this.$reportShowError;
                com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                java.lang.String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                this.label = 1;
                if (function6.invoke("uncaught_exception", unityAdsShowError, message, null, null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (!this.$isBanner) {
                com.unity3d.ads.core.domain.LegacyShowUseCase.Companion companion = com.unity3d.ads.core.domain.LegacyShowUseCase.INSTANCE;
                com.unity3d.ads.core.domain.LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "emit", "(Lcom/unity3d/ads/core/data/model/ShowEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass4<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.unity3d.ads.core.data.model.AdObject $adObject;
        final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
        final /* synthetic */ java.lang.String $placement;
        final /* synthetic */ kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $reportShowError;
        final /* synthetic */ long $startTime;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(long j, java.lang.String str, com.unity3d.ads.core.data.model.Listeners listeners, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.jvm.functions.Function6<? super java.lang.String, ? super com.unity3d.ads.UnityAds.UnityAdsShowError, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function6) {
            this.$startTime = j;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = function6;
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00ff A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
        public final java.lang.Object emit(com.unity3d.ads.core.data.model.ShowEvent showEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
            com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4<T> anonymousClass4;
            kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function6;
            java.lang.String reason;
            com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError;
            java.lang.String message;
            java.lang.Integer numBoxInt;
            java.lang.String message2;
            if (continuation instanceof com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1) {
                legacyShowUseCase$invoke$4$emit$1 = (com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1) continuation;
                if ((legacyShowUseCase$invoke$4$emit$1.label & Integer.MIN_VALUE) != 0) {
                    legacyShowUseCase$invoke$4$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    legacyShowUseCase$invoke$4$emit$1 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1(this, continuation);
                }
            } else {
                legacyShowUseCase$invoke$4$emit$1 = new com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1(this, continuation);
            }
            com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$2 = legacyShowUseCase$invoke$4$emit$1;
            java.lang.Object obj = legacyShowUseCase$invoke$4$emit$2.result;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = legacyShowUseCase$invoke$4$emit$2.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Started) {
                    com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase = com.unity3d.ads.core.domain.LegacyShowUseCase.this;
                    kotlin.time.TimeSource.Monotonic.ValueTimeMark valueTimeMarkM2768boximpl = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.$startTime);
                    java.lang.String str = this.$placement;
                    com.unity3d.ads.core.data.model.Listeners listeners = this.$listeners;
                    legacyShowUseCase$invoke$4$emit$2.label = 1;
                    if (legacyShowUseCase.showStarted(valueTimeMarkM2768boximpl, str, listeners, legacyShowUseCase$invoke$4$emit$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Clicked) {
                    com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase2 = com.unity3d.ads.core.domain.LegacyShowUseCase.this;
                    kotlin.time.TimeSource.Monotonic.ValueTimeMark valueTimeMarkM2768boximpl2 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.$startTime);
                    java.lang.String str2 = this.$placement;
                    com.unity3d.ads.core.data.model.Listeners listeners2 = this.$listeners;
                    legacyShowUseCase$invoke$4$emit$2.label = 2;
                    if (legacyShowUseCase2.showClicked(valueTimeMarkM2768boximpl2, str2, listeners2, legacyShowUseCase$invoke$4$emit$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed) {
                    com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase3 = com.unity3d.ads.core.domain.LegacyShowUseCase.this;
                    kotlin.time.TimeSource.Monotonic.ValueTimeMark valueTimeMarkM2768boximpl3 = kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.$startTime);
                    java.lang.String str3 = this.$placement;
                    com.unity3d.ads.adplayer.model.ShowStatus status = ((com.unity3d.ads.core.data.model.ShowEvent.Completed) showEvent).getStatus();
                    com.unity3d.ads.core.data.model.Listeners listeners3 = this.$listeners;
                    legacyShowUseCase$invoke$4$emit$2.label = 3;
                    if (legacyShowUseCase3.showCompleted(valueTimeMarkM2768boximpl3, str3, status, listeners3, legacyShowUseCase$invoke$4$emit$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (!(showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.Error)) {
                    if (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.CancelTimeout) {
                        com.unity3d.ads.core.domain.LegacyShowUseCase.this.cancelTimeout(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.$startTime));
                    } else if (showEvent instanceof com.unity3d.ads.core.data.model.ShowEvent.LeftApplication) {
                        com.unity3d.ads.core.domain.LegacyShowUseCase.this.bannerLeftApplication(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(this.$startTime), this.$placement, this.$listeners);
                    }
                    return kotlin.Unit.INSTANCE;
                }
                com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase4 = com.unity3d.ads.core.domain.LegacyShowUseCase.this;
                gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                java.lang.String message3 = ((com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent).getMessage();
                com.unity3d.ads.core.data.model.AdObject adObject = this.$adObject;
                legacyShowUseCase$invoke$4$emit$2.L$0 = this;
                legacyShowUseCase$invoke$4$emit$2.L$1 = showEvent;
                legacyShowUseCase$invoke$4$emit$2.label = 4;
                if (legacyShowUseCase4.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                anonymousClass4 = this;
                function6 = anonymousClass4.$reportShowError;
                com.unity3d.ads.core.data.model.ShowEvent.Error error = (com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent;
                reason = error.getReason();
                unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                message = error.getMessage();
                numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(error.getErrorCode());
                message2 = error.getMessage();
                legacyShowUseCase$invoke$4$emit$2.L$0 = null;
                legacyShowUseCase$invoke$4$emit$2.L$1 = null;
                legacyShowUseCase$invoke$4$emit$2.label = 5;
                if (function6.invoke(reason, unityAdsShowError, message, numBoxInt, message2, legacyShowUseCase$invoke$4$emit$2) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 3) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                if (i == 4) {
                    showEvent = (com.unity3d.ads.core.data.model.ShowEvent) legacyShowUseCase$invoke$4$emit$2.L$1;
                    anonymousClass4 = (com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass4) legacyShowUseCase$invoke$4$emit$2.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    function6 = anonymousClass4.$reportShowError;
                    com.unity3d.ads.core.data.model.ShowEvent.Error error2 = (com.unity3d.ads.core.data.model.ShowEvent.Error) showEvent;
                    reason = error2.getReason();
                    unityAdsShowError = com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    message = error2.getMessage();
                    numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(error2.getErrorCode());
                    message2 = error2.getMessage();
                    legacyShowUseCase$invoke$4$emit$2.L$0 = null;
                    legacyShowUseCase$invoke$4$emit$2.L$1 = null;
                    legacyShowUseCase$invoke$4$emit$2.label = 5;
                    if (function6.invoke(reason, unityAdsShowError, message, numBoxInt, message2, legacyShowUseCase$invoke$4$emit$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return emit((com.unity3d.ads.core.data.model.ShowEvent) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(kotlin.time.TimeMark startTime, java.lang.String placement, com.unity3d.ads.core.data.model.Listeners listeners) {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Show Left Application for placement " + placement);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, 12, null);
        listeners.onLeftApplication(placement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(kotlin.time.TimeMark startTime) {
        this.timeoutCancellationRequested.setValue(true);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), null, null, this.adObject, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object showStarted(kotlin.time.TimeMark timeMark, java.lang.String str, com.unity3d.ads.core.data.model.Listeners listeners, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        this.hasStarted.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)), null, null, this.adObject, 12, null);
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcher, new com.unity3d.ads.core.domain.LegacyShowUseCase.C16582(listeners, str, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$2", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16582 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
        final /* synthetic */ java.lang.String $placement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16582(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16582> continuation) {
            super(2, continuation);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.LegacyShowUseCase.C16582(this.$listeners, this.$placement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.LegacyShowUseCase.C16582) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.$listeners.onStart(this.$placement);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object showClicked(kotlin.time.TimeMark timeMark, java.lang.String str, com.unity3d.ads.core.data.model.Listeners listeners, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)), null, null, this.adObject, 12, null);
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcher, new com.unity3d.ads.core.domain.LegacyShowUseCase.C16542(listeners, str, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$2", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16542 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
        final /* synthetic */ java.lang.String $placement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16542(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16542> continuation) {
            super(2, continuation);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.LegacyShowUseCase.C16542(this.$listeners, this.$placement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.LegacyShowUseCase.C16542) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.$listeners.onClick(this.$placement);
            return kotlin.Unit.INSTANCE;
        }
    }

    private final java.lang.String getOpportunityId(com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions) {
        java.lang.Object objOpt;
        org.json.JSONObject data = unityAdsShowOptions.getData();
        try {
            return java.util.UUID.fromString((data == null || (objOpt = data.opt("objectId")) == null) ? null : objOpt.toString()).toString();
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object showStart(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase.C16571 c16571;
        java.lang.String str;
        com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.C16571) {
            c16571 = (com.unity3d.ads.core.domain.LegacyShowUseCase.C16571) continuation;
            if ((c16571.label & Integer.MIN_VALUE) != 0) {
                c16571.label -= Integer.MIN_VALUE;
            } else {
                c16571 = new com.unity3d.ads.core.domain.LegacyShowUseCase.C16571(continuation);
            }
        } else {
            c16571 = new com.unity3d.ads.core.domain.LegacyShowUseCase.C16571(continuation);
        }
        java.lang.Object obj = c16571.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16571.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
            c16571.L$0 = sendDiagnosticEvent2;
            c16571.L$1 = "native_show_started";
            c16571.label = 1;
            java.lang.Object tmpAdObject = getTmpAdObject(c16571);
            if (tmpAdObject == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = "native_show_started";
            sendDiagnosticEvent = sendDiagnosticEvent2;
            obj = tmpAdObject;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) c16571.L$1;
            sendDiagnosticEvent = (com.unity3d.ads.core.domain.SendDiagnosticEvent) c16571.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, null, null, (com.unity3d.ads.core.data.model.AdObject) obj, 14, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object showCompleted(kotlin.time.TimeMark timeMark, java.lang.String str, com.unity3d.ads.adplayer.model.ShowStatus showStatus, com.unity3d.ads.core.data.model.Listeners listeners, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(timeMark)), null, null, this.adObject, 12, null);
        java.lang.Object objWithContext = kotlinx.coroutines.BuildersKt.withContext(this.dispatcher, new com.unity3d.ads.core.domain.LegacyShowUseCase.C16552(listeners, str, showStatus, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C16552 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
        final /* synthetic */ java.lang.String $placement;
        final /* synthetic */ com.unity3d.ads.adplayer.model.ShowStatus $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16552(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String str, com.unity3d.ads.adplayer.model.ShowStatus showStatus, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16552> continuation) {
            super(2, continuation);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.LegacyShowUseCase.C16552(this.$listeners, this.$placement, this.$status, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.LegacyShowUseCase.C16552) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.$listeners.onComplete(this.$placement, com.unity3d.ads.core.extensions.ShowStatusExtensionsKt.toUnityAdsShowCompletionState(this.$status));
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "diagnosticReason", "", "reason", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "code", "", "debugMessage"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
    static final class C16561 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
        final /* synthetic */ java.lang.String $placement;
        final /* synthetic */ kotlin.time.TimeMark $startTime;
        /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        /* synthetic */ java.lang.Object L$2;
        /* synthetic */ java.lang.Object L$3;
        /* synthetic */ java.lang.Object L$4;
        int label;
        final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C16561(java.lang.String str, com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase, kotlin.time.TimeMark timeMark, com.unity3d.ads.core.data.model.Listeners listeners, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16561> continuation) {
            super(6, continuation);
            this.$placement = str;
            this.this$0 = legacyShowUseCase;
            this.$startTime = timeMark;
            this.$listeners = listeners;
        }

        @Override // kotlin.jvm.functions.Function6
        public final java.lang.Object invoke(java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2, java.lang.Integer num, java.lang.String str3, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.unity3d.ads.core.domain.LegacyShowUseCase.C16561 c16561 = new com.unity3d.ads.core.domain.LegacyShowUseCase.C16561(this.$placement, this.this$0, this.$startTime, this.$listeners, continuation);
            c16561.L$0 = str;
            c16561.L$1 = unityAdsShowError;
            c16561.L$2 = str2;
            c16561.L$3 = num;
            c16561.L$4 = str3;
            return c16561.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str = (java.lang.String) this.L$0;
                com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError = (com.unity3d.ads.UnityAds.UnityAdsShowError) this.L$1;
                java.lang.String str2 = (java.lang.String) this.L$2;
                java.lang.Integer num = (java.lang.Integer) this.L$3;
                java.lang.String str3 = (java.lang.String) this.L$4;
                com.unity3d.services.core.log.DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
                com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_failure_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(this.$startTime)), this.this$0.getTags(str, num, str3), null, this.this$0.adObject, 8, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                if (kotlinx.coroutines.BuildersKt.withContext(this.this$0.dispatcher, new com.unity3d.ads.core.domain.LegacyShowUseCase.C16561.C02561(this.$listeners, this.$placement, unityAdsShowError, str2, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: LegacyShowUseCase.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1", f = "LegacyShowUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C02561 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ com.unity3d.ads.core.data.model.Listeners $listeners;
            final /* synthetic */ java.lang.String $message;
            final /* synthetic */ java.lang.String $placement;
            final /* synthetic */ com.unity3d.ads.UnityAds.UnityAdsShowError $reason;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02561(com.unity3d.ads.core.data.model.Listeners listeners, java.lang.String str, com.unity3d.ads.UnityAds.UnityAdsShowError unityAdsShowError, java.lang.String str2, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase.C16561.C02561> continuation) {
                super(2, continuation);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                return new com.unity3d.ads.core.domain.LegacyShowUseCase.C16561.C02561(this.$listeners, this.$placement, this.$reason, this.$message, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                return ((com.unity3d.ads.core.domain.LegacyShowUseCase.C16561.C02561) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
                return kotlin.Unit.INSTANCE;
            }
        }
    }

    private final kotlin.jvm.functions.Function6<java.lang.String, com.unity3d.ads.UnityAds.UnityAdsShowError, java.lang.String, java.lang.Integer, java.lang.String, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> showError(kotlin.time.TimeMark startTime, java.lang.String placement, com.unity3d.ads.core.data.model.Listeners listeners) {
        return new com.unity3d.ads.core.domain.LegacyShowUseCase.C16561(placement, this, startTime, listeners, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.String, java.lang.String> getTags(java.lang.String diagnosticReason, java.lang.Integer code, java.lang.String debugMessage) {
        java.util.Map<java.lang.String, java.lang.String> mapMutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("operation", com.unity3d.ads.core.data.model.OperationType.SHOW.toString()), kotlin.TuplesKt.to("reason", diagnosticReason), kotlin.TuplesKt.to("show_has_started", java.lang.String.valueOf(this.hasStarted.getValue().booleanValue())));
        if (code != null) {
            mapMutableMapOf.put("reason_code", java.lang.String.valueOf(code.intValue()));
        }
        if (debugMessage != null) {
            mapMutableMapOf.put("reason_debug", debugMessage);
        }
        return mapMutableMapOf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object getTmpAdObject(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.AdObject> continuation) {
        com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass1 anonymousClass1;
        com.unity3d.ads.core.domain.LegacyShowUseCase legacyShowUseCase;
        com.google.protobuf.ByteString iSO8859ByteString;
        if (continuation instanceof com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.LegacyShowUseCase.AnonymousClass1(continuation);
        }
        java.lang.Object ad = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(ad);
            com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions = this.unityAdsShowOptions;
            java.util.UUID uuidFromString = java.util.UUID.fromString(unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
            com.google.protobuf.ByteString byteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(uuidFromString);
            com.unity3d.ads.core.data.repository.AdRepository adRepository = this.adRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            ad = adRepository.getAd(byteString, anonymousClass1);
            if (ad == coroutine_suspended) {
                return coroutine_suspended;
            }
            legacyShowUseCase = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            legacyShowUseCase = (com.unity3d.ads.core.domain.LegacyShowUseCase) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(ad);
        }
        com.unity3d.ads.core.data.model.AdObject adObject = (com.unity3d.ads.core.data.model.AdObject) ad;
        if (adObject != null) {
            return adObject;
        }
        com.unity3d.ads.UnityAdsShowOptions unityAdsShowOptions2 = legacyShowUseCase.unityAdsShowOptions;
        if (unityAdsShowOptions2 == null) {
            unityAdsShowOptions2 = new com.unity3d.ads.UnityAdsShowOptions();
        }
        java.lang.String opportunityId = legacyShowUseCase.getOpportunityId(unityAdsShowOptions2);
        if (opportunityId == null || (iSO8859ByteString = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toISO8859ByteString(opportunityId)) == null) {
            iSO8859ByteString = com.google.protobuf.ByteString.EMPTY;
        }
        com.google.protobuf.ByteString byteString2 = iSO8859ByteString;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString2, "getOpportunityId(showOpt…ing() ?: ByteString.EMPTY");
        java.lang.String str = legacyShowUseCase.placement;
        if (str == null) {
            str = "";
        }
        com.google.protobuf.ByteString EMPTY = com.google.protobuf.ByteString.EMPTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
        return new com.unity3d.ads.core.data.model.AdObject(byteString2, str, EMPTY, null, null, new com.unity3d.ads.UnityAdsLoadOptions(), kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false), gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, 16, null);
    }

    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/unity3d/ads/core/domain/LegacyShowUseCase$Companion;", "", "()V", "KEY_OBJECT_ID", "", "MESSAGE_AD_PLAYER_UNAVAILABLE", "MESSAGE_ALREADY_SHOWING", "MESSAGE_NO_AD_OBJECT", "MESSAGE_OPPORTUNITY_ID", "MESSAGE_OPT_TIMEOUT", "MESSAGE_TIMEOUT", "MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING", "isFullscreenAdShowing", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object sendOperativeError(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, java.lang.String str, com.unity3d.ads.core.data.model.AdObject adObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        com.google.protobuf.ByteString byteString = operativeEventErrorData_build.toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString, "errorData.toByteString()");
        java.lang.Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, continuation);
        return objInvoke == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : kotlin.Unit.INSTANCE;
    }
}
