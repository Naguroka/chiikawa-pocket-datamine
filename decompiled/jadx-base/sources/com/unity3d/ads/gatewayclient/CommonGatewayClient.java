package com.unity3d.ads.gatewayclient;

/* JADX INFO: compiled from: CommonGatewayClient.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 ;2\u00020\u0001:\u0001;B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ:\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J)\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010%J1\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000eH\u0002J\"\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00110\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020!2\u0006\u0010#\u001a\u00020$H\u0002J1\u0010\u0014\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J(\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002J(\u00104\u001a\u00020/2\u0006\u00105\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010#\u001a\u00020$2\u0006\u00102\u001a\u000203H\u0002J \u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00192\u0006\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "httpClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/services/core/network/core/HttpClient;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "buildHttpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "gatewayUrl", "", "headers", "", "", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "request", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "calculateDelayTime", "", "retryCount", "", "calculateExponentialBackoff", "retryWaitBase", "calculateJitter", "retryWaitTime", "retryJitterPct", "", "executeRequest", "Lcom/unity3d/services/core/network/model/HttpResponse;", "httpRequest", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithRetry", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "url", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGatewayUrl", "getHeaders", "getUniversalResponse", com.json.hs.n, "sendNetworkErrorDiagnosticEvent", "", "e", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "startTime", "Lkotlin/time/TimeMark;", "sendNetworkSuccessDiagnosticEvent", "httpResponse", "shouldRetry", "", "responseCode", "duration", "maxDuration", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGatewayClient implements com.unity3d.ads.gatewayclient.GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    public static final java.lang.String HEADER_PROTOBUF = "application/x-protobuf";
    public static final java.lang.String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final com.unity3d.ads.core.domain.HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final com.unity3d.services.core.network.core.HttpClient httpClient;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", i = {0, 0, 0, 0}, l = {114}, m = "executeRequest", n = {"this", "operationType", "retryCount", "startTime"}, s = {"L$0", "L$1", "I$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.gatewayclient.CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", i = {0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2}, l = {74, 80, 97}, m = "executeWithRetry", n = {"this", "request", "requestPolicy", "operationType", "gatewayUrl", "retryCount", "timer", "this", "request", "requestPolicy", "operationType", "gatewayUrl", "retryCount", "timer"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0"})
    static final class C16981 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;

        C16981(kotlin.coroutines.Continuation<? super com.unity3d.ads.gatewayclient.CommonGatewayClient.C16981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.gatewayclient.CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return (400 <= responseCode && responseCode < 600) && duration < ((long) maxDuration);
    }

    public CommonGatewayClient(com.unity3d.services.core.network.core.HttpClient httpClient, com.unity3d.ads.core.domain.HandleGatewayUniversalResponse handleGatewayUniversalResponse, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.httpClient = httpClient;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse>, java.lang.Object> {
        final /* synthetic */ com.unity3d.ads.core.data.model.OperationType $operationType;
        final /* synthetic */ gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ com.unity3d.ads.gatewayclient.RequestPolicy $requestPolicy;
        final /* synthetic */ java.lang.String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
            this.$operationType = operationType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.unity3d.ads.gatewayclient.CommonGatewayClient.this.new AnonymousClass2(this.$url, this.$request, this.$requestPolicy, this.$operationType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation) {
            return ((com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.unity3d.ads.gatewayclient.CommonGatewayClient.this.executeWithRetry(this.$url, this.$request, this.$requestPolicy, this.$operationType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    public java.lang.Object request(java.lang.String str, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest universalRequest, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> continuation) {
        return kotlinx.coroutines.TimeoutKt.withTimeout(requestPolicy.getMaxDuration(), new com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass2(str, universalRequest, requestPolicy, operationType, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:31:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0109  */
    /* JADX WARN: Code duplicated, block: B:34:0x010b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0149 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x014a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x014a -> B:16:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object executeWithRetry(java.lang.String r35, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r36, com.unity3d.ads.gatewayclient.RequestPolicy r37, com.unity3d.ads.core.data.model.OperationType r38, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> r39) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final java.lang.Object executeRequest(com.unity3d.services.core.network.model.HttpRequest httpRequest, int i, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.model.HttpResponse> continuation) throws com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException {
        com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass1 anonymousClass1;
        long jM2767markNowz9LOYto;
        int i2;
        com.unity3d.ads.core.data.model.OperationType operationType2;
        com.unity3d.ads.gatewayclient.CommonGatewayClient commonGatewayClient;
        int i3;
        if (continuation instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.gatewayclient.CommonGatewayClient.AnonymousClass1(continuation);
        }
        java.lang.Object objExecute = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = anonymousClass1.label;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = anonymousClass1.J$0;
            i3 = anonymousClass1.I$0;
            com.unity3d.ads.core.data.model.OperationType operationType3 = (com.unity3d.ads.core.data.model.OperationType) anonymousClass1.L$1;
            commonGatewayClient = (com.unity3d.ads.gatewayclient.CommonGatewayClient) anonymousClass1.L$0;
            try {
                kotlin.ResultKt.throwOnFailure(objExecute);
                operationType2 = operationType3;
                jM2767markNowz9LOYto = j;
                try {
                    com.unity3d.services.core.network.model.HttpResponse httpResponse = (com.unity3d.services.core.network.model.HttpResponse) objExecute;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                    return httpResponse;
                } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e) {
                    e = e;
                    i2 = i3;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                    return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
                } catch (kotlinx.coroutines.TimeoutCancellationException unused) {
                    i2 = i3;
                    com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null);
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(unityAdsNetworkException, i2, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                    throw unityAdsNetworkException;
                }
            } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e2) {
                e = e2;
                i2 = i3;
                operationType2 = operationType3;
                jM2767markNowz9LOYto = j;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
            } catch (kotlinx.coroutines.TimeoutCancellationException unused2) {
                i2 = i3;
                operationType2 = operationType3;
                jM2767markNowz9LOYto = j;
                com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException2 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null);
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(unityAdsNetworkException2, i2, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                throw unityAdsNetworkException2;
            }
        }
        kotlin.ResultKt.throwOnFailure(objExecute);
        jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
        try {
            com.unity3d.services.core.network.core.HttpClient httpClient = this.httpClient;
            anonymousClass1.L$0 = this;
            operationType2 = operationType;
            try {
                anonymousClass1.L$1 = operationType2;
                i2 = i;
                try {
                    anonymousClass1.I$0 = i2;
                    anonymousClass1.J$0 = jM2767markNowz9LOYto;
                    anonymousClass1.label = 1;
                    objExecute = httpClient.execute(httpRequest, anonymousClass1);
                    if (objExecute == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    commonGatewayClient = this;
                    i3 = i2;
                    com.unity3d.services.core.network.model.HttpResponse httpResponse2 = (com.unity3d.services.core.network.model.HttpResponse) objExecute;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i3, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                    return httpResponse2;
                } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e3) {
                    e = e3;
                    commonGatewayClient = this;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                    return com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(e);
                } catch (kotlinx.coroutines.TimeoutCancellationException unused3) {
                    commonGatewayClient = this;
                    com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException3 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null);
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(unityAdsNetworkException3, i2, operationType2, kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2768boximpl(jM2767markNowz9LOYto));
                    throw unityAdsNetworkException3;
                }
            } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e4) {
                e = e4;
                i2 = i;
            } catch (kotlinx.coroutines.TimeoutCancellationException unused4) {
                i2 = i;
            }
        } catch (com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e5) {
            e = e5;
            i2 = i;
            operationType2 = operationType;
        } catch (kotlinx.coroutines.TimeoutCancellationException unused5) {
            i2 = i;
            operationType2 = operationType;
        }
    }

    private final com.unity3d.services.core.network.model.HttpRequest buildHttpRequest(java.lang.String gatewayUrl, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> headers, com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest request) {
        return new com.unity3d.services.core.network.model.HttpRequest(gatewayUrl, null, com.unity3d.services.core.network.model.RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders(int retryCount) {
        java.util.Map mapCreateMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("Content-Type", kotlin.collections.CollectionsKt.listOf(HEADER_PROTOBUF));
        if (retryCount > 0) {
            mapCreateMapBuilder.put(HEADER_RETRY_ATTEMPT, kotlin.collections.CollectionsKt.listOf(java.lang.String.valueOf(retryCount)));
        }
        return kotlin.collections.MapsKt.build(mapCreateMapBuilder);
    }

    private final java.lang.String getGatewayUrl(java.lang.String url) {
        return !kotlin.jvm.internal.Intrinsics.areEqual(url, com.unity3d.services.UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final void sendNetworkErrorDiagnosticEvent(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException e, int retryCount, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.time.TimeMark startTime) {
        if (operationType == com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT) {
            return;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("operation", operationType.toString()), kotlin.TuplesKt.to("retries", java.lang.String.valueOf(retryCount)), kotlin.TuplesKt.to("protocol", java.lang.String.valueOf(e.getProtocol())), kotlin.TuplesKt.to("network_client", java.lang.String.valueOf(e.getClient())), kotlin.TuplesKt.to("reason_code", java.lang.String.valueOf(e.getCode())), kotlin.TuplesKt.to("reason_debug", e.getMessage())), null, null, 24, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(com.unity3d.services.core.network.model.HttpResponse httpResponse, int retryCount, com.unity3d.ads.core.data.model.OperationType operationType, kotlin.time.TimeMark startTime) {
        if (operationType == com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT) {
            return;
        }
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", java.lang.Double.valueOf(com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(startTime)), kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("operation", operationType.toString()), kotlin.TuplesKt.to("retries", java.lang.String.valueOf(retryCount)), kotlin.TuplesKt.to("protocol", httpResponse.getProtocol()), kotlin.TuplesKt.to("network_client", httpResponse.getClient()), kotlin.TuplesKt.to("reason_code", java.lang.String.valueOf(httpResponse.getStatusCode()))), null, null, 24, null);
    }

    private final gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse getUniversalResponse(com.unity3d.services.core.network.model.HttpResponse response, com.unity3d.ads.core.data.model.OperationType operationType) {
        try {
            java.lang.Object body = response.getBody();
            if (body instanceof byte[]) {
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse from = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "parseFrom(responseBody)");
                return from;
            }
            if (body instanceof java.lang.String) {
                byte[] bytes = ((java.lang.String) body).getBytes(kotlin.text.Charsets.ISO_8859_1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse from2 = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from2, "parseFrom(\n             …8859_1)\n                )");
                return from2;
            }
            throw new com.google.protobuf.InvalidProtocolBufferException("Could not parse response from gateway service");
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            com.unity3d.services.core.log.DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("operation", operationType.toString()), kotlin.TuplesKt.to("reason", "protobuf_parsing"), kotlin.TuplesKt.to("reason_debug", response.getBody().toString())), null, null, 26, null);
            gatewayprotocol.v1.UniversalResponseKt.Dsl.Companion companion = gatewayprotocol.v1.UniversalResponseKt.Dsl.INSTANCE;
            gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            gatewayprotocol.v1.UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            gatewayprotocol.v1.ErrorKt.Dsl.Companion companion2 = gatewayprotocol.v1.ErrorKt.Dsl.INSTANCE;
            gatewayprotocol.v1.ErrorOuterClass.Error.Builder builderNewBuilder2 = gatewayprotocol.v1.ErrorOuterClass.Error.newBuilder();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
            gatewayprotocol.v1.ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }

    private final long calculateDelayTime(com.unity3d.ads.gatewayclient.RequestPolicy requestPolicy, int retryCount) {
        long jCalculateExponentialBackoff = calculateExponentialBackoff(requestPolicy.getRetryWaitBase(), retryCount);
        return java.lang.Math.min(jCalculateExponentialBackoff + calculateJitter(jCalculateExponentialBackoff, requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(int retryWaitBase, int retryCount) {
        return ((long) retryWaitBase) * ((long) java.lang.Math.pow(2.0d, retryCount));
    }

    private final long calculateJitter(long retryWaitTime, float retryJitterPct) {
        long j = (long) (retryWaitTime * retryJitterPct);
        return kotlin.random.Random.INSTANCE.nextLong(-j, j + 1);
    }
}
