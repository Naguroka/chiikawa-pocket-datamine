package com.unity3d.services.ads.token;

/* JADX INFO: compiled from: InMemoryTokenStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\u0012\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/unity3d/services/ads/token/InMemoryTokenStorage;", "Lcom/unity3d/services/ads/token/TokenStorage;", "Lcom/unity3d/services/core/di/IServiceComponent;", "()V", "accessCounter", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "asyncTokenStorage", "Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "getAsyncTokenStorage", "()Lcom/unity3d/services/ads/token/AsyncTokenStorage;", "asyncTokenStorage$delegate", "Lkotlin/Lazy;", "executorService", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "initToken", "", "nativeGeneratedToken", "", "getNativeGeneratedToken", "()Lkotlin/Unit;", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "token", "getToken", "()Ljava/lang/String;", "appendTokens", "tokens", "Lorg/json/JSONArray;", "createTokens", "deleteTokens", "setInitToken", "value", "triggerTokenAvailable", "withConfig", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InMemoryTokenStorage implements com.unity3d.services.ads.token.TokenStorage, com.unity3d.services.core.di.IServiceComponent {

    /* JADX INFO: renamed from: asyncTokenStorage$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy asyncTokenStorage;
    private final java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> queue = new java.util.concurrent.ConcurrentLinkedQueue<>();
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> accessCounter = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(-1);
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> initToken = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
    private final java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();

    public InMemoryTokenStorage() {
        final com.unity3d.services.ads.token.InMemoryTokenStorage inMemoryTokenStorage = this;
        final java.lang.String str = "";
        this.asyncTokenStorage = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.unity3d.services.ads.token.AsyncTokenStorage>() { // from class: com.unity3d.services.ads.token.InMemoryTokenStorage$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.services.ads.token.AsyncTokenStorage, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.unity3d.services.ads.token.AsyncTokenStorage invoke() {
                com.unity3d.services.core.di.IServiceComponent iServiceComponent = inMemoryTokenStorage;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.unity3d.services.ads.token.AsyncTokenStorage.class));
            }
        });
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public com.unity3d.services.core.di.IServiceProvider getServiceProvider() {
        return com.unity3d.services.core.di.IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    private final com.unity3d.services.ads.token.AsyncTokenStorage getAsyncTokenStorage() {
        return (com.unity3d.services.ads.token.AsyncTokenStorage) this.asyncTokenStorage.getValue();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(org.json.JSONArray tokens) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "tokens");
        deleteTokens();
        appendTokens(tokens);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(org.json.JSONArray tokens) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokens, "tokens");
        this.accessCounter.compareAndSet(-1, 0);
        int length = tokens.length();
        for (int i = 0; i < length; i++) {
            this.queue.add(tokens.getString(i));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        java.lang.Integer value;
        this.queue.clear();
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow = this.accessCounter;
        do {
            value = mutableStateFlow.getValue();
            value.intValue();
        } while (!mutableStateFlow.compareAndSet(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public java.lang.String getToken() {
        java.lang.Integer value;
        java.lang.Integer num;
        if (this.accessCounter.getValue().intValue() == -1) {
            return this.initToken.getValue();
        }
        if (this.queue.isEmpty()) {
            com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.TOKEN, com.unity3d.services.ads.token.TokenEvent.QUEUE_EMPTY, new java.lang.Object[0]);
            return null;
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Integer> mutableStateFlow = this.accessCounter;
        do {
            value = mutableStateFlow.getValue();
            num = value;
        } while (!mutableStateFlow.compareAndSet(value, java.lang.Integer.valueOf(num.intValue() + 1)));
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.TOKEN, com.unity3d.services.ads.token.TokenEvent.TOKEN_ACCESS, java.lang.Integer.valueOf(num.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public kotlin.Unit getNativeGeneratedToken() {
        new com.unity3d.services.ads.token.NativeTokenGenerator(this.executorService, new com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder(new com.unity3d.services.core.configuration.ConfigurationReader(), com.unity3d.services.core.configuration.PrivacyConfigStorage.getInstance(), com.unity3d.services.core.device.reader.GameSessionIdReader.getInstance()), null).generateToken(new com.unity3d.services.ads.token.INativeTokenGeneratorListener() { // from class: com.unity3d.services.ads.token.InMemoryTokenStorage$$ExternalSyntheticLambda0
            @Override // com.unity3d.services.ads.token.INativeTokenGeneratorListener
            public final void onReady(java.lang.String str) {
                com.unity3d.services.ads.token.InMemoryTokenStorage._get_nativeGeneratedToken_$lambda$2(str);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(java.lang.String str) {
        com.unity3d.services.core.webview.WebViewApp.getCurrentApp().sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.TOKEN, com.unity3d.services.ads.token.TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(java.lang.String value) {
        if (value == null) {
            return;
        }
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> mutableStateFlow = this.initToken;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), value)) {
        }
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }

    private final void triggerTokenAvailable(boolean withConfig) {
        com.unity3d.services.core.configuration.InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(withConfig);
    }
}
