package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
final class LongAddables {
    private static final com.google.common.base.Supplier<com.google.common.cache.LongAddable> SUPPLIER;

    LongAddables() {
    }

    static {
        com.google.common.base.Supplier<com.google.common.cache.LongAddable> supplier;
        try {
            new com.google.common.cache.LongAdder();
            supplier = new com.google.common.base.Supplier<com.google.common.cache.LongAddable>() { // from class: com.google.common.cache.LongAddables.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.common.base.Supplier
                public com.google.common.cache.LongAddable get() {
                    return new com.google.common.cache.LongAdder();
                }
            };
        } catch (java.lang.Throwable unused) {
            supplier = new com.google.common.base.Supplier<com.google.common.cache.LongAddable>() { // from class: com.google.common.cache.LongAddables.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.google.common.base.Supplier
                public com.google.common.cache.LongAddable get() {
                    return new com.google.common.cache.LongAddables.PureJavaLongAddable();
                }
            };
        }
        SUPPLIER = supplier;
    }

    public static com.google.common.cache.LongAddable create() {
        return SUPPLIER.get();
    }

    private static final class PureJavaLongAddable extends java.util.concurrent.atomic.AtomicLong implements com.google.common.cache.LongAddable {
        private PureJavaLongAddable() {
        }

        @Override // com.google.common.cache.LongAddable
        public void increment() {
            getAndIncrement();
        }

        @Override // com.google.common.cache.LongAddable
        public void add(long x) {
            getAndAdd(x);
        }

        @Override // com.google.common.cache.LongAddable
        public long sum() {
            return get();
        }
    }
}
