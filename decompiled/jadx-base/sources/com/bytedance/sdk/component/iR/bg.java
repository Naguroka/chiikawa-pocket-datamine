package com.bytedance.sdk.component.iR;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    private com.bytedance.sdk.component.iR.bX.iR IL;
    private int bX;
    private com.bytedance.sdk.component.IL.bg.VB bg;

    private bg(com.bytedance.sdk.component.iR.bg.C0112bg c0112bg) {
        com.bytedance.sdk.component.IL.bg.VB.bg bgVarIL = new com.bytedance.sdk.component.IL.bg.VB.bg().bg(c0112bg.bg, java.util.concurrent.TimeUnit.MILLISECONDS).bX(c0112bg.bX, java.util.concurrent.TimeUnit.MILLISECONDS).IL(c0112bg.IL, java.util.concurrent.TimeUnit.MILLISECONDS);
        if (c0112bg.eqN) {
            com.bytedance.sdk.component.iR.bX.iR iRVar = new com.bytedance.sdk.component.iR.bX.iR();
            this.IL = iRVar;
            bgVarIL.bg(iRVar);
        }
        if (c0112bg.zx != null && c0112bg.zx.size() > 0) {
            java.util.Iterator<com.bytedance.sdk.component.IL.bg.Kg> it = c0112bg.zx.iterator();
            while (it.hasNext()) {
                bgVarIL.bg(it.next());
            }
        }
        if (c0112bg.iR != null) {
            android.os.Bundle unused = c0112bg.iR;
        }
        java.util.Set unused2 = c0112bg.ldr;
        this.bg = bgVarIL.bg();
    }

    public void bg(android.content.Context context, boolean z, com.bytedance.sdk.component.iR.bX.IL il) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (il == null) {
            throw new java.lang.IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
        int iBg = il.bg();
        this.bX = iBg;
        com.bytedance.sdk.component.iR.bX.iR iRVar = this.IL;
        if (iRVar != null) {
            iRVar.bg(iBg);
        }
        com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX).bg(z);
        com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX).bg(il);
        com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX).bg(context, com.bytedance.sdk.component.utils.VzQ.bg(context));
    }

    public void bg(android.content.Context context, boolean z) {
        com.bytedance.sdk.component.iR.bX.bg.IL(true);
        if (bg(context) || (!com.bytedance.sdk.component.utils.VzQ.bg(context) && z)) {
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX, context).eqN();
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX, context).bg();
        }
        if (com.bytedance.sdk.component.utils.VzQ.bg(context)) {
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX, context).eqN();
            com.bytedance.sdk.component.iR.bX.Kg.bg().bg(this.bX, context).bg();
        }
    }

    public static void bg() {
        com.bytedance.sdk.component.iR.eqN.bX.bg(com.bytedance.sdk.component.iR.eqN.bX.bg.DEBUG);
    }

    public com.bytedance.sdk.component.iR.IL.eqN IL() {
        return new com.bytedance.sdk.component.iR.IL.eqN(this.bg);
    }

    public com.bytedance.sdk.component.iR.IL.IL bX() {
        return new com.bytedance.sdk.component.iR.IL.IL(this.bg);
    }

    public com.bytedance.sdk.component.iR.IL.bg eqN() {
        return new com.bytedance.sdk.component.iR.IL.bg(this.bg);
    }

    private static boolean bg(android.content.Context context) {
        java.lang.String strIL = com.bytedance.sdk.component.utils.VzQ.IL(context);
        if (strIL != null) {
            return strIL.endsWith(":push") || strIL.endsWith(":pushservice");
        }
        return false;
    }

    public com.bytedance.sdk.component.IL.bg.VB zx() {
        return this.bg;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.iR.bg$bg, reason: collision with other inner class name */
    public static final class C0112bg {
        private android.os.Bundle iR;
        private java.util.Set<java.lang.String> ldr;
        boolean eqN = true;
        final java.util.List<com.bytedance.sdk.component.IL.bg.Kg> zx = new java.util.ArrayList();
        int bg = 10000;
        int IL = 10000;
        int bX = 10000;

        public com.bytedance.sdk.component.iR.bg.C0112bg bg(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.bg = bg("timeout", j, timeUnit);
            return this;
        }

        public com.bytedance.sdk.component.iR.bg.C0112bg IL(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.IL = bg("timeout", j, timeUnit);
            return this;
        }

        public com.bytedance.sdk.component.iR.bg.C0112bg bX(long j, java.util.concurrent.TimeUnit timeUnit) {
            this.bX = bg("timeout", j, timeUnit);
            return this;
        }

        public com.bytedance.sdk.component.iR.bg.C0112bg bg(boolean z) {
            this.eqN = z;
            return this;
        }

        private static int bg(java.lang.String str, long j, java.util.concurrent.TimeUnit timeUnit) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new java.lang.NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new java.lang.IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new java.lang.IllegalArgumentException(str + " too small.");
        }

        public com.bytedance.sdk.component.iR.bg bg() {
            return new com.bytedance.sdk.component.iR.bg(this);
        }
    }
}
