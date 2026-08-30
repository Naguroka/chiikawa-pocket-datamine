package com.bytedance.sdk.openadsdk.multipro;

/* JADX INFO: loaded from: classes4.dex */
public class bX {
    private static final java.util.concurrent.atomic.AtomicBoolean IL = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static boolean bg = true;

    public static void bg(android.content.Context context) {
        if (context != null && bg && IL.compareAndSet(false, true)) {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    if (com.bytedance.sdk.component.utils.VzQ.bg(context)) {
                        IL(context);
                        return;
                    }
                    java.lang.String strIL = com.bytedance.sdk.component.utils.VzQ.IL(context);
                    try {
                        if (android.text.TextUtils.isEmpty(strIL)) {
                            strIL = context.getPackageName() + android.os.Process.myPid();
                        }
                        android.webkit.WebView.setDataDirectorySuffix(strIL);
                    } catch (java.lang.IllegalStateException unused) {
                        bg(strIL);
                    } catch (java.lang.Exception unused2) {
                    }
                }
            } catch (java.lang.Throwable th) {
                com.bytedance.sdk.component.utils.PX.IL(th.getMessage());
            }
        }
    }

    public static void bg() {
        bg = false;
    }

    private static void bg(java.lang.String str) {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
            java.lang.reflect.Method declaredMethod2 = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
            declaredMethod2.setAccessible(true);
            java.lang.Class cls = (java.lang.Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            java.lang.reflect.Field field = (java.lang.reflect.Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix");
            field.setAccessible(true);
            if (android.text.TextUtils.isEmpty((java.lang.String) field.get(cls))) {
                field.set(cls, str);
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.RandomAccessFile] */
    private static void IL(android.content.Context context) throws java.lang.Throwable {
        ?? r1;
        java.nio.channels.FileChannel channel;
        java.lang.Throwable th;
        ?? r2;
        java.lang.String strIL = IL();
        ?? randomAccessFile = "webview_data.lock";
        java.io.File file = new java.io.File(context.getDir(android.text.TextUtils.isEmpty(strIL) ? com.ironsource.y8.h.K : "webview_".concat(java.lang.String.valueOf(strIL)), 0).getPath(), "webview_data.lock");
        file.getAbsolutePath();
        if (!file.exists()) {
            return;
        }
        java.nio.channels.FileChannel fileChannel = null;
        java.nio.channels.FileLock fileLockTryLock = null;
        fileChannel = null;
        fileChannel = null;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, "rw");
                try {
                    channel = randomAccessFile.getChannel();
                    if (channel != null) {
                        try {
                            fileLockTryLock = channel.tryLock();
                        } catch (java.lang.Exception unused) {
                            fileChannel = channel;
                            bg(file);
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                } catch (java.lang.Throwable th2) {
                                    th2.getMessage();
                                }
                            }
                            if (randomAccessFile != 0) {
                                try {
                                    randomAccessFile.close();
                                    return;
                                } catch (java.lang.Throwable th3) {
                                    th3.getMessage();
                                    return;
                                }
                            }
                            return;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            r2 = randomAccessFile;
                            if (channel != null) {
                                try {
                                    channel.close();
                                } catch (java.lang.Throwable th5) {
                                    th5.getMessage();
                                }
                            }
                            if (r2 != 0) {
                                try {
                                    r2.close();
                                    throw th;
                                } catch (java.lang.Throwable th6) {
                                    th6.getMessage();
                                    throw th;
                                }
                            }
                            throw th;
                        }
                    }
                    if (fileLockTryLock != null) {
                        fileLockTryLock.close();
                    } else {
                        bg(file);
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (java.lang.Throwable th7) {
                            th7.getMessage();
                        }
                    }
                    try {
                        randomAccessFile.close();
                    } catch (java.lang.Throwable th8) {
                        th8.getMessage();
                    }
                } catch (java.lang.Exception unused2) {
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                channel = fileChannel;
                r1 = randomAccessFile;
                th = th;
                r2 = r1;
                if (channel != null) {
                    channel.close();
                }
                if (r2 != 0) {
                    r2.close();
                    throw th;
                }
                throw th;
            }
        } catch (java.lang.Exception unused3) {
            randomAccessFile = 0;
        } catch (java.lang.Throwable th10) {
            th = th10;
            r1 = 0;
            channel = null;
            th = th;
            r2 = r1;
            if (channel != null) {
                channel.close();
            }
            if (r2 != 0) {
                r2.close();
                throw th;
            }
            throw th;
        }
    }

    private static void bg(java.io.File file) {
        bg(file, file.exists() ? file.delete() : false);
    }

    private static void bg(java.io.File file, boolean z) {
        if (!z || file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            com.bytedance.sdk.component.utils.PX.bg("TTAD.TTMultiInitHelper", e.getMessage());
        }
    }

    private static java.lang.String IL() {
        try {
            java.lang.reflect.Method declaredMethod = java.lang.Class.class.getDeclaredMethod("forName", java.lang.String.class);
            java.lang.reflect.Method declaredMethod2 = java.lang.Class.class.getDeclaredMethod("getDeclaredField", java.lang.String.class);
            declaredMethod2.setAccessible(true);
            java.lang.Class cls = (java.lang.Class) declaredMethod.invoke(null, "android.webkit.WebViewFactory");
            return (java.lang.String) ((java.lang.reflect.Field) declaredMethod2.invoke(cls, "sDataDirectorySuffix")).get(cls);
        } catch (java.lang.Throwable unused) {
            return null;
        }
    }
}
