package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzcfk {
    public static final com.google.android.gms.internal.ads.zzcex zza(final android.content.Context context, final com.google.android.gms.internal.ads.zzcgr zzcgrVar, final java.lang.String str, final boolean z, final boolean z2, final com.google.android.gms.internal.ads.zzava zzavaVar, final com.google.android.gms.internal.ads.zzbds zzbdsVar, final com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzbda zzbdaVar, final com.google.android.gms.ads.internal.zzn zznVar, final com.google.android.gms.ads.internal.zza zzaVar, final com.google.android.gms.internal.ads.zzbbj zzbbjVar, final com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzfbr zzfbrVar, final com.google.android.gms.internal.ads.zzebv zzebvVar, final com.google.android.gms.internal.ads.zzfcn zzfcnVar) throws com.google.android.gms.internal.ads.zzcfj {
        com.google.android.gms.internal.ads.zzbcl.zza(context);
        try {
            final com.google.android.gms.internal.ads.zzbda zzbdaVar2 = null;
            com.google.android.gms.internal.ads.zzfvf zzfvfVar = new com.google.android.gms.internal.ads.zzfvf(context, zzcgrVar, str, z, z2, zzavaVar, zzbdsVar, versionInfoParcel, zzbdaVar2, zznVar, zzaVar, zzbbjVar, zzfboVar, zzfbrVar, zzfcnVar, zzebvVar) { // from class: com.google.android.gms.internal.ads.zzcfg
                public final /* synthetic */ android.content.Context zza;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzcgr zzb;
                public final /* synthetic */ java.lang.String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzava zzf;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzbds zzg;
                public final /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzbbj zzk;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzfbo zzl;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzfbr zzm;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzfcn zzn;
                public final /* synthetic */ com.google.android.gms.internal.ads.zzebv zzo;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbbjVar;
                    this.zzl = zzfboVar;
                    this.zzm = zzfbrVar;
                    this.zzn = zzfcnVar;
                    this.zzo = zzebvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfvf
                public final java.lang.Object zza() {
                    com.google.android.gms.internal.ads.zzcgr zzcgrVar2 = this.zzb;
                    java.lang.String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    com.google.android.gms.internal.ads.zzbbj zzbbjVar2 = this.zzk;
                    boolean z4 = this.zze;
                    com.google.android.gms.internal.ads.zzava zzavaVar2 = this.zzf;
                    com.google.android.gms.internal.ads.zzfbo zzfboVar2 = this.zzl;
                    com.google.android.gms.internal.ads.zzbds zzbdsVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    com.google.android.gms.internal.ads.zzfbr zzfbrVar2 = this.zzm;
                    android.content.Context context2 = this.zza;
                    com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    com.google.android.gms.internal.ads.zzfcn zzfcnVar2 = this.zzn;
                    com.google.android.gms.internal.ads.zzebv zzebvVar2 = this.zzo;
                    try {
                        android.net.TrafficStats.setThreadStatsTag(264);
                        int i = com.google.android.gms.internal.ads.zzcfw.zza;
                        com.google.android.gms.internal.ads.zzcfp zzcfpVar = new com.google.android.gms.internal.ads.zzcfp(new com.google.android.gms.internal.ads.zzcfw(new com.google.android.gms.internal.ads.zzcgq(context2), zzcgrVar2, str2, z3, z4, zzavaVar2, zzbdsVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbbjVar2, zzfboVar2, zzfbrVar2, zzfcnVar2));
                        zzcfpVar.setWebViewClient(com.google.android.gms.ads.internal.zzv.zzr().zzc(zzcfpVar, zzbbjVar2, z4, zzebvVar2));
                        zzcfpVar.setWebChromeClient(new com.google.android.gms.internal.ads.zzcew(zzcfpVar));
                        return zzcfpVar;
                    } finally {
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
            try {
                android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (com.google.android.gms.internal.ads.zzcex) zzfvfVar.zza();
            } finally {
                android.os.StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (java.lang.Throwable th) {
            throw new com.google.android.gms.internal.ads.zzcfj("Webview initialization failed.", th);
        }
    }
}
