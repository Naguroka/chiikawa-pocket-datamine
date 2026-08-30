package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzf extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zze {
    public static com.google.android.gms.internal.auth.zze zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.auth.zze) {
            return (com.google.android.gms.internal.auth.zze) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.auth.zzg(iBinder);
    }
}
