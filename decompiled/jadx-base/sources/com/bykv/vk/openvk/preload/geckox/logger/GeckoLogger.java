package com.bykv.vk.openvk.preload.geckox.logger;

/* JADX INFO: loaded from: classes3.dex */
public class GeckoLogger {
    private static boolean DEBUG = false;
    private static com.bykv.vk.openvk.preload.geckox.logger.Logger sLogger = new com.bykv.vk.openvk.preload.geckox.logger.DefaultLogger();

    public static void enable() {
        DEBUG = true;
    }

    public static void disable() {
        DEBUG = false;
    }

    public static boolean isDebug() {
        return DEBUG;
    }

    public static void redirect(com.bykv.vk.openvk.preload.geckox.logger.Logger logger) {
        sLogger = logger;
    }

    public static void d(java.lang.String str, java.lang.Object... objArr) {
        com.bykv.vk.openvk.preload.geckox.logger.Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.d(str, objArr);
    }

    public static void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.geckox.logger.Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.w(str, str2, th);
    }

    public static void w(java.lang.String str, java.lang.String str2) {
        com.bykv.vk.openvk.preload.geckox.logger.Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.w(str, str2);
    }

    public static void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        com.bykv.vk.openvk.preload.geckox.logger.Logger logger;
        if (!DEBUG || (logger = sLogger) == null) {
            return;
        }
        logger.e(str, str2, th);
    }
}
