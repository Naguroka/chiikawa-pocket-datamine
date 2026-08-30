package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzps {
    private final android.content.Context zza;
    private java.lang.Boolean zzb;

    public zzps() {
        this.zza = null;
    }

    public zzps(android.content.Context context) {
        this.zza = context;
    }

    public final com.google.android.gms.internal.ads.zzor zza(com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zze zzeVar) {
        boolean zBooleanValue;
        android.media.AudioManager audioManager;
        zzabVar.getClass();
        zzeVar.getClass();
        if (com.google.android.gms.internal.ads.zzei.zza < 29 || zzabVar.zzE == -1) {
            return com.google.android.gms.internal.ads.zzor.zza;
        }
        android.content.Context context = this.zza;
        java.lang.Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context == null || (audioManager = (android.media.AudioManager) context.getSystemService("audio")) == null) {
                this.zzb = false;
            } else {
                java.lang.String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.zzb = java.lang.Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = this.zzb.booleanValue();
        }
        java.lang.String str = zzabVar.zzo;
        str.getClass();
        int iZza = com.google.android.gms.internal.ads.zzbb.zza(str, zzabVar.zzk);
        if (iZza == 0 || com.google.android.gms.internal.ads.zzei.zza < com.google.android.gms.internal.ads.zzei.zzh(iZza)) {
            return com.google.android.gms.internal.ads.zzor.zza;
        }
        int iZzi = com.google.android.gms.internal.ads.zzei.zzi(zzabVar.zzD);
        if (iZzi == 0) {
            return com.google.android.gms.internal.ads.zzor.zza;
        }
        try {
            android.media.AudioFormat audioFormatZzx = com.google.android.gms.internal.ads.zzei.zzx(zzabVar.zzE, iZzi, iZza);
            if (com.google.android.gms.internal.ads.zzei.zza < 31) {
                if (!android.media.AudioManager.isOffloadedPlaybackSupported(audioFormatZzx, zzeVar.zza().zza)) {
                    return com.google.android.gms.internal.ads.zzor.zza;
                }
                com.google.android.gms.internal.ads.zzop zzopVar = new com.google.android.gms.internal.ads.zzop();
                zzopVar.zza(true);
                zzopVar.zzc(zBooleanValue);
                return zzopVar.zzd();
            }
            int playbackOffloadSupport = android.media.AudioManager.getPlaybackOffloadSupport(audioFormatZzx, zzeVar.zza().zza);
            if (playbackOffloadSupport == 0) {
                return com.google.android.gms.internal.ads.zzor.zza;
            }
            com.google.android.gms.internal.ads.zzop zzopVar2 = new com.google.android.gms.internal.ads.zzop();
            if (com.google.android.gms.internal.ads.zzei.zza > 32 && playbackOffloadSupport == 2) {
                z = true;
            }
            zzopVar2.zza(true);
            zzopVar2.zzb(z);
            zzopVar2.zzc(zBooleanValue);
            return zzopVar2.zzd();
        } catch (java.lang.IllegalArgumentException unused) {
            return com.google.android.gms.internal.ads.zzor.zza;
        }
    }
}
