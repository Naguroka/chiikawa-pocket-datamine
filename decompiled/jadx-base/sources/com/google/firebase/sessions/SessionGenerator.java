package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "uuidGenerator", "Lkotlin/Function0;", "Ljava/util/UUID;", "(Lcom/google/firebase/sessions/TimeProvider;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "Lcom/google/firebase/sessions/SessionDetails;", "currentSession", "getCurrentSession", "()Lcom/google/firebase/sessions/SessionDetails;", "firstSessionId", "", "hasGenerateSession", "", "getHasGenerateSession", "()Z", "sessionIndex", "", "generateNewSession", "generateSessionId", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionGenerator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.SessionGenerator.Companion INSTANCE = new com.google.firebase.sessions.SessionGenerator.Companion(null);
    private com.google.firebase.sessions.SessionDetails currentSession;
    private final java.lang.String firstSessionId;
    private int sessionIndex;
    private final com.google.firebase.sessions.TimeProvider timeProvider;
    private final kotlin.jvm.functions.Function0<java.util.UUID> uuidGenerator;

    public SessionGenerator(com.google.firebase.sessions.TimeProvider timeProvider, kotlin.jvm.functions.Function0<java.util.UUID> uuidGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionGenerator$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionGenerator.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<java.util.UUID> {
        public static final com.google.firebase.sessions.SessionGenerator.AnonymousClass1 INSTANCE = new com.google.firebase.sessions.SessionGenerator.AnonymousClass1();

        AnonymousClass1() {
            super(0, java.util.UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.util.UUID invoke() {
            return java.util.UUID.randomUUID();
        }
    }

    public /* synthetic */ SessionGenerator(com.google.firebase.sessions.TimeProvider timeProvider, com.google.firebase.sessions.SessionGenerator.AnonymousClass1 anonymousClass1, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider, (i & 2) != 0 ? com.google.firebase.sessions.SessionGenerator.AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final com.google.firebase.sessions.SessionDetails getCurrentSession() {
        com.google.firebase.sessions.SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("currentSession");
        return null;
    }

    public final boolean getHasGenerateSession() {
        return this.currentSession != null;
    }

    public final com.google.firebase.sessions.SessionDetails generateNewSession() {
        this.sessionIndex++;
        this.currentSession = new com.google.firebase.sessions.SessionDetails(this.sessionIndex == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    private final java.lang.String generateSessionId() {
        java.lang.String string = this.uuidGenerator.invoke().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "uuidGenerator().toString()");
        java.lang.String lowerCase = kotlin.text.StringsKt.replace$default(string, "-", "", false, 4, (java.lang.Object) null).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    /* JADX INFO: compiled from: SessionGenerator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator$Companion;", "", "()V", com.json.j5.p, "Lcom/google/firebase/sessions/SessionGenerator;", "getInstance", "()Lcom/google/firebase/sessions/SessionGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.google.firebase.sessions.SessionGenerator getInstance() {
            return ((com.google.firebase.sessions.FirebaseSessionsComponent) com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).get(com.google.firebase.sessions.FirebaseSessionsComponent.class)).getSessionGenerator();
        }
    }
}
