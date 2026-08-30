package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbsk extends com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo {
    private final java.util.List zza = new java.util.ArrayList();
    private java.lang.String zzb;

    public zzbsk(com.google.android.gms.internal.ads.zzbfp zzbfpVar) {
        try {
            this.zzb = zzbfpVar.zzg();
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            this.zzb = "";
        }
        try {
            for (java.lang.Object obj : zzbfpVar.zzh()) {
                com.google.android.gms.internal.ads.zzbfw zzbfwVarZzg = obj instanceof android.os.IBinder ? com.google.android.gms.internal.ads.zzbfv.zzg((android.os.IBinder) obj) : null;
                if (zzbfwVarZzg != null) {
                    this.zza.add(new com.google.android.gms.internal.ads.zzbsm(zzbfwVarZzg));
                }
            }
        } catch (android.os.RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final java.lang.CharSequence getText() {
        return this.zzb;
    }
}
