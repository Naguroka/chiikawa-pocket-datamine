package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0016J/\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001b\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "sessionConfigs", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "hasCacheExpired", "", "hasCacheExpired$com_google_firebase_firebase_sessions", "removeConfigs", "", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionRestartTimeout", "", "()Ljava/lang/Integer;", "sessionSamplingRate", "", "()Ljava/lang/Double;", "sessionsEnabled", "()Ljava/lang/Boolean;", "updateConfigValue", "T", com.ironsource.y8.h.W, "Landroidx/datastore/preferences/core/Preferences$Key;", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSamplingRate", "rate", "(Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionCacheDuration", "cacheDurationInSeconds", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionCacheUpdatedTime", "cacheUpdatedTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionConfigs", "preferences", "updateSessionRestartTimeout", "timeoutInSeconds", "updateSettingsEnabled", "enabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SettingsCache {

    @java.lang.Deprecated
    public static final java.lang.String TAG = "SettingsCache";
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore;
    private com.google.firebase.sessions.settings.SessionConfigs sessionConfigs;
    private static final com.google.firebase.sessions.settings.SettingsCache.Companion Companion = new com.google.firebase.sessions.settings.SettingsCache.Companion(null);
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> SESSIONS_ENABLED = androidx.datastore.preferences.core.PreferencesKeys.booleanKey(com.google.firebase.sessions.settings.LocalOverrideSettings.SESSIONS_ENABLED);
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> SAMPLING_RATE = androidx.datastore.preferences.core.PreferencesKeys.doubleKey(com.google.firebase.sessions.settings.LocalOverrideSettings.SAMPLING_RATE);
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> RESTART_TIMEOUT_SECONDS = androidx.datastore.preferences.core.PreferencesKeys.intKey("firebase_sessions_restart_timeout");
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> CACHE_DURATION_SECONDS = androidx.datastore.preferences.core.PreferencesKeys.intKey("firebase_sessions_cache_duration");
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> CACHE_UPDATED_TIME = androidx.datastore.preferences.core.PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {119}, m = "updateConfigValue", n = {}, s = {})
    static final class C15241<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int label;
        /* synthetic */ java.lang.Object result;

        C15241(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache.C15241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return com.google.firebase.sessions.settings.SettingsCache.this.updateConfigValue(null, null, this);
        }
    }

    public SettingsCache(androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore) throws java.lang.InterruptedException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dataStore = dataStore;
        kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.google.firebase.sessions.settings.SettingsCache.AnonymousClass1(null), 1, null);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        java.lang.Object L$0;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache.AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.settings.SettingsCache.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.settings.SettingsCache.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.google.firebase.sessions.settings.SettingsCache settingsCache;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                com.google.firebase.sessions.settings.SettingsCache settingsCache2 = com.google.firebase.sessions.settings.SettingsCache.this;
                this.L$0 = settingsCache2;
                this.label = 1;
                java.lang.Object objFirst = kotlinx.coroutines.flow.FlowKt.first(settingsCache2.dataStore.getData(), this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingsCache = settingsCache2;
                obj = objFirst;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (com.google.firebase.sessions.settings.SettingsCache) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            settingsCache.updateSessionConfigs(((androidx.datastore.preferences.core.Preferences) obj).toPreferences());
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSessionConfigs(androidx.datastore.preferences.core.Preferences preferences) {
        this.sessionConfigs = new com.google.firebase.sessions.settings.SessionConfigs((java.lang.Boolean) preferences.get(SESSIONS_ENABLED), (java.lang.Double) preferences.get(SAMPLING_RATE), (java.lang.Integer) preferences.get(RESTART_TIMEOUT_SECONDS), (java.lang.Integer) preferences.get(CACHE_DURATION_SECONDS), (java.lang.Long) preferences.get(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        com.google.firebase.sessions.settings.SessionConfigs sessionConfigs = this.sessionConfigs;
        com.google.firebase.sessions.settings.SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        java.lang.Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        com.google.firebase.sessions.settings.SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        java.lang.Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (java.lang.System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    public final java.lang.Boolean sessionsEnabled() {
        com.google.firebase.sessions.settings.SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    public final java.lang.Double sessionSamplingRate() {
        com.google.firebase.sessions.settings.SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    public final java.lang.Integer sessionRestartTimeout() {
        com.google.firebase.sessions.settings.SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    public final java.lang.Object updateSettingsEnabled(java.lang.Boolean bool, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, continuation);
        return objUpdateConfigValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object updateSamplingRate(java.lang.Double d, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateConfigValue = updateConfigValue(SAMPLING_RATE, d, continuation);
        return objUpdateConfigValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object updateSessionRestartTimeout(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, continuation);
        return objUpdateConfigValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object updateSessionCacheDuration(java.lang.Integer num, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, continuation);
        return objUpdateConfigValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object updateSessionCacheUpdatedTime(java.lang.Long l, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objUpdateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l, continuation);
        return objUpdateConfigValue == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUpdateConfigValue : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final java.lang.Object removeConfigs$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1 settingsCache$removeConfigs$1;
        if (continuation instanceof com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1) {
            settingsCache$removeConfigs$1 = (com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1) continuation;
            if ((settingsCache$removeConfigs$1.label & Integer.MIN_VALUE) != 0) {
                settingsCache$removeConfigs$1.label -= Integer.MIN_VALUE;
            } else {
                settingsCache$removeConfigs$1 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1(this, continuation);
            }
        } else {
            settingsCache$removeConfigs$1 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1(this, continuation);
        }
        java.lang.Object obj = settingsCache$removeConfigs$1.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = settingsCache$removeConfigs$1.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = this.dataStore;
                com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2(this, null);
                settingsCache$removeConfigs$1.label = 1;
                if (androidx.datastore.preferences.core.PreferencesKt.edit(dataStore, settingsCache$removeConfigs$2, settingsCache$removeConfigs$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.io.IOException e) {
            android.util.Log.w(TAG, "Failed to remove config values: " + e);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final <T> java.lang.Object updateConfigValue(androidx.datastore.preferences.core.Preferences.Key<T> key, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.google.firebase.sessions.settings.SettingsCache.C15241 c15241;
        if (continuation instanceof com.google.firebase.sessions.settings.SettingsCache.C15241) {
            c15241 = (com.google.firebase.sessions.settings.SettingsCache.C15241) continuation;
            if ((c15241.label & Integer.MIN_VALUE) != 0) {
                c15241.label -= Integer.MIN_VALUE;
            } else {
                c15241 = new com.google.firebase.sessions.settings.SettingsCache.C15241(continuation);
            }
        } else {
            c15241 = new com.google.firebase.sessions.settings.SettingsCache.C15241(continuation);
        }
        java.lang.Object obj = c15241.result;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c15241.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore = this.dataStore;
                com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2 anonymousClass2 = new com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2(t, key, this, null);
                c15241.label = 1;
                if (androidx.datastore.preferences.core.PreferencesKt.edit(dataStore, anonymousClass2, c15241) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
        } catch (java.io.IOException e) {
            android.util.Log.w(TAG, "Failed to update cache config value: " + e);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2, reason: invalid class name */
    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ androidx.datastore.preferences.core.Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(T t, androidx.datastore.preferences.core.Preferences.Key<T> key, com.google.firebase.sessions.settings.SettingsCache settingsCache, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2> continuation) {
            super(2, continuation);
            this.$value = t;
            this.$key = key;
            this.this$0 = settingsCache;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2 anonymousClass2 = new com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2(this.$value, this.$key, this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(androidx.datastore.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.settings.SettingsCache.AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.datastore.preferences.core.MutablePreferences mutablePreferences = (androidx.datastore.preferences.core.MutablePreferences) this.L$0;
            T t = this.$value;
            if (t != 0) {
                mutablePreferences.set(this.$key, t);
            } else {
                mutablePreferences.remove(this.$key);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache$Companion;", "", "()V", "CACHE_DURATION_SECONDS", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getCACHE_DURATION_SECONDS", "()Landroidx/datastore/preferences/core/Preferences$Key;", "CACHE_UPDATED_TIME", "", "getCACHE_UPDATED_TIME", "RESTART_TIMEOUT_SECONDS", "getRESTART_TIMEOUT_SECONDS", "SAMPLING_RATE", "", "getSAMPLING_RATE", "SESSIONS_ENABLED", "", "getSESSIONS_ENABLED", "TAG", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getSESSIONS_ENABLED() {
            return com.google.firebase.sessions.settings.SettingsCache.SESSIONS_ENABLED;
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> getSAMPLING_RATE() {
            return com.google.firebase.sessions.settings.SettingsCache.SAMPLING_RATE;
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getRESTART_TIMEOUT_SECONDS() {
            return com.google.firebase.sessions.settings.SettingsCache.RESTART_TIMEOUT_SECONDS;
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> getCACHE_DURATION_SECONDS() {
            return com.google.firebase.sessions.settings.SettingsCache.CACHE_DURATION_SECONDS;
        }

        public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> getCACHE_UPDATED_TIME() {
            return com.google.firebase.sessions.settings.SettingsCache.CACHE_UPDATED_TIME;
        }
    }
}
