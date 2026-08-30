package com.google.protobuf.kotlin;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/protobuf/kotlin/UnmodifiableSet;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lcom/google/protobuf/kotlin/UnmodifiableCollection;", "", "delegate", "", "(Ljava/util/Collection;)V", "protobuf-kotlin-lite"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UnmodifiableSet<E> extends com.google.protobuf.kotlin.UnmodifiableCollection<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMappedMarker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(java.util.Collection<? extends E> delegate) {
        super(delegate);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
