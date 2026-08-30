package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public final class zzx extends com.google.android.gms.internal.p000authapi.zzc implements com.google.android.gms.internal.p000authapi.zzw {
    zzx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzw
    public final void zzc(com.google.android.gms.internal.p000authapi.zzu zzuVar, com.google.android.gms.auth.api.credentials.CredentialRequest credentialRequest) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, credentialRequest);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzw
    public final void zzc(com.google.android.gms.internal.p000authapi.zzu zzuVar, com.google.android.gms.internal.p000authapi.zzy zzyVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzyVar);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzw
    public final void zzc(com.google.android.gms.internal.p000authapi.zzu zzuVar, com.google.android.gms.internal.p000authapi.zzs zzsVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzuVar);
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzsVar);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzw
    public final void zzc(com.google.android.gms.internal.p000authapi.zzu zzuVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzuVar);
        transactAndReadExceptionReturnVoid(4, parcelObtainAndWriteInterfaceToken);
    }
}
