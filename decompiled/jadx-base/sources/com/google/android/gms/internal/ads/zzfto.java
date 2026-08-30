package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfto {
    private final java.lang.String zza;

    public zzfto(java.lang.String str) {
        this.zza = ("UID: [" + android.os.Process.myUid() + "]  PID: [" + android.os.Process.myPid() + "] ").concat(str);
    }

    private static java.lang.String zze(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(java.lang.String.valueOf(str2)), e);
                str2 = str2 + " [" + android.text.TextUtils.join(", ", objArr) + com.ironsource.y8.i.e;
            }
        }
        return str + " : " + str2;
    }

    public final int zza(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zze(this.zza, str, objArr), th);
        }
        return 0;
    }

    public final int zzc(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            return android.util.Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            return android.util.Log.w("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }
}
