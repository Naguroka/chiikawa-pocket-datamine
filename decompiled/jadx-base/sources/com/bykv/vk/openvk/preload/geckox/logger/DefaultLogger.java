package com.bykv.vk.openvk.preload.geckox.logger;

/* JADX INFO: loaded from: classes3.dex */
class DefaultLogger implements com.bykv.vk.openvk.preload.geckox.logger.Logger {
    DefaultLogger() {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void d(java.lang.String str, java.lang.Object... objArr) {
        if (objArr == null) {
            android.util.Log.d(str, "null");
        } else {
            try {
                android.util.Log.d(str, com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(objArr));
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.w(str, str2, th);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = "";
        }
        android.util.Log.w(str, str2);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void e(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        android.util.Log.e(str, str2, th);
    }
}
