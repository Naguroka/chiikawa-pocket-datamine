package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public final class BundleCollectionUtil {
    public static <T> com.google.common.collect.ImmutableList<android.os.Bundle> toBundleList(java.util.List<T> list, com.google.common.base.Function<T, android.os.Bundle> function) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add(function.apply(list.get(i)));
        }
        return builder.build();
    }

    public static <T> com.google.common.collect.ImmutableList<T> fromBundleList(com.google.common.base.Function<android.os.Bundle, T> function, java.util.List<android.os.Bundle> list) {
        com.google.common.collect.ImmutableList.Builder builder = com.google.common.collect.ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            builder.add(function.apply((android.os.Bundle) androidx.media3.common.util.Assertions.checkNotNull(list.get(i))));
        }
        return builder.build();
    }

    public static <T> java.util.ArrayList<android.os.Bundle> toBundleArrayList(java.util.Collection<T> collection, com.google.common.base.Function<T, android.os.Bundle> function) {
        java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>(collection.size());
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    public static <T> android.util.SparseArray<T> fromBundleSparseArray(com.google.common.base.Function<android.os.Bundle, T> function, android.util.SparseArray<android.os.Bundle> sparseArray) {
        android.util.SparseArray<T> sparseArray2 = new android.util.SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), function.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static <T> android.util.SparseArray<android.os.Bundle> toBundleSparseArray(android.util.SparseArray<T> sparseArray, com.google.common.base.Function<T, android.os.Bundle> function) {
        android.util.SparseArray<android.os.Bundle> sparseArray2 = new android.util.SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), function.apply(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    public static android.os.Bundle stringMapToBundle(java.util.Map<java.lang.String, java.lang.String> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static java.util.HashMap<java.lang.String, java.lang.String> bundleToStringHashMap(android.os.Bundle bundle) {
        java.util.HashMap<java.lang.String, java.lang.String> map = new java.util.HashMap<>();
        if (bundle == android.os.Bundle.EMPTY) {
            return map;
        }
        for (java.lang.String str : bundle.keySet()) {
            java.lang.String string = bundle.getString(str);
            if (string != null) {
                map.put(str, string);
            }
        }
        return map;
    }

    public static com.google.common.collect.ImmutableMap<java.lang.String, java.lang.String> bundleToStringImmutableMap(android.os.Bundle bundle) {
        if (bundle == android.os.Bundle.EMPTY) {
            return com.google.common.collect.ImmutableMap.of();
        }
        return com.google.common.collect.ImmutableMap.copyOf((java.util.Map) bundleToStringHashMap(bundle));
    }

    public static android.os.Bundle getBundleWithDefault(android.os.Bundle bundle, java.lang.String str, android.os.Bundle bundle2) {
        android.os.Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static java.util.ArrayList<java.lang.Integer> getIntegerArrayListWithDefault(android.os.Bundle bundle, java.lang.String str, java.util.ArrayList<java.lang.Integer> arrayList) {
        java.util.ArrayList<java.lang.Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static void ensureClassLoader(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((java.lang.ClassLoader) androidx.media3.common.util.Util.castNonNull(androidx.media3.common.util.BundleCollectionUtil.class.getClassLoader()));
        }
    }

    private BundleCollectionUtil() {
    }
}
