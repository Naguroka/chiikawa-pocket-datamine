package com.unity3d.services.core.timer;

/* JADX INFO: loaded from: classes6.dex */
public interface IBaseTimer {
    void kill();

    boolean pause();

    boolean resume();

    void start(java.util.concurrent.ScheduledExecutorService scheduledExecutorService);

    void stop();
}
