package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.tasks.TaskCompletionSource f2291a;
    final com.google.android.play.integrity.internal.ae b;
    private final com.google.android.play.integrity.internal.s c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");
    private final java.lang.String d;
    private final com.google.android.play.core.integrity.k e;
    private final android.app.Activity f;

    as(android.content.Context context, com.google.android.play.core.integrity.k kVar, android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        this.d = context.getPackageName();
        this.e = kVar;
        this.f2291a = taskCompletionSource;
        this.f = activity;
        this.b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(android.os.Bundle bundle) {
        this.b.v(this.f2291a);
        this.c.d("onRequestDialog(%s)", this.d);
        com.google.android.gms.common.api.ApiException apiExceptionA = this.e.a(bundle);
        if (apiExceptionA != null) {
            this.f2291a.trySetException(apiExceptionA);
            return;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            this.c.b("onRequestDialog(%s): got null dialog intent", this.d);
            this.f2291a.trySetResult(0);
            return;
        }
        android.content.Intent intent = new android.content.Intent(this.f, (java.lang.Class<?>) com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new com.google.android.play.core.integrity.ar(this, this.b.c()));
        this.c.a("Starting dialog intent...", new java.lang.Object[0]);
        this.f.startActivityForResult(intent, 0);
    }
}
