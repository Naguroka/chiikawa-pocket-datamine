package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzho implements android.media.AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzhq zza;
    private final android.os.Handler zzb;

    public zzho(com.google.android.gms.internal.ads.zzhq zzhqVar, android.os.Handler handler) {
        this.zza = zzhqVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.zzb.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzhn
            @Override // java.lang.Runnable
            public final void run() {
                com.google.android.gms.internal.ads.zzhq.zzc(this.zza.zza, i);
            }
        });
    }
}
