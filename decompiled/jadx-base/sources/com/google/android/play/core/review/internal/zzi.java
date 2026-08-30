package com.google.android.play.core.review.internal;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzi {
    private final java.lang.String zza;

    public zzi(java.lang.String str) {
        this.zza = ("UID: [" + android.os.Process.myUid() + "]  PID: [" + android.os.Process.myPid() + "] ").concat(str);
    }

    private static java.lang.String zzf(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = java.lang.String.format(java.util.Locale.US, str2, objArr);
            } catch (java.util.IllegalFormatException e) {
                android.util.Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = str2 + " [" + android.text.TextUtils.join(", ", objArr) + com.ironsource.y8.i.e;
            }
        }
        return str + " : " + str2;
    }

    public final int zza(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 3)) {
            return android.util.Log.d("PlayCore", zzf(this.zza, "Already connected to the service.", objArr));
        }
        return 0;
    }

    public final int zzb(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zzf(this.zza, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    public final int zzc(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", zzf(this.zza, str, objArr), th);
        }
        return 0;
    }

    public final int zzd(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            return android.util.Log.i("PlayCore", zzf(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zze(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            return android.util.Log.w("PlayCore", zzf(this.zza, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
