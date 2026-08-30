package com.google.android.gms.auth.api.signin.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.internal.p000authapi.zzc implements com.google.android.gms.auth.api.signin.internal.zzu {
    zzv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void zzc(com.google.android.gms.auth.api.signin.internal.zzs zzsVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzsVar);
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(101, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void zzd(com.google.android.gms.auth.api.signin.internal.zzs zzsVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzsVar);
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(102, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zzu
    public final void zze(com.google.android.gms.auth.api.signin.internal.zzs zzsVar, com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, zzsVar);
        com.google.android.gms.internal.p000authapi.zze.zzc(parcelObtainAndWriteInterfaceToken, googleSignInOptions);
        transactAndReadExceptionReturnVoid(103, parcelObtainAndWriteInterfaceToken);
    }
}
