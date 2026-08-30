package com.bytedance.sdk.openadsdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class Uq implements java.lang.Thread.UncaughtExceptionHandler {
    public static volatile boolean bg;
    private final java.lang.Thread.UncaughtExceptionHandler IL = java.lang.Thread.getDefaultUncaughtExceptionHandler();
    private java.lang.String bX;

    public static com.bytedance.sdk.openadsdk.utils.Uq bg() {
        return new com.bytedance.sdk.openadsdk.utils.Uq();
    }

    private Uq() {
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
        IL();
    }

    private void IL() {
        android.content.Context contextBg = com.bytedance.sdk.openadsdk.core.VzQ.bg();
        if (contextBg == null) {
            return;
        }
        try {
            java.io.File file = new java.io.File(contextBg.getFilesDir(), "TTCache");
            file.mkdirs();
            this.bX = file.getPath();
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        bg = true;
        boolean zContains = false;
        com.bytedance.sdk.component.Kg.ldr.bg(false);
        try {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th.printStackTrace(new java.io.PrintWriter(stringWriter));
            java.lang.String string = stringWriter.toString();
            if (string != null) {
                zContains = string.contains(com.bytedance.sdk.openadsdk.AdSlot.class.getPackage().getName());
            }
        } catch (java.lang.Throwable unused) {
        }
        if (zContains) {
            bg(thread, th);
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.IL;
        if (uncaughtExceptionHandler == null || uncaughtExceptionHandler == this) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x010f A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x010a A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void bg(java.lang.Thread thread, java.lang.Throwable th) {
        java.io.FileOutputStream fileOutputStream;
        boolean z;
        int i;
        java.io.FileInputStream fileInputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        java.io.FileOutputStream fileOutputStream2 = null;
        java.io.FileInputStream fileInputStream2 = null;
        fileInputStream = null;
        try {
            if (android.text.TextUtils.isEmpty(this.bX)) {
                IL();
            }
            if (android.text.TextUtils.isEmpty(this.bX)) {
                return;
            }
            java.io.File file = new java.io.File(this.bX, "tt_crash_count.properties");
            if (file.exists() && file.isFile() && file.canRead()) {
                java.util.Properties properties = new java.util.Properties();
                java.io.FileInputStream fileInputStream3 = new java.io.FileInputStream(file);
                try {
                    properties.load(fileInputStream3);
                    java.lang.String property = properties.getProperty("crash_count", "0");
                    java.lang.String property2 = properties.getProperty("crash_last_time", "0");
                    int iIntValue = java.lang.Integer.valueOf(property).intValue();
                    int i2 = 0;
                    boolean z2 = true;
                    if (java.lang.System.currentTimeMillis() - java.lang.Long.valueOf(property2).longValue() < 300000) {
                        i = iIntValue + 1;
                        z = false;
                    } else {
                        z = true;
                        i = 1;
                    }
                    if (i < 3) {
                        z2 = false;
                    }
                    if (!z2) {
                        i2 = i;
                    }
                    com.bytedance.sdk.component.utils.PX.bg("TTCrashHandler", "==" + i2 + ", " + z2 + ", " + z);
                    if (z2) {
                        try {
                            file.delete();
                        } catch (java.lang.Throwable unused) {
                        }
                    } else {
                        properties.setProperty("crash_count", java.lang.String.valueOf(i2));
                        if (z) {
                            properties.setProperty("crash_last_time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                        }
                        fileOutputStream = new java.io.FileOutputStream(file);
                        try {
                            properties.store(fileOutputStream, "tt_crash_info");
                            fileOutputStream2 = fileOutputStream;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream3;
                            com.bytedance.sdk.component.utils.PX.bg("TTCrashHandler", "crash count error", th);
                        }
                    }
                    if (z2) {
                        bX();
                    }
                    fileOutputStream = fileOutputStream2;
                    fileInputStream2 = fileInputStream3;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                }
            } else {
                java.util.Properties properties2 = new java.util.Properties();
                properties2.setProperty("crash_count", "1");
                properties2.setProperty("crash_last_time", java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    properties2.store(fileOutputStream, "tt_crash_info");
                    com.bytedance.sdk.component.utils.PX.bg("TTCrashHandler", "==first");
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (java.lang.Throwable unused2) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (java.lang.Throwable unused3) {
                        }
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    try {
                        com.bytedance.sdk.component.utils.PX.bg("TTCrashHandler", "crash count error", th);
                    } finally {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.lang.Throwable unused4) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (java.lang.Throwable unused5) {
                            }
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            fileOutputStream = null;
        }
    }

    private void bX() {
        try {
            java.lang.reflect.Method methodBg = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC2Proxy", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, android.content.Context.class);
            if (methodBg != null) {
                methodBg.invoke(null, com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }
        } catch (java.lang.Throwable unused) {
        }
        try {
            java.lang.reflect.Method methodBg2 = com.bytedance.sdk.component.utils.kMt.bg("com.bytedance.sdk.openadsdk.TTC3Proxy", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, android.content.Context.class);
            if (methodBg2 != null) {
                methodBg2.invoke(null, com.bytedance.sdk.openadsdk.core.VzQ.bg());
            }
        } catch (java.lang.Throwable unused2) {
        }
        try {
            com.bytedance.sdk.openadsdk.core.settings.xxp.zU().bg();
        } catch (java.lang.Throwable unused3) {
        }
        try {
            com.bytedance.sdk.component.adexpress.bg.IL.IL.IL();
        } catch (java.lang.Throwable unused4) {
        }
    }
}
