package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqj extends android.media.AudioTrack.StreamEventCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqk zza;

    zzqj(com.google.android.gms.internal.ads.zzqk zzqkVar) {
        this.zza = zzqkVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(android.media.AudioTrack audioTrack, int i) {
        audioTrack.equals(this.zza.zza.zzt);
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(android.media.AudioTrack audioTrack) {
        if (audioTrack.equals(this.zza.zza.zzt)) {
            this.zza.zza.zzQ = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(android.media.AudioTrack audioTrack) {
        audioTrack.equals(this.zza.zza.zzt);
    }
}
