package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f3813a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static boolean g = false;
    private static android.hardware.input.InputManager h;

    static class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.content.Context f3814a;
        final /* synthetic */ int b;

        a(android.content.Context context, int i) {
            this.f3814a = context;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            android.hardware.input.InputManager inputManagerB = com.pgl.ssdk.w.b(this.f3814a);
            if (inputManagerB == null) {
                return;
            }
            android.view.InputDevice inputDevice = inputManagerB.getInputDevice(this.b);
            com.pgl.ssdk.w.g();
            if (inputDevice == null) {
                com.pgl.ssdk.w.a();
                com.pgl.ssdk.w.b();
                com.pgl.ssdk.w.b("nihc");
            } else if (inputDevice.isVirtual()) {
                com.pgl.ssdk.w.c();
                com.pgl.ssdk.w.d();
                com.pgl.ssdk.w.b("vihc");
            } else {
                if (android.os.Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                com.pgl.ssdk.w.e();
                com.pgl.ssdk.w.f();
                com.pgl.ssdk.w.b("eihc");
            }
        }
    }

    static /* synthetic */ int b() {
        int i = f;
        f = i + 1;
        return i;
    }

    static /* synthetic */ int c() {
        int i = f3813a;
        f3813a = i + 1;
        return i;
    }

    static /* synthetic */ int d() {
        int i = d;
        d = i + 1;
        return i;
    }

    static /* synthetic */ int e() {
        int i = b;
        b = i + 1;
        return i;
    }

    static /* synthetic */ int f() {
        int i = e;
        e = i + 1;
        return i;
    }

    public static void g() {
        if (g) {
            return;
        }
        try {
            android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
            if (sharedPreferencesA != null) {
                f = sharedPreferencesA.getInt("nihc", 0);
                e = sharedPreferencesA.getInt("eihc", 0);
                d = sharedPreferencesA.getInt("vihc", 0);
                g = true;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    static /* synthetic */ int a() {
        int i = c;
        c = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(java.lang.String str) {
        try {
            android.content.SharedPreferences sharedPreferencesA = com.pgl.ssdk.u0.a(com.pgl.ssdk.x.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void a(android.view.MotionEvent motionEvent, android.content.Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            com.pgl.ssdk.o0.b(new com.pgl.ssdk.w.a(context, motionEvent.getDeviceId()));
        }
    }

    public static void a(org.json.JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", d);
            jSONObject.put("eihc", e);
            jSONObject.put("nihc", f);
            jSONObject.put("vic", f3813a);
            jSONObject.put("nic", c);
            jSONObject.put("eic", b);
        } catch (org.json.JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.hardware.input.InputManager b(android.content.Context context) {
        if (h == null) {
            h = (android.hardware.input.InputManager) context.getSystemService("input");
        }
        return h;
    }
}
