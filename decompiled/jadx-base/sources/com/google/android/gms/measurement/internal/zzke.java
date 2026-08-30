package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzke {
    final android.content.Context zza;
    java.lang.String zzb;
    java.lang.String zzc;
    java.lang.String zzd;
    java.lang.Boolean zze;
    long zzf;
    com.google.android.gms.internal.measurement.zzdh zzg;
    boolean zzh;
    final java.lang.Long zzi;
    java.lang.String zzj;

    public zzke(android.content.Context context, com.google.android.gms.internal.measurement.zzdh zzdhVar, java.lang.Long l) {
        this.zzh = true;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzdhVar != null) {
            this.zzg = zzdhVar;
            this.zzb = zzdhVar.zzf;
            this.zzc = zzdhVar.zze;
            this.zzd = zzdhVar.zzd;
            this.zzh = zzdhVar.zzc;
            this.zzf = zzdhVar.zzb;
            this.zzj = zzdhVar.zzh;
            android.os.Bundle bundle = zzdhVar.zzg;
            if (bundle != null) {
                this.zze = java.lang.Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
