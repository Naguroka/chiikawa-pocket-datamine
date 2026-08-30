package com.unity3d.services.core.timer;

/* JADX INFO: loaded from: classes6.dex */
public class IntervalTimer extends com.unity3d.services.core.timer.BaseTimer implements com.unity3d.services.core.timer.IIntervalTimer {
    private final java.util.concurrent.atomic.AtomicInteger _currentPosition;
    private final java.lang.Integer _intervalDuration;
    private java.lang.Integer _nextInterval;
    private com.unity3d.services.core.timer.IIntervalTimerListener _timerListener;
    private final java.lang.Integer _totalIntervals;

    public IntervalTimer(java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.timer.IIntervalTimerListener iIntervalTimerListener, com.unity3d.services.core.lifecycle.LifecycleCache lifecycleCache) {
        super(num, null, lifecycleCache);
        this._currentPosition = new java.util.concurrent.atomic.AtomicInteger(0);
        this._totalIntervals = num2;
        this._timerListener = iIntervalTimerListener;
        int iIntValue = num2.intValue();
        int iIntValue2 = num.intValue();
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iIntValue != 0 ? iIntValue2 / num2.intValue() : iIntValue2);
        this._intervalDuration = numValueOf;
        this._nextInterval = numValueOf;
    }

    @Override // com.unity3d.services.core.timer.BaseTimer
    public void onStep() {
        if (this._currentPosition.addAndGet(this._delayMs.intValue()) >= this._nextInterval.intValue()) {
            onNextInterval();
        }
        super.onStep();
    }

    @Override // com.unity3d.services.core.timer.IIntervalTimer
    public void onNextInterval() {
        com.unity3d.services.core.timer.IIntervalTimerListener iIntervalTimerListener = this._timerListener;
        if (iIntervalTimerListener != null) {
            iIntervalTimerListener.onNextIntervalTriggered();
        }
        this._nextInterval = java.lang.Integer.valueOf(this._nextInterval.intValue() + this._intervalDuration.intValue());
    }

    @Override // com.unity3d.services.core.timer.BaseTimer, com.unity3d.services.core.timer.IBaseTimer
    public void kill() {
        super.kill();
        this._timerListener = null;
    }
}
