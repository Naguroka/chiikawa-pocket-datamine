package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzt extends com.google.android.gms.internal.measurement.zzai {
    private final com.google.android.gms.internal.measurement.zzr zza;

    public zzt(com.google.android.gms.internal.measurement.zzr zzrVar) {
        super("internal.logger");
        this.zza = zzrVar;
        this.zze.put("log", new com.google.android.gms.internal.measurement.zzs(this, false, true));
        this.zze.put(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT, new com.google.android.gms.internal.measurement.zzp(this, androidx.core.app.NotificationCompat.GROUP_KEY_SILENT));
        ((com.google.android.gms.internal.measurement.zzai) this.zze.get(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT)).zzr("log", new com.google.android.gms.internal.measurement.zzs(this, true, true));
        this.zze.put("unmonitored", new com.google.android.gms.internal.measurement.zzq(this, "unmonitored"));
        ((com.google.android.gms.internal.measurement.zzai) this.zze.get("unmonitored")).zzr("log", new com.google.android.gms.internal.measurement.zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final com.google.android.gms.internal.measurement.zzap zza(com.google.android.gms.internal.measurement.zzg zzgVar, java.util.List list) {
        return com.google.android.gms.internal.measurement.zzap.zzf;
    }
}
