package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public final class Uninterruptibles {
    public static void awaitUninterruptibly(java.util.concurrent.CountDownLatch latch) {
        boolean z = false;
        while (true) {
            try {
                latch.await();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch latch, long timeout, java.util.concurrent.TimeUnit unit) {
        boolean zAwait;
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = latch.await(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static boolean awaitUninterruptibly(java.util.concurrent.locks.Condition condition, long timeout, java.util.concurrent.TimeUnit unit) {
        boolean zAwait;
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwait = condition.await(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zAwait;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static void joinUninterruptibly(java.lang.Thread toJoin) {
        boolean z = false;
        while (true) {
            try {
                toJoin.join();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static void joinUninterruptibly(java.lang.Thread toJoin, long timeout, java.util.concurrent.TimeUnit unit) {
        com.google.common.base.Preconditions.checkNotNull(toJoin);
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    java.util.concurrent.TimeUnit.NANOSECONDS.timedJoin(toJoin, nanos);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    @com.google.common.util.concurrent.ParametricNullness
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future) throws java.util.concurrent.ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return v;
    }

    @com.google.common.util.concurrent.ParametricNullness
    public static <V> V getUninterruptibly(java.util.concurrent.Future<V> future, long timeout, java.util.concurrent.TimeUnit unit) throws java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        V v;
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    v = future.get(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return v;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static <E> E takeUninterruptibly(java.util.concurrent.BlockingQueue<E> queue) {
        E eTake;
        boolean z = false;
        while (true) {
            try {
                eTake = queue.take();
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
        return eTake;
    }

    public static <E> void putUninterruptibly(java.util.concurrent.BlockingQueue<E> queue, E element) {
        boolean z = false;
        while (true) {
            try {
                queue.put(element);
                break;
            } catch (java.lang.InterruptedException unused) {
                z = true;
            } catch (java.lang.Throwable th) {
                if (z) {
                    java.lang.Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static void sleepUninterruptibly(long sleepFor, java.util.concurrent.TimeUnit unit) {
        boolean z = false;
        try {
            long nanos = unit.toNanos(sleepFor);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    java.util.concurrent.TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, long timeout, java.util.concurrent.TimeUnit unit) {
        return tryAcquireUninterruptibly(semaphore, 1, timeout, unit);
    }

    public static boolean tryAcquireUninterruptibly(java.util.concurrent.Semaphore semaphore, int permits, long timeout, java.util.concurrent.TimeUnit unit) {
        boolean zTryAcquire;
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryAcquire = semaphore.tryAcquire(permits, nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zTryAcquire;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static boolean tryLockUninterruptibly(java.util.concurrent.locks.Lock lock, long timeout, java.util.concurrent.TimeUnit unit) {
        boolean zTryLock;
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zTryLock = lock.tryLock(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zTryLock;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static void awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executor) {
        com.google.common.base.Verify.verify(awaitTerminationUninterruptibly(executor, Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS));
    }

    public static boolean awaitTerminationUninterruptibly(java.util.concurrent.ExecutorService executor, long timeout, java.util.concurrent.TimeUnit unit) {
        boolean zAwaitTermination;
        boolean z = false;
        try {
            long nanos = unit.toNanos(timeout);
            long jNanoTime = java.lang.System.nanoTime() + nanos;
            while (true) {
                try {
                    zAwaitTermination = executor.awaitTermination(nanos, java.util.concurrent.TimeUnit.NANOSECONDS);
                    break;
                } catch (java.lang.InterruptedException unused) {
                    z = true;
                    nanos = jNanoTime - java.lang.System.nanoTime();
                }
            }
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            return zAwaitTermination;
        } catch (java.lang.Throwable th) {
            if (z) {
                java.lang.Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    private Uninterruptibles() {
    }
}
