package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdow {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzava zzb;
    private final com.google.android.gms.internal.ads.zzbds zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final com.google.android.gms.internal.ads.zzbbj zzf;
    private final com.google.android.gms.internal.ads.zzcyl zzg;
    private final com.google.android.gms.internal.ads.zzebv zzh;
    private final com.google.android.gms.internal.ads.zzfcn zzi;

    public zzdow(com.google.android.gms.internal.ads.zzcfk zzcfkVar, android.content.Context context, com.google.android.gms.internal.ads.zzava zzavaVar, com.google.android.gms.internal.ads.zzbds zzbdsVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, com.google.android.gms.internal.ads.zzbbj zzbbjVar, com.google.android.gms.internal.ads.zzcyl zzcylVar, com.google.android.gms.internal.ads.zzebv zzebvVar, com.google.android.gms.internal.ads.zzfcn zzfcnVar) {
        this.zza = context;
        this.zzb = zzavaVar;
        this.zzc = zzbdsVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbjVar;
        this.zzg = zzcylVar;
        this.zzh = zzebvVar;
        this.zzi = zzfcnVar;
    }

    public final com.google.android.gms.internal.ads.zzcex zza(com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzfbr zzfbrVar) throws com.google.android.gms.internal.ads.zzcfj {
        com.google.android.gms.internal.ads.zzcgr zzcgrVarZzc = com.google.android.gms.internal.ads.zzcgr.zzc(zzsVar);
        java.lang.String str = zzsVar.zza;
        com.google.android.gms.internal.ads.zzdol zzdolVar = new com.google.android.gms.internal.ads.zzdol(this);
        com.google.android.gms.internal.ads.zzebv zzebvVar = this.zzh;
        com.google.android.gms.internal.ads.zzfcn zzfcnVar = this.zzi;
        com.google.android.gms.ads.internal.zza zzaVar = this.zze;
        com.google.android.gms.internal.ads.zzbbj zzbbjVar = this.zzf;
        return com.google.android.gms.internal.ads.zzcfk.zza(this.zza, zzcgrVarZzc, str, false, false, this.zzb, this.zzc, this.zzd, null, zzdolVar, zzaVar, zzbbjVar, zzfboVar, zzfbrVar, zzebvVar, zzfcnVar);
    }
}
