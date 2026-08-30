package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqf {
    private final android.media.AudioTrack zza;
    private final com.google.android.gms.internal.ads.zzon zzb;
    private android.media.AudioRouting.OnRoutingChangedListener zzc = new android.media.AudioRouting.OnRoutingChangedListener() { // from class: com.google.android.gms.internal.ads.zzqe
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(android.media.AudioRouting audioRouting) {
            com.google.android.gms.internal.ads.zzqf.zza(this.zza, audioRouting);
        }
    };

    public zzqf(android.media.AudioTrack audioTrack, com.google.android.gms.internal.ads.zzon zzonVar) {
        this.zza = audioTrack;
        this.zzb = zzonVar;
        audioTrack.addOnRoutingChangedListener(this.zzc, new android.os.Handler(android.os.Looper.myLooper()));
    }

    public static /* synthetic */ void zza(com.google.android.gms.internal.ads.zzqf zzqfVar, android.media.AudioRouting audioRouting) {
        if (zzqfVar.zzc == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        zzqfVar.zzb.zzh(audioRouting.getRoutedDevice());
    }

    public final void zzb() {
        android.media.AudioRouting.OnRoutingChangedListener onRoutingChangedListener = this.zzc;
        onRoutingChangedListener.getClass();
        this.zza.removeOnRoutingChangedListener(onRoutingChangedListener);
        this.zzc = null;
    }
}
