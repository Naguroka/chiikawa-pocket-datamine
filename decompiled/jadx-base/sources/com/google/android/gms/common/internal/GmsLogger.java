package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class GmsLogger {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    public GmsLogger(java.lang.String str) {
        this(str, null);
    }

    private final java.lang.String zza(java.lang.String str) {
        java.lang.String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final java.lang.String zzb(java.lang.String str, java.lang.Object... objArr) {
        java.lang.String str2 = this.zzb;
        java.lang.String str3 = java.lang.String.format(str, objArr);
        return str2 == null ? str3 : str2.concat(str3);
    }

    public boolean canLog(int i) {
        return android.util.Log.isLoggable(this.zza, i);
    }

    public boolean canLogPii() {
        return false;
    }

    public void d(java.lang.String str, java.lang.String str2) {
        if (canLog(3)) {
            android.util.Log.d(str, zza(str2));
        }
    }

    public void e(java.lang.String str, java.lang.String str2) {
        if (canLog(6)) {
            android.util.Log.e(str, zza(str2));
        }
    }

    public void efmt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (canLog(6)) {
            android.util.Log.e(str, zzb(str2, objArr));
        }
    }

    public void i(java.lang.String str, java.lang.String str2) {
        if (canLog(4)) {
            android.util.Log.i(str, zza(str2));
        }
    }

    public void pii(java.lang.String str, java.lang.String str2) {
    }

    public void pii(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
    }

    public void v(java.lang.String str, java.lang.String str2) {
        if (canLog(2)) {
            android.util.Log.v(str, zza(str2));
        }
    }

    public void w(java.lang.String str, java.lang.String str2) {
        if (canLog(5)) {
            android.util.Log.w(str, zza(str2));
        }
    }

    public void wfmt(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (canLog(5)) {
            android.util.Log.w(this.zza, zzb(str2, objArr));
        }
    }

    public void wtf(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(7)) {
            android.util.Log.e(str, zza(str2), th);
            android.util.Log.wtf(str, zza(str2), th);
        }
    }

    public GmsLogger(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "log tag cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        this.zzb = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    public void d(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(3)) {
            android.util.Log.d(str, zza(str2), th);
        }
    }

    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(6)) {
            android.util.Log.e(str, zza(str2), th);
        }
    }

    public void i(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(4)) {
            android.util.Log.i(str, zza(str2), th);
        }
    }

    public void v(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(2)) {
            android.util.Log.v(str, zza(str2), th);
        }
    }

    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        if (canLog(5)) {
            android.util.Log.w(str, zza(str2), th);
        }
    }
}
