package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzawa implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzawd zza;

    zzawa(com.google.android.gms.internal.ads.zzawd zzawdVar) {
        this.zza = zzawdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzv();
    }
}
