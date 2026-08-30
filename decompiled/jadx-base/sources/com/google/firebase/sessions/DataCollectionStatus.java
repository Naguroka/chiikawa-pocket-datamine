package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "performance", "Lcom/google/firebase/sessions/DataCollectionState;", "crashlytics", "sessionSamplingRate", "", "(Lcom/google/firebase/sessions/DataCollectionState;Lcom/google/firebase/sessions/DataCollectionState;D)V", "getCrashlytics", "()Lcom/google/firebase/sessions/DataCollectionState;", "getPerformance", "getSessionSamplingRate", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DataCollectionStatus {
    private final com.google.firebase.sessions.DataCollectionState crashlytics;
    private final com.google.firebase.sessions.DataCollectionState performance;
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        this(null, null, 0.0d, 7, null);
    }

    public static /* synthetic */ com.google.firebase.sessions.DataCollectionStatus copy$default(com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus, com.google.firebase.sessions.DataCollectionState dataCollectionState, com.google.firebase.sessions.DataCollectionState dataCollectionState2, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dataCollectionState = dataCollectionStatus.performance;
        }
        if ((i & 2) != 0) {
            dataCollectionState2 = dataCollectionStatus.crashlytics;
        }
        if ((i & 4) != 0) {
            d = dataCollectionStatus.sessionSamplingRate;
        }
        return dataCollectionStatus.copy(dataCollectionState, dataCollectionState2, d);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.google.firebase.sessions.DataCollectionState getPerformance() {
        return this.performance;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.google.firebase.sessions.DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final com.google.firebase.sessions.DataCollectionStatus copy(com.google.firebase.sessions.DataCollectionState performance, com.google.firebase.sessions.DataCollectionState crashlytics, double sessionSamplingRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        return new com.google.firebase.sessions.DataCollectionStatus(performance, crashlytics, sessionSamplingRate);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.sessions.DataCollectionStatus)) {
            return false;
        }
        com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus = (com.google.firebase.sessions.DataCollectionStatus) other;
        return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && java.lang.Double.compare(this.sessionSamplingRate, dataCollectionStatus.sessionSamplingRate) == 0;
    }

    public int hashCode() {
        return (((this.performance.hashCode() * 31) + this.crashlytics.hashCode()) * 31) + java.lang.Double.hashCode(this.sessionSamplingRate);
    }

    public java.lang.String toString() {
        return "DataCollectionStatus(performance=" + this.performance + ", crashlytics=" + this.crashlytics + ", sessionSamplingRate=" + this.sessionSamplingRate + ')';
    }

    public DataCollectionStatus(com.google.firebase.sessions.DataCollectionState performance, com.google.firebase.sessions.DataCollectionState crashlytics, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(performance, "performance");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.performance = performance;
        this.crashlytics = crashlytics;
        this.sessionSamplingRate = d;
    }

    public /* synthetic */ DataCollectionStatus(com.google.firebase.sessions.DataCollectionState dataCollectionState, com.google.firebase.sessions.DataCollectionState dataCollectionState2, double d, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i & 2) != 0 ? com.google.firebase.sessions.DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i & 4) != 0 ? 1.0d : d);
    }

    public final com.google.firebase.sessions.DataCollectionState getPerformance() {
        return this.performance;
    }

    public final com.google.firebase.sessions.DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }
}
