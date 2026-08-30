package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzrl implements com.google.android.gms.internal.measurement.zzrk {
    public static final com.google.android.gms.internal.measurement.zzki zza;
    public static final com.google.android.gms.internal.measurement.zzki zzb;
    public static final com.google.android.gms.internal.measurement.zzki zzc;
    public static final com.google.android.gms.internal.measurement.zzki zzd;
    public static final com.google.android.gms.internal.measurement.zzki zze;
    public static final com.google.android.gms.internal.measurement.zzki zzf;
    public static final com.google.android.gms.internal.measurement.zzki zzg;
    public static final com.google.android.gms.internal.measurement.zzki zzh;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzkfVarZza.zzf("measurement.sgtm.client.scion_upload_action", true);
        zzb = zzkfVarZza.zzf("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        zzc = zzkfVarZza.zzf("measurement.sgtm.google_signal.enable", true);
        zzkfVarZza.zzf("measurement.sgtm.no_proxy.client", true);
        zzd = zzkfVarZza.zzf("measurement.sgtm.no_proxy.client2", false);
        zze = zzkfVarZza.zzf("measurement.sgtm.no_proxy.service", false);
        zzkfVarZza.zzf("measurement.sgtm.preview_mode_enabled", true);
        zzkfVarZza.zzf("measurement.sgtm.rollout_percentage_fix", true);
        zzkfVarZza.zzf("measurement.sgtm.service", true);
        zzf = zzkfVarZza.zzf("measurement.sgtm.service.batching_on_backgrounded", false);
        zzg = zzkfVarZza.zzf("measurement.sgtm.upload_queue", true);
        zzh = zzkfVarZza.zzf("measurement.sgtm.upload_on_uninstall", true);
        zzkfVarZza.zzd("measurement.id.sgtm", 0L);
        zzkfVarZza.zzd("measurement.id.sgtm_noproxy", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzb() {
        return ((java.lang.Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzc() {
        return ((java.lang.Boolean) zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzd() {
        return ((java.lang.Boolean) zzd.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zze() {
        return ((java.lang.Boolean) zze.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzf() {
        return ((java.lang.Boolean) zzf.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzg() {
        return ((java.lang.Boolean) zzg.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrk
    public final boolean zzh() {
        return ((java.lang.Boolean) zzh.zzb()).booleanValue();
    }
}
