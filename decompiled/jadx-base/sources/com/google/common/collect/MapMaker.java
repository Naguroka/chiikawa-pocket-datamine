package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class MapMaker {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int UNSET_INT = -1;

    @javax.annotation.CheckForNull
    com.google.common.base.Equivalence<java.lang.Object> keyEquivalence;

    @javax.annotation.CheckForNull
    com.google.common.collect.MapMakerInternalMap.Strength keyStrength;
    boolean useCustomMap;

    @javax.annotation.CheckForNull
    com.google.common.collect.MapMakerInternalMap.Strength valueStrength;
    int initialCapacity = -1;
    int concurrencyLevel = -1;

    enum Dummy {
        VALUE
    }

    com.google.common.collect.MapMaker keyEquivalence(com.google.common.base.Equivalence<java.lang.Object> equivalence) {
        com.google.common.base.Equivalence<java.lang.Object> equivalence2 = this.keyEquivalence;
        com.google.common.base.Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.keyEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
        this.useCustomMap = true;
        return this;
    }

    com.google.common.base.Equivalence<java.lang.Object> getKeyEquivalence() {
        return (com.google.common.base.Equivalence) com.google.common.base.MoreObjects.firstNonNull(this.keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    public com.google.common.collect.MapMaker initialCapacity(int initialCapacity) {
        int i = this.initialCapacity;
        com.google.common.base.Preconditions.checkState(i == -1, "initial capacity was already set to %s", i);
        com.google.common.base.Preconditions.checkArgument(initialCapacity >= 0);
        this.initialCapacity = initialCapacity;
        return this;
    }

    int getInitialCapacity() {
        int i = this.initialCapacity;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public com.google.common.collect.MapMaker concurrencyLevel(int concurrencyLevel) {
        int i = this.concurrencyLevel;
        com.google.common.base.Preconditions.checkState(i == -1, "concurrency level was already set to %s", i);
        com.google.common.base.Preconditions.checkArgument(concurrencyLevel > 0);
        this.concurrencyLevel = concurrencyLevel;
        return this;
    }

    int getConcurrencyLevel() {
        int i = this.concurrencyLevel;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public com.google.common.collect.MapMaker weakKeys() {
        return setKeyStrength(com.google.common.collect.MapMakerInternalMap.Strength.WEAK);
    }

    com.google.common.collect.MapMaker setKeyStrength(com.google.common.collect.MapMakerInternalMap.Strength strength) {
        com.google.common.collect.MapMakerInternalMap.Strength strength2 = this.keyStrength;
        com.google.common.base.Preconditions.checkState(strength2 == null, "Key strength was already set to %s", strength2);
        this.keyStrength = (com.google.common.collect.MapMakerInternalMap.Strength) com.google.common.base.Preconditions.checkNotNull(strength);
        if (strength != com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    com.google.common.collect.MapMakerInternalMap.Strength getKeyStrength() {
        return (com.google.common.collect.MapMakerInternalMap.Strength) com.google.common.base.MoreObjects.firstNonNull(this.keyStrength, com.google.common.collect.MapMakerInternalMap.Strength.STRONG);
    }

    public com.google.common.collect.MapMaker weakValues() {
        return setValueStrength(com.google.common.collect.MapMakerInternalMap.Strength.WEAK);
    }

    com.google.common.collect.MapMaker setValueStrength(com.google.common.collect.MapMakerInternalMap.Strength strength) {
        com.google.common.collect.MapMakerInternalMap.Strength strength2 = this.valueStrength;
        com.google.common.base.Preconditions.checkState(strength2 == null, "Value strength was already set to %s", strength2);
        this.valueStrength = (com.google.common.collect.MapMakerInternalMap.Strength) com.google.common.base.Preconditions.checkNotNull(strength);
        if (strength != com.google.common.collect.MapMakerInternalMap.Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    com.google.common.collect.MapMakerInternalMap.Strength getValueStrength() {
        return (com.google.common.collect.MapMakerInternalMap.Strength) com.google.common.base.MoreObjects.firstNonNull(this.valueStrength, com.google.common.collect.MapMakerInternalMap.Strength.STRONG);
    }

    public <K, V> java.util.concurrent.ConcurrentMap<K, V> makeMap() {
        if (!this.useCustomMap) {
            return new java.util.concurrent.ConcurrentHashMap(getInitialCapacity(), 0.75f, getConcurrencyLevel());
        }
        return com.google.common.collect.MapMakerInternalMap.create(this);
    }

    public java.lang.String toString() {
        com.google.common.base.MoreObjects.ToStringHelper stringHelper = com.google.common.base.MoreObjects.toStringHelper(this);
        int i = this.initialCapacity;
        if (i != -1) {
            stringHelper.add("initialCapacity", i);
        }
        int i2 = this.concurrencyLevel;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", i2);
        }
        com.google.common.collect.MapMakerInternalMap.Strength strength = this.keyStrength;
        if (strength != null) {
            stringHelper.add("keyStrength", com.google.common.base.Ascii.toLowerCase(strength.toString()));
        }
        com.google.common.collect.MapMakerInternalMap.Strength strength2 = this.valueStrength;
        if (strength2 != null) {
            stringHelper.add("valueStrength", com.google.common.base.Ascii.toLowerCase(strength2.toString()));
        }
        if (this.keyEquivalence != null) {
            stringHelper.addValue("keyEquivalence");
        }
        return stringHelper.toString();
    }
}
