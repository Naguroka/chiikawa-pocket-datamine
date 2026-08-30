package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03310o {
    public static byte[] A06;
    public static java.lang.String[] A07 = {"jjDsG8QlYrxY", "", "TMhFK0S9G1", "6qW7u5SP6R0wlmhQUiBuXDFp8yf", "n7Dasyj9dq5sG0xOL43e0c5rVQV9l70l", "dOqhBdKnx9bW", "a7CXWDqETze4gqUmjqRBhcRjVGu0d2y8", "nE3PHSl6bqsIePbBJ"};
    public android.app.Application A01;
    public com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener A03;
    public final com.facebook.ads.redexgen.core.J7 A05;
    public long A00 = 0;
    public java.lang.String A04 = null;
    public com.facebook.ads.redexgen.core.EnumC03240g A02 = null;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A03() {
        A06 = new byte[]{95, 92, 94, 86, 98, 73, 84, 80, 88, 12, 5, 1, 22, 5, okio.Utf8.REPLACEMENT_BYTE, 20, 9, 13, 5, 17, 11, 10, 29, 17, 19, 27};
    }

    static {
        A03();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public C03310o(com.facebook.ads.redexgen.core.J7 j7, final android.app.Activity activity, int i) {
        this.A05 = j7;
        this.A01 = activity.getApplication();
        this.A03 = new android.app.Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public com.facebook.ads.redexgen.core.C03310o A00;
            public final java.lang.ref.WeakReference<android.app.Activity> A01;

            {
                this.A01 = new java.lang.ref.WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(android.app.Activity activity2, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(android.app.Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(android.app.Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(android.app.Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                android.app.Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                    this.A00 = null;
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(android.app.Activity activity2, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(android.app.Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(android.app.Activity activity2) {
            }
        };
    }

    public static com.facebook.ads.redexgen.core.C03310o A00(com.facebook.ads.redexgen.core.J7 j7, android.app.Activity activity) {
        return A01(j7, activity, android.os.Build.VERSION.SDK_INT);
    }

    public static com.facebook.ads.redexgen.core.C03310o A01(com.facebook.ads.redexgen.core.J7 j7, android.app.Activity activity, int i) {
        if (activity != null && i >= 14) {
            return new com.facebook.ads.redexgen.core.C03310o(j7, activity, i);
        }
        return null;
    }

    private void A04(java.lang.String str, long j, long j2, com.facebook.ads.redexgen.core.EnumC03240g enumC03240g) {
        java.util.HashMap map = new java.util.HashMap();
        map.put(A02(9, 10, 113), java.lang.Long.toString(j));
        map.put(A02(0, 9, 44), java.lang.Long.toString(j2));
        if (enumC03240g != null) {
            map.put(A02(19, 7, 111), enumC03240g.name());
        }
        this.A05.AAZ(str, map);
    }

    public final void A05() {
        A04(this.A04, this.A00, java.lang.System.currentTimeMillis(), this.A02);
        if (this.A01 != null && this.A03 != null) {
            this.A01.unregisterActivityLifecycleCallbacks(this.A03);
            if (A07[1].length() != 0) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[5] = "Bj7dFfY1wcZx";
            strArr[0] = "MwUlwbTeTJkw";
            this.A03 = null;
            this.A01 = null;
        }
    }

    public final void A06(com.facebook.ads.redexgen.core.EnumC03240g enumC03240g) {
        this.A02 = enumC03240g;
    }

    public final void A07(java.lang.String str) {
        this.A04 = str;
        if (this.A03 != null && this.A01 != null) {
            this.A00 = java.lang.System.currentTimeMillis();
            this.A01.registerActivityLifecycleCallbacks(this.A03);
        } else {
            if (A07[2].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            A07[3] = "P2oyl0IhOniiU9jQCrFtNFHhnuy";
            A04(str, -1L, -1L, com.facebook.ads.redexgen.core.EnumC03240g.A05);
        }
    }
}
