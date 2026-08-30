package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0011\u0010\u0016\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "attemptLoggingSessionEvent", "", "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "logSession", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "shouldCollectEvents", "", "shouldLogSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionFirelogPublisherImpl implements com.google.firebase.sessions.SessionFirelogPublisher {
    private static final java.lang.String TAG = "SessionFirelogPublisher";
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final com.google.firebase.sessions.EventGDTLoggerInterface eventGDTLogger;
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations;
    private final com.google.firebase.sessions.settings.SessionsSettings sessionSettings;
    private static final double randomValueForSampling = java.lang.Math.random();

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", i = {0}, l = {100}, m = "shouldLogSession", n = {"this"}, s = {"L$0"})
    static final class C15231 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C15231(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionFirelogPublisherImpl.C15231> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.google.firebase.sessions.SessionFirelogPublisherImpl.this.shouldLogSession(this);
        }
    }

    @javax.inject.Inject
    public SessionFirelogPublisherImpl(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallations, com.google.firebase.sessions.settings.SessionsSettings sessionSettings, com.google.firebase.sessions.EventGDTLoggerInterface eventGDTLogger, @com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", i = {2}, l = {69, 70, 76}, m = "invokeSuspend", n = {"installationId"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.google.firebase.sessions.SessionDetails $sessionDetails;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        java.lang.Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.google.firebase.sessions.SessionDetails sessionDetails, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$sessionDetails = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.SessionFirelogPublisherImpl.this.new AnonymousClass1(this.$sessionDetails, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.google.firebase.sessions.InstallationId installationId;
            com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            com.google.firebase.sessions.SessionEvents sessionEvents;
            com.google.firebase.FirebaseApp firebaseApp;
            com.google.firebase.sessions.SessionDetails sessionDetails;
            com.google.firebase.sessions.settings.SessionsSettings sessionsSettings;
            java.lang.Object registeredSubscribers$com_google_firebase_firebase_sessions;
            com.google.firebase.sessions.SessionEvents sessionEvents2;
            com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl2;
            com.google.firebase.sessions.settings.SessionsSettings sessionsSettings2;
            com.google.firebase.FirebaseApp firebaseApp2;
            com.google.firebase.sessions.SessionDetails sessionDetails2;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    installationId = (com.google.firebase.sessions.InstallationId) obj;
                    sessionFirelogPublisherImpl = com.google.firebase.sessions.SessionFirelogPublisherImpl.this;
                    sessionEvents = com.google.firebase.sessions.SessionEvents.INSTANCE;
                    firebaseApp = com.google.firebase.sessions.SessionFirelogPublisherImpl.this.firebaseApp;
                    sessionDetails = this.$sessionDetails;
                    sessionsSettings = com.google.firebase.sessions.SessionFirelogPublisherImpl.this.sessionSettings;
                    this.L$0 = installationId;
                    this.L$1 = sessionFirelogPublisherImpl;
                    this.L$2 = sessionEvents;
                    this.L$3 = firebaseApp;
                    this.L$4 = sessionDetails;
                    this.L$5 = sessionsSettings;
                    this.label = 3;
                    registeredSubscribers$com_google_firebase_firebase_sessions = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                    if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionEvents2 = sessionEvents;
                    sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl;
                    sessionsSettings2 = sessionsSettings;
                    firebaseApp2 = firebaseApp;
                    obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                    sessionDetails2 = sessionDetails;
                } else {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.firebase.sessions.settings.SessionsSettings sessionsSettings3 = (com.google.firebase.sessions.settings.SessionsSettings) this.L$5;
                    com.google.firebase.sessions.SessionDetails sessionDetails3 = (com.google.firebase.sessions.SessionDetails) this.L$4;
                    com.google.firebase.FirebaseApp firebaseApp3 = (com.google.firebase.FirebaseApp) this.L$3;
                    com.google.firebase.sessions.SessionEvents sessionEvents3 = (com.google.firebase.sessions.SessionEvents) this.L$2;
                    com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) this.L$1;
                    installationId = (com.google.firebase.sessions.InstallationId) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl3;
                    sessionsSettings2 = sessionsSettings3;
                    sessionEvents2 = sessionEvents3;
                    sessionDetails2 = sessionDetails3;
                    firebaseApp2 = firebaseApp3;
                }
                sessionFirelogPublisherImpl2.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, (java.util.Map) obj, installationId.getFid(), installationId.getAuthToken()));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.google.firebase.sessions.SessionFirelogPublisherImpl.this.shouldLogSession(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                this.label = 2;
                obj = com.google.firebase.sessions.InstallationId.INSTANCE.create(com.google.firebase.sessions.SessionFirelogPublisherImpl.this.firebaseInstallations, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                installationId = (com.google.firebase.sessions.InstallationId) obj;
                sessionFirelogPublisherImpl = com.google.firebase.sessions.SessionFirelogPublisherImpl.this;
                sessionEvents = com.google.firebase.sessions.SessionEvents.INSTANCE;
                firebaseApp = com.google.firebase.sessions.SessionFirelogPublisherImpl.this.firebaseApp;
                sessionDetails = this.$sessionDetails;
                sessionsSettings = com.google.firebase.sessions.SessionFirelogPublisherImpl.this.sessionSettings;
                this.L$0 = installationId;
                this.L$1 = sessionFirelogPublisherImpl;
                this.L$2 = sessionEvents;
                this.L$3 = firebaseApp;
                this.L$4 = sessionDetails;
                this.L$5 = sessionsSettings;
                this.label = 3;
                registeredSubscribers$com_google_firebase_firebase_sessions = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sessionEvents2 = sessionEvents;
                sessionFirelogPublisherImpl2 = sessionFirelogPublisherImpl;
                sessionsSettings2 = sessionsSettings;
                firebaseApp2 = firebaseApp;
                obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                sessionDetails2 = sessionDetails;
                sessionFirelogPublisherImpl2.attemptLoggingSessionEvent(sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, (java.util.Map) obj, installationId.getFid(), installationId.getAuthToken()));
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(com.google.firebase.sessions.SessionDetails sessionDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new com.google.firebase.sessions.SessionFirelogPublisherImpl.AnonymousClass1(sessionDetails, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(com.google.firebase.sessions.SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            android.util.Log.d(TAG, "Successfully logged Session Start event.");
        } catch (java.lang.RuntimeException e) {
            android.util.Log.e(TAG, "Error logging Session Start event to DataTransport: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object shouldLogSession(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.google.firebase.sessions.SessionFirelogPublisherImpl.C15231 c15231;
        com.google.firebase.sessions.SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
        if (continuation instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.C15231) {
            c15231 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.C15231) continuation;
            if ((c15231.label & Integer.MIN_VALUE) != 0) {
                c15231.label -= Integer.MIN_VALUE;
            } else {
                c15231 = new com.google.firebase.sessions.SessionFirelogPublisherImpl.C15231(continuation);
            }
        } else {
            c15231 = new com.google.firebase.sessions.SessionFirelogPublisherImpl.C15231(continuation);
        }
        java.lang.Object obj = c15231.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c15231.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.util.Log.d(TAG, "Data Collection is enabled for at least one Subscriber");
            com.google.firebase.sessions.settings.SessionsSettings sessionsSettings = this.sessionSettings;
            c15231.L$0 = this;
            c15231.label = 1;
            if (sessionsSettings.updateSettings(c15231) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sessionFirelogPublisherImpl = this;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionFirelogPublisherImpl = (com.google.firebase.sessions.SessionFirelogPublisherImpl) c15231.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!sessionFirelogPublisherImpl.sessionSettings.getSessionsEnabled()) {
            android.util.Log.d(TAG, "Sessions SDK disabled. Events will not be sent.");
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        if (!sessionFirelogPublisherImpl.shouldCollectEvents()) {
            android.util.Log.d(TAG, "Sessions SDK has dropped this session due to sampling.");
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }
}
