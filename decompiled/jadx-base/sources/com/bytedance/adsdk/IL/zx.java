package com.bytedance.adsdk.IL;

/* JADX INFO: loaded from: classes3.dex */
public class zx {
    private static boolean IL = false;
    private static int Kg = 0;
    private static volatile com.bytedance.adsdk.IL.eqN.iR PX = null;
    private static volatile com.bytedance.adsdk.IL.eqN.Kg VB = null;
    private static com.bytedance.adsdk.IL.eqN.ldr WR = null;
    private static boolean bX = true;
    public static boolean bg = false;
    private static com.bytedance.adsdk.IL.eqN.zx eo = null;
    private static boolean eqN = true;
    private static int iR;
    private static long[] ldr;
    private static java.lang.String[] zx;

    public static void bg(java.lang.String str) {
        if (IL) {
            int i = iR;
            if (i == 20) {
                Kg++;
                return;
            }
            zx[i] = str;
            ldr[i] = java.lang.System.nanoTime();
            android.os.Trace.beginSection(str);
            iR++;
        }
    }

    public static float IL(java.lang.String str) {
        int i = Kg;
        if (i > 0) {
            Kg = i - 1;
            return 0.0f;
        }
        if (!IL) {
            return 0.0f;
        }
        int i2 = iR - 1;
        iR = i2;
        if (i2 == -1) {
            throw new java.lang.IllegalStateException("Can't end trace section. There are none.");
        }
        if (!str.equals(zx[i2])) {
            throw new java.lang.IllegalStateException("Unbalanced trace call " + str + ". Expected " + zx[iR] + ".");
        }
        android.os.Trace.endSection();
        return (java.lang.System.nanoTime() - ldr[iR]) / 1000000.0f;
    }

    public static com.bytedance.adsdk.IL.eqN.Kg bg(android.content.Context context) {
        com.bytedance.adsdk.IL.eqN.Kg kg;
        com.bytedance.adsdk.IL.eqN.Kg kg2 = VB;
        if (kg2 != null) {
            return kg2;
        }
        synchronized (com.bytedance.adsdk.IL.eqN.Kg.class) {
            kg = VB;
            if (kg == null) {
                com.bytedance.adsdk.IL.eqN.iR iRVarIL = IL(context);
                com.bytedance.adsdk.IL.eqN.ldr il = WR;
                if (il == null) {
                    il = new com.bytedance.adsdk.IL.eqN.IL();
                }
                kg = new com.bytedance.adsdk.IL.eqN.Kg(iRVarIL, il);
                VB = kg;
            }
        }
        return kg;
    }

    public static com.bytedance.adsdk.IL.eqN.iR IL(android.content.Context context) {
        com.bytedance.adsdk.IL.eqN.iR iRVar;
        if (!bX) {
            return null;
        }
        final android.content.Context applicationContext = context.getApplicationContext();
        com.bytedance.adsdk.IL.eqN.iR iRVar2 = PX;
        if (iRVar2 != null) {
            return iRVar2;
        }
        synchronized (com.bytedance.adsdk.IL.eqN.iR.class) {
            iRVar = PX;
            if (iRVar == null) {
                com.bytedance.adsdk.IL.eqN.zx zxVar = eo;
                if (zxVar == null) {
                    zxVar = new com.bytedance.adsdk.IL.eqN.zx() { // from class: com.bytedance.adsdk.IL.zx.1
                        @Override // com.bytedance.adsdk.IL.eqN.zx
                        public java.io.File bg() {
                            return new java.io.File(applicationContext.getCacheDir(), "lottie_network_cache");
                        }
                    };
                }
                iRVar = new com.bytedance.adsdk.IL.eqN.iR(zxVar);
                PX = iRVar;
            }
        }
        return iRVar;
    }

    public static boolean bg() {
        return eqN;
    }
}
