package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
final class AppCompatReceiveContentHelper {
    private static final java.lang.String LOG_TAG = "ReceiveContent";

    private AppCompatReceiveContentHelper() {
    }

    static boolean maybeHandleMenuActionViaPerformReceiveContent(android.widget.TextView textView, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 31 || androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) textView.getContext().getSystemService("clipboard");
        android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            androidx.core.view.ViewCompat.performReceiveContent(textView, new androidx.core.view.ContentInfoCompat.Builder(primaryClip, 1).setFlags(i != 16908322 ? 1 : 0).build());
        }
        return true;
    }

    static boolean maybeHandleDragEventViaPerformReceiveContent(android.view.View view, android.view.DragEvent dragEvent) {
        if (android.os.Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && androidx.core.view.ViewCompat.getOnReceiveContentMimeTypes(view) != null) {
            android.app.Activity activityTryGetActivity = tryGetActivity(view);
            if (activityTryGetActivity == null) {
                android.util.Log.i(LOG_TAG, "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof android.widget.TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof android.widget.TextView) {
                    return androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForTextView(dragEvent, (android.widget.TextView) view, activityTryGetActivity);
                }
                return androidx.appcompat.widget.AppCompatReceiveContentHelper.OnDropApi24Impl.onDropForView(dragEvent, view, activityTryGetActivity);
            }
        }
        return false;
    }

    private static final class OnDropApi24Impl {
        private OnDropApi24Impl() {
        }

        static boolean onDropForTextView(android.view.DragEvent dragEvent, android.widget.TextView textView, android.app.Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                android.text.Selection.setSelection((android.text.Spannable) textView.getText(), offsetForPosition);
                androidx.core.view.ViewCompat.performReceiveContent(textView, new androidx.core.view.ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
                return true;
            } finally {
                textView.endBatchEdit();
            }
        }

        static boolean onDropForView(android.view.DragEvent dragEvent, android.view.View view, android.app.Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            androidx.core.view.ViewCompat.performReceiveContent(view, new androidx.core.view.ContentInfoCompat.Builder(dragEvent.getClipData(), 3).build());
            return true;
        }
    }

    static android.app.Activity tryGetActivity(android.view.View view) {
        for (android.content.Context context = view.getContext(); context instanceof android.content.ContextWrapper; context = ((android.content.ContextWrapper) context).getBaseContext()) {
            if (context instanceof android.app.Activity) {
                return (android.app.Activity) context;
            }
        }
        return null;
    }
}
