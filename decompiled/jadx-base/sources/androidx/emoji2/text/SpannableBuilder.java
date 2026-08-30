package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableBuilder extends android.text.SpannableStringBuilder {
    private final java.lang.Class<?> mWatcherClass;
    private final java.util.List<androidx.emoji2.text.SpannableBuilder.WatcherWrapper> mWatchers;

    SpannableBuilder(java.lang.Class<?> cls) {
        this.mWatchers = new java.util.ArrayList();
        androidx.core.util.Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    SpannableBuilder(java.lang.Class<?> cls, java.lang.CharSequence charSequence) {
        super(charSequence);
        this.mWatchers = new java.util.ArrayList();
        androidx.core.util.Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    SpannableBuilder(java.lang.Class<?> cls, java.lang.CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.mWatchers = new java.util.ArrayList();
        androidx.core.util.Preconditions.checkNotNull(cls, "watcherClass cannot be null");
        this.mWatcherClass = cls;
    }

    public static androidx.emoji2.text.SpannableBuilder create(java.lang.Class<?> cls, java.lang.CharSequence charSequence) {
        return new androidx.emoji2.text.SpannableBuilder(cls, charSequence);
    }

    private boolean isWatcher(java.lang.Object obj) {
        return obj != null && isWatcher(obj.getClass());
    }

    private boolean isWatcher(java.lang.Class<?> cls) {
        return this.mWatcherClass == cls;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public java.lang.CharSequence subSequence(int i, int i2) {
        return new androidx.emoji2.text.SpannableBuilder(this.mWatcherClass, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(java.lang.Object obj, int i, int i2, int i3) {
        if (isWatcher(obj)) {
            androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherWrapper = new androidx.emoji2.text.SpannableBuilder.WatcherWrapper(obj);
            this.mWatchers.add(watcherWrapper);
            obj = watcherWrapper;
        }
        super.setSpan(obj, i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i, int i2, java.lang.Class<T> cls) {
        if (isWatcher((java.lang.Class<?>) cls)) {
            androidx.emoji2.text.SpannableBuilder.WatcherWrapper[] watcherWrapperArr = (androidx.emoji2.text.SpannableBuilder.WatcherWrapper[]) super.getSpans(i, i2, androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class);
            T[] tArr = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, watcherWrapperArr.length));
            for (int i3 = 0; i3 < watcherWrapperArr.length; i3++) {
                tArr[i3] = watcherWrapperArr[i3].mObject;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherFor;
        if (isWatcher(obj)) {
            watcherFor = getWatcherFor(obj);
            if (watcherFor != null) {
                obj = watcherFor;
            }
        } else {
            watcherFor = null;
        }
        super.removeSpan(obj);
        if (watcherFor != null) {
            this.mWatchers.remove(watcherFor);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(java.lang.Object obj) {
        androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherFor;
        if (isWatcher(obj) && (watcherFor = getWatcherFor(obj)) != null) {
            obj = watcherFor;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, java.lang.Class cls) {
        if (cls == null || isWatcher((java.lang.Class<?>) cls)) {
            cls = androidx.emoji2.text.SpannableBuilder.WatcherWrapper.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    private androidx.emoji2.text.SpannableBuilder.WatcherWrapper getWatcherFor(java.lang.Object obj) {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            androidx.emoji2.text.SpannableBuilder.WatcherWrapper watcherWrapper = this.mWatchers.get(i);
            if (watcherWrapper.mObject == obj) {
                return watcherWrapper;
            }
        }
        return null;
    }

    public void beginBatchEdit() {
        blockWatchers();
    }

    public void endBatchEdit() {
        unblockwatchers();
        fireWatchers();
    }

    private void blockWatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).blockCalls();
        }
    }

    private void unblockwatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).unblockCalls();
        }
    }

    private void fireWatchers() {
        for (int i = 0; i < this.mWatchers.size(); i++) {
            this.mWatchers.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence) {
        blockWatchers();
        super.replace(i, i2, charSequence);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder replace(int i, int i2, java.lang.CharSequence charSequence, int i3, int i4) {
        blockWatchers();
        super.replace(i, i2, charSequence, i3, i4);
        unblockwatchers();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder insert(int i, java.lang.CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public android.text.SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public android.text.SpannableStringBuilder append(java.lang.CharSequence charSequence, java.lang.Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    private static class WatcherWrapper implements android.text.TextWatcher, android.text.SpanWatcher {
        private final java.util.concurrent.atomic.AtomicInteger mBlockCalls = new java.util.concurrent.atomic.AtomicInteger(0);
        final java.lang.Object mObject;

        WatcherWrapper(java.lang.Object obj) {
            this.mObject = obj;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            ((android.text.TextWatcher) this.mObject).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
            ((android.text.TextWatcher) this.mObject).onTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            ((android.text.TextWatcher) this.mObject).afterTextChanged(editable);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((android.text.SpanWatcher) this.mObject).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(android.text.Spannable spannable, java.lang.Object obj, int i, int i2) {
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                ((android.text.SpanWatcher) this.mObject).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        public void onSpanChanged(android.text.Spannable spannable, java.lang.Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.mBlockCalls.get() <= 0 || !isEmojiSpan(obj)) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    } else {
                        i5 = i;
                        i6 = i3;
                    }
                }
                ((android.text.SpanWatcher) this.mObject).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        final void blockCalls() {
            this.mBlockCalls.incrementAndGet();
        }

        final void unblockCalls() {
            this.mBlockCalls.decrementAndGet();
        }

        private boolean isEmojiSpan(java.lang.Object obj) {
            return obj instanceof androidx.emoji2.text.EmojiSpan;
        }
    }
}
