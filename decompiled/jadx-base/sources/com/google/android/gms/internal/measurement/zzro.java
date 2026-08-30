package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzro implements com.google.android.gms.internal.measurement.zzrn {
    public static final com.google.android.gms.internal.measurement.zzki zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzkfVarZza.zzf("measurement.tcf.consent_fix", false);
        zzkfVarZza.zzf("measurement.tcf.client", true);
        zzkfVarZza.zzd("measurement.id.tcf", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrn
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
