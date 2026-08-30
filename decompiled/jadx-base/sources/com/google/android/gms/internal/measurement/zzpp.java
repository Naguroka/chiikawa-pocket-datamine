package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzpp implements com.google.android.gms.internal.measurement.zzpo {
    public static final com.google.android.gms.internal.measurement.zzki zza;
    public static final com.google.android.gms.internal.measurement.zzki zzb;

    static {
        com.google.android.gms.internal.measurement.zzkf zzkfVarZza = new com.google.android.gms.internal.measurement.zzkf(com.google.android.gms.internal.measurement.zzjx.zza("com.google.android.gms.measurement")).zzb().zza();
        zzkfVarZza.zzf("measurement.collection.event_safelist", true);
        zza = zzkfVarZza.zzf("measurement.service.store_null_safelist", true);
        zzb = zzkfVarZza.zzf("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzb() {
        return ((java.lang.Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpo
    public final boolean zzc() {
        return ((java.lang.Boolean) zzb.zzb()).booleanValue();
    }
}
