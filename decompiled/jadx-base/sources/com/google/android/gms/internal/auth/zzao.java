package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzao extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.internal.auth.zzan {
    zzao(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    @Override // com.google.android.gms.internal.auth.zzan
    public final void zza(com.google.android.gms.internal.auth.zzal zzalVar, com.google.android.gms.auth.api.proxy.ProxyRequest proxyRequest) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, zzalVar);
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, proxyRequest);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.auth.zzan
    public final void zza(com.google.android.gms.internal.auth.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, zzalVar);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }
}
