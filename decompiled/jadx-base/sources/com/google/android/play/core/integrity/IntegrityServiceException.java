package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public class IntegrityServiceException extends com.google.android.gms.common.api.ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Throwable f2273a;

    IntegrityServiceException(int i, java.lang.Throwable th) {
        super(new com.google.android.gms.common.api.Status(i, java.lang.String.format(java.util.Locale.ROOT, "Integrity API error (%d): %s.", java.lang.Integer.valueOf(i), com.google.android.play.core.integrity.model.a.a(i))));
        if (i == 0) {
            throw new java.lang.IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f2273a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable getCause() {
        return this.f2273a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
