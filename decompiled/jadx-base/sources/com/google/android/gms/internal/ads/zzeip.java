package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeip implements com.google.android.gms.internal.ads.zzecw {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzcpq zzb;
    private final com.google.android.gms.internal.ads.zzbdg zzc;
    private final com.google.android.gms.internal.ads.zzgcs zzd;
    private final com.google.android.gms.internal.ads.zzfgn zze;

    public zzeip(android.content.Context context, com.google.android.gms.internal.ads.zzcpq zzcpqVar, com.google.android.gms.internal.ads.zzfgn zzfgnVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, com.google.android.gms.internal.ads.zzbdg zzbdgVar) {
        this.zza = context;
        this.zzb = zzcpqVar;
        this.zze = zzfgnVar;
        this.zzd = zzgcsVar;
        this.zzc = zzbdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzein zzeinVar = new com.google.android.gms.internal.ads.zzein(this, new android.view.View(this.zza), null, new com.google.android.gms.internal.ads.zzcqx() { // from class: com.google.android.gms.internal.ads.zzeil
            @Override // com.google.android.gms.internal.ads.zzcqx
            public final com.google.android.gms.ads.internal.client.zzeb zza() {
                return null;
            }
        }, (com.google.android.gms.internal.ads.zzfbp) zzfboVar.zzu.get(0));
        com.google.android.gms.internal.ads.zzcon zzconVarZza = this.zzb.zza(new com.google.android.gms.internal.ads.zzcrp(zzfcaVar, zzfboVar, null), zzeinVar);
        com.google.android.gms.internal.ads.zzeio zzeioVarZzl = zzconVarZza.zzl();
        com.google.android.gms.internal.ads.zzfbt zzfbtVar = zzfboVar.zzs;
        final com.google.android.gms.internal.ads.zzbdb zzbdbVar = new com.google.android.gms.internal.ads.zzbdb(zzeioVarZzl, zzfbtVar.zzb, zzfbtVar.zza);
        com.google.android.gms.internal.ads.zzfgh zzfghVar = com.google.android.gms.internal.ads.zzfgh.CUSTOM_RENDER_SYN;
        return com.google.android.gms.internal.ads.zzffx.zzd(new com.google.android.gms.internal.ads.zzffs() { // from class: com.google.android.gms.internal.ads.zzeim
            @Override // com.google.android.gms.internal.ads.zzffs
            public final void zza() throws java.lang.Exception {
                this.zza.zzc(zzbdbVar);
            }
        }, this.zzd, zzfghVar, this.zze).zzb(com.google.android.gms.internal.ads.zzfgh.CUSTOM_RENDER_ACK).zzd(com.google.android.gms.internal.ads.zzgch.zzh(zzconVarZza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzfbt zzfbtVar;
        return (this.zzc == null || (zzfbtVar = zzfboVar.zzs) == null || zzfbtVar.zza == null) ? false : true;
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzbdb zzbdbVar) throws java.lang.Exception {
        this.zzc.zze(zzbdbVar);
    }
}
