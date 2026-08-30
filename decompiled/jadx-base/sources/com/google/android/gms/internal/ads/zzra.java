package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzra {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzug zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;

    public zzra() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    private zzra(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzugVar;
    }

    public final com.google.android.gms.internal.ads.zzra zza(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        return new com.google.android.gms.internal.ads.zzra(this.zzc, 0, zzugVar);
    }

    public final void zzb(android.os.Handler handler, com.google.android.gms.internal.ads.zzrb zzrbVar) {
        this.zzc.add(new com.google.android.gms.internal.ads.zzqz(handler, zzrbVar));
    }

    public final void zzc(com.google.android.gms.internal.ads.zzrb zzrbVar) {
        for (com.google.android.gms.internal.ads.zzqz zzqzVar : this.zzc) {
            if (zzqzVar.zza == zzrbVar) {
                this.zzc.remove(zzqzVar);
            }
        }
    }
}
