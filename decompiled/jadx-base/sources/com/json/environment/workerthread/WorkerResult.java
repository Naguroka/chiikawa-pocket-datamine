package com.json.environment.workerthread;

/* JADX INFO: loaded from: classes5.dex */
public abstract class WorkerResult<T> {

    public static final class Canceled<T> extends com.json.environment.workerthread.WorkerResult<T> {
        public java.util.concurrent.Callable<T> callable;

        public Canceled(java.util.concurrent.Callable<T> callable) {
            super();
            this.callable = callable;
        }
    }

    public static final class Completed<T> extends com.json.environment.workerthread.WorkerResult<T> {
        public T data;

        public Completed(T t) {
            super();
            this.data = t;
        }
    }

    public static final class Failed<T> extends com.json.environment.workerthread.WorkerResult<T> {
        public java.util.concurrent.Callable<T> callable;
        public java.lang.Exception exception;

        public Failed(java.util.concurrent.Callable<T> callable, java.lang.Exception exc) {
            super();
            this.callable = callable;
            this.exception = exc;
        }
    }

    private WorkerResult() {
    }
}
