package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiTextViewHelper mEmojiTextViewHelper;
    private final android.widget.TextView mView;

    AppCompatEmojiTextHelper(android.widget.TextView textView) {
        this.mView = textView;
        this.mEmojiTextViewHelper = new androidx.emoji2.viewsintegration.EmojiTextViewHelper(textView, false);
    }

    void loadFromAttributes(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.mView.getContext().obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.AppCompatTextView, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled) ? typedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.AppCompatTextView_emojiCompatEnabled, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            setEnabled(z);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    void setEnabled(boolean z) {
        this.mEmojiTextViewHelper.setEnabled(z);
    }

    public boolean isEnabled() {
        return this.mEmojiTextViewHelper.isEnabled();
    }

    android.text.InputFilter[] getFilters(android.text.InputFilter[] inputFilterArr) {
        return this.mEmojiTextViewHelper.getFilters(inputFilterArr);
    }

    void setAllCaps(boolean z) {
        this.mEmojiTextViewHelper.setAllCaps(z);
    }

    public android.text.method.TransformationMethod wrapTransformationMethod(android.text.method.TransformationMethod transformationMethod) {
        return this.mEmojiTextViewHelper.wrapTransformationMethod(transformationMethod);
    }
}
