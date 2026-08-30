package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzed implements com.google.android.gms.internal.ads.zzdh {
    private static final java.util.List zza = new java.util.ArrayList(50);
    private final android.os.Handler zzb;

    public zzed(android.os.Handler handler) {
        this.zzb = handler;
    }

    static /* bridge */ /* synthetic */ void zzl(com.google.android.gms.internal.ads.zzeb zzebVar) {
        java.util.List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzebVar);
            }
        }
    }

    private static com.google.android.gms.internal.ads.zzeb zzm() {
        com.google.android.gms.internal.ads.zzeb zzebVar;
        java.util.List list = zza;
        synchronized (list) {
            zzebVar = list.isEmpty() ? new com.google.android.gms.internal.ads.zzeb(null) : (com.google.android.gms.internal.ads.zzeb) list.remove(list.size() - 1);
        }
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final android.os.Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final com.google.android.gms.internal.ads.zzdg zzb(int i) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzeb zzebVarZzm = zzm();
        zzebVarZzm.zzb(handler.obtainMessage(i), this);
        return zzebVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final com.google.android.gms.internal.ads.zzdg zzc(int i, java.lang.Object obj) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzeb zzebVarZzm = zzm();
        zzebVarZzm.zzb(handler.obtainMessage(i, obj), this);
        return zzebVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final com.google.android.gms.internal.ads.zzdg zzd(int i, int i2, int i3) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzeb zzebVarZzm = zzm();
        zzebVarZzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzebVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final void zze(java.lang.Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzh(java.lang.Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzk(com.google.android.gms.internal.ads.zzdg zzdgVar) {
        return ((com.google.android.gms.internal.ads.zzeb) zzdgVar).zzc(this.zzb);
    }
}
