package com.google.protobuf.kotlin;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00040\u0005B\u001f\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0096\u0002R \u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableMapEntries;", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "", "delegate", "(Ljava/util/Set;)V", "iterator", "", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UnmodifiableMapEntries<K, V> extends com.google.protobuf.kotlin.UnmodifiableCollection<java.util.Map.Entry<? extends K, ? extends V>> implements java.util.Set<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.Set<java.util.Map.Entry<K, V>> delegate;

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return contains((java.util.Map.Entry<? extends java.lang.Object, ? extends java.lang.Object>) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(java.util.Map.Entry<? extends java.lang.Object, ? extends java.lang.Object> entry) {
        return super.contains(entry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(java.util.Set<? extends java.util.Map.Entry<? extends K, ? extends V>> delegate) {
        super(delegate);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: renamed from: com.google.protobuf.kotlin.UnmodifiableMapEntries$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: UnmodifiableCollections.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0004H\u0096\u0003J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"com/google/protobuf/kotlin/UnmodifiableMapEntries$iterator$1", "", "", "hasNext", "", "next", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<java.util.Map.Entry<? extends K, ? extends V>>, kotlin.jvm.internal.markers.KMappedMarker {
        private final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> $$delegate_0;
        final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> $itr;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.$$delegate_0.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it) {
            this.$itr = it;
            this.$$delegate_0 = it;
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
            return new com.google.protobuf.kotlin.UnmodifiableMapEntry(this.$itr.next());
        }
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.google.protobuf.kotlin.UnmodifiableMapEntries.AnonymousClass1(this.delegate.iterator());
    }
}
