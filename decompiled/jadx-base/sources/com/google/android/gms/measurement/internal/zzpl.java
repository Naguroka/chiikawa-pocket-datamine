package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzpl implements com.google.android.gms.measurement.internal.zzhg {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.util.List zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpv zzc;

    zzpl(com.google.android.gms.measurement.internal.zzpv zzpvVar, java.lang.String str, java.util.List list) {
        this.zza = str;
        this.zzb = list;
        this.zzc = zzpvVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzhg
    public final void zza(java.lang.String str, int i, java.lang.Throwable th, byte[] bArr, java.util.Map map) {
        this.zzc.zzY(true, i, th, bArr, this.zza, this.zzb);
    }
}
