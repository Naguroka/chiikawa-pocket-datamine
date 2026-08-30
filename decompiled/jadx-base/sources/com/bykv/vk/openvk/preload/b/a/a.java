package com.bykv.vk.openvk.preload.b.a;

/* JADX INFO: compiled from: ParallelException.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends java.lang.Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.List<java.lang.Throwable> f1696a;

    public a(java.util.List<java.lang.Throwable> list) {
        this.f1696a = list;
        if (list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Throwable> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
        setStackTrace((java.lang.StackTraceElement[]) arrayList.toArray(new java.lang.StackTraceElement[arrayList.size()]));
    }

    private static void a(java.lang.Throwable th, java.util.List<java.lang.StackTraceElement> list) {
        while (th != null) {
            java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i = 0; i < length; i++) {
                java.lang.StackTraceElement stackTraceElement = stackTrace[i];
                if (i == 0) {
                    java.lang.String message = th.getMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    list.add(new java.lang.StackTraceElement(sb.append(message).append("\n\t").append(stackTraceElement.getClassName()).toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            th = th.getCause();
        }
    }
}
