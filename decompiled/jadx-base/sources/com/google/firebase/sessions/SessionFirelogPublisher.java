package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisher;", "", "logSession", "", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface SessionFirelogPublisher {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.SessionFirelogPublisher.Companion INSTANCE = com.google.firebase.sessions.SessionFirelogPublisher.Companion.$$INSTANCE;

    void logSession(com.google.firebase.sessions.SessionDetails sessionDetails);

    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisher$Companion;", "", "()V", com.json.j5.p, "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getInstance", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.google.firebase.sessions.SessionFirelogPublisher.Companion $$INSTANCE = new com.google.firebase.sessions.SessionFirelogPublisher.Companion();

        private Companion() {
        }

        public final com.google.firebase.sessions.SessionFirelogPublisher getInstance() {
            return ((com.google.firebase.sessions.FirebaseSessionsComponent) com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).get(com.google.firebase.sessions.FirebaseSessionsComponent.class)).getSessionFirelogPublisher();
        }
    }
}
