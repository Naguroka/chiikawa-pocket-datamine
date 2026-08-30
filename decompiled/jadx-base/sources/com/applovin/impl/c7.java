package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c7 {
    public static int a(java.lang.Exception exc, int i) {
        int i2 = com.applovin.impl.xp.f1515a;
        if (i2 >= 21 && com.applovin.impl.c7.b.a(exc)) {
            return com.applovin.impl.c7.b.b(exc);
        }
        if (i2 >= 23 && com.applovin.impl.c7.c.a(exc)) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 >= 18 && com.applovin.impl.c7.a.b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && com.applovin.impl.c7.a.a(exc)) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (exc instanceof com.applovin.impl.sp) {
            return 6001;
        }
        if (exc instanceof com.applovin.impl.x5.e) {
            return 6003;
        }
        if (exc instanceof com.applovin.impl.yb) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED;
        }
        if (i == 3) {
            return 6002;
        }
        throw new java.lang.IllegalArgumentException();
    }

    private static final class a {
        public static boolean b(java.lang.Throwable th) {
            return th instanceof android.media.NotProvisionedException;
        }

        public static boolean a(java.lang.Throwable th) {
            return th instanceof android.media.DeniedByServerException;
        }
    }

    private static final class b {
        public static boolean a(java.lang.Throwable th) {
            return th instanceof android.media.MediaDrm.MediaDrmStateException;
        }

        public static int b(java.lang.Throwable th) {
            return com.applovin.impl.t2.a(com.applovin.impl.xp.a(((android.media.MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    private static final class c {
        public static boolean a(java.lang.Throwable th) {
            return th instanceof android.media.MediaDrmResetException;
        }
    }
}
