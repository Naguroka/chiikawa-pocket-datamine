package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatEmojiEditTextHelper {
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper mEmojiEditTextHelper;
    private final android.widget.EditText mView;

    AppCompatEmojiEditTextHelper(android.widget.EditText editText) {
        this.mView = editText;
        this.mEmojiEditTextHelper = new androidx.emoji2.viewsintegration.EmojiEditTextHelper(editText, false);
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

    boolean isEmojiCapableKeyListener(android.text.method.KeyListener keyListener) {
        return !(keyListener instanceof android.text.method.NumberKeyListener);
    }

    void setEnabled(boolean z) {
        this.mEmojiEditTextHelper.setEnabled(z);
    }

    boolean isEnabled() {
        return this.mEmojiEditTextHelper.isEnabled();
    }

    android.text.method.KeyListener getKeyListener(android.text.method.KeyListener keyListener) {
        return isEmojiCapableKeyListener(keyListener) ? this.mEmojiEditTextHelper.getKeyListener(keyListener) : keyListener;
    }

    android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        return this.mEmojiEditTextHelper.onCreateInputConnection(inputConnection, editorInfo);
    }
}
