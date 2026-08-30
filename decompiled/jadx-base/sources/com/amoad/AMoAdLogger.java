package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class AMoAdLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.amoad.AMoAdLogger f136a;
    private boolean b = false;
    private com.amoad.AMoAdLoggerListener c;

    private AMoAdLogger() {
    }

    public static synchronized com.amoad.AMoAdLogger getInstance() {
        if (f136a == null) {
            f136a = new com.amoad.AMoAdLogger();
        }
        return f136a;
    }

    public final void d(java.lang.String str) {
        log(3, str, null);
    }

    public final void e(java.lang.String str) {
        log(6, str, null);
    }

    public final void e(java.lang.Throwable th) {
        log(6, "error:", th);
    }

    public final void i(java.lang.String str) {
        log(4, str, null);
    }

    public final void log(int i, java.lang.String str, java.lang.Throwable th) {
        if (this.b) {
            java.lang.String str2 = java.lang.String.format("AMoAdSDK(ver%s)", com.amoad.AMoAdBuildConfig.SDK_VERSION);
            if (str == null) {
                str = "";
            }
            com.amoad.AMoAdLoggerListener aMoAdLoggerListener = this.c;
            if (aMoAdLoggerListener != null) {
                aMoAdLoggerListener.onLog(i, str2, str, th);
                return;
            }
            if (i == 2) {
                if (th != null) {
                    android.util.Log.v(str2, str, th);
                    return;
                } else {
                    android.util.Log.v(str2, str);
                    return;
                }
            }
            if (i == 3) {
                if (th != null) {
                    android.util.Log.d(str2, str, th);
                    return;
                } else {
                    android.util.Log.d(str2, str);
                    return;
                }
            }
            if (i == 4) {
                if (th != null) {
                    android.util.Log.i(str2, str, th);
                    return;
                } else {
                    android.util.Log.i(str2, str);
                    return;
                }
            }
            if (i == 5) {
                if (th != null) {
                    android.util.Log.w(str2, str, th);
                    return;
                } else {
                    android.util.Log.w(str2, str);
                    return;
                }
            }
            if (i != 6) {
                return;
            }
            if (th != null) {
                android.util.Log.e(str2, str, th);
            } else {
                android.util.Log.e(str2, str);
            }
        }
    }

    public final void setAMoAdLoggerListener(com.amoad.AMoAdLoggerListener aMoAdLoggerListener) {
        this.c = aMoAdLoggerListener;
    }

    public final void setEnabled(boolean z) {
        this.b = z;
        if (z) {
            i(java.lang.String.format("AMoAd SDK for Android ver %s (C) CA Wise, Inc.", com.amoad.AMoAdBuildConfig.SDK_VERSION));
        }
    }

    public final void v(java.lang.String str) {
        log(2, str, null);
    }

    public final void w(java.lang.String str) {
        log(5, str, null);
    }

    public final void w(java.lang.Throwable th) {
        log(5, "warn:", th);
    }
}
