package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzedl implements com.google.android.gms.internal.ads.zzedc {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcoa zzb;
    private final java.util.concurrent.Executor zzc;

    zzedl(android.content.Context context, com.google.android.gms.internal.ads.zzcoa zzcoaVar, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = zzcoaVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ java.lang.Object zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, final com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq, com.google.android.gms.internal.ads.zzegu {
        com.google.android.gms.internal.ads.zzcnx zzcnxVarZza = this.zzb.zza(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new com.google.android.gms.internal.ads.zzdeu(new com.google.android.gms.internal.ads.zzdgc() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, android.content.Context context, com.google.android.gms.internal.ads.zzcwg zzcwgVar) throws com.google.android.gms.internal.ads.zzdgb {
                com.google.android.gms.internal.ads.zzecz zzeczVar2 = zzeczVar;
                try {
                    ((com.google.android.gms.internal.ads.zzfdh) zzeczVar2.zzb).zzv(z);
                    ((com.google.android.gms.internal.ads.zzfdh) zzeczVar2.zzb).zzw(context);
                } catch (com.google.android.gms.internal.ads.zzfcq e) {
                    throw new com.google.android.gms.internal.ads.zzdgb(e.getCause());
                }
            }
        }, null), new com.google.android.gms.internal.ads.zzcny(zzfboVar.zzaa));
        zzcnxVarZza.zzd().zzo(new com.google.android.gms.internal.ads.zzcma((com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb), this.zzc);
        ((com.google.android.gms.internal.ads.zzees) zzeczVar.zzc).zzc(zzcnxVarZza.zzk());
        return zzcnxVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzecz zzeczVar) throws com.google.android.gms.internal.ads.zzfcq {
        com.google.android.gms.internal.ads.zzfdh zzfdhVar = (com.google.android.gms.internal.ads.zzfdh) zzeczVar.zzb;
        com.google.android.gms.internal.ads.zzfcj zzfcjVar = zzfcaVar.zza.zza;
        java.lang.String string = zzfboVar.zzv.toString();
        zzfdhVar.zzl(this.zza, zzfcjVar.zzd, string, (com.google.android.gms.internal.ads.zzbpk) zzeczVar.zzc);
    }
}
