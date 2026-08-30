package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpa implements com.google.android.gms.internal.measurement.zzoz {
    public static final com.google.android.gms.internal.measurement.zzki zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzkfVarZza.zzf("measurement.chimera.parameter.service", false);
        zzkfVarZza.zzd("measurement.id.chimera_parameter_service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzb() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
