package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiTextViewHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal mHelper;

    public EmojiTextViewHelper(android.widget.TextView textView) {
        this(textView, true);
    }

    public EmojiTextViewHelper(android.widget.TextView textView, boolean z) {
        androidx.core.util.Preconditions.checkNotNull(textView, "textView cannot be null");
        if (!z) {
            this.mHelper = new androidx.emoji2.viewsintegration.EmojiTextViewHelper.SkippingHelper19(textView);
        } else {
            this.mHelper = new androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19(textView);
        }
    }

    public void updateTransformationMethod() {
        this.mHelper.updateTransformationMethod();
    }

    public android.text.InputFilter[] getFilters(android.text.InputFilter[] inputFilterArr) {
        return this.mHelper.getFilters(inputFilterArr);
    }

    public android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
        return this.mHelper.wrapTransformationMethod(transformationMethod);
    }

    public void setEnabled(boolean z) {
        this.mHelper.setEnabled(z);
    }

    public void setAllCaps(boolean z) {
        this.mHelper.setAllCaps(z);
    }

    public boolean isEnabled() {
        return this.mHelper.isEnabled();
    }

    static class HelperInternal {
        android.text.InputFilter[] getFilters(android.text.InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean isEnabled() {
            return false;
        }

        void setAllCaps(boolean z) {
        }

        void setEnabled(boolean z) {
        }

        void updateTransformationMethod() {
        }

        android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        HelperInternal() {
        }
    }

    private static class SkippingHelper19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19 mHelperDelegate;

        SkippingHelper19(android.widget.TextView textView) {
            this.mHelperDelegate = new androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal19(textView);
        }

        private boolean skipBecauseEmojiCompatNotInitialized() {
            return !androidx.emoji2.text.EmojiCompat.isConfigured();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.mHelperDelegate.updateTransformationMethod();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.InputFilter[] getFilters(android.text.InputFilter[] inputFilterArr) {
            return skipBecauseEmojiCompatNotInitialized() ? inputFilterArr : this.mHelperDelegate.getFilters(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
            return skipBecauseEmojiCompatNotInitialized() ? transformationMethod : this.mHelperDelegate.wrapTransformationMethod(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean z) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                return;
            }
            this.mHelperDelegate.setAllCaps(z);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean z) {
            if (skipBecauseEmojiCompatNotInitialized()) {
                this.mHelperDelegate.setEnabledUnsafe(z);
            } else {
                this.mHelperDelegate.setEnabled(z);
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            return this.mHelperDelegate.isEnabled();
        }
    }

    private static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal {
        private final androidx.emoji2.viewsintegration.EmojiInputFilter mEmojiInputFilter;
        private boolean mEnabled = true;
        private final android.widget.TextView mTextView;

        HelperInternal19(android.widget.TextView textView) {
            this.mTextView = textView;
            this.mEmojiInputFilter = new androidx.emoji2.viewsintegration.EmojiInputFilter(textView);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void updateTransformationMethod() {
            this.mTextView.setTransformationMethod(wrapTransformationMethod(this.mTextView.getTransformationMethod()));
        }

        private void updateFilters() {
            this.mTextView.setFilters(getFilters(this.mTextView.getFilters()));
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.InputFilter[] getFilters(android.text.InputFilter[] inputFilterArr) {
            if (!this.mEnabled) {
                return removeEmojiInputFilterIfPresent(inputFilterArr);
            }
            return addEmojiInputFilterIfMissing(inputFilterArr);
        }

        private android.text.InputFilter[] addEmojiInputFilterIfMissing(android.text.InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (android.text.InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.mEmojiInputFilter) {
                    return inputFilterArr;
                }
            }
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length + 1];
            java.lang.System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.mEmojiInputFilter;
            return inputFilterArr2;
        }

        private android.text.InputFilter[] removeEmojiInputFilterIfPresent(android.text.InputFilter[] inputFilterArr) {
            android.util.SparseArray<android.text.InputFilter> emojiInputFilterPositionArray = getEmojiInputFilterPositionArray(inputFilterArr);
            if (emojiInputFilterPositionArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            android.text.InputFilter[] inputFilterArr2 = new android.text.InputFilter[inputFilterArr.length - emojiInputFilterPositionArray.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (emojiInputFilterPositionArray.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private android.util.SparseArray<android.text.InputFilter> getEmojiInputFilterPositionArray(android.text.InputFilter[] inputFilterArr) {
            android.util.SparseArray<android.text.InputFilter> sparseArray = new android.util.SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                android.text.InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof androidx.emoji2.viewsintegration.EmojiInputFilter) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
            if (this.mEnabled) {
                return wrapForEnabled(transformationMethod);
            }
            return unwrapForDisabled(transformationMethod);
        }

        private android.text.method.TransformationMethod unwrapForDisabled(android.text.method.TransformationMethod transformationMethod) {
            return transformationMethod instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod ? ((androidx.emoji2.viewsintegration.EmojiTransformationMethod) transformationMethod).getOriginalTransformationMethod() : transformationMethod;
        }

        private android.text.method.TransformationMethod wrapForEnabled(android.text.method.TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof androidx.emoji2.viewsintegration.EmojiTransformationMethod) || (transformationMethod instanceof android.text.method.PasswordTransformationMethod)) ? transformationMethod : new androidx.emoji2.viewsintegration.EmojiTransformationMethod(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setAllCaps(boolean z) {
            if (z) {
                updateTransformationMethod();
            }
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        void setEnabled(boolean z) {
            this.mEnabled = z;
            updateTransformationMethod();
            updateFilters();
        }

        @Override // androidx.emoji2.viewsintegration.EmojiTextViewHelper.HelperInternal
        public boolean isEnabled() {
            return this.mEnabled;
        }

        void setEnabledUnsafe(boolean z) {
            this.mEnabled = z;
        }
    }
}
