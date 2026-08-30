package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzehz implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdof zzc;

    public zzehz(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdof zzdofVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdofVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zze(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) {
        try {
            ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzk(zzfcaVar.zza.zza.zzd, zzfboVar.zzv.toString());
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to load ad from adapter ".concat(java.lang.String.valueOf(zzeczVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        com.google.android.gms.internal.ads.zzdob zzdobVarZze = this.zzc.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdoc(new com.google.android.gms.internal.ads.zzdgc() { // from class: com.google.android.gms.internal.ads.zzehv
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
                com.google.android.gms.internal.ads.zzecz zzeczVar2 = zzeczVar;
                try {
                    ((com.google.android.gms.internal.ads.zzfdh) zzeczVar2.zzb).zzv(z);
                    ((com.google.android.gms.internal.ads.zzfdh) zzeczVar2.zzb).zzA();
                } catch (com.google.android.gms.internal.ads.zzfcq e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot show rewarded video.", e);
                    throw new com.google.android.gms.internal.ads.zzdgb(e.getCause());
                }
            }
        }));
        zzdobVarZze.zzd().zzo(new com.google.android.gms.internal.ads.zzcma((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb), this.zzb);
        com.google.android.gms.internal.ads.zzcxa zzcxaVarZze = zzdobVarZze.zze();
        com.google.android.gms.internal.ads.zzcvr zzcvrVarZzb = zzdobVarZze.zzb();
        ((com.google.android.gms.internal.ads.zzeet) zzeczVar.zzc).zzc(new com.google.android.gms.internal.ads.zzehy(this, zzdobVarZze.zza(), zzcvrVarZzb, zzcxaVarZze, zzdobVarZze.zzg()));
        return zzdobVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        if (((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzC()) {
            zze(zzfcaVar, zzfboVar, zzeczVar);
            return;
        }
        ((com.google.android.gms.internal.ads.zzeet) zzeczVar.zzc).zzd(new com.google.android.gms.internal.ads.zzehx(this, zzfcaVar, zzfboVar, zzeczVar));
        java.lang.Object obj = zzeczVar.zzb;
        android.content.Context context = this.zza;
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
        ((com.google.android.gms.internal.ads.zzfdh) obj).zzh(context, zzfcjVar.zzd, null, (com.google.android.gms.internal.ads.zzbwh) zzeczVar.zzc, zzfboVar.zzv.toString());
    }
}
