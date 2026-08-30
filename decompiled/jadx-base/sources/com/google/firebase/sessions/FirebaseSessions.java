package com.google.firebase.sessions;

/* JADX INFO: compiled from: FirebaseSessions.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", "", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "settings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "lifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FirebaseSessions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.FirebaseSessions.Companion INSTANCE = new com.google.firebase.sessions.FirebaseSessions.Companion(null);
    private static final java.lang.String TAG = "FirebaseSessions";
    private final com.google.firebase.FirebaseApp firebaseApp;
    private final com.google.firebase.sessions.settings.SessionsSettings settings;

    @javax.inject.Inject
    public FirebaseSessions(com.google.firebase.FirebaseApp firebaseApp, com.google.firebase.sessions.settings.SessionsSettings settings, @com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher, com.google.firebase.sessions.SessionLifecycleServiceBinder lifecycleServiceBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(settings, "settings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleServiceBinder, "lifecycleServiceBinder");
        this.firebaseApp = firebaseApp;
        this.settings = settings;
        android.util.Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        android.content.Context applicationContext = firebaseApp.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof android.app.Application) {
            ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new com.google.firebase.sessions.FirebaseSessions.AnonymousClass1(backgroundDispatcher, lifecycleServiceBinder, null), 3, null);
        } else {
            android.util.Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.FirebaseSessions$1, reason: invalid class name */
    /* JADX INFO: compiled from: FirebaseSessions.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", i = {}, l = {51, 55}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.coroutines.CoroutineContext $backgroundDispatcher;
        final /* synthetic */ com.google.firebase.sessions.SessionLifecycleServiceBinder $lifecycleServiceBinder;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.coroutines.CoroutineContext coroutineContext, com.google.firebase.sessions.SessionLifecycleServiceBinder sessionLifecycleServiceBinder, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.FirebaseSessions.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$backgroundDispatcher = coroutineContext;
            this.$lifecycleServiceBinder = sessionLifecycleServiceBinder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.FirebaseSessions.this.new AnonymousClass1(this.$backgroundDispatcher, this.$lifecycleServiceBinder, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.FirebaseSessions.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0084  */
        /* JADX WARN: Code duplicated, block: B:32:0x008a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (!com.google.firebase.sessions.FirebaseSessions.this.settings.getSessionsEnabled()) {
                    android.util.Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                } else {
                    com.google.firebase.sessions.SessionLifecycleClient sessionLifecycleClient = new com.google.firebase.sessions.SessionLifecycleClient(this.$backgroundDispatcher);
                    sessionLifecycleClient.bindToService(this.$lifecycleServiceBinder);
                    com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(sessionLifecycleClient);
                    com.google.firebase.sessions.FirebaseSessions.this.firebaseApp.addLifecycleEventListener(new com.google.firebase.FirebaseAppLifecycleListener() { // from class: com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0
                        @Override // com.google.firebase.FirebaseAppLifecycleListener
                        public final void onDeleted(java.lang.String str, com.google.firebase.FirebaseOptions firebaseOptions) {
                            com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend$lambda$1(str, firebaseOptions);
                        }
                    });
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            java.util.Collection collectionValues = ((java.util.Map) obj).values();
            if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                java.util.Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    if (((com.google.firebase.sessions.api.SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                        z = false;
                        break;
                    }
                }
            }
            if (!z) {
                this.label = 2;
                if (com.google.firebase.sessions.FirebaseSessions.this.settings.updateSettings(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!com.google.firebase.sessions.FirebaseSessions.this.settings.getSessionsEnabled()) {
                    android.util.Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events.");
                } else {
                    com.google.firebase.sessions.SessionLifecycleClient sessionLifecycleClient2 = new com.google.firebase.sessions.SessionLifecycleClient(this.$backgroundDispatcher);
                    sessionLifecycleClient2.bindToService(this.$lifecycleServiceBinder);
                    com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(sessionLifecycleClient2);
                    com.google.firebase.sessions.FirebaseSessions.this.firebaseApp.addLifecycleEventListener(new com.google.firebase.FirebaseAppLifecycleListener() { // from class: com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0
                        @Override // com.google.firebase.FirebaseAppLifecycleListener
                        public final void onDeleted(java.lang.String str, com.google.firebase.FirebaseOptions firebaseOptions) {
                            com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend$lambda$1(str, firebaseOptions);
                        }
                    });
                }
            } else {
                android.util.Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events.");
            }
            return kotlin.Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(java.lang.String str, com.google.firebase.FirebaseOptions firebaseOptions) {
            android.util.Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient(null);
        }
    }

    /* JADX INFO: compiled from: FirebaseSessions.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", "", "()V", "TAG", "", com.json.j5.p, "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.google.firebase.sessions.FirebaseSessions getInstance() {
            java.lang.Object obj = com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).get(com.google.firebase.sessions.FirebaseSessions.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[FirebaseSessions::class.java]");
            return (com.google.firebase.sessions.FirebaseSessions) obj;
        }
    }
}
