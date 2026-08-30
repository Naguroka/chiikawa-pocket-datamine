package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhf {
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final android.os.Bundle zzd;

    public zzhf(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = bundle;
        this.zzc = j;
    }

    public static com.google.android.gms.measurement.internal.zzhf zzb(com.google.android.gms.measurement.internal.zzbh zzbhVar) {
        return new com.google.android.gms.measurement.internal.zzhf(zzbhVar.zza, zzbhVar.zzc, zzbhVar.zzb.zzc(), zzbhVar.zzd);
    }

    public final java.lang.String toString() {
        return "origin=" + this.zzb + ",name=" + this.zza + ",params=" + this.zzd.toString();
    }

    public final com.google.android.gms.measurement.internal.zzbh zza() {
        return new com.google.android.gms.measurement.internal.zzbh(this.zza, new com.google.android.gms.measurement.internal.zzbf(new android.os.Bundle(this.zzd)), this.zzb, this.zzc);
    }
}
