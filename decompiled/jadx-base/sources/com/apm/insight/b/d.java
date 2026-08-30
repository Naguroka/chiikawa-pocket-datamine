package com.apm.insight.b;

/* JADX INFO: compiled from: ANRUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static java.lang.String f366a = null;
    private static long b = -1;
    private static boolean c = false;
    private static android.os.FileObserver d;
    private static android.app.ActivityManager.ProcessErrorStateInfo e;

    public static void a(final java.lang.String str, final com.apm.insight.b.h.a aVar) {
        android.os.FileObserver fileObserver = d;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
        android.os.FileObserver fileObserver2 = new android.os.FileObserver(str) { // from class: com.apm.insight.b.d.1
            @Override // android.os.FileObserver
            public final void onEvent(int i, java.lang.String str2) {
                if (android.text.TextUtils.isEmpty(str2)) {
                    return;
                }
                try {
                    java.lang.String unused = com.apm.insight.b.d.f366a = aVar.a();
                } catch (java.lang.Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            }
        };
        d = fileObserver2;
        fileObserver2.startWatching();
    }

    public static org.json.JSONObject a() throws org.json.JSONException {
        try {
            java.lang.StackTraceElement[] stackTrace = android.os.Looper.getMainLooper().getThread().getStackTrace();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("thread_number", 1);
            jSONObject.put("mainStackFromTrace", com.apm.insight.l.m.a(stackTrace));
            return jSONObject;
        } catch (java.lang.Throwable th) {
            com.apm.insight.c.a();
            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            return null;
        }
    }

    static java.lang.String a(android.content.Context context) {
        if (android.os.SystemClock.uptimeMillis() - b < 5000) {
            return null;
        }
        try {
            android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfoB = com.apm.insight.l.a.b(context);
            if (processErrorStateInfoB != null && android.os.Process.myPid() == processErrorStateInfoB.pid) {
                android.app.ActivityManager.ProcessErrorStateInfo processErrorStateInfo = e;
                if (processErrorStateInfo != null) {
                    if (java.lang.String.valueOf(processErrorStateInfo.condition).equals(java.lang.String.valueOf(processErrorStateInfoB.condition)) && java.lang.String.valueOf(processErrorStateInfo.processName).equals(java.lang.String.valueOf(processErrorStateInfoB.processName)) && java.lang.String.valueOf(processErrorStateInfo.pid).equals(java.lang.String.valueOf(processErrorStateInfoB.pid)) && java.lang.String.valueOf(processErrorStateInfo.uid).equals(java.lang.String.valueOf(processErrorStateInfoB.uid)) && java.lang.String.valueOf(processErrorStateInfo.tag).equals(java.lang.String.valueOf(processErrorStateInfoB.tag)) && java.lang.String.valueOf(processErrorStateInfo.shortMsg).equals(java.lang.String.valueOf(processErrorStateInfoB.shortMsg)) && java.lang.String.valueOf(processErrorStateInfo.longMsg).equals(java.lang.String.valueOf(processErrorStateInfoB.longMsg))) {
                        return null;
                    }
                }
                e = processErrorStateInfoB;
                f366a = null;
                b = android.os.SystemClock.uptimeMillis();
                c = false;
                if (!com.apm.insight.e.t()) {
                    return "|------------- processErrorStateInfo--------------|\ndisable anr info\n\"-----------------------end----------------------------\"";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("|------------- processErrorStateInfo--------------|\n");
                sb.append("condition: " + processErrorStateInfoB.condition + "\n");
                sb.append("processName: " + processErrorStateInfoB.processName + "\n");
                sb.append("pid: " + processErrorStateInfoB.pid + "\n");
                sb.append("uid: " + processErrorStateInfoB.uid + "\n");
                sb.append("tag: " + processErrorStateInfoB.tag + "\n");
                sb.append("shortMsg : " + processErrorStateInfoB.shortMsg + "\n");
                sb.append("longMsg : " + processErrorStateInfoB.longMsg + "\n");
                sb.append("-----------------------end----------------------------");
                return sb.toString();
            }
        } catch (java.lang.Throwable unused) {
        }
        java.lang.String str = f366a;
        if (str == null) {
            return null;
        }
        c = true;
        f366a = null;
        b = android.os.SystemClock.uptimeMillis();
        return str;
    }

    public static boolean b() {
        return c;
    }

    public static void c() {
        e = null;
    }
}
