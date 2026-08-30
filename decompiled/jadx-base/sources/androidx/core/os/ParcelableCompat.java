package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class ParcelableCompat {
    @java.lang.Deprecated
    public static <T> android.os.Parcelable.Creator<T> newCreator(androidx.core.os.ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        return new androidx.core.os.ParcelableCompat.ParcelableCompatCreatorHoneycombMR2(parcelableCompatCreatorCallbacks);
    }

    static class ParcelableCompatCreatorHoneycombMR2<T> implements android.os.Parcelable.ClassLoaderCreator<T> {
        private final androidx.core.os.ParcelableCompatCreatorCallbacks<T> mCallbacks;

        ParcelableCompatCreatorHoneycombMR2(androidx.core.os.ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
            this.mCallbacks = parcelableCompatCreatorCallbacks;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(android.os.Parcel parcel) {
            return this.mCallbacks.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            return this.mCallbacks.createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int i) {
            return this.mCallbacks.newArray(i);
        }
    }

    private ParcelableCompat() {
    }
}
