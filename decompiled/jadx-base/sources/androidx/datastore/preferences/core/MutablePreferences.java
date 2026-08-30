package androidx.datastore.preferences.core;

/* JADX INFO: compiled from: Preferences.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u001d\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0004H\u0096\u0002J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\r\u0010\u0018\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0019J$\u0010\u001a\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010\u001e\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002J\u0011\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0001H\u0086\u0002J\u0015\u0010\u001f\u001a\u00020\u00102\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0086\u0002J'\u0010#\u001a\u00020\u00102\u001a\u0010$\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\"0%\"\u0006\u0012\u0002\b\u00030\"¢\u0006\u0002\u0010&J\u001f\u0010'\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0004¢\u0006\u0002\u0010\u001bJ*\u0010(\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010)\u001a\u0002H\u0014H\u0086\u0002¢\u0006\u0002\u0010*J#\u0010+\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b,J\b\u0010-\u001a\u00020.H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006/"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "preferencesMap", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "startFrozen", "", "(Ljava/util/Map;Z)V", "frozen", "Landroidx/datastore/preferences/core/AtomicBoolean;", "getPreferencesMap$datastore_preferences_core", "()Ljava/util/Map;", "asMap", "", "checkNotFrozen", "", "checkNotFrozen$datastore_preferences_core", "clear", "contains", "T", com.ironsource.y8.h.W, "equals", "other", "freeze", "freeze$datastore_preferences_core", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "hashCode", "", "minusAssign", "plusAssign", "prefs", "pair", "Landroidx/datastore/preferences/core/Preferences$Pair;", "putAll", "pairs", "", "([Landroidx/datastore/preferences/core/Preferences$Pair;)V", "remove", "set", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "setUnchecked", "setUnchecked$datastore_preferences_core", "toString", "", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutablePreferences extends androidx.datastore.preferences.core.Preferences {
    private final androidx.datastore.preferences.core.AtomicBoolean frozen;
    private final java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> preferencesMap;

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MutablePreferences(java.util.LinkedHashMap linkedHashMap, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new java.util.LinkedHashMap() : linkedHashMap, (i & 2) != 0 ? true : z);
    }

    public final java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> getPreferencesMap$datastore_preferences_core() {
        return this.preferencesMap;
    }

    public MutablePreferences(java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> preferencesMap, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.preferencesMap = preferencesMap;
        this.frozen = new androidx.datastore.preferences.core.AtomicBoolean(z);
    }

    public final void checkNotFrozen$datastore_preferences_core() {
        if (!(!this.frozen.get())) {
            throw new java.lang.IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void freeze$datastore_preferences_core() {
        this.frozen.set(true);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(androidx.datastore.preferences.core.Preferences.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.preferencesMap.containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.core.Preferences
    public <T> T get(androidx.datastore.preferences.core.Preferences.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.preferencesMap.get(key);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        T t2 = (T) java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t2, "copyOf(this, size)");
        return t2;
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap() {
        kotlin.Pair pair;
        java.util.Set<java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object>> setEntrySet = this.preferencesMap.entrySet();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                java.lang.Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                pair = new kotlin.Pair(key, bArrCopyOf);
            } else {
                pair = new kotlin.Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return androidx.datastore.preferences.core.Actual_jvmKt.immutableMap(linkedHashMap);
    }

    public final <T> void set(androidx.datastore.preferences.core.Preferences.Key<T> key, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        setUnchecked$datastore_preferences_core(key, value);
    }

    public final void setUnchecked$datastore_preferences_core(androidx.datastore.preferences.core.Preferences.Key<?> key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        if (value == null) {
            remove(key);
            return;
        }
        if (value instanceof java.util.Set) {
            this.preferencesMap.put(key, androidx.datastore.preferences.core.Actual_jvmKt.immutableCopyOfSet((java.util.Set) value));
            return;
        }
        if (!(value instanceof byte[])) {
            this.preferencesMap.put(key, value);
            return;
        }
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> map = this.preferencesMap;
        byte[] bArr = (byte[]) value;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public final void plusAssign(androidx.datastore.preferences.core.Preferences prefs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void plusAssign(androidx.datastore.preferences.core.Preferences.Pair<?> pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "pair");
        checkNotFrozen$datastore_preferences_core();
        putAll(pair);
    }

    public final void minusAssign(androidx.datastore.preferences.core.Preferences.Key<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        remove(key);
    }

    public final void putAll(androidx.datastore.preferences.core.Preferences.Pair<?>... pairs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core();
        for (androidx.datastore.preferences.core.Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core(pair.getKey$datastore_preferences_core(), pair.getValue$datastore_preferences_core());
        }
    }

    public final <T> T remove(androidx.datastore.preferences.core.Preferences.Key<T> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core();
        return (T) this.preferencesMap.remove(key);
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core();
        this.preferencesMap.clear();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    public boolean equals(java.lang.Object other) {
        boolean zAreEqual;
        if (!(other instanceof androidx.datastore.preferences.core.MutablePreferences)) {
            return false;
        }
        androidx.datastore.preferences.core.MutablePreferences mutablePreferences = (androidx.datastore.preferences.core.MutablePreferences) other;
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> map = mutablePreferences.preferencesMap;
        if (map == this.preferencesMap) {
            return true;
        }
        if (map.size() != this.preferencesMap.size()) {
            return false;
        }
        java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> map2 = mutablePreferences.preferencesMap;
        if (!map2.isEmpty()) {
            for (java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry : map2.entrySet()) {
                java.lang.Object obj = this.preferencesMap.get(entry.getKey());
                if (obj != null) {
                    java.lang.Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(value, obj);
                    } else if ((obj instanceof byte[]) && java.util.Arrays.equals((byte[]) value, (byte[]) obj)) {
                        zAreEqual = true;
                    } else {
                        zAreEqual = false;
                    }
                } else {
                    zAreEqual = false;
                }
                if (!zAreEqual) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        java.util.Iterator<T> it = this.preferencesMap.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? java.util.Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", 0, null, new kotlin.jvm.functions.Function1<java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object>, java.lang.CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences.toString.1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.CharSequence invoke(java.util.Map.Entry<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> entry) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entry, "entry");
                java.lang.Object value = entry.getValue();
                return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? kotlin.collections.ArraysKt.joinToString$default((byte[]) value, (java.lang.CharSequence) ", ", (java.lang.CharSequence) com.ironsource.y8.i.d, (java.lang.CharSequence) com.ironsource.y8.i.e, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 56, (java.lang.Object) null) : java.lang.String.valueOf(entry.getValue()));
            }
        }, 24, null);
    }
}
