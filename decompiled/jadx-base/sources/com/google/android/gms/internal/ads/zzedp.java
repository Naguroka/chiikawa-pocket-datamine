package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzedp implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcoa zzb;

    zzedp(android.content.Context context, com.google.android.gms.internal.ads.zzcoa zzcoaVar) {
        this.zza = context;
        this.zzb = zzcoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        com.google.android.gms.internal.ads.zzefb zzefbVar = new com.google.android.gms.internal.ads.zzefb(zzfboVar, (com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb, com.google.android.gms.ads.AdFormat.APP_OPEN_AD);
        com.google.android.gms.internal.ads.zzcnx zzcnxVarZza = this.zzb.zza(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdeu(zzefbVar, null), new com.google.android.gms.internal.ads.zzcny(zzfboVar.zzaa));
        zzefbVar.zzb(zzcnxVarZza.zzc());
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzcnxVarZza.zzj());
        return zzcnxVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        try {
            ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzq(zzfboVar.zzZ);
            ((com.google.android.gms.internal.ads.zzbrd) zzeczVar.zzb).zzi(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza), new com.google.android.gms.internal.ads.zzedn(zzeczVar, null), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new com.google.android.gms.internal.ads.zzfcq(e);
        }
    }
}
