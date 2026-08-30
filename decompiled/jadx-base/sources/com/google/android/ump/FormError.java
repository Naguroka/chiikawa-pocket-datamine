package com.google.android.ump;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public class FormError {
    private final int zza;
    private final java.lang.String zzb;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.1.0 */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i, java.lang.String str) {
        this.zza = i;
        this.zzb = str;
    }

    public int getErrorCode() {
        return this.zza;
    }

    public java.lang.String getMessage() {
        return this.zzb;
    }
}
