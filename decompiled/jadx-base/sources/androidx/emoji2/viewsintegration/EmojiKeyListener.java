package androidx.emoji2.viewsintegration;

/* JADX INFO: loaded from: classes.dex */
final class EmojiKeyListener implements android.text.method.KeyListener {
    private final androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper mEmojiCompatHandleKeyDownHelper;
    private final android.text.method.KeyListener mKeyListener;

    EmojiKeyListener(android.text.method.KeyListener keyListener) {
        this(keyListener, new androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper());
    }

    EmojiKeyListener(android.text.method.KeyListener keyListener, androidx.emoji2.viewsintegration.EmojiKeyListener.EmojiCompatHandleKeyDownHelper emojiCompatHandleKeyDownHelper) {
        this.mKeyListener = keyListener;
        this.mEmojiCompatHandleKeyDownHelper = emojiCompatHandleKeyDownHelper;
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.mKeyListener.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.mEmojiCompatHandleKeyDownHelper.handleKeyDown(editable, i, keyEvent) || this.mKeyListener.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(android.view.View view, android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
        return this.mKeyListener.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(android.view.View view, android.text.Editable editable, android.view.KeyEvent keyEvent) {
        return this.mKeyListener.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(android.view.View view, android.text.Editable editable, int i) {
        this.mKeyListener.clearMetaKeyState(view, editable, i);
    }

    public static class EmojiCompatHandleKeyDownHelper {
        public boolean handleKeyDown(android.text.Editable editable, int i, android.view.KeyEvent keyEvent) {
            return androidx.emoji2.text.EmojiCompat.handleOnKeyDown(editable, i, keyEvent);
        }
    }
}
