package androidx.preference;

/* JADX INFO: loaded from: classes3.dex */
public class SwitchPreference extends androidx.preference.TwoStatePreference {
    private final androidx.preference.SwitchPreference.Listener mListener;
    private java.lang.CharSequence mSwitchOff;
    private java.lang.CharSequence mSwitchOn;

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mListener = new androidx.preference.SwitchPreference.Listener();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.preference.R.styleable.SwitchPreference, i, i2);
        setSummaryOn(androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.SwitchPreference_summaryOn, androidx.preference.R.styleable.SwitchPreference_android_summaryOn));
        setSummaryOff(androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.SwitchPreference_summaryOff, androidx.preference.R.styleable.SwitchPreference_android_summaryOff));
        setSwitchTextOn(androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.SwitchPreference_switchTextOn, androidx.preference.R.styleable.SwitchPreference_android_switchTextOn));
        setSwitchTextOff(androidx.core.content.res.TypedArrayUtils.getString(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.SwitchPreference_switchTextOff, androidx.preference.R.styleable.SwitchPreference_android_switchTextOff));
        setDisableDependentsState(androidx.core.content.res.TypedArrayUtils.getBoolean(typedArrayObtainStyledAttributes, androidx.preference.R.styleable.SwitchPreference_disableDependentsState, androidx.preference.R.styleable.SwitchPreference_android_disableDependentsState, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.TypedArrayUtils.getAttr(context, androidx.preference.R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle));
    }

    public SwitchPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public void onBindViewHolder(androidx.preference.PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        syncSwitchView(preferenceViewHolder.findViewById(android.R.id.switch_widget));
        syncSummaryView(preferenceViewHolder);
    }

    public void setSwitchTextOn(java.lang.CharSequence charSequence) {
        this.mSwitchOn = charSequence;
        notifyChanged();
    }

    public void setSwitchTextOff(java.lang.CharSequence charSequence) {
        this.mSwitchOff = charSequence;
        notifyChanged();
    }

    public java.lang.CharSequence getSwitchTextOn() {
        return this.mSwitchOn;
    }

    public void setSwitchTextOn(int i) {
        setSwitchTextOn(getContext().getString(i));
    }

    public java.lang.CharSequence getSwitchTextOff() {
        return this.mSwitchOff;
    }

    public void setSwitchTextOff(int i) {
        setSwitchTextOff(getContext().getString(i));
    }

    @Override // androidx.preference.Preference
    protected void performClick(android.view.View view) {
        super.performClick(view);
        syncViewIfAccessibilityEnabled(view);
    }

    private void syncViewIfAccessibilityEnabled(android.view.View view) {
        if (((android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility")).isEnabled()) {
            syncSwitchView(view.findViewById(android.R.id.switch_widget));
            syncSummaryView(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void syncSwitchView(android.view.View view) {
        boolean z = view instanceof android.widget.Switch;
        if (z) {
            ((android.widget.Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof android.widget.Checkable) {
            ((android.widget.Checkable) view).setChecked(this.mChecked);
        }
        if (z) {
            android.widget.Switch r4 = (android.widget.Switch) view;
            r4.setTextOn(this.mSwitchOn);
            r4.setTextOff(this.mSwitchOff);
            r4.setOnCheckedChangeListener(this.mListener);
        }
    }

    private class Listener implements android.widget.CompoundButton.OnCheckedChangeListener {
        Listener() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            if (!androidx.preference.SwitchPreference.this.callChangeListener(java.lang.Boolean.valueOf(z))) {
                compoundButton.setChecked(!z);
            } else {
                androidx.preference.SwitchPreference.this.setChecked(z);
            }
        }
    }
}
