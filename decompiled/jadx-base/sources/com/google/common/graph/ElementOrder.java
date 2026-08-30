package com.google.common.graph;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.Immutable
@com.google.common.graph.ElementTypesAreNonnullByDefault
public final class ElementOrder<T> {

    @javax.annotation.CheckForNull
    private final java.util.Comparator<T> comparator;
    private final com.google.common.graph.ElementOrder.Type type;

    public enum Type {
        UNORDERED,
        STABLE,
        INSERTION,
        SORTED
    }

    /* JADX WARN: Multi-variable type inference failed */
    <T1 extends T> com.google.common.graph.ElementOrder<T1> cast() {
        return this;
    }

    private ElementOrder(com.google.common.graph.ElementOrder.Type type, @javax.annotation.CheckForNull java.util.Comparator<T> comparator) {
        this.type = (com.google.common.graph.ElementOrder.Type) com.google.common.base.Preconditions.checkNotNull(type);
        this.comparator = comparator;
        com.google.common.base.Preconditions.checkState((type == com.google.common.graph.ElementOrder.Type.SORTED) == (comparator != null));
    }

    public static <S> com.google.common.graph.ElementOrder<S> unordered() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.UNORDERED, null);
    }

    public static <S> com.google.common.graph.ElementOrder<S> stable() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.STABLE, null);
    }

    public static <S> com.google.common.graph.ElementOrder<S> insertion() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.INSERTION, null);
    }

    public static <S extends java.lang.Comparable<? super S>> com.google.common.graph.ElementOrder<S> natural() {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.SORTED, com.google.common.collect.Ordering.natural());
    }

    public static <S> com.google.common.graph.ElementOrder<S> sorted(java.util.Comparator<S> comparator) {
        return new com.google.common.graph.ElementOrder<>(com.google.common.graph.ElementOrder.Type.SORTED, (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator));
    }

    public com.google.common.graph.ElementOrder.Type type() {
        return this.type;
    }

    public java.util.Comparator<T> comparator() {
        java.util.Comparator<T> comparator = this.comparator;
        if (comparator != null) {
            return comparator;
        }
        throw new java.lang.UnsupportedOperationException("This ordering does not define a comparator.");
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.graph.ElementOrder)) {
            return false;
        }
        com.google.common.graph.ElementOrder elementOrder = (com.google.common.graph.ElementOrder) obj;
        return this.type == elementOrder.type && com.google.common.base.Objects.equal(this.comparator, elementOrder.comparator);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.type, this.comparator);
    }

    public java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper toStringHelperAdd = com.google.common.base.MoreObjects.toStringHelper(this).add("type", this.type);
        java.util.Comparator<T> comparator = this.comparator;
        if (comparator != null) {
            toStringHelperAdd.add("comparator", comparator);
        }
        return toStringHelperAdd.toString();
    }

    /* JADX INFO: renamed from: com.google.common.graph.ElementOrder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[com.google.common.graph.ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[com.google.common.graph.ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[com.google.common.graph.ElementOrder.Type.INSERTION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[com.google.common.graph.ElementOrder.Type.STABLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[com.google.common.graph.ElementOrder.Type.SORTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    <K extends T, V> java.util.Map<K, V> createMap(int expectedSize) {
        int i = com.google.common.graph.ElementOrder.AnonymousClass1.$SwitchMap$com$google$common$graph$ElementOrder$Type[this.type.ordinal()];
        if (i == 1) {
            return com.google.common.collect.Maps.newHashMapWithExpectedSize(expectedSize);
        }
        if (i == 2 || i == 3) {
            return com.google.common.collect.Maps.newLinkedHashMapWithExpectedSize(expectedSize);
        }
        if (i == 4) {
            return com.google.common.collect.Maps.newTreeMap(comparator());
        }
        throw new java.lang.AssertionError();
    }
}
