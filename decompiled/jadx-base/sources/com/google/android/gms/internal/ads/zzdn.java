package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdn {
    private final com.google.android.gms.internal.ads.zzcx zza;
    private final com.google.android.gms.internal.ads.zzdh zzb;
    private final com.google.android.gms.internal.ads.zzdl zzc;
    private final java.util.concurrent.CopyOnWriteArraySet zzd;
    private final java.util.ArrayDeque zze;
    private final java.util.ArrayDeque zzf;
    private final java.lang.Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzdn(android.os.Looper looper, com.google.android.gms.internal.ads.zzcx zzcxVar, com.google.android.gms.internal.ads.zzdl zzdlVar) {
        this(new java.util.concurrent.CopyOnWriteArraySet(), looper, zzcxVar, zzdlVar, true);
    }

    public static /* synthetic */ boolean zzg(com.google.android.gms.internal.ads.zzdn zzdnVar, android.os.Message message) {
        java.util.Iterator it = zzdnVar.zzd.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzdm) it.next()).zzb(zzdnVar.zzc);
            if (zzdnVar.zzb.zzg(1)) {
                break;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            com.google.android.gms.internal.ads.zzcw.zzf(java.lang.Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final com.google.android.gms.internal.ads.zzdn zza(android.os.Looper looper, com.google.android.gms.internal.ads.zzdl zzdlVar) {
        return new com.google.android.gms.internal.ads.zzdn(this.zzd, looper, this.zza, zzdlVar, this.zzi);
    }

    public final void zzb(java.lang.Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new com.google.android.gms.internal.ads.zzdm(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(1)) {
            com.google.android.gms.internal.ads.zzdh zzdhVar = this.zzb;
            zzdhVar.zzk(zzdhVar.zzb(1));
        }
        boolean z = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (z) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((java.lang.Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i, final com.google.android.gms.internal.ads.zzdk zzdkVar) {
        zzh();
        final java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.ads.zzdk zzdkVar2 = zzdkVar;
                    ((com.google.android.gms.internal.ads.zzdm) it.next()).zza(i, zzdkVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        java.util.Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzdm) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(java.lang.Object obj) {
        zzh();
        for (com.google.android.gms.internal.ads.zzdm zzdmVar : this.zzd) {
            if (zzdmVar.zza.equals(obj)) {
                zzdmVar.zzc(this.zzc);
                this.zzd.remove(zzdmVar);
            }
        }
    }

    private zzdn(java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet, android.os.Looper looper, com.google.android.gms.internal.ads.zzcx zzcxVar, com.google.android.gms.internal.ads.zzdl zzdlVar, boolean z) {
        this.zza = zzcxVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzdlVar;
        this.zzg = new java.lang.Object();
        this.zze = new java.util.ArrayDeque();
        this.zzf = new java.util.ArrayDeque();
        this.zzb = zzcxVar.zzd(looper, new android.os.Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                com.google.android.gms.internal.ads.zzdn.zzg(this.zza, message);
                return true;
            }
        });
        this.zzi = z;
    }
}
