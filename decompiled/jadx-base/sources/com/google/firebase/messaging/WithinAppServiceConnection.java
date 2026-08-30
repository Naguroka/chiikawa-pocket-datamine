package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class WithinAppServiceConnection implements android.content.ServiceConnection {
    private com.google.firebase.messaging.WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final android.content.Intent connectionIntent;
    private final android.content.Context context;
    private final java.util.Queue<com.google.firebase.messaging.WithinAppServiceConnection.BindRequest> intentQueue;
    private final java.util.concurrent.ScheduledExecutorService scheduledExecutorService;

    static class BindRequest {
        final android.content.Intent intent;
        private final com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource<>();

        BindRequest(android.content.Intent intent) {
            this.intent = intent;
        }

        void arrangeTimeout(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
            final java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new java.lang.Runnable() { // from class: com.google.firebase.messaging.WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m881x9cf97a38();
                }
            }, 20L, java.util.concurrent.TimeUnit.SECONDS);
            getTask().addOnCompleteListener(scheduledExecutorService, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.firebase.messaging.WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(com.google.android.gms.tasks.Task task) {
                    scheduledFutureSchedule.cancel(false);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$arrangeTimeout$0$com-google-firebase-messaging-WithinAppServiceConnection$BindRequest, reason: not valid java name */
        /* synthetic */ void m881x9cf97a38() {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Service took too long to process intent: " + this.intent.getAction() + " finishing.");
            finish();
        }

        com.google.android.gms.tasks.Task<java.lang.Void> getTask() {
            return this.taskCompletionSource.getTask();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void finish() {
            this.taskCompletionSource.trySetResult(null);
        }
    }

    WithinAppServiceConnection(android.content.Context context, java.lang.String str) {
        this(context, str, createScheduledThreadPoolExecutor());
    }

    private static java.util.concurrent.ScheduledThreadPoolExecutor createScheduledThreadPoolExecutor() {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, java.util.concurrent.TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        return scheduledThreadPoolExecutor;
    }

    WithinAppServiceConnection(android.content.Context context, java.lang.String str, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.intentQueue = new java.util.ArrayDeque();
        this.connectionInProgress = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new android.content.Intent(str).setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService;
    }

    synchronized com.google.android.gms.tasks.Task<java.lang.Void> sendIntent(android.content.Intent intent) {
        com.google.firebase.messaging.WithinAppServiceConnection.BindRequest bindRequest;
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "new intent queued in the bind-strategy delivery");
        }
        bindRequest = new com.google.firebase.messaging.WithinAppServiceConnection.BindRequest(intent);
        bindRequest.arrangeTimeout(this.scheduledExecutorService);
        this.intentQueue.add(bindRequest);
        flushQueue();
        return bindRequest.getTask();
    }

    private synchronized void flushQueue() {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "flush queue called");
        }
        while (!this.intentQueue.isEmpty()) {
            if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "found intent to be delivered");
            }
            com.google.firebase.messaging.WithinAppServiceBinder withinAppServiceBinder = this.binder;
            if (withinAppServiceBinder != null && withinAppServiceBinder.isBinderAlive()) {
                if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
                    android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "binder is alive, sending the intent.");
                }
                this.binder.send(this.intentQueue.poll());
            } else {
                startConnectionIfNeeded();
                return;
            }
        }
    }

    private void startConnectionIfNeeded() {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "binder is dead. start connection? " + (!this.connectionInProgress));
        }
        if (this.connectionInProgress) {
            return;
        }
        this.connectionInProgress = true;
        try {
            if (com.google.android.gms.common.stats.ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
                return;
            } else {
                android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "binding to the service failed");
            }
        } catch (java.lang.SecurityException e) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Exception while binding the service", e);
        }
        this.connectionInProgress = false;
        finishAllInQueue();
    }

    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "onServiceConnected: " + componentName);
        }
        this.connectionInProgress = false;
        if (!(iBinder instanceof com.google.firebase.messaging.WithinAppServiceBinder)) {
            android.util.Log.e(com.google.firebase.messaging.Constants.TAG, "Invalid service connection: " + iBinder);
            finishAllInQueue();
        } else {
            this.binder = (com.google.firebase.messaging.WithinAppServiceBinder) iBinder;
            flushQueue();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "onServiceDisconnected: " + componentName);
        }
        flushQueue();
    }
}
