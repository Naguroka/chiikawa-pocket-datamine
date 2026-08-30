package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzat implements android.app.Application.ActivityLifecycleCallbacks {
    final /* synthetic */ com.google.android.gms.internal.games_v2.zzau zza;
    private final android.app.Application zzb;
    private boolean zzc = false;

    /* synthetic */ zzat(com.google.android.gms.internal.games_v2.zzau zzauVar, android.app.Application application, com.google.android.gms.internal.games_v2.zzas zzasVar) {
        this.zza = zzauVar;
        this.zzb = application;
    }

    static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.games_v2.zzat zzatVar) {
        if (zzatVar.zzc) {
            return;
        }
        zzatVar.zzb.registerActivityLifecycleCallbacks(zzatVar);
        zzatVar.zzc = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        this.zzb.unregisterActivityLifecycleCallbacks(this);
        if (this.zzc) {
            this.zzc = false;
            com.google.android.gms.internal.games_v2.zzez.zza("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.zza.zzc.zza();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }
}
