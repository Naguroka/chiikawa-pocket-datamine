package com.apm.insight.l;

/* JADX INFO: compiled from: Filters.java */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.util.Set<java.lang.String> f445a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f445a = hashSet;
        hashSet.add("HeapTaskDaemon");
        hashSet.add("ThreadPlus");
        hashSet.add("ApiDispatcher");
        hashSet.add("ApiLocalDispatcher");
        hashSet.add("AsyncLoader");
        hashSet.add("AsyncTask");
        hashSet.add("Binder");
        hashSet.add("PackageProcessor");
        hashSet.add("SettingsObserver");
        hashSet.add("WifiManager");
        hashSet.add("JavaBridge");
        hashSet.add("Compiler");
        hashSet.add("Signal Catcher");
        hashSet.add("GC");
        hashSet.add("ReferenceQueueDaemon");
        hashSet.add("FinalizerDaemon");
        hashSet.add("FinalizerWatchdogDaemon");
        hashSet.add("CookieSyncManager");
        hashSet.add("RefQueueWorker");
        hashSet.add("CleanupReference");
        hashSet.add("VideoManager");
        hashSet.add("DBHelper-AsyncOp");
        hashSet.add("InstalledAppTracker2");
        hashSet.add("AppData-AsyncOp");
        hashSet.add("IdleConnectionMonitor");
        hashSet.add("LogReaper");
        hashSet.add("ActionReaper");
        hashSet.add("Okio Watchdog");
        hashSet.add("CheckWaitingQueue");
        hashSet.add("NPTH-CrashTimer");
        hashSet.add("NPTH-JavaCallback");
        hashSet.add("NPTH-LocalParser");
        hashSet.add("ANR_FILE_MODIFY");
    }

    public static java.util.Set<java.lang.String> a() {
        return f445a;
    }

    public static boolean a(java.lang.Throwable th) {
        return th == null || (th instanceof org.apache.http.conn.ConnectTimeoutException) || (th instanceof java.net.SocketTimeoutException) || (th instanceof java.net.BindException) || (th instanceof java.net.ConnectException) || (th instanceof java.net.NoRouteToHostException) || (th instanceof java.net.PortUnreachableException) || (th instanceof java.net.SocketException) || (th instanceof java.net.UnknownHostException) || (th instanceof java.net.ProtocolException) || (th instanceof javax.net.ssl.SSLException);
    }
}
