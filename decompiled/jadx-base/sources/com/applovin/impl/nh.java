package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class nh extends java.lang.Exception implements com.applovin.impl.o2 {
    public static final com.applovin.impl.o2.a c = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.nh$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return new com.applovin.impl.nh(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1097a;
    public final long b;

    public static java.lang.String a(int i) {
        if (i == 5001) {
            return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        }
        if (i == 5002) {
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
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
                                    case androidx.media3.common.PlaybackException.ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES /* 4004 */:
                                        return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                    case 4005:
                                        return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_UNSPECIFIED /* 6000 */:
                                                return "ERROR_CODE_DRM_UNSPECIFIED";
                                            case 6001:
                                                return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                            case 6002:
                                                return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                            case 6003:
                                                return "ERROR_CODE_DRM_CONTENT_ERROR";
                                            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                                                return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                                                return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR /* 6006 */:
                                                return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED /* 6007 */:
                                                return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED /* 6008 */:
                                                return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                            default:
                                                return i >= 1000000 ? "custom error code" : "invalid error code";
                                        }
                                }
                        }
                }
        }
    }

    protected nh(android.os.Bundle bundle) {
        this(bundle.getString(b(2)), a(bundle), bundle.getInt(b(0), 1000), bundle.getLong(b(1), android.os.SystemClock.elapsedRealtime()));
    }

    protected static java.lang.String b(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    private static java.lang.Throwable a(java.lang.Class cls, java.lang.String str) {
        return (java.lang.Throwable) cls.getConstructor(java.lang.String.class).newInstance(str);
    }

    protected nh(java.lang.String str, java.lang.Throwable th, int i, long j) {
        super(str, th);
        this.f1097a = i;
        this.b = j;
    }

    private static java.lang.Throwable a(android.os.Bundle bundle) {
        java.lang.String string = bundle.getString(b(3));
        java.lang.String string2 = bundle.getString(b(4));
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(string, true, com.applovin.impl.nh.class.getClassLoader());
            java.lang.Throwable thA = java.lang.Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (thA != null) {
                return thA;
            }
        } catch (java.lang.Throwable unused) {
        }
        return a(string2);
    }

    public final java.lang.String a() {
        return a(this.f1097a);
    }

    private static android.os.RemoteException a(java.lang.String str) {
        return new android.os.RemoteException(str);
    }
}
