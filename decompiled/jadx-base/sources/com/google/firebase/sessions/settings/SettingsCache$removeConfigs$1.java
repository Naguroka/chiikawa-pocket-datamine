package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {103}, m = "removeConfigs$com_google_firebase_firebase_sessions", n = {}, s = {})
final class SettingsCache$removeConfigs$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsCache$removeConfigs$1(com.google.firebase.sessions.settings.SettingsCache settingsCache, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache$removeConfigs$1> continuation) {
        super(continuation);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
