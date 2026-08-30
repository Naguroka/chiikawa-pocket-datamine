package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends androidx.appcompat.app.AppCompatDialog implements android.content.DialogInterface {
    static final int LAYOUT_HINT_NONE = 0;
    static final int LAYOUT_HINT_SIDE = 1;
    final androidx.appcompat.app.AlertController mAlert;

    protected AlertDialog(android.content.Context context) {
        this(context, 0);
    }

    protected AlertDialog(android.content.Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new androidx.appcompat.app.AlertController(getContext(), this, getWindow());
    }

    protected AlertDialog(android.content.Context context, boolean z, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    static int resolveDialogTheme(android.content.Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public android.widget.Button getButton(int i) {
        return this.mAlert.getButton(i);
    }

    public android.widget.ListView getListView() {
        return this.mAlert.getListView();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(java.lang.CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.setTitle(charSequence);
    }

    public void setCustomTitle(android.view.View view) {
        this.mAlert.setCustomTitle(view);
    }

    public void setMessage(java.lang.CharSequence charSequence) {
        this.mAlert.setMessage(charSequence);
    }

    public void setView(android.view.View view) {
        this.mAlert.setView(view);
    }

    public void setView(android.view.View view, int i, int i2, int i3, int i4) {
        this.mAlert.setView(view, i, i2, i3, i4);
    }

    void setButtonPanelLayoutHint(int i) {
        this.mAlert.setButtonPanelLayoutHint(i);
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.os.Message message) {
        this.mAlert.setButton(i, charSequence, null, message, null);
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i, charSequence, onClickListener, null, null);
    }

    public void setButton(int i, java.lang.CharSequence charSequence, android.graphics.drawable.Drawable drawable, android.content.DialogInterface.OnClickListener onClickListener) {
        this.mAlert.setButton(i, charSequence, onClickListener, null, drawable);
    }

    public void setIcon(int i) {
        this.mAlert.setIcon(i);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.mAlert.setIcon(drawable);
    }

    public void setIconAttribute(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.setIcon(typedValue.resourceId);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mAlert.installContent();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (this.mAlert.onKeyDown(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (this.mAlert.onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public static class Builder {
        private final androidx.appcompat.app.AlertController.AlertParams P;
        private final int mTheme;

        public Builder(android.content.Context context) {
            this(context, androidx.appcompat.app.AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder(android.content.Context context, int i) {
            this.P = new androidx.appcompat.app.AlertController.AlertParams(new android.view.ContextThemeWrapper(context, androidx.appcompat.app.AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public android.content.Context getContext() {
            return this.P.mContext;
        }

        public androidx.appcompat.app.AlertDialog.Builder setTitle(int i) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mTitle = alertParams.mContext.getText(i);
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setTitle(java.lang.CharSequence charSequence) {
            this.P.mTitle = charSequence;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setCustomTitle(android.view.View view) {
            this.P.mCustomTitleView = view;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMessage(int i) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mMessage = alertParams.mContext.getText(i);
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMessage(java.lang.CharSequence charSequence) {
            this.P.mMessage = charSequence;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setIcon(int i) {
            this.P.mIconId = i;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setIconAttribute(int i) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            this.P.mContext.getTheme().resolveAttribute(i, typedValue, true);
            this.P.mIconId = typedValue.resourceId;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mPositiveButtonText = alertParams.mContext.getText(i);
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButton(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mPositiveButtonText = charSequence;
            this.P.mPositiveButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setPositiveButtonIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mPositiveButtonIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mNegativeButtonText = alertParams.mContext.getText(i);
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButton(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mNegativeButtonText = charSequence;
            this.P.mNegativeButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNegativeButtonIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mNegativeButtonIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButton(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mNeutralButtonText = alertParams.mContext.getText(i);
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButton(java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mNeutralButtonText = charSequence;
            this.P.mNeutralButtonListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setNeutralButtonIcon(android.graphics.drawable.Drawable drawable) {
            this.P.mNeutralButtonIcon = drawable;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setCancelable(boolean z) {
            this.P.mCancelable = z;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnCancelListener(android.content.DialogInterface.OnCancelListener onCancelListener) {
            this.P.mOnCancelListener = onCancelListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnDismissListener(android.content.DialogInterface.OnDismissListener onDismissListener) {
            this.P.mOnDismissListener = onDismissListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) {
            this.P.mOnKeyListener = onKeyListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setItems(int i, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setItems(java.lang.CharSequence[] charSequenceArr, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setAdapter(android.widget.ListAdapter listAdapter, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mAdapter = listAdapter;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setCursor(android.database.Cursor cursor, android.content.DialogInterface.OnClickListener onClickListener, java.lang.String str) {
            this.P.mCursor = cursor;
            this.P.mLabelColumn = str;
            this.P.mOnClickListener = onClickListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(int i, boolean[] zArr, android.content.DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mCheckedItems = zArr;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(java.lang.CharSequence[] charSequenceArr, boolean[] zArr, android.content.DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mCheckedItems = zArr;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setMultiChoiceItems(android.database.Cursor cursor, java.lang.String str, java.lang.String str2, android.content.DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            this.P.mCursor = cursor;
            this.P.mOnCheckboxClickListener = onMultiChoiceClickListener;
            this.P.mIsCheckedColumn = str;
            this.P.mLabelColumn = str2;
            this.P.mIsMultiChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(int i, int i2, android.content.DialogInterface.OnClickListener onClickListener) {
            androidx.appcompat.app.AlertController.AlertParams alertParams = this.P;
            alertParams.mItems = alertParams.mContext.getResources().getTextArray(i);
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i2;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.database.Cursor cursor, int i, java.lang.String str, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mCursor = cursor;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i;
            this.P.mLabelColumn = str;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(java.lang.CharSequence[] charSequenceArr, int i, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mItems = charSequenceArr;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setSingleChoiceItems(android.widget.ListAdapter listAdapter, int i, android.content.DialogInterface.OnClickListener onClickListener) {
            this.P.mAdapter = listAdapter;
            this.P.mOnClickListener = onClickListener;
            this.P.mCheckedItem = i;
            this.P.mIsSingleChoice = true;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.P.mOnItemSelectedListener = onItemSelectedListener;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setView(int i) {
            this.P.mView = null;
            this.P.mViewLayoutResId = i;
            this.P.mViewSpacingSpecified = false;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setView(android.view.View view) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = false;
            return this;
        }

        @java.lang.Deprecated
        public androidx.appcompat.app.AlertDialog.Builder setView(android.view.View view, int i, int i2, int i3, int i4) {
            this.P.mView = view;
            this.P.mViewLayoutResId = 0;
            this.P.mViewSpacingSpecified = true;
            this.P.mViewSpacingLeft = i;
            this.P.mViewSpacingTop = i2;
            this.P.mViewSpacingRight = i3;
            this.P.mViewSpacingBottom = i4;
            return this;
        }

        @java.lang.Deprecated
        public androidx.appcompat.app.AlertDialog.Builder setInverseBackgroundForced(boolean z) {
            this.P.mForceInverseBackground = z;
            return this;
        }

        public androidx.appcompat.app.AlertDialog.Builder setRecycleOnMeasureEnabled(boolean z) {
            this.P.mRecycleOnMeasure = z;
            return this;
        }

        public androidx.appcompat.app.AlertDialog create() {
            androidx.appcompat.app.AlertDialog alertDialog = new androidx.appcompat.app.AlertDialog(this.P.mContext, this.mTheme);
            this.P.apply(alertDialog.mAlert);
            alertDialog.setCancelable(this.P.mCancelable);
            if (this.P.mCancelable) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.P.mOnCancelListener);
            alertDialog.setOnDismissListener(this.P.mOnDismissListener);
            if (this.P.mOnKeyListener != null) {
                alertDialog.setOnKeyListener(this.P.mOnKeyListener);
            }
            return alertDialog;
        }

        public androidx.appcompat.app.AlertDialog show() {
            androidx.appcompat.app.AlertDialog alertDialogCreate = create();
            alertDialogCreate.show();
            return alertDialogCreate;
        }
    }
}
