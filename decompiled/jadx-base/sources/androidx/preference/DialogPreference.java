package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    private android.graphics.drawable.Drawable mDialogIcon;
    private int mDialogLayoutResId;
    private java.lang.CharSequence mDialogMessage;
    private java.lang.CharSequence mDialogTitle;
    private java.lang.CharSequence mNegativeButtonText;
    private java.lang.CharSequence mPositiveButtonText;

    public interface TargetFragment {
        <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence charSequence);
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.DialogPreference, i, i2);
        java.lang.String string = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogTitle, androidx.preference.R.styleable.DialogPreference_android_dialogTitle);
        this.mDialogTitle = string;
        if (string == null) {
            this.mDialogTitle = getTitle();
        }
        this.mDialogMessage = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogMessage, androidx.preference.R.styleable.DialogPreference_android_dialogMessage);
        this.mDialogIcon = androidx.core.content.res.TypedArrayUtils.getDrawable(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogIcon, androidx.preference.R.styleable.DialogPreference_android_dialogIcon);
        this.mPositiveButtonText = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_positiveButtonText, androidx.preference.R.styleable.DialogPreference_android_positiveButtonText);
        this.mNegativeButtonText = androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_negativeButtonText, androidx.preference.R.styleable.DialogPreference_android_negativeButtonText);
        this.mDialogLayoutResId = androidx.core.content.res.TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.DialogPreference_dialogLayout, androidx.preference.R.styleable.DialogPreference_android_dialogLayout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(android.content.Context context) {
        this(context, null);
    }

    public void setDialogTitle(java.lang.CharSequence charSequence) {
        this.mDialogTitle = charSequence;
    }

    public void setDialogTitle(int i) {
        setDialogTitle(getContext().getString(i));
    }

    public java.lang.CharSequence getDialogTitle() {
        return this.mDialogTitle;
    }

    public void setDialogMessage(java.lang.CharSequence charSequence) {
        this.mDialogMessage = charSequence;
    }

    public void setDialogMessage(int i) {
        setDialogMessage(getContext().getString(i));
    }

    public java.lang.CharSequence getDialogMessage() {
        return this.mDialogMessage;
    }

    public void setDialogIcon(android.graphics.drawable.Drawable drawable) {
        this.mDialogIcon = drawable;
    }

    public void setDialogIcon(int i) {
        this.mDialogIcon = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), i);
    }

    public android.graphics.drawable.Drawable getDialogIcon() {
        return this.mDialogIcon;
    }

    public void setPositiveButtonText(java.lang.CharSequence charSequence) {
        this.mPositiveButtonText = charSequence;
    }

    public void setPositiveButtonText(int i) {
        setPositiveButtonText(getContext().getString(i));
    }

    public java.lang.CharSequence getPositiveButtonText() {
        return this.mPositiveButtonText;
    }

    public void setNegativeButtonText(java.lang.CharSequence charSequence) {
        this.mNegativeButtonText = charSequence;
    }

    public void setNegativeButtonText(int i) {
        setNegativeButtonText(getContext().getString(i));
    }

    public java.lang.CharSequence getNegativeButtonText() {
        return this.mNegativeButtonText;
    }

    public void setDialogLayoutResource(int i) {
        this.mDialogLayoutResId = i;
    }

    public int getDialogLayoutResource() {
        return this.mDialogLayoutResId;
    }

    @Override // androidx.preference.Preference
    protected void onClick() {
        getPreferenceManager().showDialog(this);
    }
}
