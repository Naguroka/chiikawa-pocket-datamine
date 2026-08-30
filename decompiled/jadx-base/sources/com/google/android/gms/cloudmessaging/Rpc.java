package com.google.android.gms.cloudmessaging;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* JADX INFO: loaded from: classes4.dex */
public class Rpc {
    private static int zza;
    private static android.app.PendingIntent zzb;
    private static final java.util.concurrent.Executor zzc = new java.util.concurrent.Executor() { // from class: com.google.android.gms.cloudmessaging.zzy
        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable runnable) {
            runnable.run();
        }
    };
    private static final java.util.regex.Pattern zzd = java.util.regex.Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final android.content.Context zzf;
    private final com.google.android.gms.cloudmessaging.zzw zzg;
    private final java.util.concurrent.ScheduledExecutorService zzh;
    private android.os.Messenger zzj;
    private com.google.android.gms.cloudmessaging.zzd zzk;
    private final androidx.collection.SimpleArrayMap zze = new androidx.collection.SimpleArrayMap();
    private final android.os.Messenger zzi = new android.os.Messenger(new com.google.android.gms.cloudmessaging.zzae(this, android.os.Looper.getMainLooper()));

    public Rpc(android.content.Context context) {
        this.zzf = context;
        this.zzg = new com.google.android.gms.cloudmessaging.zzw(context);
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, java.util.concurrent.TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzh = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ com.google.android.gms.tasks.Task zza(android.os.Bundle bundle) throws java.lang.Exception {
        return zzi(bundle) ? com.google.android.gms.tasks.Tasks.forResult(null) : com.google.android.gms.tasks.Tasks.forResult(bundle);
    }

    static /* bridge */ /* synthetic */ void zzc(com.google.android.gms.cloudmessaging.Rpc rpc, android.os.Message message) {
        if (message == null || !(message.obj instanceof android.content.Intent)) {
            android.util.Log.w("Rpc", "Dropping invalid message");
            return;
        }
        android.content.Intent intent = (android.content.Intent) message.obj;
        intent.setExtrasClassLoader(new com.google.android.gms.cloudmessaging.zzc());
        if (intent.hasExtra("google.messenger")) {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof com.google.android.gms.cloudmessaging.zzd) {
                rpc.zzk = (com.google.android.gms.cloudmessaging.zzd) parcelableExtra;
            }
            if (parcelableExtra instanceof android.os.Messenger) {
                rpc.zzj = (android.os.Messenger) parcelableExtra;
            }
        }
        android.content.Intent intent2 = (android.content.Intent) message.obj;
        java.lang.String action = intent2.getAction();
        if (!java.util.Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
            if (android.util.Log.isLoggable("Rpc", 3)) {
                android.util.Log.d("Rpc", "Unexpected response action: ".concat(java.lang.String.valueOf(action)));
                return;
            }
            return;
        }
        java.lang.String stringExtra = intent2.getStringExtra("registration_id");
        if (stringExtra == null) {
            stringExtra = intent2.getStringExtra("unregistered");
        }
        if (stringExtra != null) {
            java.util.regex.Matcher matcher = zzd.matcher(stringExtra);
            if (!matcher.matches()) {
                if (android.util.Log.isLoggable("Rpc", 3)) {
                    android.util.Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                    return;
                }
                return;
            }
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                android.os.Bundle extras = intent2.getExtras();
                extras.putString("registration_id", strGroup2);
                rpc.zzh(strGroup, extras);
                return;
            }
            return;
        }
        java.lang.String stringExtra2 = intent2.getStringExtra("error");
        if (stringExtra2 == null) {
            android.util.Log.w("Rpc", "Unexpected response, no error or registration id ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent2.getExtras()))));
            return;
        }
        if (android.util.Log.isLoggable("Rpc", 3)) {
            android.util.Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
        }
        if (!stringExtra2.startsWith("|")) {
            synchronized (rpc.zze) {
                for (int i = 0; i < rpc.zze.size(); i++) {
                    rpc.zzh((java.lang.String) rpc.zze.keyAt(i), intent2.getExtras());
                }
            }
            return;
        }
        java.lang.String[] strArrSplit = stringExtra2.split("\\|");
        if (strArrSplit.length <= 2 || !java.util.Objects.equals(strArrSplit[1], "ID")) {
            android.util.Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
            return;
        }
        java.lang.String str = strArrSplit[2];
        java.lang.String strSubstring = strArrSplit[3];
        if (strSubstring.startsWith(":")) {
            strSubstring = strSubstring.substring(1);
        }
        rpc.zzh(str, intent2.putExtra("error", strSubstring).getExtras());
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    private final com.google.android.gms.tasks.Task zze(android.os.Bundle bundle) {
        final java.lang.String strZzf = zzf();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = new com.google.android.gms.tasks.TaskCompletionSource();
        synchronized (this.zze) {
            this.zze.put(strZzf, taskCompletionSource);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzg.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zzg(this.zzf, intent);
        intent.putExtra("kid", "|ID|" + strZzf + "|");
        if (android.util.Log.isLoggable("Rpc", 3)) {
            android.util.Log.d("Rpc", "Sending ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.zzi);
        if (this.zzj != null || this.zzk != null) {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.obj = intent;
            try {
                android.os.Messenger messenger = this.zzj;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.zzk.zzb(messageObtain);
                }
            } catch (android.os.RemoteException unused) {
                if (android.util.Log.isLoggable("Rpc", 3)) {
                    android.util.Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.zzg.zzb() == 2) {
                    this.zzf.sendBroadcast(intent);
                } else {
                    this.zzf.startService(intent);
                }
            }
        } else if (this.zzg.zzb() == 2) {
            this.zzf.sendBroadcast(intent);
        } else {
            this.zzf.startService(intent);
        }
        final java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = this.zzh.schedule(new java.lang.Runnable() { // from class: com.google.android.gms.cloudmessaging.zzac
            @Override // java.lang.Runnable
            public final void run() {
                if (taskCompletionSource.trySetException(new java.io.IOException("TIMEOUT"))) {
                    android.util.Log.w("Rpc", "No response");
                }
            }
        }, 30L, java.util.concurrent.TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new com.google.android.gms.tasks.OnCompleteListener() { // from class: com.google.android.gms.cloudmessaging.zzad
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(com.google.android.gms.tasks.Task task) {
                this.zza.zzd(strZzf, scheduledFutureSchedule, task);
            }
        });
        return taskCompletionSource.getTask();
    }

    private static synchronized java.lang.String zzf() {
        int i;
        i = zza;
        zza = i + 1;
        return java.lang.Integer.toString(i);
    }

    private static synchronized void zzg(android.content.Context context, android.content.Intent intent) {
        if (zzb == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            zzb = android.app.PendingIntent.getBroadcast(context, 0, intent2, com.google.android.gms.internal.cloudmessaging.zza.zza);
        }
        intent.putExtra("app", zzb);
    }

    private final void zzh(java.lang.String str, android.os.Bundle bundle) {
        synchronized (this.zze) {
            com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) this.zze.remove(str);
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(bundle);
                return;
            }
            android.util.Log.w("Rpc", "Missing callback for " + str);
        }
    }

    private static boolean zzi(android.os.Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public com.google.android.gms.tasks.Task<com.google.android.gms.cloudmessaging.CloudMessage> getProxiedNotificationData() {
        return this.zzg.zza() >= 241100000 ? com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzd(5, android.os.Bundle.EMPTY).continueWith(zzc, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.cloudmessaging.zzab
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                android.content.Intent intent = (android.content.Intent) ((android.os.Bundle) task.getResult()).getParcelable("notification_data");
                if (intent != null) {
                    return new com.google.android.gms.cloudmessaging.CloudMessage(intent);
                }
                return null;
            }
        }) : com.google.android.gms.tasks.Tasks.forException(new java.io.IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> messageHandled(com.google.android.gms.cloudmessaging.CloudMessage cloudMessage) {
        if (this.zzg.zza() < 233700000) {
            return com.google.android.gms.tasks.Tasks.forException(new java.io.IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.google.firebase.messaging.Constants.MessagePayloadKeys.MSGID, cloudMessage.getMessageId());
        java.lang.Integer numZza = cloudMessage.zza();
        if (numZza != null) {
            bundle.putInt(com.google.firebase.messaging.Constants.MessagePayloadKeys.PRODUCT_ID, numZza.intValue());
        }
        return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzc(3, bundle);
    }

    public com.google.android.gms.tasks.Task<android.os.Bundle> send(final android.os.Bundle bundle) {
        if (this.zzg.zza() < 12000000) {
            return this.zzg.zzb() != 0 ? zze(bundle).continueWithTask(zzc, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.cloudmessaging.zzz
                @Override // com.google.android.gms.tasks.Continuation
                public final java.lang.Object then(com.google.android.gms.tasks.Task task) {
                    return this.zza.zzb(bundle, task);
                }
            }) : com.google.android.gms.tasks.Tasks.forException(new java.io.IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, new com.google.android.gms.tasks.Continuation() { // from class: com.google.android.gms.cloudmessaging.zzaa
            @Override // com.google.android.gms.tasks.Continuation
            public final java.lang.Object then(com.google.android.gms.tasks.Task task) throws java.io.IOException {
                if (task.isSuccessful()) {
                    return (android.os.Bundle) task.getResult();
                }
                if (android.util.Log.isLoggable("Rpc", 3)) {
                    android.util.Log.d("Rpc", "Error making request: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(task.getException()))));
                }
                throw new java.io.IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, task.getException());
            }
        });
    }

    public com.google.android.gms.tasks.Task<java.lang.Void> setRetainProxiedNotifications(boolean z) {
        if (this.zzg.zza() < 241100000) {
            return com.google.android.gms.tasks.Tasks.forException(new java.io.IOException(com.google.firebase.iid.GmsRpc.ERROR_SERVICE_NOT_AVAILABLE));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("proxy_retention", z);
        return com.google.android.gms.cloudmessaging.zzv.zzb(this.zzf).zzc(4, bundle);
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zzb(android.os.Bundle bundle, com.google.android.gms.tasks.Task task) throws java.lang.Exception {
        return (task.isSuccessful() && zzi((android.os.Bundle) task.getResult())) ? zze(bundle).onSuccessTask(zzc, new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.gms.cloudmessaging.zzx
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.gms.cloudmessaging.Rpc.zza((android.os.Bundle) obj);
            }
        }) : task;
    }

    final /* synthetic */ void zzd(java.lang.String str, java.util.concurrent.ScheduledFuture scheduledFuture, com.google.android.gms.tasks.Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
