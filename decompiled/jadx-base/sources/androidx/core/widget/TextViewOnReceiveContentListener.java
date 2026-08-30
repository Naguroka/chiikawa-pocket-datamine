package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewOnReceiveContentListener implements androidx.core.view.OnReceiveContentListener {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    @Override // androidx.core.view.OnReceiveContentListener
    public androidx.core.view.ContentInfoCompat onReceiveContent(android.view.View view, androidx.core.view.ContentInfoCompat contentInfoCompat) {
        if (android.util.Log.isLoggable(LOG_TAG, 3)) {
            android.util.Log.d(LOG_TAG, "onReceive: " + contentInfoCompat);
        }
        if (contentInfoCompat.getSource() == 2) {
            return contentInfoCompat;
        }
        android.content.ClipData clip = contentInfoCompat.getClip();
        int flags = contentInfoCompat.getFlags();
        android.widget.TextView textView = (android.widget.TextView) view;
        android.text.Editable editable = (android.text.Editable) textView.getText();
        android.content.Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clip.getItemCount(); i++) {
            java.lang.CharSequence charSequenceCoerceToText = coerceToText(context, clip.getItemAt(i), flags);
            if (charSequenceCoerceToText != null) {
                if (!z) {
                    replaceSelection(editable, charSequenceCoerceToText);
                    z = true;
                } else {
                    editable.insert(android.text.Selection.getSelectionEnd(editable), "\n");
                    editable.insert(android.text.Selection.getSelectionEnd(editable), charSequenceCoerceToText);
                }
            }
        }
        return null;
    }

    private static java.lang.CharSequence coerceToText(android.content.Context context, android.content.ClipData.Item item, int i) {
        return androidx.core.widget.TextViewOnReceiveContentListener.Api16Impl.coerce(context, item, i);
    }

    private static void replaceSelection(android.text.Editable editable, java.lang.CharSequence charSequence) {
        int selectionStart = android.text.Selection.getSelectionStart(editable);
        int selectionEnd = android.text.Selection.getSelectionEnd(editable);
        int iMax = java.lang.Math.max(0, java.lang.Math.min(selectionStart, selectionEnd));
        int iMax2 = java.lang.Math.max(0, java.lang.Math.max(selectionStart, selectionEnd));
        android.text.Selection.setSelection(editable, iMax2);
        editable.replace(iMax, iMax2, charSequence);
    }

    private static final class Api16Impl {
        private Api16Impl() {
        }

        static java.lang.CharSequence coerce(android.content.Context context, android.content.ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                java.lang.CharSequence charSequenceCoerceToText = item.coerceToText(context);
                return charSequenceCoerceToText instanceof android.text.Spanned ? charSequenceCoerceToText.toString() : charSequenceCoerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    private static final class ApiImpl {
        private ApiImpl() {
        }

        static java.lang.CharSequence coerce(android.content.Context context, android.content.ClipData.Item item, int i) {
            java.lang.CharSequence charSequenceCoerceToText = item.coerceToText(context);
            return ((i & 1) == 0 || !(charSequenceCoerceToText instanceof android.text.Spanned)) ? charSequenceCoerceToText : charSequenceCoerceToText.toString();
        }
    }
}
