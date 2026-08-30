package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017¢\u0006\u0002\u0010\u0018J3\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#JI\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0096Bø\u0001\u0000¢\u0006\u0002\u00100R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHandleGatewayAdResponse;", "Lcom/unity3d/ads/core/domain/HandleGatewayAdResponse;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "getWebViewContainerUseCase", "Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;", "getWebViewBridge", "Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "getHandleInvocationsFromAdViewer", "Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;", "campaignRepository", "Lcom/unity3d/ads/core/data/repository/CampaignRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "getOperativeEventApi", "Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;", "getLatestWebViewConfiguration", "Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;", "adPlayerScope", "Lcom/unity3d/ads/adplayer/AdPlayerScope;", "getAdPlayer", "Lcom/unity3d/ads/core/domain/GetAdPlayer;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/domain/AndroidGetWebViewContainerUseCase;Lcom/unity3d/ads/core/domain/GetWebViewBridgeUseCase;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/domain/HandleInvocationsFromAdViewer;Lcom/unity3d/ads/core/data/repository/CampaignRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/domain/events/GetOperativeEventApi;Lcom/unity3d/ads/core/domain/GetLatestWebViewConfiguration;Lcom/unity3d/ads/adplayer/AdPlayerScope;Lcom/unity3d/ads/core/domain/GetAdPlayer;)V", "cleanup", "", "t", "", "opportunityId", "Lcom/google/protobuf/ByteString;", com.json.hs.n, "Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;", "adPlayer", "Lcom/unity3d/ads/adplayer/AdPlayer;", "(Ljava/lang/Throwable;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Lcom/unity3d/ads/adplayer/AdPlayer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "Lcom/unity3d/ads/core/data/model/LoadResult;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "context", "Landroid/content/Context;", com.json.y8.j, "", "adType", "Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "", "(Lcom/unity3d/ads/UnityAdsLoadOptions;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdResponseOuterClass$AdResponse;Landroid/content/Context;Ljava/lang/String;Lgatewayprotocol/v1/DiagnosticEventRequestOuterClass$DiagnosticAdType;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHandleGatewayAdResponse implements com.unity3d.ads.core.domain.HandleGatewayAdResponse {
    private final com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope;
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;
    private final com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository;
    private final com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository;
    private final com.unity3d.ads.core.domain.GetAdPlayer getAdPlayer;
    private final com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi;
    private final com.unity3d.ads.core.domain.GetWebViewBridgeUseCase getWebViewBridge;
    private final com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$cleanup$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0}, l = {org.objectweb.asm.Opcodes.IFNONNULL, com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS}, m = "cleanup", n = {"adPlayer"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.cleanup(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse", f = "AndroidHandleGatewayAdResponse.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6}, l = {85, 118, 153, org.objectweb.asm.Opcodes.IF_ICMPGE, org.objectweb.asm.Opcodes.IF_ACMPEQ, org.objectweb.asm.Opcodes.RETURN, org.objectweb.asm.Opcodes.PUTFIELD}, m = "invoke", n = {"this", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", com.json.hs.n, com.json.y8.j, "adType", "adPlayer", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "this", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", com.json.hs.n, com.json.y8.j, "adType", "adPlayer", "webViewUrl", "base64ImpressionConfiguration", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, "this", "opportunityId", com.json.hs.n, "adPlayer", "adObject", "this", "opportunityId", com.json.hs.n, "adPlayer", "adObject", "this", "opportunityId", com.json.hs.n, "adPlayer", "loadEvent", "this", "opportunityId", com.json.hs.n, "adPlayer", "adObject", "t"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"})
    static final class C16501 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        java.lang.Object L$6;
        java.lang.Object L$7;
        java.lang.Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C16501(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C16501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.invoke(null, null, null, null, null, null, false, this);
        }
    }

    public AndroidHandleGatewayAdResponse(com.unity3d.ads.core.data.repository.AdRepository adRepository, com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase getWebViewContainerUseCase, com.unity3d.ads.core.domain.GetWebViewBridgeUseCase getWebViewBridge, com.unity3d.ads.core.data.repository.DeviceInfoRepository deviceInfoRepository, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer, com.unity3d.ads.core.data.repository.CampaignRepository campaignRepository, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi, com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration, com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope, com.unity3d.ads.core.domain.GetAdPlayer getAdPlayer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWebViewContainerUseCase, "getWebViewContainerUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getWebViewBridge, "getWebViewBridge");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getHandleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignRepository, "campaignRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getOperativeEventApi, "getOperativeEventApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getLatestWebViewConfiguration, "getLatestWebViewConfiguration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAdPlayer, "getAdPlayer");
        this.adRepository = adRepository;
        this.getWebViewContainerUseCase = getWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getHandleInvocationsFromAdViewer = getHandleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration;
        this.adPlayerScope = adPlayerScope;
        this.getAdPlayer = getAdPlayer;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0393 A[Catch: CancellationException -> 0x0408, TryCatch #12 {CancellationException -> 0x0408, blocks: (B:109:0x0402, B:104:0x03c2, B:98:0x038d, B:100:0x0393, B:106:0x03e7, B:95:0x0364), top: B:167:0x0364 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x03c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:103:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:106:0x03e7 A[Catch: CancellationException -> 0x0408, TryCatch #12 {CancellationException -> 0x0408, blocks: (B:109:0x0402, B:104:0x03c2, B:98:0x038d, B:100:0x0393, B:106:0x03e7, B:95:0x0364), top: B:167:0x0364 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x0401 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0479 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:141:0x0480  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0 A[Catch: CancellationException -> 0x0431, TRY_ENTER, TRY_LEAVE, TryCatch #7 {CancellationException -> 0x0431, blocks: (B:58:0x01b2, B:67:0x01e0), top: B:157:0x01b2 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0264 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x0265  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x0361 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0362  */
    /* JADX WARN: Code duplicated, block: B:97:0x038c A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r40v1, types: [gatewayprotocol.v1.AdResponseOuterClass$AdResponse] */
    /* JADX WARN: Type inference failed for: r41v1, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, com.unity3d.ads.adplayer.AdPlayer] */
    @Override // com.unity3d.ads.core.domain.HandleGatewayAdResponse
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, android.content.Context context, java.lang.String str, gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType, boolean z, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.LoadResult> continuation) throws java.lang.Throwable {
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C16501 c16501;
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object obj;
        ?? r13;
        ?? r14;
        com.google.protobuf.ByteString byteString2;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse;
        ?? r5;
        kotlinx.coroutines.NonCancellable nonCancellable;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass6 anonymousClass6;
        ?? r6;
        java.lang.Throwable cause;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse2;
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions2;
        boolean z2;
        java.lang.String str2;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType2;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse2;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration;
        boolean z3;
        java.lang.String it;
        java.lang.String str3;
        java.lang.String base64ImpressionConfiguration;
        java.lang.Object objInvoke;
        java.lang.String str4;
        boolean z4;
        gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType3;
        com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions3;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse5;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse6;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        com.unity3d.ads.core.data.model.AdObject adObject;
        boolean z5;
        java.lang.Object obj2;
        com.unity3d.ads.core.data.model.AdObject adObject2;
        com.google.protobuf.ByteString byteString3;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse7;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse8;
        kotlin.jvm.internal.Ref.ObjectRef objectRef6;
        com.unity3d.ads.adplayer.model.LoadEvent loadEvent;
        com.unity3d.ads.core.data.repository.AdRepository adRepository;
        kotlinx.coroutines.NonCancellable nonCancellable2;
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass5 anonymousClass5;
        com.unity3d.ads.adplayer.model.LoadEvent loadEvent2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C16501) {
            c16501 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C16501) continuation;
            if ((c16501.label & Integer.MIN_VALUE) != 0) {
                c16501.label -= Integer.MIN_VALUE;
            } else {
                c16501 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C16501(continuation);
            }
        } else {
            c16501 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.C16501(continuation);
        }
        java.lang.Object objInvoke2 = c16501.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c16501.label;
        try {
            switch (i) {
                case 0:
                    kotlin.ResultKt.throwOnFailure(objInvoke2);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
                    try {
                        try {
                            if (adResponse.hasError()) {
                                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "gateway", adResponse.getError().getErrorText(), 4, null);
                            }
                            if (adResponse.getAdData().isEmpty()) {
                                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL, com.unity3d.ads.core.data.model.LoadResult.MSG_NO_FILL, null, "no_fill", null, 20, null);
                            }
                            com.unity3d.ads.core.domain.GetLatestWebViewConfiguration getLatestWebViewConfiguration = this.getLatestWebViewConfiguration;
                            java.lang.String entryPoint = adResponse.getWebviewConfiguration().getEntryPoint();
                            java.lang.Integer numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(adResponse.getWebviewConfiguration().getVersion());
                            java.util.List<java.lang.String> additionalFilesList = adResponse.getWebviewConfiguration().getAdditionalFilesList();
                            c16501.L$0 = this;
                            unityAdsLoadOptions2 = unityAdsLoadOptions;
                            c16501.L$1 = unityAdsLoadOptions2;
                            byteString2 = byteString;
                            try {
                                c16501.L$2 = byteString2;
                                adResponse2 = adResponse;
                                try {
                                    c16501.L$3 = adResponse2;
                                    c16501.L$4 = str;
                                    c16501.L$5 = diagnosticAdType;
                                    c16501.L$6 = objectRef7;
                                    z2 = z;
                                    c16501.Z$0 = z2;
                                    c16501.label = 1;
                                    objInvoke2 = getLatestWebViewConfiguration.invoke(entryPoint, numBoxInt, additionalFilesList, c16501);
                                    if (objInvoke2 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str2 = str;
                                    diagnosticAdType2 = diagnosticAdType;
                                    androidHandleGatewayAdResponse2 = this;
                                    objectRef2 = objectRef7;
                                    adResponse4 = adResponse2;
                                    try {
                                        webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) objInvoke2;
                                        if (webViewConfiguration.getEntryPoint().length() == 0) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!z3) {
                                            it = com.unity3d.services.core.properties.SdkProperties.getConfigUrl();
                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                                            try {
                                                if (!kotlin.text.StringsKt.endsWith$default(it, ".html", false, 2, (java.lang.Object) null)) {
                                                    it = null;
                                                }
                                                if (it == null) {
                                                    try {
                                                        it = webViewConfiguration.getEntryPoint();
                                                    } catch (java.util.concurrent.CancellationException e) {
                                                        cancellationException = e;
                                                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                        obj = coroutine_suspended;
                                                        r5 = objectRef2;
                                                        r14 = adResponse4;
                                                    }
                                                }
                                                try {
                                                    str3 = kotlin.text.StringsKt.substringBeforeLast$default(it, "?", (java.lang.String) null, 2, (java.lang.Object) null) + (com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_PLAYER_QUERY_PARAMS + new java.net.URI(it).getQuery());
                                                    base64ImpressionConfiguration = android.util.Base64.encodeToString(adResponse4.getImpressionConfiguration().toByteArray(), 2);
                                                    com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                                                    com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope = androidHandleGatewayAdResponse2.adPlayerScope;
                                                    c16501.L$0 = androidHandleGatewayAdResponse2;
                                                    c16501.L$1 = unityAdsLoadOptions2;
                                                    c16501.L$2 = byteString2;
                                                    c16501.L$3 = adResponse4;
                                                    c16501.L$4 = str2;
                                                    c16501.L$5 = diagnosticAdType2;
                                                    c16501.L$6 = objectRef2;
                                                    c16501.L$7 = str3;
                                                    c16501.L$8 = base64ImpressionConfiguration;
                                                    c16501.Z$0 = z2;
                                                    c16501.label = 2;
                                                    objInvoke = androidGetWebViewContainerUseCase.invoke(adPlayerScope, c16501);
                                                    coroutine_suspended = coroutine_suspended;
                                                    if (objInvoke == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    str4 = str3;
                                                    objInvoke2 = objInvoke;
                                                    z4 = z2;
                                                    diagnosticAdType3 = diagnosticAdType2;
                                                    unityAdsLoadOptions3 = unityAdsLoadOptions2;
                                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                                    objectRef4 = objectRef2;
                                                    adResponse6 = adResponse4;
                                                    try {
                                                        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer = (com.unity3d.ads.adplayer.AndroidWebViewContainer) objInvoke2;
                                                        com.unity3d.ads.adplayer.WebViewBridge webViewBridgeInvoke = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer, androidHandleGatewayAdResponse.adPlayerScope);
                                                        objectRef4.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke, androidWebViewContainer, byteString2);
                                                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2(objectRef4, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getScope());
                                                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getUpdateCampaignState(), androidHandleGatewayAdResponse.new AnonymousClass3(byteString2, str2, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getScope());
                                                        com.google.protobuf.ByteString trackingToken = adResponse6.getTrackingToken();
                                                        com.unity3d.ads.adplayer.AdPlayer adPlayer = (com.unity3d.ads.adplayer.AdPlayer) objectRef4.element;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "trackingToken");
                                                        if (z4) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        adObject = new com.unity3d.ads.core.data.model.AdObject(byteString2, str2, trackingToken, adPlayer, null, unityAdsLoadOptions3, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z5), diagnosticAdType3, 16, null);
                                                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject, 14, null);
                                                        com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                                                        kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation = webViewBridgeInvoke.getOnInvocation();
                                                        com.google.protobuf.ByteString adData = adResponse6.getAdData();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData, "response.adData");
                                                        java.lang.String base64$default = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData, false, 1, null);
                                                        com.google.protobuf.ByteString adDataRefreshToken = adResponse6.getAdDataRefreshToken();
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "response.adDataRefreshToken");
                                                        obj2 = coroutine_suspended;
                                                        try {
                                                            java.lang.String base64$default2 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null);
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                                                            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4 anonymousClass4 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4(androidWebViewContainer, str4, null);
                                                            c16501.L$0 = androidHandleGatewayAdResponse;
                                                            c16501.L$1 = byteString2;
                                                            c16501.L$2 = adResponse6;
                                                            c16501.L$3 = objectRef4;
                                                            c16501.L$4 = adObject;
                                                            c16501.L$5 = null;
                                                            c16501.L$6 = null;
                                                            c16501.L$7 = null;
                                                            c16501.L$8 = null;
                                                            c16501.label = 3;
                                                            objInvoke2 = handleInvocationsFromAdViewer.invoke(onInvocation, base64$default, base64$default2, base64ImpressionConfiguration, adObject, anonymousClass4, c16501);
                                                            obj = obj2;
                                                            if (objInvoke2 == obj) {
                                                                return obj;
                                                            }
                                                            adObject2 = adObject;
                                                            byteString3 = byteString2;
                                                            objectRef5 = objectRef4;
                                                            adResponse7 = adResponse6;
                                                            try {
                                                                kotlinx.coroutines.flow.FlowKt.launchIn((kotlinx.coroutines.flow.Flow) objInvoke2, ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getScope());
                                                                kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent = ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getOnLoadEvent();
                                                                c16501.L$0 = androidHandleGatewayAdResponse;
                                                                c16501.L$1 = byteString3;
                                                                c16501.L$2 = adResponse7;
                                                                c16501.L$3 = objectRef5;
                                                                c16501.L$4 = adObject2;
                                                                c16501.label = 4;
                                                                objInvoke2 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent, c16501);
                                                                objectRef6 = objectRef5;
                                                                adResponse8 = adResponse7;
                                                                if (objInvoke2 == obj) {
                                                                    return obj;
                                                                }
                                                                loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) objInvoke2;
                                                                if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                                                                    androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                                                                    adRepository = androidHandleGatewayAdResponse.adRepository;
                                                                    c16501.L$0 = androidHandleGatewayAdResponse;
                                                                    c16501.L$1 = byteString3;
                                                                    c16501.L$2 = adResponse8;
                                                                    c16501.L$3 = objectRef6;
                                                                    c16501.L$4 = adObject2;
                                                                    c16501.label = 6;
                                                                    if (adRepository.addAd(byteString3, adObject2, c16501) == obj) {
                                                                        return obj;
                                                                    }
                                                                    return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject2);
                                                                }
                                                                nonCancellable2 = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, objectRef6, null);
                                                                c16501.L$0 = androidHandleGatewayAdResponse;
                                                                c16501.L$1 = byteString3;
                                                                c16501.L$2 = adResponse8;
                                                                c16501.L$3 = objectRef6;
                                                                c16501.L$4 = loadEvent;
                                                                c16501.label = 5;
                                                                if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable2, anonymousClass5, c16501) == obj) {
                                                                    return obj;
                                                                }
                                                                loadEvent2 = loadEvent;
                                                                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), 4, null);
                                                            } catch (java.util.concurrent.CancellationException e2) {
                                                                cancellationException = e2;
                                                                r6 = objectRef5;
                                                                r13 = adResponse7;
                                                                byteString2 = byteString3;
                                                                r5 = r6;
                                                                r14 = r13;
                                                                nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                                                anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                                                                c16501.L$0 = cancellationException;
                                                                c16501.L$1 = null;
                                                                c16501.L$2 = null;
                                                                c16501.L$3 = null;
                                                                c16501.L$4 = null;
                                                                c16501.L$5 = null;
                                                                c16501.L$6 = null;
                                                                c16501.L$7 = null;
                                                                c16501.L$8 = null;
                                                                c16501.label = 7;
                                                                if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, anonymousClass6, c16501) == obj) {
                                                                    return obj;
                                                                }
                                                                cause = cancellationException.getCause();
                                                                if (cause == null) {
                                                                    throw cancellationException;
                                                                }
                                                                throw cause;
                                                            }
                                                        } catch (java.util.concurrent.CancellationException e3) {
                                                            e = e3;
                                                            obj = obj2;
                                                            objectRef3 = objectRef4;
                                                            adResponse5 = adResponse6;
                                                        }
                                                    } catch (java.util.concurrent.CancellationException e4) {
                                                        e = e4;
                                                        obj = coroutine_suspended;
                                                        objectRef3 = objectRef4;
                                                        adResponse5 = adResponse6;
                                                    }
                                                } catch (java.lang.Throwable unused) {
                                                    obj = coroutine_suspended;
                                                    try {
                                                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "invalid_url", it, 4, null);
                                                    } catch (java.util.concurrent.CancellationException e5) {
                                                        e = e5;
                                                    }
                                                }
                                            } catch (java.util.concurrent.CancellationException e6) {
                                                e = e6;
                                                obj = coroutine_suspended;
                                            }
                                            break;
                                        } else {
                                            try {
                                                return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, 20, null);
                                            } catch (java.util.concurrent.CancellationException e7) {
                                                cancellationException = e7;
                                                obj = coroutine_suspended;
                                                objectRef = objectRef2;
                                                adResponse3 = adResponse4;
                                            }
                                        }
                                    } catch (java.util.concurrent.CancellationException e8) {
                                        e = e8;
                                        obj = coroutine_suspended;
                                    }
                                    cancellationException = e;
                                    objectRef = objectRef2;
                                    adResponse3 = adResponse4;
                                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                                    r5 = objectRef;
                                    r14 = adResponse3;
                                    nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                                    anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                                    c16501.L$0 = cancellationException;
                                    c16501.L$1 = null;
                                    c16501.L$2 = null;
                                    c16501.L$3 = null;
                                    c16501.L$4 = null;
                                    c16501.L$5 = null;
                                    c16501.L$6 = null;
                                    c16501.L$7 = null;
                                    c16501.L$8 = null;
                                    c16501.label = 7;
                                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, anonymousClass6, c16501) == obj) {
                                        return obj;
                                    }
                                    cause = cancellationException.getCause();
                                    if (cause == null) {
                                        throw cancellationException;
                                    }
                                    throw cause;
                                } catch (java.util.concurrent.CancellationException e9) {
                                    e = e9;
                                    obj = coroutine_suspended;
                                    androidHandleGatewayAdResponse = this;
                                    objectRef3 = objectRef7;
                                    adResponse5 = adResponse2;
                                }
                            } catch (java.util.concurrent.CancellationException e10) {
                                e = e10;
                                adResponse2 = adResponse;
                            }
                        } catch (java.util.concurrent.CancellationException e11) {
                            byteString2 = byteString;
                            r14 = adResponse;
                            cancellationException = e11;
                            androidHandleGatewayAdResponse = this;
                            obj = coroutine_suspended;
                            r5 = objectRef7;
                        }
                    } catch (java.util.concurrent.CancellationException e12) {
                        e = e12;
                        byteString2 = byteString;
                    }
                    adResponse2 = adResponse;
                    obj = coroutine_suspended;
                    androidHandleGatewayAdResponse = this;
                    objectRef3 = objectRef7;
                    adResponse5 = adResponse2;
                    cancellationException = e;
                    r5 = objectRef3;
                    r14 = adResponse5;
                    nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                    anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                    c16501.L$0 = cancellationException;
                    c16501.L$1 = null;
                    c16501.L$2 = null;
                    c16501.L$3 = null;
                    c16501.L$4 = null;
                    c16501.L$5 = null;
                    c16501.L$6 = null;
                    c16501.L$7 = null;
                    c16501.L$8 = null;
                    c16501.label = 7;
                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, anonymousClass6, c16501) == obj) {
                        return obj;
                    }
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                case 1:
                    boolean z6 = c16501.Z$0;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef8 = (kotlin.jvm.internal.Ref.ObjectRef) c16501.L$6;
                    diagnosticAdType2 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) c16501.L$5;
                    str2 = (java.lang.String) c16501.L$4;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse9 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) c16501.L$3;
                    byteString2 = (com.google.protobuf.ByteString) c16501.L$2;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions4 = (com.unity3d.ads.UnityAdsLoadOptions) c16501.L$1;
                    androidHandleGatewayAdResponse2 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) c16501.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(objInvoke2);
                        z2 = z6;
                        objectRef2 = objectRef8;
                        adResponse4 = adResponse9;
                        unityAdsLoadOptions2 = unityAdsLoadOptions4;
                        webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) objInvoke2;
                        if (webViewConfiguration.getEntryPoint().length() == 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, null, "no_webview_entry_point", null, 20, null);
                        }
                        it = com.unity3d.services.core.properties.SdkProperties.getConfigUrl();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                        if (!kotlin.text.StringsKt.endsWith$default(it, ".html", false, 2, (java.lang.Object) null)) {
                            it = null;
                        }
                        if (it == null) {
                            it = webViewConfiguration.getEntryPoint();
                            break;
                        }
                        str3 = kotlin.text.StringsKt.substringBeforeLast$default(it, "?", (java.lang.String) null, 2, (java.lang.Object) null) + (com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_PLAYER_QUERY_PARAMS + new java.net.URI(it).getQuery());
                        base64ImpressionConfiguration = android.util.Base64.encodeToString(adResponse4.getImpressionConfiguration().toByteArray(), 2);
                        com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase2 = androidHandleGatewayAdResponse2.getWebViewContainerUseCase;
                        com.unity3d.ads.adplayer.AdPlayerScope adPlayerScope2 = androidHandleGatewayAdResponse2.adPlayerScope;
                        c16501.L$0 = androidHandleGatewayAdResponse2;
                        c16501.L$1 = unityAdsLoadOptions2;
                        c16501.L$2 = byteString2;
                        c16501.L$3 = adResponse4;
                        c16501.L$4 = str2;
                        c16501.L$5 = diagnosticAdType2;
                        c16501.L$6 = objectRef2;
                        c16501.L$7 = str3;
                        c16501.L$8 = base64ImpressionConfiguration;
                        c16501.Z$0 = z2;
                        c16501.label = 2;
                        objInvoke = androidGetWebViewContainerUseCase2.invoke(adPlayerScope2, c16501);
                        coroutine_suspended = coroutine_suspended;
                        if (objInvoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str4 = str3;
                        objInvoke2 = objInvoke;
                        z4 = z2;
                        diagnosticAdType3 = diagnosticAdType2;
                        unityAdsLoadOptions3 = unityAdsLoadOptions2;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                        objectRef4 = objectRef2;
                        adResponse6 = adResponse4;
                        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer2 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) objInvoke2;
                        com.unity3d.ads.adplayer.WebViewBridge webViewBridgeInvoke2 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer2, androidHandleGatewayAdResponse.adPlayerScope);
                        objectRef4.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke2, androidWebViewContainer2, byteString2);
                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2(objectRef4, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getScope());
                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getUpdateCampaignState(), androidHandleGatewayAdResponse.new AnonymousClass3(byteString2, str2, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getScope());
                        com.google.protobuf.ByteString trackingToken2 = adResponse6.getTrackingToken();
                        com.unity3d.ads.adplayer.AdPlayer adPlayer2 = (com.unity3d.ads.adplayer.AdPlayer) objectRef4.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken2, "trackingToken");
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        adObject = new com.unity3d.ads.core.data.model.AdObject(byteString2, str2, trackingToken2, adPlayer2, null, unityAdsLoadOptions3, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z5), diagnosticAdType3, 16, null);
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject, 14, null);
                        com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer2 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation2 = webViewBridgeInvoke2.getOnInvocation();
                        com.google.protobuf.ByteString adData2 = adResponse6.getAdData();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData2, "response.adData");
                        java.lang.String base64$default3 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData2, false, 1, null);
                        com.google.protobuf.ByteString adDataRefreshToken2 = adResponse6.getAdDataRefreshToken();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken2, "response.adDataRefreshToken");
                        obj2 = coroutine_suspended;
                        java.lang.String base64$default4 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken2, false, 1, null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4 anonymousClass7 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4(androidWebViewContainer2, str4, null);
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString2;
                        c16501.L$2 = adResponse6;
                        c16501.L$3 = objectRef4;
                        c16501.L$4 = adObject;
                        c16501.L$5 = null;
                        c16501.L$6 = null;
                        c16501.L$7 = null;
                        c16501.L$8 = null;
                        c16501.label = 3;
                        objInvoke2 = handleInvocationsFromAdViewer2.invoke(onInvocation2, base64$default3, base64$default4, base64ImpressionConfiguration, adObject, anonymousClass7, c16501);
                        obj = obj2;
                        if (objInvoke2 == obj) {
                            return obj;
                        }
                        adObject2 = adObject;
                        byteString3 = byteString2;
                        objectRef5 = objectRef4;
                        adResponse7 = adResponse6;
                        kotlinx.coroutines.flow.FlowKt.launchIn((kotlinx.coroutines.flow.Flow) objInvoke2, ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getScope());
                        kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent2 = ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getOnLoadEvent();
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString3;
                        c16501.L$2 = adResponse7;
                        c16501.L$3 = objectRef5;
                        c16501.L$4 = adObject2;
                        c16501.label = 4;
                        objInvoke2 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent2, c16501);
                        objectRef6 = objectRef5;
                        adResponse8 = adResponse7;
                        if (objInvoke2 == obj) {
                            return obj;
                        }
                        loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) objInvoke2;
                        if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                            androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                            adRepository = androidHandleGatewayAdResponse.adRepository;
                            c16501.L$0 = androidHandleGatewayAdResponse;
                            c16501.L$1 = byteString3;
                            c16501.L$2 = adResponse8;
                            c16501.L$3 = objectRef6;
                            c16501.L$4 = adObject2;
                            c16501.label = 6;
                            if (adRepository.addAd(byteString3, adObject2, c16501) == obj) {
                                return obj;
                            }
                            return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject2);
                        }
                        nonCancellable2 = kotlinx.coroutines.NonCancellable.INSTANCE;
                        anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, objectRef6, null);
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString3;
                        c16501.L$2 = adResponse8;
                        c16501.L$3 = objectRef6;
                        c16501.L$4 = loadEvent;
                        c16501.label = 5;
                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable2, anonymousClass5, c16501) == obj) {
                            return obj;
                        }
                        loadEvent2 = loadEvent;
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), 4, null);
                        cancellationException = e;
                        objectRef = objectRef2;
                        adResponse3 = adResponse4;
                    } catch (java.util.concurrent.CancellationException e13) {
                        cancellationException = e13;
                        obj = coroutine_suspended;
                        objectRef = objectRef8;
                        adResponse3 = adResponse9;
                    }
                    androidHandleGatewayAdResponse = androidHandleGatewayAdResponse2;
                    r5 = objectRef;
                    r14 = adResponse3;
                    nonCancellable = kotlinx.coroutines.NonCancellable.INSTANCE;
                    anonymousClass6 = androidHandleGatewayAdResponse.new AnonymousClass6(cancellationException, byteString2, r14, r5, null);
                    c16501.L$0 = cancellationException;
                    c16501.L$1 = null;
                    c16501.L$2 = null;
                    c16501.L$3 = null;
                    c16501.L$4 = null;
                    c16501.L$5 = null;
                    c16501.L$6 = null;
                    c16501.L$7 = null;
                    c16501.L$8 = null;
                    c16501.label = 7;
                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable, anonymousClass6, c16501) == obj) {
                        return obj;
                    }
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                case 2:
                    z4 = c16501.Z$0;
                    java.lang.String str5 = (java.lang.String) c16501.L$8;
                    java.lang.String str6 = (java.lang.String) c16501.L$7;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef9 = (kotlin.jvm.internal.Ref.ObjectRef) c16501.L$6;
                    gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType diagnosticAdType4 = (gatewayprotocol.v1.DiagnosticEventRequestOuterClass.DiagnosticAdType) c16501.L$5;
                    java.lang.String str7 = (java.lang.String) c16501.L$4;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse10 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) c16501.L$3;
                    com.google.protobuf.ByteString byteString4 = (com.google.protobuf.ByteString) c16501.L$2;
                    com.unity3d.ads.UnityAdsLoadOptions unityAdsLoadOptions5 = (com.unity3d.ads.UnityAdsLoadOptions) c16501.L$1;
                    com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse androidHandleGatewayAdResponse3 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) c16501.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(objInvoke2);
                        base64ImpressionConfiguration = str5;
                        str4 = str6;
                        objectRef4 = objectRef9;
                        diagnosticAdType3 = diagnosticAdType4;
                        str2 = str7;
                        byteString2 = byteString4;
                        unityAdsLoadOptions3 = unityAdsLoadOptions5;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                        adResponse6 = adResponse10;
                        com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer3 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) objInvoke2;
                        com.unity3d.ads.adplayer.WebViewBridge webViewBridgeInvoke3 = androidHandleGatewayAdResponse.getWebViewBridge.invoke(androidWebViewContainer3, androidHandleGatewayAdResponse.adPlayerScope);
                        objectRef4.element = androidHandleGatewayAdResponse.getAdPlayer.invoke(webViewBridgeInvoke3, androidWebViewContainer3, byteString2);
                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(androidHandleGatewayAdResponse.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2(objectRef4, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getScope());
                        kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getUpdateCampaignState(), androidHandleGatewayAdResponse.new AnonymousClass3(byteString2, str2, null)), ((com.unity3d.ads.adplayer.AdPlayer) objectRef4.element).getScope());
                        com.google.protobuf.ByteString trackingToken3 = adResponse6.getTrackingToken();
                        com.unity3d.ads.adplayer.AdPlayer adPlayer3 = (com.unity3d.ads.adplayer.AdPlayer) objectRef4.element;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken3, "trackingToken");
                        if (z4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        adObject = new com.unity3d.ads.core.data.model.AdObject(byteString2, str2, trackingToken3, adPlayer3, null, unityAdsLoadOptions3, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z5), diagnosticAdType3, 16, null);
                        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHandleGatewayAdResponse.sendDiagnosticEvent, "native_load_started_ad_viewer", null, null, null, adObject, 14, null);
                        com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer handleInvocationsFromAdViewer3 = androidHandleGatewayAdResponse.getHandleInvocationsFromAdViewer;
                        kotlinx.coroutines.flow.SharedFlow<com.unity3d.ads.adplayer.Invocation> onInvocation3 = webViewBridgeInvoke3.getOnInvocation();
                        com.google.protobuf.ByteString adData3 = adResponse6.getAdData();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adData3, "response.adData");
                        java.lang.String base64$default5 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adData3, false, 1, null);
                        com.google.protobuf.ByteString adDataRefreshToken3 = adResponse6.getAdDataRefreshToken();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(adDataRefreshToken3, "response.adDataRefreshToken");
                        obj2 = coroutine_suspended;
                        java.lang.String base64$default6 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(adDataRefreshToken3, false, 1, null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(base64ImpressionConfiguration, "base64ImpressionConfiguration");
                        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4 anonymousClass8 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4(androidWebViewContainer3, str4, null);
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString2;
                        c16501.L$2 = adResponse6;
                        c16501.L$3 = objectRef4;
                        c16501.L$4 = adObject;
                        c16501.L$5 = null;
                        c16501.L$6 = null;
                        c16501.L$7 = null;
                        c16501.L$8 = null;
                        c16501.label = 3;
                        objInvoke2 = handleInvocationsFromAdViewer3.invoke(onInvocation3, base64$default5, base64$default6, base64ImpressionConfiguration, adObject, anonymousClass8, c16501);
                        obj = obj2;
                        if (objInvoke2 == obj) {
                            return obj;
                        }
                        adObject2 = adObject;
                        byteString3 = byteString2;
                        objectRef5 = objectRef4;
                        adResponse7 = adResponse6;
                        kotlinx.coroutines.flow.FlowKt.launchIn((kotlinx.coroutines.flow.Flow) objInvoke2, ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getScope());
                        kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent3 = ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getOnLoadEvent();
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString3;
                        c16501.L$2 = adResponse7;
                        c16501.L$3 = objectRef5;
                        c16501.L$4 = adObject2;
                        c16501.label = 4;
                        objInvoke2 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent3, c16501);
                        objectRef6 = objectRef5;
                        adResponse8 = adResponse7;
                        if (objInvoke2 == obj) {
                            return obj;
                        }
                        loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) objInvoke2;
                        if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                            androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                            adRepository = androidHandleGatewayAdResponse.adRepository;
                            c16501.L$0 = androidHandleGatewayAdResponse;
                            c16501.L$1 = byteString3;
                            c16501.L$2 = adResponse8;
                            c16501.L$3 = objectRef6;
                            c16501.L$4 = adObject2;
                            c16501.label = 6;
                            if (adRepository.addAd(byteString3, adObject2, c16501) == obj) {
                                return obj;
                            }
                            return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject2);
                        }
                        nonCancellable2 = kotlinx.coroutines.NonCancellable.INSTANCE;
                        anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, objectRef6, null);
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString3;
                        c16501.L$2 = adResponse8;
                        c16501.L$3 = objectRef6;
                        c16501.L$4 = loadEvent;
                        c16501.label = 5;
                        if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable2, anonymousClass5, c16501) == obj) {
                            return obj;
                        }
                        loadEvent2 = loadEvent;
                        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), 4, null);
                    } catch (java.util.concurrent.CancellationException e14) {
                        cancellationException = e14;
                        obj = coroutine_suspended;
                        androidHandleGatewayAdResponse = androidHandleGatewayAdResponse3;
                        r5 = objectRef9;
                        byteString2 = byteString4;
                        r14 = adResponse10;
                    }
                    break;
                case 3:
                    adObject2 = (com.unity3d.ads.core.data.model.AdObject) c16501.L$4;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef10 = (kotlin.jvm.internal.Ref.ObjectRef) c16501.L$3;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse11 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) c16501.L$2;
                    byteString3 = (com.google.protobuf.ByteString) c16501.L$1;
                    androidHandleGatewayAdResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) c16501.L$0;
                    kotlin.ResultKt.throwOnFailure(objInvoke2);
                    obj = coroutine_suspended;
                    adResponse7 = adResponse11;
                    objectRef5 = objectRef10;
                    kotlinx.coroutines.flow.FlowKt.launchIn((kotlinx.coroutines.flow.Flow) objInvoke2, ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getScope());
                    kotlinx.coroutines.flow.Flow<com.unity3d.ads.adplayer.model.LoadEvent> onLoadEvent4 = ((com.unity3d.ads.adplayer.AdPlayer) objectRef5.element).getOnLoadEvent();
                    c16501.L$0 = androidHandleGatewayAdResponse;
                    c16501.L$1 = byteString3;
                    c16501.L$2 = adResponse7;
                    c16501.L$3 = objectRef5;
                    c16501.L$4 = adObject2;
                    c16501.label = 4;
                    objInvoke2 = kotlinx.coroutines.flow.FlowKt.single(onLoadEvent4, c16501);
                    objectRef6 = objectRef5;
                    adResponse8 = adResponse7;
                    if (objInvoke2 == obj) {
                        return obj;
                    }
                    loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) objInvoke2;
                    if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                        androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                        adRepository = androidHandleGatewayAdResponse.adRepository;
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString3;
                        c16501.L$2 = adResponse8;
                        c16501.L$3 = objectRef6;
                        c16501.L$4 = adObject2;
                        c16501.label = 6;
                        if (adRepository.addAd(byteString3, adObject2, c16501) == obj) {
                            return obj;
                        }
                        return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject2);
                    }
                    nonCancellable2 = kotlinx.coroutines.NonCancellable.INSTANCE;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, objectRef6, null);
                    c16501.L$0 = androidHandleGatewayAdResponse;
                    c16501.L$1 = byteString3;
                    c16501.L$2 = adResponse8;
                    c16501.L$3 = objectRef6;
                    c16501.L$4 = loadEvent;
                    c16501.label = 5;
                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable2, anonymousClass5, c16501) == obj) {
                        return obj;
                    }
                    loadEvent2 = loadEvent;
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), 4, null);
                case 4:
                    adObject2 = (com.unity3d.ads.core.data.model.AdObject) c16501.L$4;
                    kotlin.jvm.internal.Ref.ObjectRef objectRef11 = (kotlin.jvm.internal.Ref.ObjectRef) c16501.L$3;
                    gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse12 = (gatewayprotocol.v1.AdResponseOuterClass.AdResponse) c16501.L$2;
                    byteString3 = (com.google.protobuf.ByteString) c16501.L$1;
                    androidHandleGatewayAdResponse = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse) c16501.L$0;
                    kotlin.ResultKt.throwOnFailure(objInvoke2);
                    obj = coroutine_suspended;
                    adResponse8 = adResponse12;
                    objectRef6 = objectRef11;
                    loadEvent = (com.unity3d.ads.adplayer.model.LoadEvent) objInvoke2;
                    if (!(loadEvent instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error)) {
                        androidHandleGatewayAdResponse.campaignRepository.setLoadTimestamp(byteString3);
                        adRepository = androidHandleGatewayAdResponse.adRepository;
                        c16501.L$0 = androidHandleGatewayAdResponse;
                        c16501.L$1 = byteString3;
                        c16501.L$2 = adResponse8;
                        c16501.L$3 = objectRef6;
                        c16501.L$4 = adObject2;
                        c16501.label = 6;
                        if (adRepository.addAd(byteString3, adObject2, c16501) == obj) {
                            return obj;
                        }
                        return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject2);
                    }
                    nonCancellable2 = kotlinx.coroutines.NonCancellable.INSTANCE;
                    anonymousClass5 = androidHandleGatewayAdResponse.new AnonymousClass5(loadEvent, byteString3, adResponse8, objectRef6, null);
                    c16501.L$0 = androidHandleGatewayAdResponse;
                    c16501.L$1 = byteString3;
                    c16501.L$2 = adResponse8;
                    c16501.L$3 = objectRef6;
                    c16501.L$4 = loadEvent;
                    c16501.label = 5;
                    if (kotlinx.coroutines.BuildersKt.withContext(nonCancellable2, anonymousClass5, c16501) == obj) {
                        return obj;
                    }
                    loadEvent2 = loadEvent;
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), 4, null);
                case 5:
                    loadEvent2 = (com.unity3d.ads.adplayer.model.LoadEvent) c16501.L$4;
                    kotlin.ResultKt.throwOnFailure(objInvoke2);
                    return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) loadEvent2).getMessage(), 4, null);
                case 6:
                    adObject2 = (com.unity3d.ads.core.data.model.AdObject) c16501.L$4;
                    kotlin.ResultKt.throwOnFailure(objInvoke2);
                    return new com.unity3d.ads.core.data.model.LoadResult.Success(adObject2);
                case 7:
                    cancellationException = (java.util.concurrent.CancellationException) c16501.L$0;
                    kotlin.ResultKt.throwOnFailure(objInvoke2);
                    cause = cancellationException.getCause();
                    if (cause == null) {
                        throw cancellationException;
                    }
                    throw cause;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.util.concurrent.CancellationException e15) {
            cancellationException = e15;
            obj = coroutine_suspended;
            r13 = 1;
            r6 = i;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$2", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> $adPlayer;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> objectRef, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2 anonymousClass2 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2(this.$adPlayer, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass2) create(allowedPii, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii = (gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii) this.L$0;
                com.unity3d.ads.adplayer.AdPlayer adPlayer = this.$adPlayer.element;
                byte[] byteArray = allowedPii.toByteArray();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                this.label = 1;
                if (adPlayer.onAllowedPiiChange(byteArray, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u008a@"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$3", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Pair<? extends byte[], ? extends java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        final /* synthetic */ java.lang.String $placementId;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(com.google.protobuf.ByteString byteString, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass3> continuation) {
            super(2, continuation);
            this.$opportunityId = byteString;
            this.$placementId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass3 anonymousClass3 = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.new AnonymousClass3(this.$opportunityId, this.$placementId, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Pair<? extends byte[], ? extends java.lang.Integer> pair, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return invoke2((kotlin.Pair<byte[], java.lang.Integer>) pair, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.Pair<byte[], java.lang.Integer> pair, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass3) create(pair, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0058  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign_build;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlin.Pair pair = (kotlin.Pair) this.L$0;
                byte[] bArr = (byte[]) pair.component1();
                int iIntValue = ((java.lang.Number) pair.component2()).intValue();
                gatewayprotocol.v1.CampaignStateOuterClass.Campaign campaign = com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.campaignRepository.getCampaign(this.$opportunityId);
                if (campaign == null) {
                    java.lang.String str = this.$placementId;
                    com.google.protobuf.ByteString byteString = this.$opportunityId;
                    gatewayprotocol.v1.CampaignKt.Dsl.Companion companion = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builderNewBuilder = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
                    gatewayprotocol.v1.CampaignKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setData(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(new java.lang.String(bArr, kotlin.text.Charsets.ISO_8859_1), false, 1, null));
                    dsl_create.setDataVersion(iIntValue);
                    dsl_create.setPlacementId(str);
                    dsl_create.setImpressionOpportunityId(byteString);
                    campaign_build = dsl_create._build();
                } else {
                    gatewayprotocol.v1.CampaignKt.Dsl.Companion companion2 = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
                    gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builder = campaign.toBuilder();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "this.toBuilder()");
                    gatewayprotocol.v1.CampaignKt.Dsl dsl_create2 = companion2._create(builder);
                    dsl_create2.setData(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(new java.lang.String(bArr, kotlin.text.Charsets.ISO_8859_1), false, 1, null));
                    dsl_create2.setDataVersion(iIntValue);
                    campaign_build = dsl_create2._build();
                    if (campaign_build == null) {
                        java.lang.String str2 = this.$placementId;
                        com.google.protobuf.ByteString byteString2 = this.$opportunityId;
                        gatewayprotocol.v1.CampaignKt.Dsl.Companion companion3 = gatewayprotocol.v1.CampaignKt.Dsl.INSTANCE;
                        gatewayprotocol.v1.CampaignStateOuterClass.Campaign.Builder builderNewBuilder2 = gatewayprotocol.v1.CampaignStateOuterClass.Campaign.newBuilder();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
                        gatewayprotocol.v1.CampaignKt.Dsl dsl_create3 = companion3._create(builderNewBuilder2);
                        dsl_create3.setData(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.fromBase64$default(new java.lang.String(bArr, kotlin.text.Charsets.ISO_8859_1), false, 1, null));
                        dsl_create3.setDataVersion(iIntValue);
                        dsl_create3.setPlacementId(str2);
                        dsl_create3.setImpressionOpportunityId(byteString2);
                        campaign_build = dsl_create3._build();
                    }
                }
                com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.campaignRepository.setCampaign(this.$opportunityId, campaign_build);
                return kotlin.Unit.INSTANCE;
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$4", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {org.objectweb.asm.Opcodes.IF_ICMPEQ}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.String $webViewUrl;
        final /* synthetic */ com.unity3d.ads.adplayer.AndroidWebViewContainer $webviewContainer;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(com.unity3d.ads.adplayer.AndroidWebViewContainer androidWebViewContainer, java.lang.String str, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4> continuation) {
            super(1, continuation);
            this.$webviewContainer = androidWebViewContainer;
            this.$webViewUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4(this.$webviewContainer, this.$webViewUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass4) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$webviewContainer.loadUrl(this.$webViewUrl, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$5", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {org.objectweb.asm.Opcodes.IF_ACMPNE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass5 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> $adPlayer;
        final /* synthetic */ com.unity3d.ads.adplayer.model.LoadEvent $loadEvent;
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        final /* synthetic */ gatewayprotocol.v1.AdResponseOuterClass.AdResponse $response;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass5(com.unity3d.ads.adplayer.model.LoadEvent loadEvent, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> objectRef, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass5> continuation) {
            super(2, continuation);
            this.$loadEvent = loadEvent;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.new AnonymousClass5(this.$loadEvent, this.$opportunityId, this.$response, this.$adPlayer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.cleanup(new java.lang.Error(((com.unity3d.ads.adplayer.model.LoadEvent.Error) this.$loadEvent).getMessage()), this.$opportunityId, this.$response, this.$adPlayer.element, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayAdResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse$invoke$6", f = "AndroidHandleGatewayAdResponse.kt", i = {}, l = {org.objectweb.asm.Opcodes.INVOKEVIRTUAL}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass6 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> $adPlayer;
        final /* synthetic */ com.google.protobuf.ByteString $opportunityId;
        final /* synthetic */ gatewayprotocol.v1.AdResponseOuterClass.AdResponse $response;
        final /* synthetic */ java.util.concurrent.CancellationException $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(java.util.concurrent.CancellationException cancellationException, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, kotlin.jvm.internal.Ref.ObjectRef<com.unity3d.ads.adplayer.AdPlayer> objectRef, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass6> continuation) {
            super(2, continuation);
            this.$t = cancellationException;
            this.$opportunityId = byteString;
            this.$response = adResponse;
            this.$adPlayer = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.new AnonymousClass6(this.$t, this.$opportunityId, this.$response, this.$adPlayer, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.this.cleanup(this.$t, this.$opportunityId, this.$response, this.$adPlayer.element, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object cleanup(java.lang.Throwable th, com.google.protobuf.ByteString byteString, gatewayprotocol.v1.AdResponseOuterClass.AdResponse adResponse, com.unity3d.ads.adplayer.AdPlayer adPlayer, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1 anonymousClass1;
        java.lang.String message;
        com.unity3d.ads.adplayer.AdPlayer adPlayer2;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHandleGatewayAdResponse.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                com.unity3d.ads.adplayer.AdPlayer adPlayer3 = (com.unity3d.ads.adplayer.AdPlayer) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                adPlayer2 = adPlayer3;
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.Companion companion = gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        gatewayprotocol.v1.OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED);
        java.lang.Throwable cause = th.getCause();
        if ((cause == null || (message = cause.getMessage()) == null) && (message = th.getMessage()) == null) {
            message = "";
        }
        dsl_create.setMessage(message);
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        com.unity3d.ads.core.domain.events.GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType operativeEventType = gatewayprotocol.v1.OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_LOAD_ERROR;
        com.google.protobuf.ByteString trackingToken = adResponse.getTrackingToken();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(trackingToken, "response.trackingToken");
        com.google.protobuf.ByteString byteString2 = operativeEventErrorData_build.toByteString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteString2, "operativeEventErrorData.toByteString()");
        adPlayer2 = adPlayer;
        anonymousClass1.L$0 = adPlayer2;
        anonymousClass1.label = 1;
        if (com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(getOperativeEventApi, operativeEventType, byteString, trackingToken, byteString2, null, anonymousClass1, 16, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (adPlayer2 == null) {
            return kotlin.Unit.INSTANCE;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (adPlayer2.destroy(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }
}
