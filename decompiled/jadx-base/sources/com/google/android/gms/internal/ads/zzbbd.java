package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbbd implements com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbav zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcab zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbf zzc;

    zzbbd(com.google.android.gms.internal.ads.zzbbf zzbbfVar, com.google.android.gms.internal.ads.zzbav zzbavVar, com.google.android.gms.internal.ads.zzcab zzcabVar) {
        this.zza = zzbavVar;
        this.zzb = zzcabVar;
        this.zzc = zzbbfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        synchronized (this.zzc.zzd) {
            com.google.android.gms.internal.ads.zzbbf zzbbfVar = this.zzc;
            if (zzbbfVar.zzb) {
                return;
            }
            zzbbfVar.zzb = true;
            final com.google.android.gms.internal.ads.zzbau zzbauVar = this.zzc.zza;
            if (zzbauVar == null) {
                return;
            }
            com.google.android.gms.internal.ads.zzgcs zzgcsVar = com.google.android.gms.internal.ads.zzbzw.zza;
            final com.google.android.gms.internal.ads.zzbav zzbavVar = this.zza;
            final com.google.android.gms.internal.ads.zzcab zzcabVar = this.zzb;
            final com.google.common.util.concurrent.ListenableFuture listenableFutureZza = zzgcsVar.zza(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbba
                @Override // java.lang.Runnable
                public final void run() {
                    com.google.android.gms.internal.ads.zzbbd zzbbdVar = this.zza;
                    com.google.android.gms.internal.ads.zzbau zzbauVar2 = zzbauVar;
                    com.google.android.gms.internal.ads.zzcab zzcabVar2 = zzcabVar;
                    try {
                        com.google.android.gms.internal.ads.zzbax zzbaxVarZzq = zzbauVar2.zzq();
                        boolean zZzp = zzbauVar2.zzp();
                        com.google.android.gms.internal.ads.zzbav zzbavVar2 = zzbavVar;
                        com.google.android.gms.internal.ads.zzbas zzbasVarZzg = zZzp ? zzbaxVarZzq.zzg(zzbavVar2) : zzbaxVarZzq.zzf(zzbavVar2);
                        if (!zzbasVarZzg.zze()) {
                            zzcabVar2.zzd(new java.lang.RuntimeException("No entry contents."));
                            com.google.android.gms.internal.ads.zzbbf.zze(zzbbdVar.zzc);
                            return;
                        }
                        com.google.android.gms.internal.ads.zzbbc zzbbcVar = new com.google.android.gms.internal.ads.zzbbc(zzbbdVar, zzbasVarZzg.zzc(), 1);
                        int i = zzbbcVar.read();
                        if (i == -1) {
                            throw new java.io.IOException("Unable to read from cache.");
                        }
                        zzbbcVar.unread(i);
                        zzcabVar2.zzc(com.google.android.gms.internal.ads.zzbbh.zzb(zzbbcVar, zzbasVarZzg.zzd(), zzbasVarZzg.zzg(), zzbasVarZzg.zza(), zzbasVarZzg.zzf()));
                    } catch (android.os.RemoteException | java.io.IOException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                        zzcabVar2.zzd(e);
                        com.google.android.gms.internal.ads.zzbbf.zze(zzbbdVar.zzc);
                    }
                }
            });
            final com.google.android.gms.internal.ads.zzcab zzcabVar2 = this.zzb;
            zzcabVar2.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzbbb
                @Override // java.lang.Runnable
                public final void run() {
                    int i = com.google.android.gms.internal.ads.zzbbd.zzd;
                    if (zzcabVar2.isCancelled()) {
                        listenableFutureZza.cancel(true);
                    }
                }
            }, com.google.android.gms.internal.ads.zzbzw.zzg);
        }
    }
}
