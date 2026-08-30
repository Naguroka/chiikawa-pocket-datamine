package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc {
    public final android.media.AudioAttributes zza;

    /* synthetic */ zzc(com.google.android.gms.internal.ads.zze zzeVar, com.google.android.gms.internal.ads.zzd zzdVar) {
        android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        if (com.google.android.gms.internal.ads.zzei.zza >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.zza = usage.build();
    }
}
