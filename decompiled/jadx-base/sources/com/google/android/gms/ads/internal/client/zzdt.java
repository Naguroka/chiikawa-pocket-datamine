package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdt extends com.google.android.gms.internal.ads.zzayb implements com.google.android.gms.ads.internal.client.zzdu {
    public zzdt() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    protected final boolean zzdD(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i != 1) {
            return false;
        }
        java.lang.String string = parcel.readString();
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        com.google.android.gms.internal.ads.zzayc.zzc(parcel);
        zze(string, iObjectWrapperAsInterface, iObjectWrapperAsInterface2);
        parcel2.writeNoException();
        return true;
    }
}
