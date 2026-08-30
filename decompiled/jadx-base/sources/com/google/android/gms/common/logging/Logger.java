package com.google.android.gms.common.logging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class Logger {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.common.internal.GmsLogger zzc;
    private final int zzd;

    public Logger(java.lang.String str, java.lang.String... strArr) {
        java.lang.String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append('[');
            for (java.lang.String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.zzb = string;
        this.zza = str;
        this.zzc = new com.google.android.gms.common.internal.GmsLogger(str);
        int i = 2;
        while (i <= 7 && !android.util.Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    public void d(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(3)) {
            android.util.Log.d(this.zza, format(str, objArr));
        }
    }

    public void e(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        android.util.Log.e(this.zza, format(str, objArr), th);
    }

    protected java.lang.String format(java.lang.String str, java.lang.Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = java.lang.String.format(java.util.Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    public java.lang.String getTag() {
        return this.zza;
    }

    public void i(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.i(this.zza, format(str, objArr));
    }

    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    public void v(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            android.util.Log.v(this.zza, format(str, objArr), th);
        }
    }

    public void w(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.w(this.zza, format(str, objArr));
    }

    public void wtf(java.lang.String str, java.lang.Throwable th, java.lang.Object... objArr) {
        android.util.Log.wtf(this.zza, format(str, objArr), th);
    }

    public void e(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e(this.zza, format(str, objArr));
    }

    public void wtf(java.lang.Throwable th) {
        android.util.Log.wtf(this.zza, th);
    }

    public void v(java.lang.String str, java.lang.Object... objArr) {
        if (isLoggable(2)) {
            android.util.Log.v(this.zza, format(str, objArr));
        }
    }
}
