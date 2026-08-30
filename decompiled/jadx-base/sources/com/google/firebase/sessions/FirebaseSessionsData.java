package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsData;", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FirebaseSessionsData {
    private final java.lang.String sessionId;

    public static /* synthetic */ com.google.firebase.sessions.FirebaseSessionsData copy$default(com.google.firebase.sessions.FirebaseSessionsData firebaseSessionsData, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = firebaseSessionsData.sessionId;
        }
        return firebaseSessionsData.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getSessionId() {
        return this.sessionId;
    }

    public final com.google.firebase.sessions.FirebaseSessionsData copy(java.lang.String sessionId) {
        return new com.google.firebase.sessions.FirebaseSessionsData(sessionId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.google.firebase.sessions.FirebaseSessionsData) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionId, ((com.google.firebase.sessions.FirebaseSessionsData) other).sessionId);
    }

    public int hashCode() {
        java.lang.String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "FirebaseSessionsData(sessionId=" + this.sessionId + ')';
    }

    public FirebaseSessionsData(java.lang.String str) {
        this.sessionId = str;
    }

    public final java.lang.String getSessionId() {
        return this.sessionId;
    }
}
