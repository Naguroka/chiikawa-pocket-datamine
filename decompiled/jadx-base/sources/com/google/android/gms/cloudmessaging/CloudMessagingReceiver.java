package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class CloudMessagingReceiver extends android.content.BroadcastReceiver {
    private static java.lang.ref.SoftReference zza;
    private static java.lang.ref.SoftReference zzb;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static final class IntentActionKeys {
        public static final java.lang.String NOTIFICATION_DISMISS = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        public static final java.lang.String NOTIFICATION_OPEN = "com.google.firebase.messaging.NOTIFICATION_OPEN";

        private IntentActionKeys() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
    public static final class IntentKeys {
        public static final java.lang.String PENDING_INTENT = "pending_intent";
        public static final java.lang.String WRAPPED_INTENT = "wrapped_intent";

        private IntentKeys() {
        }
    }

    private final int zzb(android.content.Context context, android.content.Intent intent) {
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
                android.util.Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
        } else {
            extras = new android.os.Bundle();
        }
        if (java.util.Objects.equals(intent.getAction(), com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS)) {
            onNotificationDismissed(context, extras);
            return -1;
        }
        android.util.Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected java.util.concurrent.Executor getBroadcastExecutor() {
        java.util.concurrent.ExecutorService executorServiceUnconfigurableExecutorService;
        synchronized (com.google.android.gms.cloudmessaging.CloudMessagingReceiver.class) {
            java.lang.ref.SoftReference softReference = zza;
            executorServiceUnconfigurableExecutorService = softReference != null ? (java.util.concurrent.ExecutorService) softReference.get() : null;
            if (executorServiceUnconfigurableExecutorService == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                executorServiceUnconfigurableExecutorService = java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newCachedThreadPool(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("firebase-iid-executor")));
                zza = new java.lang.ref.SoftReference(executorServiceUnconfigurableExecutorService);
            }
        }
        return executorServiceUnconfigurableExecutorService;
    }

    protected abstract int onMessageReceive(android.content.Context context, com.google.android.gms.cloudmessaging.CloudMessage cloudMessage);

    protected void onNotificationDismissed(android.content.Context context, android.os.Bundle bundle) {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final android.content.Context context, final android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final android.content.BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        getBroadcastExecutor().execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }

    final /* synthetic */ void zza(android.content.Intent intent, final android.content.Context context, boolean z, android.content.BroadcastReceiver.PendingResult pendingResult) {
        java.util.concurrent.Executor executorUnconfigurableExecutorService;
        int iZzb;
        try {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra(com.google.android.gms.cloudmessaging.CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT);
            android.content.Intent intent2 = parcelableExtra instanceof android.content.Intent ? (android.content.Intent) parcelableExtra : null;
            if (intent2 != null) {
                iZzb = zzb(context, intent2);
            } else if (intent.getExtras() == null) {
                iZzb = 500;
            } else {
                final com.google.android.gms.cloudmessaging.CloudMessage cloudMessage = new com.google.android.gms.cloudmessaging.CloudMessage(intent);
                final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                synchronized (com.google.android.gms.cloudmessaging.CloudMessagingReceiver.class) {
                    java.lang.ref.SoftReference softReference = zzb;
                    executorUnconfigurableExecutorService = softReference != null ? (java.util.concurrent.Executor) softReference.get() : null;
                    if (executorUnconfigurableExecutorService == null) {
                        com.google.android.gms.internal.cloudmessaging.zze.zza();
                        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(1, 1, 60L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("pscm-ack-executor"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executorUnconfigurableExecutorService = java.util.concurrent.Executors.unconfigurableExecutorService(threadPoolExecutor);
                        zzb = new java.lang.ref.SoftReference(executorUnconfigurableExecutorService);
                    }
                }
                executorUnconfigurableExecutorService.execute(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzg
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.tasks.Task taskZzc;
                        com.google.android.gms.cloudmessaging.CloudMessage cloudMessage2 = cloudMessage;
                        if (android.text.TextUtils.isEmpty(cloudMessage2.getMessageId())) {
                            taskZzc = com.google.android.gms.tasks.Tasks.forResult(null);
                        } else {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID, cloudMessage2.getMessageId());
                            java.lang.Integer numZza = cloudMessage2.zza();
                            if (numZza != null) {
                                bundle.putInt(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRODUCT_ID, numZza.intValue());
                            }
                            android.content.Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            taskZzc = com.google.android.gms.cloudmessaging.zzv.zzb(context2).zzc(2, bundle);
                        }
                        final java.util.concurrent.CountDownLatch countDownLatch2 = countDownLatch;
                        taskZzc.addOnCompleteListener(new java.util.concurrent.Executor() { // from class: com.google.android.gms.cloudmessaging.zze
                            @Override // java.util.concurrent.Executor
                            public final void execute(java.lang.Runnable runnable) {
                                runnable.run();
                            }
                        }, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzf
                            @Override // com.google.android.gms.tasks.OnCompleteListener
                            public final void onComplete(com.google.android.gms.tasks.Task task) {
                                countDownLatch2.countDown();
                            }
                        });
                    }
                });
                int iOnMessageReceive = onMessageReceive(context, cloudMessage);
                try {
                    if (!countDownLatch.await(java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), java.util.concurrent.TimeUnit.MILLISECONDS)) {
                        android.util.Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (java.lang.InterruptedException e) {
                    android.util.Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e.toString()));
                }
                iZzb = iOnMessageReceive;
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(iZzb);
            }
            if (pendingResult != null) {
                pendingResult.finish();
            }
        } catch (java.lang.Throwable th) {
            if (pendingResult != null) {
                pendingResult.finish();
            }
            throw th;
        }
    }
}
