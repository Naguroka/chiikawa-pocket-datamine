package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcao implements java.lang.Runnable {
    final /* synthetic */ android.media.MediaPlayer zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcaw zzb;

    zzcao(com.google.android.gms.internal.ads.zzcaw zzcawVar, android.media.MediaPlayer mediaPlayer) {
        this.zza = mediaPlayer;
        this.zzb = zzcawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.ads.zzcaw.zzl(this.zzb, this.zza);
        com.google.android.gms.internal.ads.zzcaw zzcawVar = this.zzb;
        if (zzcawVar.zzq != null) {
            zzcawVar.zzq.zzf();
        }
    }
}
