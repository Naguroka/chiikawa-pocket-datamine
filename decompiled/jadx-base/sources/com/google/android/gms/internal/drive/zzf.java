package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzf {
    private final int status;
    private final int zzct;
    private final com.google.android.gms.drive.DriveId zzk;

    public zzf(com.google.android.gms.internal.drive.zzh zzhVar) {
        this.zzk = zzhVar.zzk;
        this.zzct = zzhVar.zzct;
        this.status = zzhVar.status;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            com.google.android.gms.internal.drive.zzf zzfVar = (com.google.android.gms.internal.drive.zzf) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzk, zzfVar.zzk) && this.zzct == zzfVar.zzct && this.status == zzfVar.status) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzk, java.lang.Integer.valueOf(this.zzct), java.lang.Integer.valueOf(this.status));
    }

    public final java.lang.String toString() {
        return java.lang.String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", java.lang.Integer.valueOf(this.zzct), this.zzk, java.lang.Integer.valueOf(this.status));
    }
}
