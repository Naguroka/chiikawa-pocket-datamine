package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzayr implements com.google.android.gms.internal.ads.zzayw {
    final /* synthetic */ android.app.Activity zza;

    zzayr(com.google.android.gms.internal.ads.zzayx zzayxVar, android.app.Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzayw
    public final void zza(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.zza);
    }
}
