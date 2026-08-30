package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzdi {
    private com.google.android.gms.drive.events.OnChangeListener zzgg;
    private com.google.android.gms.internal.drive.zzee zzgh;
    private com.google.android.gms.drive.DriveId zzk;

    zzdi(com.google.android.gms.internal.drive.zzch zzchVar, com.google.android.gms.drive.events.OnChangeListener onChangeListener, com.google.android.gms.drive.DriveId driveId) {
        com.google.android.gms.common.internal.Preconditions.checkState(com.google.android.gms.drive.events.zzj.zza(1, driveId));
        this.zzgg = onChangeListener;
        this.zzk = driveId;
        android.os.Looper looper = zzchVar.getLooper();
        android.content.Context applicationContext = zzchVar.getApplicationContext();
        onChangeListener.getClass();
        com.google.android.gms.internal.drive.zzee zzeeVar = new com.google.android.gms.internal.drive.zzee(looper, applicationContext, 1, com.google.android.gms.internal.drive.zzdj.zza(onChangeListener));
        this.zzgh = zzeeVar;
        zzeeVar.zzf(1);
    }
}
