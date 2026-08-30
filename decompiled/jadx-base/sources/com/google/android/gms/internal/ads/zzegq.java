package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzegq {
    private final com.google.android.gms.common.util.Clock zza;
    private final com.google.android.gms.internal.ads.zzegs zzb;
    private final com.google.android.gms.internal.ads.zzfja zzc;
    private final java.util.LinkedHashMap zzd = new java.util.LinkedHashMap();
    private final boolean zze = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgG)).booleanValue();
    private final com.google.android.gms.internal.ads.zzedb zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzegq(com.google.android.gms.common.util.Clock clock, com.google.android.gms.internal.ads.zzegs zzegsVar, com.google.android.gms.internal.ads.zzedb zzedbVar, com.google.android.gms.internal.ads.zzfja zzfjaVar) {
        this.zza = clock;
        this.zzb = zzegsVar;
        this.zzf = zzedbVar;
        this.zzc = zzfjaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzegp zzegpVar = (com.google.android.gms.internal.ads.zzegp) this.zzd.get(zzfboVar);
        if (zzegpVar == null) {
            return false;
        }
        return zzegpVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    final synchronized com.google.common.util.concurrent.ListenableFuture zzf(com.google.android.gms.internal.ads.zzfca zzfcaVar, com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzfiv zzfivVar) {
        com.google.android.gms.internal.ads.zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        java.lang.String str = zzfboVar.zzw;
        if (str != null) {
            this.zzd.put(zzfboVar, new com.google.android.gms.internal.ads.zzegp(str, zzfboVar.zzaf, 9, 0L, null));
            com.google.android.gms.internal.ads.zzgch.zzr(listenableFuture, new com.google.android.gms.internal.ads.zzego(this, jElapsedRealtime, zzfbrVar, zzfboVar, str, zzfivVar, zzfcaVar), com.google.android.gms.internal.ads.zzbzw.zzg);
        }
        return listenableFuture;
    }

    public final synchronized java.lang.String zzg() {
        java.util.ArrayList arrayList;
        arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.zzd.entrySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzegp zzegpVar = (com.google.android.gms.internal.ads.zzegp) ((java.util.Map.Entry) it.next()).getValue();
            if (zzegpVar.zzc != Integer.MAX_VALUE) {
                arrayList.add(zzegpVar.toString());
            }
        }
        return android.text.TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
        if (zzfboVar != null) {
            this.zzf.zze(zzfboVar);
        }
        this.zzg = true;
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(java.util.List list) {
        this.zzi = this.zza.elapsedRealtime();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzfbo zzfboVar = (com.google.android.gms.internal.ads.zzfbo) it.next();
            if (!android.text.TextUtils.isEmpty(zzfboVar.zzw)) {
                this.zzd.put(zzfboVar, new com.google.android.gms.internal.ads.zzegp(zzfboVar.zzw, zzfboVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(com.google.android.gms.internal.ads.zzfbo zzfboVar) {
        com.google.android.gms.internal.ads.zzegp zzegpVar = (com.google.android.gms.internal.ads.zzegp) this.zzd.get(zzfboVar);
        if (zzegpVar == null || this.zzg) {
            return;
        }
        zzegpVar.zzc = 8;
    }
}
