package com.unity3d.services.core.misc;

/* JADX INFO: loaded from: classes6.dex */
public class EventSubject<T> {
    private com.unity3d.services.core.misc.IEventListener<T> _eventListener;
    java.util.Queue<T> _eventQueue;
    com.unity3d.services.core.timer.IIntervalTimer _intervalTimer;

    public EventSubject(java.util.Queue<T> queue, java.lang.Integer num, com.unity3d.services.core.timer.IIntervalTimerFactory iIntervalTimerFactory) {
        this._eventQueue = queue;
        this._intervalTimer = iIntervalTimerFactory.createTimer(num, java.lang.Integer.valueOf(queue.size()), new com.unity3d.services.core.timer.IIntervalTimerListener() { // from class: com.unity3d.services.core.misc.EventSubject.1
            @Override // com.unity3d.services.core.timer.IIntervalTimerListener
            public void onNextIntervalTriggered() {
                com.unity3d.services.core.misc.EventSubject.this.sendNextEvent();
            }
        });
    }

    public void sendNextEvent() {
        com.unity3d.services.core.misc.IEventListener<T> iEventListener = this._eventListener;
        if (iEventListener != null) {
            iEventListener.onNextEvent(this._eventQueue.remove());
        }
        if (this._eventQueue.size() <= 0) {
            unsubscribe();
        }
    }

    public void subscribe(com.unity3d.services.core.misc.IEventListener<T> iEventListener) {
        java.util.Queue<T> queue = this._eventQueue;
        if (queue == null || queue.size() <= 0 || this._intervalTimer == null || iEventListener == null) {
            return;
        }
        this._eventListener = iEventListener;
        startTimer();
    }

    private void startTimer() {
        com.unity3d.services.core.timer.IIntervalTimer iIntervalTimer = this._intervalTimer;
        if (iIntervalTimer != null) {
            iIntervalTimer.start(java.util.concurrent.Executors.newSingleThreadScheduledExecutor());
        }
    }

    private void killTimer() {
        com.unity3d.services.core.timer.IIntervalTimer iIntervalTimer = this._intervalTimer;
        if (iIntervalTimer != null) {
            iIntervalTimer.kill();
            this._intervalTimer = null;
        }
    }

    public void unsubscribe() {
        killTimer();
        this._eventListener = null;
    }

    public boolean eventQueueIsEmpty() {
        return this._eventQueue.isEmpty();
    }
}
