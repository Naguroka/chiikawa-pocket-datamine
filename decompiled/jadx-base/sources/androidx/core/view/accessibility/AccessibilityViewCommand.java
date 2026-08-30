package androidx.core.view.accessibility;

/* JADX INFO: loaded from: classes.dex */
public interface AccessibilityViewCommand {
    boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments);

    public static abstract class CommandArguments {
        android.os.Bundle mBundle;

        public void setBundle(android.os.Bundle bundle) {
            this.mBundle = bundle;
        }
    }

    public static final class MoveAtGranularityArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public int getGranularity() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        }

        public boolean getExtendSelection() {
            return this.mBundle.getBoolean(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        }
    }

    public static final class MoveHtmlArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public java.lang.String getHTMLElement() {
            return this.mBundle.getString(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_HTML_ELEMENT_STRING);
        }
    }

    public static final class SetSelectionArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public int getStart() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT);
        }

        public int getEnd() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT);
        }
    }

    public static final class SetTextArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public java.lang.CharSequence getText() {
            return this.mBundle.getCharSequence(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE);
        }
    }

    public static final class ScrollToPositionArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public int getRow() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT);
        }

        public int getColumn() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT);
        }
    }

    public static final class SetProgressArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public float getProgress() {
            return this.mBundle.getFloat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE);
        }
    }

    public static final class MoveWindowArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public int getX() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVE_WINDOW_X);
        }

        public int getY() {
            return this.mBundle.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVE_WINDOW_Y);
        }
    }
}
