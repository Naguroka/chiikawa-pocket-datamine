package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes6.dex */
public class DispatchGroup {
    private java.lang.Runnable _runnable;
    private int _threadCount = 0;

    public synchronized void enter() {
        this._threadCount++;
    }

    public synchronized void leave() {
        this._threadCount--;
        notifyGroup();
    }

    public void notify(java.lang.Runnable runnable) {
        this._runnable = runnable;
        notifyGroup();
    }

    private void notifyGroup() {
        java.lang.Runnable runnable;
        if (this._threadCount > 0 || (runnable = this._runnable) == null) {
            return;
        }
        runnable.run();
    }
}
