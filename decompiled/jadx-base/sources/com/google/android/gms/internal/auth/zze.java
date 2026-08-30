package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public interface zze extends android.os.IInterface {
    android.os.Bundle zza(android.accounts.Account account) throws android.os.RemoteException;

    android.os.Bundle zza(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    android.os.Bundle zza(java.lang.String str) throws android.os.RemoteException;

    android.os.Bundle zza(java.lang.String str, android.os.Bundle bundle) throws android.os.RemoteException;

    com.google.android.gms.auth.AccountChangeEventsResponse zza(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest) throws android.os.RemoteException;
}
