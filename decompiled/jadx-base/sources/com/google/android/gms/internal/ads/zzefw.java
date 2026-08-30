package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzefw implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzdgq zzb;
    private com.google.android.gms.internal.ads.zzbpt zzc;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzd;

    public zzefw(android.content.Context context, com.google.android.gms.internal.ads.zzdgq zzdgqVar, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdgqVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        if (!zzfcaVar.zza.zza.zzg.contains(java.lang.Integer.toString(6))) {
            throw new com.google.android.gms.internal.ads.zzegu(2, "Unified must be used for RTB.");
        }
        com.google.android.gms.internal.ads.zzdif zzdifVarZzt = com.google.android.gms.internal.ads.zzdif.zzt(this.zzc);
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
        if (!zzfcjVar.zzg.contains(java.lang.Integer.toString(zzdifVarZzt.zzc()))) {
            throw new com.google.android.gms.internal.ads.zzegu(1, "No corresponding native ad listener");
        }
        com.google.android.gms.internal.ads.zzdih zzdihVarZze = this.zzb.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdir(zzdifVarZzt), new com.google.android.gms.internal.ads.zzdkk(null, null, this.zzc));
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzdihVarZze.zzj());
        return zzdihVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        try {
            ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzq(zzfboVar.zzZ);
            com.google.android.gms.internal.ads.zzefv zzefvVar = null;
            if (this.zzd.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzbP)).intValue()) {
                ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzm(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzefu(this, zzeczVar, zzefvVar), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
            } else {
                ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzn(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzefu(this, zzeczVar, zzefvVar), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc, zzfcaVar.zza.zza.zzi);
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.internal.ads.zzfcq(e);
        }
    }
}
