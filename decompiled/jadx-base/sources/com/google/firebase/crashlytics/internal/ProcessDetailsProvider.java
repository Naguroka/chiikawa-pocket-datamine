package com.google.firebase.crashlytics.internal;

/* JADX INFO: compiled from: ProcessDetailsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/crashlytics/internal/ProcessDetailsProvider;", "", "()V", "buildProcessDetails", "Lcom/google/firebase/crashlytics/internal/model/CrashlyticsReport$Session$Event$Application$ProcessDetails;", "processName", "", "pid", "", "importance", "isDefaultProcess", "", "getAppProcessDetails", "", "context", "Landroid/content/Context;", "getCurrentProcessDetails", "getProcessName", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessDetailsProvider {
    public static final com.google.firebase.crashlytics.internal.ProcessDetailsProvider INSTANCE = new com.google.firebase.crashlytics.internal.ProcessDetailsProvider();

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(java.lang.String processName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, 0, 0, false, 14, null);
    }

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(java.lang.String processName, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i, 0, false, 12, null);
    }

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(java.lang.String processName, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "processName");
        return buildProcessDetails$default(this, processName, i, i2, false, 8, null);
    }

    private ProcessDetailsProvider() {
    }

    public final java.util.List<com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(android.content.Context context) {
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
            arrayList3.add(com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(kotlin.jvm.internal.Intrinsics.areEqual(runningAppProcessInfo.processName, str)).build());
        }
        return arrayList3;
    }

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(android.content.Context context) {
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
        } while (!(((com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails) next).getPid() == iMyPid));
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails) next;
        return processDetails == null ? buildProcessDetails$default(this, getProcessName(), iMyPid, 0, false, 12, null) : processDetails;
    }

    public static /* synthetic */ com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(com.google.firebase.crashlytics.internal.ProcessDetailsProvider processDetailsProvider, java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
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

    public final com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(java.lang.String processName, int pid, int importance, boolean isDefaultProcess) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processName, "processName");
        com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails processDetailsBuild = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(processName).setPid(pid).setImportance(importance).setDefaultProcess(isDefaultProcess).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(processDetailsBuild, "builder()\n      .setProc…ltProcess)\n      .build()");
        return processDetailsBuild;
    }

    private final java.lang.String getProcessName() {
        java.lang.String processName;
        if (android.os.Build.VERSION.SDK_INT <= 33) {
            return (android.os.Build.VERSION.SDK_INT < 28 || (processName = android.app.Application.getProcessName()) == null) ? "" : processName;
        }
        java.lang.String strMyProcessName = android.os.Process.myProcessName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strMyProcessName, "{\n      Process.myProcessName()\n    }");
        return strMyProcessName;
    }
}
