package com.google.protobuf.kotlin;

/* JADX INFO: compiled from: ExtensionList.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B/\b\u0007\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\bJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0001J\u0013\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\fH\u0096\u0003¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u0016\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001eJ\t\u0010\u001f\u001a\u00020\u0010H\u0096\u0001J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0002J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u001eJ\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$2\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0096\u0001J\b\u0010(\u001a\u00020)H\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006*"}, d2 = {"Lcom/google/protobuf/kotlin/ExtensionList;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "M", "Lcom/google/protobuf/MessageLite;", "", "extension", "Lcom/google/protobuf/ExtensionLite;", "delegate", "(Lcom/google/protobuf/ExtensionLite;Ljava/util/List;)V", "getExtension", "()Lcom/google/protobuf/ExtensionLite;", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "equals", "other", "", "get", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ExtensionList<E, M extends com.google.protobuf.MessageLite> implements java.util.List<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private final java.util.List<E> delegate;
    private final com.google.protobuf.ExtensionLite<M, java.util.List<E>> extension;

    @Override // java.util.List
    public void add(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(java.lang.Object element) {
        return this.delegate.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(java.util.Collection<? extends java.lang.Object> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "elements");
        return this.delegate.containsAll(elements);
    }

    @Override // java.util.List
    public E get(int index) {
        return this.delegate.get(index);
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object element) {
        return this.delegate.indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object element) {
        return this.delegate.lastIndexOf(element);
    }

    @Override // java.util.List
    public E remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator<E> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i, E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super E> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public java.util.List<E> subList(int fromIndex, int toIndex) {
        return this.delegate.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtensionList(com.google.protobuf.ExtensionLite<M, java.util.List<E>> extension, java.util.List<? extends E> delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extension, "extension");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.extension = extension;
        this.delegate = delegate;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    public final com.google.protobuf.ExtensionLite<M, java.util.List<E>> getExtension() {
        return this.extension;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new com.google.protobuf.kotlin.UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
        return new com.google.protobuf.kotlin.UnmodifiableListIterator(this.delegate.listIterator());
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int index) {
        return new com.google.protobuf.kotlin.UnmodifiableListIterator(this.delegate.listIterator(index));
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.delegate, other);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.delegate.hashCode();
    }

    public java.lang.String toString() {
        return this.delegate.toString();
    }
}
