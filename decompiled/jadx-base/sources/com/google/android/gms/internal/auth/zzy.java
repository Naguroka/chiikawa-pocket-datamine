package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzy extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 1:
                zzb((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 2:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzt) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzt.CREATOR));
                return true;
            case 3:
                zza((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR), (com.google.android.gms.auth.api.accounttransfer.zzl) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.zzl.CREATOR));
                return true;
            case 4:
                zzd();
                return true;
            case 5:
                onFailure((com.google.android.gms.common.api.Status) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.common.api.Status.CREATOR));
                return true;
            case 6:
                zza(parcel.createByteArray());
                return true;
            case 7:
                zza((com.google.android.gms.auth.api.accounttransfer.DeviceMetaData) com.google.android.gms.internal.auth.zzc.zza(parcel, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
