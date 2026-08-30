package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$Params;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "getWebViewData", "", "LoadCacheResult", "Params", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeStateLoadCache extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params, com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult> {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo1218doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m1231doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>>) continuation);
    }

    public InitializeStateLoadCache(com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask("read_local_webview");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public java.lang.Object m1231doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params, kotlin.coroutines.Continuation<? super kotlin.Result<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 initializeStateLoadCache$doWork$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1) {
            initializeStateLoadCache$doWork$1 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1) continuation;
            if ((initializeStateLoadCache$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeStateLoadCache$doWork$1.label -= Integer.MIN_VALUE;
            } else {
                initializeStateLoadCache$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1(this, continuation);
            }
        } else {
            initializeStateLoadCache$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1(this, continuation);
        }
        java.lang.Object objWithContext = initializeStateLoadCache$doWork$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = initializeStateLoadCache$doWork$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2 initializeStateLoadCache$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2(this, params, null);
            initializeStateLoadCache$doWork$1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeStateLoadCache$doWork$2, initializeStateLoadCache$doWork$1);
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

    /* JADX INFO: compiled from: InitializeStateLoadCache.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements com.unity3d.services.core.domain.task.BaseParams {
        private final com.unity3d.services.core.configuration.Configuration config;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params copy$default(com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params params, com.unity3d.services.core.configuration.Configuration configuration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params copy(com.unity3d.services.core.configuration.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            return new com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params(config);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params) other).config);
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

    /* JADX INFO: compiled from: InitializeStateLoadCache.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateLoadCache$LoadCacheResult;", "", "hasHashMismatch", "", "webViewData", "", "(ZLjava/lang/String;)V", "getHasHashMismatch", "()Z", "getWebViewData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoadCacheResult {
        private final boolean hasHashMismatch;
        private final java.lang.String webViewData;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult copy$default(com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult loadCacheResult, boolean z, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = loadCacheResult.hasHashMismatch;
            }
            if ((i & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getWebViewData() {
            return this.webViewData;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult copy(boolean hasHashMismatch, java.lang.String webViewData) {
            return new com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult(hasHashMismatch, webViewData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult)) {
                return false;
            }
            com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult loadCacheResult = (com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult) other;
            return this.hasHashMismatch == loadCacheResult.hasHashMismatch && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewData, loadCacheResult.webViewData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.hasHashMismatch;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            java.lang.String str = this.webViewData;
            return i + (str == null ? 0 : str.hashCode());
        }

        public java.lang.String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }

        public LoadCacheResult(boolean z, java.lang.String str) {
            this.hasHashMismatch = z;
            this.webViewData = str;
        }

        public /* synthetic */ LoadCacheResult(boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : str);
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        public final java.lang.String getWebViewData() {
            return this.webViewData;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return com.unity3d.services.core.misc.Utilities.readFileBytes(new java.io.File(com.unity3d.services.core.properties.SdkProperties.getLocalWebViewFile()));
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e.getMessage());
            return null;
        }
    }
}
