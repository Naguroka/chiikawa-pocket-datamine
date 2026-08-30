package com.bykv.vk.openvk.bg.bg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private static android.content.Context IL = null;
    private static java.lang.String bX = null;
    public static boolean bg = false;
    private static boolean eqN = false;
    private static int ldr = 1;
    private static com.bytedance.sdk.component.IL.bg.VB zx;

    public static android.content.Context bg() {
        return IL;
    }

    public static java.lang.String IL() {
        if (android.text.TextUtils.isEmpty(bX)) {
            try {
                java.io.File file = new java.io.File(bg().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                bX = file.getAbsolutePath();
            } catch (java.lang.Throwable unused) {
            }
        }
        return bX;
    }

    public static void bg(android.content.Context context, java.lang.String str) {
        IL = context;
        bX = str;
    }

    public static boolean bX() {
        return eqN;
    }

    public static void bg(boolean z) {
        eqN = z;
    }

    public static com.bytedance.sdk.component.IL.bg.VB eqN() {
        if (zx == null) {
            zx = new com.bytedance.sdk.component.IL.bg.VB.bg("v_config").bg(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).IL(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).bX(10000L, java.util.concurrent.TimeUnit.MILLISECONDS).bg();
        }
        return zx;
    }

    public static void bg(com.bytedance.sdk.component.IL.bg.VB vb) {
        zx = vb;
    }

    public static boolean zx() {
        return bg;
    }

    public static void bg(int i) {
        ldr = i;
    }

    public static int ldr() {
        return ldr;
    }
}
