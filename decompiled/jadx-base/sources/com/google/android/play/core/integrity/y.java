package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class y {
    private final java.lang.String b;
    private final long c;
    private boolean e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f2326a = new com.google.android.play.integrity.internal.s("IntegrityDialogWrapper");
    private final java.lang.Object d = new java.lang.Object();

    y(java.lang.String str, long j) {
        this.b = str;
        this.c = j;
    }

    public final com.google.android.gms.tasks.Task a(android.app.Activity activity, int i) {
        synchronized (this.d) {
            if (this.e) {
                return com.google.android.gms.tasks.Tasks.forResult(0);
            }
            this.e = true;
            this.f2326a.a("checkAndShowDialog(%s)", java.lang.Integer.valueOf(i));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("dialog.intent.type", i);
            bundle.putString("package.name", this.b);
            bundle.putInt("playcore.integrity.version.major", 1);
            bundle.putInt("playcore.integrity.version.minor", 3);
            bundle.putInt("playcore.integrity.version.patch", 0);
            bundle.putLong("request.token.sid", this.c);
            return b(activity, bundle);
        }
    }

    abstract com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle);
}
