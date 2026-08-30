package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lorg/json/JSONObject;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {125, 128, org.objectweb.asm.Opcodes.LXOR, org.objectweb.asm.Opcodes.I2L, 134, 136}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
final class RemoteSettings$updateSettings$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<org.json.JSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ com.google.firebase.sessions.settings.RemoteSettings this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$2$1(com.google.firebase.sessions.settings.RemoteSettings remoteSettings, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1> continuation) {
        super(2, continuation);
        this.this$0 = remoteSettings;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1(this.this$0, continuation);
        remoteSettings$updateSettings$2$1.L$0 = obj;
        return remoteSettings$updateSettings$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(org.json.JSONObject jSONObject, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1) create(jSONObject, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0121  */
    /* JADX WARN: Code duplicated, block: B:52:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0168  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v13, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws org.json.JSONException {
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        java.lang.Boolean bool;
        kotlin.jvm.internal.Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef3;
        kotlin.jvm.internal.Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.Ref.ObjectRef objectRef5;
        java.lang.Integer num;
        com.google.firebase.sessions.settings.SettingsCache settingsCache;
        java.lang.Integer num2;
        java.lang.Double d;
        com.google.firebase.sessions.settings.SettingsCache settingsCache2;
        java.lang.Double d2;
        java.lang.Integer num3;
        kotlin.Unit unit;
        com.google.firebase.sessions.settings.SettingsCache settingsCache3;
        java.lang.Integer num4;
        com.google.firebase.sessions.settings.SettingsCache settingsCache4;
        java.lang.Integer numBoxInt;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                org.json.JSONObject jSONObject = (org.json.JSONObject) this.L$0;
                android.util.Log.d(com.google.firebase.sessions.settings.RemoteSettings.TAG, "Fetched settings: " + jSONObject);
                kotlin.jvm.internal.Ref.ObjectRef objectRef6 = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                kotlin.jvm.internal.Ref.ObjectRef objectRef7 = new kotlin.jvm.internal.Ref.ObjectRef();
                if (jSONObject.has("app_quality")) {
                    java.lang.Object obj2 = jSONObject.get("app_quality");
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
                    try {
                        bool = jSONObject2.has("sessions_enabled") ? (java.lang.Boolean) jSONObject2.get("sessions_enabled") : null;
                        try {
                            if (jSONObject2.has("sampling_rate")) {
                                objectRef6.element = (java.lang.Double) jSONObject2.get("sampling_rate");
                            }
                            if (jSONObject2.has("session_timeout_seconds")) {
                                objectRef.element = (java.lang.Integer) jSONObject2.get("session_timeout_seconds");
                            }
                            if (jSONObject2.has("cache_duration")) {
                                objectRef7.element = (java.lang.Integer) jSONObject2.get("cache_duration");
                            }
                        } catch (org.json.JSONException e) {
                            e = e;
                            android.util.Log.e(com.google.firebase.sessions.settings.RemoteSettings.TAG, "Error parsing the configs remotely fetched: ", e);
                        }
                    } catch (org.json.JSONException e2) {
                        e = e2;
                        bool = null;
                    }
                    break;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings = this.this$0;
                    bool.booleanValue();
                    com.google.firebase.sessions.settings.SettingsCache settingsCache5 = remoteSettings.getSettingsCache();
                    this.L$0 = objectRef6;
                    this.L$1 = objectRef;
                    this.L$2 = objectRef7;
                    this.label = 1;
                    if (settingsCache5.updateSettingsEnabled(bool, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef4 = objectRef6;
                    objectRef5 = objectRef;
                    objectRef3 = objectRef7;
                    objectRef = objectRef5;
                    objectRef2 = objectRef4;
                } else {
                    objectRef2 = objectRef6;
                    objectRef3 = objectRef7;
                }
                num = (java.lang.Integer) objectRef.element;
                if (num != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings2 = this.this$0;
                    num.intValue();
                    settingsCache = remoteSettings2.getSettingsCache();
                    num2 = (java.lang.Integer) objectRef.element;
                    this.L$0 = objectRef2;
                    this.L$1 = objectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    if (settingsCache.updateSessionRestartTimeout(num2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                d = (java.lang.Double) objectRef2.element;
                if (d != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings3 = this.this$0;
                    d.doubleValue();
                    settingsCache2 = remoteSettings3.getSettingsCache();
                    d2 = (java.lang.Double) objectRef2.element;
                    this.L$0 = objectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (settingsCache2.updateSamplingRate(d2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                num3 = (java.lang.Integer) objectRef3.element;
                if (num3 != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings4 = this.this$0;
                    num3.intValue();
                    settingsCache3 = remoteSettings4.getSettingsCache();
                    num4 = (java.lang.Integer) objectRef3.element;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    settingsCache4 = this.this$0.getSettingsCache();
                    numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_MAX);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (this.this$0.getSettingsCache().updateSessionCacheUpdatedTime(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 1:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
                objectRef5 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                objectRef4 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                objectRef = objectRef5;
                objectRef2 = objectRef4;
                num = (java.lang.Integer) objectRef.element;
                if (num != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings5 = this.this$0;
                    num.intValue();
                    settingsCache = remoteSettings5.getSettingsCache();
                    num2 = (java.lang.Integer) objectRef.element;
                    this.L$0 = objectRef2;
                    this.L$1 = objectRef3;
                    this.L$2 = null;
                    this.label = 2;
                    if (settingsCache.updateSessionRestartTimeout(num2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                d = (java.lang.Double) objectRef2.element;
                if (d != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings6 = this.this$0;
                    d.doubleValue();
                    settingsCache2 = remoteSettings6.getSettingsCache();
                    d2 = (java.lang.Double) objectRef2.element;
                    this.L$0 = objectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (settingsCache2.updateSamplingRate(d2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                num3 = (java.lang.Integer) objectRef3.element;
                if (num3 != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings7 = this.this$0;
                    num3.intValue();
                    settingsCache3 = remoteSettings7.getSettingsCache();
                    num4 = (java.lang.Integer) objectRef3.element;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    settingsCache4 = this.this$0.getSettingsCache();
                    numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_MAX);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (this.this$0.getSettingsCache().updateSessionCacheUpdatedTime(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 2:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$1;
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                d = (java.lang.Double) objectRef2.element;
                if (d != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings8 = this.this$0;
                    d.doubleValue();
                    settingsCache2 = remoteSettings8.getSettingsCache();
                    d2 = (java.lang.Double) objectRef2.element;
                    this.L$0 = objectRef3;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    if (settingsCache2.updateSamplingRate(d2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                num3 = (java.lang.Integer) objectRef3.element;
                if (num3 != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings9 = this.this$0;
                    num3.intValue();
                    settingsCache3 = remoteSettings9.getSettingsCache();
                    num4 = (java.lang.Integer) objectRef3.element;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    settingsCache4 = this.this$0.getSettingsCache();
                    numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_MAX);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (this.this$0.getSettingsCache().updateSessionCacheUpdatedTime(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 3:
                objectRef3 = (kotlin.jvm.internal.Ref.ObjectRef) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                num3 = (java.lang.Integer) objectRef3.element;
                if (num3 != null) {
                    com.google.firebase.sessions.settings.RemoteSettings remoteSettings10 = this.this$0;
                    num3.intValue();
                    settingsCache3 = remoteSettings10.getSettingsCache();
                    num4 = (java.lang.Integer) objectRef3.element;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    unit = kotlin.Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    settingsCache4 = this.this$0.getSettingsCache();
                    numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_MAX);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (this.this$0.getSettingsCache().updateSessionCacheUpdatedTime(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 4:
                kotlin.ResultKt.throwOnFailure(obj);
                unit = kotlin.Unit.INSTANCE;
                if (unit == null) {
                    settingsCache4 = this.this$0.getSettingsCache();
                    numBoxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_MAX);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (this.this$0.getSettingsCache().updateSessionCacheUpdatedTime(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 5:
                kotlin.ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 6;
                if (this.this$0.getSettingsCache().updateSessionCacheUpdatedTime(kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return kotlin.Unit.INSTANCE;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
