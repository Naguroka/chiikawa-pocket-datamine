package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbhc extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbhd {
    public zzbhc() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public static com.google.android.gms.internal.ads.zzbhd zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbhd ? (com.google.android.gms.internal.ads.zzbhd) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbhb(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbgq zzbgoVar;
        if (i != 1) {
            return false;
        }
        android.os.IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            zzbgoVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            zzbgoVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbgq ? (com.google.android.gms.internal.ads.zzbgq) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgo(strongBinder);
        }
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zze(zzbgoVar);
        parcel2.writeNoException();
        return true;
    }
}
