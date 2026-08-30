package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbj extends com.google.android.gms.internal.measurement.zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final com.google.android.gms.internal.measurement.zzap zza(java.lang.String str, com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Command not found: %s", str));
        }
        com.google.android.gms.internal.measurement.zzap zzapVarZzd = zzgVar.zzd(str);
        if (zzapVarZzd instanceof com.google.android.gms.internal.measurement.zzai) {
            return ((com.google.android.gms.internal.measurement.zzai) zzapVarZzd).zza(zzgVar, list);
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Function %s is not defined", str));
    }
}
