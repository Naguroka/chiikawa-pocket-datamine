package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzj {
    public static boolean zza(int i, com.google.android.gms.drive.DriveId driveId) {
        if (i != 1) {
            if (i == 4 || i == 7) {
                return driveId == null;
            }
            if (i != 8) {
                return false;
            }
        }
        return driveId != null;
    }
}
