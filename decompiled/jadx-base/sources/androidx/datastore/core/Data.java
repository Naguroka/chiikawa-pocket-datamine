package androidx.datastore.core;

/* JADX INFO: compiled from: State.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/Data;", "T", "Landroidx/datastore/core/State;", "value", "hashCode", "", "version", "(Ljava/lang/Object;II)V", "getHashCode", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "checkHashCode", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Data<T> extends androidx.datastore.core.State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t, int i, int i2) {
        super(i2, null);
        this.value = t;
        this.hashCode = i;
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }

    public final void checkHashCode() {
        T t = this.value;
        if (!((t != null ? t.hashCode() : 0) == this.hashCode)) {
            throw new java.lang.IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
