package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbnx {
    private final java.lang.Object zza = new java.lang.Object();
    private final java.lang.Object zzb = new java.lang.Object();
    private com.google.android.gms.internal.ads.zzbog zzc;
    private com.google.android.gms.internal.ads.zzbog zzd;

    private static final android.content.Context zzc(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final com.google.android.gms.internal.ads.zzbog zza(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        com.google.android.gms.internal.ads.zzbog zzbogVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.internal.ads.zzbog(zzc(context), versionInfoParcel, (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zza), zzfhkVar);
            }
            zzbogVar = this.zzc;
        }
        return zzbogVar;
    }

    public final com.google.android.gms.internal.ads.zzbog zzb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        com.google.android.gms.internal.ads.zzbog zzbogVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new com.google.android.gms.internal.ads.zzbog(zzc(context), versionInfoParcel, (java.lang.String) com.google.android.gms.internal.ads.zzbev.zza.zze(), zzfhkVar);
            }
            zzbogVar = this.zzd;
        }
        return zzbogVar;
    }
}
