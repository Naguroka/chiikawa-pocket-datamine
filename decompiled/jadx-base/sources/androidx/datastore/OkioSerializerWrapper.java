package androidx.datastore;

/* JADX INFO: compiled from: DataStoreDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/datastore/OkioSerializerWrapper;", "T", "Landroidx/datastore/core/okio/OkioSerializer;", "delegate", "Landroidx/datastore/core/Serializer;", "(Landroidx/datastore/core/Serializer;)V", "defaultValue", "getDefaultValue", "()Ljava/lang/Object;", "readFrom", "source", "Lokio/BufferedSource;", "(Lokio/BufferedSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeTo", "", "t", "sink", "Lokio/BufferedSink;", "(Ljava/lang/Object;Lokio/BufferedSink;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioSerializerWrapper<T> implements androidx.datastore.core.okio.OkioSerializer<T> {
    private final androidx.datastore.core.Serializer<T> delegate;

    public OkioSerializerWrapper(androidx.datastore.core.Serializer<T> delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public java.lang.Object readFrom(okio.BufferedSource bufferedSource, kotlin.coroutines.Continuation<? super T> continuation) {
        return this.delegate.readFrom(bufferedSource.inputStream(), continuation);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public java.lang.Object writeTo(T t, okio.BufferedSink bufferedSink, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object objWriteTo = this.delegate.writeTo(t, bufferedSink.outputStream(), continuation);
        return objWriteTo == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWriteTo : kotlin.Unit.INSTANCE;
    }
}
