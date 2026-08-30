package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcqo implements com.google.android.gms.internal.ads.zzcxh, com.google.android.gms.internal.ads.zzayk {
    private final com.google.android.gms.internal.ads.zzfbo zza;
    private final com.google.android.gms.internal.ads.zzcwl zzb;
    private final com.google.android.gms.internal.ads.zzcxq zzc;
    private final java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean zze = new java.util.concurrent.atomic.AtomicBoolean();

    public zzcqo(com.google.android.gms.internal.ads.zzfbo zzfboVar, com.google.android.gms.internal.ads.zzcwl zzcwlVar, com.google.android.gms.internal.ads.zzcxq zzcxqVar) {
        this.zza = zzfboVar;
        this.zzb = zzcwlVar;
        this.zzc = zzcxqVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(com.google.android.gms.internal.ads.zzayj zzayjVar) {
        if (this.zza.zze == 1 && zzayjVar.zzj) {
            zza();
        }
        if (zzayjVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}
