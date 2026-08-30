package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqq implements com.google.android.gms.internal.measurement.zzqp {
    public static final com.google.android.gms.internal.measurement.zzki zza;
    public static final com.google.android.gms.internal.measurement.zzki zzb;
    public static final com.google.android.gms.internal.measurement.zzki zzc;
    public static final com.google.android.gms.internal.measurement.zzki zzd;
    public static final com.google.android.gms.internal.measurement.zzki zze;
    public static final com.google.android.gms.internal.measurement.zzki zzf;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzkfVarZza.zzf("measurement.test.boolean_flag", false);
        zzb = zzkfVarZza.zzd("measurement.test.cached_long_flag", -1L);
        zzc = zzkfVarZza.zzc("measurement.test.double_flag", -3.0d);
        zzd = zzkfVarZza.zzd("measurement.test.int_flag", -2L);
        zze = zzkfVarZza.zzd("measurement.test.long_flag", -1L);
        zzf = zzkfVarZza.zze("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final double zza() {
        return ((java.lang.Double) zzc.zzb()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzb() {
        return ((java.lang.Long) zzb.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzc() {
        return ((java.lang.Long) zzd.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final long zzd() {
        return ((java.lang.Long) zze.zzb()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final java.lang.String zze() {
        return (java.lang.String) zzf.zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zzf() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
