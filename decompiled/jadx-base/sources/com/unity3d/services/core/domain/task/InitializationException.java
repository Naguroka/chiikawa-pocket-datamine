package com.unity3d.services.core.domain.task;

/* JADX INFO: compiled from: InitializationException.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\r\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\f\b\u0002\u0010\u0005\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/unity3d/services/core/domain/task/InitializationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorState", "Lcom/unity3d/services/core/configuration/ErrorState;", "originalException", "config", "Lcom/unity3d/services/core/configuration/Configuration;", "(Lcom/unity3d/services/core/configuration/ErrorState;Ljava/lang/Exception;Lcom/unity3d/services/core/configuration/Configuration;)V", "getConfig", "()Lcom/unity3d/services/core/configuration/Configuration;", "getErrorState", "()Lcom/unity3d/services/core/configuration/ErrorState;", "getOriginalException", "()Ljava/lang/Exception;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InitializationException extends java.lang.Exception {
    private final com.unity3d.services.core.configuration.Configuration config;
    private final com.unity3d.services.core.configuration.ErrorState errorState;
    private final java.lang.Exception originalException;

    public static /* synthetic */ com.unity3d.services.core.domain.task.InitializationException copy$default(com.unity3d.services.core.domain.task.InitializationException initializationException, com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Exception exc, com.unity3d.services.core.configuration.Configuration configuration, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            errorState = initializationException.errorState;
        }
        if ((i & 2) != 0) {
            exc = initializationException.originalException;
        }
        if ((i & 4) != 0) {
            configuration = initializationException.config;
        }
        return initializationException.copy(errorState, exc, configuration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.unity3d.services.core.configuration.ErrorState getErrorState() {
        return this.errorState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.Exception getOriginalException() {
        return this.originalException;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.unity3d.services.core.configuration.Configuration getConfig() {
        return this.config;
    }

    public final com.unity3d.services.core.domain.task.InitializationException copy(com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Exception originalException, com.unity3d.services.core.configuration.Configuration config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorState, "errorState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalException, "originalException");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        return new com.unity3d.services.core.domain.task.InitializationException(errorState, originalException, config);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.services.core.domain.task.InitializationException)) {
            return false;
        }
        com.unity3d.services.core.domain.task.InitializationException initializationException = (com.unity3d.services.core.domain.task.InitializationException) other;
        return this.errorState == initializationException.errorState && kotlin.jvm.internal.Intrinsics.areEqual(this.originalException, initializationException.originalException) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, initializationException.config);
    }

    public int hashCode() {
        return (((this.errorState.hashCode() * 31) + this.originalException.hashCode()) * 31) + this.config.hashCode();
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
        return "InitializationException(errorState=" + this.errorState + ", originalException=" + this.originalException + ", config=" + this.config + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationException(com.unity3d.services.core.configuration.ErrorState errorState, java.lang.Exception originalException, com.unity3d.services.core.configuration.Configuration config) {
        super(originalException);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorState, "errorState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalException, "originalException");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        this.errorState = errorState;
        this.originalException = originalException;
        this.config = config;
    }

    public final com.unity3d.services.core.configuration.Configuration getConfig() {
        return this.config;
    }

    public final com.unity3d.services.core.configuration.ErrorState getErrorState() {
        return this.errorState;
    }

    public final java.lang.Exception getOriginalException() {
        return this.originalException;
    }
}
