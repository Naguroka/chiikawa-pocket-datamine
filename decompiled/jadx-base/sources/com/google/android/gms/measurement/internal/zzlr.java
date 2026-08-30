package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjx zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzd;

    zzlr(com.google.android.gms.measurement.internal.zzlw zzlwVar, com.google.android.gms.measurement.internal.zzjx zzjxVar, long j, boolean z) {
        this.zza = zzjxVar;
        this.zzb = j;
        this.zzc = z;
        this.zzd = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzlw zzlwVar = this.zzd;
        com.google.android.gms.measurement.internal.zzjx zzjxVar = this.zza;
        zzlwVar.zzaj(zzjxVar);
        com.google.android.gms.measurement.internal.zzlw.zzD(zzlwVar, zzjxVar, this.zzb, true, this.zzc);
    }
}
