package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdxe implements com.google.android.gms.internal.ads.zzdyg {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("Received error HTTP response code: (.*)");
    private final com.google.android.gms.internal.ads.zzdwg zzb;
    private final com.google.android.gms.internal.ads.zzgcs zzc;
    private final com.google.android.gms.internal.ads.zzfcj zzd;
    private final java.util.concurrent.ScheduledExecutorService zze;
    private final com.google.android.gms.internal.ads.zzeag zzf;
    private final com.google.android.gms.internal.ads.zzfhh zzg;
    private final android.content.Context zzh;

    zzdxe(android.content.Context context, com.google.android.gms.internal.ads.zzfcj zzfcjVar, com.google.android.gms.internal.ads.zzdwg zzdwgVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, com.google.android.gms.internal.ads.zzeag zzeagVar, com.google.android.gms.internal.ads.zzfhh zzfhhVar) {
        this.zzh = context;
        this.zzd = zzfcjVar;
        this.zzb = zzdwgVar;
        this.zzc = zzgcsVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeagVar;
        this.zzg = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyg
    public final com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.gms.internal.ads.zzbvk zzbvkVar) {
        android.content.Context context = this.zzh;
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzc = this.zzb.zzc(zzbvkVar);
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(context, 11);
        com.google.android.gms.internal.ads.zzfhg.zzd(listenableFutureZzc, zzfgwVarZza);
        com.google.common.util.concurrent.ListenableFuture listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzn(listenableFutureZzc, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                return this.zza.zzc((com.google.android.gms.internal.ads.zzdyi) obj);
            }
        }, this.zzc);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfx)).booleanValue()) {
            listenableFutureZzn = com.google.android.gms.internal.ads.zzgch.zzf(com.google.android.gms.internal.ads.zzgch.zzo(listenableFutureZzn, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzfy)).intValue(), java.util.concurrent.TimeUnit.SECONDS, this.zze), java.util.concurrent.TimeoutException.class, new com.google.android.gms.internal.ads.zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxc
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final com.google.common.util.concurrent.ListenableFuture zza(java.lang.Object obj) {
                    return com.google.android.gms.internal.ads.zzgch.zzg(new com.google.android.gms.internal.ads.zzdvy(5));
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
        }
        com.google.android.gms.internal.ads.zzfhg.zza(listenableFutureZzn, this.zzg, zzfgwVarZza);
        com.google.android.gms.internal.ads.zzgch.zzr(listenableFutureZzn, new com.google.android.gms.internal.ads.zzdxd(this), com.google.android.gms.internal.ads.zzbzw.zzg);
        return listenableFutureZzn;
    }

    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.gms.internal.ads.zzdyi zzdyiVar) throws java.lang.Exception {
        return com.google.android.gms.internal.ads.zzgch.zzh(new com.google.android.gms.internal.ads.zzfca(new com.google.android.gms.internal.ads.zzfbx(this.zzd), com.google.android.gms.internal.ads.zzfbz.zza(new java.io.InputStreamReader(zzdyiVar.zzb()), zzdyiVar.zza())));
    }
}
