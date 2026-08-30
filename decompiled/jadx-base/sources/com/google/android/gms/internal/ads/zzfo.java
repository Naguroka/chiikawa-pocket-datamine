package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfo {
    private final com.google.android.gms.internal.ads.zzfm zza;
    private final java.util.concurrent.atomic.AtomicLong zzb = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.ArrayDeque zzc = new java.util.ArrayDeque();
    private final java.util.PriorityQueue zzd = new java.util.PriorityQueue();
    private int zze = -1;

    public zzfo(com.google.android.gms.internal.ads.zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    private final void zze(int i) {
        while (this.zzd.size() > i) {
            com.google.android.gms.internal.ads.zzfn zzfnVar = (com.google.android.gms.internal.ads.zzfn) this.zzd.poll();
            int i2 = com.google.android.gms.internal.ads.zzei.zza;
            this.zza.zza(zzfnVar.zzb, zzfnVar.zza);
            this.zzc.push(zzfnVar);
        }
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r9 < r0.zzb) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(long j, com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int i = this.zze;
        if (i != 0) {
            if (i != -1 && this.zzd.size() >= this.zze) {
                com.google.android.gms.internal.ads.zzfn zzfnVar = (com.google.android.gms.internal.ads.zzfn) this.zzd.peek();
                int i2 = com.google.android.gms.internal.ads.zzei.zza;
            }
            com.google.android.gms.internal.ads.zzfn zzfnVar2 = this.zzc.isEmpty() ? new com.google.android.gms.internal.ads.zzfn() : (com.google.android.gms.internal.ads.zzfn) this.zzc.poll();
            zzfnVar2.zzc(j, this.zzb.getAndIncrement(), zzdyVar);
            this.zzd.add(zzfnVar2);
            int i3 = this.zze;
            if (i3 != -1) {
                zze(i3);
                return;
            }
            return;
        }
        this.zza.zza(j, zzdyVar);
    }

    public final void zzc() {
        zze(0);
    }

    public final void zzd(int i) {
        com.google.android.gms.internal.ads.zzcw.zzf(i >= 0);
        this.zze = i;
        zze(i);
    }
}
