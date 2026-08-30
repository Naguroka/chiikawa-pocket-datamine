package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzy extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzz {
    public zzy() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static com.google.android.gms.common.internal.zzz zzg(android.os.IBinder iBinder) {
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof com.google.android.gms.common.internal.zzz ? (com.google.android.gms.common.internal.zzz) iInterfaceQueryLocalInterface : new com.google.android.gms.common.internal.zzx(iBinder);
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperZzd = zzd();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.zzc.zze(parcel2, iObjectWrapperZzd);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
