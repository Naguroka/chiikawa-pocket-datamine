package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public class Joiner {
    private final java.lang.String separator;

    public static com.google.common.base.Joiner on(java.lang.String separator) {
        return new com.google.common.base.Joiner(separator);
    }

    public static com.google.common.base.Joiner on(char separator) {
        return new com.google.common.base.Joiner(java.lang.String.valueOf(separator));
    }

    private Joiner(java.lang.String separator) {
        this.separator = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(separator);
    }

    private Joiner(com.google.common.base.Joiner prototype) {
        this.separator = prototype.separator;
    }

    public <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Iterable<? extends java.lang.Object> iterable) throws java.io.IOException {
        return (A) appendTo(a2, iterable.iterator());
    }

    public <A extends java.lang.Appendable> A appendTo(A appendable, java.util.Iterator<? extends java.lang.Object> parts) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(appendable);
        if (parts.hasNext()) {
            appendable.append(toString(parts.next()));
            while (parts.hasNext()) {
                appendable.append(this.separator);
                appendable.append(toString(parts.next()));
            }
        }
        return appendable;
    }

    public final <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Object[] objArr) throws java.io.IOException {
        return (A) appendTo(a2, java.util.Arrays.asList(objArr));
    }

    public final <A extends java.lang.Appendable> A appendTo(A a2, @javax.annotation.CheckForNull java.lang.Object obj, @javax.annotation.CheckForNull java.lang.Object obj2, java.lang.Object... objArr) throws java.io.IOException {
        return (A) appendTo(a2, iterable(obj, obj2, objArr));
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, java.lang.Iterable<? extends java.lang.Object> parts) {
        return appendTo(builder, parts.iterator());
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, java.util.Iterator<? extends java.lang.Object> parts) {
        try {
            appendTo(builder, parts);
            return builder;
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, java.lang.Object[] parts) {
        return appendTo(builder, (java.lang.Iterable<? extends java.lang.Object>) java.util.Arrays.asList(parts));
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, @javax.annotation.CheckForNull java.lang.Object first, @javax.annotation.CheckForNull java.lang.Object second, java.lang.Object... rest) {
        return appendTo(builder, iterable(first, second, rest));
    }

    public final java.lang.String join(java.lang.Iterable<? extends java.lang.Object> parts) {
        return join(parts.iterator());
    }

    public final java.lang.String join(java.util.Iterator<? extends java.lang.Object> parts) {
        return appendTo(new java.lang.StringBuilder(), parts).toString();
    }

    public final java.lang.String join(java.lang.Object[] parts) {
        return join(java.util.Arrays.asList(parts));
    }

    public final java.lang.String join(@javax.annotation.CheckForNull java.lang.Object first, @javax.annotation.CheckForNull java.lang.Object second, java.lang.Object... rest) {
        return join(iterable(first, second, rest));
    }

    public com.google.common.base.Joiner useForNull(final java.lang.String nullText) {
        com.google.common.base.Preconditions.checkNotNull(nullText);
        return new com.google.common.base.Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            java.lang.CharSequence toString(@javax.annotation.CheckForNull java.lang.Object part) {
                return part == null ? nullText : com.google.common.base.Joiner.this.toString(part);
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner useForNull(java.lang.String nullText2) {
                throw new java.lang.UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner skipNulls() {
                throw new java.lang.UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public com.google.common.base.Joiner skipNulls() {
        return new com.google.common.base.Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends java.lang.Appendable> A appendTo(A appendable, java.util.Iterator<? extends java.lang.Object> parts) throws java.io.IOException {
                com.google.common.base.Preconditions.checkNotNull(appendable, "appendable");
                com.google.common.base.Preconditions.checkNotNull(parts, "parts");
                while (parts.hasNext()) {
                    java.lang.Object next = parts.next();
                    if (next != null) {
                        appendable.append(com.google.common.base.Joiner.this.toString(next));
                        break;
                    }
                }
                while (parts.hasNext()) {
                    java.lang.Object next2 = parts.next();
                    if (next2 != null) {
                        appendable.append(com.google.common.base.Joiner.this.separator);
                        appendable.append(com.google.common.base.Joiner.this.toString(next2));
                    }
                }
                return appendable;
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner useForNull(java.lang.String nullText) {
                throw new java.lang.UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(java.lang.String kvs) {
                throw new java.lang.UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(char keyValueSeparator) {
        return withKeyValueSeparator(java.lang.String.valueOf(keyValueSeparator));
    }

    public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(java.lang.String keyValueSeparator) {
        return new com.google.common.base.Joiner.MapJoiner(keyValueSeparator);
    }

    public static final class MapJoiner {
        private final com.google.common.base.Joiner joiner;
        private final java.lang.String keyValueSeparator;

        private MapJoiner(com.google.common.base.Joiner joiner, java.lang.String keyValueSeparator) {
            this.joiner = joiner;
            this.keyValueSeparator = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(keyValueSeparator);
        }

        public <A extends java.lang.Appendable> A appendTo(A a2, java.util.Map<?, ?> map) throws java.io.IOException {
            return (A) appendTo(a2, map.entrySet());
        }

        public java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, java.util.Map<?, ?> map) {
            return appendTo(builder, (java.lang.Iterable<? extends java.util.Map.Entry<?, ?>>) map.entrySet());
        }

        public <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> iterable) throws java.io.IOException {
            return (A) appendTo(a2, iterable.iterator());
        }

        public <A extends java.lang.Appendable> A appendTo(A appendable, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> parts) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(appendable);
            if (parts.hasNext()) {
                java.util.Map.Entry<?, ?> next = parts.next();
                appendable.append(this.joiner.toString(next.getKey()));
                appendable.append(this.keyValueSeparator);
                appendable.append(this.joiner.toString(next.getValue()));
                while (parts.hasNext()) {
                    appendable.append(this.joiner.separator);
                    java.util.Map.Entry<?, ?> next2 = parts.next();
                    appendable.append(this.joiner.toString(next2.getKey()));
                    appendable.append(this.keyValueSeparator);
                    appendable.append(this.joiner.toString(next2.getValue()));
                }
            }
            return appendable;
        }

        public java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> entries) {
            return appendTo(builder, entries.iterator());
        }

        public java.lang.StringBuilder appendTo(java.lang.StringBuilder builder, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> entries) {
            try {
                appendTo(builder, entries);
                return builder;
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        public java.lang.String join(java.util.Map<?, ?> map) {
            return join(map.entrySet());
        }

        public java.lang.String join(java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> entries) {
            return join(entries.iterator());
        }

        public java.lang.String join(java.util.Iterator<? extends java.util.Map.Entry<?, ?>> entries) {
            return appendTo(new java.lang.StringBuilder(), entries).toString();
        }

        public com.google.common.base.Joiner.MapJoiner useForNull(java.lang.String nullText) {
            return new com.google.common.base.Joiner.MapJoiner(this.joiner.useForNull(nullText), this.keyValueSeparator);
        }
    }

    java.lang.CharSequence toString(@javax.annotation.CheckForNull java.lang.Object part) {
        java.util.Objects.requireNonNull(part);
        return part instanceof java.lang.CharSequence ? (java.lang.CharSequence) part : part.toString();
    }

    private static java.lang.Iterable<java.lang.Object> iterable(@javax.annotation.CheckForNull final java.lang.Object first, @javax.annotation.CheckForNull final java.lang.Object second, final java.lang.Object[] rest) {
        com.google.common.base.Preconditions.checkNotNull(rest);
        return new java.util.AbstractList<java.lang.Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return rest.length + 2;
            }

            @Override // java.util.AbstractList, java.util.List
            @javax.annotation.CheckForNull
            public java.lang.Object get(int index) {
                if (index == 0) {
                    return first;
                }
                if (index == 1) {
                    return second;
                }
                return rest[index - 2];
            }
        };
    }
}
