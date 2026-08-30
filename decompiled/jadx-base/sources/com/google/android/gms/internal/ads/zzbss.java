package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbss implements com.google.android.gms.ads.nativead.NativeCustomFormatAd {
    private final com.google.android.gms.internal.ads.zzbgq zza;
    private com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement zzb;

    public zzbss(com.google.android.gms.internal.ads.zzbgq zzbgqVar) {
        this.zza = zzbgqVar;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.util.List<java.lang.String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.lang.String getCustomFormatId() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzb == null && this.zza.zzq()) {
                this.zzb = new com.google.android.gms.internal.ads.zzbsl(this.zza);
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.nativead.NativeAd.Image getImage(java.lang.String str) {
        try {
            com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = this.zza.zzg(str);
            if (zzbfwVarZzg != null) {
                return new com.google.android.gms.internal.ads.zzbsm(zzbfwVarZzg);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final com.google.android.gms.ads.MediaContent getMediaContent() {
        try {
            if (this.zza.zzf() != null) {
                return new com.google.android.gms.ads.internal.client.zzfd(this.zza.zzf(), this.zza);
            }
            return null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final java.lang.CharSequence getText(java.lang.String str) {
        try {
            return this.zza.zzj(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(java.lang.String str) {
        try {
            this.zza.zzn(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}
