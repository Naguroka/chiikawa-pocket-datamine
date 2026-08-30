package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class CheckBoxPreference extends androidx.preference.TwoStatePreference {
    private final androidx.preference.CheckBoxPreference.Listener mListener;

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mListener = new androidx.preference.CheckBoxPreference.Listener();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.CheckBoxPreference, i, i2);
        setSummaryOn(androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.CheckBoxPreference_summaryOn, androidx.preference.R.styleable.CheckBoxPreference_android_summaryOn));
        setSummaryOff(androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.CheckBoxPreference_summaryOff, androidx.preference.R.styleable.CheckBoxPreference_android_summaryOff));
        setDisableDependentsState(androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.CheckBoxPreference_disableDependentsState, androidx.preference.R.styleable.CheckBoxPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle));
    }

    public CheckBoxPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        syncCheckboxView(preferenceViewHolder.findViewById(android.R.id.checkbox));
        syncSummaryView(preferenceViewHolder);
    }

    @Override // androidx.preference.Preference
    protected void performClick(android.view.View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    private void syncViewIfAccessibilityEnabled(android.view.View view) {
        if (((android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            syncCheckboxView(view.findViewById(android.R.id.checkbox));
            syncSummaryView(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void syncCheckboxView(android.view.View view) {
        boolean z = view instanceof android.widget.CompoundButton;
        if (z) {
            ((android.widget.CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.mChecked);
        }
        if (z) {
            ((android.widget.CompoundButton) view).setOnCheckedChangeListener(this.mListener);
        }
    }

    private class Listener implements android.widget.CompoundButton.OnCheckedChangeListener {
        Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            if (!androidx.preference.CheckBoxPreference.this.callChangeListener(java.lang.Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                androidx.preference.CheckBoxPreference.this.setChecked(z);
            }
        }
    }
}
