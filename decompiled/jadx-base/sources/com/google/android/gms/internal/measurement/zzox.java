package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzox implements com.google.android.gms.internal.measurement.zzow {
    public static final com.google.android.gms.internal.measurement.zzki zza;
    public static final com.google.android.gms.internal.measurement.zzki zzb;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zzkfVarZza.zzf("measurement.admob_plus_removal.client.dev", false);
        zzb = zzkfVarZza.zzf("measurement.admob_plus_removal.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzow
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzow
    public final boolean zzb() {
        return ((java.lang.Boolean) zzb.zzb()).booleanValue();
    }
}
