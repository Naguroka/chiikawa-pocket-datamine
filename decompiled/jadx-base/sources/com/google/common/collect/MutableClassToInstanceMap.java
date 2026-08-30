package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class MutableClassToInstanceMap<B> extends com.google.common.collect.ForwardingMap<java.lang.Class<? extends B>, B> implements com.google.common.collect.ClassToInstanceMap<B>, java.io.Serializable {
    private final java.util.Map<java.lang.Class<? extends B>, B> delegate;

    public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create() {
        return new com.google.common.collect.MutableClassToInstanceMap<>(new java.util.HashMap());
    }

    public static <B> com.google.common.collect.MutableClassToInstanceMap<B> create(java.util.Map<java.lang.Class<? extends B>, B> backingMap) {
        return new com.google.common.collect.MutableClassToInstanceMap<>(backingMap);
    }

    private MutableClassToInstanceMap(java.util.Map<java.lang.Class<? extends B>, B> delegate) {
        this.delegate = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public java.util.Map<java.lang.Class<? extends B>, B> delegate() {
        return this.delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <B> java.util.Map.Entry<java.lang.Class<? extends B>, B> checkedEntry(final java.util.Map.Entry<java.lang.Class<? extends B>, B> entry) {
        return new com.google.common.collect.ForwardingMapEntry<java.lang.Class<? extends B>, B>() { // from class: com.google.common.collect.MutableClassToInstanceMap.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
            public java.util.Map.Entry<java.lang.Class<? extends B>, B> delegate() {
                return entry;
            }

            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
            @com.google.common.collect.ParametricNullness
            public B setValue(@com.google.common.collect.ParametricNullness B b) {
                com.google.common.collect.MutableClassToInstanceMap.cast(getKey(), b);
                return (B) super.setValue(b);
            }
        };
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.Class<? extends B>, B>> entrySet() {
        return new com.google.common.collect.ForwardingSet<java.util.Map.Entry<java.lang.Class<? extends B>, B>>() { // from class: com.google.common.collect.MutableClassToInstanceMap.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public java.util.Set<java.util.Map.Entry<java.lang.Class<? extends B>, B>> delegate() {
                return com.google.common.collect.MutableClassToInstanceMap.this.delegate().entrySet();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public java.util.Iterator<java.util.Map.Entry<java.lang.Class<? extends B>, B>> iterator() {
                return new com.google.common.collect.TransformedIterator<java.util.Map.Entry<java.lang.Class<? extends B>, B>, java.util.Map.Entry<java.lang.Class<? extends B>, B>>(this, delegate().iterator()) { // from class: com.google.common.collect.MutableClassToInstanceMap.2.1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    public java.util.Map.Entry<java.lang.Class<? extends B>, B> transform(java.util.Map.Entry<java.lang.Class<? extends B>, B> from) {
                        return com.google.common.collect.MutableClassToInstanceMap.checkedEntry(from);
                    }
                };
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public java.lang.Object[] toArray() {
                return standardToArray();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) standardToArray(tArr);
            }
        };
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @javax.annotation.CheckForNull
    public B put(java.lang.Class<? extends B> cls, @com.google.common.collect.ParametricNullness B b) {
        cast(cls, b);
        return (B) super.put(cls, b);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    public void putAll(java.util.Map<? extends java.lang.Class<? extends B>, ? extends B> map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            cast((java.lang.Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ClassToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T putInstance(java.lang.Class<T> cls, @com.google.common.collect.ParametricNullness T t) {
        return (T) cast(cls, put((java.lang.Class<? extends T>) cls, t));
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @javax.annotation.CheckForNull
    public <T extends B> T getInstance(java.lang.Class<T> cls) {
        return (T) cast(cls, get(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @javax.annotation.CheckForNull
    public static <T> T cast(java.lang.Class<T> cls, @javax.annotation.CheckForNull java.lang.Object obj) {
        return (T) com.google.common.primitives.Primitives.wrap(cls).cast(obj);
    }

    private java.lang.Object writeReplace() {
        return new com.google.common.collect.MutableClassToInstanceMap.SerializedForm(delegate());
    }

    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    private static final class SerializedForm<B> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.Map<java.lang.Class<? extends B>, B> backingMap;

        SerializedForm(java.util.Map<java.lang.Class<? extends B>, B> backingMap) {
            this.backingMap = backingMap;
        }

        java.lang.Object readResolve() {
            return com.google.common.collect.MutableClassToInstanceMap.create(this.backingMap);
        }
    }
}
