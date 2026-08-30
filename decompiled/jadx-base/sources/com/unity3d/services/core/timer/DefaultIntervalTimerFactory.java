package com.unity3d.services.core.timer;

/* JADX INFO: loaded from: classes6.dex */
public class DefaultIntervalTimerFactory implements com.unity3d.services.core.timer.IIntervalTimerFactory {
    @Override // com.unity3d.services.core.timer.IIntervalTimerFactory
    public com.unity3d.services.core.timer.IIntervalTimer createTimer(java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.timer.IIntervalTimerListener iIntervalTimerListener) {
        return new com.unity3d.services.core.timer.IntervalTimer(num, num2, iIntervalTimerListener, com.unity3d.services.core.lifecycle.CachedLifecycle.getLifecycleListener());
    }
}
