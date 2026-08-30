package com.google.android.gms.drive.metadata.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzk {
    private java.lang.String zzji;

    public static com.google.android.gms.drive.metadata.internal.zzk zzg(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(str == null || !str.isEmpty());
        if (str == null) {
            return null;
        }
        return new com.google.android.gms.drive.metadata.internal.zzk(str);
    }

    private zzk(java.lang.String str) {
        this.zzji = str.toLowerCase(java.util.Locale.US);
    }

    public final boolean isFolder() {
        return this.zzji.equals(com.google.android.gms.drive.DriveFolder.MIME_TYPE);
    }

    public final boolean zzbh() {
        return this.zzji.startsWith("application/vnd.google-apps");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.zzji.equals(((com.google.android.gms.drive.metadata.internal.zzk) obj).zzji);
    }

    public final int hashCode() {
        return this.zzji.hashCode();
    }

    public final java.lang.String toString() {
        return this.zzji;
    }
}
