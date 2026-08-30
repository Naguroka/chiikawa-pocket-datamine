package com.unity.androidnotifications;

/* JADX INFO: loaded from: classes3.dex */
public class UnityNotificationBackgroundThread extends java.lang.Thread {
    private static final int TASKS_FOR_HOUSEKEEPING = 50;
    private com.unity.androidnotifications.UnityNotificationManager mManager;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> mScheduledNotifications;
    private java.util.concurrent.LinkedTransferQueue<com.unity.androidnotifications.UnityNotificationBackgroundThread.Task> mTasks = new java.util.concurrent.LinkedTransferQueue<>();
    private int mTasksSinceHousekeeping = 50;

    private static abstract class Task {
        public abstract boolean run(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap);

        private Task() {
        }
    }

    private static class ScheduleNotificationTask extends com.unity.androidnotifications.UnityNotificationBackgroundThread.Task {
        private boolean isCustomized;
        private boolean isNew;
        private android.app.Notification.Builder notificationBuilder;
        private int notificationId;

        public ScheduleNotificationTask(int i, android.app.Notification.Builder builder, boolean z, boolean z2) {
            super();
            this.notificationId = i;
            this.notificationBuilder = builder;
            this.isCustomized = z;
            this.isNew = z2;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap) {
            java.lang.String strValueOf = java.lang.String.valueOf(this.notificationId);
            java.lang.Integer.valueOf(this.notificationId);
            try {
                com.unity.androidnotifications.UnityNotificationManager.mUnityNotificationManager.performNotificationScheduling(this.notificationId, this.notificationBuilder, this.isCustomized);
                return this.isNew;
            } catch (java.lang.Throwable th) {
                concurrentHashMap.remove(java.lang.Integer.valueOf(this.notificationId));
                unityNotificationManager.cancelPendingNotificationIntent(this.notificationId);
                unityNotificationManager.deleteExpiredNotificationIntent(strValueOf);
                throw th;
            }
        }
    }

    private static class CancelNotificationTask extends com.unity.androidnotifications.UnityNotificationBackgroundThread.Task {
        private int notificationId;

        public CancelNotificationTask(int i) {
            super();
            this.notificationId = i;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap) {
            unityNotificationManager.cancelPendingNotificationIntent(this.notificationId);
            if (concurrentHashMap.remove(java.lang.Integer.valueOf(this.notificationId)) == null) {
                return false;
            }
            unityNotificationManager.deleteExpiredNotificationIntent(java.lang.String.valueOf(this.notificationId));
            return true;
        }
    }

    private static class CancelAllNotificationsTask extends com.unity.androidnotifications.UnityNotificationBackgroundThread.Task {
        private CancelAllNotificationsTask() {
            super();
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap) {
            if (concurrentHashMap.isEmpty()) {
                return false;
            }
            java.util.Enumeration<java.lang.Integer> enumerationKeys = concurrentHashMap.keys();
            while (enumerationKeys.hasMoreElements()) {
                java.lang.Integer numNextElement = enumerationKeys.nextElement();
                unityNotificationManager.cancelPendingNotificationIntent(numNextElement.intValue());
                unityNotificationManager.deleteExpiredNotificationIntent(java.lang.String.valueOf(numNextElement));
            }
            concurrentHashMap.clear();
            return true;
        }
    }

    private static class HousekeepingTask extends com.unity.androidnotifications.UnityNotificationBackgroundThread.Task {
        com.unity.androidnotifications.UnityNotificationBackgroundThread thread;

        public HousekeepingTask(com.unity.androidnotifications.UnityNotificationBackgroundThread unityNotificationBackgroundThread) {
            super();
            this.thread = unityNotificationBackgroundThread;
        }

        @Override // com.unity.androidnotifications.UnityNotificationBackgroundThread.Task
        public boolean run(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Enumeration<java.lang.Integer> enumerationKeys = concurrentHashMap.keys();
            while (enumerationKeys.hasMoreElements()) {
                hashSet.add(java.lang.String.valueOf(enumerationKeys.nextElement()));
            }
            this.thread.performHousekeeping(hashSet);
            return false;
        }
    }

    public UnityNotificationBackgroundThread(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap) {
        this.mManager = unityNotificationManager;
        this.mScheduledNotifications = concurrentHashMap;
        if (concurrentHashMap.size() == 0) {
            loadNotifications();
        }
    }

    public void enqueueNotification(int i, android.app.Notification.Builder builder, boolean z, boolean z2) {
        this.mTasks.add(new com.unity.androidnotifications.UnityNotificationBackgroundThread.ScheduleNotificationTask(i, builder, z, z2));
    }

    public void enqueueCancelNotification(int i) {
        this.mTasks.add(new com.unity.androidnotifications.UnityNotificationBackgroundThread.CancelNotificationTask(i));
    }

    public void enqueueCancelAllNotifications() {
        this.mTasks.add(new com.unity.androidnotifications.UnityNotificationBackgroundThread.CancelAllNotificationsTask());
    }

    private void enqueueHousekeeping() {
        this.mTasks.add(new com.unity.androidnotifications.UnityNotificationBackgroundThread.HousekeepingTask(this));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            boolean zExecuteTask = false;
            while (true) {
                try {
                    com.unity.androidnotifications.UnityNotificationBackgroundThread.Task taskTake = this.mTasks.take();
                    zExecuteTask |= executeTask(this.mManager, taskTake, this.mScheduledNotifications);
                    if (!(taskTake instanceof com.unity.androidnotifications.UnityNotificationBackgroundThread.HousekeepingTask)) {
                        this.mTasksSinceHousekeeping++;
                    }
                    if (this.mTasks.size() == 0 && zExecuteTask) {
                        try {
                            enqueueHousekeeping();
                            break;
                        } catch (java.lang.InterruptedException unused) {
                            zExecuteTask = false;
                            if (this.mTasks.isEmpty()) {
                                return;
                            }
                        }
                    }
                } catch (java.lang.InterruptedException unused2) {
                }
            }
        }
    }

    private boolean executeTask(com.unity.androidnotifications.UnityNotificationManager unityNotificationManager, com.unity.androidnotifications.UnityNotificationBackgroundThread.Task task, java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.app.Notification.Builder> concurrentHashMap) {
        try {
            return task.run(unityNotificationManager, concurrentHashMap);
        } catch (java.lang.Exception e) {
            android.util.Log.e("UnityNotifications", "Exception executing notification task", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performHousekeeping(java.util.Set<java.lang.String> set) {
        boolean z = this.mTasksSinceHousekeeping >= 50;
        this.mTasksSinceHousekeeping = 0;
        if (z) {
            this.mManager.performNotificationHousekeeping(set);
        }
        this.mManager.saveScheduledNotificationIDs(set);
    }

    private void loadNotifications() {
        java.util.List<android.app.Notification.Builder> listLoadSavedNotifications = this.mManager.loadSavedNotifications();
        if (listLoadSavedNotifications == null || listLoadSavedNotifications.size() == 0) {
            return;
        }
        long time = java.util.Calendar.getInstance().getTime().getTime();
        boolean z = false;
        for (android.app.Notification.Builder builder : listLoadSavedNotifications) {
            android.os.Bundle extras = builder.getExtras();
            int i = extras.getInt("id", -1);
            if (extras.getLong(com.unity.androidnotifications.UnityNotificationManager.KEY_FIRE_TIME, -1L) - time > 0) {
                this.mScheduledNotifications.put(java.lang.Integer.valueOf(i), builder);
            } else {
                z = true;
            }
        }
        if (z) {
            enqueueHousekeeping();
        }
    }
}
