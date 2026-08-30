package com.bytedance.adsdk.IL.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class Kg {
    private final com.bytedance.adsdk.IL.eqN.ldr IL;
    private final com.bytedance.adsdk.IL.eqN.iR bg;

    public Kg(com.bytedance.adsdk.IL.eqN.iR iRVar, com.bytedance.adsdk.IL.eqN.ldr ldrVar) {
        this.bg = iRVar;
        this.IL = ldrVar;
    }

    public com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.bytedance.adsdk.IL.iR iRVarIL = IL(context, str, str2);
        if (iRVarIL != null) {
            return new com.bytedance.adsdk.IL.PX<>(iRVarIL);
        }
        return bX(context, str, str2);
    }

    private com.bytedance.adsdk.IL.iR IL(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.bytedance.adsdk.IL.eqN.iR iRVar;
        android.util.Pair<com.bytedance.adsdk.IL.eqN.bX, java.io.InputStream> pairBg;
        com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> pxIL;
        if (str2 == null || (iRVar = this.bg) == null || (pairBg = iRVar.bg(str)) == null) {
            return null;
        }
        com.bytedance.adsdk.IL.eqN.bX bXVar = (com.bytedance.adsdk.IL.eqN.bX) pairBg.first;
        java.io.InputStream inputStream = (java.io.InputStream) pairBg.second;
        if (bXVar == com.bytedance.adsdk.IL.eqN.bX.ZIP) {
            pxIL = com.bytedance.adsdk.IL.Kg.bg(context, new java.util.zip.ZipInputStream(inputStream), str2);
        } else {
            pxIL = com.bytedance.adsdk.IL.Kg.IL(inputStream, str2);
        }
        if (pxIL.bg() != null) {
            return pxIL.bg();
        }
        return null;
    }

    private com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bX(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.bytedance.adsdk.IL.eqN.eqN eqn = null;
        try {
            try {
                com.bytedance.adsdk.IL.eqN.eqN eqnBg = this.IL.bg(str);
                if (eqnBg.bg()) {
                    com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> pxBg = bg(context, str, eqnBg.IL(), eqnBg.bX(), str2);
                    pxBg.bg();
                    if (eqnBg != null) {
                        try {
                            eqnBg.close();
                        } catch (java.io.IOException unused) {
                        }
                    }
                    return pxBg;
                }
                com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> px = new com.bytedance.adsdk.IL.PX<>(new java.lang.IllegalArgumentException(eqnBg.eqN()));
                if (eqnBg != null) {
                    try {
                        eqnBg.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                return px;
            } catch (java.lang.Exception e) {
                com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> px2 = new com.bytedance.adsdk.IL.PX<>(e);
                if (0 != 0) {
                    try {
                        eqn.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                return px2;
            }
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                try {
                    eqn.close();
                } catch (java.io.IOException unused4) {
                }
            }
            throw th;
        }
    }

    private com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, java.lang.String str, java.io.InputStream inputStream, java.lang.String str2, java.lang.String str3) throws java.io.IOException {
        com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> pxBg;
        com.bytedance.adsdk.IL.eqN.bX bXVar;
        com.bytedance.adsdk.IL.eqN.iR iRVar;
        if (str2 == null) {
            str2 = com.json.zb.L;
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            com.bytedance.adsdk.IL.eqN.bX bXVar2 = com.bytedance.adsdk.IL.eqN.bX.ZIP;
            pxBg = bg(context, str, inputStream, str3);
            bXVar = bXVar2;
        } else {
            bXVar = com.bytedance.adsdk.IL.eqN.bX.JSON;
            pxBg = bg(str, inputStream, str3);
        }
        if (str3 != null && pxBg.bg() != null && (iRVar = this.bg) != null) {
            iRVar.bg(str, bXVar);
        }
        return pxBg;
    }

    private com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(android.content.Context context, java.lang.String str, java.io.InputStream inputStream, java.lang.String str2) throws java.io.IOException {
        com.bytedance.adsdk.IL.eqN.iR iRVar;
        if (str2 == null || (iRVar = this.bg) == null) {
            return com.bytedance.adsdk.IL.Kg.bg(context, new java.util.zip.ZipInputStream(inputStream), (java.lang.String) null);
        }
        return com.bytedance.adsdk.IL.Kg.bg(context, new java.util.zip.ZipInputStream(new java.io.FileInputStream(iRVar.bg(str, inputStream, com.bytedance.adsdk.IL.eqN.bX.ZIP))), str);
    }

    private com.bytedance.adsdk.IL.PX<com.bytedance.adsdk.IL.iR> bg(java.lang.String str, java.io.InputStream inputStream, java.lang.String str2) throws java.io.IOException {
        com.bytedance.adsdk.IL.eqN.iR iRVar;
        if (str2 == null || (iRVar = this.bg) == null) {
            return com.bytedance.adsdk.IL.Kg.IL(inputStream, (java.lang.String) null);
        }
        return com.bytedance.adsdk.IL.Kg.IL(new java.io.FileInputStream(iRVar.bg(str, inputStream, com.bytedance.adsdk.IL.eqN.bX.JSON).getAbsolutePath()), str);
    }
}
