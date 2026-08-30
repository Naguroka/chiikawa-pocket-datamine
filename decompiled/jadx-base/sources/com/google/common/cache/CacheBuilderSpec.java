package com.google.common.cache;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
public final class CacheBuilderSpec {
    private static final com.google.common.base.Splitter KEYS_SPLITTER = com.google.common.base.Splitter.on(',').trimResults();
    private static final com.google.common.base.Splitter KEY_VALUE_SPLITTER = com.google.common.base.Splitter.on('=').trimResults();
    private static final com.google.common.collect.ImmutableMap<java.lang.String, com.google.common.cache.CacheBuilderSpec.ValueParser> VALUE_PARSERS = com.google.common.collect.ImmutableMap.builder().put("initialCapacity", new com.google.common.cache.CacheBuilderSpec.InitialCapacityParser()).put("maximumSize", new com.google.common.cache.CacheBuilderSpec.MaximumSizeParser()).put("maximumWeight", new com.google.common.cache.CacheBuilderSpec.MaximumWeightParser()).put("concurrencyLevel", new com.google.common.cache.CacheBuilderSpec.ConcurrencyLevelParser()).put("weakKeys", new com.google.common.cache.CacheBuilderSpec.KeyStrengthParser(com.google.common.cache.LocalCache.Strength.WEAK)).put("softValues", new com.google.common.cache.CacheBuilderSpec.ValueStrengthParser(com.google.common.cache.LocalCache.Strength.SOFT)).put("weakValues", new com.google.common.cache.CacheBuilderSpec.ValueStrengthParser(com.google.common.cache.LocalCache.Strength.WEAK)).put("recordStats", new com.google.common.cache.CacheBuilderSpec.RecordStatsParser()).put("expireAfterAccess", new com.google.common.cache.CacheBuilderSpec.AccessDurationParser()).put("expireAfterWrite", new com.google.common.cache.CacheBuilderSpec.WriteDurationParser()).put("refreshAfterWrite", new com.google.common.cache.CacheBuilderSpec.RefreshDurationParser()).put("refreshInterval", new com.google.common.cache.CacheBuilderSpec.RefreshDurationParser()).buildOrThrow();
    long accessExpirationDuration;

    @javax.annotation.CheckForNull
    java.util.concurrent.TimeUnit accessExpirationTimeUnit;

    @javax.annotation.CheckForNull
    java.lang.Integer concurrencyLevel;

    @javax.annotation.CheckForNull
    java.lang.Integer initialCapacity;

    @javax.annotation.CheckForNull
    com.google.common.cache.LocalCache.Strength keyStrength;

    @javax.annotation.CheckForNull
    java.lang.Long maximumSize;

    @javax.annotation.CheckForNull
    java.lang.Long maximumWeight;

    @javax.annotation.CheckForNull
    java.lang.Boolean recordStats;
    long refreshDuration;

    @javax.annotation.CheckForNull
    java.util.concurrent.TimeUnit refreshTimeUnit;
    private final java.lang.String specification;

    @javax.annotation.CheckForNull
    com.google.common.cache.LocalCache.Strength valueStrength;
    long writeExpirationDuration;

    @javax.annotation.CheckForNull
    java.util.concurrent.TimeUnit writeExpirationTimeUnit;

