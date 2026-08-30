package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbg implements com.google.android.gms.internal.measurement.zzbf {
    private final com.google.android.gms.internal.measurement.zzg zza;
    private final java.lang.String zzb;

    public zzbg(com.google.android.gms.internal.measurement.zzg zzgVar, java.lang.String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbf
    public final com.google.android.gms.internal.measurement.zzg zza(com.google.android.gms.internal.measurement.zzap zzapVar) {
        com.google.android.gms.internal.measurement.zzg zzgVar = this.zza;
        zzgVar.zze(this.zzb, zzapVar);
        return zzgVar;
    }
}
