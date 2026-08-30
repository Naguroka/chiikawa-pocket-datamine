package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiTextWatcher implements android.text.TextWatcher {
    private final android.widget.EditText mEditText;
    private final boolean mExpectInitializedEmojiCompat;
    private androidx.emoji2.text.EmojiCompat.InitCallback mInitCallback;
    private int mMaxEmojiCount = Integer.MAX_VALUE;
    private int mEmojiReplaceStrategy = 0;
    private boolean mEnabled = true;

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
    }

    EmojiTextWatcher(android.widget.EditText editText, boolean z) {
        this.mEditText = editText;
        this.mExpectInitializedEmojiCompat = z;
    }

    void setMaxEmojiCount(int i) {
        this.mMaxEmojiCount = i;
    }

    int getMaxEmojiCount() {
        return this.mMaxEmojiCount;
    }

    int getEmojiReplaceStrategy() {
        return this.mEmojiReplaceStrategy;
    }

    void setEmojiReplaceStrategy(int i) {
        this.mEmojiReplaceStrategy = i;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        if (this.mEditText.isInEditMode() || shouldSkipForDisabledOrNotConfigured() || i2 > i3 || !(charSequence instanceof android.text.Spannable)) {
            return;
        }
        int loadState = androidx.emoji2.text.EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            if (loadState == 1) {
                androidx.emoji2.text.EmojiCompat.get().process((android.text.Spannable) charSequence, i, i + i3, this.mMaxEmojiCount, this.mEmojiReplaceStrategy);
                return;
            } else if (loadState != 3) {
                return;
            }
        }
        androidx.emoji2.text.EmojiCompat.get().registerInitCallback(getInitCallback());
    }

    private boolean shouldSkipForDisabledOrNotConfigured() {
        return (this.mEnabled && (this.mExpectInitializedEmojiCompat || androidx.emoji2.text.EmojiCompat.isConfigured())) ? false : true;
    }

    private androidx.emoji2.text.EmojiCompat.InitCallback getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new androidx.emoji2.viewsintegration.EmojiTextWatcher.InitCallbackImpl(this.mEditText);
        }
        return this.mInitCallback;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void setEnabled(boolean z) {
        if (this.mEnabled != z) {
            if (this.mInitCallback != null) {
                androidx.emoji2.text.EmojiCompat.get().unregisterInitCallback(this.mInitCallback);
            }
            this.mEnabled = z;
            if (z) {
                processTextOnEnablingEvent(this.mEditText, androidx.emoji2.text.EmojiCompat.get().getLoadState());
            }
        }
    }

    private static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<android.widget.EditText> mViewRef;

        InitCallbackImpl(android.widget.EditText editText) {
            this.mViewRef = new java.lang.ref.WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            super.onInitialized();
            androidx.emoji2.viewsintegration.EmojiTextWatcher.processTextOnEnablingEvent(this.mViewRef.get(), 1);
        }
    }

    static void processTextOnEnablingEvent(android.widget.EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            android.text.Editable editableText = editText.getEditableText();
            int selectionStart = android.text.Selection.getSelectionStart(editableText);
            int selectionEnd = android.text.Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.EmojiCompat.get().process(editableText);
            androidx.emoji2.viewsintegration.EmojiInputFilter.updateSelection(editableText, selectionStart, selectionEnd);
        }
    }
}