    private interface ValueParser {
        void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, @javax.annotation.CheckForNull java.lang.String value);
    }

    private CacheBuilderSpec(java.lang.String specification) {
        this.specification = specification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String cacheBuilderSpecification) {
        com.google.common.cache.CacheBuilderSpec cacheBuilderSpec = new com.google.common.cache.CacheBuilderSpec(cacheBuilderSpecification);
        if (!cacheBuilderSpecification.isEmpty()) {
            for (java.lang.String str : KEYS_SPLITTER.split(cacheBuilderSpecification)) {
                com.google.common.collect.ImmutableList immutableListCopyOf = com.google.common.collect.ImmutableList.copyOf(KEY_VALUE_SPLITTER.split(str));
                com.google.common.base.Preconditions.checkArgument(!immutableListCopyOf.isEmpty(), "blank key-value pair");
                com.google.common.base.Preconditions.checkArgument(immutableListCopyOf.size() <= 2, "key-value pair %s with more than one equals sign", str);
                java.lang.String str2 = (java.lang.String) immutableListCopyOf.get(0);
                com.google.common.cache.CacheBuilderSpec.ValueParser valueParser = VALUE_PARSERS.get(str2);
                com.google.common.base.Preconditions.checkArgument(valueParser != null, "unknown key %s", str2);
                valueParser.parse(cacheBuilderSpec, str2, immutableListCopyOf.size() == 1 ? null : (java.lang.String) immutableListCopyOf.get(1));
            }
        }
        return cacheBuilderSpec;
    }

    public static com.google.common.cache.CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> toCacheBuilder() {
        com.google.common.cache.CacheBuilder<java.lang.Object, java.lang.Object> cacheBuilderNewBuilder = com.google.common.cache.CacheBuilder.newBuilder();
        java.lang.Integer num = this.initialCapacity;
        if (num != null) {
            cacheBuilderNewBuilder.initialCapacity(num.intValue());
        }
        java.lang.Long l = this.maximumSize;
        if (l != null) {
            cacheBuilderNewBuilder.maximumSize(l.longValue());
        }
        java.lang.Long l2 = this.maximumWeight;
        if (l2 != null) {
            cacheBuilderNewBuilder.maximumWeight(l2.longValue());
        }
        java.lang.Integer num2 = this.concurrencyLevel;
        if (num2 != null) {
            cacheBuilderNewBuilder.concurrencyLevel(num2.intValue());
        }
        if (this.keyStrength != null) {
            if (com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength[this.keyStrength.ordinal()] == 1) {
                cacheBuilderNewBuilder.weakKeys();
            } else {
                throw new java.lang.AssertionError();
            }
        }
        if (this.valueStrength != null) {
            int i = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength[this.valueStrength.ordinal()];
            if (i == 1) {
                cacheBuilderNewBuilder.weakValues();
            } else if (i == 2) {
                cacheBuilderNewBuilder.softValues();
            } else {
                throw new java.lang.AssertionError();
            }
        }
        java.lang.Boolean bool = this.recordStats;
        if (bool != null && bool.booleanValue()) {
            cacheBuilderNewBuilder.recordStats();
        }
        java.util.concurrent.TimeUnit timeUnit = this.writeExpirationTimeUnit;
        if (timeUnit != null) {
            cacheBuilderNewBuilder.expireAfterWrite(this.writeExpirationDuration, timeUnit);
        }
        java.util.concurrent.TimeUnit timeUnit2 = this.accessExpirationTimeUnit;
        if (timeUnit2 != null) {
            cacheBuilderNewBuilder.expireAfterAccess(this.accessExpirationDuration, timeUnit2);
        }
        java.util.concurrent.TimeUnit timeUnit3 = this.refreshTimeUnit;
        if (timeUnit3 != null) {
            cacheBuilderNewBuilder.refreshAfterWrite(this.refreshDuration, timeUnit3);
        }
        return cacheBuilderNewBuilder;
    }

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength;

        static {
            int[] iArr = new int[com.google.common.cache.LocalCache.Strength.values().length];
            $SwitchMap$com$google$common$cache$LocalCache$Strength = iArr;
            try {
                iArr[com.google.common.cache.LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$cache$LocalCache$Strength[com.google.common.cache.LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public java.lang.String toParsableString() {
        return this.specification;
    }

    public java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.initialCapacity, this.maximumSize, this.maximumWeight, this.concurrencyLevel, this.keyStrength, this.valueStrength, this.recordStats, durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(this.refreshDuration, this.refreshTimeUnit));
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.common.cache.CacheBuilderSpec)) {
            return false;
        }
        com.google.common.cache.CacheBuilderSpec cacheBuilderSpec = (com.google.common.cache.CacheBuilderSpec) obj;
        return com.google.common.base.Objects.equal(this.initialCapacity, cacheBuilderSpec.initialCapacity) && com.google.common.base.Objects.equal(this.maximumSize, cacheBuilderSpec.maximumSize) && com.google.common.base.Objects.equal(this.maximumWeight, cacheBuilderSpec.maximumWeight) && com.google.common.base.Objects.equal(this.concurrencyLevel, cacheBuilderSpec.concurrencyLevel) && com.google.common.base.Objects.equal(this.keyStrength, cacheBuilderSpec.keyStrength) && com.google.common.base.Objects.equal(this.valueStrength, cacheBuilderSpec.valueStrength) && com.google.common.base.Objects.equal(this.recordStats, cacheBuilderSpec.recordStats) && com.google.common.base.Objects.equal(durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(cacheBuilderSpec.writeExpirationDuration, cacheBuilderSpec.writeExpirationTimeUnit)) && com.google.common.base.Objects.equal(durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(cacheBuilderSpec.accessExpirationDuration, cacheBuilderSpec.accessExpirationTimeUnit)) && com.google.common.base.Objects.equal(durationInNanos(this.refreshDuration, this.refreshTimeUnit), durationInNanos(cacheBuilderSpec.refreshDuration, cacheBuilderSpec.refreshTimeUnit));
    }

    @javax.annotation.CheckForNull
    private static java.lang.Long durationInNanos(long duration, @javax.annotation.CheckForNull java.util.concurrent.TimeUnit unit) {
        if (unit == null) {
            return null;
        }
        return java.lang.Long.valueOf(unit.toNanos(duration));
    }

    static abstract class IntegerParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        protected abstract void parseInteger(com.google.common.cache.CacheBuilderSpec spec, int value);

        IntegerParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, java.lang.String value) {
            if (com.google.common.base.Strings.isNullOrEmpty(value)) {
                throw new java.lang.IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                parseInteger(spec, java.lang.Integer.parseInt(value));
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value), e);
            }
        }
    }

    static abstract class LongParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        protected abstract void parseLong(com.google.common.cache.CacheBuilderSpec spec, long value);

        LongParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, java.lang.String value) {
            if (com.google.common.base.Strings.isNullOrEmpty(value)) {
                throw new java.lang.IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                parseLong(spec, java.lang.Long.parseLong(value));
            } catch (java.lang.NumberFormatException e) {
                throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value), e);
            }
        }
    }

    static class InitialCapacityParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        InitialCapacityParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(com.google.common.cache.CacheBuilderSpec spec, int value) {
            com.google.common.base.Preconditions.checkArgument(spec.initialCapacity == null, "initial capacity was already set to %s", spec.initialCapacity);
            spec.initialCapacity = java.lang.Integer.valueOf(value);
        }
    }

    static class MaximumSizeParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        MaximumSizeParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(com.google.common.cache.CacheBuilderSpec spec, long value) {
            com.google.common.base.Preconditions.checkArgument(spec.maximumSize == null, "maximum size was already set to %s", spec.maximumSize);
            com.google.common.base.Preconditions.checkArgument(spec.maximumWeight == null, "maximum weight was already set to %s", spec.maximumWeight);
            spec.maximumSize = java.lang.Long.valueOf(value);
        }
    }

    static class MaximumWeightParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        MaximumWeightParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        protected void parseLong(com.google.common.cache.CacheBuilderSpec spec, long value) {
            com.google.common.base.Preconditions.checkArgument(spec.maximumWeight == null, "maximum weight was already set to %s", spec.maximumWeight);
            com.google.common.base.Preconditions.checkArgument(spec.maximumSize == null, "maximum size was already set to %s", spec.maximumSize);
            spec.maximumWeight = java.lang.Long.valueOf(value);
        }
    }

    static class ConcurrencyLevelParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        ConcurrencyLevelParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        protected void parseInteger(com.google.common.cache.CacheBuilderSpec spec, int value) {
            com.google.common.base.Preconditions.checkArgument(spec.concurrencyLevel == null, "concurrency level was already set to %s", spec.concurrencyLevel);
            spec.concurrencyLevel = java.lang.Integer.valueOf(value);
        }
    }

    static class KeyStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public KeyStrengthParser(com.google.common.cache.LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, @javax.annotation.CheckForNull java.lang.String value) {
            com.google.common.base.Preconditions.checkArgument(value == null, "key %s does not take values", key);
            com.google.common.base.Preconditions.checkArgument(spec.keyStrength == null, "%s was already set to %s", key, spec.keyStrength);
            spec.keyStrength = this.strength;
        }
    }

    static class ValueStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public ValueStrengthParser(com.google.common.cache.LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, @javax.annotation.CheckForNull java.lang.String value) {
            com.google.common.base.Preconditions.checkArgument(value == null, "key %s does not take values", key);
            com.google.common.base.Preconditions.checkArgument(spec.valueStrength == null, "%s was already set to %s", key, spec.valueStrength);
            spec.valueStrength = this.strength;
        }
    }

    static class RecordStatsParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        RecordStatsParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, @javax.annotation.CheckForNull java.lang.String value) {
            com.google.common.base.Preconditions.checkArgument(value == null, "recordStats does not take values");
            com.google.common.base.Preconditions.checkArgument(spec.recordStats == null, "recordStats already set");
            spec.recordStats = true;
        }
    }

    static abstract class DurationParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        protected abstract void parseDuration(com.google.common.cache.CacheBuilderSpec spec, long duration, java.util.concurrent.TimeUnit unit);

        DurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec spec, java.lang.String key, @javax.annotation.CheckForNull java.lang.String value) {
            java.util.concurrent.TimeUnit timeUnit;
            if (com.google.common.base.Strings.isNullOrEmpty(value)) {
                throw new java.lang.IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                char cCharAt = value.charAt(value.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = java.util.concurrent.TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = java.util.concurrent.TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = java.util.concurrent.TimeUnit.MINUTES;
                } else if (cCharAt == 's') {
                    timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                } else {
                    throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s invalid unit: was %s, must end with one of [dhms]", key, value));
                }
                parseDuration(spec, java.lang.Long.parseLong(value.substring(0, value.length() - 1)), timeUnit);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.lang.IllegalArgumentException(com.google.common.cache.CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value));
            }
        }
    }

    static class AccessDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        AccessDurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(com.google.common.cache.CacheBuilderSpec spec, long duration, java.util.concurrent.TimeUnit unit) {
            com.google.common.base.Preconditions.checkArgument(spec.accessExpirationTimeUnit == null, "expireAfterAccess already set");
            spec.accessExpirationDuration = duration;
            spec.accessExpirationTimeUnit = unit;
        }
    }

    static class WriteDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        WriteDurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(com.google.common.cache.CacheBuilderSpec spec, long duration, java.util.concurrent.TimeUnit unit) {
            com.google.common.base.Preconditions.checkArgument(spec.writeExpirationTimeUnit == null, "expireAfterWrite already set");
            spec.writeExpirationDuration = duration;
            spec.writeExpirationTimeUnit = unit;
        }
    }

    static class RefreshDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        RefreshDurationParser() {
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        protected void parseDuration(com.google.common.cache.CacheBuilderSpec spec, long duration, java.util.concurrent.TimeUnit unit) {
            com.google.common.base.Preconditions.checkArgument(spec.refreshTimeUnit == null, "refreshAfterWrite already set");
            spec.refreshDuration = duration;
            spec.refreshTimeUnit = unit;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String format(java.lang.String format, java.lang.Object... args) {
        return java.lang.String.format(java.util.Locale.ROOT, format, args);
    }
}
