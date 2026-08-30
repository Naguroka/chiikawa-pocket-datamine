package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzlf {
    private final com.google.android.gms.internal.ads.zzle zza;
    private final com.google.android.gms.internal.ads.zzld zzb;
    private final com.google.android.gms.internal.ads.zzbq zzc;
    private int zzd;
    private java.lang.Object zze;
    private final android.os.Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlf(com.google.android.gms.internal.ads.zzld zzldVar, com.google.android.gms.internal.ads.zzle zzleVar, com.google.android.gms.internal.ads.zzbq zzbqVar, int i, com.google.android.gms.internal.ads.zzcx zzcxVar, android.os.Looper looper) {
        this.zzb = zzldVar;
        this.zza = zzleVar;
        this.zzc = zzbqVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final int zza() {
        return this.zzd;
    }

    public final android.os.Looper zzb() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzle zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzlf zzd() {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzm(this);
        return this;
    }

    public final com.google.android.gms.internal.ads.zzlf zze(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzlf zzf(int i) {
        com.google.android.gms.internal.ads.zzcw.zzf(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final java.lang.Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z) {
        this.zzi = z | this.zzi;
        notifyAll();
    }

    public final synchronized boolean zzi() {
        return false;
    }
}
