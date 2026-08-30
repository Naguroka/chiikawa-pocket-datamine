package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzme implements com.google.android.gms.internal.drive.zzlo {
    private final int flags;
    private final java.lang.String info;
    private final java.lang.Object[] zzue;
    private final com.google.android.gms.internal.drive.zzlq zzuh;

    zzme(com.google.android.gms.internal.drive.zzlq zzlqVar, java.lang.String str, java.lang.Object[] objArr) {
        this.zzuh = zzlqVar;
        this.info = str;
        this.zzue = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.flags = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.flags = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    final java.lang.String zzek() {
        return this.info;
    }

    final java.lang.Object[] zzel() {
        return this.zzue;
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final com.google.android.gms.internal.drive.zzlq zzee() {
        return this.zzuh;
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final int zzec() {
        return (this.flags & 1) == 1 ? com.google.android.gms.internal.drive.zzkk.zze.zzsf : com.google.android.gms.internal.drive.zzkk.zze.zzsg;
    }

    @Override // com.google.android.gms.internal.drive.zzlo
    public final boolean zzed() {
        return (this.flags & 2) == 2;
    }
}
