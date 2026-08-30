package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcuc implements com.google.android.gms.internal.ads.zzcyq, com.google.android.gms.internal.ads.zzdee {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfcj zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final com.google.android.gms.internal.ads.zzdua zze;
    private final com.google.android.gms.internal.ads.zzfhk zzf;

    public zzcuc(android.content.Context context, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.util.zzg zzgVar, com.google.android.gms.internal.ads.zzdua zzduaVar, com.google.android.gms.internal.ads.zzfhk zzfhkVar) {
        this.zza = context;
        this.zzb = zzfcjVar;
        this.zzc = versionInfoParcel;
        this.zzd = zzgVar;
        this.zze = zzduaVar;
        this.zzf = zzfhkVar;
    }

    private final void zzc() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzeb)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzd;
            android.content.Context context = this.zza;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzc;
            com.google.android.gms.internal.ads.zzfcj zzfcjVar = this.zzb;
            com.google.android.gms.internal.ads.zzfhk zzfhkVar = this.zzf;
            com.google.android.gms.ads.internal.zzv.zza().zzc(context, versionInfoParcel, zzfcjVar.zzf, zzgVar.zzg(), zzfhkVar);
        }
        this.zze.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(com.google.android.gms.internal.ads.zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzec)).booleanValue()) {
            zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(java.lang.String str) {
    }
}
