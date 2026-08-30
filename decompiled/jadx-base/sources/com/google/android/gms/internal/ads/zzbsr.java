package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsr {
    private final com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener zzb;
    private com.google.android.gms.ads.nativead.NativeCustomFormatAd zzc;

    public zzbsr(com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized com.google.android.gms.ads.nativead.NativeCustomFormatAd zzf(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        com.google.android.gms.ads.nativead.NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        com.google.android.gms.internal.ads.zzbss zzbssVar = new com.google.android.gms.internal.ads.zzbss(zzbgqVar);
        this.zzc = zzbssVar;
        return zzbssVar;
    }

    public final com.google.android.gms.internal.ads.zzbha zza() {
        com.google.android.gms.internal.ads.zzbsq zzbsqVar = null;
        if (this.zzb == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbso(this, zzbsqVar);
    }

    public final com.google.android.gms.internal.ads.zzbhd zzb() {
        return new com.google.android.gms.internal.ads.zzbsp(this, null);
    }
}
