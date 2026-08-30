package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public class FcmBroadcastProcessor {
    private static final java.lang.String EXTRA_BINARY_DATA = "rawData";
    private static final java.lang.String EXTRA_BINARY_DATA_BASE_64 = "gcm.rawData64";
    private static com.google.firebase.messaging.WithinAppServiceConnection fcmServiceConn;
    private static final java.lang.Object lock = new java.lang.Object();
    private final android.content.Context context;
    private final java.util.concurrent.Executor executor;

    public FcmBroadcastProcessor(android.content.Context context) {
        this.context = context;
        this.executor = new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0();
    }

    public FcmBroadcastProcessor(android.content.Context context, java.util.concurrent.ExecutorService executorService) {
        this.context = context;
        this.executor = executorService;
    }

    public com.google.android.gms.tasks.Task<java.lang.Integer> process(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra(EXTRA_BINARY_DATA_BASE_64);
        if (stringExtra != null) {
            intent.putExtra("rawData", android.util.Base64.decode(stringExtra, 0));
            intent.removeExtra(EXTRA_BINARY_DATA_BASE_64);
        }
        return startMessagingService(this.context, intent);
    }

    public com.google.android.gms.tasks.Task<java.lang.Integer> startMessagingService(final android.content.Context context, final android.content.Intent intent) {
        boolean z = com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return bindToMessagingService(context, intent, z2);
        }
        return com.google.android.gms.tasks.Tasks.call(this.executor, new java.util.concurrent.Callable() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return java.lang.Integer.valueOf(com.google.firebase.messaging.ServiceStarter.getInstance().startMessagingService(context, intent));
            }
        }).continueWithTask(this.executor, new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.firebase.messaging.FcmBroadcastProcessor.lambda$startMessagingService$2(context, intent, z2, task);
            }
        });
    }

    static /* synthetic */ com.google.android.gms.tasks.Task lambda$startMessagingService$2(android.content.Context context, android.content.Intent intent, boolean z, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return (com.google.android.gms.common.util.PlatformVersion.isAtLeastO() && ((java.lang.Integer) task.getResult()).intValue() == 402) ? bindToMessagingService(context, intent, z).continueWith(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task2) {
                return com.google.firebase.messaging.FcmBroadcastProcessor.lambda$startMessagingService$1(task2);
            }
        }) : task;
    }

    static /* synthetic */ java.lang.Integer lambda$startMessagingService$1(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return 403;
    }

    private static com.google.android.gms.tasks.Task<java.lang.Integer> bindToMessagingService(android.content.Context context, android.content.Intent intent, boolean z) {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Binding to service");
        }
        com.google.firebase.messaging.WithinAppServiceConnection serviceConnection = getServiceConnection(context, com.google.firebase.iid.ServiceStarter.ACTION_MESSAGING_EVENT);
        if (z) {
            if (com.google.firebase.messaging.ServiceStarter.getInstance().hasWakeLockPermission(context)) {
                com.google.firebase.messaging.WakeLockHolder.sendWakefulServiceIntent(context, serviceConnection, intent);
            } else {
                serviceConnection.sendIntent(intent);
            }
            return com.google.android.gms.tasks.Tasks.forResult(-1);
        }
        return serviceConnection.sendIntent(intent).continueWith(new androidx.media3.exoplayer.dash.offline.DashDownloader$$ExternalSyntheticLambda0(), new com.google.android.gms.tasks.Continuation() { // from class: com.google.firebase.messaging.FcmBroadcastProcessor$$ExternalSyntheticLambda3
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                return com.google.firebase.messaging.FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
            }
        });
    }

    static /* synthetic */ java.lang.Integer lambda$bindToMessagingService$3(com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return -1;
    }

    private static com.google.firebase.messaging.WithinAppServiceConnection getServiceConnection(android.content.Context context, java.lang.String str) {
        com.google.firebase.messaging.WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new com.google.firebase.messaging.WithinAppServiceConnection(context, str);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }

    public static void reset() {
        synchronized (lock) {
            fcmServiceConn = null;
        }
    }

    public static void setServiceConnection(com.google.firebase.messaging.WithinAppServiceConnection withinAppServiceConnection) {
        synchronized (lock) {
            fcmServiceConn = withinAppServiceConnection;
        }
    }
}
