package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastore;", "", "getCurrentSessionId", "", "updateSessionId", "", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SessionDatastore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.SessionDatastore.Companion INSTANCE = com.google.firebase.sessions.SessionDatastore.Companion.$$INSTANCE;

    java.lang.String getCurrentSessionId();

    void updateSessionId(java.lang.String sessionId);

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastore$Companion;", "", "()V", com.json.j5.p, "Lcom/google/firebase/sessions/SessionDatastore;", "getInstance", "()Lcom/google/firebase/sessions/SessionDatastore;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.google.firebase.sessions.SessionDatastore.Companion $$INSTANCE = new com.google.firebase.sessions.SessionDatastore.Companion();

        private Companion() {
        }

        public final com.google.firebase.sessions.SessionDatastore getInstance() {
            return ((com.google.firebase.sessions.FirebaseSessionsComponent) com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).get(com.google.firebase.sessions.FirebaseSessionsComponent.class)).getSessionDatastore();
        }
    }
}
