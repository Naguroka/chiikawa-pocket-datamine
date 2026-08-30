package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzehd implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final java.util.concurrent.Executor zzb;
    private final com.google.android.gms.internal.ads.zzdof zzc;

    public zzehd(android.content.Context context, java.util.concurrent.Executor executor, com.google.android.gms.internal.ads.zzdof zzdofVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdofVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        com.google.android.gms.internal.ads.zzdob zzdobVarZze = this.zzc.zze(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdoc(new com.google.android.gms.internal.ads.zzdgc() { // from class: com.google.android.gms.internal.ads.zzehc
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
                com.google.android.gms.internal.ads.zzecz zzeczVar2 = zzeczVar;
                try {
                    ((com.google.android.gms.internal.ads.zzfdh) zzeczVar2.zzb).zzv(z);
                    ((com.google.android.gms.internal.ads.zzfdh) zzeczVar2.zzb).zzz(context);
                } catch (com.google.android.gms.internal.ads.zzfcq e) {
                    throw new com.google.android.gms.internal.ads.zzdgb(e.getCause());
                }
            }
        }));
        zzdobVarZze.zzd().zzo(new com.google.android.gms.internal.ads.zzcma((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb), this.zzb);
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzdobVarZze.zzn());
        return zzdobVarZze.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        try {
            com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
            if (zzfcjVar.zzo.zza == 3) {
                ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzr(this.zza, zzfcjVar.zzd, zzfboVar.zzv.toString(), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
            } else {
                ((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb).zzq(this.zza, zzfcjVar.zzd, zzfboVar.zzv.toString(), (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to load ad from adapter ".concat(java.lang.String.valueOf(zzeczVar.zza)), e);
        }
    }
}
