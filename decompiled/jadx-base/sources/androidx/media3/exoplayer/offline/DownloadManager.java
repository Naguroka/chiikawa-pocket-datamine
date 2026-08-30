package androidx.media3.exoplayer.offline;

/* JADX INFO: loaded from: classes.dex */
public final class DownloadManager {
    public static final int DEFAULT_MAX_PARALLEL_DOWNLOADS = 3;
    public static final int DEFAULT_MIN_RETRY_COUNT = 5;
    public static final androidx.media3.exoplayer.scheduler.Requirements DEFAULT_REQUIREMENTS = new androidx.media3.exoplayer.scheduler.Requirements(1);
    private static final int MSG_ADD_DOWNLOAD = 7;
    private static final int MSG_CONTENT_LENGTH_CHANGED = 11;
    private static final int MSG_DOWNLOAD_UPDATE = 3;
    private static final int MSG_INITIALIZE = 1;
    private static final int MSG_INITIALIZED = 1;
    private static final int MSG_PROCESSED = 2;
    private static final int MSG_RELEASE = 13;
    private static final int MSG_REMOVE_ALL_DOWNLOADS = 9;
    private static final int MSG_REMOVE_DOWNLOAD = 8;
    private static final int MSG_SET_DOWNLOADS_PAUSED = 2;
    private static final int MSG_SET_MAX_PARALLEL_DOWNLOADS = 5;
    private static final int MSG_SET_MIN_RETRY_COUNT = 6;
    private static final int MSG_SET_NOT_MET_REQUIREMENTS = 3;
    private static final int MSG_SET_STOP_REASON = 4;
    private static final int MSG_TASK_STOPPED = 10;
    private static final int MSG_UPDATE_PROGRESS = 12;
    private static final java.lang.String TAG = "DownloadManager";
    private int activeTaskCount;
    private final android.os.Handler applicationHandler;
    private final android.content.Context context;
    private final androidx.media3.exoplayer.offline.WritableDownloadIndex downloadIndex;
    private java.util.List<androidx.media3.exoplayer.offline.Download> downloads;
    private boolean downloadsPaused;
    private boolean initialized;
    private final androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler;
    private final java.util.concurrent.CopyOnWriteArraySet<androidx.media3.exoplayer.offline.DownloadManager.Listener> listeners;
    private int maxParallelDownloads;
    private int minRetryCount;
    private int notMetRequirements;
    private int pendingMessages;
    private final androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener requirementsListener;
    private androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher;
    private boolean waitingForRequirements;

    public interface Listener {
        default void onDownloadChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.offline.Download download, java.lang.Exception exc) {
        }

        default void onDownloadRemoved(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.offline.Download download) {
        }

