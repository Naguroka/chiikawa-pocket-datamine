package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzqb implements com.google.android.gms.internal.measurement.zzqa {
    public static final com.google.android.gms.internal.measurement.zzki zza;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzd("measurement.id.upload_controller_wait_initialization", 0L);
        zza = zzkfVarZza.zzf("measurement.upload_controller.wait_initialization", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzqa
    public final boolean zza() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }
}
