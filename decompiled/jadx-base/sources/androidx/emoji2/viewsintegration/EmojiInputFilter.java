package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiInputFilter implements android.text.InputFilter {
    private androidx.emoji2.text.EmojiCompat.InitCallback mInitCallback;
    private final android.widget.TextView mTextView;

    EmojiInputFilter(android.widget.TextView textView) {
        this.mTextView = textView;
    }

    @Override // android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i, int i2, android.text.Spanned spanned, int i3, int i4) {
        if (this.mTextView.isInEditMode()) {
            return charSequence;
        }
        int loadState = androidx.emoji2.text.EmojiCompat.get().getLoadState();
        if (loadState != 0) {
            boolean z = true;
            if (loadState == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.mTextView.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return androidx.emoji2.text.EmojiCompat.get().process(charSequence, 0, charSequence.length());
            }
            if (loadState != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.EmojiCompat.get().registerInitCallback(getInitCallback());
        return charSequence;
    }

    private androidx.emoji2.text.EmojiCompat.InitCallback getInitCallback() {
        if (this.mInitCallback == null) {
            this.mInitCallback = new androidx.emoji2.viewsintegration.EmojiInputFilter.InitCallbackImpl(this.mTextView, this);
        }
        return this.mInitCallback;
    }

    private static class InitCallbackImpl extends androidx.emoji2.text.EmojiCompat.InitCallback {
        private final java.lang.ref.Reference<androidx.emoji2.viewsintegration.EmojiInputFilter> mEmojiInputFilterReference;
        private final java.lang.ref.Reference<android.widget.TextView> mViewRef;

        InitCallbackImpl(android.widget.TextView textView, androidx.emoji2.viewsintegration.EmojiInputFilter emojiInputFilter) {
            this.mViewRef = new java.lang.ref.WeakReference(textView);
            this.mEmojiInputFilterReference = new java.lang.ref.WeakReference(emojiInputFilter);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public void onInitialized() {
            java.lang.CharSequence text;
            java.lang.CharSequence charSequenceProcess;
            super.onInitialized();
            android.widget.TextView textView = this.mViewRef.get();
            if (isInputFilterCurrentlyRegisteredOnTextView(textView, this.mEmojiInputFilterReference.get()) && textView.isAttachedToWindow() && text != (charSequenceProcess = androidx.emoji2.text.EmojiCompat.get().process((text = textView.getText())))) {
                int selectionStart = android.text.Selection.getSelectionStart(charSequenceProcess);
                int selectionEnd = android.text.Selection.getSelectionEnd(charSequenceProcess);
                textView.setText(charSequenceProcess);
                if (charSequenceProcess instanceof android.text.Spannable) {
                    androidx.emoji2.viewsintegration.EmojiInputFilter.updateSelection((android.text.Spannable) charSequenceProcess, selectionStart, selectionEnd);
                }
            }
        }

        private boolean isInputFilterCurrentlyRegisteredOnTextView(android.widget.TextView textView, android.text.InputFilter inputFilter) {
            android.text.InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (android.text.InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    static void updateSelection(android.text.Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            android.text.Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            android.text.Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            android.text.Selection.setSelection(spannable, i2);
        }
    }
}
