package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbaf extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbag {
    public zzbaf() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static com.google.android.gms.internal.ads.zzbag zze(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbag ? (com.google.android.gms.internal.ads.zzbag) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbae(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbad zzbabVar;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                zzbabVar = null;
            } else {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzbabVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbad ? (com.google.android.gms.internal.ads.zzbad) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbab(strongBinder);
            }
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzd(zzbabVar);
        } else if (i == 2) {
            parcel.readInt();
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) com.google.android.gms.internal.ads.zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            com.google.android.gms.internal.ads.zzayc.zzc(parcel);
            zzc(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
