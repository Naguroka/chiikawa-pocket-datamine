package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpp implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ android.os.Bundle zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpq zzd;

    zzpp(com.google.android.gms.measurement.internal.zzpq zzpqVar, java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        this.zzd = zzpqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzpv zzpvVar = this.zzd.zza;
        com.google.android.gms.measurement.internal.zzqf zzqfVarZzB = zzpvVar.zzB();
        long jCurrentTimeMillis = zzpvVar.zzaU().currentTimeMillis();
        java.lang.String str = this.zza;
        zzpvVar.zzT((com.google.android.gms.measurement.internal.zzbh) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzqfVarZzB.zzC(str, this.zzb, this.zzc, "auto", jCurrentTimeMillis, false, true)), str);
    }
}
