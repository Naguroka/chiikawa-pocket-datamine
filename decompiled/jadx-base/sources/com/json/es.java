package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class es {

    class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f2633a;
        final /* synthetic */ boolean b;
        final /* synthetic */ int c;

        a(java.lang.String str, boolean z, int i) {
            this.f2633a = str;
            this.b = z;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.json.es.c(this.f2633a, this.b, this.c);
        }
    }

    public static void b(java.lang.String str, boolean z, int i) {
        java.lang.Thread thread = new java.lang.Thread(new com.ironsource.es.a(str, z, i), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new com.json.mediationsdk.logger.d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(java.lang.String str, boolean z, int i) {
        try {
            new org.json.JSONObject(com.json.mediationsdk.server.HttpFunctions.getStringFromURL(com.json.mediationsdk.server.ServerURL.getRequestURL(str, z, i)));
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NETWORK, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
        } catch (java.lang.Throwable th) {
            com.json.l9.d().a(th);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("callRequestURL(reqUrl:");
            if (str == null) {
                str = "null";
            }
            sb.append(str);
            sb.append(", hit:").append(z).append(")");
            com.json.mediationsdk.logger.IronSourceLoggerManager.getLogger().log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NETWORK, sb.toString() + ", e:" + android.util.Log.getStackTraceString(th), 0);
        }
    }
}
