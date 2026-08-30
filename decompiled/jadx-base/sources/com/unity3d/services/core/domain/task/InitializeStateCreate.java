package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateCreate.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateCreate;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;", "Lcom/unity3d/services/core/configuration/Configuration;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "Params", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeStateCreate extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.InitializeStateCreate.Params, com.unity3d.services.core.configuration.Configuration> {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo1218doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m1229doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateCreate.Params) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>) continuation);
    }

    public InitializeStateCreate(com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask("create_web_view");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public java.lang.Object m1229doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateCreate.Params params, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 initializeStateCreate$doWork$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1) {
            initializeStateCreate$doWork$1 = (com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1) continuation;
            if ((initializeStateCreate$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeStateCreate$doWork$1.label -= Integer.MIN_VALUE;
            } else {
                initializeStateCreate$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1(this, continuation);
            }
        } else {
            initializeStateCreate$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1(this, continuation);
        }
        java.lang.Object objWithContext = initializeStateCreate$doWork$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = initializeStateCreate$doWork$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2 initializeStateCreate$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2(params, null);
            initializeStateCreate$doWork$1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeStateCreate$doWork$2, initializeStateCreate$doWork$1);
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

    /* JADX INFO: compiled from: InitializeStateCreate.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateCreate$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "webViewData", "", "(Lcom/unity3d/services/core/configuration/Configuration;Ljava/lang/String;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getWebViewData", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements com.unity3d.services.core.domain.task.BaseParams {
        private final com.unity3d.services.core.configuration.Configuration config;
        private final java.lang.String webViewData;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateCreate.Params copy$default(com.unity3d.services.core.domain.task.InitializeStateCreate.Params params, com.unity3d.services.core.configuration.Configuration configuration, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            if ((i & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final java.lang.String getWebViewData() {
            return this.webViewData;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateCreate.Params copy(com.unity3d.services.core.configuration.Configuration config, java.lang.String webViewData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewData, "webViewData");
            return new com.unity3d.services.core.domain.task.InitializeStateCreate.Params(config, webViewData);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.unity3d.services.core.domain.task.InitializeStateCreate.Params)) {
                return false;
            }
            com.unity3d.services.core.domain.task.InitializeStateCreate.Params params = (com.unity3d.services.core.domain.task.InitializeStateCreate.Params) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.config, params.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.webViewData, params.webViewData);
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewData.hashCode();
        }

        public java.lang.String toString() {
            return "Params(config=" + this.config + ", webViewData=" + this.webViewData + ')';
        }

        public Params(com.unity3d.services.core.configuration.Configuration config, java.lang.String webViewData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewData, "webViewData");
            this.config = config;
            this.webViewData = webViewData;
        }

        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        public final java.lang.String getWebViewData() {
            return this.webViewData;
        }
    }
}
