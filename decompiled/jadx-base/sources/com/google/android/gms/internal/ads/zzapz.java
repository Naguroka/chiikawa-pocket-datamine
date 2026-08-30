package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzapz implements com.google.android.gms.internal.ads.zzapl {
    private final java.util.Map zza = new java.util.HashMap();
    private final com.google.android.gms.internal.ads.zzaoy zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private final com.google.android.gms.internal.ads.zzapd zzd;

    zzapz(com.google.android.gms.internal.ads.zzaoy zzaoyVar, java.util.concurrent.BlockingQueue blockingQueue, com.google.android.gms.internal.ads.zzapd zzapdVar) {
        this.zzd = zzapdVar;
        this.zzb = zzaoyVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zza(com.google.android.gms.internal.ads.zzapm zzapmVar) {
        java.util.Map map = this.zza;
        java.lang.String strZzj = zzapmVar.zzj();
        java.util.List list = (java.util.List) map.remove(strZzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (com.google.android.gms.internal.ads.zzapy.zzb) {
            com.google.android.gms.internal.ads.zzapy.zzd("%d waiting requests for cacheKey=%s; resend to network", java.lang.Integer.valueOf(list.size()), strZzj);
        }
        com.google.android.gms.internal.ads.zzapm zzapmVar2 = (com.google.android.gms.internal.ads.zzapm) list.remove(0);
        this.zza.put(strZzj, list);
        zzapmVar2.zzu(this);
        try {
            this.zzc.put(zzapmVar2);
        } catch (java.lang.InterruptedException e) {
            com.google.android.gms.internal.ads.zzapy.zzb("Couldn't add request to queue. %s", e.toString());
            java.lang.Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zzb(com.google.android.gms.internal.ads.zzapm zzapmVar, com.google.android.gms.internal.ads.zzaps zzapsVar) {
        java.util.List list;
        com.google.android.gms.internal.ads.zzaov zzaovVar = zzapsVar.zzb;
        if (zzaovVar == null || zzaovVar.zza(java.lang.System.currentTimeMillis())) {
            zza(zzapmVar);
            return;
        }
        java.lang.String strZzj = zzapmVar.zzj();
        synchronized (this) {
            list = (java.util.List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (com.google.android.gms.internal.ads.zzapy.zzb) {
                com.google.android.gms.internal.ads.zzapy.zzd("Releasing %d waiting requests for cacheKey=%s.", java.lang.Integer.valueOf(list.size()), strZzj);
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((com.google.android.gms.internal.ads.zzapm) it.next(), zzapsVar, null);
            }
        }
    }

    final synchronized boolean zzc(com.google.android.gms.internal.ads.zzapm zzapmVar) {
        java.util.Map map = this.zza;
        java.lang.String strZzj = zzapmVar.zzj();
        if (!map.containsKey(strZzj)) {
            this.zza.put(strZzj, null);
            zzapmVar.zzu(this);
            if (com.google.android.gms.internal.ads.zzapy.zzb) {
                com.google.android.gms.internal.ads.zzapy.zza("new request, sending to network %s", strZzj);
            }
            return false;
        }
        java.util.List arrayList = (java.util.List) this.zza.get(strZzj);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        zzapmVar.zzm("waiting-for-response");
        arrayList.add(zzapmVar);
        this.zza.put(strZzj, arrayList);
        if (com.google.android.gms.internal.ads.zzapy.zzb) {
            com.google.android.gms.internal.ads.zzapy.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
        }
        return true;
    }
}
