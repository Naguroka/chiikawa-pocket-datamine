package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class al implements com.google.android.play.integrity.internal.ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.integrity.internal.al f2335a = new com.google.android.play.integrity.internal.al(null);
    private final java.lang.Object b;

    private al(java.lang.Object obj) {
        this.b = obj;
    }

    public static com.google.android.play.integrity.internal.ak b(java.lang.Object obj) {
        if (obj != null) {
            return new com.google.android.play.integrity.internal.al(obj);
        }
        throw new java.lang.NullPointerException("instance cannot be null");
    }

    @Override // com.google.android.play.integrity.internal.an
    public final java.lang.Object a() {
        return this.b;
    }
}
