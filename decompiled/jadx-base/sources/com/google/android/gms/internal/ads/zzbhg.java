package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbhg extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbhh {
    public zzbhg() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static com.google.android.gms.internal.ads.zzbhh zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbhh ? (com.google.android.gms.internal.ads.zzbhh) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbhf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzby zzbyVarZzad = com.google.android.gms.ads.internal.client.zzbx.zzad(parcel.readStrongBinder());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zze(zzbyVarZzad, iObjectWrapperAsInterface);
        parcel2.writeNoException();
        return true;
    }
}
