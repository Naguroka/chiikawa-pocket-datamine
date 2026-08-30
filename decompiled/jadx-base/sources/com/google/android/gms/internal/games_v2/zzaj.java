package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaj {
    private final android.os.Handler zza;
    private boolean zzc;
    final java.lang.Object zzb = new java.lang.Object();
    private final java.util.HashMap zzd = new java.util.HashMap();

    public zzaj(android.os.Looper looper, int i) {
        this.zza = new com.google.android.gms.internal.games_v2.zzfa(looper);
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.games_v2.zzaj zzajVar) {
        synchronized (zzajVar.zzb) {
            zzajVar.zzc = false;
            zzajVar.zzd();
        }
    }

    protected abstract void zza(java.lang.String str, int i);

    public final void zzc(java.lang.String str, int i) {
        synchronized (this.zzb) {
            if (!this.zzc) {
                this.zzc = true;
                this.zza.postDelayed(new com.google.android.gms.internal.games_v2.zzai(this), 1000L);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) this.zzd.get(str);
            if (atomicInteger == null) {
                atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
                this.zzd.put(str, atomicInteger);
            }
            atomicInteger.addAndGet(i);
        }
    }

    public final void zzd() {
        synchronized (this.zzb) {
            for (java.util.Map.Entry entry : this.zzd.entrySet()) {
                zza((java.lang.String) entry.getKey(), ((java.util.concurrent.atomic.AtomicInteger) entry.getValue()).get());
            }
            this.zzd.clear();
        }
    }
}
