package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzefd implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdfu zzb;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc;
    private final java.util.concurrent.Executor zzd;

    public zzefd(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, com.google.android.gms.internal.ads.zzdfu zzdfuVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdfuVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        com.google.android.gms.internal.ads.zzder zzderVarZze = this.zzb.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdeu(new com.google.android.gms.internal.ads.zzdgc() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
                this.zza.zzc(zzeczVar, z, context, zzcwgVar);
            }
        }, null));
        zzderVarZze.zzd().zzo(new com.google.android.gms.internal.ads.zzcma((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb), this.zzd);
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzderVarZze.zzk());
        return zzderVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.internal.ads.zzfdh zzfdhVar = (com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb;
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
        java.lang.String string = zzfboVar.zzv.toString();
        java.lang.String strZzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs);
        zzfdhVar.zzo(this.zza, zzfcjVar.zzd, string, strZzm, (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzecz zzeczVar, boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
        try {
            ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzv(z);
            if (this.zzc.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzaS)).intValue()) {
                ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzx();
            } else {
                ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzy(context);
            }
        } catch (com.google.android.gms.internal.ads.zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot show interstitial.");
            throw new com.google.android.gms.internal.ads.zzdgb(e.getCause());
        }
    }
}
