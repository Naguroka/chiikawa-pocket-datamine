package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class AppCompatHintHelper {
    static android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo, android.view.View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (android.view.ViewParent parent = view.getParent(); parent instanceof android.view.View; parent = parent.getParent()) {
                if (parent instanceof androidx.appcompat.widget.WithHint) {
                    editorInfo.hintText = ((androidx.appcompat.widget.WithHint) parent).getHint();
                    break;
                }
            }
        }
        return inputConnection;
    }

    private AppCompatHintHelper() {
    }
}
