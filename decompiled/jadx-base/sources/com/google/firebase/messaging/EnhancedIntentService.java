package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public abstract class EnhancedIntentService extends android.app.Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final java.lang.String TAG = "EnhancedIntentService";
    private android.os.Binder binder;
    private int lastStartId;
    final java.util.concurrent.ExecutorService executor = com.google.firebase.messaging.FcmExecutors.newIntentHandleExecutor();
    private final java.lang.Object lock = new java.lang.Object();
    private int runningTasks = 0;

    protected android.content.Intent getStartCommandIntent(android.content.Intent intent) {
        return intent;
    }

    public abstract void handleIntent(android.content.Intent intent);

    public boolean handleIntentOnMainThread(android.content.Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized android.os.IBinder onBind(android.content.Intent intent) {
        if (android.util.Log.isLoggable(TAG, 3)) {
            android.util.Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new com.google.firebase.messaging.WithinAppServiceBinder(new com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler() { // from class: com.google.firebase.messaging.EnhancedIntentService.1
                @Override // com.google.firebase.messaging.WithinAppServiceBinder.IntentHandler
                public com.google.android.gms.tasks.Task<java.lang.Void> handle(android.content.Intent intent2) {
                    return com.google.firebase.messaging.EnhancedIntentService.this.processIntent(intent2);
                }
            });
        }
        return this.binder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.android.gms.tasks.Task<java.lang.Void> processIntent(final android.content.Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return com.google.android.gms.tasks.Tasks.forResult(null);
        }
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        this.executor.execute(new java.lang.Runnable() { // from class: com.google.firebase.messaging.EnhancedIntentService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m864x624ce8b2(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: renamed from: lambda$processIntent$0$com-google-firebase-messaging-EnhancedIntentService, reason: not valid java name */
    /* synthetic */ void m864x624ce8b2(android.content.Intent intent, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.setResult(null);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final android.content.Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        android.content.Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        com.google.android.gms.tasks.Task<java.lang.Void> taskProcessIntent = processIntent(startCommandIntent);
        if (taskProcessIntent.isComplete()) {
            finishTask(intent);
            return 2;
        }
        taskProcessIntent.addOnCompleteListener(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.firebase.messaging.EnhancedIntentService$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.f$0.m863x83fa35aa(intent, task);
            }
        });
        return 3;
    }

    /* JADX INFO: renamed from: lambda$onStartCommand$1$com-google-firebase-messaging-EnhancedIntentService, reason: not valid java name */
    /* synthetic */ void m863x83fa35aa(android.content.Intent intent, com.google.android.gms.tasks.Task task) {
        finishTask(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    private void finishTask(android.content.Intent intent) {
        if (intent != null) {
            com.google.firebase.messaging.WakeLockHolder.completeWakefulIntent(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
