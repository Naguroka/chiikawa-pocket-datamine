package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbhj extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbhk {
    public zzbhj() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static com.google.android.gms.internal.ads.zzbhk zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbhk ? (com.google.android.gms.internal.ads.zzbhk) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbhi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbht zzbhrVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbhrVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            zzbhrVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbht ? (com.google.android.gms.internal.ads.zzbht) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbhr(strongBinder);
        }
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zze(zzbhrVar);
        parcel2.writeNoException();
        return true;
    }
}
