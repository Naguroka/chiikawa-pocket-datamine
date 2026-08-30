package com.google.android.gms.internal.p001authapiphone;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.internal.p001authapiphone.zza implements com.google.android.gms.internal.p001authapiphone.zze {
    zzf(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public final void zza(com.google.android.gms.internal.p001authapiphone.zzg zzgVar) throws android.os.RemoteException {
        android.os.Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.gms.internal.p001authapiphone.zzc.zza(parcelObtainAndWriteInterfaceToken, zzgVar);
        transactAndReadExceptionReturnVoid(1, parcelObtainAndWriteInterfaceToken);
    }
}
