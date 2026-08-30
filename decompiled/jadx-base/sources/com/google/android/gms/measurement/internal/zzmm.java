package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmh zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zzc;

    zzmm(com.google.android.gms.measurement.internal.zzmo zzmoVar, com.google.android.gms.measurement.internal.zzmh zzmhVar, long j) {
        this.zza = zzmhVar;
        this.zzb = j;
        this.zzc = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzmo zzmoVar = this.zzc;
        zzmoVar.zzC(this.zza, false, this.zzb);
        zzmoVar.zza = null;
        zzmoVar.zzu.zzu().zzS(null);
    }
}
