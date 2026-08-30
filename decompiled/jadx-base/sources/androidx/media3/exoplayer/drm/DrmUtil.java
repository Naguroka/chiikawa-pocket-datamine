package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
public final class DrmUtil {
    public static final int ERROR_SOURCE_EXO_MEDIA_DRM = 1;
    public static final int ERROR_SOURCE_LICENSE_ACQUISITION = 2;
    public static final int ERROR_SOURCE_PROVISIONING = 3;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorSource {
    }

    public static int getErrorCodeForMediaDrmException(java.lang.Throwable th, int i) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21 && androidx.media3.exoplayer.drm.DrmUtil.Api21.isMediaDrmStateException(th)) {
            return androidx.media3.exoplayer.drm.DrmUtil.Api21.mediaDrmStateExceptionToErrorCode(th);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 23 && androidx.media3.exoplayer.drm.DrmUtil.Api23.isMediaDrmResetException(th)) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if ((th instanceof android.media.NotProvisionedException) || isFailureToConstructNotProvisionedException(th)) {
            return 6002;
        }
        if (th instanceof android.media.DeniedByServerException) {
            return androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (th instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException) {
            return 6001;
        }
        if (th instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th instanceof androidx.media3.exoplayer.drm.KeysExpiredException) {
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

    public static boolean isFailureToConstructNotProvisionedException(java.lang.Throwable th) {
        return androidx.media3.common.util.Util.SDK_INT == 34 && (th instanceof java.lang.NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(java.lang.Throwable th) {
        return androidx.media3.common.util.Util.SDK_INT == 34 && (th instanceof java.lang.NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isMediaDrmStateException(java.lang.Throwable th) {
            return th instanceof android.media.MediaDrm.MediaDrmStateException;
        }

        public static int mediaDrmStateExceptionToErrorCode(java.lang.Throwable th) {
            return androidx.media3.common.util.Util.getErrorCodeForMediaDrmErrorCode(androidx.media3.common.util.Util.getErrorCodeFromPlatformDiagnosticsInfo(((android.media.MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    private static final class Api23 {
        private Api23() {
        }

        public static boolean isMediaDrmResetException(java.lang.Throwable th) {
            return th instanceof android.media.MediaDrmResetException;
        }
    }

    private DrmUtil() {
    }
}
