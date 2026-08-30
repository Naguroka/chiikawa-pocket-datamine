package com.apm.insight.j;

/* JADX INFO: compiled from: DeviceIdTask.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.apm.insight.j.a {
    c(android.os.Handler handler) {
        super(handler, androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (com.apm.insight.e.c().b()) {
            return;
        }
        java.lang.String strD = com.apm.insight.e.a().d();
        if (android.text.TextUtils.isEmpty(strD) || "0".equals(strD)) {
            a(b());
            com.apm.insight.a.a((java.lang.Object) "[DeviceIdTask] did is null, continue check.");
        } else {
            com.apm.insight.e.c().a(strD);
            com.apm.insight.a.a((java.lang.Object) "[DeviceIdTask] did is ".concat(java.lang.String.valueOf(strD)));
        }
    }
}
