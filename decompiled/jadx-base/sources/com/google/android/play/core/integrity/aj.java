package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.play.integrity.internal.ae f2284a;
    private final com.google.android.play.integrity.internal.s b;
    private final java.lang.String c;
    private final com.google.android.play.core.integrity.at d;
    private final com.google.android.play.core.integrity.k e;

    aj(android.content.Context context, com.google.android.play.integrity.internal.s sVar, com.google.android.play.core.integrity.at atVar, com.google.android.play.core.integrity.k kVar) {
        this.c = context.getPackageName();
        this.b = sVar;
        this.d = atVar;
        this.e = kVar;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f2284a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", com.google.android.play.core.integrity.ak.f2285a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final java.lang.Object a(android.os.IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new java.lang.Object[0]);
            this.f2284a = null;
        }
    }

    static /* bridge */ /* synthetic */ android.os.Bundle a(com.google.android.play.core.integrity.aj ajVar, byte[] bArr, java.lang.Long l, android.os.Parcelable parcelable) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package.name", ajVar.c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l != null) {
            bundle.putLong("cloud.prj", l.longValue());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new java.util.ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    final com.google.android.gms.tasks.Task b(android.app.Activity activity, android.os.Bundle bundle) {
        if (this.f2284a == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.b.d("requestAndShowDialog(%s, %s)", this.c, java.lang.Integer.valueOf(i));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.f2284a.t(new com.google.android.play.core.integrity.ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final com.google.android.gms.tasks.Task c(com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest) {
        if (this.f2284a == null) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(integrityTokenRequest.nonce(), 10);
            java.lang.Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof com.google.android.play.core.integrity.ao) {
            }
            this.b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
            this.f2284a.t(new com.google.android.play.core.integrity.af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (java.lang.IllegalArgumentException e) {
            return com.google.android.gms.tasks.Tasks.forException(new com.google.android.play.core.integrity.IntegrityServiceException(-13, e));
        }
    }
}
