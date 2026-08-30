package com.google.firebase.sessions;

/* JADX INFO: compiled from: SessionLifecycleService.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService;", "Landroid/app/Service;", "()V", "handlerThread", "Landroid/os/HandlerThread;", "getHandlerThread$com_google_firebase_firebase_sessions", "()Landroid/os/HandlerThread;", "messageHandler", "Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "messenger", "Landroid/os/Messenger;", "getClientCallback", "intent", "Landroid/content/Intent;", "onBind", "Landroid/os/IBinder;", "onCreate", "", "onDestroy", "Companion", "MessageHandler", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SessionLifecycleService extends android.app.Service {
    public static final int BACKGROUNDED = 2;
    private static final int CLIENT_BOUND = 4;
    public static final java.lang.String CLIENT_CALLBACK_MESSENGER = "ClientCallbackMessenger";
    public static final int FOREGROUNDED = 1;
    public static final int SESSION_UPDATED = 3;
    public static final java.lang.String SESSION_UPDATE_EXTRA = "SessionUpdateExtra";
    public static final java.lang.String TAG = "SessionLifecycleService";
    private final android.os.HandlerThread handlerThread = new android.os.HandlerThread("FirebaseSessions_HandlerThread");
    private com.google.firebase.sessions.SessionLifecycleService.MessageHandler messageHandler;
    private android.os.Messenger messenger;

    /* JADX INFO: renamed from: getHandlerThread$com_google_firebase_firebase_sessions, reason: from getter */
    public final android.os.HandlerThread getHandlerThread() {
        return this.handlerThread;
    }

    /* JADX INFO: compiled from: SessionLifecycleService.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0007H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/SessionLifecycleService$MessageHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "boundClients", "Ljava/util/ArrayList;", "Landroid/os/Messenger;", "Lkotlin/collections/ArrayList;", "hasForegrounded", "", "lastMsgTimeMs", "", "broadcastSession", "", "handleBackgrounding", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroid/os/Message;", "handleClientBound", "handleForegrounding", "handleMessage", "isSessionRestart", "foregroundTimeMs", "maybeSendSessionToClient", "client", "newSession", "sendSessionToClient", com.unity3d.services.core.device.reader.JsonStorageKeyNames.SESSION_ID_KEY, "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class MessageHandler extends android.os.Handler {
        private final java.util.ArrayList<android.os.Messenger> boundClients;
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageHandler(android.os.Looper looper) {
            super(looper);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(looper, "looper");
            this.boundClients = new java.util.ArrayList<>();
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message msg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "msg");
            if (this.lastMsgTimeMs > msg.getWhen()) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Ignoring old message from " + msg.getWhen() + " which is older than " + this.lastMsgTimeMs + '.');
                return;
            }
            int i = msg.what;
            if (i == 1) {
                handleForegrounding(msg);
                return;
            }
            if (i == 2) {
                handleBackgrounding(msg);
            } else if (i == 4) {
                handleClientBound(msg);
            } else {
                android.util.Log.w(com.google.firebase.sessions.SessionLifecycleService.TAG, "Received unexpected event from the SessionLifecycleClient: " + msg);
                super.handleMessage(msg);
            }
        }

        private final void handleForegrounding(android.os.Message msg) {
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Activity foregrounding at " + msg.getWhen() + '.');
            if (!this.hasForegrounded) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Cold start detected.");
                this.hasForegrounded = true;
                newSession();
            } else if (isSessionRestart(msg.getWhen())) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Session too long in background. Creating new session.");
                newSession();
            }
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final void handleBackgrounding(android.os.Message msg) {
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Activity backgrounding at " + msg.getWhen());
            this.lastMsgTimeMs = msg.getWhen();
        }

        private final void handleClientBound(android.os.Message msg) {
            this.boundClients.add(msg.replyTo);
            android.os.Messenger messenger = msg.replyTo;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(messenger, "msg.replyTo");
            maybeSendSessionToClient(messenger);
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Client " + msg.replyTo + " bound at " + msg.getWhen() + ". Clients: " + this.boundClients.size());
        }

        private final void newSession() {
            try {
                com.google.firebase.sessions.SessionGenerator.INSTANCE.getInstance().generateNewSession();
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Generated new session.");
                broadcastSession();
                com.google.firebase.sessions.SessionDatastore.INSTANCE.getInstance().updateSessionId(com.google.firebase.sessions.SessionGenerator.INSTANCE.getInstance().getCurrentSession().getSessionId());
            } catch (java.lang.IllegalStateException e) {
                android.util.Log.w(com.google.firebase.sessions.SessionLifecycleService.TAG, "Failed to generate new session.", e);
            }
        }

        private final void broadcastSession() {
            android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Broadcasting new session");
            com.google.firebase.sessions.SessionFirelogPublisher.INSTANCE.getInstance().logSession(com.google.firebase.sessions.SessionGenerator.INSTANCE.getInstance().getCurrentSession());
            for (android.os.Messenger it : new java.util.ArrayList(this.boundClients)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
                maybeSendSessionToClient(it);
            }
        }

        private final void maybeSendSessionToClient(android.os.Messenger client) {
            try {
                if (this.hasForegrounded) {
                    sendSessionToClient(client, com.google.firebase.sessions.SessionGenerator.INSTANCE.getInstance().getCurrentSession().getSessionId());
                } else {
                    java.lang.String currentSessionId = com.google.firebase.sessions.SessionDatastore.INSTANCE.getInstance().getCurrentSessionId();
                    android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "App has not yet foregrounded. Using previously stored session.");
                    if (currentSessionId != null) {
                        sendSessionToClient(client, currentSessionId);
                    }
                }
            } catch (java.lang.IllegalStateException e) {
                android.util.Log.w(com.google.firebase.sessions.SessionLifecycleService.TAG, "Failed to send session to client.", e);
            }
        }

        private final void sendSessionToClient(android.os.Messenger client, java.lang.String sessionId) {
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.google.firebase.sessions.SessionLifecycleService.SESSION_UPDATE_EXTRA, sessionId);
                android.os.Message messageObtain = android.os.Message.obtain(null, 3, 0, 0);
                messageObtain.setData(bundle);
                client.send(messageObtain);
            } catch (android.os.DeadObjectException unused) {
                android.util.Log.d(com.google.firebase.sessions.SessionLifecycleService.TAG, "Removing dead client from list: " + client);
                this.boundClients.remove(client);
            } catch (java.lang.Exception e) {
                android.util.Log.w(com.google.firebase.sessions.SessionLifecycleService.TAG, "Unable to push new session to " + client + '.', e);
            }
        }

        private final boolean isSessionRestart(long foregroundTimeMs) {
            return foregroundTimeMs - this.lastMsgTimeMs > kotlin.time.Duration.m2646getInWholeMillisecondsimpl(com.google.firebase.sessions.settings.SessionsSettings.INSTANCE.getInstance().m887getSessionRestartTimeoutUwyO8pc());
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        android.os.Looper looper = this.handlerThread.getLooper();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(looper, "handlerThread.looper");
        this.messageHandler = new com.google.firebase.sessions.SessionLifecycleService.MessageHandler(looper);
        this.messenger = new android.os.Messenger(this.messageHandler);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        if (intent == null) {
            android.util.Log.d(TAG, "Service bound with null intent. Ignoring.");
            return null;
        }
        android.util.Log.d(TAG, "Service bound to new client on process " + intent.getAction());
        android.os.Messenger clientCallback = getClientCallback(intent);
        if (clientCallback != null) {
            android.os.Message messageObtain = android.os.Message.obtain(null, 4, 0, 0);
            messageObtain.replyTo = clientCallback;
            com.google.firebase.sessions.SessionLifecycleService.MessageHandler messageHandler = this.messageHandler;
            if (messageHandler != null) {
                messageHandler.sendMessage(messageObtain);
            }
        }
        android.os.Messenger messenger = this.messenger;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }

    private final android.os.Messenger getClientCallback(android.content.Intent intent) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return (android.os.Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER, android.os.Messenger.class);
        }
        return (android.os.Messenger) intent.getParcelableExtra(CLIENT_CALLBACK_MESSENGER);
    }
}
