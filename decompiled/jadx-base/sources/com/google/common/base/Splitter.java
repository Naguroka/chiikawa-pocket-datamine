package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final com.google.common.base.Splitter.Strategy strategy;
    private final com.google.common.base.CharMatcher trimmer;

    private interface Strategy {
        java.util.Iterator<java.lang.String> iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence toSplit);
    }

    private Splitter(com.google.common.base.Splitter.Strategy strategy) {
        this(strategy, false, com.google.common.base.CharMatcher.none(), Integer.MAX_VALUE);
    }

    private Splitter(com.google.common.base.Splitter.Strategy strategy, boolean omitEmptyStrings, com.google.common.base.CharMatcher trimmer, int limit) {
        this.strategy = strategy;
        this.omitEmptyStrings = omitEmptyStrings;
        this.trimmer = trimmer;
        this.limit = limit;
    }

    public static com.google.common.base.Splitter on(char separator) {
        return on(com.google.common.base.CharMatcher.is(separator));
    }

    public static com.google.common.base.Splitter on(final com.google.common.base.CharMatcher separatorMatcher) {
        com.google.common.base.Preconditions.checkNotNull(separatorMatcher);
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public com.google.common.base.Splitter.SplittingIterator iterator(com.google.common.base.Splitter splitter, final java.lang.CharSequence toSplit) {
                return new com.google.common.base.Splitter.SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.1.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorEnd(int separatorPosition) {
                        return separatorPosition + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorStart(int start) {
                        return separatorMatcher.indexIn(this.toSplit, start);
                    }
                };
            }
        });
    }

    public static com.google.common.base.Splitter on(final java.lang.String separator) {
        com.google.common.base.Preconditions.checkArgument(separator.length() != 0, "The separator may not be the empty string.");
        if (separator.length() == 1) {
            return on(separator.charAt(0));
        }
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public com.google.common.base.Splitter.SplittingIterator iterator(com.google.common.base.Splitter splitter, java.lang.CharSequence toSplit) {
                return new com.google.common.base.Splitter.SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.2.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        int length = separator.length();
                        int length2 = this.toSplit.length() - length;
                        while (start <= length2) {
                            for (int i = 0; i < length; i++) {
                                if (this.toSplit.charAt(i + start) != separator.charAt(i)) {
                                    start++;
                                }
                            }
                            return start;
                        }
                        return -1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition + separator.length();
                    }
                };
            }
        });
    }

    public static com.google.common.base.Splitter on(java.util.regex.Pattern separatorPattern) {
        return onPatternInternal(new com.google.common.base.JdkPattern(separatorPattern));
    }

    static com.google.common.base.Splitter onPatternInternal(final com.google.common.base.CommonPattern separatorPattern) {
        com.google.common.base.Preconditions.checkArgument(!separatorPattern.matcher("").matches(), "The pattern may not match the empty string: %s", separatorPattern);
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            public com.google.common.base.Splitter.SplittingIterator iterator(final com.google.common.base.Splitter splitter, java.lang.CharSequence toSplit) {
                final com.google.common.base.CommonMatcher commonMatcherMatcher = separatorPattern.matcher(toSplit);
                return new com.google.common.base.Splitter.SplittingIterator(this, splitter, toSplit) { // from class: com.google.common.base.Splitter.3.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        if (commonMatcherMatcher.find(start)) {
                            return commonMatcherMatcher.start();
                        }
                        return -1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return commonMatcherMatcher.end();
                    }
                };
            }
        });
    }

    public static com.google.common.base.Splitter onPattern(java.lang.String separatorPattern) {
        return onPatternInternal(com.google.common.base.Platform.compilePattern(separatorPattern));
    }

    public static com.google.common.base.Splitter fixedLength(final int length) {
        com.google.common.base.Preconditions.checkArgument(length > 0, "The length may not be less than 1");
        return new com.google.common.base.Splitter(new com.google.common.base.Splitter.Strategy() { // from class: com.google.common.base.Splitter.4
            @Override // com.google.common.base.Splitter.Strategy
            public com.google.common.base.Splitter.SplittingIterator iterator(final com.google.common.base.Splitter splitter, java.lang.CharSequence toSplit) {
                return new com.google.common.base.Splitter.SplittingIterator(splitter, toSplit) { // from class: com.google.common.base.Splitter.4.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int separatorPosition) {
                        return separatorPosition;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int start) {
                        int i = start + length;
                        if (i < this.toSplit.length()) {
                            return i;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    public com.google.common.base.Splitter omitEmptyStrings() {
        return new com.google.common.base.Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public com.google.common.base.Splitter limit(int maxItems) {
        com.google.common.base.Preconditions.checkArgument(maxItems > 0, "must be greater than zero: %s", maxItems);
        return new com.google.common.base.Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, maxItems);
    }

    public com.google.common.base.Splitter trimResults() {
        return trimResults(com.google.common.base.CharMatcher.whitespace());
    }

    public com.google.common.base.Splitter trimResults(com.google.common.base.CharMatcher trimmer) {
        com.google.common.base.Preconditions.checkNotNull(trimmer);
        return new com.google.common.base.Splitter(this.strategy, this.omitEmptyStrings, trimmer, this.limit);
    }

    public java.lang.Iterable<java.lang.String> split(final java.lang.CharSequence sequence) {
        com.google.common.base.Preconditions.checkNotNull(sequence);
        return new java.lang.Iterable<java.lang.String>() { // from class: com.google.common.base.Splitter.5
            @Override // java.lang.Iterable
            public java.util.Iterator<java.lang.String> iterator() {
                return com.google.common.base.Splitter.this.splittingIterator(sequence);
            }

            public java.lang.String toString() {
                return com.google.common.base.Joiner.on(", ").appendTo(new java.lang.StringBuilder().append('['), (java.lang.Iterable<? extends java.lang.Object>) this).append(']').toString();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.util.Iterator<java.lang.String> splittingIterator(java.lang.CharSequence sequence) {
        return this.strategy.iterator(this, sequence);
    }

    public java.util.List<java.lang.String> splitToList(java.lang.CharSequence sequence) {
        com.google.common.base.Preconditions.checkNotNull(sequence);
        java.util.Iterator<java.lang.String> itSplittingIterator = splittingIterator(sequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (itSplittingIterator.hasNext()) {
            arrayList.add(itSplittingIterator.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    public com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(java.lang.String separator) {
        return withKeyValueSeparator(on(separator));
    }

    public com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(char separator) {
        return withKeyValueSeparator(on(separator));
    }

    public com.google.common.base.Splitter.MapSplitter withKeyValueSeparator(com.google.common.base.Splitter keyValueSplitter) {
        return new com.google.common.base.Splitter.MapSplitter(keyValueSplitter);
    }

    public static final class MapSplitter {
        private static final java.lang.String INVALID_ENTRY_MESSAGE = "Chunk [%s] is not a valid entry";
        private final com.google.common.base.Splitter entrySplitter;
        private final com.google.common.base.Splitter outerSplitter;

        private MapSplitter(com.google.common.base.Splitter outerSplitter, com.google.common.base.Splitter entrySplitter) {
            this.outerSplitter = outerSplitter;
            this.entrySplitter = (com.google.common.base.Splitter) com.google.common.base.Preconditions.checkNotNull(entrySplitter);
        }

        public java.util.Map<java.lang.String, java.lang.String> split(java.lang.CharSequence sequence) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.String str : this.outerSplitter.split(sequence)) {
                java.util.Iterator itSplittingIterator = this.entrySplitter.splittingIterator(str);
                com.google.common.base.Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                java.lang.String str2 = (java.lang.String) itSplittingIterator.next();
                com.google.common.base.Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                com.google.common.base.Preconditions.checkArgument(itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
                linkedHashMap.put(str2, (java.lang.String) itSplittingIterator.next());
                com.google.common.base.Preconditions.checkArgument(!itSplittingIterator.hasNext(), INVALID_ENTRY_MESSAGE, str);
            }
            return java.util.Collections.unmodifiableMap(linkedHashMap);
        }
    }

    private static abstract class SplittingIterator extends com.google.common.base.AbstractIterator<java.lang.String> {
        int limit;
        int offset = 0;
        final boolean omitEmptyStrings;
        final java.lang.CharSequence toSplit;
        final com.google.common.base.CharMatcher trimmer;

        abstract int separatorEnd(int separatorPosition);

        abstract int separatorStart(int start);

        protected SplittingIterator(com.google.common.base.Splitter splitter, java.lang.CharSequence toSplit) {
            this.trimmer = splitter.trimmer;
            this.omitEmptyStrings = splitter.omitEmptyStrings;
            this.limit = splitter.limit;
            this.toSplit = toSplit;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.AbstractIterator
        @javax.annotation.CheckForNull
        public java.lang.String computeNext() {
            int i = this.offset;
            while (true) {
                int i2 = this.offset;
                if (i2 != -1) {
                    int iSeparatorStart = separatorStart(i2);
                    if (iSeparatorStart == -1) {
                        iSeparatorStart = this.toSplit.length();
                        this.offset = -1;
                    } else {
                        this.offset = separatorEnd(iSeparatorStart);
                    }
                    int i3 = this.offset;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.offset = i4;
                        if (i4 > this.toSplit.length()) {
                            this.offset = -1;
                        }
                    } else {
                        while (i < iSeparatorStart && this.trimmer.matches(this.toSplit.charAt(i))) {
                            i++;
                        }
                        while (iSeparatorStart > i && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                            iSeparatorStart--;
                        }
                        if (this.omitEmptyStrings && i == iSeparatorStart) {
                            i = this.offset;
                        } else {
                            int i5 = this.limit;
                            if (i5 == 1) {
                                iSeparatorStart = this.toSplit.length();
                                this.offset = -1;
                                while (iSeparatorStart > i && this.trimmer.matches(this.toSplit.charAt(iSeparatorStart - 1))) {
                                    iSeparatorStart--;
                                }
                            } else {
                                this.limit = i5 - 1;
                            }
                            return this.toSplit.subSequence(i, iSeparatorStart).toString();
                        }
                    }
                } else {
                    return endOfData();
                }
            }
        }
    }
}
