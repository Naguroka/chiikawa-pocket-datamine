package com.unity3d.services.core.request;

/* JADX INFO: loaded from: classes6.dex */
public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000;
    private static int _maximumPoolSize = 1;
    private static com.unity3d.services.core.request.CancelableThreadPoolExecutor _pool = null;
    private static java.util.concurrent.LinkedBlockingQueue<java.lang.Runnable> _queue = null;
    private static boolean _ready = false;
    private static final java.lang.Object _readyLock = new java.lang.Object();

    private static synchronized void init() {
        _queue = new java.util.concurrent.LinkedBlockingQueue<>();
        com.unity3d.services.core.request.CancelableThreadPoolExecutor cancelableThreadPoolExecutor = new com.unity3d.services.core.request.CancelableThreadPoolExecutor(_corePoolSize, _maximumPoolSize, _keepAliveTime, java.util.concurrent.TimeUnit.MILLISECONDS, _queue);
        _pool = cancelableThreadPoolExecutor;
        cancelableThreadPoolExecutor.prestartAllCoreThreads();
        _queue.add(new java.lang.Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = com.unity3d.services.core.request.WebRequestThread._ready = true;
                synchronized (com.unity3d.services.core.request.WebRequestThread._readyLock) {
                    com.unity3d.services.core.request.WebRequestThread._readyLock.notifyAll();
                }
            }
        });
        while (!_ready) {
            try {
                java.lang.Object obj = _readyLock;
                synchronized (obj) {
                    obj.wait();
                }
            } catch (java.lang.InterruptedException unused) {
                com.unity3d.services.core.log.DeviceLog.debug("Couldn't synchronize thread");
                java.lang.Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public static synchronized void reset() {
        cancel();
        com.unity3d.services.core.request.CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.shutdown();
            try {
                _pool.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            }
            _queue.clear();
            _pool = null;
            _queue = null;
            _ready = false;
        }
    }

    public static synchronized void cancel() {
        com.unity3d.services.core.request.CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.cancel();
            for (java.lang.Runnable runnable : _queue) {
                if (runnable instanceof com.unity3d.services.core.request.WebRequestRunnable) {
                    ((com.unity3d.services.core.request.WebRequestRunnable) runnable).setCancelStatus(true);
                }
            }
            _queue.clear();
            _pool.purge();
        }
    }

    public static synchronized void request(java.lang.String str, com.unity3d.services.core.request.WebRequest.RequestType requestType, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.request.IWebRequestListener iWebRequestListener) {
        request(str, requestType, map, null, num, num2, iWebRequestListener);
    }

    public static synchronized void request(java.lang.String str, com.unity3d.services.core.request.WebRequest.RequestType requestType, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, com.unity3d.services.core.request.IWebRequestListener iWebRequestListener) {
        if (!_ready) {
            init();
        }
        if (str != null && str.length() >= 3) {
            _queue.add(new com.unity3d.services.core.request.WebRequestRunnable(str, requestType.name(), str2, num.intValue(), num2.intValue(), map, iWebRequestListener));
            return;
        }
        iWebRequestListener.onFailed(str, "Request is NULL or too short");
    }

    public static synchronized void setConcurrentRequestCount(int i) {
        _corePoolSize = i;
        _maximumPoolSize = i;
        com.unity3d.services.core.request.CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setCorePoolSize(i);
            _pool.setMaximumPoolSize(_maximumPoolSize);
        }
    }

    public static synchronized void setMaximumPoolSize(int i) {
        _maximumPoolSize = i;
        com.unity3d.services.core.request.CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setMaximumPoolSize(i);
        }
    }

    public static synchronized void setKeepAliveTime(long j) {
        _keepAliveTime = j;
        com.unity3d.services.core.request.CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
        if (cancelableThreadPoolExecutor != null) {
            cancelableThreadPoolExecutor.setKeepAliveTime(j, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public static synchronized boolean resolve(final java.lang.String str, final com.unity3d.services.core.request.IResolveHostListener iResolveHostListener) {
        if (str != null) {
            if (str.length() >= 3) {
                new java.lang.Thread(new java.lang.Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.2
                    @Override // java.lang.Runnable
                    public void run() {
                        java.lang.Thread thread;
                        java.lang.Exception e;
                        final android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
                        try {
                            thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.unity3d.services.core.request.WebRequestThread.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        iResolveHostListener.onResolve(str, java.net.InetAddress.getByName(str).getHostAddress());
                                    } catch (java.net.UnknownHostException e2) {
                                        com.unity3d.services.core.log.DeviceLog.exception("Unknown host", e2);
                                        iResolveHostListener.onFailed(str, com.unity3d.services.core.request.ResolveHostError.UNKNOWN_HOST, e2.getMessage());
                                    }
                                    conditionVariable.open();
                                }
                            });
                            try {
                                thread.start();
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                com.unity3d.services.core.log.DeviceLog.exception("Exception while resolving host", e);
                                iResolveHostListener.onFailed(str, com.unity3d.services.core.request.ResolveHostError.UNEXPECTED_EXCEPTION, e.getMessage());
                            }
                        } catch (java.lang.Exception e3) {
                            thread = null;
                            e = e3;
                        }
                        if (conditionVariable.block(20000L) || thread == null) {
                            return;
                        }
                        thread.interrupt();
                        iResolveHostListener.onFailed(str, com.unity3d.services.core.request.ResolveHostError.TIMEOUT, com.unity3d.ads.core.domain.AndroidInitializeBoldSDK.MSG_TIMEOUT);
                    }
                }).start();
                return true;
            }
        }
        iResolveHostListener.onFailed(str, com.unity3d.services.core.request.ResolveHostError.INVALID_HOST, "Host is NULL");
        return false;
    }
}
