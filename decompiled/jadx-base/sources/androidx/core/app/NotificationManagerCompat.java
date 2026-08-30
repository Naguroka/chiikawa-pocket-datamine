package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final java.lang.String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final java.lang.String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final java.lang.String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final java.lang.String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final java.lang.String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final java.lang.String TAG = "NotifManCompat";
    private static java.lang.String sEnabledNotificationListeners;
    private static androidx.core.app.NotificationManagerCompat.SideChannelManager sSideChannelManager;
    private final android.content.Context mContext;
    private final android.app.NotificationManager mNotificationManager;
    private static final java.lang.Object sEnabledNotificationListenersLock = new java.lang.Object();
    private static java.util.Set<java.lang.String> sEnabledNotificationListenerPackages = new java.util.HashSet();
    private static final java.lang.Object sLock = new java.lang.Object();

    private interface Task {
        void send(android.support.v4.app.INotificationSideChannel iNotificationSideChannel) throws android.os.RemoteException;
    }

    public static androidx.core.app.NotificationManagerCompat from(android.content.Context context) {
        return new androidx.core.app.NotificationManagerCompat(context);
    }

    private NotificationManagerCompat(android.content.Context context) {
        this.mContext = context;
        this.mNotificationManager = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void cancel(java.lang.String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void notify(int i, android.app.Notification notification) {
        notify(null, i, notification);
    }

    public void notify(java.lang.String str, int i, android.app.Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new androidx.core.app.NotificationManagerCompat.NotifyTask(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
        } else {
            this.mNotificationManager.notify(str, i, notification);
        }
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public void createNotificationChannel(android.app.NotificationChannel notificationChannel) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannel(androidx.core.app.NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }

    public void createNotificationChannelGroup(android.app.NotificationChannelGroup notificationChannelGroup) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroup(androidx.core.app.NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }

    public void createNotificationChannels(java.util.List<android.app.NotificationChannel> list) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public void createNotificationChannelsCompat(java.util.List<androidx.core.app.NotificationChannelCompat> list) {
        if (android.os.Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.NotificationChannelCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannel());
        }
        this.mNotificationManager.createNotificationChannels(arrayList);
    }

    public void createNotificationChannelGroups(java.util.List<android.app.NotificationChannelGroup> list) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public void createNotificationChannelGroupsCompat(java.util.List<androidx.core.app.NotificationChannelGroupCompat> list) {
        if (android.os.Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.NotificationChannelGroupCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannelGroup());
        }
        this.mNotificationManager.createNotificationChannelGroups(arrayList);
    }

    public void deleteNotificationChannel(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public void deleteNotificationChannelGroup(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public void deleteUnlistedNotificationChannels(java.util.Collection<java.lang.String> collection) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            for (android.app.NotificationChannel notificationChannel : this.mNotificationManager.getNotificationChannels()) {
                if (!collection.contains(notificationChannel.getId()) && (android.os.Build.VERSION.SDK_INT < 30 || !collection.contains(notificationChannel.getParentChannelId()))) {
                    this.mNotificationManager.deleteNotificationChannel(notificationChannel.getId());
                }
            }
        }
    }

    public android.app.NotificationChannel getNotificationChannel(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannel(str);
        }
        return null;
    }

    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String str) {
        android.app.NotificationChannel notificationChannel;
        if (android.os.Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new androidx.core.app.NotificationChannelCompat(notificationChannel);
    }

    public android.app.NotificationChannel getNotificationChannel(java.lang.String str, java.lang.String str2) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return this.mNotificationManager.getNotificationChannel(str, str2);
        }
        return getNotificationChannel(str);
    }

    public androidx.core.app.NotificationChannelCompat getNotificationChannelCompat(java.lang.String str, java.lang.String str2) {
        android.app.NotificationChannel notificationChannel;
        if (android.os.Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new androidx.core.app.NotificationChannelCompat(notificationChannel);
    }

    public android.app.NotificationChannelGroup getNotificationChannelGroup(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            for (android.app.NotificationChannelGroup notificationChannelGroup : getNotificationChannelGroups()) {
                if (notificationChannelGroup.getId().equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    public androidx.core.app.NotificationChannelGroupCompat getNotificationChannelGroupCompat(java.lang.String str) {
        android.app.NotificationChannelGroup notificationChannelGroup;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            android.app.NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup2);
            }
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        }
        return new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup, getNotificationChannels());
    }

    public java.util.List<android.app.NotificationChannel> getNotificationChannels() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannels();
        }
        return java.util.Collections.emptyList();
    }

    public java.util.List<androidx.core.app.NotificationChannelCompat> getNotificationChannelsCompat() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.List<android.app.NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(notificationChannels.size());
                java.util.Iterator<android.app.NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new androidx.core.app.NotificationChannelCompat(it.next()));
                }
                return arrayList;
            }
        }
        return java.util.Collections.emptyList();
    }

    public java.util.List<android.app.NotificationChannelGroup> getNotificationChannelGroups() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannelGroups();
        }
        return java.util.Collections.emptyList();
    }

    public java.util.List<androidx.core.app.NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        java.util.List<android.app.NotificationChannel> notificationChannels;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.util.List<android.app.NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    notificationChannels = java.util.Collections.emptyList();
                } else {
                    notificationChannels = getNotificationChannels();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(notificationChannelGroups.size());
                for (android.app.NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup));
                    } else {
                        arrayList.add(new androidx.core.app.NotificationChannelGroupCompat(notificationChannelGroup, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return java.util.Collections.emptyList();
    }

    public static java.util.Set<java.lang.String> getEnabledListenerPackages(android.content.Context context) {
        java.util.Set<java.lang.String> set;
        java.lang.String string = android.provider.Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    java.lang.String[] strArrSplit = string.split(":", -1);
                    java.util.HashSet hashSet = new java.util.HashSet(strArrSplit.length);
                    for (java.lang.String str : strArrSplit) {
                        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
                set = sEnabledNotificationListenerPackages;
            } else {
                set = sEnabledNotificationListenerPackages;
            }
            throw th;
        }
        return set;
    }

    private static boolean useSideChannelForNotification(android.app.Notification notification) {
        android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    private void pushSideChannelQueue(androidx.core.app.NotificationManagerCompat.Task task) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new androidx.core.app.NotificationManagerCompat.SideChannelManager(this.mContext.getApplicationContext());
            }
            sSideChannelManager.queueTask(task);
        }
    }

    private static class SideChannelManager implements android.os.Handler.Callback, android.content.ServiceConnection {
        private static final int MSG_QUEUE_TASK = 0;
        private static final int MSG_RETRY_LISTENER_QUEUE = 3;
        private static final int MSG_SERVICE_CONNECTED = 1;
        private static final int MSG_SERVICE_DISCONNECTED = 2;
        private final android.content.Context mContext;
        private final android.os.Handler mHandler;
        private final android.os.HandlerThread mHandlerThread;
        private final java.util.Map<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> mRecordMap = new java.util.HashMap();
        private java.util.Set<java.lang.String> mCachedEnabledPackages = new java.util.HashSet();

        SideChannelManager(android.content.Context context) {
            this.mContext = context;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new android.os.Handler(handlerThread.getLooper(), this);
        }

        public void queueTask(androidx.core.app.NotificationManagerCompat.Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                handleQueueTask((androidx.core.app.NotificationManagerCompat.Task) message.obj);
                return true;
            }
            if (i == 1) {
                androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent serviceConnectedEvent = (androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent) message.obj;
                handleServiceConnected(serviceConnectedEvent.componentName, serviceConnectedEvent.iBinder);
                return true;
            }
            if (i == 2) {
                handleServiceDisconnected((android.content.ComponentName) message.obj);
                return true;
            }
            if (i != 3) {
                return false;
            }
            handleRetryListenerQueue((android.content.ComponentName) message.obj);
            return true;
        }

        private void handleQueueTask(androidx.core.app.NotificationManagerCompat.Task task) {
            updateListenerMap();
            for (androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord : this.mRecordMap.values()) {
                listenerRecord.taskQueue.add(task);
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                listenerRecord.service = android.support.v4.app.INotificationSideChannel.Stub.asInterface(iBinder);
                listenerRecord.retryCount = 0;
                processListenerQueue(listenerRecord);
            }
        }

        private void handleServiceDisconnected(android.content.ComponentName componentName) {
            androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                ensureServiceUnbound(listenerRecord);
            }
        }

        private void handleRetryListenerQueue(android.content.ComponentName componentName) {
            androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord = this.mRecordMap.get(componentName);
            if (listenerRecord != null) {
                processListenerQueue(listenerRecord);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.mHandler.obtainMessage(1, new androidx.core.app.NotificationManagerCompat.ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(android.content.ComponentName componentName) {
            if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        private void updateListenerMap() {
            java.util.Set<java.lang.String> enabledListenerPackages = androidx.core.app.NotificationManagerCompat.getEnabledListenerPackages(this.mContext);
            if (enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                return;
            }
            this.mCachedEnabledPackages = enabledListenerPackages;
            java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.mContext.getPackageManager().queryIntentServices(new android.content.Intent().setAction(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
            java.util.HashSet<android.content.ComponentName> hashSet = new java.util.HashSet();
            for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentServices) {
                if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                    android.content.ComponentName componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        android.util.Log.w(androidx.core.app.NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (android.content.ComponentName componentName2 : hashSet) {
                if (!this.mRecordMap.containsKey(componentName2)) {
                    if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                        android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                    }
                    this.mRecordMap.put(componentName2, new androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord(componentName2));
                }
            }
            java.util.Iterator<java.util.Map.Entry<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord>> it = this.mRecordMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry<android.content.ComponentName, androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                        android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Removing listener record for " + next.getKey());
                    }
                    ensureServiceUnbound(next.getValue());
                    it.remove();
                }
            }
        }

        private boolean ensureServiceBound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                return true;
            }
            listenerRecord.bound = this.mContext.bindService(new android.content.Intent(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(listenerRecord.componentName), this, 33);
            if (listenerRecord.bound) {
                listenerRecord.retryCount = 0;
            } else {
                android.util.Log.w(androidx.core.app.NotificationManagerCompat.TAG, "Unable to bind to listener " + listenerRecord.componentName);
                this.mContext.unbindService(this);
            }
            return listenerRecord.bound;
        }

        private void ensureServiceUnbound(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (listenerRecord.bound) {
                this.mContext.unbindService(this);
                listenerRecord.bound = false;
            }
            listenerRecord.service = null;
        }

        private void scheduleListenerRetry(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (this.mHandler.hasMessages(3, listenerRecord.componentName)) {
                return;
            }
            listenerRecord.retryCount++;
            if (listenerRecord.retryCount > 6) {
                android.util.Log.w(androidx.core.app.NotificationManagerCompat.TAG, "Giving up on delivering " + listenerRecord.taskQueue.size() + " tasks to " + listenerRecord.componentName + " after " + listenerRecord.retryCount + " retries");
                listenerRecord.taskQueue.clear();
                return;
            }
            int i = (1 << (listenerRecord.retryCount - 1)) * 1000;
            if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Scheduling retry for " + i + " ms");
            }
            this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(3, listenerRecord.componentName), i);
        }

        private void processListenerQueue(androidx.core.app.NotificationManagerCompat.SideChannelManager.ListenerRecord listenerRecord) {
            if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Processing component " + listenerRecord.componentName + ", " + listenerRecord.taskQueue.size() + " queued tasks");
            }
            if (listenerRecord.taskQueue.isEmpty()) {
                return;
            }
            if (!ensureServiceBound(listenerRecord) || listenerRecord.service == null) {
                scheduleListenerRetry(listenerRecord);
                return;
            }
            while (true) {
                androidx.core.app.NotificationManagerCompat.Task taskPeek = listenerRecord.taskQueue.peek();
                if (taskPeek == null) {
                    break;
                }
                try {
                    if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                        android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Sending task " + taskPeek);
                    }
                    taskPeek.send(listenerRecord.service);
                    listenerRecord.taskQueue.remove();
                } catch (android.os.DeadObjectException unused) {
                    if (android.util.Log.isLoggable(androidx.core.app.NotificationManagerCompat.TAG, 3)) {
                        android.util.Log.d(androidx.core.app.NotificationManagerCompat.TAG, "Remote service has died: " + listenerRecord.componentName);
                    }
                } catch (android.os.RemoteException e) {
                    android.util.Log.w(androidx.core.app.NotificationManagerCompat.TAG, "RemoteException communicating with " + listenerRecord.componentName, e);
                }
            }
            if (listenerRecord.taskQueue.isEmpty()) {
                return;
            }
            scheduleListenerRetry(listenerRecord);
        }

        private static class ListenerRecord {
            final android.content.ComponentName componentName;
            android.support.v4.app.INotificationSideChannel service;
            boolean bound = false;
            java.util.ArrayDeque<androidx.core.app.NotificationManagerCompat.Task> taskQueue = new java.util.ArrayDeque<>();
            int retryCount = 0;

            ListenerRecord(android.content.ComponentName componentName) {
                this.componentName = componentName;
            }
        }
    }

    private static class ServiceConnectedEvent {
        final android.content.ComponentName componentName;
        final android.os.IBinder iBinder;

        ServiceConnectedEvent(android.content.ComponentName componentName, android.os.IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    private static class NotifyTask implements androidx.core.app.NotificationManagerCompat.Task {
        final int id;
        final android.app.Notification notif;
        final java.lang.String packageName;
        final java.lang.String tag;

        NotifyTask(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.notif = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel iNotificationSideChannel) throws android.os.RemoteException {
            iNotificationSideChannel.notify(this.packageName, this.id, this.tag, this.notif);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NotifyTask[packageName:");
            sb.append(this.packageName);
            sb.append(", id:").append(this.id);
            sb.append(", tag:").append(this.tag);
            sb.append(com.ironsource.y8.i.e);
            return sb.toString();
        }
    }

    private static class CancelTask implements androidx.core.app.NotificationManagerCompat.Task {
        final boolean all;
        final int id;
        final java.lang.String packageName;
        final java.lang.String tag;

        CancelTask(java.lang.String str) {
            this.packageName = str;
            this.id = 0;
            this.tag = null;
            this.all = true;
        }

        CancelTask(java.lang.String str, int i, java.lang.String str2) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.all = false;
        }

        @Override // androidx.core.app.NotificationManagerCompat.Task
        public void send(android.support.v4.app.INotificationSideChannel iNotificationSideChannel) throws android.os.RemoteException {
            if (this.all) {
                iNotificationSideChannel.cancelAll(this.packageName);
            } else {
                iNotificationSideChannel.cancel(this.packageName, this.id, this.tag);
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelTask[packageName:");
            sb.append(this.packageName);
            sb.append(", id:").append(this.id);
            sb.append(", tag:").append(this.tag);
            sb.append(", all:").append(this.all);
            sb.append(com.ironsource.y8.i.e);
            return sb.toString();
        }
    }
}
