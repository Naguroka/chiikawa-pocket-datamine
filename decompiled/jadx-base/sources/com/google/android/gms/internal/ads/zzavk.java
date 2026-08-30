package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzavk implements com.google.android.gms.internal.ads.zzavr {
    final /* synthetic */ android.app.Activity zza;
    final /* synthetic */ android.os.Bundle zzb;

    zzavk(com.google.android.gms.internal.ads.zzavs zzavsVar, android.app.Activity activity, android.os.Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zza(android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.zza, this.zzb);
    }
}
