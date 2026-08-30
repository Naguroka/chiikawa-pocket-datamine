package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zze implements com.google.android.gms.drive.events.zzk {
    private final com.google.android.gms.drive.events.zzm zzcv;
    private final long zzcw;
    private final long zzcx;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.drive.events.zzm, com.google.android.gms.internal.drive.zzf] */
    public zze(com.google.android.gms.internal.drive.zzh zzhVar) {
        this.zzcv = new com.google.android.gms.internal.drive.zzf(zzhVar);
        this.zzcw = zzhVar.zzcw;
        this.zzcx = zzhVar.zzcx;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            com.google.android.gms.internal.drive.zze zzeVar = (com.google.android.gms.internal.drive.zze) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzcv, zzeVar.zzcv) && this.zzcw == zzeVar.zzcw && this.zzcx == zzeVar.zzcx) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zzcx), java.lang.Long.valueOf(this.zzcw), java.lang.Long.valueOf(this.zzcx));
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", this.zzcv.toString(), java.lang.Long.valueOf(this.zzcw), java.lang.Long.valueOf(this.zzcx));
    }
}
