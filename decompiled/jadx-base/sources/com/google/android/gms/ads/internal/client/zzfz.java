package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfz extends com.google.android.gms.ads.internal.client.zzed {
    private final com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks zza;

    public zzfz(com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.zza = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zze() {
        this.zza.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzf(boolean z) {
        this.zza.onVideoMute(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzg() {
        this.zza.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzh() {
        this.zza.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzee
    public final void zzi() {
        this.zza.onVideoStart();
    }
}
