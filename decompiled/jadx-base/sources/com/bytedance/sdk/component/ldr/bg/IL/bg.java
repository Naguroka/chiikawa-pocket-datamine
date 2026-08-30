package com.bytedance.sdk.component.ldr.bg.IL;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    public static long bg(int i, android.content.Context context) {
        return IL(i, context);
    }

    private static long IL(int i, android.content.Context context) {
        if (context == null) {
            return i;
        }
        java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
        long jFreeMemory = runtime.freeMemory() / 1048576;
        long jMaxMemory = (runtime.maxMemory() / 1048576) - (runtime.totalMemory() / 1048576);
        if (jMaxMemory <= 0) {
            if (jFreeMemory <= 2) {
                return 1L;
            }
            if (jFreeMemory <= 10) {
                return java.lang.Math.min(i, 10);
            }
            return java.lang.Math.min((jFreeMemory / 2) * 10, i);
        }
        long j = ((jFreeMemory + jMaxMemory) - 10) / 2;
        if (j <= 2) {
            return 1L;
        }
        if (j <= 10) {
            return java.lang.Math.min(i, 10);
        }
        return java.lang.Math.min(j * 10, i);
    }

    public static boolean bg() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        return (zxVarEqN == null || android.text.TextUtils.isEmpty(zxVarEqN.bg())) ? false : true;
    }

    public static boolean IL() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        return (zxVarEqN == null || android.text.TextUtils.isEmpty(zxVarEqN.IL())) ? false : true;
    }

    public static boolean bX() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        return (zxVarEqN == null || android.text.TextUtils.isEmpty(zxVarEqN.eqN())) ? false : true;
    }

    public static boolean eqN() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        return (zxVarEqN == null || android.text.TextUtils.isEmpty(zxVarEqN.zx())) ? false : true;
    }

    public static boolean zx() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        return (zxVarEqN == null || android.text.TextUtils.isEmpty(zxVarEqN.bX())) ? false : true;
    }

    public static boolean ldr() {
        com.bytedance.sdk.component.ldr.bg.bg.zx zxVarEqN = com.bytedance.sdk.component.ldr.bg.Kg.iR().eqN();
        return (zxVarEqN == null || android.text.TextUtils.isEmpty(zxVarEqN.ldr())) ? false : true;
    }
}
