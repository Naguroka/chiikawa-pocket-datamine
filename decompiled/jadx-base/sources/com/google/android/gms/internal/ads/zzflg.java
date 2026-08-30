package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzflg extends android.database.ContentObserver {
    private final android.content.Context zza;
    private final android.media.AudioManager zzb;
    private float zzc;
    private final com.google.android.gms.internal.ads.zzfls zzd;

    public zzflg(android.os.Handler handler, android.content.Context context, com.google.android.gms.internal.ads.zzfle zzfleVar, com.google.android.gms.internal.ads.zzfls zzflsVar) {
        super(handler);
        this.zza = context;
        this.zzb = (android.media.AudioManager) context.getSystemService("audio");
        this.zzd = zzflsVar;
    }

    private final float zzc() {
        android.media.AudioManager audioManager = this.zzb;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0 || streamVolume <= 0) {
            return 0.0f;
        }
        float f = streamVolume / streamMaxVolume;
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    private final void zzd() {
        this.zzd.zze(this.zzc);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        float fZzc = zzc();
        if (fZzc != this.zzc) {
            this.zzc = fZzc;
            zzd();
        }
    }

    public final void zza() {
        this.zzc = zzc();
        zzd();
        this.zza.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, this);
    }

    public final void zzb() {
        this.zza.getContentResolver().unregisterContentObserver(this);
    }
}
