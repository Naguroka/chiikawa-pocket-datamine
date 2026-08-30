package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public abstract class DownloadService extends android.app.Service {
    public static final java.lang.String ACTION_ADD_DOWNLOAD = "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD";
    public static final java.lang.String ACTION_INIT = "androidx.media3.exoplayer.downloadService.action.INIT";
    public static final java.lang.String ACTION_PAUSE_DOWNLOADS = "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS";
    public static final java.lang.String ACTION_REMOVE_ALL_DOWNLOADS = "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    public static final java.lang.String ACTION_REMOVE_DOWNLOAD = "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD";
    private static final java.lang.String ACTION_RESTART = "androidx.media3.exoplayer.downloadService.action.RESTART";
    public static final java.lang.String ACTION_RESUME_DOWNLOADS = "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS";
    public static final java.lang.String ACTION_SET_REQUIREMENTS = "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS";
    public static final java.lang.String ACTION_SET_STOP_REASON = "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON";
    public static final long DEFAULT_FOREGROUND_NOTIFICATION_UPDATE_INTERVAL = 1000;
    public static final int FOREGROUND_NOTIFICATION_ID_NONE = 0;
    public static final java.lang.String KEY_CONTENT_ID = "content_id";
    public static final java.lang.String KEY_DOWNLOAD_REQUEST = "download_request";
    public static final java.lang.String KEY_FOREGROUND = "foreground";
    public static final java.lang.String KEY_REQUIREMENTS = "requirements";
    public static final java.lang.String KEY_STOP_REASON = "stop_reason";
    private static final java.lang.String TAG = "DownloadService";
    private static final java.util.HashMap<java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService>, androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper> downloadManagerHelpers = new java.util.HashMap<>();
    private final int channelDescriptionResourceId;
    private final java.lang.String channelId;
    private final int channelNameResourceId;
    private androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper downloadManagerHelper;
    private final androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater;
    private boolean isDestroyed;
    private boolean isStopped;
    private int lastStartId;
    private boolean startedInForeground;
    private boolean taskRemoved;

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean needsStartedService(int i) {
        return i == 2 || i == 5 || i == 7;
    }

    protected abstract androidx.media3.exoplayer.offline.DownloadManager getDownloadManager();

    protected abstract android.app.Notification getForegroundNotification(java.util.List<androidx.media3.exoplayer.offline.Download> list, int i);

    protected abstract androidx.media3.exoplayer.scheduler.Scheduler getScheduler();

    protected DownloadService(int i) {
        this(i, 1000L);
    }

    protected DownloadService(int i, long j) {
        this(i, j, null, 0, 0);
    }

    protected DownloadService(int i, long j, java.lang.String str, int i2, int i3) {
        if (i == 0) {
            this.foregroundNotificationUpdater = null;
            this.channelId = null;
            this.channelNameResourceId = 0;
            this.channelDescriptionResourceId = 0;
            return;
        }
        this.foregroundNotificationUpdater = new androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater(i, j);
        this.channelId = str;
        this.channelNameResourceId = i2;
        this.channelDescriptionResourceId = i3;
    }

    public static android.content.Intent buildAddDownloadIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, boolean z) {
        return buildAddDownloadIntent(context, cls, downloadRequest, 0, z);
    }

    public static android.content.Intent buildAddDownloadIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, boolean z) {
        return getIntent(context, cls, ACTION_ADD_DOWNLOAD, z).putExtra(KEY_DOWNLOAD_REQUEST, downloadRequest).putExtra(KEY_STOP_REASON, i);
    }

    public static android.content.Intent buildRemoveDownloadIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, java.lang.String str, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_DOWNLOAD, z).putExtra("content_id", str);
    }

    public static android.content.Intent buildRemoveAllDownloadsIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_REMOVE_ALL_DOWNLOADS, z);
    }

    public static android.content.Intent buildResumeDownloadsIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_RESUME_DOWNLOADS, z);
    }

    public static android.content.Intent buildPauseDownloadsIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, boolean z) {
        return getIntent(context, cls, ACTION_PAUSE_DOWNLOADS, z);
    }

    public static android.content.Intent buildSetStopReasonIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, java.lang.String str, int i, boolean z) {
        return getIntent(context, cls, ACTION_SET_STOP_REASON, z).putExtra("content_id", str).putExtra(KEY_STOP_REASON, i);
    }

    public static android.content.Intent buildSetRequirementsIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, androidx.media3.exoplayer.scheduler.Requirements requirements, boolean z) {
        return getIntent(context, cls, ACTION_SET_REQUIREMENTS, z).putExtra(KEY_REQUIREMENTS, requirements);
    }

    public static void sendAddDownload(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, z), z);
    }

    public static void sendAddDownload(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, boolean z) {
        startService(context, buildAddDownloadIntent(context, cls, downloadRequest, i, z), z);
    }

    public static void sendRemoveDownload(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, java.lang.String str, boolean z) {
        startService(context, buildRemoveDownloadIntent(context, cls, str, z), z);
    }

    public static void sendRemoveAllDownloads(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, boolean z) {
        startService(context, buildRemoveAllDownloadsIntent(context, cls, z), z);
    }

    public static void sendResumeDownloads(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, boolean z) {
        startService(context, buildResumeDownloadsIntent(context, cls, z), z);
    }

    public static void sendPauseDownloads(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, boolean z) {
        startService(context, buildPauseDownloadsIntent(context, cls, z), z);
    }

    public static void sendSetStopReason(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, java.lang.String str, int i, boolean z) {
        startService(context, buildSetStopReasonIntent(context, cls, str, i, z), z);
    }

    public static void sendSetRequirements(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, androidx.media3.exoplayer.scheduler.Requirements requirements, boolean z) {
        startService(context, buildSetRequirementsIntent(context, cls, requirements, z), z);
    }

    public static void start(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls) {
        context.startService(getIntent(context, cls, ACTION_INIT));
    }

    public static void startForeground(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls) {
        androidx.media3.common.util.Util.startForegroundService(context, getIntent(context, cls, ACTION_INIT, true));
    }

    public static void clearDownloadManagerHelpers() {
        downloadManagerHelpers.clear();
    }

    @Override // android.app.Service
    public void onCreate() {
        java.lang.String str = this.channelId;
        if (str != null) {
            androidx.media3.common.util.NotificationUtil.createNotificationChannel(this, str, this.channelNameResourceId, this.channelDescriptionResourceId, 2);
        }
        java.lang.Class<?> cls = getClass();
        java.util.HashMap<java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService>, androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper> map = downloadManagerHelpers;
        androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper downloadManagerHelper = map.get(cls);
        if (downloadManagerHelper == null) {
            boolean z = this.foregroundNotificationUpdater != null;
            androidx.media3.exoplayer.scheduler.Scheduler scheduler = (z && (androidx.media3.common.util.Util.SDK_INT < 31)) ? getScheduler() : null;
            androidx.media3.exoplayer.offline.DownloadManager downloadManager = getDownloadManager();
            downloadManager.resumeDownloads();
            downloadManagerHelper = new androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper(getApplicationContext(), downloadManager, z, scheduler, cls);
            map.put((java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService>) cls, downloadManagerHelper);
        }
        this.downloadManagerHelper = downloadManagerHelper;
        downloadManagerHelper.attachService(this);
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int i, int i2) {
        java.lang.String action;
        java.lang.String stringExtra;
        androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater;
        this.lastStartId = i2;
        this.taskRemoved = false;
        if (intent != null) {
            action = intent.getAction();
            stringExtra = intent.getStringExtra("content_id");
            this.startedInForeground |= intent.getBooleanExtra(KEY_FOREGROUND, false) || ACTION_RESTART.equals(action);
        } else {
            action = null;
            stringExtra = null;
        }
        if (action == null) {
            action = ACTION_INIT;
        }
        androidx.media3.exoplayer.offline.DownloadManager downloadManager = ((androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper) androidx.media3.common.util.Assertions.checkNotNull(this.downloadManagerHelper)).downloadManager;
        action.hashCode();
        switch (action) {
            case "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON":
                if (!((android.content.Intent) androidx.media3.common.util.Assertions.checkNotNull(intent)).hasExtra(KEY_STOP_REASON)) {
                    androidx.media3.common.util.Log.e(TAG, "Ignored SET_STOP_REASON: Missing stop_reason extra");
                    break;
                } else {
                    downloadManager.setStopReason(stringExtra, intent.getIntExtra(KEY_STOP_REASON, 0));
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD":
                if (stringExtra == null) {
                    androidx.media3.common.util.Log.e(TAG, "Ignored REMOVE_DOWNLOAD: Missing content_id extra");
                    break;
                } else {
                    downloadManager.removeDownload(stringExtra);
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESTART":
            case "androidx.media3.exoplayer.downloadService.action.INIT":
                break;
            case "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS":
                downloadManager.resumeDownloads();
                break;
            case "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS":
                downloadManager.removeAllDownloads();
                break;
            case "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD":
                androidx.media3.exoplayer.offline.DownloadRequest downloadRequest = (androidx.media3.exoplayer.offline.DownloadRequest) ((android.content.Intent) androidx.media3.common.util.Assertions.checkNotNull(intent)).getParcelableExtra(KEY_DOWNLOAD_REQUEST);
                if (downloadRequest == null) {
                    androidx.media3.common.util.Log.e(TAG, "Ignored ADD_DOWNLOAD: Missing download_request extra");
                    break;
                } else {
                    downloadManager.addDownload(downloadRequest, intent.getIntExtra(KEY_STOP_REASON, 0));
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS":
                androidx.media3.exoplayer.scheduler.Requirements requirements = (androidx.media3.exoplayer.scheduler.Requirements) ((android.content.Intent) androidx.media3.common.util.Assertions.checkNotNull(intent)).getParcelableExtra(KEY_REQUIREMENTS);
                if (requirements == null) {
                    androidx.media3.common.util.Log.e(TAG, "Ignored SET_REQUIREMENTS: Missing requirements extra");
                    break;
                } else {
                    downloadManager.setRequirements(requirements);
                    break;
                }
                break;
            case "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS":
                downloadManager.pauseDownloads();
                break;
            default:
                androidx.media3.common.util.Log.e(TAG, "Ignored unrecognized action: " + action);
                break;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && this.startedInForeground && (foregroundNotificationUpdater = this.foregroundNotificationUpdater) != null) {
            foregroundNotificationUpdater.showNotificationIfNotAlready();
        }
        this.isStopped = false;
        if (downloadManager.isIdle()) {
            onIdle();
        }
        return 1;
    }

    @Override // android.app.Service
    public void onTaskRemoved(android.content.Intent intent) {
        this.taskRemoved = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.isDestroyed = true;
        ((androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper) androidx.media3.common.util.Assertions.checkNotNull(this.downloadManagerHelper)).detachService(this);
        androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.stopPeriodicUpdates();
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        throw new java.lang.UnsupportedOperationException();
    }

    protected final void invalidateForegroundNotification() {
        androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater == null || this.isDestroyed) {
            return;
        }
        foregroundNotificationUpdater.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloads(java.util.List<androidx.media3.exoplayer.offline.Download> list) {
        if (this.foregroundNotificationUpdater != null) {
            for (int i = 0; i < list.size(); i++) {
                if (needsStartedService(list.get(i).state)) {
                    this.foregroundNotificationUpdater.startPeriodicUpdates();
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadChanged(androidx.media3.exoplayer.offline.Download download) {
        if (this.foregroundNotificationUpdater != null) {
            if (needsStartedService(download.state)) {
                this.foregroundNotificationUpdater.startPeriodicUpdates();
            } else {
                this.foregroundNotificationUpdater.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDownloadRemoved() {
        androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isStopped() {
        return this.isStopped;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onIdle() {
        androidx.media3.exoplayer.offline.DownloadService.ForegroundNotificationUpdater foregroundNotificationUpdater = this.foregroundNotificationUpdater;
        if (foregroundNotificationUpdater != null) {
            foregroundNotificationUpdater.stopPeriodicUpdates();
        }
        if (((androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper) androidx.media3.common.util.Assertions.checkNotNull(this.downloadManagerHelper)).updateScheduler()) {
            if (androidx.media3.common.util.Util.SDK_INT < 28 && this.taskRemoved) {
                stopSelf();
                this.isStopped = true;
            } else {
                this.isStopped |= stopSelfResult(this.lastStartId);
            }
        }
    }

    private static android.content.Intent getIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, java.lang.String str, boolean z) {
        return getIntent(context, cls, str).putExtra(KEY_FOREGROUND, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.content.Intent getIntent(android.content.Context context, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls, java.lang.String str) {
        return new android.content.Intent(context, cls).setAction(str);
    }

    private static void startService(android.content.Context context, android.content.Intent intent, boolean z) {
        if (z) {
            androidx.media3.common.util.Util.startForegroundService(context, intent);
        } else {
            context.startService(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ForegroundNotificationUpdater {
        private final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        private boolean notificationDisplayed;
        private final int notificationId;
        private boolean periodicUpdatesStarted;
        private final long updateInterval;

        public ForegroundNotificationUpdater(int i, long j) {
            this.notificationId = i;
            this.updateInterval = j;
        }

        public void startPeriodicUpdates() {
            this.periodicUpdatesStarted = true;
            update();
        }

        public void stopPeriodicUpdates() {
            this.periodicUpdatesStarted = false;
            this.handler.removeCallbacksAndMessages(null);
        }

        public void showNotificationIfNotAlready() {
            if (this.notificationDisplayed) {
                return;
            }
            update();
        }

        public void invalidate() {
            if (this.notificationDisplayed) {
                update();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update() {
            androidx.media3.exoplayer.offline.DownloadManager downloadManager = ((androidx.media3.exoplayer.offline.DownloadService.DownloadManagerHelper) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.exoplayer.offline.DownloadService.this.downloadManagerHelper)).downloadManager;
            android.app.Notification foregroundNotification = androidx.media3.exoplayer.offline.DownloadService.this.getForegroundNotification(downloadManager.getCurrentDownloads(), downloadManager.getNotMetRequirements());
            if (!this.notificationDisplayed) {
                androidx.media3.common.util.Util.setForegroundServiceNotification(androidx.media3.exoplayer.offline.DownloadService.this, this.notificationId, foregroundNotification, 1, "dataSync");
                this.notificationDisplayed = true;
            } else {
                ((android.app.NotificationManager) androidx.media3.exoplayer.offline.DownloadService.this.getSystemService("notification")).notify(this.notificationId, foregroundNotification);
            }
            if (this.periodicUpdatesStarted) {
                this.handler.removeCallbacksAndMessages(null);
                this.handler.postDelayed(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadService$ForegroundNotificationUpdater$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.update();
                    }
                }, this.updateInterval);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class DownloadManagerHelper implements androidx.media3.exoplayer.offline.DownloadManager.Listener {
        private final android.content.Context context;
        private final androidx.media3.exoplayer.offline.DownloadManager downloadManager;
        private androidx.media3.exoplayer.offline.DownloadService downloadService;
        private final boolean foregroundAllowed;
        private androidx.media3.exoplayer.scheduler.Requirements scheduledRequirements;
        private final androidx.media3.exoplayer.scheduler.Scheduler scheduler;
        private final java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> serviceClass;

        private DownloadManagerHelper(android.content.Context context, androidx.media3.exoplayer.offline.DownloadManager downloadManager, boolean z, androidx.media3.exoplayer.scheduler.Scheduler scheduler, java.lang.Class<? extends androidx.media3.exoplayer.offline.DownloadService> cls) {
            this.context = context;
            this.downloadManager = downloadManager;
            this.foregroundAllowed = z;
            this.scheduler = scheduler;
            this.serviceClass = cls;
            downloadManager.addListener(this);
            updateScheduler();
        }

        public void attachService(final androidx.media3.exoplayer.offline.DownloadService downloadService) {
            androidx.media3.common.util.Assertions.checkState(this.downloadService == null);
            this.downloadService = downloadService;
            if (this.downloadManager.isInitialized()) {
                androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper().postAtFrontOfQueue(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.offline.DownloadService$DownloadManagerHelper$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m176xee6ee963(downloadService);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: lambda$attachService$0$androidx-media3-exoplayer-offline-DownloadService$DownloadManagerHelper, reason: not valid java name */
        /* synthetic */ void m176xee6ee963(androidx.media3.exoplayer.offline.DownloadService downloadService) {
            downloadService.notifyDownloads(this.downloadManager.getCurrentDownloads());
        }

        public void detachService(androidx.media3.exoplayer.offline.DownloadService downloadService) {
            androidx.media3.common.util.Assertions.checkState(this.downloadService == downloadService);
            this.downloadService = null;
        }

        public boolean updateScheduler() {
            boolean zIsWaitingForRequirements = this.downloadManager.isWaitingForRequirements();
            if (this.scheduler == null) {
                return !zIsWaitingForRequirements;
            }
            if (!zIsWaitingForRequirements) {
                cancelScheduler();
                return true;
            }
            androidx.media3.exoplayer.scheduler.Requirements requirements = this.downloadManager.getRequirements();
            if (!this.scheduler.getSupportedRequirements(requirements).equals(requirements)) {
                cancelScheduler();
                return false;
            }
            if (!schedulerNeedsUpdate(requirements)) {
                return true;
            }
            if (this.scheduler.schedule(requirements, this.context.getPackageName(), androidx.media3.exoplayer.offline.DownloadService.ACTION_RESTART)) {
                this.scheduledRequirements = requirements;
                return true;
            }
            androidx.media3.common.util.Log.w(androidx.media3.exoplayer.offline.DownloadService.TAG, "Failed to schedule restart");
            cancelScheduler();
            return false;
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
        public void onInitialized(androidx.media3.exoplayer.offline.DownloadManager downloadManager) {
            androidx.media3.exoplayer.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloads(downloadManager.getCurrentDownloads());
            }
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
        public void onDownloadChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.offline.Download download, java.lang.Exception exc) {
            androidx.media3.exoplayer.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadChanged(download);
            }
            if (serviceMayNeedRestart() && androidx.media3.exoplayer.offline.DownloadService.needsStartedService(download.state)) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.offline.DownloadService.TAG, "DownloadService wasn't running. Restarting.");
                restartService();
            }
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
        public void onDownloadRemoved(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.offline.Download download) {
            androidx.media3.exoplayer.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.notifyDownloadRemoved();
            }
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
        public final void onIdle(androidx.media3.exoplayer.offline.DownloadManager downloadManager) {
            androidx.media3.exoplayer.offline.DownloadService downloadService = this.downloadService;
            if (downloadService != null) {
                downloadService.onIdle();
            }
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
        public void onRequirementsStateChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.scheduler.Requirements requirements, int i) {
            updateScheduler();
        }

        @Override // androidx.media3.exoplayer.offline.DownloadManager.Listener
        public void onWaitingForRequirementsChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, boolean z) {
            if (z || downloadManager.getDownloadsPaused() || !serviceMayNeedRestart()) {
                return;
            }
            java.util.List<androidx.media3.exoplayer.offline.Download> currentDownloads = downloadManager.getCurrentDownloads();
            for (int i = 0; i < currentDownloads.size(); i++) {
                if (currentDownloads.get(i).state == 0) {
                    restartService();
                    return;
                }
            }
        }

        private boolean schedulerNeedsUpdate(androidx.media3.exoplayer.scheduler.Requirements requirements) {
            return !androidx.media3.common.util.Util.areEqual(this.scheduledRequirements, requirements);
        }

        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"scheduler"})
        private void cancelScheduler() {
            androidx.media3.exoplayer.scheduler.Requirements requirements = new androidx.media3.exoplayer.scheduler.Requirements(0);
            if (schedulerNeedsUpdate(requirements)) {
                this.scheduler.cancel();
                this.scheduledRequirements = requirements;
            }
        }

        private boolean serviceMayNeedRestart() {
            androidx.media3.exoplayer.offline.DownloadService downloadService = this.downloadService;
            return downloadService == null || downloadService.isStopped();
        }

        private void restartService() {
            if (this.foregroundAllowed) {
                try {
                    androidx.media3.common.util.Util.startForegroundService(this.context, androidx.media3.exoplayer.offline.DownloadService.getIntent(this.context, this.serviceClass, androidx.media3.exoplayer.offline.DownloadService.ACTION_RESTART));
                    return;
                } catch (java.lang.IllegalStateException unused) {
                    androidx.media3.common.util.Log.w(androidx.media3.exoplayer.offline.DownloadService.TAG, "Failed to restart (foreground launch restriction)");
                    return;
                }
            }
            try {
                this.context.startService(androidx.media3.exoplayer.offline.DownloadService.getIntent(this.context, this.serviceClass, androidx.media3.exoplayer.offline.DownloadService.ACTION_INIT));
            } catch (java.lang.IllegalStateException unused2) {
                androidx.media3.common.util.Log.w(androidx.media3.exoplayer.offline.DownloadService.TAG, "Failed to restart (process is idle)");
            }
        }
    }
}
