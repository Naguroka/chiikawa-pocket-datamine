package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbgz extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbha {
    public zzbgz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static com.google.android.gms.internal.ads.zzbha zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbha ? (com.google.android.gms.internal.ads.zzbha) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbgy(iBinder);
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
        java.lang.String string = parcel.readString();
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zze(zzbgoVar, string);
        parcel2.writeNoException();
        return true;
    }
}
