package kotlin.text;

/* JADX INFO: compiled from: Strings.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DelimitedRangesSequence implements kotlin.sequences.Sequence<kotlin.ranges.IntRange> {
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> getNextMatch;
    private final java.lang.CharSequence input;
    private final int limit;
    private final int startIndex;

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(java.lang.CharSequence input, int i, int i2, kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> getNextMatch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.input = input;
        this.startIndex = i;
        this.limit = i2;
        this.getNextMatch = getNextMatch;
    }

    /* JADX INFO: renamed from: kotlin.text.DelimitedRangesSequence$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Strings.kt */
    @kotlin.Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<kotlin.ranges.IntRange>, kotlin.jvm.internal.markers.KMappedMarker {
        private int counter;
        private int currentStartIndex;
        private kotlin.ranges.IntRange nextItem;
        private int nextSearchIndex;
        private int nextState = -1;

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        AnonymousClass1() {
            int iCoerceIn = kotlin.ranges.RangesKt.coerceIn(kotlin.text.DelimitedRangesSequence.this.startIndex, 0, kotlin.text.DelimitedRangesSequence.this.input.length());
            this.currentStartIndex = iCoerceIn;
            this.nextSearchIndex = iCoerceIn;
        }

        public final int getNextState() {
            return this.nextState;
        }

        public final void setNextState(int i) {
            this.nextState = i;
        }

        public final int getCurrentStartIndex() {
            return this.currentStartIndex;
        }

        public final void setCurrentStartIndex(int i) {
            this.currentStartIndex = i;
        }

        public final int getNextSearchIndex() {
            return this.nextSearchIndex;
        }

        public final void setNextSearchIndex(int i) {
            this.nextSearchIndex = i;
        }

        public final kotlin.ranges.IntRange getNextItem() {
            return this.nextItem;
        }

        public final void setNextItem(kotlin.ranges.IntRange intRange) {
            this.nextItem = intRange;
        }

        public final int getCounter() {
            return this.counter;
        }

        public final void setCounter(int i) {
            this.counter = i;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:17:0x0098  */
        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        private final void calcNext() {
            kotlin.Pair pair;
            if (this.nextSearchIndex >= 0) {
                if (kotlin.text.DelimitedRangesSequence.this.limit > 0) {
                    int i = this.counter + 1;
                    this.counter = i;
                    if (i < kotlin.text.DelimitedRangesSequence.this.limit) {
                        if (this.nextSearchIndex <= kotlin.text.DelimitedRangesSequence.this.input.length() || (pair = (kotlin.Pair) kotlin.text.DelimitedRangesSequence.this.getNextMatch.invoke(kotlin.text.DelimitedRangesSequence.this.input, java.lang.Integer.valueOf(this.nextSearchIndex))) == null) {
                            this.nextItem = new kotlin.ranges.IntRange(this.currentStartIndex, kotlin.text.StringsKt.getLastIndex(kotlin.text.DelimitedRangesSequence.this.input));
                            this.nextSearchIndex = -1;
                        } else {
                            int iIntValue = ((java.lang.Number) pair.component1()).intValue();
                            int iIntValue2 = ((java.lang.Number) pair.component2()).intValue();
                            this.nextItem = kotlin.ranges.RangesKt.until(this.currentStartIndex, iIntValue);
                            int i2 = iIntValue + iIntValue2;
                            this.currentStartIndex = i2;
                            this.nextSearchIndex = i2 + (iIntValue2 == 0 ? 1 : 0);
                        }
                    } else {
                        this.nextItem = new kotlin.ranges.IntRange(this.currentStartIndex, kotlin.text.StringsKt.getLastIndex(kotlin.text.DelimitedRangesSequence.this.input));
                        this.nextSearchIndex = -1;
                    }
                } else if (this.nextSearchIndex <= kotlin.text.DelimitedRangesSequence.this.input.length()) {
                    this.nextItem = new kotlin.ranges.IntRange(this.currentStartIndex, kotlin.text.StringsKt.getLastIndex(kotlin.text.DelimitedRangesSequence.this.input));
                    this.nextSearchIndex = -1;
                } else {
                    int iIntValue3 = ((java.lang.Number) pair.component1()).intValue();
                    int iIntValue4 = ((java.lang.Number) pair.component2()).intValue();
                    this.nextItem = kotlin.ranges.RangesKt.until(this.currentStartIndex, iIntValue3);
                    int i3 = iIntValue3 + iIntValue4;
                    this.currentStartIndex = i3;
                    this.nextSearchIndex = i3 + (iIntValue4 == 0 ? 1 : 0);
                }
                this.nextState = 1;
                return;
            }
            this.nextState = 0;
            this.nextItem = null;
        }

        @Override // java.util.Iterator
        public kotlin.ranges.IntRange next() {
            if (this.nextState == -1) {
                calcNext();
            }
            if (this.nextState == 0) {
                throw new java.util.NoSuchElementException();
            }
            kotlin.ranges.IntRange intRange = this.nextItem;
            kotlin.jvm.internal.Intrinsics.checkNotNull(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.nextItem = null;
            this.nextState = -1;
            return intRange;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextState == -1) {
                calcNext();
            }
            return this.nextState == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<kotlin.ranges.IntRange> iterator() {
        return new kotlin.text.DelimitedRangesSequence.AnonymousClass1();
    }
}
