package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfpm extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.internal.ads.zzfpn {
    public zzfpm() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 5:
                parcel.createByteArray();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 6:
                parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 7:
                parcel.readInt();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            case 8:
                com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                com.google.android.gms.internal.ads.zzayc.zzc(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
