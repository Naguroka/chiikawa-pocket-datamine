package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public abstract class RateLimiter {

    @javax.annotation.CheckForNull
    private volatile java.lang.Object mutexDoNotUseDirectly;
    private final com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch;

    abstract double doGetRate();

    abstract void doSetRate(double permitsPerSecond, long nowMicros);

    abstract long queryEarliestAvailable(long nowMicros);

    abstract long reserveEarliestAvailable(int permits, long nowMicros);

    public static com.google.common.util.concurrent.RateLimiter create(double permitsPerSecond) {
        return create(permitsPerSecond, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer());
    }

    static com.google.common.util.concurrent.RateLimiter create(double permitsPerSecond, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch) {
        com.google.common.util.concurrent.SmoothRateLimiter.SmoothBursty smoothBursty = new com.google.common.util.concurrent.SmoothRateLimiter.SmoothBursty(stopwatch, 1.0d);
        smoothBursty.setRate(permitsPerSecond);
        return smoothBursty;
    }

    public static com.google.common.util.concurrent.RateLimiter create(double permitsPerSecond, long warmupPeriod, java.util.concurrent.TimeUnit unit) {
        com.google.common.base.Preconditions.checkArgument(warmupPeriod >= 0, "warmupPeriod must not be negative: %s", warmupPeriod);
        return create(permitsPerSecond, warmupPeriod, unit, 3.0d, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.createFromSystemTimer());
    }

    static com.google.common.util.concurrent.RateLimiter create(double permitsPerSecond, long warmupPeriod, java.util.concurrent.TimeUnit unit, double coldFactor, com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch) {
        com.google.common.util.concurrent.SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new com.google.common.util.concurrent.SmoothRateLimiter.SmoothWarmingUp(stopwatch, warmupPeriod, unit, coldFactor);
        smoothWarmingUp.setRate(permitsPerSecond);
        return smoothWarmingUp;
    }

    private java.lang.Object mutex() {
        java.lang.Object obj = this.mutexDoNotUseDirectly;
        if (obj == null) {
            synchronized (this) {
                obj = this.mutexDoNotUseDirectly;
                if (obj == null) {
                    obj = new java.lang.Object();
                    this.mutexDoNotUseDirectly = obj;
                }
            }
        }
        return obj;
    }

    RateLimiter(com.google.common.util.concurrent.RateLimiter.SleepingStopwatch stopwatch) {
        this.stopwatch = (com.google.common.util.concurrent.RateLimiter.SleepingStopwatch) com.google.common.base.Preconditions.checkNotNull(stopwatch);
    }

    public final void setRate(double permitsPerSecond) {
        com.google.common.base.Preconditions.checkArgument(permitsPerSecond > 0.0d && !java.lang.Double.isNaN(permitsPerSecond), "rate must be positive");
        synchronized (mutex()) {
            doSetRate(permitsPerSecond, this.stopwatch.readMicros());
        }
    }

    public final double getRate() {
        double dDoGetRate;
        synchronized (mutex()) {
            dDoGetRate = doGetRate();
        }
        return dDoGetRate;
    }

    public double acquire() {
        return acquire(1);
    }

    public double acquire(int permits) {
        long jReserve = reserve(permits);
        this.stopwatch.sleepMicrosUninterruptibly(jReserve);
        return (jReserve * 1.0d) / java.util.concurrent.TimeUnit.SECONDS.toMicros(1L);
    }

    final long reserve(int permits) {
        long jReserveAndGetWaitLength;
        checkPermits(permits);
        synchronized (mutex()) {
            jReserveAndGetWaitLength = reserveAndGetWaitLength(permits, this.stopwatch.readMicros());
        }
        return jReserveAndGetWaitLength;
    }

    public boolean tryAcquire(long timeout, java.util.concurrent.TimeUnit unit) {
        return tryAcquire(1, timeout, unit);
    }

    public boolean tryAcquire(int permits) {
        return tryAcquire(permits, 0L, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire(int permits, long timeout, java.util.concurrent.TimeUnit unit) {
        long jMax = java.lang.Math.max(unit.toMicros(timeout), 0L);
        checkPermits(permits);
        synchronized (mutex()) {
            long micros = this.stopwatch.readMicros();
            if (!canAcquire(micros, jMax)) {
                return false;
            }
            this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(permits, micros));
            return true;
        }
    }

    private boolean canAcquire(long nowMicros, long timeoutMicros) {
        return queryEarliestAvailable(nowMicros) - timeoutMicros <= nowMicros;
    }

    final long reserveAndGetWaitLength(int permits, long nowMicros) {
        return java.lang.Math.max(reserveEarliestAvailable(permits, nowMicros) - nowMicros, 0L);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", java.lang.Double.valueOf(getRate()));
    }

    static abstract class SleepingStopwatch {
        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long micros);

        protected SleepingStopwatch() {
        }

        public static com.google.common.util.concurrent.RateLimiter.SleepingStopwatch createFromSystemTimer() {
            return new com.google.common.util.concurrent.RateLimiter.SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final com.google.common.base.Stopwatch stopwatch = com.google.common.base.Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected long readMicros() {
                    return this.stopwatch.elapsed(java.util.concurrent.TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected void sleepMicrosUninterruptibly(long micros) {
                    if (micros > 0) {
                        com.google.common.util.concurrent.Uninterruptibles.sleepUninterruptibly(micros, java.util.concurrent.TimeUnit.MICROSECONDS);
                    }
                }
            };
        }
    }

    private static void checkPermits(int permits) {
        com.google.common.base.Preconditions.checkArgument(permits > 0, "Requested permits (%s) must be positive", permits);
    }
}
