package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public enum Fy {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* JADX INFO: renamed from: com.bytedance.adsdk.IL.Fy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] bg;

        static {
            int[] iArr = new int[com.bytedance.adsdk.IL.Fy.values().length];
            bg = iArr;
            try {
                iArr[com.bytedance.adsdk.IL.Fy.HARDWARE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                bg[com.bytedance.adsdk.IL.Fy.SOFTWARE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                bg[com.bytedance.adsdk.IL.Fy.AUTOMATIC.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public boolean bg(int i, boolean z, int i2) {
        int i3 = com.bytedance.adsdk.IL.Fy.AnonymousClass1.bg[ordinal()];
        if (i3 == 1) {
            return false;
        }
        if (i3 != 2) {
            return (z && i < 28) || i2 > 4 || i <= 25;
        }
        return true;
    }
}
