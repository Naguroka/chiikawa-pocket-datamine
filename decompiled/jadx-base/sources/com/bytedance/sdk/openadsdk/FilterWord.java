package com.bytedance.sdk.openadsdk;

/* JADX INFO: loaded from: classes4.dex */
public class FilterWord {
    private java.lang.String IL;
    private boolean bX;
    private java.lang.String bg;
    private java.util.List<com.bytedance.sdk.openadsdk.FilterWord> eqN;

    public FilterWord(java.lang.String str, java.lang.String str2) {
        this.bg = str;
        this.IL = str2;
    }

    public FilterWord() {
    }

    public java.lang.String getId() {
        return this.bg;
    }

    public void setId(java.lang.String str) {
        this.bg = str;
    }

    public java.lang.String getName() {
        return this.IL;
    }

    public void setName(java.lang.String str) {
        this.IL = str;
    }

    public boolean getIsSelected() {
        return this.bX;
    }

    public void setIsSelected(boolean z) {
        this.bX = z;
    }

    public java.util.List<com.bytedance.sdk.openadsdk.FilterWord> getOptions() {
        return this.eqN;
    }

    public void addOption(com.bytedance.sdk.openadsdk.FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.eqN == null) {
            this.eqN = new java.util.ArrayList();
        }
        this.eqN.add(filterWord);
    }

    public boolean isValid() {
        return (android.text.TextUtils.isEmpty(this.bg) || android.text.TextUtils.isEmpty(this.IL)) ? false : true;
    }

    public boolean hasSecondOptions() {
        java.util.List<com.bytedance.sdk.openadsdk.FilterWord> list = this.eqN;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.bytedance.sdk.openadsdk.FilterWord)) {
            return false;
        }
        com.bytedance.sdk.openadsdk.FilterWord filterWord = (com.bytedance.sdk.openadsdk.FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }
}
