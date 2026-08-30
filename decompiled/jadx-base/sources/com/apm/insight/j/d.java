package com.apm.insight.j;

/* JADX INFO: compiled from: ScheduleTaskManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.util.List<com.apm.insight.j.a> f415a = new java.util.ArrayList(3);

    private d(android.os.Handler handler, android.content.Context context) {
        if (com.apm.insight.l.a.c(context)) {
            this.f415a.add(new com.apm.insight.j.c(handler));
        }
    }

    public static com.apm.insight.j.d a(android.os.Handler handler, android.content.Context context) {
        return new com.apm.insight.j.d(handler, context);
    }

    public final void a() {
        com.apm.insight.a.a((java.lang.Object) ("[ScheduleTaskManager] execute, task size=" + this.f415a.size()));
        java.util.Iterator<com.apm.insight.j.a> it = this.f415a.iterator();
        while (it.hasNext()) {
            try {
                it.next().a();
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
