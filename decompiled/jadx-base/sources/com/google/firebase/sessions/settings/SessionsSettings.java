package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: SessionsSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001&B/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB+\b\u0017\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eB\u0015\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001d\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "context", "Landroid/content/Context;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;)V", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;)V", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "samplingRate", "", "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionsEnabled", "", "getSessionsEnabled", "()Z", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionsSettings {
    private static final java.lang.String TAG = "SessionsSettings";
    private final com.google.firebase.sessions.settings.SettingsProvider localOverrideSettings;
    private final com.google.firebase.sessions.settings.SettingsProvider remoteSettings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.google.firebase.sessions.settings.SessionsSettings.Companion INSTANCE = new com.google.firebase.sessions.settings.SessionsSettings.Companion(null);
    private static final kotlin.properties.ReadOnlyProperty<android.content.Context, androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>> dataStore$delegate = androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore$default(com.google.firebase.sessions.SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), new androidx.datastore.core.handlers.ReplaceFileCorruptionHandler(new kotlin.jvm.functions.Function1<androidx.datastore.core.CorruptionException, androidx.datastore.preferences.core.Preferences>() { // from class: com.google.firebase.sessions.settings.SessionsSettings$Companion$dataStore$2
        @Override // kotlin.jvm.functions.Function1
        public final androidx.datastore.preferences.core.Preferences invoke(androidx.datastore.core.CorruptionException ex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "ex");
            android.util.Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', ex);
            return androidx.datastore.preferences.core.PreferencesFactory.createEmpty();
        }
    }), null, null, 12, null);

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionsSettings.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {org.objectweb.asm.Opcodes.I2B, org.objectweb.asm.Opcodes.I2C}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.google.firebase.sessions.settings.SessionsSettings.this.updateSettings(this);
        }
    }

    private final boolean isValidSamplingRate(double samplingRate) {
        return 0.0d <= samplingRate && samplingRate <= 1.0d;
    }

    public SessionsSettings(com.google.firebase.sessions.settings.SettingsProvider localOverrideSettings, com.google.firebase.sessions.settings.SettingsProvider remoteSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.localOverrideSettings = localOverrideSettings;
        this.remoteSettings = remoteSettings;
    }

    private SessionsSettings(android.content.Context context, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.CoroutineContext coroutineContext2, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.sessions.ApplicationInfo applicationInfo) {
        this(new com.google.firebase.sessions.settings.LocalOverrideSettings(context), new com.google.firebase.sessions.settings.RemoteSettings(coroutineContext2, firebaseInstallationsApi, applicationInfo, new com.google.firebase.sessions.settings.RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null), INSTANCE.getDataStore(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @javax.inject.Inject
    public SessionsSettings(com.google.firebase.FirebaseApp firebaseApp, @com.google.firebase.annotations.concurrent.Blocking kotlin.coroutines.CoroutineContext blockingDispatcher, @com.google.firebase.annotations.concurrent.Background kotlin.coroutines.CoroutineContext backgroundDispatcher, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        android.content.Context applicationContext = firebaseApp.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        this(applicationContext, blockingDispatcher, backgroundDispatcher, firebaseInstallationsApi, com.google.firebase.sessions.SessionEvents.INSTANCE.getApplicationInfo(firebaseApp));
    }

    public final boolean getSessionsEnabled() {
        java.lang.Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        java.lang.Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    public final double getSamplingRate() {
        java.lang.Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        java.lang.Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m887getSessionRestartTimeoutUwyO8pc() {
        kotlin.time.Duration durationMo885getSessionRestartTimeoutFghU774 = this.localOverrideSettings.mo885getSessionRestartTimeoutFghU774();
        if (durationMo885getSessionRestartTimeoutFghU774 != null) {
            long rawValue = durationMo885getSessionRestartTimeoutFghU774.getRawValue();
            if (m886isValidSessionRestartTimeoutLRDsOJo(rawValue)) {
                return rawValue;
            }
        }
        kotlin.time.Duration durationMo885getSessionRestartTimeoutFghU775 = this.remoteSettings.mo885getSessionRestartTimeoutFghU774();
        if (durationMo885getSessionRestartTimeoutFghU775 != null) {
            long rawValue2 = durationMo885getSessionRestartTimeoutFghU775.getRawValue();
            if (m886isValidSessionRestartTimeoutLRDsOJo(rawValue2)) {
                return rawValue2;
            }
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.DurationKt.toDuration(30, kotlin.time.DurationUnit.MINUTES);
    }

    /* JADX INFO: renamed from: isValidSessionRestartTimeout-LRDsOJo, reason: not valid java name */
    private final boolean m886isValidSessionRestartTimeoutLRDsOJo(long sessionRestartTimeout) {
        return kotlin.time.Duration.m2662isPositiveimpl(sessionRestartTimeout) && kotlin.time.Duration.m2657isFiniteimpl(sessionRestartTimeout);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1 anonymousClass1;
        com.google.firebase.sessions.settings.SessionsSettings sessionsSettings;
        if (continuation instanceof com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1) {
            anonymousClass1 = (com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.google.firebase.sessions.settings.SessionsSettings.AnonymousClass1(continuation);
        }
        java.lang.Object obj = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.google.firebase.sessions.settings.SettingsProvider settingsProvider = this.localOverrideSettings;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (settingsProvider.updateSettings(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            sessionsSettings = this;
        } else {
            if (i == 1) {
                sessionsSettings = (com.google.firebase.sessions.settings.SessionsSettings) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }
        com.google.firebase.sessions.settings.SettingsProvider settingsProvider2 = sessionsSettings.remoteSettings;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (settingsProvider2.updateSettings(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: compiled from: SessionsSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "()V", "TAG", "", com.json.j5.p, "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] $$delegatedProperties = {kotlin.jvm.internal.Reflection.property2(new kotlin.jvm.internal.PropertyReference2Impl(com.google.firebase.sessions.settings.SessionsSettings.Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.google.firebase.sessions.settings.SessionsSettings getInstance() {
            return ((com.google.firebase.sessions.FirebaseSessionsComponent) com.google.firebase.FirebaseKt.getApp(com.google.firebase.Firebase.INSTANCE).get(com.google.firebase.sessions.FirebaseSessionsComponent.class)).getSessionsSettings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context context) {
            return (androidx.datastore.core.DataStore) com.google.firebase.sessions.settings.SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }
    }
}
