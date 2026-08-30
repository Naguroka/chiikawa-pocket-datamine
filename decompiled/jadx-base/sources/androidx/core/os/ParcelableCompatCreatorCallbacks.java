package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public interface ParcelableCompatCreatorCallbacks<T> {
    T createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader);

    T[] newArray(int i);
}
