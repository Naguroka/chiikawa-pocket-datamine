package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacu implements com.google.android.gms.tasks.Continuation {
    zacu() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        if (((java.lang.Boolean) task.getResult()).booleanValue()) {
            return null;
        }
        throw new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(13, "listener already unregistered"));
    }
}
