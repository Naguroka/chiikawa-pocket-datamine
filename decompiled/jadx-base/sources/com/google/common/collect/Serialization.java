package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class Serialization {
    private Serialization() {
    }

    static int readCount(java.io.ObjectInputStream stream) throws java.io.IOException {
        return stream.readInt();
    }

    static <K, V> void writeMap(java.util.Map<K, V> map, java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.writeInt(map.size());
        for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeObject(entry.getValue());
        }
    }

    static <K, V> void populateMap(java.util.Map<K, V> map, java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        populateMap(map, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMap(java.util.Map<K, V> map, java.io.ObjectInputStream stream, int size) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i = 0; i < size; i++) {
            map.put(stream.readObject(), stream.readObject());
        }
    }

    static <E> void writeMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.writeInt(multiset.entrySet().size());
        for (com.google.common.collect.Multiset.Entry<E> entry : multiset.entrySet()) {
            stream.writeObject(entry.getElement());
            stream.writeInt(entry.getCount());
        }
    }

    static <E> void populateMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        populateMultiset(multiset, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> void populateMultiset(com.google.common.collect.Multiset<E> multiset, java.io.ObjectInputStream stream, int distinctElements) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i = 0; i < distinctElements; i++) {
            multiset.add(stream.readObject(), stream.readInt());
        }
    }

    static <K, V> void writeMultimap(com.google.common.collect.Multimap<K, V> multimap, java.io.ObjectOutputStream stream) throws java.io.IOException {
        stream.writeInt(multimap.asMap().size());
        for (java.util.Map.Entry<K, java.util.Collection<V>> entry : multimap.asMap().entrySet()) {
            stream.writeObject(entry.getKey());
            stream.writeInt(entry.getValue().size());
            java.util.Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                stream.writeObject(it.next());
            }
        }
    }

    static <K, V> void populateMultimap(com.google.common.collect.Multimap<K, V> multimap, java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
        populateMultimap(multimap, stream, stream.readInt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> void populateMultimap(com.google.common.collect.Multimap<K, V> multimap, java.io.ObjectInputStream stream, int distinctKeys) throws java.io.IOException, java.lang.ClassNotFoundException {
        for (int i = 0; i < distinctKeys; i++) {
            java.util.Collection collection = multimap.get(stream.readObject());
            int i2 = stream.readInt();
            for (int i3 = 0; i3 < i2; i3++) {
                collection.add(stream.readObject());
            }
        }
    }

    static <T> com.google.common.collect.Serialization.FieldSetter<T> getFieldSetter(java.lang.Class<T> clazz, java.lang.String fieldName) {
        try {
            return new com.google.common.collect.Serialization.FieldSetter<>(clazz.getDeclaredField(fieldName));
        } catch (java.lang.NoSuchFieldException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    static final class FieldSetter<T> {
        private final java.lang.reflect.Field field;

        private FieldSetter(java.lang.reflect.Field field) {
            this.field = field;
            field.setAccessible(true);
        }

        void set(T instance, java.lang.Object value) {
            try {
                this.field.set(instance, value);
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        void set(T instance, int value) {
            try {
                this.field.set(instance, java.lang.Integer.valueOf(value));
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.AssertionError(e);
            }
        }
    }
}
