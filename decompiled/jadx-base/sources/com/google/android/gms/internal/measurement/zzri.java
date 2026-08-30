package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzri implements com.google.android.gms.internal.measurement.zzrh {
    public static final com.google.android.gms.internal.measurement.zzki zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.client.sessions.background_sessions_enabled", true);
        zza = zzkfVarZza.zzf("measurement.client.sessions.enable_fix_background_engagement", false);
        zzkfVarZza.zzf("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzkfVarZza.zzf("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zzkfVarZza.zzf("measurement.client.sessions.session_id_enabled", true);
        zzkfVarZza.zzd("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrh
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
