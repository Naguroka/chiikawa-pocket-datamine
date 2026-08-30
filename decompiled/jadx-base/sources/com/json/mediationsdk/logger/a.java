package com.json.mediationsdk.logger;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.json.mediationsdk.logger.IronSourceLogger {
    public static final java.lang.String c = "console";
    public static final java.lang.String d = "ironSourceSDK: ";

    private a() {
        super("console");
    }

    public a(int i) {
        super("console", i);
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        java.lang.String str2 = "UIThread: " + (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) + " ";
        java.lang.String str3 = "Activity: " + (com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity() != null ? java.lang.Integer.valueOf(com.json.environment.ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : java.lang.Boolean.FALSE) + " ";
        if (i == 0) {
            android.util.Log.v(d + ironSourceTag, str2 + str3 + str);
            return;
        }
        if (i == 1) {
            android.util.Log.i(d + ironSourceTag, str);
        } else if (i == 2) {
            android.util.Log.w(d + ironSourceTag, str);
        } else {
            if (i != 3) {
                return;
            }
            android.util.Log.e(d + ironSourceTag, str);
        }
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.Throwable th) {
        log(ironSourceTag, str + ":stacktrace[" + android.util.Log.getStackTraceString(th) + com.ironsource.y8.i.e, 3);
    }
}
