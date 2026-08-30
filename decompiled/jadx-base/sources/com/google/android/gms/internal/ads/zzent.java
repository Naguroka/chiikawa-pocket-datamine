package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzent implements com.google.android.gms.internal.ads.zzetr {
    private final com.google.android.gms.internal.ads.zzgcs zza;
    private final android.content.Context zzb;

    public zzent(com.google.android.gms.internal.ads.zzgcs zzgcsVar, android.content.Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 13;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return this.zza.zzb(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzens
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.zza.zzc();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzenu zzc() throws java.lang.Exception {
        int i;
        int streamMaxVolume;
        android.media.AudioManager audioManager = (android.media.AudioManager) this.zzb.getSystemService("audio");
        float fZza = com.google.android.gms.ads.internal.zzv.zzs().zza();
        boolean zZze = com.google.android.gms.ads.internal.zzv.zzs().zze();
        if (audioManager == null) {
            return new com.google.android.gms.internal.ads.zzenu(-1, false, false, -1, -1, -1, -1, -1, fZza, zZze, true);
        }
        int mode = audioManager.getMode();
        boolean zIsMusicActive = audioManager.isMusicActive();
        boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        int streamVolume = audioManager.getStreamVolume(3);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzkQ)).booleanValue()) {
            int iZzj = com.google.android.gms.ads.internal.zzv.zzr().zzj(audioManager);
            streamMaxVolume = audioManager.getStreamMaxVolume(3);
            i = iZzj;
        } else {
            i = -1;
            streamMaxVolume = -1;
        }
        return new com.google.android.gms.internal.ads.zzenu(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZza, zZze, false);
    }
}
