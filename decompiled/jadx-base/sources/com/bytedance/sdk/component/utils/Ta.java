package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class Ta {
    public static long bg() {
        try {
            android.os.StatFs statFs = new android.os.StatFs(android.os.Environment.getDataDirectory().getPath());
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (java.lang.Throwable unused) {
            return 0L;
        }
    }
}
