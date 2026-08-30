package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeiu implements com.google.android.gms.internal.ads.zzecw {
    private final com.google.android.gms.internal.ads.zzbdg zza;
    private final com.google.android.gms.internal.ads.zzgcs zzb;
    private final com.google.android.gms.internal.ads.zzfgn zzc;
    private final com.google.android.gms.internal.ads.zzejd zzd;

    public zzeiu(com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzbdg zzbdgVar, com.google.android.gms.internal.ads.zzejd zzejdVar) {
        this.zzc = zzfgnVar;
        this.zzb = zzgcsVar;
        this.zza = zzbdgVar;
        this.zzd = zzejdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzcab zzcabVar = new com.google.android.gms.internal.ads.zzcab();
        com.google.android.gms.internal.ads.zzeiz zzeizVar = new com.google.android.gms.internal.ads.zzeiz();
        zzeizVar.zzd(new com.google.android.gms.internal.ads.zzeit(this, zzcabVar, zzfcaVar, zzfboVar, zzeizVar));
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        final com.google.android.gms.internal.ads.zzbdb zzbdbVar = new com.google.android.gms.internal.ads.zzbdb(zzeizVar, zzfbtVar.zzb, zzfbtVar.zza);
        com.google.android.gms.internal.ads.zzfgh zzfghVar = com.google.android.gms.internal.ads.zzfgh.CUSTOM_RENDER_SYN;
        return com.google.android.gms.internal.ads.zzffx.zzd(new com.google.android.gms.internal.ads.zzffs() { // from class: com.google.android.gms.internal.ads.zzeis
            @Override // com.google.android.gms.internal.ads.zzffs
            public final void zza() throws java.lang.Exception {
                this.zza.zzc(zzbdbVar);
            }
        }, this.zzb, zzfghVar, this.zzc).zzb(com.google.android.gms.internal.ads.zzfgh.CUSTOM_RENDER_ACK).zzd(zzcabVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzfbt zzfbtVar;
        return (this.zza == null || (zzfbtVar = zzfboVar.zzs) == null || zzfbtVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbdb zzbdbVar) throws java.lang.Exception {
        this.zza.zze(zzbdbVar);
    }
}