        default void onDownloadsPausedChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, boolean z) {
        }

        default void onIdle(androidx.media3.exoplayer.offline.DownloadManager downloadManager) {
        }

        default void onInitialized(androidx.media3.exoplayer.offline.DownloadManager downloadManager) {
        }

        default void onRequirementsStateChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, androidx.media3.exoplayer.scheduler.Requirements requirements, int i) {
        }

        default void onWaitingForRequirementsChanged(androidx.media3.exoplayer.offline.DownloadManager downloadManager, boolean z) {
        }
    }

    public DownloadManager(android.content.Context context, androidx.media3.database.DatabaseProvider databaseProvider, androidx.media3.datasource.cache.Cache cache, androidx.media3.datasource.DataSource.Factory factory, java.util.concurrent.Executor executor) {
        this(context, new androidx.media3.exoplayer.offline.DefaultDownloadIndex(databaseProvider), new androidx.media3.exoplayer.offline.DefaultDownloaderFactory(new androidx.media3.datasource.cache.CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(factory), executor));
    }

    public DownloadManager(android.content.Context context, androidx.media3.exoplayer.offline.WritableDownloadIndex writableDownloadIndex, androidx.media3.exoplayer.offline.DownloaderFactory downloaderFactory) {
        this.context = context.getApplicationContext();
        this.downloadIndex = writableDownloadIndex;
        this.maxParallelDownloads = 3;
        this.minRetryCount = 5;
        this.downloadsPaused = true;
        this.downloads = java.util.Collections.emptyList();
        this.listeners = new java.util.concurrent.CopyOnWriteArraySet<>();
        android.os.Handler handlerCreateHandlerForCurrentOrMainLooper = androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(new android.os.Handler.Callback() { // from class: androidx.media3.exoplayer.offline.DownloadManager$$ExternalSyntheticLambda0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(android.os.Message message) {
                return this.f$0.handleMainMessage(message);
            }
        });
        this.applicationHandler = handlerCreateHandlerForCurrentOrMainLooper;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = new androidx.media3.exoplayer.offline.DownloadManager.InternalHandler(handlerThread, writableDownloadIndex, downloaderFactory, handlerCreateHandlerForCurrentOrMainLooper, this.maxParallelDownloads, this.minRetryCount, this.downloadsPaused);
        this.internalHandler = internalHandler;
        androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener listener = new androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener() { // from class: androidx.media3.exoplayer.offline.DownloadManager$$ExternalSyntheticLambda1
            @Override // androidx.media3.exoplayer.scheduler.RequirementsWatcher.Listener
            public final void onRequirementsStateChanged(androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher, int i) {
                this.f$0.onRequirementsStateChanged(requirementsWatcher, i);
            }
        };
        this.requirementsListener = listener;
        androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher = new androidx.media3.exoplayer.scheduler.RequirementsWatcher(context, listener, DEFAULT_REQUIREMENTS);
        this.requirementsWatcher = requirementsWatcher;
        int iStart = requirementsWatcher.start();
        this.notMetRequirements = iStart;
        this.pendingMessages = 1;
        internalHandler.obtainMessage(1, iStart, 0).sendToTarget();
    }

    public android.os.Looper getApplicationLooper() {
        return this.applicationHandler.getLooper();
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public boolean isIdle() {
        return this.activeTaskCount == 0 && this.pendingMessages == 0;
    }

    public boolean isWaitingForRequirements() {
        return this.waitingForRequirements;
    }

    public void addListener(androidx.media3.exoplayer.offline.DownloadManager.Listener listener) {
        androidx.media3.common.util.Assertions.checkNotNull(listener);
        this.listeners.add(listener);
    }

    public void removeListener(androidx.media3.exoplayer.offline.DownloadManager.Listener listener) {
        this.listeners.remove(listener);
    }

    public androidx.media3.exoplayer.scheduler.Requirements getRequirements() {
        return this.requirementsWatcher.getRequirements();
    }

    public int getNotMetRequirements() {
        return this.notMetRequirements;
    }

    public void setRequirements(androidx.media3.exoplayer.scheduler.Requirements requirements) {
        if (requirements.equals(this.requirementsWatcher.getRequirements())) {
            return;
        }
        this.requirementsWatcher.stop();
        androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher = new androidx.media3.exoplayer.scheduler.RequirementsWatcher(this.context, this.requirementsListener, requirements);
        this.requirementsWatcher = requirementsWatcher;
        onRequirementsStateChanged(this.requirementsWatcher, requirementsWatcher.start());
    }

    public int getMaxParallelDownloads() {
        return this.maxParallelDownloads;
    }

    public void setMaxParallelDownloads(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0);
        if (this.maxParallelDownloads == i) {
            return;
        }
        this.maxParallelDownloads = i;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(5, i, 0).sendToTarget();
    }

    public int getMinRetryCount() {
        return this.minRetryCount;
    }

    public void setMinRetryCount(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0);
        if (this.minRetryCount == i) {
            return;
        }
        this.minRetryCount = i;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(6, i, 0).sendToTarget();
    }

    public androidx.media3.exoplayer.offline.DownloadIndex getDownloadIndex() {
        return this.downloadIndex;
    }

    public java.util.List<androidx.media3.exoplayer.offline.Download> getCurrentDownloads() {
        return this.downloads;
    }

    public boolean getDownloadsPaused() {
        return this.downloadsPaused;
    }

    public void resumeDownloads() {
        setDownloadsPaused(false);
    }

    public void pauseDownloads() {
        setDownloadsPaused(true);
    }

    public void setStopReason(java.lang.String str, int i) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(4, i, 0, str).sendToTarget();
    }

    public void addDownload(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest) {
        addDownload(downloadRequest, 0);
    }

    public void addDownload(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(7, i, 0, downloadRequest).sendToTarget();
    }

    public void removeDownload(java.lang.String str) {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(8, str).sendToTarget();
    }

    public void removeAllDownloads() {
        this.pendingMessages++;
        this.internalHandler.obtainMessage(9).sendToTarget();
    }

    public void release() {
        synchronized (this.internalHandler) {
            if (this.internalHandler.released) {
                return;
            }
            this.internalHandler.sendEmptyMessage(13);
            boolean z = false;
            while (!this.internalHandler.released) {
                try {
                    this.internalHandler.wait();
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            this.applicationHandler.removeCallbacksAndMessages(null);
            this.requirementsWatcher.stop();
            this.downloads = java.util.Collections.emptyList();
            this.pendingMessages = 0;
            this.activeTaskCount = 0;
            this.initialized = false;
            this.notMetRequirements = 0;
            this.waitingForRequirements = false;
        }
    }

    private void setDownloadsPaused(boolean z) {
        if (this.downloadsPaused == z) {
            return;
        }
        this.downloadsPaused = z;
        this.pendingMessages++;
        this.internalHandler.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onDownloadsPausedChanged(this, z);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onRequirementsStateChanged(androidx.media3.exoplayer.scheduler.RequirementsWatcher requirementsWatcher, int i) {
        androidx.media3.exoplayer.scheduler.Requirements requirements = requirementsWatcher.getRequirements();
        if (this.notMetRequirements != i) {
            this.notMetRequirements = i;
            this.pendingMessages++;
            this.internalHandler.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onRequirementsStateChanged(this, requirements, i);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private boolean updateWaitingForRequirements() {
        boolean z;
        if (!this.downloadsPaused && this.notMetRequirements != 0) {
            int i = 0;
            while (true) {
                if (i >= this.downloads.size()) {
                    z = false;
                    break;
                }
                if (this.downloads.get(i).state == 0) {
                    z = true;
                    break;
                }
                i++;
            }
        } else {
            z = false;
            break;
        }
        boolean z2 = this.waitingForRequirements != z;
        this.waitingForRequirements = z;
        return z2;
    }

    private void notifyWaitingForRequirementsChanged() {
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onWaitingForRequirementsChanged(this, this.waitingForRequirements);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMainMessage(android.os.Message message) {
        int i = message.what;
        if (i == 1) {
            onInitialized((java.util.List) message.obj);
        } else if (i == 2) {
            onMessageProcessed(message.arg1, message.arg2);
        } else if (i == 3) {
            onDownloadUpdate((androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate) message.obj);
        } else {
            throw new java.lang.IllegalStateException();
        }
        return true;
    }

    private void onInitialized(java.util.List<androidx.media3.exoplayer.offline.Download> list) {
        this.initialized = true;
        this.downloads = java.util.Collections.unmodifiableList(list);
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onInitialized(this);
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onDownloadUpdate(androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate downloadUpdate) {
        this.downloads = java.util.Collections.unmodifiableList(downloadUpdate.downloads);
        androidx.media3.exoplayer.offline.Download download = downloadUpdate.download;
        boolean zUpdateWaitingForRequirements = updateWaitingForRequirements();
        if (downloadUpdate.isRemove) {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onDownloadRemoved(this, download);
            }
        } else {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it2 = this.listeners.iterator();
            while (it2.hasNext()) {
                it2.next().onDownloadChanged(this, download, downloadUpdate.finalException);
            }
        }
        if (zUpdateWaitingForRequirements) {
            notifyWaitingForRequirementsChanged();
        }
    }

    private void onMessageProcessed(int i, int i2) {
        this.pendingMessages -= i;
        this.activeTaskCount = i2;
        if (isIdle()) {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Listener> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onIdle(this);
            }
        }
    }

    static androidx.media3.exoplayer.offline.Download mergeRequest(androidx.media3.exoplayer.offline.Download download, androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i, long j) {
        int i2;
        int i3 = download.state;
        long j2 = (i3 == 5 || download.isTerminalState()) ? j : download.startTimeMs;
        if (i3 == 5 || i3 == 7) {
            i2 = 7;
        } else {
            i2 = i != 0 ? 1 : 0;
        }
        return new androidx.media3.exoplayer.offline.Download(download.request.copyWithMergedRequest(downloadRequest), i2, j2, j, -1L, i, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class InternalHandler extends android.os.Handler {
        private static final int UPDATE_PROGRESS_INTERVAL_MS = 5000;
        private int activeDownloadTaskCount;
        private final java.util.HashMap<java.lang.String, androidx.media3.exoplayer.offline.DownloadManager.Task> activeTasks;
        private final androidx.media3.exoplayer.offline.WritableDownloadIndex downloadIndex;
        private final androidx.media3.exoplayer.offline.DownloaderFactory downloaderFactory;
        private final java.util.ArrayList<androidx.media3.exoplayer.offline.Download> downloads;
        private boolean downloadsPaused;
        private boolean hasActiveRemoveTask;
        private final android.os.Handler mainHandler;
        private int maxParallelDownloads;
        private int minRetryCount;
        private int notMetRequirements;
        public boolean released;
        private final android.os.HandlerThread thread;

        public InternalHandler(android.os.HandlerThread handlerThread, androidx.media3.exoplayer.offline.WritableDownloadIndex writableDownloadIndex, androidx.media3.exoplayer.offline.DownloaderFactory downloaderFactory, android.os.Handler handler, int i, int i2, boolean z) {
            super(handlerThread.getLooper());
            this.thread = handlerThread;
            this.downloadIndex = writableDownloadIndex;
            this.downloaderFactory = downloaderFactory;
            this.mainHandler = handler;
            this.maxParallelDownloads = i;
            this.minRetryCount = i2;
            this.downloadsPaused = z;
            this.downloads = new java.util.ArrayList<>();
            this.activeTasks = new java.util.HashMap<>();
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            int i = 0;
            switch (message.what) {
                case 1:
                    initialize(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 2:
                    setDownloadsPaused(message.arg1 != 0);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 3:
                    setNotMetRequirements(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 4:
                    setStopReason((java.lang.String) message.obj, message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 5:
                    setMaxParallelDownloads(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 6:
                    setMinRetryCount(message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 7:
                    addDownload((androidx.media3.exoplayer.offline.DownloadRequest) message.obj, message.arg1);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 8:
                    removeDownload((java.lang.String) message.obj);
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 9:
                    removeAllDownloads();
                    i = 1;
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 10:
                    onTaskStopped((androidx.media3.exoplayer.offline.DownloadManager.Task) message.obj);
                    this.mainHandler.obtainMessage(2, i, this.activeTasks.size()).sendToTarget();
                    return;
                case 11:
                    onContentLengthChanged((androidx.media3.exoplayer.offline.DownloadManager.Task) message.obj, androidx.media3.common.util.Util.toLong(message.arg1, message.arg2));
                    return;
                case 12:
                    updateProgress();
                    return;
                case 13:
                    release();
                    return;
                default:
                    throw new java.lang.IllegalStateException();
            }
        }

        private void initialize(int i) {
            this.notMetRequirements = i;
            androidx.media3.exoplayer.offline.DownloadCursor downloads = null;
            try {
                try {
                    this.downloadIndex.setDownloadingStatesToQueued();
                    downloads = this.downloadIndex.getDownloads(0, 1, 2, 5, 7);
                    while (downloads.moveToNext()) {
                        this.downloads.add(downloads.getDownload());
                    }
                } catch (java.io.IOException e) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to load index.", e);
                    this.downloads.clear();
                }
                androidx.media3.common.util.Util.closeQuietly(downloads);
                this.mainHandler.obtainMessage(1, new java.util.ArrayList(this.downloads)).sendToTarget();
                syncTasks();
            } catch (java.lang.Throwable th) {
                androidx.media3.common.util.Util.closeQuietly(downloads);
                throw th;
            }
        }

        private void setDownloadsPaused(boolean z) {
            this.downloadsPaused = z;
            syncTasks();
        }

        private void setNotMetRequirements(int i) {
            this.notMetRequirements = i;
            syncTasks();
        }

        private void setStopReason(java.lang.String str, int i) {
            if (str == null) {
                for (int i2 = 0; i2 < this.downloads.size(); i2++) {
                    setStopReason(this.downloads.get(i2), i);
                }
                try {
                    this.downloadIndex.setStopReason(i);
                } catch (java.io.IOException e) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to set manual stop reason", e);
                }
            } else {
                androidx.media3.exoplayer.offline.Download download = getDownload(str, false);
                if (download != null) {
                    setStopReason(download, i);
                } else {
                    try {
                        this.downloadIndex.setStopReason(str, i);
                    } catch (java.io.IOException e2) {
                        androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to set manual stop reason: " + str, e2);
                    }
                }
            }
            syncTasks();
        }

        private void setStopReason(androidx.media3.exoplayer.offline.Download download, int i) {
            if (i == 0) {
                if (download.state == 1) {
                    putDownloadWithState(download, 0, 0);
                }
            } else if (i != download.stopReason) {
                int i2 = download.state;
                if (i2 == 0 || i2 == 2) {
                    i2 = 1;
                }
                putDownload(new androidx.media3.exoplayer.offline.Download(download.request, i2, download.startTimeMs, java.lang.System.currentTimeMillis(), download.contentLength, i, 0, download.progress));
            }
        }

        private void setMaxParallelDownloads(int i) {
            this.maxParallelDownloads = i;
            syncTasks();
        }

        private void setMinRetryCount(int i) {
            this.minRetryCount = i;
        }

        private void addDownload(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, int i) {
            androidx.media3.exoplayer.offline.Download download = getDownload(downloadRequest.id, true);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (download != null) {
                putDownload(androidx.media3.exoplayer.offline.DownloadManager.mergeRequest(download, downloadRequest, i, jCurrentTimeMillis));
            } else {
                putDownload(new androidx.media3.exoplayer.offline.Download(downloadRequest, i == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i, 0));
            }
            syncTasks();
        }

        private void removeDownload(java.lang.String str) {
            androidx.media3.exoplayer.offline.Download download = getDownload(str, true);
            if (download == null) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to remove nonexistent download: " + str);
            } else {
                putDownloadWithState(download, 5, 0);
                syncTasks();
            }
        }

        private void removeAllDownloads() {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                androidx.media3.exoplayer.offline.DownloadCursor downloads = this.downloadIndex.getDownloads(3, 4);
                while (downloads.moveToNext()) {
                    try {
                        arrayList.add(downloads.getDownload());
                    } catch (java.lang.Throwable th) {
                        if (downloads != null) {
                            try {
                                downloads.close();
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                if (downloads != null) {
                    downloads.close();
                }
            } catch (java.io.IOException unused) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to load downloads.");
            }
            for (int i = 0; i < this.downloads.size(); i++) {
                java.util.ArrayList<androidx.media3.exoplayer.offline.Download> arrayList2 = this.downloads;
                arrayList2.set(i, copyDownloadWithState(arrayList2.get(i), 5, 0));
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.downloads.add(copyDownloadWithState((androidx.media3.exoplayer.offline.Download) arrayList.get(i2), 5, 0));
            }
            java.util.Collections.sort(this.downloads, new androidx.media3.exoplayer.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0());
            try {
                this.downloadIndex.setStatesToRemoving();
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(this.downloads);
            for (int i3 = 0; i3 < this.downloads.size(); i3++) {
                this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(this.downloads.get(i3), false, arrayList3, null)).sendToTarget();
            }
            syncTasks();
        }

        private void release() {
            java.util.Iterator<androidx.media3.exoplayer.offline.DownloadManager.Task> it = this.activeTasks.values().iterator();
            while (it.hasNext()) {
                it.next().cancel(true);
            }
            try {
                this.downloadIndex.setDownloadingStatesToQueued();
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e);
            }
            this.downloads.clear();
            this.thread.quit();
            synchronized (this) {
                this.released = true;
                notifyAll();
            }
        }

        private void syncTasks() {
            int i = 0;
            for (int i2 = 0; i2 < this.downloads.size(); i2++) {
                androidx.media3.exoplayer.offline.Download download = this.downloads.get(i2);
                androidx.media3.exoplayer.offline.DownloadManager.Task taskSyncQueuedDownload = this.activeTasks.get(download.request.id);
                int i3 = download.state;
                if (i3 == 0) {
                    taskSyncQueuedDownload = syncQueuedDownload(taskSyncQueuedDownload, download);
                } else if (i3 == 1) {
                    syncStoppedDownload(taskSyncQueuedDownload);
                } else if (i3 == 2) {
                    androidx.media3.common.util.Assertions.checkNotNull(taskSyncQueuedDownload);
                    syncDownloadingDownload(taskSyncQueuedDownload, download, i);
                } else if (i3 == 5 || i3 == 7) {
                    syncRemovingDownload(taskSyncQueuedDownload, download);
                } else {
                    throw new java.lang.IllegalStateException();
                }
                if (taskSyncQueuedDownload != null && !taskSyncQueuedDownload.isRemove) {
                    i++;
                }
            }
        }

        private void syncStoppedDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task) {
            if (task != null) {
                androidx.media3.common.util.Assertions.checkState(!task.isRemove);
                task.cancel(false);
            }
        }

        private androidx.media3.exoplayer.offline.DownloadManager.Task syncQueuedDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task, androidx.media3.exoplayer.offline.Download download) {
            if (task == null) {
                if (!canDownloadsRun() || this.activeDownloadTaskCount >= this.maxParallelDownloads) {
                    return null;
                }
                androidx.media3.exoplayer.offline.Download downloadPutDownloadWithState = putDownloadWithState(download, 2, 0);
                androidx.media3.exoplayer.offline.DownloadManager.Task task2 = new androidx.media3.exoplayer.offline.DownloadManager.Task(downloadPutDownloadWithState.request, this.downloaderFactory.createDownloader(downloadPutDownloadWithState.request), downloadPutDownloadWithState.progress, false, this.minRetryCount, this);
                this.activeTasks.put(downloadPutDownloadWithState.request.id, task2);
                int i = this.activeDownloadTaskCount;
                this.activeDownloadTaskCount = i + 1;
                if (i == 0) {
                    sendEmptyMessageDelayed(12, 5000L);
                }
                task2.start();
                return task2;
            }
            androidx.media3.common.util.Assertions.checkState(!task.isRemove);
            task.cancel(false);
            return task;
        }

        private void syncDownloadingDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task, androidx.media3.exoplayer.offline.Download download, int i) {
            androidx.media3.common.util.Assertions.checkState(!task.isRemove);
            if (!canDownloadsRun() || i >= this.maxParallelDownloads) {
                putDownloadWithState(download, 0, 0);
                task.cancel(false);
            }
        }

        private void syncRemovingDownload(androidx.media3.exoplayer.offline.DownloadManager.Task task, androidx.media3.exoplayer.offline.Download download) {
            if (task == null) {
                if (this.hasActiveRemoveTask) {
                    return;
                }
                androidx.media3.exoplayer.offline.DownloadManager.Task task2 = new androidx.media3.exoplayer.offline.DownloadManager.Task(download.request, this.downloaderFactory.createDownloader(download.request), download.progress, true, this.minRetryCount, this);
                this.activeTasks.put(download.request.id, task2);
                this.hasActiveRemoveTask = true;
                task2.start();
                return;
            }
            if (task.isRemove) {
                return;
            }
            task.cancel(false);
        }

        private void onContentLengthChanged(androidx.media3.exoplayer.offline.DownloadManager.Task task, long j) {
            androidx.media3.exoplayer.offline.Download download = (androidx.media3.exoplayer.offline.Download) androidx.media3.common.util.Assertions.checkNotNull(getDownload(task.request.id, false));
            if (j == download.contentLength || j == -1) {
                return;
            }
            putDownload(new androidx.media3.exoplayer.offline.Download(download.request, download.state, download.startTimeMs, java.lang.System.currentTimeMillis(), j, download.stopReason, download.failureReason, download.progress));
        }

        private void onTaskStopped(androidx.media3.exoplayer.offline.DownloadManager.Task task) {
            java.lang.String str = task.request.id;
            this.activeTasks.remove(str);
            boolean z = task.isRemove;
            if (z) {
                this.hasActiveRemoveTask = false;
            } else {
                int i = this.activeDownloadTaskCount - 1;
                this.activeDownloadTaskCount = i;
                if (i == 0) {
                    removeMessages(12);
                }
            }
            if (task.isCanceled) {
                syncTasks();
                return;
            }
            java.lang.Exception exc = task.finalException;
            if (exc != null) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Task failed: " + task.request + ", " + z, exc);
            }
            androidx.media3.exoplayer.offline.Download download = (androidx.media3.exoplayer.offline.Download) androidx.media3.common.util.Assertions.checkNotNull(getDownload(str, false));
            int i2 = download.state;
            if (i2 == 2) {
                androidx.media3.common.util.Assertions.checkState(!z);
                onDownloadTaskStopped(download, exc);
            } else if (i2 == 5 || i2 == 7) {
                androidx.media3.common.util.Assertions.checkState(z);
                onRemoveTaskStopped(download);
            } else {
                throw new java.lang.IllegalStateException();
            }
            syncTasks();
        }

        private void onDownloadTaskStopped(androidx.media3.exoplayer.offline.Download download, java.lang.Exception exc) {
            androidx.media3.exoplayer.offline.Download download2 = new androidx.media3.exoplayer.offline.Download(download.request, exc == null ? 3 : 4, download.startTimeMs, java.lang.System.currentTimeMillis(), download.contentLength, download.stopReason, exc == null ? 0 : 1, download.progress);
            this.downloads.remove(getDownloadIndex(download2.request.id));
            try {
                this.downloadIndex.putDownload(download2);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e);
            }
            this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(download2, false, new java.util.ArrayList(this.downloads), exc)).sendToTarget();
        }

        private void onRemoveTaskStopped(androidx.media3.exoplayer.offline.Download download) {
            if (download.state == 7) {
                putDownloadWithState(download, download.stopReason == 0 ? 0 : 1, download.stopReason);
                syncTasks();
            } else {
                this.downloads.remove(getDownloadIndex(download.request.id));
                try {
                    this.downloadIndex.removeDownload(download.request.id);
                } catch (java.io.IOException unused) {
                    androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to remove from database");
                }
                this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(download, true, new java.util.ArrayList(this.downloads), null)).sendToTarget();
            }
        }

        private void updateProgress() {
            for (int i = 0; i < this.downloads.size(); i++) {
                androidx.media3.exoplayer.offline.Download download = this.downloads.get(i);
                if (download.state == 2) {
                    try {
                        this.downloadIndex.putDownload(download);
                    } catch (java.io.IOException e) {
                        androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e);
                    }
                }
            }
            sendEmptyMessageDelayed(12, 5000L);
        }

        private boolean canDownloadsRun() {
            return !this.downloadsPaused && this.notMetRequirements == 0;
        }

        private androidx.media3.exoplayer.offline.Download putDownloadWithState(androidx.media3.exoplayer.offline.Download download, int i, int i2) {
            androidx.media3.common.util.Assertions.checkState((i == 3 || i == 4) ? false : true);
            return putDownload(copyDownloadWithState(download, i, i2));
        }

        private androidx.media3.exoplayer.offline.Download putDownload(androidx.media3.exoplayer.offline.Download download) {
            androidx.media3.common.util.Assertions.checkState((download.state == 3 || download.state == 4) ? false : true);
            int downloadIndex = getDownloadIndex(download.request.id);
            if (downloadIndex == -1) {
                this.downloads.add(download);
                java.util.Collections.sort(this.downloads, new androidx.media3.exoplayer.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0());
            } else {
                boolean z = download.startTimeMs != this.downloads.get(downloadIndex).startTimeMs;
                this.downloads.set(downloadIndex, download);
                if (z) {
                    java.util.Collections.sort(this.downloads, new androidx.media3.exoplayer.offline.DownloadManager$InternalHandler$$ExternalSyntheticLambda0());
                }
            }
            try {
                this.downloadIndex.putDownload(download);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to update index.", e);
            }
            this.mainHandler.obtainMessage(3, new androidx.media3.exoplayer.offline.DownloadManager.DownloadUpdate(download, false, new java.util.ArrayList(this.downloads), null)).sendToTarget();
            return download;
        }

        private androidx.media3.exoplayer.offline.Download getDownload(java.lang.String str, boolean z) {
            int downloadIndex = getDownloadIndex(str);
            if (downloadIndex != -1) {
                return this.downloads.get(downloadIndex);
            }
            if (!z) {
                return null;
            }
            try {
                return this.downloadIndex.getDownload(str);
            } catch (java.io.IOException e) {
                androidx.media3.common.util.Log.e(androidx.media3.exoplayer.offline.DownloadManager.TAG, "Failed to load download: " + str, e);
                return null;
            }
        }

        private int getDownloadIndex(java.lang.String str) {
            for (int i = 0; i < this.downloads.size(); i++) {
                if (this.downloads.get(i).request.id.equals(str)) {
                    return i;
                }
            }
            return -1;
        }

        private static androidx.media3.exoplayer.offline.Download copyDownloadWithState(androidx.media3.exoplayer.offline.Download download, int i, int i2) {
            return new androidx.media3.exoplayer.offline.Download(download.request, i, download.startTimeMs, java.lang.System.currentTimeMillis(), download.contentLength, i2, 0, download.progress);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareStartTimes(androidx.media3.exoplayer.offline.Download download, androidx.media3.exoplayer.offline.Download download2) {
            return androidx.media3.common.util.Util.compareLong(download.startTimeMs, download2.startTimeMs);
        }
    }

    private static class Task extends java.lang.Thread implements androidx.media3.exoplayer.offline.Downloader.ProgressListener {
        private long contentLength;
        private final androidx.media3.exoplayer.offline.DownloadProgress downloadProgress;
        private final androidx.media3.exoplayer.offline.Downloader downloader;
        private java.lang.Exception finalException;
        private volatile androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler;
        private volatile boolean isCanceled;
        private final boolean isRemove;
        private final int minRetryCount;
        private final androidx.media3.exoplayer.offline.DownloadRequest request;

        private Task(androidx.media3.exoplayer.offline.DownloadRequest downloadRequest, androidx.media3.exoplayer.offline.Downloader downloader, androidx.media3.exoplayer.offline.DownloadProgress downloadProgress, boolean z, int i, androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler) {
            this.request = downloadRequest;
            this.downloader = downloader;
            this.downloadProgress = downloadProgress;
            this.isRemove = z;
            this.minRetryCount = i;
            this.internalHandler = internalHandler;
            this.contentLength = -1L;
        }

        public void cancel(boolean z) {
            if (z) {
                this.internalHandler = null;
            }
            if (this.isCanceled) {
                return;
            }
            this.isCanceled = true;
            this.downloader.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.isRemove) {
                    this.downloader.remove();
                } else {
                    long j = -1;
                    int i = 0;
                    while (!this.isCanceled) {
                        try {
                            this.downloader.download(this);
                            break;
                        } catch (java.io.IOException e) {
                            if (!this.isCanceled) {
                                long j2 = this.downloadProgress.bytesDownloaded;
                                if (j2 != j) {
                                    i = 0;
                                    j = j2;
                                }
                                i++;
                                if (i > this.minRetryCount) {
                                    throw e;
                                }
                                java.lang.Thread.sleep(getRetryDelayMillis(i));
                            }
                        }
                    }
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.lang.Exception e2) {
                this.finalException = e2;
            }
            androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = this.internalHandler;
            if (internalHandler != null) {
                internalHandler.obtainMessage(10, this).sendToTarget();
            }
        }

        @Override // androidx.media3.exoplayer.offline.Downloader.ProgressListener
        public void onProgress(long j, long j2, float f) {
            this.downloadProgress.bytesDownloaded = j2;
            this.downloadProgress.percentDownloaded = f;
            if (j != this.contentLength) {
                this.contentLength = j;
                androidx.media3.exoplayer.offline.DownloadManager.InternalHandler internalHandler = this.internalHandler;
                if (internalHandler != null) {
                    internalHandler.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
                }
            }
        }

        private static int getRetryDelayMillis(int i) {
            return java.lang.Math.min((i - 1) * 1000, 5000);
        }
    }

    private static final class DownloadUpdate {
        public final androidx.media3.exoplayer.offline.Download download;
        public final java.util.List<androidx.media3.exoplayer.offline.Download> downloads;
        public final java.lang.Exception finalException;
        public final boolean isRemove;

        public DownloadUpdate(androidx.media3.exoplayer.offline.Download download, boolean z, java.util.List<androidx.media3.exoplayer.offline.Download> list, java.lang.Exception exc) {
            this.download = download;
            this.isRemove = z;
            this.downloads = list;
            this.finalException = exc;
        }
    }
}
