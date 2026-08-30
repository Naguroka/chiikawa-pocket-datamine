package com.google.firebase.sessions.settings;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SettingsCache$removeConfigs$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.datastore.preferences.core.MutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ com.google.firebase.sessions.settings.SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsCache$removeConfigs$2(com.google.firebase.sessions.settings.SettingsCache settingsCache, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2> continuation) {
        super(2, continuation);
        this.this$0 = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2(this.this$0, continuation);
        settingsCache$removeConfigs$2.L$0 = obj;
        return settingsCache$removeConfigs$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.datastore.preferences.core.MutablePreferences mutablePreferences, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2) create(mutablePreferences, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.datastore.preferences.core.MutablePreferences mutablePreferences = (androidx.datastore.preferences.core.MutablePreferences) this.L$0;
        mutablePreferences.clear();
        this.this$0.updateSessionConfigs(mutablePreferences);
        return kotlin.Unit.INSTANCE;
    }
}
