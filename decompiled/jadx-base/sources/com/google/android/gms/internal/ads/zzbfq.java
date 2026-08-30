package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbfq extends com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo {
    private final com.google.android.gms.internal.ads.zzbfp zza;
    private final java.util.List zzb = new java.util.ArrayList();
    private java.lang.String zzc;

    public zzbfq(com.google.android.gms.internal.ads.zzbfp zzbfpVar) {
        android.os.IBinder iBinder;
        this.zza = zzbfpVar;
        try {
            this.zzc = zzbfpVar.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            this.zzc = "";
        }
        try {
            for (java.lang.Object obj : zzbfpVar.zzh()) {
                com.google.android.gms.internal.ads.zzbfw zzbfuVar = null;
                if ((obj instanceof android.os.IBinder) && (iBinder = (android.os.IBinder) obj) != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbfuVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbfw ? (com.google.android.gms.internal.ads.zzbfw) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfu(iBinder);
                }
                if (zzbfuVar != null) {
                    this.zzb.add(new com.google.android.gms.internal.ads.zzbfx(zzbfuVar));
                }
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final java.lang.CharSequence getText() {
        return this.zzc;
    }
}
