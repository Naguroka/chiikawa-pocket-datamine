package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiInputConnection extends android.view.inputmethod.InputConnectionWrapper {
    private final androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper mEmojiCompatDeleteHelper;
    private final android.widget.TextView mTextView;

    EmojiInputConnection(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper());
    }

    EmojiInputConnection(android.widget.TextView textView, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, androidx.emoji2.viewsintegration.EmojiInputConnection.EmojiCompatDeleteHelper emojiCompatDeleteHelper) {
        super(inputConnection, false);
        this.mTextView = textView;
        this.mEmojiCompatDeleteHelper = emojiCompatDeleteHelper;
        emojiCompatDeleteHelper.updateEditorInfoAttrs(editorInfo);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        return this.mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return this.mEmojiCompatDeleteHelper.handleDeleteSurroundingText(this, getEditable(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }

    private android.text.Editable getEditable() {
        return this.mTextView.getEditableText();
    }

    public static class EmojiCompatDeleteHelper {
        public boolean handleDeleteSurroundingText(android.view.inputmethod.InputConnection inputConnection, android.text.Editable editable, int i, int i2, boolean z) {
            return androidx.emoji2.text.EmojiCompat.handleDeleteSurroundingText(inputConnection, editable, i, i2, z);
        }

        public void updateEditorInfoAttrs(android.view.inputmethod.EditorInfo editorInfo) {
            if (androidx.emoji2.text.EmojiCompat.isConfigured()) {
                androidx.emoji2.text.EmojiCompat.get().updateEditorInfo(editorInfo);
            }
        }
    }
}
