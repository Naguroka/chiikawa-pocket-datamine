package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public final class RemovalNotification<K, V> extends java.util.AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final com.google.common.cache.RemovalCause cause;

    public static <K, V> com.google.common.cache.RemovalNotification<K, V> create(@javax.annotation.CheckForNull K key, @javax.annotation.CheckForNull V value, com.google.common.cache.RemovalCause cause) {
        return new com.google.common.cache.RemovalNotification<>(key, value, cause);
    }

    private RemovalNotification(@javax.annotation.CheckForNull K key, @javax.annotation.CheckForNull V value, com.google.common.cache.RemovalCause cause) {
        super(key, value);
        this.cause = (com.google.common.cache.RemovalCause) com.google.common.base.Preconditions.checkNotNull(cause);
    }

    public com.google.common.cache.RemovalCause getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
