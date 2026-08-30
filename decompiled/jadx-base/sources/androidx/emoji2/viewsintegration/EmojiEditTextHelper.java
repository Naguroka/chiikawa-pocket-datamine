package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
public final class EmojiEditTextHelper {
    private int mEmojiReplaceStrategy;
    private final androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal mHelper;
    private int mMaxEmojiCount;

    public EmojiEditTextHelper(android.widget.EditText editText) {
        this(editText, true);
    }

    public EmojiEditTextHelper(android.widget.EditText editText, boolean z) {
        this.mMaxEmojiCount = Integer.MAX_VALUE;
        this.mEmojiReplaceStrategy = 0;
        androidx.core.util.Preconditions.checkNotNull(editText, "editText cannot be null");
        this.mHelper = new androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal19(editText, z);
    }

    public void setMaxEmojiCount(int i) {
        androidx.core.util.Preconditions.checkArgumentNonnegative(i, "maxEmojiCount should be greater than 0");
        this.mMaxEmojiCount = i;
        this.mHelper.setMaxEmojiCount(i);
    }

    public int getMaxEmojiCount() {
        return this.mMaxEmojiCount;
    }

    public android.text.method.KeyListener getKeyListener(android.text.method.KeyListener keyListener) {
        return this.mHelper.getKeyListener(keyListener);
    }

    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.mHelper.onCreateInputConnection(inputConnection, editorInfo);
    }

    public void setEmojiReplaceStrategy(int i) {
        this.mEmojiReplaceStrategy = i;
        this.mHelper.setEmojiReplaceStrategy(i);
    }

    public int getEmojiReplaceStrategy() {
        return this.mEmojiReplaceStrategy;
    }

    public boolean isEnabled() {
        return this.mHelper.isEnabled();
    }

    public void setEnabled(boolean z) {
        this.mHelper.setEnabled(z);
    }

    static class HelperInternal {
        android.text.method.KeyListener getKeyListener(android.text.method.KeyListener keyListener) {
            return keyListener;
        }

        boolean isEnabled() {
            return false;
        }

        android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
            return inputConnection;
        }

        void setEmojiReplaceStrategy(int i) {
        }

        void setEnabled(boolean z) {
        }

        void setMaxEmojiCount(int i) {
        }

        HelperInternal() {
        }
    }

    private static class HelperInternal19 extends androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal {
        private final android.widget.EditText mEditText;
        private final androidx.emoji2.viewsintegration.EmojiTextWatcher mTextWatcher;

        HelperInternal19(android.widget.EditText editText, boolean z) {
            this.mEditText = editText;
            androidx.emoji2.viewsintegration.EmojiTextWatcher emojiTextWatcher = new androidx.emoji2.viewsintegration.EmojiTextWatcher(editText, z);
            this.mTextWatcher = emojiTextWatcher;
            editText.addTextChangedListener(emojiTextWatcher);
            editText.setEditableFactory(androidx.emoji2.viewsintegration.EmojiEditableFactory.getInstance());
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void setMaxEmojiCount(int i) {
            this.mTextWatcher.setMaxEmojiCount(i);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void setEmojiReplaceStrategy(int i) {
            this.mTextWatcher.setEmojiReplaceStrategy(i);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        android.text.method.KeyListener getKeyListener(android.text.method.KeyListener keyListener) {
            if (keyListener instanceof androidx.emoji2.viewsintegration.EmojiKeyListener) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof android.text.method.NumberKeyListener ? keyListener : new androidx.emoji2.viewsintegration.EmojiKeyListener(keyListener);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
            return inputConnection instanceof androidx.emoji2.viewsintegration.EmojiInputConnection ? inputConnection : new androidx.emoji2.viewsintegration.EmojiInputConnection(this.mEditText, inputConnection, editorInfo);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        void setEnabled(boolean z) {
            this.mTextWatcher.setEnabled(z);
        }

        @Override // androidx.emoji2.viewsintegration.EmojiEditTextHelper.HelperInternal
        boolean isEnabled() {
            return this.mTextWatcher.isEnabled();
        }
    }
}
