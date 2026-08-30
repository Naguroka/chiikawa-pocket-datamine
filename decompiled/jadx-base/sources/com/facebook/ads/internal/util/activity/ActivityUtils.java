package com.facebook.ads.internal.util.activity;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ActivityUtils implements android.app.Application.ActivityLifecycleCallbacks {
    public static android.content.Context A01;
    public static com.facebook.ads.redexgen.core.C1198Zr A02;
    public static byte[] A03;
    public static java.lang.String[] A04 = {"92eOfmmmV4HUmtBKNwX5jODUm9snbisL", "83A6RHTc3uHHgwZu0l", "xT8NDmJO40EcDZzCFYpPknxtJdrIGRIs", "yd9OYuKBF31VEKohInrUKVptjNnIlgtF", "ffDhLNnwXMIpP", "gJJ", "YtTChd0N7kYfN", "CHt0mr4gyt"};
    public static final com.facebook.ads.redexgen.core.C0817Kw A05;
    public static final java.util.List<com.facebook.ads.redexgen.core.InterfaceC0815Ks> A06;
    public static final java.util.List<java.lang.Runnable> A07;
    public static final java.util.Map<android.app.Activity, java.lang.Integer> A08;
    public final java.lang.Class<? extends android.app.Activity> A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {14, 2, 35, 69, 86, 75, 88, 75, 86, 91, 28, 2, -90, -102, -20, -33, -32, -76, -102, 6, 40, 57, 46, 59, 46, 57, 62, -27, 41, 46, 56, 40, 55, 42, 53, 38, 51, 40, 46, 42, 56, -13, 56, 103, 103, 58, 102, 101, 107, 92, 111, 107, 23, 96, 106, 23, 101, 102, 107, 23, 56, 103, 103, 99, 96, 90, 88, 107, 96, 102, 101, 37, -3, 41, 40, 29, 47, 44, 44, 31, 40, 46, -38, 39, 41, 30, 35, 32, 35, 29, 27, 46, 35, 41, 40, -38, 31, 50, 29, 31, 42, 46, 35, 41, 40, -38, 46, 34, 44, 41, 49, 40, 30, 47, 44, 35, 40, 33, -38, 44, 31, 33, 35, 45, 46, 31, 44, -5, 29, 46, 35, 48, 35, 46, 51, -3, 27, 38, 38, 28, 27, 29, 37, 45, 6, 35, 45, 46, 31, 40, 31, 44, 45, 74, 66, -2, okio.Utf8.REPLACEMENT_BYTE, 65, 82, 71, 84, 71, 82, 87, -2, 81, 82, okio.Utf8.REPLACEMENT_BYTE, 82, 67, 24, -2, 24, 41, kotlin.io.encoding.Base64.padSymbol, 59, 45, 44, -24, 41, 43, 60, 49, 62, 49, 60, 65, -24, 49, 59, -24, 54, 55, 60, -24, 58, 45, 59, kotlin.io.encoding.Base64.padSymbol, 53, 45, 44, -10, 44, okio.Utf8.REPLACEMENT_BYTE, 77, 20, -6, 23, 25, 42, 21, 43, 42, 31, 34, -35, -20, -27, 58, 57, 12, 46, okio.Utf8.REPLACEMENT_BYTE, 52, 65, 52, okio.Utf8.REPLACEMENT_BYTE, 68, 14, kotlin.io.encoding.Base64.padSymbol, 48, 44, okio.Utf8.REPLACEMENT_BYTE, 48, 47};
        if (A04[0].charAt(5) != 'm') {
            throw new java.lang.RuntimeException();
        }
        A04[7] = "OT1BI2x3SK";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized void A04(com.facebook.ads.redexgen.core.C1198Zr c1198Zr, java.lang.Class<? extends android.app.Activity> cls) {
        A02 = c1198Zr;
        A01 = c1198Zr.getApplicationContext();
        if (A01 instanceof android.app.Application) {
            com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
            if (aNActivityLifecycleCallbacksListener != null) {
                java.util.Map<android.app.Activity, java.lang.Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                synchronized (activityStateMap) {
                    try {
                        A08.putAll(activityStateMap);
                    } catch (java.util.ConcurrentModificationException unused) {
                        c1198Zr.A07().AA0(A01(208, 8, 61), com.facebook.ads.redexgen.core.C8E.A02, new com.facebook.ads.redexgen.core.C8F(A01(72, 80, 65)));
                    }
                }
                com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1198Zr);
            }
            ((android.app.Application) A01).registerActivityLifecycleCallbacks(new com.facebook.ads.internal.util.activity.ActivityUtils(cls));
        } else {
            c1198Zr.A07().AA0(A01(216, 3, 3), com.facebook.ads.redexgen.core.C8E.A0d, new com.facebook.ads.redexgen.core.C8F(A01(42, 30, 126)));
        }
    }

    static {
        A02();
        A08 = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        A06 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        A07 = new java.util.ArrayList();
        A05 = com.facebook.ads.redexgen.core.C0817Kw.A00();
    }

    public ActivityUtils(java.lang.Class<? extends android.app.Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    public static synchronized android.app.Activity A00() {
        android.app.Activity key = null;
        for (java.util.Map.Entry<android.app.Activity, java.lang.Integer> entry : A08.entrySet()) {
            if (entry.getValue().intValue() == 3) {
                key = entry.getKey();
                break;
            }
        }
        android.app.Activity activityA00 = null;
        boolean z = key == null || android.os.Build.VERSION.SDK_INT < 28;
        if (z) {
            activityA00 = com.facebook.ads.redexgen.core.AbstractC0812Kp.A00();
        }
        if (A02 != null && z && key != activityA00) {
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A01(19, 23, 76), A01(com.ironsource.g3.c.b.INSTANCE_LOAD_FAILED, 5, 97) + key + A01(12, 7, 1) + activityA00);
            c8f.A05(1);
            A02.A07().AA0(A01(208, 8, 61), com.facebook.ads.redexgen.core.C8E.A03, c8f);
        }
        return key != null ? key : activityA00;
    }

    public static void A03(com.facebook.ads.redexgen.core.C1199Zs c1199Zs) {
        if (!com.facebook.ads.redexgen.core.C0762Im.A1f(c1199Zs) || android.os.Build.VERSION.SDK_INT >= 29) {
            return;
        }
        com.facebook.ads.redexgen.core.RunnableC0814Kr runnableC0814Kr = new com.facebook.ads.redexgen.core.RunnableC0814Kr(c1199Zs);
        synchronized (A07) {
            A07.add(runnableC0814Kr);
        }
        com.facebook.ads.redexgen.core.ExecutorC0844Lx.A01.A01().postDelayed(runnableC0814Kr, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        A08.put(activity, 1);
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC0815Ks> it = A06.iterator();
        boolean zHasNext = it.hasNext();
        java.lang.String[] strArr = A04;
        if (strArr[4].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[3] = "6ucg7ZQRC52PgbYLp0IlsO8L9UBIqtAr";
        strArr2[2] = "XfsAw5zLn3vJHYKMay1aCQiNLVOIwPXI";
        if (zHasNext) {
            it.next();
            throw new java.lang.NullPointerException(A01(219, 17, 82));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        java.util.ArrayList arrayList;
        java.lang.Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            com.facebook.ads.redexgen.core.C8F c8f = new com.facebook.ads.redexgen.core.C8F(A01(172, 31, 79), A01(org.objectweb.asm.Opcodes.DCMPG, 20, 101) + num + A01(0, 12, 105) + activity);
            c8f.A05(0);
            A02.A07().AA0(A01(208, 8, 61), com.facebook.ads.redexgen.core.C8E.A03, c8f);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new java.util.ArrayList(A07);
                A07.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.facebook.ads.redexgen.core.ExecutorC0844Lx.A01.A01().removeCallbacks((java.lang.Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        A08.put(activity, 5);
    }
}
