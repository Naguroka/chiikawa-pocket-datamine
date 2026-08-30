package com.pgl.ssdk;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile android.hardware.display.DisplayManager.DisplayListener f3818a = null;
    private static volatile boolean b = false;
    private static java.lang.String c;
    private static java.lang.String d;
    private static java.lang.String e;
    private static android.hardware.display.DisplayManager f;

    static class a implements android.hardware.display.DisplayManager.DisplayListener {
        a() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            com.pgl.ssdk.y.b(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            com.pgl.ssdk.y.b(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            com.pgl.ssdk.y.b(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, int i2) {
        if (i == 0) {
            return;
        }
        try {
            java.lang.String strA = a(i);
            if (i2 == 1) {
                if (strA.equals(c)) {
                    return;
                }
                c = strA;
            } else if (i2 == 2) {
                if (strA.equals(d)) {
                    return;
                }
                d = strA;
            } else {
                if (i2 != 3 || strA.equals(e)) {
                    return;
                }
                e = strA;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    public static void c(android.content.Context context) {
        android.os.Handler handlerB;
        if (b) {
            return;
        }
        b = true;
        if (f3818a == null) {
            f3818a = new com.pgl.ssdk.y.a();
        }
        if (f == null) {
            f = (android.hardware.display.DisplayManager) context.getSystemService("display");
        }
        if (f == null || (handlerB = com.pgl.ssdk.o0.b()) == null) {
            return;
        }
        try {
            f.registerDisplayListener(f3818a, handlerB);
        } catch (java.lang.Exception unused) {
        }
    }

    private static java.lang.String a(android.view.Display display) {
        java.lang.String name = display.getName();
        java.lang.Object objA = com.pgl.ssdk.s0.a(display, display.getClass(), "getType", new java.lang.Class[0], new java.lang.Object[0]);
        java.lang.Object objA2 = com.pgl.ssdk.s0.a(display, display.getClass(), "getOwnerPackageName", new java.lang.Class[0], new java.lang.Object[0]);
        java.lang.Object objA3 = com.pgl.ssdk.s0.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return java.lang.String.format("%s#%s#%b", objA2, name, java.lang.Boolean.valueOf((objA == null || objA3 == null || ((java.lang.Integer) objA).intValue() != ((java.lang.Integer) objA3).intValue()) ? false : true));
    }

    private static java.lang.String a(int i) {
        android.view.Display display = f.getDisplay(i);
        return display != null ? a(display) : "pd";
    }

    public static java.lang.String a(android.content.Context context) {
        android.view.Display[] displays;
        if (f == null) {
            f = (android.hardware.display.DisplayManager) context.getSystemService("display");
        }
        android.hardware.display.DisplayManager displayManager = f;
        if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < displays.length; i++) {
            android.view.Display display = displays[i];
            if (display != null && display.getDisplayId() != 0) {
                stringBuffer.append(a(displays[i]));
                if (i != displays.length - 1) {
                    stringBuffer.append(",");
                }
            }
        }
        return stringBuffer.toString();
    }

    public static boolean b(android.content.Context context) {
        if (c == null && d == null && e == null) {
            return (context == null || android.text.TextUtils.isEmpty(a(context))) ? false : true;
        }
        return true;
    }
}
