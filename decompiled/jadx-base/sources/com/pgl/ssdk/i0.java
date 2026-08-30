package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.pgl.ssdk.i0 f3794a;
    private android.content.Context b;
    private java.util.List<java.lang.Integer> c = new java.util.ArrayList();

    private i0(android.content.Context context) {
        this.b = null;
        this.b = context;
    }

    public static com.pgl.ssdk.i0 a(android.content.Context context) {
        if (f3794a == null) {
            synchronized (com.pgl.ssdk.i0.class) {
                if (f3794a == null) {
                    f3794a = new com.pgl.ssdk.i0(context);
                }
            }
        }
        return f3794a;
    }

    public int b() {
        android.content.Intent intentRegisterReceiver = this.b.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return intentRegisterReceiver.getIntExtra("plugged", 0);
    }

    public int c() {
        android.content.Intent intentRegisterReceiver = this.b.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return 0;
        }
        return java.lang.Math.round(((intentRegisterReceiver.getIntExtra("level", 0) / intentRegisterReceiver.getIntExtra("scale", 0)) * 100.0f) * 10.0f) / 10;
    }

    public synchronized java.lang.String d() {
        if (this.c.size() <= 0) {
            return "-1";
        }
        java.util.List<java.lang.Integer> list = this.c;
        return java.lang.String.valueOf(list.get(list.size() - 1).intValue() % 10000);
    }

    public synchronized java.lang.String e() {
        return new org.json.JSONArray((java.util.Collection) this.c).toString();
    }

    public int f() {
        int iB;
        try {
            synchronized (this) {
                try {
                    iB = b();
                    try {
                        return (iB * 10000) + c();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        try {
                            throw th;
                        } catch (java.lang.Exception unused) {
                            return (iB * 10000) + 0;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    iB = 0;
                }
            }
        } catch (java.lang.Exception unused2) {
            iB = 0;
        }
    }

    public void a() {
        int iF = f();
        if (iF == -1) {
            return;
        }
        this.c.add(java.lang.Integer.valueOf(iF));
        try {
            int size = this.c.size();
            if (size > 20) {
                java.util.ArrayList arrayList = new java.util.ArrayList(this.c.subList(size - 10, size));
                this.c.clear();
                this.c = arrayList;
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
