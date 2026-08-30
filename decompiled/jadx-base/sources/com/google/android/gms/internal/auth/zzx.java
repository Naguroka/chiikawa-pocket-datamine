package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public interface zzx extends android.os.IInterface {
    void onFailure(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;

    void zza(com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) throws android.os.RemoteException;

    void zza(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.accounttransfer.zzl zzlVar) throws android.os.RemoteException;

    void zza(com.google.android.gms.common.api.Status status, com.google.android.gms.auth.api.accounttransfer.zzt zztVar) throws android.os.RemoteException;

    void zza(byte[] bArr) throws android.os.RemoteException;

    void zzb(com.google.android.gms.common.api.Status status) throws android.os.RemoteException;

    void zzd() throws android.os.RemoteException;
}
