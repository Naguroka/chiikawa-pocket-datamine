package com.bytedance.sdk.component.adexpress.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x011b A[Catch: all -> 0x0136, DONT_GENERATE, TryCatch #4 {all -> 0x0136, blocks: (B:61:0x0111, B:63:0x011b, B:66:0x0123, B:68:0x0128, B:70:0x012d, B:72:0x0132), top: B:102:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0121 A[DONT_GENERATE, DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0123 A[Catch: all -> 0x0136, DONT_GENERATE, TryCatch #4 {all -> 0x0136, blocks: (B:61:0x0111, B:63:0x011b, B:66:0x0123, B:68:0x0128, B:70:0x012d, B:72:0x0132), top: B:102:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0128 A[Catch: all -> 0x0136, DONT_GENERATE, TryCatch #4 {all -> 0x0136, blocks: (B:61:0x0111, B:63:0x011b, B:66:0x0123, B:68:0x0128, B:70:0x012d, B:72:0x0132), top: B:102:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012d A[Catch: all -> 0x0136, DONT_GENERATE, TryCatch #4 {all -> 0x0136, blocks: (B:61:0x0111, B:63:0x011b, B:66:0x0123, B:68:0x0128, B:70:0x012d, B:72:0x0132), top: B:102:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0132 A[Catch: all -> 0x0136, DONT_GENERATE, TRY_LEAVE, TryCatch #4 {all -> 0x0136, blocks: (B:61:0x0111, B:63:0x011b, B:66:0x0123, B:68:0x0128, B:70:0x012d, B:72:0x0132), top: B:102:0x0111 }] */
    public static android.graphics.Bitmap bg(android.content.Context context, android.graphics.Bitmap bitmap, int i) {
        android.renderscript.RenderScript renderScript;
        android.renderscript.Allocation allocation;
        android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate;
        android.renderscript.Allocation allocationCreateFromBitmap;
        com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX;
        boolean zXxp;
        try {
            if (com.bytedance.sdk.component.adexpress.eqN.IL() && android.os.Build.VERSION.SDK_INT < 26) {
                try {
                    com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX2 = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
                    if (bXVarBX2 != null) {
                        bXVarBX2.xxp();
                    }
                } catch (java.lang.Throwable th) {
                    com.bytedance.sdk.component.utils.PX.bg("BlurUtils", "blur destroy" + th.getMessage());
                }
                return null;
            }
            android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, java.lang.Math.round(bitmap.getWidth() * 0.2f), java.lang.Math.round(bitmap.getHeight() * 0.2f), false);
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateScaledBitmap);
            android.renderscript.RenderScript renderScriptCreate = android.renderscript.RenderScript.create(context);
            if (renderScriptCreate == null) {
                try {
                    com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX3 = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
                    if (bXVarBX3 != null && bXVarBX3.xxp() && renderScriptCreate != null) {
                        android.renderscript.RenderScript.releaseAllContexts();
                    }
                } catch (java.lang.Throwable th2) {
                    com.bytedance.sdk.component.utils.PX.bg("BlurUtils", "blur destroy" + th2.getMessage());
                }
                return null;
            }
            try {
                scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
                try {
                    android.renderscript.Allocation allocationCreateFromBitmap2 = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    try {
                        allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                        try {
                            scriptIntrinsicBlurCreate.setRadius(i);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap2);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap);
                            allocationCreateFromBitmap.copyTo(bitmapCreateBitmap);
                            try {
                                com.bytedance.sdk.component.adexpress.bg.bg.bX bXVarBX4 = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
                                if (bXVarBX4 != null && bXVarBX4.xxp()) {
                                    if (renderScriptCreate != null) {
                                        android.renderscript.RenderScript.releaseAllContexts();
                                    }
                                    if (allocationCreateFromBitmap2 != null) {
                                        allocationCreateFromBitmap2.destroy();
                                    }
                                    if (allocationCreateFromBitmap != null) {
                                        allocationCreateFromBitmap.destroy();
                                    }
                                    if (scriptIntrinsicBlurCreate != null) {
                                        scriptIntrinsicBlurCreate.destroy();
                                    }
                                }
                            } catch (java.lang.Throwable th3) {
                                com.bytedance.sdk.component.utils.PX.bg("BlurUtils", "blur destroy" + th3.getMessage());
                            }
                            return bitmapCreateBitmap;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            renderScript = renderScriptCreate;
                            th = th;
                            allocation = allocationCreateFromBitmap2;
                            com.bytedance.sdk.component.utils.PX.bg("BlurUtils", "blue has occur exception" + th.getMessage());
                            try {
                                if (bXVarBX != null) {
                                    return null;
                                }
                                if (zXxp) {
                                    return null;
                                }
                                if (scriptIntrinsicBlurCreate != null) {
                                    return null;
                                }
                                return null;
                            } catch (java.lang.Throwable th5) {
                                return null;
                            }
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        allocationCreateFromBitmap = null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    allocation = null;
                    allocationCreateFromBitmap = null;
                    java.lang.Throwable th8 = th;
                    renderScript = renderScriptCreate;
                    th = th8;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                allocation = null;
                scriptIntrinsicBlurCreate = null;
                allocationCreateFromBitmap = null;
            }
        } catch (java.lang.Throwable th10) {
            th = th10;
            renderScript = null;
            allocation = null;
            scriptIntrinsicBlurCreate = null;
            allocationCreateFromBitmap = null;
        }
        try {
            com.bytedance.sdk.component.utils.PX.bg("BlurUtils", "blue has occur exception" + th.getMessage());
            if (bXVarBX != null) {
                return null;
            }
            if (zXxp) {
                return null;
            }
            if (scriptIntrinsicBlurCreate != null) {
                return null;
            }
            return null;
        } finally {
            try {
                bXVarBX = com.bytedance.sdk.component.adexpress.bg.bg.bg.bg().bX();
                if (bXVarBX != null && bXVarBX.xxp()) {
                    if (renderScript != null) {
                        android.renderscript.RenderScript.releaseAllContexts();
                    }
                    if (allocation != null) {
                        allocation.destroy();
                    }
                    if (allocationCreateFromBitmap != null) {
                        allocationCreateFromBitmap.destroy();
                    }
                    if (scriptIntrinsicBlurCreate != null) {
                        scriptIntrinsicBlurCreate.destroy();
                    }
                }
            } catch (java.lang.Throwable th11) {
                com.bytedance.sdk.component.utils.PX.bg("BlurUtils", "blur destroy" + th11.getMessage());
            }
        }
    }
}
