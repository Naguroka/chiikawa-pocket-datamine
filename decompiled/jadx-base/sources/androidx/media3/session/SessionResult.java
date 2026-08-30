package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class SessionResult {
    public static final int RESULT_ERROR_BAD_VALUE = -3;
    public static final int RESULT_ERROR_INVALID_STATE = -2;
    public static final int RESULT_ERROR_IO = -5;
    public static final int RESULT_ERROR_NOT_SUPPORTED = -6;
    public static final int RESULT_ERROR_PERMISSION_DENIED = -4;
    public static final int RESULT_ERROR_SESSION_AUTHENTICATION_EXPIRED = -102;
    public static final int RESULT_ERROR_SESSION_CONCURRENT_STREAM_LIMIT = -104;
    public static final int RESULT_ERROR_SESSION_DISCONNECTED = -100;
    public static final int RESULT_ERROR_SESSION_NOT_AVAILABLE_IN_REGION = -106;
    public static final int RESULT_ERROR_SESSION_PARENTAL_CONTROL_RESTRICTED = -105;
    public static final int RESULT_ERROR_SESSION_PREMIUM_ACCOUNT_REQUIRED = -103;
    public static final int RESULT_ERROR_SESSION_SETUP_REQUIRED = -108;
    public static final int RESULT_ERROR_SESSION_SKIP_LIMIT_REACHED = -107;
    public static final int RESULT_ERROR_UNKNOWN = -1;
    public static final int RESULT_INFO_SKIPPED = 1;
    public static final int RESULT_SUCCESS = 0;
    public final long completionTimeMs;
    public final android.os.Bundle extras;
    public final int resultCode;
    public final androidx.media3.session.SessionError sessionError;
    private static final java.lang.String FIELD_RESULT_CODE = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_COMPLETION_TIME_MS = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_SESSION_ERROR = androidx.media3.common.util.Util.intToStringMaxRadix(3);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Code {
    }

    public SessionResult(int i) {
        this(i, android.os.Bundle.EMPTY);
    }

    public SessionResult(int i, android.os.Bundle bundle) {
        this(i, bundle, android.os.SystemClock.elapsedRealtime(), null);
    }

    public SessionResult(androidx.media3.session.SessionError sessionError) {
        this(sessionError.code, android.os.Bundle.EMPTY, android.os.SystemClock.elapsedRealtime(), sessionError);
    }

    public SessionResult(androidx.media3.session.SessionError sessionError, android.os.Bundle bundle) {
        this(sessionError.code, bundle, android.os.SystemClock.elapsedRealtime(), sessionError);
    }

    private SessionResult(int i, android.os.Bundle bundle, long j, androidx.media3.session.SessionError sessionError) {
        androidx.media3.common.util.Assertions.checkArgument(sessionError == null || i < 0);
        this.resultCode = i;
        this.extras = new android.os.Bundle(bundle);
        this.completionTimeMs = j;
        if (sessionError == null && i < 0) {
            sessionError = new androidx.media3.session.SessionError(i, "no error message provided");
        }
        this.sessionError = sessionError;
    }

    public android.os.Bundle toBundle() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(FIELD_RESULT_CODE, this.resultCode);
        bundle.putBundle(FIELD_EXTRAS, this.extras);
        bundle.putLong(FIELD_COMPLETION_TIME_MS, this.completionTimeMs);
        androidx.media3.session.SessionError sessionError = this.sessionError;
        if (sessionError != null) {
            bundle.putBundle(FIELD_SESSION_ERROR, sessionError.toBundle());
        }
        return bundle;
    }

    public static androidx.media3.session.SessionResult fromBundle(android.os.Bundle bundle) {
        androidx.media3.session.SessionError sessionError;
        int i = bundle.getInt(FIELD_RESULT_CODE, -1);
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_EXTRAS);
        long j = bundle.getLong(FIELD_COMPLETION_TIME_MS, android.os.SystemClock.elapsedRealtime());
        android.os.Bundle bundle3 = bundle.getBundle(FIELD_SESSION_ERROR);
        if (bundle3 != null) {
            sessionError = androidx.media3.session.SessionError.fromBundle(bundle3);
        } else {
            sessionError = i != 0 ? new androidx.media3.session.SessionError(i, "no error message provided") : null;
        }
        androidx.media3.session.SessionError sessionError2 = sessionError;
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        return new androidx.media3.session.SessionResult(i, bundle2, j, sessionError2);
    }
}
