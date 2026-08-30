package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0012\u0013B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "initializeStateNetworkError", "Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;", "httpClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/services/core/domain/task/InitializeStateNetworkError;Lcom/unity3d/services/core/network/core/HttpClient;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "LoadWebResult", "Params", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeStateLoadWeb extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params, com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult> {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;
    private final com.unity3d.services.core.network.core.HttpClient httpClient;
    private final com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo1218doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m1232doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>>) continuation);
    }

    public InitializeStateLoadWeb(com.unity3d.services.core.domain.ISDKDispatchers dispatchers, com.unity3d.services.core.domain.task.InitializeStateNetworkError initializeStateNetworkError, com.unity3d.services.core.network.core.HttpClient httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializeStateNetworkError, "initializeStateNetworkError");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClient = httpClient;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public java.lang.Object m1232doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params, kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult>> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 initializeStateLoadWeb$doWork$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1) {
            initializeStateLoadWeb$doWork$1 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1) continuation;
            if ((initializeStateLoadWeb$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeStateLoadWeb$doWork$1.label -= Integer.MIN_VALUE;
            } else {
                initializeStateLoadWeb$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1(this, continuation);
            }
        } else {
            initializeStateLoadWeb$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1(this, continuation);
        }
        java.lang.Object objWithContext = initializeStateLoadWeb$doWork$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = initializeStateLoadWeb$doWork$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2(params, this, null);
            initializeStateLoadWeb$doWork$1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeStateLoadWeb$doWork$2, initializeStateLoadWeb$doWork$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(objWithContext);
        }
        return ((kotlin.Result) objWithContext).getValue();
    }

    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements com.unity3d.services.core.domain.task.BaseParams {
        private final com.unity3d.services.core.configuration.Configuration config;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params copy$default(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params params, com.unity3d.services.core.configuration.Configuration configuration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params copy(com.unity3d.services.core.configuration.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            return new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params(config);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params) other).config);
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public java.lang.String toString() {
            return "Params(config=" + this.config + ')';
        }

        public Params(com.unity3d.services.core.configuration.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }
    }

    /* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "webViewDataString", "", "(Lcom/unity3d/services/core/configuration/Configuration;Ljava/lang/String;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getWebViewDataString", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoadWebResult {
        private final com.unity3d.services.core.configuration.Configuration config;
        private final java.lang.String webViewDataString;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult copy$default(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult loadWebResult, com.unity3d.services.core.configuration.Configuration configuration, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getWebViewDataString() {
            return this.webViewDataString;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult copy(com.unity3d.services.core.configuration.Configuration config, java.lang.String webViewDataString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewDataString, "webViewDataString");
            return new com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult(config, webViewDataString);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult)) {
                return false;
            }
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult loadWebResult = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb.LoadWebResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.config, loadWebResult.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewDataString, loadWebResult.webViewDataString);
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewDataString.hashCode();
        }

        public java.lang.String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ')';
        }

        public LoadWebResult(com.unity3d.services.core.configuration.Configuration config, java.lang.String webViewDataString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewDataString, "webViewDataString");
            this.config = config;
            this.webViewDataString = webViewDataString;
        }

        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        public final java.lang.String getWebViewDataString() {
            return this.webViewDataString;
        }
    }
}
