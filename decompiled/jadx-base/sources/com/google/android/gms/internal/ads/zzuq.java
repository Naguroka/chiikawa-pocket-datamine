package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzuq {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzug zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;

    public zzuq() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    private zzuq(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzugVar;
    }

    public final com.google.android.gms.internal.ads.zzuq zza(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        return new com.google.android.gms.internal.ads.zzuq(this.zzc, 0, zzugVar);
    }

    public final void zzb(android.os.Handler handler, com.google.android.gms.internal.ads.zzur zzurVar) {
        this.zzc.add(new com.google.android.gms.internal.ads.zzup(handler, zzurVar));
    }

    public final void zzc(final com.google.android.gms.internal.ads.zzdb zzdbVar) {
        for (com.google.android.gms.internal.ads.zzup zzupVar : this.zzc) {
            final com.google.android.gms.internal.ads.zzur zzurVar = zzupVar.zzb;
            android.os.Handler handler = zzupVar.zza;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzuo
                @Override // java.lang.Runnable
                public final void run() {
                    zzdbVar.zza(zzurVar);
                }
            };
            int i = com.google.android.gms.internal.ads.zzei.zza;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == android.os.Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void zzd(final com.google.android.gms.internal.ads.zzuc zzucVar) {
        zzc(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzuj
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzur) obj).zzaf(0, this.zza.zzb, zzucVar);
            }
        });
    }

    public final void zze(final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        zzc(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzun
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzur) obj).zzag(0, this.zza.zzb, zztxVar, zzucVar);
            }
        });
    }

    public final void zzf(final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        zzc(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzur) obj).zzah(0, this.zza.zzb, zztxVar, zzucVar);
            }
        });
    }

    public final void zzg(final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar, final java.io.IOException iOException, final boolean z) {
        zzc(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzur) obj).zzai(0, this.zza.zzb, zztxVar, zzucVar, iOException, z);
            }
        });
    }

    public final void zzh(final com.google.android.gms.internal.ads.zztx zztxVar, final com.google.android.gms.internal.ads.zzuc zzucVar) {
        zzc(new com.google.android.gms.internal.ads.zzdb() { // from class: com.google.android.gms.internal.ads.zzuk
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzur) obj).zzaj(0, this.zza.zzb, zztxVar, zzucVar);
            }
        });
    }

    public final void zzi(com.google.android.gms.internal.ads.zzur zzurVar) {
        for (com.google.android.gms.internal.ads.zzup zzupVar : this.zzc) {
            if (zzupVar.zzb == zzurVar) {
                this.zzc.remove(zzupVar);
            }
        }
    }
}
