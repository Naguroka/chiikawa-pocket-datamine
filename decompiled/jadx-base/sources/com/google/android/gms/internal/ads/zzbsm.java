package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsm extends com.google.android.gms.ads.nativead.NativeAd.Image {
    private final com.google.android.gms.internal.ads.zzbfw zza;
    private final android.graphics.drawable.Drawable zzb;
    private final android.net.Uri zzc;
    private final double zzd;
    private final int zze;
    private final int zzf;

    public zzbsm(com.google.android.gms.internal.ads.zzbfw zzbfwVar) {
        android.graphics.drawable.Drawable drawable;
        double dZzb;
        int iZzd;
        this.zza = zzbfwVar;
        android.net.Uri uriZze = null;
        try {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzf = zzbfwVar.zzf();
            drawable = iObjectWrapperZzf != null ? (android.graphics.drawable.Drawable) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapperZzf) : null;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        this.zzb = drawable;
        try {
            uriZze = this.zza.zze();
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
        this.zzc = uriZze;
        try {
            dZzb = this.zza.zzb();
        } catch (android.os.RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
            dZzb = 1.0d;
        }
        this.zzd = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.zza.zzd();
        } catch (android.os.RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
            iZzd = -1;
        }
        this.zze = iZzd;
        try {
            iZzc = this.zza.zzc();
        } catch (android.os.RemoteException e5) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e5);
        }
        this.zzf = iZzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final android.graphics.drawable.Drawable getDrawable() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final android.net.Uri getUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.zze;
    }
}
