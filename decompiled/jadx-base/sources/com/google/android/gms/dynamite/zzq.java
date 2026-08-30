package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzq extends com.google.android.gms.internal.common.zza implements android.os.IInterface {
    zzq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        android.os.Parcel parcelZzB = zzB(2, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return iObjectWrapperAsInterface;
    }

    public final com.google.android.gms.dynamic.IObjectWrapper zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str, int i, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) throws android.os.RemoteException {
        android.os.Parcel parcelZza = zza();
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(parcelZza, iObjectWrapper2);
        android.os.Parcel parcelZzB = zzB(3, parcelZza);
        com.google.android.gms.dynamic.IObjectWrapper iObjectWrapperAsInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return iObjectWrapperAsInterface;
    }
}
