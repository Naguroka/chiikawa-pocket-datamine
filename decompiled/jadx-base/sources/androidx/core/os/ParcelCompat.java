package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class ParcelCompat {
    public static boolean readBoolean(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void writeBoolean(android.os.Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static <T> void readList(android.os.Parcel parcel, java.util.List<? super T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            androidx.core.os.ParcelCompat.TiramisuImpl.readList(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.core.os.ParcelCompat.TiramisuImpl.readArrayList(parcel, classLoader, cls);
        }
        return parcel.readArrayList(classLoader);
    }

    public static <T> T[] readArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return (T[]) androidx.core.os.ParcelCompat.TiramisuImpl.readArray(parcel, classLoader, cls);
        }
        return (T[]) parcel.readArray(classLoader);
    }

    public static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.core.os.ParcelCompat.TiramisuImpl.readSparseArray(parcel, classLoader, cls);
        }
        return parcel.readSparseArray(classLoader);
    }

    public static <K, V> void readMap(android.os.Parcel parcel, java.util.Map<? super K, ? super V> map, java.lang.ClassLoader classLoader, java.lang.Class<K> cls, java.lang.Class<V> cls2) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            androidx.core.os.ParcelCompat.TiramisuImpl.readMap(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    public static <K, V> java.util.HashMap<K, V> readHashMap(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends K> cls, java.lang.Class<? extends V> cls2) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.core.os.ParcelCompat.TiramisuImpl.readHashMap(parcel, classLoader, cls, cls2);
        }
        return parcel.readHashMap(classLoader);
    }

    public static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return (T) androidx.core.os.ParcelCompat.TiramisuImpl.readParcelable(parcel, classLoader, cls);
        }
        return (T) parcel.readParcelable(classLoader);
    }

    public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.core.os.ParcelCompat.TiramisuImpl.readParcelableCreator(parcel, classLoader, cls);
        }
        return (android.os.Parcelable.Creator<T>) androidx.core.os.ParcelCompat.Api30Impl.readParcelableCreator(parcel, classLoader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] readParcelableArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return (T[]) androidx.core.os.ParcelCompat.TiramisuImpl.readParcelableArray(parcel, classLoader, cls);
        }
        return (T[]) parcel.readParcelableArray(classLoader);
    }

    public static <T> java.util.List<T> readParcelableList(android.os.Parcel parcel, java.util.List<T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return androidx.core.os.ParcelCompat.TiramisuImpl.readParcelableList(parcel, list, classLoader, cls);
        }
        return androidx.core.os.ParcelCompat.Api29Impl.readParcelableList(parcel, list, classLoader);
    }

    public static <T extends java.io.Serializable> T readSerializable(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
        if (androidx.core.os.BuildCompat.isAtLeastT()) {
            return (T) androidx.core.os.ParcelCompat.TiramisuImpl.readSerializable(parcel, classLoader, cls);
        }
        return (T) parcel.readSerializable();
    }

    private ParcelCompat() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static final <T extends android.os.Parcelable> java.util.List<T> readParcelableList(android.os.Parcel parcel, java.util.List<T> list, java.lang.ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static final android.os.Parcelable.Creator<?> readParcelableCreator(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    static class TiramisuImpl {
        private TiramisuImpl() {
        }

        static <T extends java.io.Serializable> T readSerializable(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        static <T extends android.os.Parcelable> T readParcelable(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        public static <T> android.os.Parcelable.Creator<T> readParcelableCreator(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        static <T> T[] readParcelableArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        static <T> java.util.List<T> readParcelableList(android.os.Parcel parcel, java.util.List<T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        public static <T> void readList(android.os.Parcel parcel, java.util.List<? super T> list, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        public static <T> java.util.ArrayList<T> readArrayList(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        public static <T> T[] readArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        public static <T> android.util.SparseArray<T> readSparseArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }

        public static <K, V> void readMap(android.os.Parcel parcel, java.util.Map<? super K, ? super V> map, java.lang.ClassLoader classLoader, java.lang.Class<K> cls, java.lang.Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        public static <V, K> java.util.HashMap<K, V> readHashMap(android.os.Parcel parcel, java.lang.ClassLoader classLoader, java.lang.Class<? extends K> cls, java.lang.Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }
    }
}
