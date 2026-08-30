package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes5.dex */
class CustomEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    CustomEndIconDelegate(com.google.android.material.textfield.EndCompoundLayout endCompoundLayout) {
        super(endCompoundLayout);
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void setUp() {
        this.endLayout.setEndIconOnLongClickListener(null);
    }
}
