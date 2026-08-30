package com.unity3d.services.core.timer;

/* JADX INFO: loaded from: classes6.dex */
public class BaseTimer implements com.unity3d.services.core.timer.IBaseTimer {
    final java.lang.Integer _delayMs;
    private final java.util.concurrent.atomic.AtomicBoolean _hasPaused;
    private final java.util.concurrent.atomic.AtomicBoolean _isRunning;
    private final com.unity3d.services.core.lifecycle.LifecycleCache _lifecycleCache;
    java.lang.Integer _remainingDurationMs;
    private java.util.concurrent.ScheduledFuture<?> _task;
    private com.unity3d.services.core.timer.ITimerListener _timerListener;
    private java.util.concurrent.ScheduledExecutorService _timerService;
    final java.lang.Integer _totalDurationMs;

    public BaseTimer(java.lang.Integer num, com.unity3d.services.core.timer.ITimerListener iTimerListener, com.unity3d.services.core.lifecycle.LifecycleCache lifecycleCache) {
        this._delayMs = 1000;
        this._isRunning = new java.util.concurrent.atomic.AtomicBoolean(false);
        this._hasPaused = new java.util.concurrent.atomic.AtomicBoolean(false);
        this._totalDurationMs = num;
        this._remainingDurationMs = num;
        this._timerListener = iTimerListener;
        this._lifecycleCache = lifecycleCache;
        addLifecycleListener();
    }

    private void addLifecycleListener() {
        com.unity3d.services.core.lifecycle.LifecycleCache lifecycleCache = this._lifecycleCache;
        if (lifecycleCache == null) {
            return;
        }
        lifecycleCache.addActiveListener(new com.unity3d.services.core.lifecycle.IAppActiveListener() { // from class: com.unity3d.services.core.timer.BaseTimer.1
            @Override // com.unity3d.services.core.lifecycle.IAppActiveListener
            public void onAppStateChanged(boolean z) {
                if (z) {
                    if (com.unity3d.services.core.timer.BaseTimer.this._hasPaused.get()) {
                        com.unity3d.services.core.timer.BaseTimer.this._hasPaused.getAndSet(false);
                        com.unity3d.services.core.timer.BaseTimer.this.resume();
                        return;
                    }
                    return;
                }
                if (com.unity3d.services.core.timer.BaseTimer.this.isRunning()) {
                    com.unity3d.services.core.timer.BaseTimer.this.pause();
                    com.unity3d.services.core.timer.BaseTimer.this._hasPaused.getAndSet(true);
                }
            }
        });
    }

    public BaseTimer(java.lang.Integer num, com.unity3d.services.core.timer.ITimerListener iTimerListener) {
        this(num, iTimerListener, com.unity3d.services.core.lifecycle.CachedLifecycle.getLifecycleListener());
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void start(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        if (this._isRunning.compareAndSet(false, true)) {
            this._timerService = scheduledExecutorService;
            schedule();
        }
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void stop() {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this._timerService.shutdown();
            this._timerService = null;
        }
        this._isRunning.getAndSet(false);
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public boolean pause() {
        boolean z;
        java.util.concurrent.ScheduledFuture<?> scheduledFuture = this._task;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            z = false;
        } else {
            z = true;
            this._task.cancel(true);
            this._task = null;
        }
        this._isRunning.getAndSet(false);
        return z;
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public boolean resume() {
        boolean z;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this._timerService;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            z = false;
        } else {
            schedule();
            z = true;
        }
        this._isRunning.getAndSet(z);
        return z;
    }

    public void restart(java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = this._timerService;
        if (scheduledExecutorService2 == null || scheduledExecutorService2.isShutdown()) {
            this._timerService = scheduledExecutorService;
        }
        this._remainingDurationMs = this._totalDurationMs;
        schedule();
        this._isRunning.getAndSet(true);
    }

    @Override // com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        stop();
        this._timerListener = null;
    }

    public boolean isRunning() {
        return this._isRunning.get();
    }

    public void onStep() {
        if (this._remainingDurationMs.intValue() <= 0) {
            notifyListeners();
            kill();
        }
    }

    private void schedule() {
        try {
            this._task = this._timerService.scheduleAtFixedRate(new java.lang.Runnable() { // from class: com.unity3d.services.core.timer.BaseTimer.2
                @Override // java.lang.Runnable
                public void run() {
                    com.unity3d.services.core.timer.BaseTimer baseTimer = com.unity3d.services.core.timer.BaseTimer.this;
                    baseTimer._remainingDurationMs = java.lang.Integer.valueOf(baseTimer._remainingDurationMs.intValue() - com.unity3d.services.core.timer.BaseTimer.this._delayMs.intValue());
                    com.unity3d.services.core.timer.BaseTimer.this.onStep();
                }
            }, this._delayMs.intValue(), this._delayMs.intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException | java.util.concurrent.RejectedExecutionException e) {
            com.unity3d.services.core.log.DeviceLog.debug("ERROR: IntervalTimer failed to start due to exception " + e.getLocalizedMessage());
        }
    }

    private void notifyListeners() {
        com.unity3d.services.core.timer.ITimerListener iTimerListener = this._timerListener;
        if (iTimerListener != null) {
            iTimerListener.onTimerFinished();
        }
    }
}
