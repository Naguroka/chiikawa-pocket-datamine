package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0002J!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0012H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "configFileFromLocalStorage", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "context", "Landroid/content/Context;", "cronetEngineBuilderFactory", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "(Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;)V", "buildCronetCachePath", "", "buildNetworkClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidHttpClientProvider implements com.unity3d.ads.core.domain.HttpClientProvider {
    private final com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader;
    private final com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final android.content.Context context;
    private final com.unity3d.services.core.network.core.CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", f = "AndroidHttpClientProvider.kt", i = {0, 0}, l = {45}, m = "invoke", n = {"this", "startTime"}, s = {"L$0", "J$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long J$0;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidHttpClientProvider.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.unity3d.ads.core.domain.AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage configFileFromLocalStorage, com.unity3d.ads.core.configuration.AlternativeFlowReader alternativeFlowReader, com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.ads.core.domain.SendDiagnosticEvent sendDiagnosticEvent, android.content.Context context, com.unity3d.services.core.network.core.CronetEngineBuilderFactory cronetEngineBuilderFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configFileFromLocalStorage, "configFileFromLocalStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    public java.lang.Object invoke(kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
        com.unity3d.ads.core.domain.AndroidHttpClientProvider.AnonymousClass1 anonymousClass1;
        com.unity3d.services.core.configuration.IExperiments experiments;
        com.unity3d.ads.core.domain.AndroidHttpClientProvider androidHttpClientProvider;
        long j;
        if (continuation instanceof com.unity3d.ads.core.domain.AndroidHttpClientProvider.AnonymousClass1) {
            anonymousClass1 = (com.unity3d.ads.core.domain.AndroidHttpClientProvider.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider.AnonymousClass1(continuation);
        }
        java.lang.Object objWithTimeoutOrNull = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithTimeoutOrNull);
            if (!this.alternativeFlowReader.invoke()) {
                com.unity3d.services.core.configuration.Configuration configuration = (com.unity3d.services.core.configuration.Configuration) kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$config$1(this, null), 1, null);
                if ((configuration == null || (experiments = configuration.getExperiments()) == null || !experiments.isOkHttpEnabled()) ? false : true) {
                    return new com.unity3d.services.core.network.core.OkHttp3Client(this.dispatchers, new okhttp3.OkHttpClient());
                }
                return new com.unity3d.services.core.network.core.LegacyHttpClient(this.dispatchers);
            }
            long jM2767markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m2767markNowz9LOYto();
            com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$client$1 androidHttpClientProvider$invoke$client$1 = new com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$client$1(this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.J$0 = jM2767markNowz9LOYto;
            anonymousClass1.label = 1;
            objWithTimeoutOrNull = kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(500L, androidHttpClientProvider$invoke$client$1, anonymousClass1);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidHttpClientProvider = this;
            j = jM2767markNowz9LOYto;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = anonymousClass1.J$0;
            androidHttpClientProvider = (com.unity3d.ads.core.domain.AndroidHttpClientProvider) anonymousClass1.L$0;
            kotlin.ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        com.unity3d.services.core.network.core.HttpClient httpClient = (com.unity3d.services.core.network.core.HttpClient) objWithTimeoutOrNull;
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(androidHttpClientProvider.sendDiagnosticEvent, httpClient == null ? "native_cronet_failure_time" : "native_cronet_success_time", kotlin.coroutines.jvm.internal.Boxing.boxDouble(kotlin.time.Duration.m2671toDoubleimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m2772elapsedNowUwyO8pc(j), kotlin.time.DurationUnit.MILLISECONDS)), null, null, null, 28, null);
        return httpClient == null ? new com.unity3d.services.core.network.core.OkHttp3Client(androidHttpClientProvider.dispatchers, new okhttp3.OkHttpClient()) : httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String buildCronetCachePath(android.content.Context context) {
        java.io.File filesDir = context.getFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "context.filesDir");
        java.io.File fileResolve = kotlin.io.FilesKt.resolve(filesDir, com.unity3d.services.UnityAdsConstants.DefaultUrls.HTTP_CACHE_DIR_NAME);
        if (!fileResolve.exists()) {
            fileResolve.mkdirs();
        }
        java.lang.String absolutePath = fileResolve.getAbsolutePath();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "cacheDir.absolutePath");
        return absolutePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object buildNetworkClient(final android.content.Context context, final com.unity3d.services.core.domain.ISDKDispatchers iSDKDispatchers, kotlin.coroutines.Continuation<? super com.unity3d.services.core.network.core.HttpClient> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        com.google.android.gms.net.CronetProviderInstaller.installProvider(context).addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task<java.lang.Void> it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccessful()) {
                    try {
                        org.chromium.net.CronetEngine cronetEngine = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context).setStoragePath(this.this$0.buildCronetCachePath(context)).enableHttpCache(3, 5242880L).enableQuic(true).addQuicHint(com.unity3d.services.core.di.ServiceProvider.GATEWAY_HOST, 443, 443).addQuicHint("cdn-creatives-cf-prd.acquire.unity3dusercontent.com", 443, 443).build();
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.core.HttpClient> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cronetEngine, "cronetEngine");
                        cancellableContinuation.resumeWith(kotlin.Result.m1301constructorimpl(new com.unity3d.services.core.network.core.CronetClient(cronetEngine, iSDKDispatchers)));
                        return;
                    } catch (java.lang.Throwable unused) {
                        kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.core.HttpClient> cancellableContinuation2 = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        cancellableContinuation2.resumeWith(kotlin.Result.m1301constructorimpl(new com.unity3d.services.core.network.core.OkHttp3Client(iSDKDispatchers, new okhttp3.OkHttpClient())));
                        return;
                    }
                }
                kotlinx.coroutines.CancellableContinuation<com.unity3d.services.core.network.core.HttpClient> cancellableContinuation3 = cancellableContinuationImpl2;
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                cancellableContinuation3.resumeWith(kotlin.Result.m1301constructorimpl(new com.unity3d.services.core.network.core.OkHttp3Client(iSDKDispatchers, new okhttp3.OkHttpClient())));
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
