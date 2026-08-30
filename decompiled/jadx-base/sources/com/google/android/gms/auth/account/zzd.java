package com.google.android.gms.auth.account;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzd extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.auth.account.zzc {
    public static com.google.android.gms.auth.account.zzc zzc(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.auth.account.zzc) {
            return (com.google.android.gms.auth.account.zzc) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.auth.account.zze(iBinder);
    }
}
