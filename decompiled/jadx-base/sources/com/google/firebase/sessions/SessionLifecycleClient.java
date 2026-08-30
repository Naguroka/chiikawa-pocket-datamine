package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionLifecycleClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\b\u0000\u0018\u0000 $2\u00020\u0001:\u0002#$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0010J \u0010\u0017\u001a\u0004\u0018\u00010\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0007H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001bH\u0002J\u0016\u0010 \u001a\u00020!2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0003J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006%"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", "", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "queuedMessages", "Ljava/util/concurrent/LinkedBlockingDeque;", "Landroid/os/Message;", androidx.core.app.NotificationCompat.CATEGORY_SERVICE, "Landroid/os/Messenger;", "serviceBound", "", "serviceConnection", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "backgrounded", "", "bindToService", "sessionLifecycleServiceBinder", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "drainQueue", "", "foregrounded", "getLatestByCode", "messages", "", "msgCode", "", "queueMessage", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "sendLifecycleEvent", "messageCode", "sendLifecycleEvents", "Lkotlinx/coroutines/Job;", "sendMessageToServer", "ClientUpdateHandler", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleClient {
    private static final int MAX_QUEUED_MESSAGES = 20;
    public static final java.lang.String TAG = "SessionLifecycleClient";
    private final kotlin.coroutines.CoroutineContext backgroundDispatcher;
    private final java.util.concurrent.LinkedBlockingDeque<android.os.Message> queuedMessages;
    private android.os.Messenger service;
    private boolean serviceBound;
    private final com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1 serviceConnection;

    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1] */
    public SessionLifecycleClient(kotlin.coroutines.CoroutineContext backgroundDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.backgroundDispatcher = backgroundDispatcher;
        this.queuedMessages = new java.util.concurrent.LinkedBlockingDeque<>(20);
        this.serviceConnection = new android.content.ServiceConnection() { // from class: com.google.firebase.sessions.SessionLifecycleClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(android.content.ComponentName className, android.os.IBinder serviceBinder) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Connected to SessionLifecycleService. Queue size " + this.this$0.queuedMessages.size());
                this.this$0.service = new android.os.Messenger(serviceBinder);
                this.this$0.serviceBound = true;
                com.google.firebase.sessions.SessionLifecycleClient sessionLifecycleClient = this.this$0;
                sessionLifecycleClient.sendLifecycleEvents(sessionLifecycleClient.drainQueue());
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(android.content.ComponentName className) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Disconnected from SessionLifecycleService");
                this.this$0.service = null;
                this.this$0.serviceBound = false;
            }
        };
    }

    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "handleMessage", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroid/os/Message;", "handleSessionUpdate", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientUpdateHandler extends android.os.Handler {
        private final kotlin.coroutines.CoroutineContext backgroundDispatcher;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(kotlin.coroutines.CoroutineContext backgroundDispatcher) {
            super(android.os.Looper.getMainLooper());
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
            this.backgroundDispatcher = backgroundDispatcher;
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message msg) {
            java.lang.String string;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
            if (msg.what == 3) {
                android.os.Bundle data = msg.getData();
                if (data == null || (string = data.getString(com.google.firebase.sessions.SessionLifecycleService.SESSION_UPDATE_EXTRA)) == null) {
                    string = "";
                }
                handleSessionUpdate(string);
                return;
            }
            android.util.Log.w(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }

        private final void handleSessionUpdate(java.lang.String sessionId) {
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Session update received.");
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(sessionId, null), 3, null);
        }
    }

    public final void bindToService(com.google.firebase.sessions.SessionLifecycleServiceBinder sessionLifecycleServiceBinder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionLifecycleServiceBinder, "sessionLifecycleServiceBinder");
        sessionLifecycleServiceBinder.bindToService(new android.os.Messenger(new com.google.firebase.sessions.SessionLifecycleClient.ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    private final void sendLifecycleEvent(int messageCode) {
        java.util.List<android.os.Message> listDrainQueue = drainQueue();
        android.os.Message messageObtain = android.os.Message.obtain(null, messageCode, 0, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messageObtain, "obtain(null, messageCode, 0, 0)");
        listDrainQueue.add(messageObtain);
        sendLifecycleEvents(listDrainQueue);
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1, reason: invalid class name */
    /* JADX INFO: compiled from: SessionLifecycleClient.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", f = "SessionLifecycleClient.kt", i = {}, l = {org.objectweb.asm.Opcodes.DCMPL}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.List<android.os.Message> $messages;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(java.util.List<android.os.Message> list, kotlin.coroutines.Continuation<? super com.google.firebase.sessions.SessionLifecycleClient.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$messages = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return com.google.firebase.sessions.SessionLifecycleClient.this.new AnonymousClass1(this.$messages, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.google.firebase.sessions.SessionLifecycleClient.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean z;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            java.util.Map map = (java.util.Map) obj;
            if (map.isEmpty()) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                java.util.Collection collectionValues = map.values();
                if (!(collectionValues instanceof java.util.Collection) || !collectionValues.isEmpty()) {
                    java.util.Iterator it = collectionValues.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        if (((com.google.firebase.sessions.api.SessionSubscriber) it.next()).isDataCollectionEnabled()) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    z = true;
                    break;
                }
                if (z) {
                    android.util.Log.d(com.google.firebase.sessions.SessionLifecycleClient.TAG, "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    java.util.List listSortedWith = kotlin.collections.CollectionsKt.sortedWith(kotlin.collections.CollectionsKt.filterNotNull(kotlin.collections.CollectionsKt.mutableListOf(com.google.firebase.sessions.SessionLifecycleClient.this.getLatestByCode(this.$messages, 2), com.google.firebase.sessions.SessionLifecycleClient.this.getLatestByCode(this.$messages, 1))), new java.util.Comparator() { // from class: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((android.os.Message) t).getWhen()), java.lang.Long.valueOf(((android.os.Message) t2).getWhen()));
                        }
                    });
                    com.google.firebase.sessions.SessionLifecycleClient sessionLifecycleClient = com.google.firebase.sessions.SessionLifecycleClient.this;
                    java.util.Iterator it2 = listSortedWith.iterator();
                    while (it2.hasNext()) {
                        sessionLifecycleClient.sendMessageToServer((android.os.Message) it2.next());
                    }
                }
            }
            return kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.Job sendLifecycleEvents(java.util.List<android.os.Message> messages) {
        return kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(this.backgroundDispatcher), null, null, new com.google.firebase.sessions.SessionLifecycleClient.AnonymousClass1(messages, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(android.os.Message msg) {
        if (this.service != null) {
            try {
                android.util.Log.d(TAG, "Sending lifecycle " + msg.what + " to service");
                android.os.Messenger messenger = this.service;
                if (messenger != null) {
                    messenger.send(msg);
                    return;
                }
                return;
            } catch (android.os.RemoteException e) {
                android.util.Log.w(TAG, "Unable to deliver message: " + msg.what, e);
                queueMessage(msg);
                return;
            }
        }
        queueMessage(msg);
    }

    private final void queueMessage(android.os.Message msg) {
        if (this.queuedMessages.offer(msg)) {
            android.util.Log.d(TAG, "Queued message " + msg.what + ". Queue size " + this.queuedMessages.size());
        } else {
            android.util.Log.d(TAG, "Failed to enqueue message " + msg.what + ". Dropping.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<android.os.Message> drainQueue() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.Message getLatestByCode(java.util.List<android.os.Message> messages, int msgCode) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : messages) {
            if (((android.os.Message) obj2).what == msgCode) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (it.hasNext()) {
                long when = ((android.os.Message) next).getWhen();
                do {
                    java.lang.Object next2 = it.next();
                    long when2 = ((android.os.Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (android.os.Message) obj;
    }
}
