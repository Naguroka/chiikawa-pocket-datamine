package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpg implements com.google.android.gms.internal.measurement.zzpf {
    public static final com.google.android.gms.internal.measurement.zzki zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.client.3p_consent_state_v1", true);
        zzkfVarZza.zzf("measurement.service.consent_state_v1_W36", true);
        zza = zzkfVarZza.zzd("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpf
    public final long zza() {
        return ((java.lang.Long) zza.zzb()).longValue();
    }
}
