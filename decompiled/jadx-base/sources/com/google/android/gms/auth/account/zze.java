package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
public final class zze extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.auth.account.zzc {
    zze(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zzb(boolean z) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.writeBoolean(parcelObtainAndWriteInterfaceToken, z);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zza(com.google.android.gms.auth.account.zza zzaVar, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, zzaVar);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        transactAndReadExceptionReturnVoid(2, parcelObtainAndWriteInterfaceToken);
    }

    @Override // com.google.android.gms.auth.account.zzc
    public final void zza(com.google.android.gms.auth.account.zza zzaVar, android.accounts.Account account) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, zzaVar);
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, account);
        transactAndReadExceptionReturnVoid(3, parcelObtainAndWriteInterfaceToken);
    }
}
