package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\t\u001a\u00020\u0002H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateComplete;", "Lcom/unity3d/services/core/domain/task/MetricTask;", "Lcom/unity3d/services/core/domain/task/InitializeStateComplete$Params;", "", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;)V", "doWork", "Lkotlin/Result;", "params", "doWork-gIAlu-s", "(Lcom/unity3d/services/core/domain/task/InitializeStateComplete$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMetricName", "", "Params", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class InitializeStateComplete extends com.unity3d.services.core.domain.task.MetricTask<com.unity3d.services.core.domain.task.InitializeStateComplete.Params, kotlin.Unit> {
    private final com.unity3d.services.core.domain.ISDKDispatchers dispatchers;

    @Override // com.unity3d.services.core.domain.task.BaseTask
    /* JADX INFO: renamed from: doWork-gIAlu-s */
    public /* bridge */ /* synthetic */ java.lang.Object mo1218doWorkgIAlus(com.unity3d.services.core.domain.task.BaseParams baseParams, kotlin.coroutines.Continuation continuation) {
        return m1225doWorkgIAlus((com.unity3d.services.core.domain.task.InitializeStateComplete.Params) baseParams, (kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>>) continuation);
    }

    public InitializeStateComplete(com.unity3d.services.core.domain.ISDKDispatchers dispatchers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.dispatchers = dispatchers;
    }

    @Override // com.unity3d.services.core.domain.task.MetricTask
    public java.lang.String getMetricName() {
        return getMetricNameForInitializeTask("completion");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    public java.lang.Object m1225doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateComplete.Params params, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> continuation) {
        com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1 initializeStateComplete$doWork$1;
        if (continuation instanceof com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1) {
            initializeStateComplete$doWork$1 = (com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1) continuation;
            if ((initializeStateComplete$doWork$1.label & Integer.MIN_VALUE) != 0) {
                initializeStateComplete$doWork$1.label -= Integer.MIN_VALUE;
            } else {
                initializeStateComplete$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1(this, continuation);
            }
        } else {
            initializeStateComplete$doWork$1 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1(this, continuation);
        }
        java.lang.Object objWithContext = initializeStateComplete$doWork$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = initializeStateComplete$doWork$1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(objWithContext);
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = this.dispatchers.getDefault();
            com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2 initializeStateComplete$doWork$2 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2(params, null);
            initializeStateComplete$doWork$1.label = 1;
            objWithContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, initializeStateComplete$doWork$2, initializeStateComplete$doWork$1);
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

    /* JADX INFO: compiled from: InitializeStateComplete.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializeStateComplete$Params;", "Lcom/unity3d/services/core/domain/task/BaseParams;", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Params implements com.unity3d.services.core.domain.task.BaseParams {
        private final com.unity3d.services.core.configuration.Configuration config;

        public static /* synthetic */ com.unity3d.services.core.domain.task.InitializeStateComplete.Params copy$default(com.unity3d.services.core.domain.task.InitializeStateComplete.Params params, com.unity3d.services.core.configuration.Configuration configuration, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.unity3d.services.core.configuration.Configuration getConfig() {
            return this.config;
        }

        public final com.unity3d.services.core.domain.task.InitializeStateComplete.Params copy(com.unity3d.services.core.configuration.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
            return new com.unity3d.services.core.domain.task.InitializeStateComplete.Params(config);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.unity3d.services.core.domain.task.InitializeStateComplete.Params) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.unity3d.services.core.domain.task.InitializeStateComplete.Params) other).config);
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
}
