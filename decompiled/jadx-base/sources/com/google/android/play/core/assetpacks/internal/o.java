package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f2248a;

    public o(java.lang.String str) {
        this.f2248a = ("UID: [" + android.os.Process.myUid() + "]  PID: [" + android.os.Process.myPid() + "] ").concat(str);
    }

    private static java.lang.String f(java.lang.String str, java.lang.String str2, java.lang.Object... objArr) {
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

    public final int a(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 3)) {
            return android.util.Log.d("PlayCore", f(this.f2248a, str, objArr));
        }
        return 0;
    }

    public final int b(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", f(this.f2248a, str, objArr));
        }
        return 0;
    }

    public final int c(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 6)) {
            return android.util.Log.e("PlayCore", f(this.f2248a, str, objArr), th);
        }
        return 0;
    }

    public final int d(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 4)) {
            return android.util.Log.i("PlayCore", f(this.f2248a, str, objArr));
        }
        return 0;
    }

    public final int e(java.lang.String str, java.lang.Object... objArr) {
        if (android.util.Log.isLoggable("PlayCore", 5)) {
            return android.util.Log.w("PlayCore", f(this.f2248a, str, objArr));
        }
        return 0;
    }
}
