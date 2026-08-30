package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzetu {
    private final android.content.Context zza;
    private final java.util.Set zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.internal.ads.zzfhh zzd;
    private final com.google.android.gms.internal.ads.zzdrw zze;
    private long zzf = 0;
    private int zzg = 0;

    public zzetu(android.content.Context context, java.util.concurrent.Executor executor, java.util.Set set, com.google.android.gms.internal.ads.zzfhh zzfhhVar, com.google.android.gms.internal.ads.zzdrw zzdrwVar) {
        this.zza = context;
        this.zzc = executor;
        this.zzb = set;
        this.zzd = zzfhhVar;
        this.zze = zzdrwVar;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final java.lang.Object obj, final android.os.Bundle bundle, final boolean z) {
        com.google.android.gms.internal.ads.zzfgw zzfgwVarZza = com.google.android.gms.internal.ads.zzfgv.zza(this.zza, 8);
        zzfgwVarZza.zzi();
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.zzb.size());
        java.util.List arrayList2 = new java.util.ArrayList();
        if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlC)).isEmpty()) {
            arrayList2 = java.util.Arrays.asList(((java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzlC)).split(","));
        }
        java.util.List list = arrayList2;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        final android.os.Bundle bundle2 = new android.os.Bundle();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && bundle != null) {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            if (obj instanceof com.google.android.gms.internal.ads.zzcuv) {
                bundle.putLong(com.google.android.gms.internal.ads.zzdre.CLIENT_SIGNALS_START.zza(), jCurrentTimeMillis);
            } else {
                bundle.putLong(com.google.android.gms.internal.ads.zzdre.GMS_SIGNALS_START.zza(), jCurrentTimeMillis);
            }
        }
        for (final com.google.android.gms.internal.ads.zzetr zzetrVar : this.zzb) {
            if (!list.contains(java.lang.String.valueOf(zzetrVar.zza()))) {
                final long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
                com.google.common.util.concurrent.ListenableFuture listenableFutureZzb = zzetrVar.zzb();
                listenableFutureZzb.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzets
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb(jElapsedRealtime, zzetrVar, bundle2);
                    }
                }, com.google.android.gms.internal.ads.zzbzw.zzg);
                arrayList.add(listenableFutureZzb);
            }
        }
        com.google.common.util.concurrent.ListenableFuture listenableFutureZza = com.google.android.gms.internal.ads.zzgch.zzb(arrayList).zza(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzett
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Object obj2;
                android.os.Bundle bundle3;
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.google.android.gms.internal.ads.zzetq zzetqVar = (com.google.android.gms.internal.ads.zzetq) ((com.google.common.util.concurrent.ListenableFuture) it.next()).get();
                    if (zzetqVar != null) {
                        boolean z2 = z;
                        zzetqVar.zzb(obj2);
                        if (z2) {
                            zzetqVar.zza(obj2);
                        }
                    }
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue() && (bundle3 = bundle) != null) {
                    android.os.Bundle bundle4 = bundle2;
                    long jCurrentTimeMillis2 = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
                    if (obj2 instanceof com.google.android.gms.internal.ads.zzcuv) {
                        bundle3.putLong(com.google.android.gms.internal.ads.zzdre.CLIENT_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("client_sig_latency_key", bundle4);
                    } else {
                        bundle3.putLong(com.google.android.gms.internal.ads.zzdre.GMS_SIGNALS_END.zza(), jCurrentTimeMillis2);
                        bundle3.putBundle("gms_sig_latency_key", bundle4);
                    }
                }
                return obj2;
            }
        }, this.zzc);
        if (com.google.android.gms.internal.ads.zzfhk.zza()) {
            com.google.android.gms.internal.ads.zzfhg.zza(listenableFutureZza, this.zzd, zzfgwVarZza);
        }
        return listenableFutureZza;
    }

    public final void zzb(long j, com.google.android.gms.internal.ads.zzetr zzetrVar, android.os.Bundle bundle) {
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzben.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal runtime (ms) : " + com.google.android.gms.internal.ads.zzfve.zzc(zzetrVar.getClass().getCanonicalName()) + " = " + jElapsedRealtime);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzck)).booleanValue()) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzco)).booleanValue()) {
                synchronized (this) {
                    bundle.putLong("sig" + zzetrVar.zza(), jElapsedRealtime);
                }
            }
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzci)).booleanValue()) {
            com.google.android.gms.internal.ads.zzdrv zzdrvVarZza = this.zze.zza();
            zzdrvVarZza.zzb("action", "lat_ms");
            zzdrvVarZza.zzb("lat_grp", "sig_lat_grp");
            zzdrvVarZza.zzb("lat_id", java.lang.String.valueOf(zzetrVar.zza()));
            zzdrvVarZza.zzb("clat_ms", java.lang.String.valueOf(jElapsedRealtime));
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcj)).booleanValue()) {
                synchronized (this) {
                    this.zzg++;
                }
                zzdrvVarZza.zzb("seq_num", com.google.android.gms.ads.internal.zzv.zzp().zzh().zzd());
                synchronized (this) {
                    if (this.zzg == this.zzb.size() && this.zzf != 0) {
                        this.zzg = 0;
                        java.lang.String strValueOf = java.lang.String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzf);
                        if (zzetrVar.zza() <= 39 || zzetrVar.zza() >= 52) {
                            zzdrvVarZza.zzb("lat_clsg", strValueOf);
                        } else {
                            zzdrvVarZza.zzb("lat_gmssg", strValueOf);
                        }
                    }
                }
            }
            zzdrvVarZza.zzh();
        }
    }
}
