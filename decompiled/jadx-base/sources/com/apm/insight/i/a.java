package com.apm.insight.i;

/* JADX INFO: compiled from: DeviceUuidFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile java.util.UUID f410a = null;
    private static java.lang.String b = "";

    public static synchronized java.lang.String a(android.content.Context context) {
        if (android.text.TextUtils.isEmpty(b)) {
            new com.apm.insight.i.a(context);
            java.util.UUID uuid = f410a;
            if (uuid != null) {
                b = uuid.toString();
            }
        }
        return b;
    }

    private a(android.content.Context context) {
        java.lang.String string;
        if (f410a == null) {
            synchronized (com.apm.insight.i.a.class) {
                if (f410a == null) {
                    java.lang.String strC = com.apm.insight.runtime.q.a().c();
                    if (strC != null) {
                        f410a = java.util.UUID.fromString(strC);
                    } else {
                        try {
                            string = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (java.lang.Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f410a = java.util.UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f410a = java.util.UUID.randomUUID();
                            }
                        } catch (java.lang.Throwable unused2) {
                        }
                        try {
                            com.apm.insight.runtime.q.a().b(f410a.toString());
                        } catch (java.lang.Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
