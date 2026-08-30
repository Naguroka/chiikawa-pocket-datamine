package com.google.firebase.sessions;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\r\u0010\u0011\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/ProcessDetailsProvider;", "", "()V", "buildProcessDetails", "Lcom/google/firebase/sessions/ProcessDetails;", "processName", "", "pid", "", "importance", "isDefaultProcess", "", "getAppProcessDetails", "", "context", "Landroid/content/Context;", "getCurrentProcessDetails", "getProcessName", "getProcessName$com_google_firebase_firebase_sessions", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessDetailsProvider {
    public static final com.google.firebase.sessions.ProcessDetailsProvider INSTANCE = new com.google.firebase.sessions.ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public final java.util.List<com.google.firebase.sessions.ProcessDetails> getAppProcessDetails(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().uid;
        java.lang.String str = context.getApplicationInfo().processName;
        java.lang.Object systemService = context.getSystemService("activity");
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List listFilterNotNull = kotlin.collections.CollectionsKt.filterNotNull(runningAppProcesses);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listFilterNotNull) {
            if (((android.app.ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<android.app.ActivityManager.RunningAppProcessInfo> arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList2) {
            java.lang.String str2 = runningAppProcessInfo.processName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "runningAppProcessInfo.processName");
            arrayList3.add(new com.google.firebase.sessions.ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, kotlin.jvm.internal.Intrinsics.areEqual(runningAppProcessInfo.processName, str)));
        }
        return arrayList3;
    }

    public final com.google.firebase.sessions.ProcessDetails getCurrentProcessDetails(android.content.Context context) {
        java.lang.Object next;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = android.os.Process.myPid();
        java.util.Iterator<T> it = getAppProcessDetails(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((com.google.firebase.sessions.ProcessDetails) next).getPid() == iMyPid));
        com.google.firebase.sessions.ProcessDetails processDetails = (com.google.firebase.sessions.ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, getProcessName$com_google_firebase_firebase_sessions(), iMyPid, 0, false, 12, null) : processDetails;
    }

    static /* synthetic */ com.google.firebase.sessions.ProcessDetails buildProcessDetails$default(com.google.firebase.sessions.ProcessDetailsProvider processDetailsProvider, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i, i2, z);
    }

    private final com.google.firebase.sessions.ProcessDetails buildProcessDetails(java.lang.String processName, int pid, int importance, boolean isDefaultProcess) {
        return new com.google.firebase.sessions.ProcessDetails(processName, pid, importance, isDefaultProcess);
    }

    public final java.lang.String getProcessName$com_google_firebase_firebase_sessions() throws java.lang.Throwable {
        java.lang.String processName;
        if (android.os.Build.VERSION.SDK_INT > 33) {
            java.lang.String strMyProcessName = android.os.Process.myProcessName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strMyProcessName, "myProcessName()");
            return strMyProcessName;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28 && (processName = android.app.Application.getProcessName()) != null) {
            return processName;
        }
        java.lang.String myProcessName = com.google.android.gms.common.util.ProcessUtils.getMyProcessName();
        return myProcessName != null ? myProcessName : "";
    }
}
