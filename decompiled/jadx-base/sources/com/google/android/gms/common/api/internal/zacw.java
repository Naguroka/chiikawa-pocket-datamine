package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacw extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ com.google.android.gms.common.api.internal.zacx zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacw(com.google.android.gms.common.api.internal.zacx zacxVar, android.os.Looper looper) {
        super(looper);
        this.zaa = zacxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) message.obj;
                android.util.Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(java.lang.String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            android.util.Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + message.what);
            return;
        }
        com.google.android.gms.common.api.PendingResult pendingResult = (com.google.android.gms.common.api.PendingResult) message.obj;
        synchronized (this.zaa.zae) {
            com.google.android.gms.common.api.internal.zacx zacxVar = (com.google.android.gms.common.api.internal.zacx) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zaa.zab);
            if (pendingResult == null) {
                zacxVar.zaj(new com.google.android.gms.common.api.Status(13, "Transform returned null"));
            } else if (pendingResult instanceof com.google.android.gms.common.api.internal.zacm) {
                zacxVar.zaj(((com.google.android.gms.common.api.internal.zacm) pendingResult).zaa());
            } else {
                zacxVar.zai(pendingResult);
            }
        }
    }
}
