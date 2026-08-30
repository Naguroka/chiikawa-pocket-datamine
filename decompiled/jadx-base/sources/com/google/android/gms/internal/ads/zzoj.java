package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzoj extends android.media.AudioDeviceCallback {
    final /* synthetic */ com.google.android.gms.internal.ads.zzon zza;

    /* synthetic */ zzoj(com.google.android.gms.internal.ads.zzon zzonVar, com.google.android.gms.internal.ads.zzom zzomVar) {
        this.zza = zzonVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        com.google.android.gms.internal.ads.zzon zzonVar = this.zza;
        this.zza.zzj(com.google.android.gms.internal.ads.zzoi.zzc(zzonVar.zza, zzonVar.zzh, zzonVar.zzg));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        com.google.android.gms.internal.ads.zzoo zzooVar = this.zza.zzg;
        int i = com.google.android.gms.internal.ads.zzei.zza;
        for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (java.util.Objects.equals(audioDeviceInfo, zzooVar)) {
                this.zza.zzg = null;
                break;
            }
        }
        com.google.android.gms.internal.ads.zzon zzonVar = this.zza;
        zzonVar.zzj(com.google.android.gms.internal.ads.zzoi.zzc(zzonVar.zza, zzonVar.zzh, zzonVar.zzg));
    }
}
