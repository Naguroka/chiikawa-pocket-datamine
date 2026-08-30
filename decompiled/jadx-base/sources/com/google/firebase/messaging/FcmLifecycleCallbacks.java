package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class FcmLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
    private static final int RECENTLY_LOGGED_MESSAGE_IDS_MAX_SIZE = 10;
    private final java.util.Queue<java.lang.String> recentlyLoggedMessageIds = new java.util.ArrayDeque(10);

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(android.app.Activity activity) {
    }

    FcmLifecycleCallbacks() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        final android.content.Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT <= 25) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.google.firebase.messaging.FcmLifecycleCallbacks$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m865xd8132052(intent);
                }
            });
        } else {
            m865xd8132052(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: logNotificationOpen, reason: merged with bridge method [inline-methods] */
    public void m865xd8132052(android.content.Intent intent) {
        android.os.Bundle bundle = null;
        try {
            android.os.Bundle extras = intent.getExtras();
            if (extras != null) {
                java.lang.String messageId = com.google.firebase.messaging.MessagingAnalytics.getMessageId(extras);
                if (!android.text.TextUtils.isEmpty(messageId)) {
                    if (this.recentlyLoggedMessageIds.contains(messageId)) {
                        return;
                    } else {
                        this.recentlyLoggedMessageIds.add(messageId);
                    }
                }
                bundle = extras.getBundle(com.google.firebase.messaging.Constants.MessageNotificationKeys.ANALYTICS_DATA);
            }
        } catch (java.lang.RuntimeException e) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed trying to get analytics data from Intent extras.", e);
        }
        if (com.google.firebase.messaging.MessagingAnalytics.shouldUploadScionMetrics(bundle)) {
            com.google.firebase.messaging.MessagingAnalytics.logNotificationOpen(bundle);
        }
    }
}
