package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$Params;", "Lcom/unity3d/services/core/configuration/Configuration;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "Params", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ConfigFileFromLocalStorage extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params, com.unity3d.services.core.configuration.Configuration> {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo1218doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m1221doWorkgIAlus((com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>>) continuation);
    }

    public ConfigFileFromLocalStorage(com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask("read_local_config");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public java.lang.Object m1221doWorkgIAlus(com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage.Params params, kotlin.coroutines.Continuation<? super kotlin.Result<? extends com.unity3d.services.core.configuration.Configuration>> continuation) {
        com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1 configFileFromLocalStorage$doWork$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1) {
            configFileFromLocalStorage$doWork$1 = (com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1) continuation;
            if ((configFileFromLocalStorage$doWork$1.label & Integer.MIN_VALUE) != 0) {
                configFileFromLocalStorage$doWork$1.label -= Integer.MIN_VALUE;
            } else {
                configFileFromLocalStorage$doWork$1 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1(this, continuation);
            }
        } else {
            configFileFromLocalStorage$doWork$1 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$1(this, continuation);
        }
        java.lang.Object objWithContext = configFileFromLocalStorage$doWork$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = configFileFromLocalStorage$doWork$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher io = this.dispatchers.getIo();
            com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2 configFileFromLocalStorage$doWork$2 = new com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage$doWork$2(params, null);
            configFileFromLocalStorage$doWork$1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(io, configFileFromLocalStorage$doWork$2, configFileFromLocalStorage$doWork$1);
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

    /* JADX INFO: compiled from: ConfigFileFromLocalStorage.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/services/core/domain/task/ConfigFileFromLocalStorage$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "defaultConfiguration", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getDefaultConfiguration", "()Lcom/unity3d/services/core/configuration/Configuration;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Params implements com.unity3d.services.core.domain.task.BaseParams {
        private final com.unity3d.services.core.configuration.Configuration defaultConfiguration;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Params(com.unity3d.services.core.configuration.Configuration defaultConfiguration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultConfiguration, "defaultConfiguration");
            this.defaultConfiguration = defaultConfiguration;
        }

        public /* synthetic */ Params(com.unity3d.services.core.configuration.Configuration configuration, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.unity3d.services.core.configuration.Configuration() : configuration);
        }

        public final com.unity3d.services.core.configuration.Configuration getDefaultConfiguration() {
            return this.defaultConfiguration;
        }
    }
}
