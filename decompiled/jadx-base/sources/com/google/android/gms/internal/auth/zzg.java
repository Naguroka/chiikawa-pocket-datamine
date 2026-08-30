package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzg extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.internal.auth.zze {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final android.os.Bundle zza(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, bundle);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(2, parcelObtainAndWriteInterfaceToken);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(parcelTransactAndReadException, android.os.Bundle.CREATOR);
        parcelTransactAndReadException.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final com.google.android.gms.auth.AccountChangeEventsResponse zza(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, accountChangeEventsRequest);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(3, parcelObtainAndWriteInterfaceToken);
        com.google.android.gms.auth.AccountChangeEventsResponse accountChangeEventsResponse = (com.google.android.gms.auth.AccountChangeEventsResponse) com.google.android.gms.internal.auth.zzc.zza(parcelTransactAndReadException, com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR);
        parcelTransactAndReadException.recycle();
        return accountChangeEventsResponse;
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final android.os.Bundle zza(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, account);
        parcelObtainAndWriteInterfaceToken.writeString(str);
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, bundle);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(5, parcelObtainAndWriteInterfaceToken);
        android.os.Bundle bundle2 = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(parcelTransactAndReadException, android.os.Bundle.CREATOR);
        parcelTransactAndReadException.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final android.os.Bundle zza(android.accounts.Account account) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.auth.zzc.zza(parcelObtainAndWriteInterfaceToken, account);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(7, parcelObtainAndWriteInterfaceToken);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(parcelTransactAndReadException, android.os.Bundle.CREATOR);
        parcelTransactAndReadException.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zze
    public final android.os.Bundle zza(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        parcelObtainAndWriteInterfaceToken.writeString(str);
        android.os.Parcel parcelTransactAndReadException = transactAndReadException(8, parcelObtainAndWriteInterfaceToken);
        android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.auth.zzc.zza(parcelTransactAndReadException, android.os.Bundle.CREATOR);
        parcelTransactAndReadException.recycle();
        return bundle;
    }
}
