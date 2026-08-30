package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Create an AbstractIdleService")
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public interface Service {

    public static abstract class Listener {
        public void failed(com.google.common.util.concurrent.Service.State from, java.lang.Throwable failure) {
        }

        public void running() {
        }

        public void starting() {
        }

        public void stopping(com.google.common.util.concurrent.Service.State from) {
        }

        public void terminated(com.google.common.util.concurrent.Service.State from) {
        }
    }

    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void addListener(com.google.common.util.concurrent.Service.Listener listener, java.util.concurrent.Executor executor);

    void awaitRunning();

    void awaitRunning(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.TimeoutException;

    java.lang.Throwable failureCause();

    boolean isRunning();

    com.google.common.util.concurrent.Service startAsync();

    com.google.common.util.concurrent.Service.State state();

    com.google.common.util.concurrent.Service stopAsync();
}
