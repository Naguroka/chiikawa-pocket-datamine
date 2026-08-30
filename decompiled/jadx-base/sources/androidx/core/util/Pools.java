package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public final class Pools {

    public interface Pool<T> {
        T acquire();

        boolean release(T t);
    }

    private Pools() {
    }

    public static class SimplePool<T> implements androidx.core.util.Pools.Pool<T> {
        private final java.lang.Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i) {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new java.lang.Object[i];
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i = this.mPoolSize;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            java.lang.Object[] objArr = this.mPool;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.mPoolSize = i - 1;
            return t;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(T t) {
            if (isInPool(t)) {
                throw new java.lang.IllegalStateException("Already in the pool!");
            }
            int i = this.mPoolSize;
            java.lang.Object[] objArr = this.mPool;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.mPoolSize = i + 1;
            return true;
        }

        private boolean isInPool(T t) {
            for (int i = 0; i < this.mPoolSize; i++) {
                if (this.mPool[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class SynchronizedPool<T> extends androidx.core.util.Pools.SimplePool<T> {
        private final java.lang.Object mLock;

        public SynchronizedPool(int i) {
            super(i);
            this.mLock = new java.lang.Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t;
            synchronized (this.mLock) {
                t = (T) super.acquire();
            }
            return t;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(T t) {
            boolean zRelease;
            synchronized (this.mLock) {
                zRelease = super.release(t);
            }
            return zRelease;
        }
    }
}
