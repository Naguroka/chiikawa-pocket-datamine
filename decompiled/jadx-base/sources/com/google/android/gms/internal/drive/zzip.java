package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzip extends com.google.android.gms.internal.drive.zzb implements com.google.android.gms.internal.drive.zzio {
    public static com.google.android.gms.internal.drive.zzio zzb(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.drive.zzio) {
            return (com.google.android.gms.internal.drive.zzio) iInterfaceQueryLocalInterface;
        }
        return new com.google.android.gms.internal.drive.zziq(iBinder);
    }
}
