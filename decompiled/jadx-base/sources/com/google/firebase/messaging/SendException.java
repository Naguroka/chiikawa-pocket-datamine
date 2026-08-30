package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public final class SendException extends java.lang.Exception {
    public static final int ERROR_INVALID_PARAMETERS = 1;
    public static final int ERROR_SIZE = 2;
    public static final int ERROR_TOO_MANY_MESSAGES = 4;
    public static final int ERROR_TTL_EXCEEDED = 3;
    public static final int ERROR_UNKNOWN = 0;
    private final int errorCode;

    SendException(java.lang.String str) {
        super(str);
        this.errorCode = parseErrorCode(str);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    private int parseErrorCode(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
