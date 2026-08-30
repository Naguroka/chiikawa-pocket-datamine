package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbfo extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzbfp {
    public zzbfo() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static com.google.android.gms.internal.ads.zzbfp zzj(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.ads.zzbfp ? (com.google.android.gms.internal.ads.zzbfp) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.ads.zzbfn(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 2) {
            java.lang.String strZzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(strZzg);
            return true;
        }
        if (i != 3) {
            return false;
        }
        java.util.List listZzh = zzh();
        parcel2.writeNoException();
        parcel2.writeList(listZzh);
        return true;
    }
}
