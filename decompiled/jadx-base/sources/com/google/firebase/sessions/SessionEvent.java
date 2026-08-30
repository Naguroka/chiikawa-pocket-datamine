package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionEvent.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/SessionEvent;", "", "eventType", "Lcom/google/firebase/sessions/EventType;", "sessionData", "Lcom/google/firebase/sessions/SessionInfo;", "applicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Lcom/google/firebase/sessions/EventType;Lcom/google/firebase/sessions/SessionInfo;Lcom/google/firebase/sessions/ApplicationInfo;)V", "getApplicationInfo", "()Lcom/google/firebase/sessions/ApplicationInfo;", "getEventType", "()Lcom/google/firebase/sessions/EventType;", "getSessionData", "()Lcom/google/firebase/sessions/SessionInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@com.google.firebase.encoders.annotations.Encodable
public final /* data */ class SessionEvent {
    private final com.google.firebase.sessions.ApplicationInfo applicationInfo;
    private final com.google.firebase.sessions.EventType eventType;
    private final com.google.firebase.sessions.SessionInfo sessionData;

    public static /* synthetic */ com.google.firebase.sessions.SessionEvent copy$default(com.google.firebase.sessions.SessionEvent sessionEvent, com.google.firebase.sessions.EventType eventType, com.google.firebase.sessions.SessionInfo sessionInfo, com.google.firebase.sessions.ApplicationInfo applicationInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            eventType = sessionEvent.eventType;
        }
        if ((i & 2) != 0) {
            sessionInfo = sessionEvent.sessionData;
        }
        if ((i & 4) != 0) {
            applicationInfo = sessionEvent.applicationInfo;
        }
        return sessionEvent.copy(eventType, sessionInfo, applicationInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final com.google.firebase.sessions.EventType getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.google.firebase.sessions.SessionInfo getSessionData() {
        return this.sessionData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.google.firebase.sessions.ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public final com.google.firebase.sessions.SessionEvent copy(com.google.firebase.sessions.EventType eventType, com.google.firebase.sessions.SessionInfo sessionData, com.google.firebase.sessions.ApplicationInfo applicationInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        return new com.google.firebase.sessions.SessionEvent(eventType, sessionData, applicationInfo);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.google.firebase.sessions.SessionEvent)) {
            return false;
        }
        com.google.firebase.sessions.SessionEvent sessionEvent = (com.google.firebase.sessions.SessionEvent) other;
        return this.eventType == sessionEvent.eventType && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionData, sessionEvent.sessionData) && kotlin.jvm.internal.Intrinsics.areEqual(this.applicationInfo, sessionEvent.applicationInfo);
    }

    public int hashCode() {
        return (((this.eventType.hashCode() * 31) + this.sessionData.hashCode()) * 31) + this.applicationInfo.hashCode();
    }

    public java.lang.String toString() {
        return "SessionEvent(eventType=" + this.eventType + ", sessionData=" + this.sessionData + ", applicationInfo=" + this.applicationInfo + ')';
    }

    public SessionEvent(com.google.firebase.sessions.EventType eventType, com.google.firebase.sessions.SessionInfo sessionData, com.google.firebase.sessions.ApplicationInfo applicationInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.eventType = eventType;
        this.sessionData = sessionData;
        this.applicationInfo = applicationInfo;
    }

    public final com.google.firebase.sessions.EventType getEventType() {
        return this.eventType;
    }

    public final com.google.firebase.sessions.SessionInfo getSessionData() {
        return this.sessionData;
    }

    public final com.google.firebase.sessions.ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }
}
