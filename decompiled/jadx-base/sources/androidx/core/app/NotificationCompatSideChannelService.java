package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class NotificationCompatSideChannelService extends android.app.Service {
    public abstract void cancel(java.lang.String str, int i, java.lang.String str2);

    public abstract void cancelAll(java.lang.String str);

    public abstract void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification);

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        intent.getAction().equals(androidx.core.app.NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL);
        return null;
    }

    private class NotificationSideChannelStub extends android.support.v4.app.INotificationSideChannel.Stub {
        NotificationSideChannelStub() {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String str, int i, java.lang.String str2, android.app.Notification notification) throws android.os.RemoteException {
            androidx.core.app.NotificationCompatSideChannelService.this.checkPermission(getCallingUid(), str);
            long jClearCallingIdentity = clearCallingIdentity();
            try {
                androidx.core.app.NotificationCompatSideChannelService.this.notify(str, i, str2, notification);
            } finally {
                restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String str, int i, java.lang.String str2) throws android.os.RemoteException {
            androidx.core.app.NotificationCompatSideChannelService.this.checkPermission(getCallingUid(), str);
            long jClearCallingIdentity = clearCallingIdentity();
            try {
                androidx.core.app.NotificationCompatSideChannelService.this.cancel(str, i, str2);
            } finally {
                restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String str) {
            androidx.core.app.NotificationCompatSideChannelService.this.checkPermission(getCallingUid(), str);
            long jClearCallingIdentity = clearCallingIdentity();
            try {
                androidx.core.app.NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    void checkPermission(int i, java.lang.String str) {
        for (java.lang.String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new java.lang.SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }
}
