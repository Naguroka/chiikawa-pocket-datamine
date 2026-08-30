package com.google.firebase.sessions.api;

/* JADX INFO: compiled from: SessionSubscriber.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\r\u000eJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "isDataCollectionEnabled", "", "()Z", "sessionSubscriberName", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "onSessionChanged", "", "sessionDetails", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SessionSubscriber {

    /* JADX INFO: compiled from: SessionSubscriber.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    com.google.firebase.sessions.api.SessionSubscriber.Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(com.google.firebase.sessions.api.SessionSubscriber.SessionDetails sessionDetails);

    /* JADX INFO: compiled from: SessionSubscriber.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SessionDetails {
        private final java.lang.String sessionId;

        public static /* synthetic */ com.google.firebase.sessions.api.SessionSubscriber.SessionDetails copy$default(com.google.firebase.sessions.api.SessionSubscriber.SessionDetails sessionDetails, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getSessionId() {
            return this.sessionId;
        }

        public final com.google.firebase.sessions.api.SessionSubscriber.SessionDetails copy(java.lang.String sessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return new com.google.firebase.sessions.api.SessionSubscriber.SessionDetails(sessionId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.google.firebase.sessions.api.SessionSubscriber.SessionDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, ((com.google.firebase.sessions.api.SessionSubscriber.SessionDetails) other).sessionId);
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public java.lang.String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }

        public SessionDetails(java.lang.String sessionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public final java.lang.String getSessionId() {
            return this.sessionId;
        }
    }
}
