package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzev extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzeu {
    public static com.google.android.gms.internal.drive.zzeu zza(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.drive.zzeu) {
            return (com.google.android.gms.internal.drive.zzeu) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.drive.zzew(iBinder);
    }
}
