package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqt implements com.google.android.gms.internal.measurement.zzqs {
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
        zzkfVarZza.zzf("measurement.rb.attribution.ad_campaign_info", true);
        zzkfVarZza.zzf("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        zza = zzkfVarZza.zzf("measurement.rb.attribution.client2", true);
        zzkfVarZza.zzf("measurement.rb.attribution.dma_fix", true);
        zzb = zzkfVarZza.zzf("measurement.rb.attribution.followup1.service", false);
        zzkfVarZza.zzf("measurement.rb.attribution.client.get_trigger_uris_async", true);
        zzc = zzkfVarZza.zzf("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        zzkfVarZza.zzf("measurement.rb.attribution.index_out_of_bounds_fix", true);
        zzd = zzkfVarZza.zzf("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        zze = zzkfVarZza.zzf("measurement.rb.attribution.retry_disposition", false);
        zzf = zzkfVarZza.zzf("measurement.rb.attribution.service", true);
        zzg = zzkfVarZza.zzf("measurement.rb.attribution.enable_trigger_redaction", true);
        zzh = zzkfVarZza.zzf("measurement.rb.attribution.uuid_generation", true);
        zzkfVarZza.zzd("measurement.id.rb.attribution.retry_disposition", 0L);
        zzkfVarZza.zzf("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzb() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzc() {
        return ((java.lang.Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzd() {
        return ((java.lang.Boolean) zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zze() {
        return ((java.lang.Boolean) zzd.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzf() {
        return ((java.lang.Boolean) zze.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzg() {
        return ((java.lang.Boolean) zzf.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzh() {
        return ((java.lang.Boolean) zzg.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqs
    public final boolean zzi() {
        return ((java.lang.Boolean) zzh.zzb()).booleanValue();
    }
}
