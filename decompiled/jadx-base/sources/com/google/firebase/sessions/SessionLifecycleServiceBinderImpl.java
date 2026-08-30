package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl;", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "bindToService", "", "callback", "Landroid/os/Messenger;", "serviceConnection", "Landroid/content/ServiceConnection;", "unbindServiceSafely", "", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleServiceBinderImpl implements com.google.firebase.sessions.SessionLifecycleServiceBinder {
    private static final com.google.firebase.sessions.SessionLifecycleServiceBinderImpl.Companion Companion = new com.google.firebase.sessions.SessionLifecycleServiceBinderImpl.Companion(null);

    @java.lang.Deprecated
    public static final java.lang.String TAG = "LifecycleServiceBinder";
    private final android.content.Context appContext;

    @javax.inject.Inject
    public SessionLifecycleServiceBinderImpl(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @Override // com.google.firebase.sessions.SessionLifecycleServiceBinder
    public void bindToService(android.os.Messenger callback, android.content.ServiceConnection serviceConnection) {
        boolean zBindService;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        android.content.Intent intent = new android.content.Intent(this.appContext, (java.lang.Class<?>) com.google.firebase.sessions.SessionLifecycleService.class);
        android.util.Log.d(TAG, "Binding service to application.");
        intent.setAction(java.lang.String.valueOf(android.os.Process.myPid()));
        intent.putExtra(com.google.firebase.sessions.SessionLifecycleService.CLIENT_CALLBACK_MESSENGER, callback);
        intent.setPackage(this.appContext.getPackageName());
        try {
            zBindService = this.appContext.bindService(intent, serviceConnection, 65);
        } catch (java.lang.SecurityException e) {
            android.util.Log.w(TAG, "Failed to bind session lifecycle service to application.", e);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        unbindServiceSafely(this.appContext, serviceConnection);
        android.util.Log.i(TAG, "Session lifecycle service binding failed.");
    }

    private final java.lang.Object unbindServiceSafely(android.content.Context appContext, android.content.ServiceConnection serviceConnection) {
        try {
            appContext.unbindService(serviceConnection);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.IllegalArgumentException e) {
            return java.lang.Integer.valueOf(android.util.Log.w(TAG, "Session lifecycle service binding failed.", e));
        }
    }

    /* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinderImpl$Companion;", "", "()V", "TAG", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
