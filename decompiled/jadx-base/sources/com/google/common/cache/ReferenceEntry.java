package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
interface ReferenceEntry<K, V> {
    long getAccessTime();

    int getHash();

    @javax.annotation.CheckForNull
    K getKey();

    @javax.annotation.CheckForNull
    com.google.common.cache.ReferenceEntry<K, V> getNext();

    com.google.common.cache.ReferenceEntry<K, V> getNextInAccessQueue();

    com.google.common.cache.ReferenceEntry<K, V> getNextInWriteQueue();

    com.google.common.cache.ReferenceEntry<K, V> getPreviousInAccessQueue();

    com.google.common.cache.ReferenceEntry<K, V> getPreviousInWriteQueue();

    @javax.annotation.CheckForNull
    com.google.common.cache.LocalCache.ValueReference<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long time);

    void setNextInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> next);

    void setNextInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> next);

    void setPreviousInAccessQueue(com.google.common.cache.ReferenceEntry<K, V> previous);

    void setPreviousInWriteQueue(com.google.common.cache.ReferenceEntry<K, V> previous);

    void setValueReference(com.google.common.cache.LocalCache.ValueReference<K, V> valueReference);

    void setWriteTime(long time);
}
