package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqk implements com.google.android.gms.internal.measurement.zzqj {
    public static final com.google.android.gms.internal.measurement.zzki zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.gmscore_feature_tracking", true);
        zza = zzkfVarZza.zzf("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqj
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
