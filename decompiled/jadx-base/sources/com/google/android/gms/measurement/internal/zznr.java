package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zznr implements java.lang.Runnable {
    final /* synthetic */ android.content.ComponentName zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznx zzb;

    zznr(com.google.android.gms.measurement.internal.zznx zznxVar, android.content.ComponentName componentName) {
        this.zza = componentName;
        this.zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzny.zzx(this.zzb.zza, this.zza);
    }
}
