package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class CacheDirFactory {
    public static volatile com.bykv.vk.openvk.bg.bg.bg.bg.IL MEDIA_CACHE_DIR = null;
    public static java.lang.String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    private static java.lang.String bg;

    public static int getCacheType() {
        return 1;
    }

    private static com.bykv.vk.openvk.bg.bg.bg.bg.IL bg() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (com.bytedance.sdk.openadsdk.CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg bgVar = new com.bykv.vk.openvk.bg.bg.IL.bg.bg.bg();
                    MEDIA_CACHE_DIR = bgVar;
                    bgVar.bg(getRootDir());
                    MEDIA_CACHE_DIR.eqN();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static java.lang.String getRootDir() {
        if (!android.text.TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        java.io.File fileBg = com.bytedance.sdk.component.utils.ldr.bg(com.bytedance.sdk.openadsdk.core.VzQ.bg(), com.bytedance.sdk.openadsdk.multipro.IL.bX(), "tt_ad");
        if (fileBg.isFile()) {
            fileBg.delete();
        }
        if (!fileBg.exists()) {
            fileBg.mkdirs();
        }
        java.lang.String absolutePath = fileBg.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static com.bykv.vk.openvk.bg.bg.bg.bg.IL getICacheDir(int i) {
        return bg();
    }

    public static java.lang.String getImageCacheDir() {
        if (bg == null) {
            bg = getDiskCacheDirPath("image");
        }
        return bg;
    }

    public static java.lang.String getDiskCacheDirPath(java.lang.String str) {
        return getRootDir() + java.io.File.separator + str;
    }
}
