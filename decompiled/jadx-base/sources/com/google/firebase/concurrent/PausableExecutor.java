package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
public interface PausableExecutor extends java.util.concurrent.Executor {
    boolean isPaused();

    void pause();

    void resume();
}
