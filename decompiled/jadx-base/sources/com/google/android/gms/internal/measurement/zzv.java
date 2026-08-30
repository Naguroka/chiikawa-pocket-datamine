package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzz zza;

    public zzv(com.google.android.gms.internal.measurement.zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        com.google.android.gms.internal.measurement.zzh.zzh(this.zzd, 3, list);
        java.lang.String strZzi = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(0)).zzi();
        com.google.android.gms.internal.measurement.zzap zzapVarZzb = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(1));
        if (!(zzapVarZzb instanceof com.google.android.gms.internal.measurement.zzao)) {
            throw new java.lang.IllegalArgumentException("Invalid callback type");
        }
        com.google.android.gms.internal.measurement.zzap zzapVarZzb2 = zzgVar.zzb((com.google.android.gms.internal.measurement.zzap) list.get(2));
        if (!(zzapVarZzb2 instanceof com.google.android.gms.internal.measurement.zzam)) {
            throw new java.lang.IllegalArgumentException("Invalid callback params");
        }
        com.google.android.gms.internal.measurement.zzam zzamVar = (com.google.android.gms.internal.measurement.zzam) zzapVarZzb2;
        if (!zzamVar.zzt("type")) {
            throw new java.lang.IllegalArgumentException("Undefined rule type");
        }
        this.zza.zza(strZzi, zzamVar.zzt(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY) ? com.google.android.gms.internal.measurement.zzh.zzb(zzamVar.zzf(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zzh().doubleValue()) : 1000, (com.google.android.gms.internal.measurement.zzao) zzapVarZzb, zzamVar.zzf("type").zzi());
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }
}
