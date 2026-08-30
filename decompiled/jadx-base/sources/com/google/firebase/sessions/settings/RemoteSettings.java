package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\r\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\b\u0010%\u001a\u00020\u0015H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002J\u0011\u0010)\u001a\u00020#H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "configsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Landroidx/datastore/core/DataStore;)V", "fetchInProgress", "Lkotlinx/coroutines/sync/Mutex;", "samplingRate", "", "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", "", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "getSettingsCache", "()Lcom/google/firebase/sessions/settings/SettingsCache;", "settingsCache$delegate", "Lkotlin/Lazy;", "clearCachedSettings", "", "clearCachedSettings$com_google_firebase_firebase_sessions", "isSettingsStale", "removeForwardSlashesIn", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RemoteSettings implements com.google.firebase.sessions.settings.SettingsProvider {
    private static final com.google.firebase.sessions.settings.RemoteSettings.Companion Companion = new com.google.firebase.sessions.settings.RemoteSettings.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String FORWARD_SLASH_STRING = "/";

    @java.lang.Deprecated
    public static final java.lang.String TAG = "SessionConfigFetcher";
    private final com.google.firebase.sessions.ApplicationInfo appInfo;
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher configsFetcher;
    private final kotlinx.coroutines.sync.Mutex fetchInProgress;
    private final com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi;

    /* JADX INFO: renamed from: settingsCache$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy settingsCache;

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteSettings.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {org.objectweb.asm.Opcodes.TABLESWITCH, 76, 94}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.google.firebase.sessions.settings.RemoteSettings.this.updateSettings(this);
        }
    }

    public RemoteSettings(kotlin.coroutines.CoroutineContext backgroundDispatcher, com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi, com.google.firebase.sessions.ApplicationInfo appInfo, com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher configsFetcher, final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.backgroundDispatcher = backgroundDispatcher;
        this.firebaseInstallationsApi = firebaseInstallationsApi;
        this.appInfo = appInfo;
        this.configsFetcher = configsFetcher;
        this.settingsCache = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.google.firebase.sessions.settings.SettingsCache>() { // from class: com.google.firebase.sessions.settings.RemoteSettings$settingsCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final com.google.firebase.sessions.settings.SettingsCache invoke() {
                return new com.google.firebase.sessions.settings.SettingsCache(dataStore);
            }
        });
        this.fetchInProgress = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.google.firebase.sessions.settings.SettingsCache getSettingsCache() {
        return (com.google.firebase.sessions.settings.SettingsCache) this.settingsCache.getValue();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Boolean getSessionEnabled() {
        return getSettingsCache().sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public kotlin.time.Duration mo885getSessionRestartTimeoutFghU774() {
        java.lang.Integer numSessionRestartTimeout = getSettingsCache().sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m2626boximpl(kotlin.time.DurationKt.toDuration(numSessionRestartTimeout.intValue(), kotlin.time.DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Double getSamplingRate() {
        return getSettingsCache().sessionSamplingRate();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:21:0x004f, B:44:0x00b2, B:46:0x00c0, B:50:0x00cc, B:36:0x008c, B:38:0x0096, B:41:0x00a1), top: B:59:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0158 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public java.lang.Object updateSettings(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) throws java.lang.Throwable {
        com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1 anonymousClass1;
        ?? r2;
        kotlinx.coroutines.sync.Mutex mutex;
        com.google.firebase.sessions.settings.RemoteSettings remoteSettings;
        java.lang.String fid;
        java.util.Map<java.lang.String, java.lang.String> mapMapOf;
        com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        if (continuation instanceof com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1) {
            anonymousClass1 = (com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new com.google.firebase.sessions.settings.RemoteSettings.AnonymousClass1(continuation);
        }
        java.lang.Object objCreate = anonymousClass1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r4 = anonymousClass1.label;
        try {
            if (r4 == 0) {
                kotlin.ResultKt.throwOnFailure(objCreate);
                if (!this.fetchInProgress.isLocked() && !getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                    return kotlin.Unit.INSTANCE;
                }
                kotlinx.coroutines.sync.Mutex mutex2 = this.fetchInProgress;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = mutex2;
                anonymousClass1.label = 1;
                if (mutex2.lock(null, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                remoteSettings = this;
            } else {
                if (r4 != 1) {
                    if (r4 != 2) {
                        if (r4 != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r2 = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(objCreate);
                            r2 = r2;
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            r2.unlock(null);
                            return kotlin.Unit.INSTANCE;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r2.unlock(null);
                            throw th;
                        }
                    }
                    mutex = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
                    remoteSettings = (com.google.firebase.sessions.settings.RemoteSettings) anonymousClass1.L$0;
                    kotlin.ResultKt.throwOnFailure(objCreate);
                    fid = ((com.google.firebase.sessions.InstallationId) objCreate).getFid();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(fid, "")) {
                        android.util.Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String str = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{android.os.Build.MANUFACTURER, android.os.Build.MODEL}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    java.lang.String INCREMENTAL = android.os.Build.VERSION.INCREMENTAL;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                    java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    mapMapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-Crashlytics-Installation-ID", fid), kotlin.TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(str)), kotlin.TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL)), kotlin.TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE)), kotlin.TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
                    android.util.Log.d(TAG, "Fetching settings from server.");
                    crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
                    remoteSettings$updateSettings$2$1 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1(remoteSettings, null);
                    remoteSettings$updateSettings$2$2 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2(null);
                    anonymousClass1.L$0 = mutex;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r2 = mutex;
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    r2.unlock(null);
                    return kotlin.Unit.INSTANCE;
                }
                mutex = (kotlinx.coroutines.sync.Mutex) anonymousClass1.L$1;
                remoteSettings = (com.google.firebase.sessions.settings.RemoteSettings) anonymousClass1.L$0;
                kotlin.ResultKt.throwOnFailure(objCreate);
            }
            if (!remoteSettings.getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions()) {
                android.util.Log.d(TAG, "Remote settings cache not expired. Using cached values.");
                kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                mutex.unlock(null);
                return unit4;
            }
            com.google.firebase.sessions.InstallationId.Companion companion = com.google.firebase.sessions.InstallationId.INSTANCE;
            com.google.firebase.installations.FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.firebaseInstallationsApi;
            anonymousClass1.L$0 = remoteSettings;
            anonymousClass1.L$1 = mutex;
            anonymousClass1.label = 2;
            objCreate = companion.create(firebaseInstallationsApi, anonymousClass1);
            if (objCreate == coroutine_suspended) {
                return coroutine_suspended;
            }
            fid = ((com.google.firebase.sessions.InstallationId) objCreate).getFid();
            if (kotlin.jvm.internal.Intrinsics.areEqual(fid, "")) {
                android.util.Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                mutex.unlock(null);
                return unit5;
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String str2 = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{android.os.Build.MANUFACTURER, android.os.Build.MODEL}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            java.lang.String INCREMENTAL2 = android.os.Build.VERSION.INCREMENTAL;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(INCREMENTAL2, "INCREMENTAL");
            java.lang.String RELEASE2 = android.os.Build.VERSION.RELEASE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
            mapMapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("X-Crashlytics-Installation-ID", fid), kotlin.TuplesKt.to("X-Crashlytics-Device-Model", remoteSettings.removeForwardSlashesIn(str2)), kotlin.TuplesKt.to("X-Crashlytics-OS-Build-Version", remoteSettings.removeForwardSlashesIn(INCREMENTAL2)), kotlin.TuplesKt.to("X-Crashlytics-OS-Display-Version", remoteSettings.removeForwardSlashesIn(RELEASE2)), kotlin.TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.appInfo.getSessionSdkVersion()));
            android.util.Log.d(TAG, "Fetching settings from server.");
            crashlyticsSettingsFetcher = remoteSettings.configsFetcher;
            remoteSettings$updateSettings$2$1 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1(remoteSettings, null);
            remoteSettings$updateSettings$2$2 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2(null);
            anonymousClass1.L$0 = mutex;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            r2 = mutex;
            kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
            r2.unlock(null);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            th = th2;
            r2 = r4;
        }
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return getSettingsCache().hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1(this, null), 3, null);
    }

    private final java.lang.String removeForwardSlashesIn(java.lang.String s) {
        return new kotlin.text.Regex("/").replace(s, "");
    }

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "()V", "FORWARD_SLASH_STRING", "", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
