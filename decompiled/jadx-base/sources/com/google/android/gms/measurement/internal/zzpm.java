package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpm implements com.google.android.gms.measurement.internal.zzhg {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpz zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzc;

    zzpm(com.google.android.gms.measurement.internal.zzpv zzpvVar, java.lang.String str, com.google.android.gms.measurement.internal.zzpz zzpzVar) {
        this.zza = str;
        this.zzb = zzpzVar;
        this.zzc = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void zza(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        this.zzc.zzZ(this.zza, i, th, bArr, this.zzb);
    }
}
