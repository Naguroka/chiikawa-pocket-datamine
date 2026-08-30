package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: IntExtension.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"webResourceToErrorReason", "Lcom/unity3d/ads/adplayer/model/ErrorReason;", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntExtensionKt {
    public static final com.unity3d.ads.adplayer.model.ErrorReason webResourceToErrorReason(int i) {
        switch (i) {
            case -16:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_UNSAFE_RESOURCE;
            case -15:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_TOO_MANY_REQUESTS;
            case -14:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_FILE_NOT_FOUND;
            case -13:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_FILE;
            case -12:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_BAD_URL;
            case com.google.android.play.core.integrity.model.IntegrityErrorCode.NONCE_TOO_LONG /* -11 */:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_FAILED_SSL_HANDSHAKE;
            case -10:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_SCHEME;
            case -9:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_REDIRECT_LOOP;
            case -8:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_TIMEOUT;
            case -7:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_IO;
            case -6:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_CONNECT;
            case -5:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_PROXY_AUTHENTICATION;
            case -4:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_AUTHENTICATION;
            case -3:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_UNSUPPORTED_AUTH_SCHEME;
            case -2:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_HOST_LOOKUP;
            case -1:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_WEB_ERROR_UNKNOWN;
            default:
                return com.unity3d.ads.adplayer.model.ErrorReason.REASON_UNKNOWN;
        }
    }
}
