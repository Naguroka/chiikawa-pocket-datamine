package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class WithinAppServiceBinder extends android.os.Binder {
    private final com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler intentHandler;

    interface IntentHandler {
        com.google.android.gms.tasks.Task<java.lang.Void> handle(android.content.Intent intent);
    }

    WithinAppServiceBinder(com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler intentHandler) {
        this.intentHandler = intentHandler;
    }

    void send(final com.google.firebase.messaging.WithinAppServiceConnection.BindRequest bindRequest) {
        if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
            throw new java.lang.SecurityException("Binding only allowed within app");
        }
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "service received new intent via bind strategy");
        }
        this.intentHandler.handle(bindRequest.intent).addOnCompleteListener(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.firebase.messaging.WithinAppServiceBinder$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                bindRequest.finish();
            }
        });
    }
}
