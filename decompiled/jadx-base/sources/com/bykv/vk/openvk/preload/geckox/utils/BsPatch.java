package com.bykv.vk.openvk.preload.geckox.utils;

/* JADX INFO: loaded from: classes3.dex */
public class BsPatch {
    private static native int patch(java.lang.String str, java.lang.String str2, java.lang.String str3) throws java.lang.Exception;

    public static void a(java.io.File file, java.io.File file2, java.io.File file3, java.lang.String str) throws java.lang.Exception {
        if (!file.exists()) {
            throw new java.io.FileNotFoundException("full package not exist：" + file.getAbsolutePath());
        }
        if (!file2.exists()) {
            throw new java.io.FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        file3.mkdirs();
        java.io.File file4 = new java.io.File(file3, str);
        file4.delete();
        int iPatch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
        if (iPatch != 0) {
            throw new java.lang.RuntimeException("patch merged failed, code：" + iPatch + " full:" + file.getAbsolutePath() + " patch:" + file2.getAbsolutePath() + " dest:" + file4.getAbsolutePath());
        }
    }

    static {
        java.lang.System.loadLibrary("geckox_bspatch");
    }
}
