package com.google.protobuf.kotlin;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010*\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0001J\u000e\u0010\b\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\tJ\t\u0010\n\u001a\u00020\u000bH\u0096\u0001J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u000bH\u0096\u0001¨\u0006\u000e"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableListIterator;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "", "delegate", "(Ljava/util/ListIterator;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "", "previous", "previousIndex", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UnmodifiableListIterator<E> implements java.util.ListIterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private final /* synthetic */ java.util.ListIterator<E> $$delegate_0;

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$$delegate_0.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$$delegate_0.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.$$delegate_0.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$$delegate_0.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableListIterator(java.util.ListIterator<? extends E> delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.$$delegate_0 = delegate;
    }
}
