package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends java.lang.Exception {
    public static final int CUSTOM_ERROR_CODE_BASE = 1000000;
    public static final int ERROR_CODE_AUDIO_TRACK_INIT_FAILED = 5001;
    public static final int ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED = 5004;
    public static final int ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED = 5003;
    public static final int ERROR_CODE_AUDIO_TRACK_WRITE_FAILED = 5002;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = -102;
    public static final int ERROR_CODE_BAD_VALUE = -3;
    public static final int ERROR_CODE_BEHIND_LIVE_WINDOW = 1002;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = -104;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = -110;
    public static final int ERROR_CODE_DECODER_INIT_FAILED = 4001;
    public static final int ERROR_CODE_DECODER_QUERY_FAILED = 4002;
    public static final int ERROR_CODE_DECODING_FAILED = 4003;
    public static final int ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES = 4004;
    public static final int ERROR_CODE_DECODING_FORMAT_UNSUPPORTED = 4005;
    public static final int ERROR_CODE_DECODING_RESOURCES_RECLAIMED = 4006;
    public static final int ERROR_CODE_DISCONNECTED = -100;
    public static final int ERROR_CODE_DRM_CONTENT_ERROR = 6003;
    public static final int ERROR_CODE_DRM_DEVICE_REVOKED = 6007;
    public static final int ERROR_CODE_DRM_DISALLOWED_OPERATION = 6005;
    public static final int ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED = 6004;
    public static final int ERROR_CODE_DRM_LICENSE_EXPIRED = 6008;
    public static final int ERROR_CODE_DRM_PROVISIONING_FAILED = 6002;
    public static final int ERROR_CODE_DRM_SCHEME_UNSUPPORTED = 6001;
    public static final int ERROR_CODE_DRM_SYSTEM_ERROR = 6006;
    public static final int ERROR_CODE_DRM_UNSPECIFIED = 6000;
    public static final int ERROR_CODE_END_OF_PLAYLIST = -109;
    public static final int ERROR_CODE_FAILED_RUNTIME_CHECK = 1004;
    public static final int ERROR_CODE_INVALID_STATE = -2;
    public static final int ERROR_CODE_IO_BAD_HTTP_STATUS = 2004;
    public static final int ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED = 2007;
    public static final int ERROR_CODE_IO_FILE_NOT_FOUND = 2005;
    public static final int ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE = 2003;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_FAILED = 2001;
    public static final int ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT = 2002;
    public static final int ERROR_CODE_IO_NO_PERMISSION = 2006;
    public static final int ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE = 2008;
    public static final int ERROR_CODE_IO_UNSPECIFIED = 2000;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = -106;
    public static final int ERROR_CODE_NOT_SUPPORTED = -6;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = -105;
    public static final int ERROR_CODE_PARSING_CONTAINER_MALFORMED = 3001;
    public static final int ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED = 3003;
    public static final int ERROR_CODE_PARSING_MANIFEST_MALFORMED = 3002;
    public static final int ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED = 3004;
    public static final int ERROR_CODE_PERMISSION_DENIED = -4;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = -103;
    public static final int ERROR_CODE_REMOTE_ERROR = 1001;
    public static final int ERROR_CODE_SETUP_REQUIRED = -108;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = -107;
    public static final int ERROR_CODE_TIMEOUT = 1003;
    public static final int ERROR_CODE_UNSPECIFIED = 1000;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED = 7001;
    public static final int ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED = 7000;
    protected static final int FIELD_CUSTOM_ID_BASE = 1000;
    public final int errorCode;
    public final android.os.Bundle extras;
    public final long timestampMs;
    private static final java.lang.String FIELD_INT_ERROR_CODE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_LONG_TIMESTAMP_MS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_STRING_MESSAGE = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_STRING_CAUSE_CLASS_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_STRING_CAUSE_MESSAGE = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_BUNDLE_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(5);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public static java.lang.String getErrorCodeName(int i) {
        if (i == -100) {
            return "ERROR_CODE_DISCONNECTED";
        }
        if (i == -6) {
            return "ERROR_CODE_NOT_SUPPORTED";
        }
        if (i == -4) {
            return "ERROR_CODE_PERMISSION_DENIED";
        }
        if (i == -3) {
            return "ERROR_CODE_BAD_VALUE";
        }
        if (i == -2) {
            return "ERROR_CODE_INVALID_STATE";
        }
        if (i == 7000) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        }
        if (i == 7001) {
            return "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        switch (i) {
            case -110:
                return "ERROR_CODE_CONTENT_ALREADY_PLAYING";
            case -109:
                return "ERROR_CODE_END_OF_PLAYLIST";
            case -108:
                return "ERROR_CODE_SETUP_REQUIRED";
            case -107:
                return "ERROR_CODE_SKIP_LIMIT_REACHED";
            case -106:
                return "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
            case -105:
                return "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
            case -104:
                return "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
            case -103:
                return "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
            case -102:
                return "ERROR_CODE_AUTHENTICATION_EXPIRED";
            default:
                switch (i) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case 1004:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case 2005:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case 3003:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case 3004:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES /* 4004 */:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            case ERROR_CODE_DECODING_RESOURCES_RECLAIMED /* 4006 */:
                                                return "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                            default:
                                                switch (i) {
                                                    case 5001:
                                                        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                    case 5002:
                                                        return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                    case 5003:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                    case 5004:
                                                        return "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                    default:
                                                        switch (i) {
                                                            case ERROR_CODE_DRM_UNSPECIFIED /* 6000 */:
                                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                                            case 6001:
                                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                            case 6002:
                                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                            case 6003:
                                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                            case ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                            case ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                            case ERROR_CODE_DRM_SYSTEM_ERROR /* 6006 */:
                                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                            case ERROR_CODE_DRM_DEVICE_REVOKED /* 6007 */:
                                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                            case ERROR_CODE_DRM_LICENSE_EXPIRED /* 6008 */:
                                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                            default:
                                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public final java.lang.String getErrorCodeName() {
        return getErrorCodeName(this.errorCode);
    }

    public PlaybackException(java.lang.String str, java.lang.Throwable th, int i) {
        this(str, th, i, android.os.Bundle.EMPTY, androidx.media3.common.util.Clock.DEFAULT.elapsedRealtime());
    }

    public PlaybackException(java.lang.String str, java.lang.Throwable th, int i, android.os.Bundle bundle) {
        this(str, th, i, bundle, androidx.media3.common.util.Clock.DEFAULT.elapsedRealtime());
    }

    protected PlaybackException(android.os.Bundle bundle) {
        this(bundle.getString(FIELD_STRING_MESSAGE), getCauseFromBundle(bundle), bundle.getInt(FIELD_INT_ERROR_CODE, 1000), getExtrasFromBundle(bundle), bundle.getLong(FIELD_LONG_TIMESTAMP_MS, android.os.SystemClock.elapsedRealtime()));
    }

    protected PlaybackException(java.lang.String str, java.lang.Throwable th, int i, android.os.Bundle bundle, long j) {
        super(str, th);
        this.errorCode = i;
        this.extras = bundle;
        this.timestampMs = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean errorInfoEquals(androidx.media3.common.PlaybackException playbackException) {
        if (this == playbackException) {
            return true;
        }
        if (playbackException != null && getClass() == playbackException.getClass()) {
            java.lang.Throwable cause = getCause();
            java.lang.Throwable cause2 = playbackException.getCause();
            if (cause == null || cause2 == null) {
                if (cause == null) {
                }
            } else if (!androidx.media3.common.util.Util.areEqual(cause.getMessage(), cause2.getMessage()) || !androidx.media3.common.util.Util.areEqual(cause.getClass(), cause2.getClass())) {
                return false;
            }
            return this.errorCode == playbackException.errorCode && androidx.media3.common.util.Util.areEqual(getMessage(), playbackException.getMessage()) && this.timestampMs == playbackException.timestampMs;
        }
        return false;
    }

    public static androidx.media3.common.PlaybackException fromBundle(android.os.Bundle bundle) {
        return new androidx.media3.common.PlaybackException(bundle);
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_INT_ERROR_CODE, this.errorCode);
        bundle.putLong(FIELD_LONG_TIMESTAMP_MS, this.timestampMs);
        bundle.putString(FIELD_STRING_MESSAGE, getMessage());
        bundle.putBundle(FIELD_BUNDLE_EXTRAS, this.extras);
        java.lang.Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(FIELD_STRING_CAUSE_CLASS_NAME, cause.getClass().getName());
            bundle.putString(FIELD_STRING_CAUSE_MESSAGE, cause.getMessage());
        }
        return bundle;
    }

    private static java.lang.Throwable createThrowable(java.lang.Class<?> cls, java.lang.String str) throws java.lang.Exception {
        return (java.lang.Throwable) cls.getConstructor(java.lang.String.class).newInstance(str);
    }

    private static android.os.RemoteException createRemoteException(java.lang.String str) {
        return new android.os.RemoteException(str);
    }

    private static android.os.Bundle getExtrasFromBundle(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_BUNDLE_EXTRAS);
        return bundle2 != null ? bundle2 : android.os.Bundle.EMPTY;
    }

    private static java.lang.Throwable getCauseFromBundle(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(FIELD_STRING_CAUSE_CLASS_NAME);
        java.lang.String string2 = bundle.getString(FIELD_STRING_CAUSE_MESSAGE);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(string, true, androidx.media3.common.PlaybackException.class.getClassLoader());
            java.lang.Throwable thCreateThrowable = java.lang.Throwable.class.isAssignableFrom(cls) ? createThrowable(cls, string2) : null;
            if (thCreateThrowable != null) {
                return thCreateThrowable;
            }
        } catch (java.lang.Throwable unused) {
        }
        return createRemoteException(string2);
    }
}
