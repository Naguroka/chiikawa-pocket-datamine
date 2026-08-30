package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "firebaseAuthenticationToken", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "getEventTimestampUs", "()J", "getFirebaseAuthenticationToken", "()Ljava/lang/String;", "getFirebaseInstallationId", "getFirstSessionId", "getSessionId", "getSessionIndex", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SessionInfo {
    private final com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final java.lang.String firebaseAuthenticationToken;
    private final java.lang.String firebaseInstallationId;
    private final java.lang.String firstSessionId;
    private final java.lang.String sessionId;
    private final int sessionIndex;

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.google.firebase.sessions.DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final java.lang.String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final java.lang.String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final com.google.firebase.sessions.SessionInfo copy(java.lang.String sessionId, java.lang.String firstSessionId, int sessionIndex, long eventTimestampUs, com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus, java.lang.String firebaseInstallationId, java.lang.String firebaseAuthenticationToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new com.google.firebase.sessions.SessionInfo(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.sessions.SessionInfo)) {
            return false;
        }
        com.google.firebase.sessions.SessionInfo sessionInfo = (com.google.firebase.sessions.SessionInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, sessionInfo.sessionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && kotlin.jvm.internal.Intrinsics.areEqual(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && kotlin.jvm.internal.Intrinsics.areEqual(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    public int hashCode() {
        return (((((((((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + java.lang.Integer.hashCode(this.sessionIndex)) * 31) + java.lang.Long.hashCode(this.eventTimestampUs)) * 31) + this.dataCollectionStatus.hashCode()) * 31) + this.firebaseInstallationId.hashCode()) * 31) + this.firebaseAuthenticationToken.hashCode();
    }

    public java.lang.String toString() {
        return "SessionInfo(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", eventTimestampUs=" + this.eventTimestampUs + ", dataCollectionStatus=" + this.dataCollectionStatus + ", firebaseInstallationId=" + this.firebaseInstallationId + ", firebaseAuthenticationToken=" + this.firebaseAuthenticationToken + ')';
    }

    public SessionInfo(java.lang.String sessionId, java.lang.String firstSessionId, int i, long j, com.google.firebase.sessions.DataCollectionStatus dataCollectionStatus, java.lang.String firebaseInstallationId, java.lang.String firebaseAuthenticationToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i;
        this.eventTimestampUs = j;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
        this.firebaseAuthenticationToken = firebaseAuthenticationToken;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final java.lang.String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final com.google.firebase.sessions.DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final java.lang.String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final java.lang.String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }
}
