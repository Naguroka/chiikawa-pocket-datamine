package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
class DisplayNotification {
    private static final int IMAGE_DOWNLOAD_TIMEOUT_SECONDS = 5;
    private final android.content.Context context;
    private final java.util.concurrent.ExecutorService networkIoExecutor;
    private final com.google.firebase.messaging.NotificationParams params;

    public DisplayNotification(android.content.Context context, com.google.firebase.messaging.NotificationParams notificationParams, java.util.concurrent.ExecutorService executorService) {
        this.networkIoExecutor = executorService;
        this.context = context;
        this.params = notificationParams;
    }

    private boolean isAppForeground() {
        if (((android.app.KeyguardManager) this.context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()) {
            android.os.SystemClock.sleep(10L);
        }
        int iMyPid = android.os.Process.myPid();
        java.util.List<android.app.ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((android.app.ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == iMyPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    boolean handleNotification() {
        if (this.params.getBoolean(com.google.firebase.messaging.Constants.MessageNotificationKeys.NO_UI)) {
            return true;
        }
        if (isAppForeground()) {
            return false;
        }
        com.google.firebase.messaging.ImageDownload imageDownloadStartImageDownloadInBackground = startImageDownloadInBackground();
        com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfoCreateNotificationInfo = com.google.firebase.messaging.CommonNotificationBuilder.createNotificationInfo(this.context, this.params);
        waitForAndApplyImageDownload(displayNotificationInfoCreateNotificationInfo.notificationBuilder, imageDownloadStartImageDownloadInBackground);
        showNotification(displayNotificationInfoCreateNotificationInfo);
        return true;
    }

    private com.google.firebase.messaging.ImageDownload startImageDownloadInBackground() {
        com.google.firebase.messaging.ImageDownload imageDownloadCreate = com.google.firebase.messaging.ImageDownload.create(this.params.getString(com.google.firebase.messaging.Constants.MessageNotificationKeys.IMAGE_URL));
        if (imageDownloadCreate != null) {
            imageDownloadCreate.start(this.networkIoExecutor);
        }
        return imageDownloadCreate;
    }

    private void waitForAndApplyImageDownload(androidx.core.app.NotificationCompat.Builder builder, com.google.firebase.messaging.ImageDownload imageDownload) {
        if (imageDownload == null) {
            return;
        }
        try {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) com.google.android.gms.tasks.Tasks.await(imageDownload.getTask(), 5L, java.util.concurrent.TimeUnit.SECONDS);
            builder.setLargeIcon(bitmap);
            builder.setStyle(new androidx.core.app.NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon(null));
        } catch (java.lang.InterruptedException unused) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Interrupted while downloading image, showing notification without it");
            imageDownload.close();
            java.lang.Thread.currentThread().interrupt();
        } catch (java.util.concurrent.ExecutionException e) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed to download image: " + e.getCause());
        } catch (java.util.concurrent.TimeoutException unused2) {
            android.util.Log.w(com.google.firebase.messaging.Constants.TAG, "Failed to download image in time, showing notification without it");
            imageDownload.close();
        }
    }

    private void showNotification(com.google.firebase.messaging.CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        if (android.util.Log.isLoggable(com.google.firebase.messaging.Constants.TAG, 3)) {
            android.util.Log.d(com.google.firebase.messaging.Constants.TAG, "Showing notification");
        }
        ((android.app.NotificationManager) this.context.getSystemService("notification")).notify(displayNotificationInfo.tag, displayNotificationInfo.id, displayNotificationInfo.notificationBuilder.build());
    }
}
